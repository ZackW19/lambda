package simpledemo1;

//File->Settings->Build,Excecutions...->Java Compiler ustawic na 1.8 dla lambdy
//File->Project Structure->Modules ustawić na 8

@FunctionalInterface  //potrzebne do lambdy, w/w prarametry potrzebne dla lambdy!
interface FunctInterface{
    String h(String w1, String w2);
}

public class Main {

    //funkcja ktora jako argument przyjmuje wyrażenie lambda zgodne z interfejsem FunctIterface
    private static String fun(FunctInterface fi) {
        //do napisu wynikowego dodajemy wynik wywolania wyrazenia lambda
        String result = "joined strings: " + fi.h("abc", "ghi");
        return result;
    }

    public static void main(String[] args) {
        //można tak
        //FunctInterface fi = (a, b) -> a + ", " + b;
        //System.out.println(fi.h("test1", "niesporczak"));

        //lub tak, krotsza.
        System.out.println(fun((a, b) -> a + ", " +b));

    }

}
