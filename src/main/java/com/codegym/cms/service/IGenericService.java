package com.codegym.cms.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long Id);

    void save(T t);

    void remove(Long id);
}
