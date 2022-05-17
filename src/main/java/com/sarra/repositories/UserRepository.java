package com.sarra.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.sarra.model.Utilisateur;
 
@Transactional

public interface UserRepository extends JpaRepository<Utilisateur, Long>{

 
	 

}