package chapter9.item64;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AdaptorTest {

    @DisplayName("인터페이스 참조 테스트 (일반적인 상황)")
    @Test
    void test1() throws Exception {
        // Given 1
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // When 1
        List<Integer> expected = List.of(100, 200, 300, 400, 500);
        List<Integer> actual1 = new ArrayList<>(set);

        // Then 1
        assertEquals(expected, actual1);

        // When 2
        set = new LinkedHashSet<>(set);
        final List<Integer> actual2 = new ArrayList<>(set);

        // Then 2
        assertEquals(expected, actual2);
    }

    @DisplayName("인터페이스 참조 테스트 (예외적인 상황)")
    @Test
    void test2() throws Exception {
        // Given 1
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(200);
        set.add(300);
        set.add(400);
        set.add(500);

        // When 1
        List<Integer> expected = List.of(100, 200, 300, 400, 500);
        List<Integer> actual1 = new ArrayList<>(set);

        // Then 1
        assertEquals(expected, actual1);

        // When 2
        set = new HashSet<>(set);
        final List<Integer> actual2 = new ArrayList<>(set);

        // Then 2
        assertNotEquals(expected, actual2);
    }

}
