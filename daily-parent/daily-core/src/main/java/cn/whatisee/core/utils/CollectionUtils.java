package cn.whatisee.core.utils;

import java.util.Collection;
import java.util.List;

/**
 * Created by ppc on 2016/1/7.
 */
public class CollectionUtils {
    public static boolean IsNullOrEmpty(Collection collection){

        if(collection==null)
            return true;
        if(collection.isEmpty())
            return true;
        return false;
    }
    public static boolean IsNotNullOrEmpty(Collection collection){

        if(collection!=null&&!collection.isEmpty())
            return true;

        return false;
    }
}
