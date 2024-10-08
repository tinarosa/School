package com.example.application.repositories;

import com.example.application.views.list.Assignment;
import com.example.application.views.list.UserForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByUser(UserForm user);
}
