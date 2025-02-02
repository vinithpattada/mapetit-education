package com.mindinc.edu.rest.beckn.enums;

import java.util.HashMap;
import java.util.Map;

public enum ErrorCode {

    INVALID_REQUEST_ERROR("30000"),
    PROVIDER_NOT_FOUND("30001"),
    PROVIDER_CATEGORY_NOT_FOUND("30003"),
    ITEM_NOT_FOUND("30004"),
    CATEGORY_NOT_FOUND("30005"),
    ORDER_NOT_FOUND("30010"),
    BUSINESS_ERROR("40000"),
    ACTION_NOT_APPLICABLE("40001");

    public static final Map<String, String> ERRORCODE = new HashMap<String, String>();

    static {
        for (ErrorCode s : values()) {
            ERRORCODE.put(s.value, s.name());
        }
    }

    private final String value;

    ErrorCode(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}