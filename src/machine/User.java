package machine;

import java.util.Scanner;

class User {
    private final CoffeeMachineComputer coffeeMachineComputer;

    User(CoffeeMachineComputer coffeeMachineComputer) {
        this.coffeeMachineComputer = coffeeMachineComputer;
    }

    void action(Scanner sc) {
        boolean isContinue = true;
        while(isContinue) {
            System.out.println(Display.askAction());
            String action = sc.nextLine();
            switch (action) {
                case "buy":
                    if(coffeeMachineComputer.getClean() < 10) {
                        coffeeMachineComputer.choose(sc, this);
                    } else {
                        System.out.println("I need cleaning!");
                    }
                    break;
                case "fill":
                    coffeeMachineComputer.fill(sc);
                    break;
                case "take":
                    coffeeMachineComputer.take();
                    break;
                case "remaining":
                    System.out.println(Display.menu(coffeeMachineComputer.getWatterAvailable() , coffeeMachineComputer.getMilkAvailable() , coffeeMachineComputer.getCoffeeBeansAvailable() , coffeeMachineComputer.getMoney() , coffeeMachineComputer.getDisposableCups()));
                    break;
                case "exit":
                    coffeeMachineComputer.setExit();
                    return;
                case "clean":
                    coffeeMachineComputer.setClean();
                    break;
                default:
                    break;
            }
        }
    }
}
