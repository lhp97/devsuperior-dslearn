
package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.entities.Resource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourceRepository extends JpaRepository<Resource, Long> {
}
