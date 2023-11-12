package be.ordina.dsmrgenerator.service;

import be.ordina.dsmrgenerator.model.Data;
import be.ordina.dsmrgenerator.utils.FakeDataGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {
    public List<Data> dataGenerator(int numData) {
        FakeDataGenerator fakeDataGenerator = new FakeDataGenerator();
        return fakeDataGenerator.generateElectricityMeterData(31);
    }

}
