package com.himanshu.Quizzy.Services;


import com.himanshu.Quizzy.Model.Question;
import com.himanshu.Quizzy.Model.QuestionWrapper;
import com.himanshu.Quizzy.Model.Quiz;
import com.himanshu.Quizzy.Repositories.QuestionRepo;
import com.himanshu.Quizzy.Repositories.QuizRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class QuizService {

    @Autowired
    public QuizRepo quizRepo;
    @Autowired
    public QuestionRepo queRepo;


    public ResponseEntity<String> createQuiz(String title, int noQue, String category) {

        List<Question> queList = queRepo.getRandQueByCategory(noQue, category);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQueList(queList);

        quizRepo.save(quiz);

        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }


    //Error here

    public ResponseEntity<List<QuestionWrapper>> getQuiz(int id) {

        Optional<Quiz> quiz = quizRepo.findById(id);
        List<Question> queByDB = quiz.get().getQueList();

        List<QuestionWrapper> queForUser = new ArrayList<>();

        for (Question q : queByDB) {
            QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestionTitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4());
            queForUser.add(qw);
        }


        return new ResponseEntity<>(queForUser, HttpStatus.OK);
    }
}