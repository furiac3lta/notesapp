package com.project.note.application;

import com.project.note.domain.model.Note;
import com.project.note.domain.port.INoteRepository;

import java.util.List;

public class NoteService {
    private final INoteRepository iNoteRepository;

    public NoteService(INoteRepository iNoteRepository) {
        this.iNoteRepository = iNoteRepository;
    }
    public Note save(Note note) {
        return iNoteRepository.save(note);
    }
    public Iterable<Note> findAll() {
        return iNoteRepository.findAll();
    }
    public Note findById(Integer id) {
        return iNoteRepository.findById(id);
    }
    public void delete(Integer id) {
        iNoteRepository.deleteById(id);
    }
}
