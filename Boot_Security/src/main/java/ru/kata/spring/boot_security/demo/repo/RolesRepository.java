package ru.kata.spring.boot_security.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kata.spring.boot_security.demo.model.Role;

public interface RolesRepository extends JpaRepository<Role, Long> {

}
