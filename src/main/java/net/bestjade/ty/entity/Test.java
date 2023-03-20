package net.bestjade.ty.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    @TableField
    private String name;

    @TableField
    private Integer age;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @TableField
    private Date birthday;

}
