package com.github.springeurekatudy.test;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author liuyuhu
 * @date 2018/4/19 上午10:29
 */

@Data
@Accessors(chain = true)
public class User {

    private String userName;

    private String userCompany;
}
