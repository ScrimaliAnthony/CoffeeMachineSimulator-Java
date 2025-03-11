package machine;

import java.util.Scanner;

class CoffeeMachineComputer {

    private static int clean = 0;

    private boolean exit = false;

    private int watterAvailable = 400;
    private int milkAvailable = 540;
    private int coffeeBeansAvailable = 120;
    private int money = 550;
    private int disposableCups = 9;

    CoffeeMachineComputer(Scanner sc) {}

    void choose(Scanner sc, User user) {
        boolean choosing = true;
        while(choosing) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String whatYouWantToBuy = sc.nextLine();
            switch (whatYouWantToBuy) {
                case "1":
                    buy(-250, 0, -16, -1, 4);
                    return;
                case "2":
                    buy(-350, -75, -20, -1, 7);
                    return;
                case "3":
                    buy(-200, -100, -12, -1, 6);
                    return;
                case "back":
                    return;
                case "exit":
                    setExit();
                    return;
                default:
            }
        }
    }

    private void buy(int watterNeed, int milkNeed, int coffeeBeansNeed, int disposableCupsNeed, int moneyNeed) {
        if(checkIngredient(watterNeed, milkNeed, coffeeBeansNeed, disposableCupsNeed)) {
            setWatterAvailable(watterNeed);
            setMilkAvailable(milkNeed);
            setCoffeeBeansAvailable(coffeeBeansNeed);
            setMoney(moneyNeed);
            setDisposableCups(disposableCupsNeed);
            clean++;
            System.out.println("I have enough resources, making you a coffee!\n");
        }
    }

    private boolean checkIngredient(int watterNeed, int milkNeed, int coffeeBeansNeed, int DisposableCupsNeed) {
        int i = 0;
        int[] ingredients = {watterNeed, milkNeed, coffeeBeansNeed, DisposableCupsNeed};
        int[] available = {watterAvailable, milkAvailable, coffeeBeansAvailable, disposableCups};
        String[] ingredientNames = {"water", "milk", "coffee beans", "disposable cups"};

        for(int ingredient : ingredients) {
            if(checking(ingredient, available[i], ingredientNames[i])) {
                return false;
            };
            i++;
        }
        return true;
    }

    private boolean checking(int ingredientNeed, int ingredientToCheck, String ingredientName) {
        if (ingredientNeed + ingredientToCheck < 0 ) {
            System.out.println(Display.checkingFalse(ingredientName));
            return true;
        }
        return false;
    }

    void fill(Scanner sc) {
        System.out.println("Write how many ml of water you want to add:");
        int waterToAdd = sc.nextInt();
        sc.nextLine();
        setWatterAvailable(waterToAdd);

        System.out.println("Write how many ml of milk you want to add:");
        int milkToAdd = sc.nextInt();
        sc.nextLine();
        setMilkAvailable(milkToAdd);

        System.out.println("Write how many grams of coffee beans you want to add:");
        int beansToAdd = sc.nextInt();
        sc.nextLine();
        setCoffeeBeansAvailable(beansToAdd);

        System.out.println("Write how many disposable cups you want to add:");
        int cupsToAdd = sc.nextInt();
        sc.nextLine();
        setDisposableCups(cupsToAdd);
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

    public boolean getExit() {
        return exit;
    }

    public void setExit() {
        exit = !exit;
    }

    public int getClean() {
        return clean;
    }

    public void setClean() {
        clean = 0;
        System.out.println("I have been cleaned!");
    }

}
