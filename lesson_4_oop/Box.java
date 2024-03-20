import java.util.ArrayList;

public class Box<T extends Fruit>{

    private ArrayList<T> fruits;

    public Box(ArrayList<T> fruits){
        this.fruits = new ArrayList<>(fruits);
    }

    public float getWeight(){
        if(this.fruits.size() == 0) return 0.0f;
        else{
            return this.fruits.size() * this.fruits.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> b){
        return this.getWeight() == b.getWeight();
    }

    public void add(T fruit){
        this.fruits.add(fruit);
        System.out.println("В коробку добавлен новый фрукт");
    }

    public void pour(Box<T> b){
        b.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
