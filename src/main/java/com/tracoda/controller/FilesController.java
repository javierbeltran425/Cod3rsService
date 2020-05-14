package com.tracoda.controller;

import com.tracoda.interfaces.FileRepository;
import com.tracoda.model.Files;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

public class FilesController {

    @Autowired
    FileRepository fileRepository;

    public Iterable<Files> getAllFiles(){ return fileRepository.findAll(); }

    public void saveFotoXSolicitud(MultipartFile file) throws Exception {
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
    }

    public Iterable<Files> getFilesXSolicitudMes(BigDecimal mes) throws Exception {
        try {
            return  fileRepository.findByMes(mes);
        } catch (Exception ex) {
            throw new Exception("No se pueden recuperar los archivos del mes solicitado.. Intente mas tarde ..  Ex:", ex);
        }
    }

    public Iterable<Files> getFilesXSolicitudMesAnio(BigDecimal mes, BigDecimal anio) throws Exception {
        try {
            return  fileRepository.findByMesAndAnio(mes,anio);
        } catch (Exception ex) {
            throw new Exception("No se pueden recuperar los archivos del mes solicitado.. Intente mas tarde ..  Ex:", ex);
        }
    }
}
