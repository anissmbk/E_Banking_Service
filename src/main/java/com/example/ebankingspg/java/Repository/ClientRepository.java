package com.example.ebankingspg.java.Repository;

import com.example.ebankingspg.java.model.Client;
import com.example.ebankingspg.java.model.User;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT COUNT(c) FROM Client c ")
    Long countAllClient();
}
