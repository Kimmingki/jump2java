public class MethodSample {

    int a;      // 객체 변수 a

    void varTest() {
        this.a++;
    }

    int sum(int a, int b) {
        return a + b;
    }

    String say() {
        return "Hi";
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        MethodSample sample = new MethodSample();
        int c = sample.sum(a, b);

        String as = sample.say();

        System.out.println(c);
        System.out.println(as);

        sample.a = 1;
        sample.varTest();
        System.out.println(sample.a);
    }
}
