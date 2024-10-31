package com.project.note.infrastructure.rest;

import com.project.note.application.LabelService;
import com.project.note.domain.model.Label;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/labels")
@Slf4j
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "http://localhost:5173")
@AllArgsConstructor
public class LabelController {
    private final LabelService labelService;

    @PostMapping
    public ResponseEntity<Label> save(@RequestBody Label label) {
        return new ResponseEntity<>(labelService.save(label), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Iterable<Label>> findAll() {
        return new ResponseEntity<>(labelService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Label> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(labelService.findById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Label> delete(@PathVariable Integer id) {
        labelService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
