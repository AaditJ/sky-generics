// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        GenericDictionary<Integer,String> gd = new GenericDictionary<>();

        gd.store(5,"hi");

        System.out.println(gd.get(5));
        System.out.println(gd.getKeys());
        System.out.println(gd.getValues());
    }
}