package com.tracoda.rest;

import com.tracoda.controller.FilesController;
import com.tracoda.model.Files;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping(value="/rest")
public class RestApi {

    @Autowired
    FilesController filesController;

    //@CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value={"files/all"}, method = RequestMethod.GET)
    public Iterable<Files> getAllFiles(){
        return filesController.getAllFiles();
    }

    /*@CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/save"}, method = RequestMethod.PUT)
    public void saveSolicitudXfoto(@RequestBody MultipartFile dr) throws Exception {
        filesController.saveFotoXSolicitud(dr);
    }*/

    //@CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/id"}, method = RequestMethod.GET)
    public Optional<Files> getSolicitudXid(@RequestParam BigDecimal id) throws Exception {
        return filesController.getFilesXSolicitudId(id);
    }

    //@CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/mes"}, method = RequestMethod.GET)
    public Iterable<Files> getSolicitudXmes(@RequestParam BigDecimal mes) throws Exception {
        return filesController.getFilesXSolicitudMes(mes);
    }

    //@CrossOrigin(origins="https://tracodafronttest.herokuapp.com")
    @RequestMapping(value = {"solicitud/archivo/anioMes"}, method = RequestMethod.GET)
    public Iterable<Files> getSolicitudXmesAnio(@RequestParam BigDecimal anio, BigDecimal mes) throws Exception {
        return filesController.getFilesXSolicitudMesAnio(anio,mes);
    }
}
