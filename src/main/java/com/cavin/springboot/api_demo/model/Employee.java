package com.cavin.springboot.api_demo.model;

import java.util.Date;
import javax.persistence.*;

public class Employee {
    /**
     * 自增长ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 员工所属部门Id
     */
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 员工姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 性别 0：男  1：女
     */
    private Integer sex;

    /**
     * 工龄
     */
    @Column(name = "work_year")
    private Integer workYear;

    /**
     * 头像url
     */
    @Column(name = "head_url")
    private String headUrl;

    /**
     * 在职状态：0-离职；1-在职；2-退休
     */
    private Integer status;

    /**
     * 创建时间
     */
    @Column(name = "creator_time")
    private Date creatorTime;

    /**
     * 创建人
     */
    @Column(name = "creator_Name")
    private String creatorName;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 更新人
     */
    @Column(name = "update_name")
    private String updateName;

    /**
     * 获取自增长ID
     *
     * @return id - 自增长ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置自增长ID
     *
     * @param id 自增长ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取员工所属部门Id
     *
     * @return department_id - 员工所属部门Id
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置员工所属部门Id
     *
     * @param departmentId 员工所属部门Id
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取员工姓名
     *
     * @return name - 员工姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置员工姓名
     *
     * @param name 员工姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取性别 0：男  1：女
     *
     * @return sex - 性别 0：男  1：女
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置性别 0：男  1：女
     *
     * @param sex 性别 0：男  1：女
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取工龄
     *
     * @return work_year - 工龄
     */
    public Integer getWorkYear() {
        return workYear;
    }

    /**
     * 设置工龄
     *
     * @param workYear 工龄
     */
    public void setWorkYear(Integer workYear) {
        this.workYear = workYear;
    }

    /**
     * 获取头像url
     *
     * @return head_url - 头像url
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * 设置头像url
     *
     * @param headUrl 头像url
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    /**
     * 获取在职状态：0-离职；1-在职；2-退休
     *
     * @return status - 在职状态：0-离职；1-在职；2-退休
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置在职状态：0-离职；1-在职；2-退休
     *
     * @param status 在职状态：0-离职；1-在职；2-退休
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return creator_time - 创建时间
     */
    public Date getCreatorTime() {
        return creatorTime;
    }

    /**
     * 设置创建时间
     *
     * @param creatorTime 创建时间
     */
    public void setCreatorTime(Date creatorTime) {
        this.creatorTime = creatorTime;
    }

    /**
     * 获取创建人
     *
     * @return creator_Name - 创建人
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 设置创建人
     *
     * @param creatorName 创建人
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取更新人
     *
     * @return update_name - 更新人
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 设置更新人
     *
     * @param updateName 更新人
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }
}