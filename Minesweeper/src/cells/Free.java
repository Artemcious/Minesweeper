package cells;

public class Free extends Cell {
    private String status;
    final private String trueStatus = "/";

    public Free () {
        status = trueStatus;
    }

    public String toString() {
        return status;
    }
}
