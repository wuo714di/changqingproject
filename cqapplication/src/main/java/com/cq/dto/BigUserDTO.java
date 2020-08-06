package com.cq.dto;

import org.apache.commons.lang3.StringUtils;

public interface BigUserDTO {
    String getFlowerName();

    default String getUserName() {
        String flowerName = getFlowerName();
        return StringUtils.join("========",flowerName,".......................");

    }
}
