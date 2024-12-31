package com.himanshu.Quizzy.Controllers;


import com.himanshu.Quizzy.Model.Quiz;
import com.himanshu.Quizzy.Services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    @Autowired
    public QuizService quizService ;


    @GetMapping("/hello")
    public String hello(){
        return "hello" ;
    }


    @PostMapping("/create")
    public ResponseEntity<Quiz> createQuiz(@RequestParam String title,
                                           @RequestParam int noQue,
                                           @RequestParam String category) {
        return quizService.createQuiz(title,noQue,category) ;
    }
}