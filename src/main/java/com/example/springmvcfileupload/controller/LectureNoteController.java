package com.example.springmvcfileupload.controller;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.net.MalformedURLException;

@Slf4j
@Controller
@Data
public class LectureNoteController {

    @Value("${file.dir}")
    private String fileDir;


    @GetMapping("/lecture-note/{id}")
    public ResponseEntity<Resource> downloadLectureNote(@PathVariable Long id) throws MalformedURLException {
        UrlResource resource = new UrlResource("file:" + fileDir + "/lecture-note/lec" + id + ".pptx");
        String contentDisposition = "attachment; filename=\"" + "lec"+ id + ".pptx\"";
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, contentDisposition)
                .body(resource);

    }

//    @GetMapping("/source-code/{id}")
//    public ResponseEntity<Resource> downloadLectureNote(@PathVariable Long id) throws MalformedURLException {
//        UrlResource resource = new UrlResource("file:" + "/lecture-note/lec" + id);
//
//    }

}
