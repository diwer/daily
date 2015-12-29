import cn.whatisee.domain.Daily;
import cn.whatisee.mapper.daily.DailyMapper;

import junit.framework.Assert;
import junit.framework.Test;

import org.springframework.beans.factory.annotation.Autowired;
import cn.whatisee.core.test.BaseTestCase;

import java.util.UUID;

/**
 * Created by ppc on 2015/12/24.
 */

public class DailyTest extends BaseTestCase {

    @Autowired
    private DailyMapper dailyMapper;

    public void testdailyMapper() {

        Daily daily = new Daily();
        String id = UUID.randomUUID().toString();
        daily.setId(id);
        daily.setUserid("123");
        daily.setContent("123");
        dailyMapper.addDaily(daily);

        daily = dailyMapper.findDaily(id);
        Assert.assertNotNull(daily);
        Assert.assertEquals(id, daily.getId());
    }
}
