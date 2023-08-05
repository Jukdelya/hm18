package fourth;

public class Car {
    private int id;
    public Car(){

    }
    public Car(int id) {
        this.id = id;
    }
    public void ride(){
        System.out.println("еду");
    }
    public String toString(){
        return String.valueOf(id);
    }
}
