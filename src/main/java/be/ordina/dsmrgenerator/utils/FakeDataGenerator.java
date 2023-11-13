package be.ordina.dsmrgenerator.utils;

import be.ordina.dsmrgenerator.model.DSMR;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FakeDataGenerator {
    public List<DSMR> generateElectricityMeterData(int numIntervalsPerDay, int numDays) {
        List<DSMR> fakeData = new ArrayList<>();
        Instant currentTimestamp = Instant.now();
        Random random = new Random();

        for (int day = 0; day < numDays; day++) {
            for (int interval = 0; interval < numIntervalsPerDay; interval++) {
                DSMR digitalElectricityMeter = new DSMR();

                digitalElectricityMeter.setSerialNumberElectricityMeter(String.valueOf(random.nextInt(10000)));
                digitalElectricityMeter.setTimestamp(currentTimestamp);
                digitalElectricityMeter.setMessage("");
                digitalElectricityMeter.setSwitchPositionElectricity(random.nextInt(2) + 1);
                digitalElectricityMeter.setMaxAllowedPowerPerPhase(random.nextDouble() * 1000);
                digitalElectricityMeter.setMaxAllowedCurrentPerPhase(random.nextDouble() * 100);

                // Set total consumption and production for two rates (day and night)
                digitalElectricityMeter.setRate1TotalConsumption(random.nextDouble() * 1000);
                digitalElectricityMeter.setRate2TotalConsumption(random.nextDouble() * 1000);
                digitalElectricityMeter.setRate1TotalProduction(random.nextDouble() * 100);
                digitalElectricityMeter.setRate2TotalProduction(random.nextDouble() * 100);

                // Set current values for all phases and L1, L2, L3
                digitalElectricityMeter.setAllPhasesConsumption(random.nextDouble() * 1000);
                digitalElectricityMeter.setAllPhasesProduction(random.nextDouble() * 100);
                digitalElectricityMeter.setL1Consumption(random.nextDouble() * 100);
                digitalElectricityMeter.setL2Consumption(random.nextDouble() * 100);
                digitalElectricityMeter.setL3Consumption(random.nextDouble() * 100);
                digitalElectricityMeter.setL1Production(random.nextDouble() * 100);
                digitalElectricityMeter.setL2Production(random.nextDouble() * 100);
                digitalElectricityMeter.setL3Production(random.nextDouble() * 100);

                // Set voltage and current values for L1, L2, L3
                digitalElectricityMeter.setL1Voltage(random.nextDouble() * 240);
                digitalElectricityMeter.setL2Voltage(random.nextDouble() * 240);
                digitalElectricityMeter.setL3Voltage(random.nextDouble() * 240);
                digitalElectricityMeter.setL1Current(random.nextDouble() * 20);
                digitalElectricityMeter.setL2Current(random.nextDouble() * 20);
                digitalElectricityMeter.setL3Current(random.nextDouble() * 20);

                digitalElectricityMeter.setOtherDevicesOnBus(random.nextInt(10));
                fakeData.add(digitalElectricityMeter);
                currentTimestamp = currentTimestamp.plus(2, ChronoUnit.HOURS);
            }
        }
        return fakeData;
    }
}
