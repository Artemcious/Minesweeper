package cells;

public class Hint extends Cell {
    private String status;


    public Hint (int number) {
        status = number + "";
        final String trueStatus = status;
    }


    public String toString() {
        return status;
    }
}
