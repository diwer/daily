package cn.whatisee.mapper.daily;

import cn.whatisee.domain.Daily;

import java.util.List;

/**
 * Created by ppc on 2015/12/23.
 */
public interface DailyMapper {

    void addDaily(Daily daily);

    void updateDaily(Daily daily);

    void deleteDaily(String id);

    Daily findDaily(String id);

    List<Daily> findDailysByUserId(String id);

    List<Daily> findDailyById(String id);
}
