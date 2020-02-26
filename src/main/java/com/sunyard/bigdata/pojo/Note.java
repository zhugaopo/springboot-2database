package com.sunyard.bigdata.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Note {

    private int userId;

    private String userName;

    private String userAge;

}
