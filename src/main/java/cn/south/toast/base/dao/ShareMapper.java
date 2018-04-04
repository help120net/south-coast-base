package cn.south.toast.base.dao;

import cn.south.toast.base.module.Share;
import cn.south.toast.base.module.ShareExample;
import cn.south.toast.common.mybatis.base.IBaseMapper;
import cn.south.toast.common.mybatis.base.PageParameter;
import cn.south.toast.common.mybatis.query.Query;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareMapper extends IBaseMapper<Share, ShareExample> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int countByExample(ShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int deleteByExample(ShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int insert(Share record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int insertSelective(Share record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    List<Share> selectByExample(ShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    Share selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Share record, @Param("example") ShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Share record, @Param("example") ShareExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Share record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_share
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Share record);

    List<Share> query(@Param("query") Query query, PageParameter pageParameter);
}