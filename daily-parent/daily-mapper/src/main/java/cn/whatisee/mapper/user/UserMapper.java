package cn.whatisee.mapper.user;

import cn.whatisee.domain.User;

import java.util.List;

/**
 * Created by ppc on 2015/12/23.
 */
public interface UserMapper {
    void addUser(User user);

    void updateUser(User user);

    void delUser(String id);

    List<User> getUsers(List<String> ids);

    User getUser(String id);

    User getUserByEmail(String email);
}
