package org.people.platform.service;

import org.people.platform.model.FieldDefinitionModel;

import java.util.List;

/**
 * @author zhaoyunxing
 * @date 2023-06-06 23:14
 */
public interface FieldDefinitionService {

    /**
     * 获取字段定义
     *
     * @param table 表编码
     * @return 字段定义
     */
    List<FieldDefinitionModel> getFieldDefinitions(String table);
}
