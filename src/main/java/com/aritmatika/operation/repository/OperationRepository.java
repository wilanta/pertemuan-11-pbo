package com.aritmatika.operation.repository;

import com.aritmatika.operation.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
