package com.tracoda.controller;

import com.tracoda.interfaces.FileRepository;
import com.tracoda.model.Files;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Optional;

public class FilesController {

    @Autowired
    FileRepository fileRepository;

    public Iterable<Files> getAllFiles(){ return fileRepository.findAll(); }

    /*public void saveFotoXSolicitud(MultipartFile file) throws Exception {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileUploadException("El siguiente archivo tiene caracteres invalidos " + fileName);
            }

            Files dbFile = new Files();
            dbFile.setContenido(file.getBytes());

            fileRepository.save(dbFile);
        } catch (Exception ex) {
            throw new Exception("No se puede guardar el archivo " + fileName + ". Intente nuevamente! Ex:", ex);
        }
    }*/

    public Optional<Files> getFilesXSolicitudId(BigDecimal id) throws Exception{
        try {
            return  fileRepository.findById(id);
        } catch (Exception ex) {
            throw new Exception("No se pueden recuperar los archivos del mes solicitado.. Intente mas tarde ..  Ex:", ex);
        }
    }

    public Iterable<Files> getFilesXSolicitudMes(BigDecimal mes) throws Exception {
        try {
            return  fileRepository.findByMes(mes);
        } catch (Exception ex) {
            throw new Exception("No se pueden recuperar los archivos del mes solicitado.. Intente mas tarde ..  Ex:", ex);
        }
    }

    public Iterable<Files> getFilesXSolicitudMesAnio(BigDecimal anio, BigDecimal mes) throws Exception {
        try {
            return  fileRepository.findByAnioAndMes(anio,mes);
        } catch (Exception ex) {
            throw new Exception("No se pueden recuperar los archivos del mes solicitado.. Intente mas tarde ..  Ex:", ex);
        }
    }
}
