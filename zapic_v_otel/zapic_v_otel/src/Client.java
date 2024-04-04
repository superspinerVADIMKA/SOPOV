public class Client {
    static String name_cl;
    static String surname_cl;
    static int phone_cl;

    public static void setName(String name) {
        Client.name_cl = name;
    }

    public static String getName() {
        return name_cl;
    }

    public static int getPhone() {
        return phone_cl;
    }

    public static void setPhone(int phone) {
        Client.phone_cl = phone;
    }

    public static String getSurname() {
        return surname_cl;
    }

    public static void setSurname(String surname) {
        Client.surname_cl = surname;
    }
}
