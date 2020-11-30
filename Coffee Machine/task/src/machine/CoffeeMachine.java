package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400, 540, 120, 9, 550);
        coffeeMachine.go();
    }

    public CoffeeMachine(int water, int milk, int coffeeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    void printNumberOfIngredients() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.coffeeBeans + " of coffee beans");
        System.out.println(this.disposableCups + " of disposable cups");
        System.out.println(this.money + " of money\n");
    }

    boolean hasEnoughIngredients(int choice) {
        boolean bool = true;
        switch (choice) {
            case 1:
                if (this.water < 250) {
                    System.out.println("Sorry, not enough water!");
                    bool = false;
                } else if (this.coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    bool = false;
                } else if (this.disposableCups < 1) {
                    System.out.println("Sorry, not enough coffee disposable cups!");
                    bool = false;
                }
            case 2:
                if (this.water < 350) {
                    System.out.println("Sorry, not enough water!");
                    bool = false;
                } else if (this.milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    bool = false;
                } else if (this.coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    bool = false;
                } else if (this.disposableCups < 1) {
                    System.out.println("Sorry, not enough coffee disposable cups!");
                    bool = false;
                }
            case 3:
                if (this.water < 200) {
                    System.out.println("Sorry, not enough water!");
                    bool = false;
                } else if (this.milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    bool = false;
                } else if (this.coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    bool = false;
                } else if (this.disposableCups < 1) {
                    System.out.println("Sorry, not enough coffee disposable cups!");
                    bool = false;
                }
        }
        return bool;
    }

    void go() {
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        while(running) {
            System.out.println("Write action (buy, fill, take, exit):");
            String ch = sc.next();
            switch (ch) {
                case "buy":
                    System.out.println("\n\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    switch (sc.next()) {
                        case "1":
                            if(hasEnoughIngredients(1)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                this.water = this.water - 250;
                                this.coffeeBeans -= 16;
                                this.disposableCups--;
                                this.money += 4;
                            }
                            break;
                        case "2":
                            if(hasEnoughIngredients(2)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                this.water = this.water - 350;
                                this.milk -= 75;
                                this.coffeeBeans -= 20;
                                this.disposableCups--;
                                this.money += 7;
                            }
                            break;
                        case "3":
                            if(hasEnoughIngredients(3)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                this.water = this.water - 200;
                                this.milk -= 100;
                                this.coffeeBeans -= 12;
                                this.disposableCups--;
                                this.money += 6;
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    System.out.println("Write how many ml of water do you want to add:");
                    this.water += sc.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    this.milk += sc.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    this.coffeeBeans += sc.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    this.disposableCups += sc.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + this.money);
                    this.money = 0;
                    break;
                case "remaining":
                    printNumberOfIngredients();
                    break;
                case "exit":
                    running = false;
            }
        }
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
