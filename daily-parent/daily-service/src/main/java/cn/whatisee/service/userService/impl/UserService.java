package cn.whatisee.service.userService.impl;

import cn.whatisee.core.utils.MD5Utils;
import cn.whatisee.domain.User;
import cn.whatisee.mapper.user.UserMapper;
import cn.whatisee.service.Exception.user.ExistingUserExcepiton;
import cn.whatisee.service.Exception.user.NoExsitingUserException;
import cn.whatisee.service.Exception.user.PasswordErrorException;
import cn.whatisee.service.userService.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

/**
 * Created by ppc on 2016/1/5.
 */
public class UserService implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User addUser(User user) throws ExistingUserExcepiton {
        String id = UUID.randomUUID().toString();
        user.setId(id);
        User valiUser = userMapper.getUserByEmail(user.getEmail());
        if (valiUser == null) {
            userMapper.addUser(user);
            return user;
        } else {
            throw new ExistingUserExcepiton(valiUser);
        }
    }

    @Override
    public void changePassword(String email, String newPassword, String oldPassword) throws PasswordErrorException, NoExsitingUserException {


        User user = getUserByUserName(email);

        if (user.getPassword() == MD5Utils.MD5(oldPassword)) {
            user.setPassword(newPassword);
            userMapper.updateUser(user);
        } else {
            throw new PasswordErrorException(email);
        }
    }


    @Override
    public User getUserByUserName(String email) throws NoExsitingUserException {
        User user = userMapper.getUserByEmail(email);
        if (user != null) {
            return user;
        } else {
            throw new NoExsitingUserException(email);
        }
    }

    @Override
    public User getUserYbId(String id) throws NoExsitingUserException {
        User user = userMapper.getUser(id);
        if (user != null) {
            return user;
        } else {
            throw new NoExsitingUserException("");
        }
    }

    @Override
    public List<User> getUsersByIds(List<String> ids) {
        List<User> users = userMapper.getUsers(ids);
        return users;
    }
}
