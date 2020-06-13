package com.huice.model.old;

import java.util.Date;

public class OldUserDetail {
    private Integer id;

    private Integer userId;

    private Integer shopId;

    private String username;

    private String sex;

    private Integer birthdayYear;

    private Integer birthdayMonth;

    private Integer birthdayDay;

    private String email;

    private String realName;

    private Integer provinceCode;

    private Integer cityCode;

    private Integer districtCode;

    private String address;

    private Boolean maritalStatus;

    private Integer monthlyIncome;

    private String cid;

    private Boolean education;

    private Boolean industryInfo;

    private String bigImage;

    private String bankUserName;

    private String shopBank;

    private String bankNo;

    private String withdrawPasswd;

    private String userAvatar;

    private Date createTime;

    private Date updateTime;

    public OldUserDetail(Integer id, Integer userId, Integer shopId, String username, String sex, Integer birthdayYear, Integer birthdayMonth, Integer birthdayDay, String email, String realName, Integer provinceCode, Integer cityCode, Integer districtCode, String address, Boolean maritalStatus, Integer monthlyIncome, String cid, Boolean education, Boolean industryInfo, String bigImage, String bankUserName, String shopBank, String bankNo, String withdrawPasswd, String userAvatar, Date createTime, Date updateTime) {
        this.id = id;
        this.userId = userId;
        this.shopId = shopId;
        this.username = username;
        this.sex = sex;
        this.birthdayYear = birthdayYear;
        this.birthdayMonth = birthdayMonth;
        this.birthdayDay = birthdayDay;
        this.email = email;
        this.realName = realName;
        this.provinceCode = provinceCode;
        this.cityCode = cityCode;
        this.districtCode = districtCode;
        this.address = address;
        this.maritalStatus = maritalStatus;
        this.monthlyIncome = monthlyIncome;
        this.cid = cid;
        this.education = education;
        this.industryInfo = industryInfo;
        this.bigImage = bigImage;
        this.bankUserName = bankUserName;
        this.shopBank = shopBank;
        this.bankNo = bankNo;
        this.withdrawPasswd = withdrawPasswd;
        this.userAvatar = userAvatar;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OldUserDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getBirthdayYear() {
        return birthdayYear;
    }

    public void setBirthdayYear(Integer birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    public Integer getBirthdayMonth() {
        return birthdayMonth;
    }

    public void setBirthdayMonth(Integer birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    public Integer getBirthdayDay() {
        return birthdayDay;
    }

    public void setBirthdayDay(Integer birthdayDay) {
        this.birthdayDay = birthdayDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }

    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(Integer districtCode) {
        this.districtCode = districtCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Boolean getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Integer getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Integer monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Boolean getEducation() {
        return education;
    }

    public void setEducation(Boolean education) {
        this.education = education;
    }

    public Boolean getIndustryInfo() {
        return industryInfo;
    }

    public void setIndustryInfo(Boolean industryInfo) {
        this.industryInfo = industryInfo;
    }

    public String getBigImage() {
        return bigImage;
    }

    public void setBigImage(String bigImage) {
        this.bigImage = bigImage == null ? null : bigImage.trim();
    }

    public String getBankUserName() {
        return bankUserName;
    }

    public void setBankUserName(String bankUserName) {
        this.bankUserName = bankUserName == null ? null : bankUserName.trim();
    }

    public String getShopBank() {
        return shopBank;
    }

    public void setShopBank(String shopBank) {
        this.shopBank = shopBank == null ? null : shopBank.trim();
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    public String getWithdrawPasswd() {
        return withdrawPasswd;
    }

    public void setWithdrawPasswd(String withdrawPasswd) {
        this.withdrawPasswd = withdrawPasswd == null ? null : withdrawPasswd.trim();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}