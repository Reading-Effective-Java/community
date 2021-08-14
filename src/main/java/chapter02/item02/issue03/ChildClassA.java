package chapter02.item02.issue03;

public class ChildClassA extends ParentClass {

    public static class Builder extends ParentClass.Builder<Builder> {

        public Builder() {
            System.out.println("ChildClass A는 생성자를 따로 정의했습니다.");
        }

        @Override
        Builder introduce() {
            System.out.println("ChildClass A -> Builder");
            return this;
        }

        @Override
        ChildClassA build() {
            return new ChildClassA();
        }
    }
}
