package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachineComputer coffeeMachineComputer = new CoffeeMachineComputer();

        System.out.println(Display.howManyCups());
        coffeeMachineComputer.setHowManyCups(sc);
        System.out.println(coffeeMachineComputer.ingredientYouNeed());
    }
}