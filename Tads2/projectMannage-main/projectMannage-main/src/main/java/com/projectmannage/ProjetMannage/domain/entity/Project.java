package com.projectmannage.ProjetMannage.domain.entity;

import lombok.*;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    private String id;
    private String name;
    private String description;
    private LocalDate initial_data;
    private LocalDate final_data;
    private String status;

    public static void main(String[] args) {

        Project project = Project.builder()
                .description("teste")
                .initial_data(LocalDate.now())
                .final_data(LocalDate.now())
                .build();


        System.out.println("ID: " + project.getId());
        System.out.println("Data Inicial: " + project.getInitial_data());
    }
}