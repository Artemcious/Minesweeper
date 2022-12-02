package cells;

public class Hint extends Cell {
    String count;

    Hint () {

    }

    public void setCount(int number) {
        count = number + "";
    }
    public String toString() {
        return count;
    }
}
