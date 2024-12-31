package com.himanshu.Quizzy.Services;


import com.himanshu.Quizzy.Model.Question;
import com.himanshu.Quizzy.Model.Quiz;
import com.himanshu.Quizzy.Repositories.QuestionRepo;
import com.himanshu.Quizzy.Repositories.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    public QuizRepo quizRepo ;
    @Autowired
    public QuestionRepo queRepo ;


    public ResponseEntity<Quiz> createQuiz(String title, int noQue, String category) {

        List<Question> queList = queRepo.getRandQueByCategory(noQue,category) ;


        System.out.println(title + " " + noQue+" " + category);



        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQueList(queList);

        Quiz obj1 = quizRepo.save(quiz) ;


        return new ResponseEntity<>(obj1, HttpStatus.CREATED) ;

    }
}