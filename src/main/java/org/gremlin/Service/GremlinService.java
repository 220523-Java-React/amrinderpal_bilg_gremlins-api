package org.gremlin.Service;

import org.gremlin.Model.Gremlin;
import org.gremlin.Repo.GremlinRepo;

public class GremlinService {
    GremlinRepo gremlinRepo = new GremlinRepo();

    public Gremlin createNewGremlin(Gremlin gremlin) {
        return gremlinRepo.create(gremlin);
    }
}
