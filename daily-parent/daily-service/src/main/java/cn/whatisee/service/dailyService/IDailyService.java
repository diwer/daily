package cn.whatisee.service.dailyService;

import cn.whatisee.domain.Daily;
import cn.whatisee.service.BaseService;

import java.util.List;

/**
 * Created by ppc on 2016/1/5.
 */
public interface IDailyService extends BaseService {
    Daily addDaily(Daily daily);

    void updateDaily(Daily daily);

    void delDaily(Daily daily);

    Daily getDaily(String id);

    List<Daily> getDailys(String userId);

    List<Daily> getDailys(List<String> ids);
}
