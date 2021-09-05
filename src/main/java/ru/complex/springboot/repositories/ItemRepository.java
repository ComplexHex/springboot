package ru.complex.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.complex.springboot.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
