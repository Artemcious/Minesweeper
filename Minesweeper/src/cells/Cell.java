package cells;

// type of Cell: 1 = Free, 2 = Hint, 3 = Mine

import java.util.Objects;

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
