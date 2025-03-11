package machine;

class Display {

    static String menu(int watterAvailable, int milkAvailable, int coffeeBeansAvailable, int money, int disposableCups) {
        return "The coffee machine has:" + System.lineSeparator() +
                watterAvailable + " ml of water" + System.lineSeparator() +
                milkAvailable + " ml of milk" + System.lineSeparator() +
                coffeeBeansAvailable + " g of coffee beans" + System.lineSeparator() +
                disposableCups + " disposable cups" + System.lineSeparator() +
                "$" + money + " of money";
    }

    static String howManyCups() {
        return "Write how many cups of coffee you will need:";
    }

    static String ingredientYouNeed(int howManyCups, int watterYouNeed, int milkYouNeed, int coffeeYouNeed) {
        return "For " + howManyCups + " cups of coffee you will need:" + System.lineSeparator() +
                watterYouNeed + " ml of water" + System.lineSeparator() +
                milkYouNeed + " ml of milk" + System.lineSeparator() +
                coffeeYouNeed + " g of coffee beans";
    }

    static String exactNumberOfServing() {
        return "Yes, I can make that amount of coffee";
    }

    static String moreNumberOfServing(int nbServe) {
        return "Yes, I can make that amount of coffee (and even " + nbServe + " more than that)";
    }

    static String lessNumberOfServing(int cupAvailable) {
        return "No, I can make only " + cupAvailable + " cup(s) of coffee";
    }

    static String askAction() {
        return "Write action (buy, fill, take, clean, remaining, exit):";
    }

    static String take(int money) {
        return "I gave you $" + money;
    }

    static String checkingFalse(String ingredient) {
        return "Sorry, not enough " + ingredient + "!";
    }

}
