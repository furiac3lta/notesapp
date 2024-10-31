package com.project.note.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    private Integer id;
    private String title;
    private String content;
    private State state;
    private List<Label> labels;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer userId;
}
