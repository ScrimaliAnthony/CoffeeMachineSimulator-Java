package machine;

import java.util.Scanner;

public class User {
    private final CoffeeMachineComputer coffeeMachineComputer;

    User(CoffeeMachineComputer coffeeMachineComputer) {
        this.coffeeMachineComputer = coffeeMachineComputer;
    }

    void action(Scanner sc) {
        System.out.println(Display.askAction());
        String action = sc.nextLine();
        switch (action) {
            case "buy":
                coffeeMachineComputer.buy(sc);
                break;
            case "fill":
                coffeeMachineComputer.fill(sc);
                break;
            case "take":
                coffeeMachineComputer.take();
                break;
            default:
                action(sc);
        }
    }
}
