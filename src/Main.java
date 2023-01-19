public class Main {
    public static void main(String[] args) {

        createObject("iphone");
        System.out.println();
        createObject("samsung");
        System.out.println();
        createObject("xiaomi");

    }

    public static Object createObject(String className){
        switch (className){
            case "iphone":
                Iphone iphone = new Iphone("Iphone 14","Apple A 15 Bionic",6.1);
                iphone.print();
                break;
            case "samsung":
                Samsung samsung = new Samsung("Samsung Galaxy A73","Snapdragon 778G 5G",6.7);
                samsung.print();
                break;
            case "xiaomi":
                Xiaomi xiaomi = new Xiaomi("Xiaomi 12 Pro","Snapdragon 8 Gen 1",6.73);
                xiaomi.print();
                break;

        }
        return className;
    }
}