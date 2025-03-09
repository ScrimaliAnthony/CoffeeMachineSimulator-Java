package machine;

import java.util.Scanner;

class CoffeeMachineComputer {

    private int howManyCups = 0;

    String ingredientYouNeed() {
        final int watterForOneCup = 200;
        final int milkForOneCup = 50;
        final int coffeeBeansForOneCup = 15;

        int watterYouNeed = watterForOneCup * howManyCups;
        int milkYouNeed = milkForOneCup * howManyCups;
        int coffeeYouNeed = coffeeBeansForOneCup * howManyCups;

        return Display.ingredientYouNeed(howManyCups, watterYouNeed, milkYouNeed, coffeeYouNeed);
    }

    int getHowManyCups() {
        return howManyCups;
    }

    void setHowManyCups(Scanner sc) {
        howManyCups = sc.nextInt();
    }

}
