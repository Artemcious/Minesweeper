package cells;

// type of Cell: 1 = Free, 2 = Hint, 3 = Mine

public class Cell {
    String status;

    public Cell() {
        status = ".";
    }

    public String toString() {
        return status;
    }

}
