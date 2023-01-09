public class Client {
    public static void main(String[] args) {
        System.out.println("***Meal Pattern Demo***");

        Director director = new Director();

        MealBuilderInterface vegMealBuilder = new VegMealBuilder();
        MealBuilderInterface nonVegBuilder = new NonVegMealBuilder();

        //making veg meal
        director.construct(vegMealBuilder);
        Meal vegMeal = vegMealBuilder.getMeal();

        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        //making non veg meal
        director.construct(nonVegBuilder); // now in nonVegBuilder s-a construit deja a noastra masa si trebuie doar returnata catre o instanta de tip Meal
        Meal nonVegMeal = nonVegBuilder.getMeal();
        System.out.println("NonVegetarian Meal");
        nonVegMeal.showItems();
        System.out.println("Total cost: " + nonVegMeal.getCost());

    }
}
