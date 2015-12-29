package cn.whatisee.core.test;

import org.springframework.test.AbstractDependencyInjectionSpringContextTests;



/**
 * Created by ppc on 2015/12/24.
 */
public class BaseTestCase extends AbstractDependencyInjectionSpringContextTests {

    protected String[] getConfigLocations() {
        //setAutowireMode(AUTOWIRE_BY_NAME);
        return new String[]{
                "classpath:/applicationContext-test.xml"
        };
    }

    public void test(){
//        StringUtils.is
//        cacheUtil.cleanByKey("brand:no:16777");
//        cacheUtil.brandCacheClean();
    }
}
