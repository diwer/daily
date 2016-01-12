import cn.whatisee.core.test.BaseTestCase;
import cn.whatisee.domain.Image;
import cn.whatisee.domain.ImageType;
import cn.whatisee.mapper.image.ImageMapper;
import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

/**
 * Created by ppc on 2016/1/5.
 */
public class ImageTest extends BaseTestCase {
    @Autowired
    private ImageMapper imageMapper;

    public void testImageMapper(){
        Image image =new Image();
        String id = UUID.randomUUID().toString();
        image.setId(id);
        image.setCreater("user");
        image.setCreateTime(new Date());
        image.setFileName("123");
        image.setFilePath("123");
        image.setFlagDesc("miaosu");
        image.setType(ImageType.Avatar.getCode());
        image.setOrderNo(1);
        image.setIsdelete(0);
        image.setUsedId("123");
        imageMapper.addImage(image);
        Image  image1=imageMapper.findImage(id);
        Assert.assertEquals(image1.getCreater(),"user");
        image.setFileName("321");
        imageMapper.updateImage(image);
        Image image2 =imageMapper.findImage(id);
        Assert.assertEquals("321",image2.getFileName());
    }
}
