package chapter02.item02.issue03;

public abstract class ParentClass {

    abstract static class Builder<T extends Builder<T>> {

        abstract T introduce();

        abstract ParentClass build();
    }
}
