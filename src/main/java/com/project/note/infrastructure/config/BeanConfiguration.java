package com.project.note.infrastructure.config;

import com.project.note.application.LabelService;
import com.project.note.application.NoteService;
import com.project.note.application.UserService;
import com.project.note.domain.port.ILabelRepository;
import com.project.note.domain.port.INoteRepository;
import com.project.note.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository) {
        return new UserService(iUserRepository);
    }

    @Bean
    public LabelService labelService(ILabelRepository iLabelRepository) {
        return new LabelService(iLabelRepository);
    }
    @Bean
    public NoteService noteService(INoteRepository iNoteRepository) {
        return new NoteService(iNoteRepository);
    }
}
