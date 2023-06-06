package org.people.platform.service.impl;

import org.people.platform.model.FieldDefinitionModel;
import org.people.platform.service.FieldDefinitionService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaoyunxing
 * @date 2023-06-06 23:14
 */
@Service
public class FieldDefinitionServiceImpl implements FieldDefinitionService {

    @Override
    public List<FieldDefinitionModel> getFieldDefinitions(String table) {
        List<FieldDefinitionModel> definitions = new ArrayList<>();

        FieldDefinitionModel def = new FieldDefinitionModel();

        def.setId("12weww");
        def.setName("姓名");
        def.setAlias("name");
        def.setAlias("name");
        def.setRequired(true);
        def.setValueRange(new FieldDefinitionModel.ValueRange(10, 30));

        definitions.add(def);
        return definitions;
    }
}
