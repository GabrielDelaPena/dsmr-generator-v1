package be.ordina.dsmrgenerator.model;

import java.time.Instant;

public class Data {
    private String serialNumberElectricityMeter;
    private Instant timestamp;
    private double rate1TotalConsumption;
    private double rate2TotalConsumption;
    private double rate1TotalProduction;
    private double rate2TotalProduction;
    private int currentRate;
    private double allPhasesConsumption;
    private double allPhasesProduction;
    private double l1Consumption;
    private double l2Consumption;
    private double l3Consumption;
    private double l1Production;
    private double l2Production;
    private double l3Production;
    private double l1Voltage;
    private double l2Voltage;
    private double l3Voltage;
    private double l1Current;
    private double l2Current;
    private double l3Current;
    private int switchPositionElectricity;
    private double maxAllowedPowerPerPhase;
    private double maxAllowedCurrentPerPhase;
    private String message;
    private int otherDevicesOnBus;

    public Data() {
    }

    public String getSerialNumberElectricityMeter() {
        return serialNumberElectricityMeter;
    }

    public void setSerialNumberElectricityMeter(String serialNumberElectricityMeter) {
        this.serialNumberElectricityMeter = serialNumberElectricityMeter;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public double getRate1TotalConsumption() {
        return rate1TotalConsumption;
    }

    public void setRate1TotalConsumption(double rate1TotalConsumption) {
        this.rate1TotalConsumption = rate1TotalConsumption;
    }

    public double getRate2TotalConsumption() {
        return rate2TotalConsumption;
    }

    public void setRate2TotalConsumption(double rate2TotalConsumption) {
        this.rate2TotalConsumption = rate2TotalConsumption;
    }

    public double getRate1TotalProduction() {
        return rate1TotalProduction;
    }

    public void setRate1TotalProduction(double rate1TotalProduction) {
        this.rate1TotalProduction = rate1TotalProduction;
    }

    public double getRate2TotalProduction() {
        return rate2TotalProduction;
    }

    public void setRate2TotalProduction(double rate2TotalProduction) {
        this.rate2TotalProduction = rate2TotalProduction;
    }

    public int getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(int currentRate) {
        this.currentRate = currentRate;
    }

    public double getAllPhasesConsumption() {
        return allPhasesConsumption;
    }

    public void setAllPhasesConsumption(double allPhasesConsumption) {
        this.allPhasesConsumption = allPhasesConsumption;
    }

    public double getAllPhasesProduction() {
        return allPhasesProduction;
    }

    public void setAllPhasesProduction(double allPhasesProduction) {
        this.allPhasesProduction = allPhasesProduction;
    }

    public double getL1Consumption() {
        return l1Consumption;
    }

    public void setL1Consumption(double l1Consumption) {
        this.l1Consumption = l1Consumption;
    }

    public double getL2Consumption() {
        return l2Consumption;
    }

    public void setL2Consumption(double l2Consumption) {
        this.l2Consumption = l2Consumption;
    }

    public double getL3Consumption() {
        return l3Consumption;
    }

    public void setL3Consumption(double l3Consumption) {
        this.l3Consumption = l3Consumption;
    }

    public double getL1Production() {
        return l1Production;
    }

    public void setL1Production(double l1Production) {
        this.l1Production = l1Production;
    }

    public double getL2Production() {
        return l2Production;
    }

    public void setL2Production(double l2Production) {
        this.l2Production = l2Production;
    }

    public double getL3Production() {
        return l3Production;
    }

    public void setL3Production(double l3Production) {
        this.l3Production = l3Production;
    }

    public double getL1Voltage() {
        return l1Voltage;
    }

    public void setL1Voltage(double l1Voltage) {
        this.l1Voltage = l1Voltage;
    }

    public double getL2Voltage() {
        return l2Voltage;
    }

    public void setL2Voltage(double l2Voltage) {
        this.l2Voltage = l2Voltage;
    }

    public double getL3Voltage() {
        return l3Voltage;
    }

    public void setL3Voltage(double l3Voltage) {
        this.l3Voltage = l3Voltage;
    }

    public double getL1Current() {
        return l1Current;
    }

    public void setL1Current(double l1Current) {
        this.l1Current = l1Current;
    }

    public double getL2Current() {
        return l2Current;
    }

    public void setL2Current(double l2Current) {
        this.l2Current = l2Current;
    }

    public double getL3Current() {
        return l3Current;
    }

    public void setL3Current(double l3Current) {
        this.l3Current = l3Current;
    }

    public int getSwitchPositionElectricity() {
        return switchPositionElectricity;
    }

    public void setSwitchPositionElectricity(int switchPositionElectricity) {
        this.switchPositionElectricity = switchPositionElectricity;
    }

    public double getMaxAllowedPowerPerPhase() {
        return maxAllowedPowerPerPhase;
    }

    public void setMaxAllowedPowerPerPhase(double maxAllowedPowerPerPhase) {
        this.maxAllowedPowerPerPhase = maxAllowedPowerPerPhase;
    }

    public double getMaxAllowedCurrentPerPhase() {
        return maxAllowedCurrentPerPhase;
    }

    public void setMaxAllowedCurrentPerPhase(double maxAllowedCurrentPerPhase) {
        this.maxAllowedCurrentPerPhase = maxAllowedCurrentPerPhase;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getOtherDevicesOnBus() {
        return otherDevicesOnBus;
    }

    public void setOtherDevicesOnBus(int otherDevicesOnBus) {
        this.otherDevicesOnBus = otherDevicesOnBus;
    }
}
