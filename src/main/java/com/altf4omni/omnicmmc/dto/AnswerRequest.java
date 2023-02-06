package com.altf4omni.omnicmmc.dto;

import lombok.Data;

import java.util.List;

@Data
public class AnswerRequest {
    /**
     *
     */
    private Integer numberOfQuestions;
    /**
     *
     */
    private List<AnswerDto> questions;
}
