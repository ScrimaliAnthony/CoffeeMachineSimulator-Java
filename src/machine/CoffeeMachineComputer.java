package machine;

import java.util.Scanner;

class CoffeeMachineComputer {

    private final int watterForOneCup = 200;
    private final int milkForOneCup = 50;
    private final int coffeeBeansForOneCup = 15;

    private int watterAvailable = 400;
    private int milkAvailable = 540;
    private int coffeeBeansAvailable = 120;
    private int money = 550;
    private int disposableCups = 9;

    private int howManyCups;

    CoffeeMachineComputer(Scanner sc) {
//        System.out.println("Write how many ml of water the coffee machine has:");
//        watterAvailable = sc.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        milkAvailable = sc.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        coffeeBeansAvailable = sc.nextInt();
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

    void buy(Scanner sc) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int whatYouWantToBuy = sc.nextInt();
        switch (whatYouWantToBuy) {
            case 1:
                setWatterAvailable(-250);
                setCoffeeBeansAvailable(-16);
                setMoney(4);
                setDisposableCups(-1);
                break;
            case 2:
                setWatterAvailable(-350);
                setMilkAvailable(-75);
                setCoffeeBeansAvailable(-20);
                setMoney(7);
                setDisposableCups(-1);
                break;
            case 3:
                setWatterAvailable(-200);
                setMilkAvailable(-100);
                setCoffeeBeansAvailable(-12);
                setMoney(6);
                setDisposableCups(-1);
                break;
            default:
                buy(sc);
        }
    }

    void fill(Scanner sc) {
        System.out.println("Write how many ml of water you want to add:");
        setWatterAvailable(sc.nextInt());

        System.out.println("Write how many ml of milk you want to add:");
        setMilkAvailable(sc.nextInt());

        System.out.println("Write how many grams of coffee beans you want to add:");
        setCoffeeBeansAvailable(sc.nextInt());

        System.out.println("Write how many disposable cups you want to add:");
        setDisposableCups(sc.nextInt());
    }

    public int getWatterAvailable() {
        return watterAvailable;
    }

    public void setWatterAvailable(int watterToAdd) {
        watterAvailable = watterAvailable + watterToAdd;
    }

    public int getMilkAvailable() {
        return milkAvailable;
    }

    public void setMilkAvailable(int milkToAdd) {
        milkAvailable = milkAvailable + milkToAdd;
    }

    public int getCoffeeBeansAvailable() {
        return coffeeBeansAvailable;
    }

    public void setCoffeeBeansAvailable(int coffeeBeansToAdd) {
        coffeeBeansAvailable = coffeeBeansAvailable + coffeeBeansToAdd;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int moneyToAdd) {
        money = money + moneyToAdd;
    }

    void take() {
        System.out.println(Display.take(money));
        money = 0;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCupsToAdd) {
        disposableCups = disposableCups + disposableCupsToAdd;
    }

}
