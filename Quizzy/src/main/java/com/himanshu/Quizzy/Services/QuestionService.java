package com.himanshu.Quizzy.Services;

import com.himanshu.Quizzy.Model.Question;
import com.himanshu.Quizzy.Repositories.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    public QuestionRepo queRepo ;


    public List<Question> getAllQuestions() {
        return queRepo.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return queRepo.findByCategory(category);
    }


    public ResponseEntity< String> addProduct(Question question) {

        try {
            queRepo.save(question);
            return new ResponseEntity<>("created", HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}