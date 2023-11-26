package org.example.repositories;

import org.example.entites.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
    //void save(int i, double v , Date date, Compte.typeCompte typecompte, Compte.etatCompte etatcompte);
}
