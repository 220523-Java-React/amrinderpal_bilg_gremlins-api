package org.gremlin.Repo;

import java.util.List;

public interface DAO<T> {

    T create(T t);

    List<T> getAll();

}
