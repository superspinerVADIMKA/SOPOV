import java.util.ArrayList;

public class Aministrator {
    static String name;
    static String surname;
    static int phone;
    static String name_cl;
    static int phone_cl;
    static int room;

    public void AddZapis(String name, String name_cl, int phone_cl, int room, ArrayList<Aministrator> Zapis){
        Aministrator aministrator = new Aministrator();
        Aministrator.setName(name);
        Aministrator.setName_cl(name_cl);
        Aministrator.setPhone_cl(phone_cl);
        Aministrator.setRoom(room);
        Zapis.add(aministrator);

    }

    public static int getPhone_cl() {
        return phone_cl;
    }

    public static void setPhone_cl(int phone_cl) {
        Aministrator.phone_cl = phone_cl;
    }

    public static void setRoom(int room) {
        Aministrator.room = room;
    }

    public static int getRoom() {
        return room;
    }

    public static String getSurname() {
        return surname;
    }

    public static String getName_cl() {
        return name_cl;
    }

    public static void setName_cl(String name_cl) {
        Aministrator.name_cl = name_cl;
    }

    public static void setSurname(String surname) {
        Aministrator.surname = surname;
    }

    public static void setPhone(int phone) {
        Aministrator.phone = phone;
    }

    public static int getPhone() {
        return phone;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Aministrator.name = name;
    }
}
