package com.softtek.mayo13.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericoRepositorio<T,ID> extends JpaRepository<T,ID> {
}
