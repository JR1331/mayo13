package com.softtek.mayo13.service;

import com.softtek.mayo13.modelo.Movil;
import com.softtek.mayo13.repo.IGenericoRepositorio;
import com.softtek.mayo13.repo.IMovilRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicioImpl extends ICRUDImpl<Movil,Integer> implements IMovilServicio {
    @Autowired
    private IMovilRepositorio movilRepositorio;
    @Override
    protected IGenericoRepositorio<Movil,Integer> getRepo(){
        return movilRepositorio;
    }
}
