package com.project.note.infrastructure.adapter;

import com.project.note.infrastructure.entity.LabelEntity;
import org.springframework.data.repository.CrudRepository;

public interface ILabelCrudRepository extends CrudRepository<LabelEntity, Integer> {

}
