package be.ordina.dsmrgenerator.service;

import be.ordina.dsmrgenerator.model.DSMR;
import be.ordina.dsmrgenerator.utils.ConvertToBinaryManually;
import be.ordina.dsmrgenerator.utils.FakeDataGenerator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DSMRService {
    public List<DSMR> dataGenerator() {
        FakeDataGenerator fakeDataGenerator = new FakeDataGenerator();
        return fakeDataGenerator.generateElectricityMeterData(12, 31);
    }

    public String convertToBinaryManually(List<DSMR> dsmrList) {
        ConvertToBinaryManually convertToBinaryManually = new ConvertToBinaryManually();
        StringBuilder binaryString = new StringBuilder();

        for (int i = 0; i < 2; i ++) {
            binaryString.append(convertToBinaryManually.convertToBinaryManually(dsmrList.get(i).toString()));
        }

        return binaryString.toString();
    }

}
