package cells;

public class Mine extends Cell {
    private String status;
    private final String trueStatus = "X";
    public Mine () {
        status = trueStatus;
    }

    public String toString() {
        return status;
    }
}
