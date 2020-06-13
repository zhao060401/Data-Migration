package com.huice.model.now;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
@ToString
public class NowUser {
    private Integer userId;

    private Integer shopId;

    private String username;

    private String userPwd;

    private String userCid;

    private String mobile;

    private String userCode;

    private String wxOpenid;

    private String email;

    private Date createTime;

    private String wechat;

    private Integer fanliGrade;

    private Integer userGrade;

    private Integer invite;

    private String inviteSource;

    private String invitationCode;

    private BigDecimal account;

    private Integer discount;

    private Integer discountGrade;

    private Boolean isDelete;

    private Date deleteTime;

    private Integer growth;

    private Integer score;

    private Integer source;

    private Integer scene;

    private Integer inviteId;

    private Date inviteExpiryDate;

    private String wxUnionId;

    private Date updateTime;

    private Byte isDistributor;

    private Integer inviteActId;

    private Byte distributorLevel;

    private String aliUserId;

    private String device;

    private Date inviteProtectDate;

    private Date lookCollectTime;

    private Boolean getCollectGift;

    private Integer inviteGroup;

    private BigDecimal unitPrice;

    private Date inviteTime;

    private BigDecimal cumulativeMoney;

    private Integer cumulativeScore;

    private Integer inviteProtectDays;

    public NowUser(Integer userId, Integer shopId, String username, String userPwd, String userCid, String mobile, String userCode, String wxOpenid, String email, Date createTime, String wechat, Integer fanliGrade, Integer userGrade, Integer invite, String inviteSource, String invitationCode, BigDecimal account, Integer discount, Integer discountGrade, Boolean isDelete, Date deleteTime, Integer growth, Integer score, Integer source, Integer scene, Integer inviteId, Date inviteExpiryDate, String wxUnionId, Date updateTime, Byte isDistributor, Integer inviteActId, Byte distributorLevel, String aliUserId, String device, Date inviteProtectDate, Date lookCollectTime, Boolean getCollectGift, Integer inviteGroup, BigDecimal unitPrice, Date inviteTime, BigDecimal cumulativeMoney, Integer cumulativeScore, Integer inviteProtectDays) {
        this.userId = userId;
        this.shopId = shopId;
        this.username = username;
        this.userPwd = userPwd;
        this.userCid = userCid;
        this.mobile = mobile;
        this.userCode = userCode;
        this.wxOpenid = wxOpenid;
        this.email = email;
        this.createTime = createTime;
        this.wechat = wechat;
        this.fanliGrade = fanliGrade;
        this.userGrade = userGrade;
        this.invite = invite;
        this.inviteSource = inviteSource;
        this.invitationCode = invitationCode;
        this.account = account;
        this.discount = discount;
        this.discountGrade = discountGrade;
        this.isDelete = isDelete;
        this.deleteTime = deleteTime;
        this.growth = growth;
        this.score = score;
        this.source = source;
        this.scene = scene;
        this.inviteId = inviteId;
        this.inviteExpiryDate = inviteExpiryDate;
        this.wxUnionId = wxUnionId;
        this.updateTime = updateTime;
        this.isDistributor = isDistributor;
        this.inviteActId = inviteActId;
        this.distributorLevel = distributorLevel;
        this.aliUserId = aliUserId;
        this.device = device;
        this.inviteProtectDate = inviteProtectDate;
        this.lookCollectTime = lookCollectTime;
        this.getCollectGift = getCollectGift;
        this.inviteGroup = inviteGroup;
        this.unitPrice = unitPrice;
        this.inviteTime = inviteTime;
        this.cumulativeMoney = cumulativeMoney;
        this.cumulativeScore = cumulativeScore;
        this.inviteProtectDays = inviteProtectDays;
    }

    public NowUser() {
        super();
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

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserCid() {
        return userCid;
    }

    public void setUserCid(String userCid) {
        this.userCid = userCid == null ? null : userCid.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid == null ? null : wxOpenid.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public Integer getFanliGrade() {
        return fanliGrade;
    }

    public void setFanliGrade(Integer fanliGrade) {
        this.fanliGrade = fanliGrade;
    }

    public Integer getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    public Integer getInvite() {
        return invite;
    }

    public void setInvite(Integer invite) {
        this.invite = invite;
    }

    public String getInviteSource() {
        return inviteSource;
    }

    public void setInviteSource(String inviteSource) {
        this.inviteSource = inviteSource == null ? null : inviteSource.trim();
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode == null ? null : invitationCode.trim();
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Integer getDiscountGrade() {
        return discountGrade;
    }

    public void setDiscountGrade(Integer discountGrade) {
        this.discountGrade = discountGrade;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public Integer getInviteId() {
        return inviteId;
    }

    public void setInviteId(Integer inviteId) {
        this.inviteId = inviteId;
    }

    public Date getInviteExpiryDate() {
        return inviteExpiryDate;
    }

    public void setInviteExpiryDate(Date inviteExpiryDate) {
        this.inviteExpiryDate = inviteExpiryDate;
    }

    public String getWxUnionId() {
        return wxUnionId;
    }

    public void setWxUnionId(String wxUnionId) {
        this.wxUnionId = wxUnionId == null ? null : wxUnionId.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(Byte isDistributor) {
        this.isDistributor = isDistributor;
    }

    public Integer getInviteActId() {
        return inviteActId;
    }

    public void setInviteActId(Integer inviteActId) {
        this.inviteActId = inviteActId;
    }

    public Byte getDistributorLevel() {
        return distributorLevel;
    }

    public void setDistributorLevel(Byte distributorLevel) {
        this.distributorLevel = distributorLevel;
    }

    public String getAliUserId() {
        return aliUserId;
    }

    public void setAliUserId(String aliUserId) {
        this.aliUserId = aliUserId == null ? null : aliUserId.trim();
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device == null ? null : device.trim();
    }

    public Date getInviteProtectDate() {
        return inviteProtectDate;
    }

    public void setInviteProtectDate(Date inviteProtectDate) {
        this.inviteProtectDate = inviteProtectDate;
    }

    public Date getLookCollectTime() {
        return lookCollectTime;
    }

    public void setLookCollectTime(Date lookCollectTime) {
        this.lookCollectTime = lookCollectTime;
    }

    public Boolean getGetCollectGift() {
        return getCollectGift;
    }

    public void setGetCollectGift(Boolean getCollectGift) {
        this.getCollectGift = getCollectGift;
    }

    public Integer getInviteGroup() {
        return inviteGroup;
    }

    public void setInviteGroup(Integer inviteGroup) {
        this.inviteGroup = inviteGroup;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getInviteTime() {
        return inviteTime;
    }

    public void setInviteTime(Date inviteTime) {
        this.inviteTime = inviteTime;
    }

    public BigDecimal getCumulativeMoney() {
        return cumulativeMoney;
    }

    public void setCumulativeMoney(BigDecimal cumulativeMoney) {
        this.cumulativeMoney = cumulativeMoney;
    }

    public Integer getCumulativeScore() {
        return cumulativeScore;
    }

    public void setCumulativeScore(Integer cumulativeScore) {
        this.cumulativeScore = cumulativeScore;
    }

    public Integer getInviteProtectDays() {
        return inviteProtectDays;
    }

    public void setInviteProtectDays(Integer inviteProtectDays) {
        this.inviteProtectDays = inviteProtectDays;
    }
}