package fourth;

public class Motor extends Car{
    private int id;
    public Motor(int id) {
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }
}