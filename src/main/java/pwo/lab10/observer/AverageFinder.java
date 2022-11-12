package pwo.lab10.observer;

public class AverageFinder implements Publisher.Subscriber {

    private Float sum = null;
    private Integer count = 0;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
        count++;

    }

    public float getAverage() {
        return sum / count;
    }

}
