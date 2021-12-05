package chapter9.item65.car;

import java.lang.reflect.Method;

public class CarMain {

    public static void main(String[] args) throws Exception {
        Object carObj = new Car("foo car", 0);
        // carObj.move(); -> 컴파일 에러 발생 !
        Class carClass = Car.class;

        Method move = carClass.getMethod("move");
        move.invoke(carObj, null); // Method.invoke(메서드 실행 객체, arguments)

        Method getPosition = carClass.getMethod("getPosition");
        int position = (int)getPosition.invoke(carObj, null);
        System.out.println("position = " + position); // expected output = 1
    }

}
