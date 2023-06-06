package org.people.platform.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zhaoyunxing
 * @date 2023-06-06 22:56
 */
@Getter
@Setter
public class FieldDefinitionModel {

    private String id;

    /**
     * 字段名称
     */
    private String name;

    /**
     * 别名
     */
    private String alias;

    /**
     * 图标
     */
    private String icon;

    /**
     * 字段类型
     */
    private String type;

    /**
     * 描述
     */
    private String desc;

    /**
     * 是否必填
     */
    private boolean required;

    /**
     * 取值范围
     */
    private  ValueRange valueRange;

    /**
     * 提示文案
     */
    private String placeholder;

    public record ValueRange(Object min,Object max){

    }
}
