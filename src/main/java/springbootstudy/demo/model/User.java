package springbootstudy.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User{

    // 如果表中不存在的属性
    @TableField(exist = false)
    private String userName;

    @TableField(exist = false)
    private String password;

    // 下面是数据库字段
    @TableId("id")
    private Long id;
    private String name;
    private Integer age;
    private String email;
//    private Long money;
}
