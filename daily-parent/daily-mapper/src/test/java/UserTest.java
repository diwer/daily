import cn.whatisee.core.test.BaseTestCase;
import cn.whatisee.core.utils.MD5Utils;
import cn.whatisee.domain.User;
import cn.whatisee.mapper.user.UserMapper;
import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ppc on 2016/1/5.
 */
public class UserTest extends BaseTestCase {

    @Autowired
    private UserMapper userMapper;

    public void testuserMapper() {

        User user = new User();
        String id = UUID.randomUUID().toString();
        user.setId(id);
        user.setUsername("test");
        user.setPassword(MD5Utils.MD5("test"));
        user.setCreatetime(new Date());
        user.setLastlogintime(new Date());
        userMapper.addUser(user);

        User getuser = userMapper.getUser(id);

        Assert.assertNotNull(getuser);
        Assert.assertEquals(id, getuser.getId());
        user.setPassword(MD5Utils.MD5("123"));
        userMapper.updateUser(user);
        User getuser2 = userMapper.getUser(id);
        Assert.assertEquals("123", getuser2.getPassword());
    }
}
