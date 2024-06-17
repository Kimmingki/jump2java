public class UpdateSample {

    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("Before update: " + myCounter.count);

        Updater myUpdater = new Updater();
        myUpdater.update(myCounter);
        System.out.println("After update: " + myCounter.count);
    }
}

class Updater {

    void update(Counter counter) {
        counter.count++;
    }
}

class Counter {

    int count = 0;      // 객체변수
}
