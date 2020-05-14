package com.tracoda.rest;

import com.tracoda.controller.FilesController;
import com.tracoda.model.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@RestController
@RequestMapping(value="/rest")
public class RestApi {

    @Autowired
    FilesController filesController;

    @CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value={"files/all"}, method = RequestMethod.GET)
    public Iterable<Files> getAllFiles(){
        return filesController.getAllFiles();
    }

    @CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/save"}, method = RequestMethod.PUT)
    public void saveSolicitudXfoto(@RequestBody MultipartFile dr) throws Exception {
        filesController.saveFotoXSolicitud(dr);
    }

    @CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/mes"}, method = RequestMethod.GET)
    public Iterable<Files> getSolicitudXmes(@RequestParam BigDecimal mes) throws Exception {
        return filesController.getFilesXSolicitudMes(mes);
    }

    @CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/mesAnio"}, method = RequestMethod.GET)
    public void getSolicitudXmesAnio(@RequestParam BigDecimal mes, BigDecimal anio) throws Exception {
        filesController.getFilesXSolicitudMesAnio(mes,anio);
    }
}
