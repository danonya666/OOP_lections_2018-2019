import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        Integer number = 15;
        XmlValue<Integer> value = new XmlValue<>(number, Integer.class);
        System.out.println(value.toString());
        Number number1 = 5;
        XmlValue<Number> number_value = new XmlValue<>(number1, Number.class); // второрй аргумент конструктора даёт компилятору знать, какой у нас класс
        System.out.println(number_value.toString()); // работает не так, как читал лектор...

        List<Integer> intList = new ArrayList(3);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        ListProcessor lp = new ListProcessor(1);
        System.out.println(lp.getMajorValue(intList));

        System.out.println(lp.compare(intList, 1));
    }
}
