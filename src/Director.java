class Director {
    MealBuilderInterface mybuilder;

    public void construct(MealBuilderInterface builder){
        this.mybuilder = builder;
        mybuilder.buildBurger();
        mybuilder.buildDrink();
    }
}
