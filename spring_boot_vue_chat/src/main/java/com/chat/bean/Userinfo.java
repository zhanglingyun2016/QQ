package com.chat.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Userinfo {  //用户信息
    private Integer uid;
    private String nickname;
    private String usign;
    private String userid;
    private String uimg;
}
