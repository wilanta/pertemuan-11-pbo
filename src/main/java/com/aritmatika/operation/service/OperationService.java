package com.aritmatika.operation.service;

import com.aritmatika.operation.entity.Operation;
import com.aritmatika.operation.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationService {
    @Autowired
    OperationRepository repo;

    public List<Operation> getAll() {
        List<Operation> all = repo.findAll();
        all.sort((x, y) -> y.getId().compareTo(x.getId()));
        return all;
    }

    public Operation save(Operation op) {
        return repo.save(op);
    }

    public Operation update(Long id, Operation op) {
        Operation existing = repo.findById(id).orElse(null);
        if (existing == null) return null;
        existing.setA(op.getA());
        existing.setOp(op.getOp());
        existing.setB(op.getB());
        return repo.save(existing);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
