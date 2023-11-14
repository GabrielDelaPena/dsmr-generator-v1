package be.ordina.dsmrgenerator.controller;

import be.ordina.dsmrgenerator.model.DSMR;
import be.ordina.dsmrgenerator.service.DSMRService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v4/generator")
@RestController
public class DSMRController {

    private final DSMRService dataService;

    @Autowired
    public DSMRController(DSMRService dataService) {
        this.dataService = dataService;
    }

    @GetMapping()
    public List<DSMR> dataSimulator() {
        return dataService.dataGenerator();
    }

    @GetMapping("/binary")
    public String binarySimulator() {
        List<DSMR> data = dataService.dataGenerator();
        return dataService.convertToBinaryManually(data);
    }

}
