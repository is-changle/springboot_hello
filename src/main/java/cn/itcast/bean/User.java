package cn.itcast.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

/**
 * @author cl
 * @createTime 2021-06-22
 * @desc
 */

@Data       // 使用lombook增加各种重复代码get/set..
@Entity    //表示当前类的实体类
@JsonIgnoreProperties({"hibernateLazyInitializer\",\"handler"})//转json
public class User {
    @Id //表示id为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //表示主键生成策略使用数据库自增
    private long id;
   // @Column(name="username")
    private String username;
    private String password;
    private String nickname;

}
