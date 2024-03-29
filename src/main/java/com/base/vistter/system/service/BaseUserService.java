package com.base.vistter.system.service;


import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.service.BaseService;

import java.util.Map;

public interface BaseUserService extends BaseService {

    Map findByUserName(Map paramMap) throws PlatformException;

    void resetPwd(Map paramMap) throws PlatformException;

    void start(Map paramMap) throws PlatformException;

    void stop(Map paramMap) throws PlatformException;
}
