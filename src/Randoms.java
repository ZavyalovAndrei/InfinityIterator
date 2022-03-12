import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int min;
    int max;
    int index = 0;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Randoms getRandom() {
        iterator().next();
        return this;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int result = random.nextInt(min, max + 1);
                index++;
                return result;
            }
        };
    }
}