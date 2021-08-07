package com.example.springmvcfileupload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

//파일 저장용 폼
@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private List<MultipartFile> imageFiles;
    private MultipartFile attachFile;
}
