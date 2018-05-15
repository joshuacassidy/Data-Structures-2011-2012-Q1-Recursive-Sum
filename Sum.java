public class Sum {

    public int sum (int value) {
        return sum(value, 0, 0);
    }

    private int sum(int value, int index, int sum) {
        return index > value ? sum : sum(value, index+1, index+sum);
    }

}
