package com.project.note.infrastructure.rest;

import com.project.note.application.LabelService;
import com.project.note.application.NoteService;
import com.project.note.domain.model.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/notes")
@Slf4j
@CrossOrigin(origins = "http://localhost:5173")
@AllArgsConstructor

public class NoteController {
    private final NoteService noteServices;
    private final LabelService labelService;

    @PostMapping
    public ResponseEntity<Note> save(@RequestBody Note note) {
        return new ResponseEntity<>((noteServices.save(note)), HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Iterable<Note>> findAll() {
        return new ResponseEntity<>(noteServices.findAll(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Note> findById(@PathVariable Integer id) {
        return new ResponseEntity<>(noteServices.findById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Note> delete(@PathVariable Integer id) {
        noteServices.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
