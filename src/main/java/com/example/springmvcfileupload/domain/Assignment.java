package com.example.springmvcfileupload.domain;


import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class Assignment {
    private String name;
    private MultipartFile assignmentFile;
}
