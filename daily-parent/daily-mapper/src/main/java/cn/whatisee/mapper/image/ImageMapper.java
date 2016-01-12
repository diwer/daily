package cn.whatisee.mapper.image;

import cn.whatisee.domain.Image;

import java.util.List;

/**
 * Created by ppc on 2015/12/23.
 */

public interface ImageMapper {

    void addImage(Image image);

    void delImage(String id);

    void updateImage(Image image);

    List<Image> findImages(List<String> ids);

    Image findImage(String id);

}
