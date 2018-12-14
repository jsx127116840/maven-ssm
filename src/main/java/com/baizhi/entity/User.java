package com.baizhi.entity;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sm_user")
public class User {
        @Id
        @KeySql(sql = "select sm_user_seq.nextval from dual", order = ORDER.BEFORE)
        String username;
        String password;

}
