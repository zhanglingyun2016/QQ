package com.chat.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor  //使用后添加一个构造函数，该构造函数含有所有已声明字段属性参数
@NoArgsConstructor  //生成一个无参数的构造方法
@Data//get set
@Accessors(chain = true)  //chain的中文含义是链式的，设置为true，则setter方法返回当前对象
public class ChatFriends {
    private Integer id;

    private String userid;

    private String fuserid;

    private String nickname;

    private String uimg;
}