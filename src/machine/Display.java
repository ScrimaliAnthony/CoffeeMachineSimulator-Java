package machine;

class Display {

    static String menu() {

        return "Starting to make a coffee" + System.lineSeparator() +
                "Grinding coffee beans" + System.lineSeparator() +
                "Boiling water" + System.lineSeparator() +
                "Mixing boiled water with crushed coffee beans" + System.lineSeparator() +
                "Pouring coffee into the cup" + System.lineSeparator() +
                "Pouring some milk into the cup" + System.lineSeparator() +
                "Coffee is ready!";
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
}
