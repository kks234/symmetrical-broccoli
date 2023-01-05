package com.develop.ADsync.jpa.entity.sqlite;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "test")
public class SaveUser {
    @Id
//    @GeneratedValue(strategy=GenerationType.TABLE, generator = "MEMBER_SEQ_GENERATOR")
//    @TableGenerator(
//            name="MEMBER_SEQ_GENERATOR",
//            table="APP_SEQUENCE",
//            pkColumnName="sequence_name",
//            pkColumnValue="saveuser",
//            valueColumnName="next_val",
//            initialValue = 1,
//            allocationSize=50
//    )
    private Integer field2;

    @Column(name="field1")
    private String field1;
}
