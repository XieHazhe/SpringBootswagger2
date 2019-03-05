/**
 * @Title: User
 * @ProjectName swagger2
 * @Description: TODO
 * @author 谢浩哲
 * @date 2019/3/420:57
 */

package com.zpark.swagger2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  implements Serializable {
    private Integer id;
    private String name;
}
