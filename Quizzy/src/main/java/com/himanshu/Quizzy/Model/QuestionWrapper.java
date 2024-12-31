package com.himanshu.Quizzy.Model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class QuestionWrapper {
    private int id ;
    private String questionTitle ;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
}
