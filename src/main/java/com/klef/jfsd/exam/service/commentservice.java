package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.comment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class commentservice {

    public List<comment> fetchAllComments() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/comments";
        comment[] comments = restTemplate.getForObject(url, comment[].class);
        return Arrays.asList(comments);
    }
}
