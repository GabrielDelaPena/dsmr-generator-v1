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

                digitalElectricityMeter.setSerialNumberElectricityMeter("24");
                digitalElectricityMeter.setTimestamp(currentTimestamp);
                digitalElectricityMeter.setMessage("");
                digitalElectricityMeter.setSwitchPositionElectricity(1);
                digitalElectricityMeter.setMaxAllowedPowerPerPhase(999.9); // kW
                digitalElectricityMeter.setMaxAllowedCurrentPerPhase(999); // A

                // Set total consumption and production for two rates (day and night)
                digitalElectricityMeter.setRate1TotalConsumption(random.nextInt(900-600) + 600); // kW
                digitalElectricityMeter.setRate2TotalConsumption(random.nextInt(600-400) + 400);
                digitalElectricityMeter.setRate1TotalProduction(random.nextInt(900-600) + 600);
                digitalElectricityMeter.setRate2TotalProduction(random.nextInt(600-400) + 400);

                // Set current values for all phases and L1, L2, L3
                digitalElectricityMeter.setAllPhasesConsumption(Math.round(0.500 + (0.800 - 0.500) * random.nextDouble() * 1000.0) / 1000.0); // 00.200kW - 00.800kW
                digitalElectricityMeter.setAllPhasesProduction(Math.round(0.500 + (0.800 - 0.500) * random.nextDouble() * 1000.0) / 1000.0); // 00.200kW - 00.800kW
                digitalElectricityMeter.setL1Consumption(Math.round(0.500 + (0.800 - 0.500) * random.nextDouble() * 1000.0) / 1000.0); // 00.200kW - 00.800kW
                digitalElectricityMeter.setL2Consumption(random.nextInt(5000 - 2000 + 1) + 2000); // 2,000kW - 5,000kW
                digitalElectricityMeter.setL3Consumption(random.nextInt(5000 - 2000 + 1) + 2000); // 2,000kW - 5,000kW
                digitalElectricityMeter.setL1Production(random.nextInt(5000 - 2000 + 1) + 2000); // 2,000kW - 5,000kW
                digitalElectricityMeter.setL2Production(random.nextInt(5000 - 2000 + 1) + 2000); // 2,000kW - 5,000kW
                digitalElectricityMeter.setL3Production(random.nextInt(5000 - 2000 + 1) + 2000); // 2,000kW - 5,000kW

                // Set voltage and current values for L1, L2, L3
                digitalElectricityMeter.setL1Voltage(random.nextInt(230-220) + 220); // V
                digitalElectricityMeter.setL2Voltage(random.nextInt(230-220) + 220);
                digitalElectricityMeter.setL3Voltage(random.nextInt(230-220) + 220);
                digitalElectricityMeter.setL1Current(random.nextInt(10-1) + 1); // A
                digitalElectricityMeter.setL2Current(random.nextInt(10-1) + 1);
                digitalElectricityMeter.setL3Current(random.nextInt(10-1) + 1);

                digitalElectricityMeter.setOtherDevicesOnBus(random.nextInt(10));
                fakeData.add(digitalElectricityMeter);
                currentTimestamp = currentTimestamp.plus(2, ChronoUnit.HOURS);
            }
        }
        return fakeData;
    }
}
