package com.example.demo.Hellos.reposorities;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Hellos.models.Model2;
import com.example.demo.Hellos.models.Model3;

public interface Repos2 extends JpaRepository<Model2,String> {

Model2 findByUsername(String user);








}

