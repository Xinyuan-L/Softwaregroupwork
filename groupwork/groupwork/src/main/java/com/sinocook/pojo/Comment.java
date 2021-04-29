package com.sinocook.pojo;

import lombok.Data;

@Data
public class Comment {
    int id;
    String nickname;
    String time;
    int likes;
    String details;
}
