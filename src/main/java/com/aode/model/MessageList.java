package com.aode.model;

import org.hibernate.validator.constraints.Email;
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
    private String name; //姓名

    private String gender; // 性别

    private String phoneNumber; // 电话号码
    @Email
    @Length(max = 200)
    @Column(length = 200)
    private String email; // 电子邮件

    private String description; // 说明

    private String address;  //地址

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


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
