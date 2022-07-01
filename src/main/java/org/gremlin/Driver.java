package org.gremlin;

import io.javalin.Javalin;
import org.gremlin.Controller.GremlinController;

public class Driver {
    public static void main(String[] args) {

        GremlinController gremlinController = new GremlinController();

        Javalin app = Javalin.create().start(8080);

        app.get("/gremlins", gremlinController.getAll);
        app.post("/gremlins", gremlinController.createGremlin);

    }
}
