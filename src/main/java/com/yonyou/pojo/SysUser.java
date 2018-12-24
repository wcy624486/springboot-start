package com.yonyou.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_user")
public class SysUser {
    /**
     * 自增ID
     */
    private String aid;

    /**
     * 用户ID
     */
    private String userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 性别code
     */
    private Integer sexcode;

    /**
     * 类型
     */
    private String usertype;

    /**
     * 手机号
     */
    private String mobilephone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 密码
     */
    private String password;

    /**
     * 到期时间
     */
    private Date duedate;

    /**
     * 最近登录IP
     */
    private String lastip;

    /**
     * 最近登录时间
     */
    private Date lastlogintime;

    /**
     * 最近更新时间
     */
    private Date lastupdate;

    /**
     * 创建时间
     */
    private Date createtime;

    /**
     * 获取自增ID
     *
     * @return aid - 自增ID
     */
    public String getAid() {
        return aid;
    }

    /**
     * 设置自增ID
     *
     * @param aid 自增ID
     */
    public void setAid(String aid) {
        this.aid = aid;
    }

    /**
     * 获取用户ID
     *
     * @return userid - 用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取性别code
     *
     * @return sexcode - 性别code
     */
    public Integer getSexcode() {
        return sexcode;
    }

    /**
     * 设置性别code
     *
     * @param sexcode 性别code
     */
    public void setSexcode(Integer sexcode) {
        this.sexcode = sexcode;
    }

    /**
     * 获取类型
     *
     * @return usertype - 类型
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * 设置类型
     *
     * @param usertype 类型
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * 获取手机号
     *
     * @return mobilephone - 手机号
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * 设置手机号
     *
     * @param mobilephone 手机号
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * 获取邮箱
     *
     * @return mail - 邮箱
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱
     *
     * @param mail 邮箱
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取到期时间
     *
     * @return duedate - 到期时间
     */
    public Date getDuedate() {
        return duedate;
    }

    /**
     * 设置到期时间
     *
     * @param duedate 到期时间
     */
    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }

    /**
     * 获取最近登录IP
     *
     * @return lastip - 最近登录IP
     */
    public String getLastip() {
        return lastip;
    }

    /**
     * 设置最近登录IP
     *
     * @param lastip 最近登录IP
     */
    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    /**
     * 获取最近登录时间
     *
     * @return lastlogintime - 最近登录时间
     */
    public Date getLastlogintime() {
        return lastlogintime;
    }

    /**
     * 设置最近登录时间
     *
     * @param lastlogintime 最近登录时间
     */
    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * 获取最近更新时间
     *
     * @return lastupdate - 最近更新时间
     */
    public Date getLastupdate() {
        return lastupdate;
    }

    /**
     * 设置最近更新时间
     *
     * @param lastupdate 最近更新时间
     */
    public void setLastupdate(Date lastupdate) {
        this.lastupdate = lastupdate;
    }

    /**
     * 获取创建时间
     *
     * @return createtime - 创建时间
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * 设置创建时间
     *
     * @param createtime 创建时间
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}