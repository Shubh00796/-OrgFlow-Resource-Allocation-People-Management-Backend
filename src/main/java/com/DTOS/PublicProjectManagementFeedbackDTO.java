package com.DTOS;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class PublicProjectManagementFeedbackDTO {

    private Long id;
    private Long projectId;
    private Long userId;
    private String comment;
    private int rating;
    private LocalDate submissionDate;




    }