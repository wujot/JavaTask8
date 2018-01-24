public class NameArray {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Agata";
        names[1] = "Krystyna";
        names[2] = "Marcin";

        for(String name: names) {
            System.out.println(name);
        }
    }
}
