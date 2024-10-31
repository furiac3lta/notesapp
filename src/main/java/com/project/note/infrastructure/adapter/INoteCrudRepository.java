package com.project.note.infrastructure.adapter;

import com.project.note.domain.model.Note;
import com.project.note.infrastructure.entity.NoteEntity;
import org.springframework.data.repository.CrudRepository;

public interface INoteCrudRepository extends CrudRepository<NoteEntity, Integer> {
}
