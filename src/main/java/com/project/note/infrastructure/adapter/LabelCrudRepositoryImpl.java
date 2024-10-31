package com.project.note.infrastructure.adapter;

import com.project.note.domain.model.Label;
import com.project.note.domain.port.ILabelRepository;
import com.project.note.infrastructure.mapper.LabelMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class LabelCrudRepositoryImpl implements ILabelRepository {
    private final ILabelCrudRepository iLabelCrudRepository;
    private final LabelMapper labelMapper;

    @Override
    public Label save(Label label) {
        return labelMapper.toLabel(iLabelCrudRepository.save(labelMapper.toLabelEntity(label)));
    }

    @Override
    public Iterable<Label> findAll() {
        return labelMapper.toLabelList(iLabelCrudRepository.findAll());
    }

    @Override
    public Label findById(Integer id) {
        return labelMapper.toLabel(iLabelCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Label with id " + id + " not found")
        ));
    }

    @Override
    public void deleteById(Integer id) {
        iLabelCrudRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Label with id " + id + " not found")
        );
        iLabelCrudRepository.deleteById(id);
    }
}
