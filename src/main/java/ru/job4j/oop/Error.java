package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printError() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Error testError = new Error();
        Error testError2 = new Error(true, 404, "Авария на 4-м энергоблоке");
        Error testError3 = new Error(false, 202, "Перегрев");
        testError.printError();
        testError2.printError();
        testError3.printError();
    }

}
