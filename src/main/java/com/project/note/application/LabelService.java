package com.project.note.application;

import com.project.note.domain.model.Label;
import com.project.note.domain.port.ILabelRepository;


public class LabelService {
   private final ILabelRepository iLabelRepository;

    public LabelService(ILabelRepository iLabelRepository) {
        this.iLabelRepository = iLabelRepository;
    }
    public Label save(Label label) {
        return iLabelRepository.save(label);
    }
    public Iterable<Label> findAll() {
        return iLabelRepository.findAll();
    }
    public Label findById(Integer id) {
        return iLabelRepository.findById(id);
    }
    public void deleteById(Integer id) {
        iLabelRepository.deleteById(id);
    }
}
