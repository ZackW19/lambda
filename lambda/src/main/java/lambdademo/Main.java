package lambdademo;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,-3,0, -2, 10, -4);
        list.stream().
                filter(x -> x < 0 && x % 2 == 0)
                .forEach(s -> System.out.println(s));

        List<String> word = Arrays.asList("NewtoN", "PiWo", "KasOadA", "Kasia");

        //wypisac wszystkie slowa, ktore sa dluzsze niz 5,  z malych liter
        //map, filter - w jakiej kolejnosci najepiej
        word.stream()
                .filter(www -> www.length() > 5)
                .map(x -> x.toLowerCase())
                .forEach(s-> System.out.println(s));

    }
}