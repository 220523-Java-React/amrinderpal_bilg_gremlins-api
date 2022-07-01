package org.gremlin.Repo;

import org.gremlin.Model.Gremlin;

import java.util.ArrayList;
import java.util.List;

public class GremlinRepo implements DAO<Gremlin>{

    private List<Gremlin> Gremlin;
    List<Gremlin> gremlins = new ArrayList<>();

    @Override
    public Gremlin create(Gremlin gremlin) {
        if(gremlins.add(gremlin)){
            return gremlin;
        } else{
            return null;
        }
    }

    @Override
    public List<Gremlin> getAll() {
        return gremlins;
    }


}
