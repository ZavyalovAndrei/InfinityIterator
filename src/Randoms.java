import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private List<Integer> list = new ArrayList<>();
    int min;
    int max;
    int index = 0;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public Randoms addToList() {
        list.add(iterator().next());
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