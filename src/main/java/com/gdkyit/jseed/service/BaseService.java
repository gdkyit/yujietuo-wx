package com.gdkyit.jseed.service;

import com.gdkyit.jseed.dao.BaseDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class BaseService {

    @Resource
    private BaseDao basedao;

    public List<Map<String, Object>> getDblist() {
        return basedao.getDblist();
    }

}
