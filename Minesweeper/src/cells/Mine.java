package cells;

public class Mine extends Cell {
    private String status;
    private final String trueStatus = "X";

    public Mine() {
        winNumeration++;

    }


    @Override
    public void flagging() {
        status = status.equals("*") ? "." : "*";
        if (this.equals("*")) {
            winNumeration--;
        } else {
            winNumeration++;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
