package cn.south.toast.base.module;

import cn.south.toast.common.mybatis.base.EntityBase;

public class Share extends EntityBase {
    /**
     * 分享来源1、分享跑步记录，2、分享活动详情，3、注册领取分享,4、分享体测报告,5、钱包充值成功，6、会员卡购买成功，7、押金充值成
     *
     * @mbggenerated
     */
    private Integer sourceFrom;

    /**
     * 分享来源名称
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 分享链接
     *
     * @mbggenerated
     */
    private String link;

    /**
     * 分享图片url
     *
     * @mbggenerated
     */
    private String imageUrl;

    /**
     * 分享描述信息
     *
     * @mbggenerated
     */
    private String description;

    /**
     * 他享标题
     *
     * @mbggenerated
     */
    private String title;

    /**
     * 分享来源1、分享跑步记录，2、分享活动详情，3、注册领取分享,4、分享体测报告,5、钱包充值成功，6、会员卡购买成功，7、押金充值成
     *
     * @mbggenerated
     */
    public Integer getSourceFrom() {
        return sourceFrom;
    }

    /**
     * 分享来源1、分享跑步记录，2、分享活动详情，3、注册领取分享,4、分享体测报告,5、钱包充值成功，6、会员卡购买成功，7、押金充值成
     *
     * @mbggenerated
     */
    public void setSourceFrom(Integer sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    /**
     * 分享来源名称
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * 分享来源名称
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 分享链接
     *
     * @mbggenerated
     */
    public String getLink() {
        return link;
    }

    /**
     * 分享链接
     *
     * @mbggenerated
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 分享图片url
     *
     * @mbggenerated
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 分享图片url
     *
     * @mbggenerated
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 分享描述信息
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * 分享描述信息
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 他享标题
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * 他享标题
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title;
    }
}