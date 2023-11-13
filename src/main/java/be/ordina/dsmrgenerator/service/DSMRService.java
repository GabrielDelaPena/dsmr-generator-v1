package be.ordina.dsmrgenerator.service;

import be.ordina.dsmrgenerator.model.DSMR;
import be.ordina.dsmrgenerator.utils.FakeDataGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DSMRService {
    public List<DSMR> dataGenerator() {
        FakeDataGenerator fakeDataGenerator = new FakeDataGenerator();
        return fakeDataGenerator.generateElectricityMeterData(12, 31);
    }

}
