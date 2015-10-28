package com.aode.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

/**
 * Created by 黄柏樟 on 2015/10/28.
 * @Explain: 通讯录实体类
 */
@Entity
@Table(name="message_list")
public class MessageList {
    @Id
    @GeneratedValue
    private Long id;
    @Pattern(regexp = "^[0-9a-z_A-Z\\u4e00-\\u9fa5]+$")
    @Length(max = 50)
    @Column(length = 50)
    private String name; // 通讯录拥有者的账户名

/*    @OneToMany(mappedBy = "messageList",cascade = { CascadeType.ALL },fetch=FetchType.EAGER)
    private List<Member> member = new ArrayList<Member>();   //一个通讯录对应多个校友*/


    private double number; // 通讯录的人数



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    public List<Member> getMember() {
        return member;
    }

    public void setMember(List<Member> member) {
        this.member = member;
    }*/

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
