public class BuilderPatternDemo {

  public static void main(String[] args) {
    MealBuilder mealBuilder = new MealBuilder();

    Meal vegMeal = mealBuilder.prepareVegMeal();
    System.out.println("Veg Meal");
    vegMeal.showItems();
    System.out.println("Total cost: " + vegMeal.getCost());

    Meal nonMegVeal = mealBuilder.prepareNonVegMeal();
    System.out.println("\n\nNon-Veg Meal");
    nonMegVeal.showItems();
    System.out.println("Total Cost: " + nonMegVeal.getCost());

  }

}
