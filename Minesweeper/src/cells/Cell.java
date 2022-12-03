package cells;

public class Cell {
    private String status;
    private final String trueStatus = ".";

    public Cell() {
        status = trueStatus;
    }

    public void flagging() {
        status = status.equals("*") ? trueStatus : "*";
    }

    public String toString() {
        return status;
    }

}
