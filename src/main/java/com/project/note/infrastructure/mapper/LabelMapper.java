package com.project.note.infrastructure.mapper;

import com.project.note.domain.model.Label;
import com.project.note.infrastructure.entity.LabelEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface LabelMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "dateCreated", target = "dateCreated"),
            @Mapping(source = "dateUpdated", target = "dateUpdated"),
    })
    Label toLabel(LabelEntity labelEntity);
    Iterable<Label> toLabelList(Iterable<LabelEntity> labelEntities);

    @InheritInverseConfiguration
    LabelEntity toLabelEntity(Label label);
    Iterable<LabelEntity> toLabelEntities(Iterable<Label> labels);
}
