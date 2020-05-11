package com.tracoda.rest;

import com.tracoda.controller.FilesController;
import com.tracoda.model.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value="/rest")
public class RestApi {

    @Autowired
    FilesController filesController;

    @RequestMapping(value={"files/all"}, method = RequestMethod.GET)
    public Iterable<Files> getAllFiles(){
        return filesController.getAllFiles();
    }
}
