package com.softtek.mayo13.service;

import java.util.List;

public interface ICRUD<T,ID>{
    T crear(T t);
    T modificar(T t);
    void eliminar(ID id);
    T obtenerUno(ID id);
    List<T> obtenerTodos();
}
