package SingleTon;

public class Observer {

    public static void main(String[] args) {
        User user = SharedPreference.getInstance("Tushita",21);
        System.out.println(user.getName());
        Administrator administrator = new Administrator();
        administrator.whoAmI();
    }
}
