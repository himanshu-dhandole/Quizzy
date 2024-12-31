package com.himanshu.Quizzy.Repositories;

import com.himanshu.Quizzy.Model.Question;
import com.himanshu.Quizzy.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepo extends JpaRepository<Quiz,Integer> {

}
