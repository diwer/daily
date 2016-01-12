package cn.whatisee.service.Exception.user;

import cn.whatisee.domain.User;
import cn.whatisee.service.Exception.IExcepiton;

/**
 * Created by ppc on 2016/1/7.
 */
public class ExistingUserExcepiton extends Exception implements IExcepiton {

    private User user;



    public ExistingUserExcepiton(User user){
        super(String.format("%s 已经存在，请更换邮箱注册"));
        this.user=user;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
