package chapter9.item65.set;

import java.util.List;
import java.util.Set;

public class ReflectionMain {

    private static final String treeSet = "java.util.TreeSet";
    private static final List<String> contents = List.of("BBC", "AAA", "CBA", "ABC", "ZZZ");

    public static void main(String[] args) {
        // 클래스 이름을 Class 객체로 변환
        Class<? extends Set<String>> cl = null;
        try {
            cl = (Class<? extends Set<String>>) Class.forName(treeSet); // 비검사 형번환
        } catch (ClassNotFoundException e) {
            throw new FatalError("클래스를 찾을 수 없습니다.");
        }

        final RefectionClient refectionClient = new RefectionClient();
        refectionClient.run(cl, contents);
    }
}
