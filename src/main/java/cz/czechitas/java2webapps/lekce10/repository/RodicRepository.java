package cz.czechitas.java2webapps.lekce10.repository;

import cz.czechitas.java2webapps.lekce10.entity.Rodic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * oddedene z JpaRepository
 */
@Repository
public interface RodicRepository extends JpaRepository<Rodic, Integer> {
}
