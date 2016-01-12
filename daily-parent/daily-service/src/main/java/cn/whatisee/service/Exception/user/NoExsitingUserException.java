package cn.whatisee.service.Exception.user;

import cn.whatisee.service.Exception.IExcepiton;

/**
 * Created by ppc on 2016/1/7.
 */
public class NoExsitingUserException extends Exception implements IExcepiton {

    private String email;
    public NoExsitingUserException(String email){
        super(String.format("%S 不存在该用户"));
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
