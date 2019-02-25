package SingleTon;

public class Administrator {
    void whoAmI()
    {
        User user = SharedPreference.getInstance();
        System.out.println(user.getName());
    }
}
