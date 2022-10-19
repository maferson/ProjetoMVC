package com.example.raiz.dao;

import com.example.raiz.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario,Long> implements FuncionarioDao {

    @Override
    public void update(Funcionario funcionario) {

    }
}
