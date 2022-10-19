package com.example.raiz.dao;

import com.example.raiz.domain.Cargo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CargoDaoImpl extends AbstractDao<Cargo, Long> implements CargoDao{

    @Override
    public void update(Cargo cargo) {

        List<String> myList = new ArrayList<>();
        myList.add("tiida");

        for (String novaList: myList) {
            System.out.println(novaList);

        }

    }
}
