package com.himanshu.Quizzy.Controllers;

import com.himanshu.Quizzy.Model.Question;
import com.himanshu.Quizzy.Model.QuestionWrapper;
import com.himanshu.Quizzy.Model.Quiz;
import com.himanshu.Quizzy.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")

public class QuizController {

    @Autowired
    public QuizService quizService ;

    @PostMapping("/create")
    public ResponseEntity<String> createQuiz(@RequestParam String title,
                                           @RequestParam int noQue,
                                           @RequestParam String category) {
        return quizService.createQuiz(title,noQue,category) ;
    }


    @GetMapping("/get")
    public ResponseEntity<List<QuestionWrapper>> getQuiz(@RequestParam int id) {
        return quizService.getQuiz(id) ;
    }

}
