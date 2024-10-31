package com.project.note.domain.port;

import com.project.note.domain.model.Label;


public interface ILabelRepository {
    Label save(Label label);
    Iterable<Label> findAll();
    Label findById(Integer id);
    void deleteById(Integer id);
}
