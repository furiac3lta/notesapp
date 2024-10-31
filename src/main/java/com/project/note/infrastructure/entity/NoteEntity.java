package com.project.note.infrastructure.entity;

import com.project.note.domain.model.State;
import jakarta.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name="notes")
@Data
@NoArgsConstructor
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String content;
    @Enumerated(EnumType.STRING)
    private State state;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;
    private Integer userId;

    @ManyToOne
    private UserEntity userEntity;

    @ManyToMany
            @JoinTable(
                    name = "note_label",
                    joinColumns = @JoinColumn(name = "note_id"),
                    inverseJoinColumns = @JoinColumn(name = "label_id")
            )
    private List<LabelEntity> labels;
}
