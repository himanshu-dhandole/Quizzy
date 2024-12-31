package com.himanshu.Quizzy.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String title ;
    @ManyToMany
    private List<Question> queList ;


//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<Question> getQueList() {
//        return queList;
//    }
//
//    public void setQueList(List<Question> queList) {
//        this.queList = queList;
//    }
//
//    public Quiz(int id, String title, List<Question> queList) {
//        this.id = id;
//        this.title = title;
//        this.queList = queList;
//    }
//    public Quiz() {
//
//    }
}
