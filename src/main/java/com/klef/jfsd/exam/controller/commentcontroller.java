package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.model.comment;
import com.klef.jfsd.exam.service.commentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class commentcontroller {

    @Autowired
    private commentservice commentService;
    @GetMapping("/fetchall")
    public List<comment> getAllComments() {
        return commentService.fetchAllComments();
    }
}
