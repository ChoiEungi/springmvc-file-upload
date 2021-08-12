package com.example.springmvcfileupload.controller;

import com.example.springmvcfileupload.domain.Assignment;
import com.example.springmvcfileupload.domain.UploadFile;
import com.example.springmvcfileupload.file.FileStore;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Slf4j
@Controller
@AllArgsConstructor
public class MainController {

    private final FileStore fileStore;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hw1")
    public String assignment(){
        return "assignment";
    }

    @PostMapping("/file-upload/hw1")
    public String assignmentSubmit(@ModelAttribute ItemForm form, RedirectAttributes redirectAttributes) throws IOException {

        UploadFile attachFile = fileStore.storeFile(form.getAttachFile());




        return "submission";
    }

}

