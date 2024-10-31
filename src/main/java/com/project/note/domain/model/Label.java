package com.project.note.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Label {
    private int id;
    private String name;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
}
