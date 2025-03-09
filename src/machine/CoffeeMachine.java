package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachineComputer coffeeMachineComputer = new CoffeeMachineComputer(sc);
        User user = new User(coffeeMachineComputer);

        System.out.println(Display.menu(coffeeMachineComputer.getWatterAvailable() , coffeeMachineComputer.getMilkAvailable() , coffeeMachineComputer.getCoffeeBeansAvailable() , coffeeMachineComputer.getMoney() , coffeeMachineComputer.getDisposableCups()));
        user.action(sc);
        System.out.println(Display.menu(coffeeMachineComputer.getWatterAvailable() , coffeeMachineComputer.getMilkAvailable() , coffeeMachineComputer.getCoffeeBeansAvailable() , coffeeMachineComputer.getMoney() , coffeeMachineComputer.getDisposableCups()));

//        coffeeMachineComputer.setHowManyCups(sc);
    }
}
