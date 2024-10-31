package com.project.note.infrastructure.adapter;

import com.project.note.domain.model.Note;
import com.project.note.domain.port.INoteRepository;
import com.project.note.infrastructure.mapper.NoteMapper;
import lombok.Data;
import org.springframework.stereotype.Repository;

@Repository
@Data
public class NoteCrudRepositoryImpl implements INoteRepository {

    private final INoteCrudRepository iNoteCrudRepository;
    private final NoteMapper noteMapper;

    @Override
    public Note save(Note note) {
        return noteMapper.toNote(iNoteCrudRepository.save(noteMapper.toNoteEntity(note)));
    }

    @Override
    public Iterable<Note> findAll() {
        return noteMapper.toNotes(iNoteCrudRepository.findAll());
    }

    @Override
    public Note findById(Integer id) {
        return noteMapper.toNote(iNoteCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Note with id " + id + " not found")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iNoteCrudRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Note with id " + id + " not found")
        );
        iNoteCrudRepository.deleteById(id);
    }
}
