package com.cq.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author changqing
 * @date 2020-07-02 11:46
 * @description:
 */
@Data
public class UserDTO implements BigUserDTO {
    private String name;
    private Integer age;
    //花名
    private String FlowerName;
    public void setIsPublicStatus(Boolean boo){
        if (boo){
            age=0;
        }else {
            age=1;
        }
        //  return isSubmitPublic;
    }
}
