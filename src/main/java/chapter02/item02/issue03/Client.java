package chapter02.item02.issue03;

public class Client {

    public static void main(String[] args) {
        ChildClassA objA = new ChildClassA.Builder()
                .introduce()
                .build();

        ChildClassB objB = new ChildClassB.Builder()
                .introduce()
                .build();
    }

}
