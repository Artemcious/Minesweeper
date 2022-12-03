package cells;

public class Free extends Cell {
    private String status;
    final private String trueStatus = "/";

    public Free() {
        super();
    }

    @Override
    public void flagging() {
        System.out.println("Here free space!");

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
