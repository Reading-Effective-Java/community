package chapter04.item18;

public class test {
    public static void main(String[] args) {
        SomeService   service       = new SomeService();
        WrappedObject wrappedObject = new WrappedObject(service);
        Wrapper wrapper       = new Wrapper(wrappedObject);

        wrapper.doSomething();
    }
}
