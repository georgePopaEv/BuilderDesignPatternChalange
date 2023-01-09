
interface Item {
    public String name();
    public Packing packing();
    public float price();
}

abstract class Burger implements Item{
    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}

class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}

class ChickenBurger extends Burger{

    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 4.5f;
    }
}

abstract class ColdDrink implements Item{
    @Override
    public Packing packing(){
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class Pepsi extends ColdDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 1.5f;
    }
}

class Coke extends ColdDrink{

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 1.75f;
    }
}

interface Packing {
    public String pack();
}

class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements Packing{

    @Override
    public String pack() {
        return "Bottle";
    }
}