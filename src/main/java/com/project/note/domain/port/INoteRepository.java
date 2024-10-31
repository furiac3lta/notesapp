package com.project.note.domain.port;

import com.project.note.domain.model.Note;

public interface INoteRepository {
    Note save(Note note);
    Iterable<Note> findAll();
    Note findById(Integer id);
    void deleteById(Integer id);
}
