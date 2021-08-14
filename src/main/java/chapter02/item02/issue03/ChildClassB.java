package chapter02.item02.issue03;

public class ChildClassB extends ParentClass {

    public static class Builder extends ParentClass.Builder<Builder> {

        @Override
        Builder introduce() {
            System.out.println("ChildClass B -> Builder");
            return this;
        }

        @Override
        ChildClassB build() {
            return new ChildClassB();
        }
    }
}
