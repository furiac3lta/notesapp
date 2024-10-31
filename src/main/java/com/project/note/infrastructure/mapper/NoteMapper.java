package com.project.note.infrastructure.mapper;

import com.project.note.domain.model.Note;
import com.project.note.infrastructure.entity.NoteEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper (componentModel = "spring")
public interface NoteMapper {
    @Mappings(value = {
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "content", target = "content"),
            @Mapping(source = "state", target = "state"),
            @Mapping(source = "labels", target = "labels"),
            @Mapping(source = "createdAt", target = "createdAt"),
            @Mapping(source = "updatedAt", target = "updatedAt"),
            @Mapping(source = "userEntity.id", target = "userId"),


    })
    Note toNote(NoteEntity noteEntity);
    Iterable<Note> toNotes(Iterable<NoteEntity> noteEntities);

    @InheritInverseConfiguration
    NoteEntity toNoteEntity(Note note);
    Iterable<NoteEntity> toNoteEntities(Iterable<Note> notes);

}
