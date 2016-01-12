package cn.whatisee.service.userService;

import cn.whatisee.domain.User;
import cn.whatisee.service.BaseService;
import cn.whatisee.service.Exception.user.*;

import java.util.List;

/**
 * Created by ppc on 2016/1/5.
 */
public interface IUserService extends BaseService {

    User addUser(User user)throws ExistingUserExcepiton;

    void changePassword(String email, String newPassword, String oldPassword)throws PasswordErrorException,NoExsitingUserException;


    User getUserByUserName(String email)throws NoExsitingUserException;

    User getUserYbId(String id)throws NoExsitingUserException;

    List<User> getUsersByIds(List<String> ids);
}
