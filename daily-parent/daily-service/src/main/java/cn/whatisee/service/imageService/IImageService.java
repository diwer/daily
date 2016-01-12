package cn.whatisee.service.imageService;

import cn.whatisee.domain.Image;
import cn.whatisee.service.BaseService;

import java.util.List;

/**
 * Created by ppc on 2016/1/5.
 */
public interface IImageService extends BaseService {

    Image addImage(Image image);

    void delImage(Image image);

    void delImageTrue(Image image);

    void updateImage(Image image);

    Image getImage(String id);

    Image getImage(List<String> ids);
}
