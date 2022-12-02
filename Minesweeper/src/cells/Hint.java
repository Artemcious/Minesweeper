package cells;

public class Hint extends Cell {
    String status;

    public Hint () {

    }

    public void setStatus(int number) {
        status = number + "";
    }
    public String toString() {
        return status;
    }
}
