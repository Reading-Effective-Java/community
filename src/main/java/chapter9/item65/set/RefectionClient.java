package chapter9.item65.set;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Set;

public class RefectionClient {

    public void run(Class<? extends Set<String>> cl, List<String> contents) {
        // 생성자를 얻는다.
        Constructor<? extends Set<String>> cons = null;
        try {
            cons = cl.getDeclaredConstructor();
        } catch (NoSuchMethodException e) {
            throw new FatalError("매개변수 없는 생성자를 찾을 수 없습니다.");
        }

        // 집합의 인스턴스를 만든다.
        Set<String> s = null;
        try {
            s = cons.newInstance();
        } catch (InvocationTargetException e) {
            throw new FatalError("생성자가 예외를 던졌습니다. = " + e.getCause());
        } catch (InstantiationException e) {
            throw new FatalError("클래스를 인스턴스화할 수 없습니다.");
        } catch (IllegalAccessException e) {
            throw new FatalError("생성자에 접근할 수 없습니다.");
        } catch (ClassCastException e) {
            throw new FatalError("Set을 구현하지 않은 클래스입니다.");
        }

        // 생성한 집합을 사용한다.
        s.addAll(contents);
        System.out.println(s);
    }
}
