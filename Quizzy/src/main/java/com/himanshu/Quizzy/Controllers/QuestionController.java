package com.himanshu.Quizzy.Controllers;

import com.himanshu.Quizzy.Model.Question;
import com.himanshu.Quizzy.Services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/que")
public class QuestionController {
    @Autowired
    public QuestionService queService;

    @GetMapping("/allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions() {
        return ResponseEntity.ok(queService.getAllQuestions());
    }

    @GetMapping("/questions/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
        return ResponseEntity.ok(queService.getQuestionsByCategory(category));
    }
    @PostMapping("/addQuestion")
    public ResponseEntity< String > addProduct(@RequestBody Question question) {
        return queService.addProduct(question);
    }
}
