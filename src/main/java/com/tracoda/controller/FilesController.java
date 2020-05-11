package com.tracoda.controller;

import com.tracoda.interfaces.FileRepository;
import com.tracoda.model.Files;
import org.springframework.beans.factory.annotation.Autowired;

public class FilesController {

    @Autowired
    FileRepository fileRepository;

    public Iterable<Files> getAllFiles(){
        return fileRepository.findAll();
    }
}
