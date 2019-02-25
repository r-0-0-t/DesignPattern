package SingleTon;

public class SharedPreference {
    private static User user;

    public static User getInstance(String name,int age) {
        if(user==null)
            user = new User(name,age);
        else
            user.update(name,age);
        return user;
    }

    public static User getInstance() {
        if(user==null)
            user = new User();
        return user;
    }
}
