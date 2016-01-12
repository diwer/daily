package cn.whatisee.service.Exception.user;

import cn.whatisee.service.Exception.IExcepiton;

/**
 * Created by ppc on 2016/1/7.
 */
public class PasswordErrorException extends Exception implements IExcepiton {

    private String email;

    public PasswordErrorException(String email) {
        super(String.format("%s 密码错误", email));
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
