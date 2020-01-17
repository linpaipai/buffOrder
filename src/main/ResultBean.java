package com.imooc.security.core.authentication.mobile;

import java.util.List;
import java.util.Map;

/**
 * @author bravo
 * @date 2020-01-14 15:37
 */
public class ResultBean {


    /**
     * code : OK
     * data : {"goods_infos":{"aaa":"nbb"}}
     */

    private String code;
    private Map<String, List<Map<String, PojoBean>>> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Map<String, List<Map<String, PojoBean>>> getData() {
        return data;
    }

    public void setData(Map<String, List<Map<String, PojoBean>>> data) {
        this.data = data;
    }
}
