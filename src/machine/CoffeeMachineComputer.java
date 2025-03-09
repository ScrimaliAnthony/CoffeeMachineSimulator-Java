package machine;

import java.util.Scanner;

class CoffeeMachineComputer {

    private final int watterForOneCup = 200;
    private final int milkForOneCup = 50;
    private final int coffeeBeansForOneCup = 15;

    private int watterAvailable;
    private int milkAvailable;
    private int coffeeBeansAvailable;

    private int howManyCups;

    CoffeeMachineComputer(Scanner sc) {
        System.out.println("Write how many ml of water the coffee machine has:");
        watterAvailable = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milkAvailable = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeansAvailable = sc.nextInt();
    }

    void setHowManyCups(Scanner sc) {
        System.out.println(Display.howManyCups());
        howManyCups = sc.nextInt();
        int howManyCupAvailable = howManyCupAvailable();

        if(howManyCupAvailable - howManyCups == 0) {
            System.out.println(Display.exactNumberOfServing());
        } else if (howManyCupAvailable - howManyCups > 0) {
            System.out.println(Display.moreNumberOfServing(howManyCupAvailable - howManyCups));
        } else {
            System.out.println(Display.lessNumberOfServing(howManyCupAvailable));
        }
    }

    private void ingredientYouNeed() {
        int watterYouNeed = watterForOneCup * howManyCups;
        int milkYouNeed = milkForOneCup * howManyCups;
        int coffeeYouNeed = coffeeBeansForOneCup * howManyCups;
    }

    private int howManyCupAvailable() {
        int[] cupAvailable = {howManyCupAvailableWithWatter(), howManyCupAvailableWithMilk(), howManyCupAvailableWithCoffeeBeen()};
        int howManyCupAvailable = cupAvailable[0];

        for(int i = 1; i < 3; i++) {
            if(cupAvailable[i] < howManyCupAvailable) {
                howManyCupAvailable = cupAvailable[i];
            }
        }
        return howManyCupAvailable;
    }

    private int howManyCupAvailableWithWatter() {
        int nbCoffeeAvailableWithWatter = 0;
        while(watterAvailable - watterForOneCup >= 0) {
            watterAvailable = watterAvailable - watterForOneCup;
            nbCoffeeAvailableWithWatter++;
        }
        return nbCoffeeAvailableWithWatter;
    }

    private int howManyCupAvailableWithMilk() {
        int nbCoffeeAvailableWithMilk = 0;
        while(milkAvailable - milkForOneCup >= 0) {
            milkAvailable = milkAvailable - milkForOneCup;
            nbCoffeeAvailableWithMilk++;
        }
        return nbCoffeeAvailableWithMilk;
    }

    private int howManyCupAvailableWithCoffeeBeen() {
        int nbCoffeeAvailableWithCoffeeBeen = 0;
            while(coffeeBeansAvailable - coffeeBeansForOneCup >= 0) {
                coffeeBeansAvailable = coffeeBeansAvailable - coffeeBeansForOneCup;
                nbCoffeeAvailableWithCoffeeBeen++;
            }
        return nbCoffeeAvailableWithCoffeeBeen;
    }

}
