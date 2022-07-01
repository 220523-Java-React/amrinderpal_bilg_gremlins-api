package org.gremlin.Controller;

import io.javalin.http.Handler;
import org.gremlin.Model.Gremlin;
import org.gremlin.Service.GremlinService;
import org.gremlin.Util.ConnectionPoint;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GremlinController {

    ConnectionPoint connectionPoint = new ConnectionPoint();
    GremlinService gremlinService = new GremlinService();



    public Handler getAll = ctx -> {
        Connection conn = connectionPoint.getConnection();
        Statement stmt = conn.createStatement();
        ResultSet rs;
        rs = stmt.executeQuery("select * from gremlintable");

        List<Gremlin> thesegremlins = new ArrayList<>();
        while (rs.next()){
            String id = rs.getString("id");
            Integer gage = rs.getInt("gage");
            String gname = rs.getString("gname");
            String gcolor = rs.getString("gcolor");
            Boolean isevil = rs.getBoolean("isevil");
            Gremlin newgremlin = new Gremlin(id,gage,gname,gcolor,isevil);
            thesegremlins.add(newgremlin);
        }

        ctx.json(thesegremlins);
        conn.close();
    };

    public Handler createGremlin = ctx -> {
        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);
        gremlinService.createNewGremlin(gremlin);
        Connection conn = connectionPoint.getConnection();
        Statement stmt = conn.createStatement();

        try{
            if (gremlin.getGage() != null && gremlin.getGname() != null && gremlin.getGcolor() != null && gremlin.getIsevil() != null) {
                stmt.executeQuery("insert into gremlintable(gname, gage, gcolor, isevil) values ('"+gremlin.getGname()+"', "+gremlin.getGage()+", '"+gremlin.getGcolor()+"', "+gremlin.getIsevil()+")");
                conn.close();
            }else {ctx.result("Your inputs might be wrong");}
        }catch(Throwable t) {ctx.result("A new gremlin has been added!");}


    };
}
