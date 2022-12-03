package cells;

public class Hint extends Cell {
    private String status;

    public Hint (int number) {
        status = number + "";
        final String trueStatus = status;
    }

    @Override
    public void flagging() {
        System.out.println("Here hint!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
