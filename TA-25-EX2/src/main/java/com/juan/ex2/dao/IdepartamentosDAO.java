package com.juan.ex2.dao;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import com.juan.ex2.dto.Departamentos;

public interface IdepartamentosDAO extends JpaRepository<Departamentos, Long>{


}
