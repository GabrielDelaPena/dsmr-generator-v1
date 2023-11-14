package be.ordina.dsmrgenerator.utils;

public class ConvertToBinaryManually {
    public String convertToBinaryManually(String input) {
        StringBuilder binaryString = new StringBuilder();
        for (char c : input.toCharArray()) {
            String binary = Integer.toBinaryString(c);
            binaryString.append(String.format("%16s", binary).replace(' ', '0'));
        }
        return binaryString.toString();
    }
}
