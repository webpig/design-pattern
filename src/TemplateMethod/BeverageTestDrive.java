package TemplateMethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
