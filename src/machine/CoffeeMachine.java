package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachineComputer coffeeMachineComputer = new CoffeeMachineComputer(sc);
        User user = new User(coffeeMachineComputer);

        while(!coffeeMachineComputer.getExit()) {
            user.action(sc);
        }
    }
}
