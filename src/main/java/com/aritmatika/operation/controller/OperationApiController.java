package com.aritmatika.operation.controller;

import com.aritmatika.operation.entity.Operation;
import com.aritmatika.operation.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ops")
public class OperationApiController {
    @Autowired
    OperationService service;

    @GetMapping
    public List<Operation> list() { return service.getAll(); }

    @PostMapping
    public Operation create(@RequestBody Operation op) { return service.save(op); }

    @PutMapping("/{id}")
    public Operation update(@PathVariable Long id, @RequestBody Operation op) {
        return service.update(id, op);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { service.delete(id); }
}
