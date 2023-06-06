package org.people.platform.ctrl.v1.setting;

import lombok.RequiredArgsConstructor;
import org.people.platform.model.FieldDefinitionModel;
import org.people.platform.service.FieldDefinitionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhaoyunxing
 * @date 2023-06-06 23:35
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/people/api/v1/setting")
public class SettingController {

    private final FieldDefinitionService fieldDefinitionService;

    /**
     * 表字段
     *
     * @param table 表id
     * @return 字段定义
     */
    @GetMapping("/table/{table}/fields")
    public List<FieldDefinitionModel> getFieldDefinitions(@PathVariable(name = "table") String table) {
        return fieldDefinitionService.getFieldDefinitions(table);
    }
}
