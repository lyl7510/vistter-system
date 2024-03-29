package com.base.vistter.system.mapper.impl;

import com.base.vistter.common.exception.PlatformException;
import com.base.vistter.common.mapper.impl.BaseMapperImpl;
import com.base.vistter.system.mapper.BaseRoleMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository("baseRoleMapperImpl")
public class BaseRoleMapperImpl extends BaseMapperImpl implements BaseRoleMapper {

    @Override
    protected String getNameSpace() {
        return "BaseRole";
    }

    public void start(Map paramMap) throws PlatformException {
        try {
            super.update("start" , paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void stop(Map paramMap) throws PlatformException{
        try {
            super.update("stop" , paramMap);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void deleteByProjectId(String projectId) throws PlatformException{
        try {
            super.delete("deleteByProjectId" , projectId);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }

    public void deleteByProjectIds(List projectIds) throws PlatformException{
        try {
            super.delete("deleteByProjectIds" , projectIds);
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new PlatformException();
        }
    }
}
