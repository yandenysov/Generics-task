package app.service;

import app.entity.Client;
import app.utils.Rounder;

import java.util.Scanner;

public class InfoService02 {

    Scanner scanner;
    String phoneNumber;
    double amount;

    public String getData() {
        return formData(getInputs());
    }

    private Client<String, Double> getInputs() {
        scanner = new Scanner(System.in);
        System.out.print("Enter client's phone: ");
        phoneNumber = scanner.nextLine();
        System.out.print("Enter client's purchase amount: ");
        amount = scanner.nextDouble();
        return new Client<>(phoneNumber, amount);
    }

    private String formData(Client<String, Double> client) {
        String amountRounded = Rounder.roundValue(client.getValue());
        return "Client's phone is " + client.getKey() +
                ", purchase amount is USD " + amountRounded;
    }
}
