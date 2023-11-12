package be.ordina.dsmrgenerator.controller;

import be.ordina.dsmrgenerator.model.Data;
import be.ordina.dsmrgenerator.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v4/generator")
@RestController
public class DataController {
    private final DataService dataService;

    @Autowired
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping()
    public List<Data> dataSimulator() {
        return dataService.dataGenerator(31);
    }
}
