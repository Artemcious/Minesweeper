package cells;

public class Cell {
    private String status;
    private final String trueStatus = ".";
    public static int winNumeration;

    public Cell() {
        status = trueStatus;
    }

    public void flagging() {
        status = status.equals("*") ? trueStatus : "*";
        if (this.equals("*")) {
            winNumeration++;
        } else {
            winNumeration--;
        }
    }

    public String toString() {
        return status;
    }

}
