package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachineComputer coffeeMachineComputer = new CoffeeMachineComputer(sc);
        coffeeMachineComputer.setHowManyCups(sc);
    }
}