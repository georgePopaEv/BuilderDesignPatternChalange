import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items;

    public Meal(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void showItems(){
        System.out.println("We have for this meal follow : \n");
        for ( Item it: items) {
            System.out.println(it.name() +" care are un pret de " + it.price());
        }
    }

    public float getCost(){
        float cost = 0.0f;
        for(Item item : items){
            cost += item.price();
        }
        return cost;
    }
}
