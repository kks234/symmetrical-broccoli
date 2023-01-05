package com.develop.ADsync.jpa.entity.tibero;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "TEST")
public class UserTest {
    @Id
//    @GeneratedValue(strategy=GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
//    @TableGenerator(
//            name="MEMBER_SEQ_GENERATOR",
//            table="APP_SEQUENCE",
//            pkColumnName="sequence_name",
//            pkColumnValue="UserTest",
//            valueColumnName="next_val",
//            initialValue = 1,
//            allocationSize=50
//    )
    private Integer id;

    @Column(name = "content")
    private String content;

}
