package cn.south.toast.base.module;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShareExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_share
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_share
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table base_share
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public ShareExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table base_share
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("_share.id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("_share.id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("_share.id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("_share.id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("_share.id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("_share.id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("_share.id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("_share.id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("_share.id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("_share.id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("_share.id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("_share.id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("_share.id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("_share.id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("_share.delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("_share.delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Integer value) {
            addCriterion("_share.delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Integer value) {
            addCriterion("_share.delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Integer value) {
            addCriterion("_share.delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("_share.delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Integer value) {
            addCriterion("_share.delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Integer value) {
            addCriterion("_share.delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Integer> values) {
            addCriterion("_share.delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Integer> values) {
            addCriterion("_share.delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Integer value1, Integer value2) {
            addCriterion("_share.delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("_share.delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("_share.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("_share.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("_share.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("_share.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("_share.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("_share.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("_share.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("_share.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("_share.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("_share.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("_share.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("_share.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("_share.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("_share.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("_share.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("_share.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("_share.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("_share.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("_share.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("_share.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("_share.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("_share.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("_share.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("_share.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("_share.create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("_share.create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("_share.create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("_share.create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("_share.create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("_share.create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("_share.create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("_share.create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("_share.create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("_share.create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("_share.create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("_share.create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("_share.create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("_share.create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("_share.update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("_share.update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("_share.update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("_share.update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("_share.update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("_share.update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("_share.update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("_share.update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("_share.update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("_share.update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("_share.update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("_share.update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("_share.update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("_share.update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andSourceFromIsNull() {
            addCriterion("_share.source_from is null");
            return (Criteria) this;
        }

        public Criteria andSourceFromIsNotNull() {
            addCriterion("_share.source_from is not null");
            return (Criteria) this;
        }

        public Criteria andSourceFromEqualTo(Integer value) {
            addCriterion("_share.source_from =", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotEqualTo(Integer value) {
            addCriterion("_share.source_from <>", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromGreaterThan(Integer value) {
            addCriterion("_share.source_from >", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("_share.source_from >=", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLessThan(Integer value) {
            addCriterion("_share.source_from <", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromLessThanOrEqualTo(Integer value) {
            addCriterion("_share.source_from <=", value, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromIn(List<Integer> values) {
            addCriterion("_share.source_from in", values, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotIn(List<Integer> values) {
            addCriterion("_share.source_from not in", values, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromBetween(Integer value1, Integer value2) {
            addCriterion("_share.source_from between", value1, value2, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andSourceFromNotBetween(Integer value1, Integer value2) {
            addCriterion("_share.source_from not between", value1, value2, "sourceFrom");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("_share.name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("_share.name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("_share.name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("_share.name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("_share.name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("_share.name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("_share.name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("_share.name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("_share.name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("_share.name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("_share.name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("_share.name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("_share.name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("_share.name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("_share.link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("_share.link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("_share.link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("_share.link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("_share.link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("_share.link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("_share.link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("_share.link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("_share.link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("_share.link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("_share.link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("_share.link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("_share.link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("_share.link not between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("_share.image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("_share.image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("_share.image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("_share.image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("_share.image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("_share.image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("_share.image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("_share.image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("_share.image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("_share.image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("_share.image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("_share.image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("_share.image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("_share.image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("_share.description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("_share.description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("_share.description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("_share.description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("_share.description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("_share.description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("_share.description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("_share.description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("_share.description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("_share.description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("_share.description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("_share.description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("_share.description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("_share.description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("_share.title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("_share.title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("_share.title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("_share.title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("_share.title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("_share.title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("_share.title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("_share.title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("_share.title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("_share.title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("_share.title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("_share.title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("_share.title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("_share.title not between", value1, value2, "title");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table base_share
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table base_share
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}