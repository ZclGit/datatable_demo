import com.example.entity.User;
import com.example.service.impl.ActionServiceImpl;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ActionServiceImpl actionService = new ActionServiceImpl();

        List<User> info = actionService.getInfo();

        info.forEach(user-> System.out.println(user.toString()));
    }
}
