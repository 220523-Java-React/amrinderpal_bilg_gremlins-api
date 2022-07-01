package org.gremlin;

import io.javalin.Javalin;

public class GremlinRunner {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    GremlinController gremlinController = new GremlinController;

    Javalin app = Javalin.create().start(8080);

    app.get("/gremlins", grem)



}