package cn.south.toast.base.dao;

import cn.south.toast.base.module.Resource;
import cn.south.toast.base.module.ResourceExample;
import cn.south.toast.common.mybatis.base.IBaseMapper;
import cn.south.toast.common.mybatis.base.PageParameter;
import cn.south.toast.common.mybatis.query.Query;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceMapper extends IBaseMapper<Resource, ResourceExample> {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int countByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int deleteByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int insert(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int insertSelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    List<Resource> selectByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    Resource selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_resource
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Resource record);

    List<Resource> query(@Param("query") Query query, PageParameter pageParameter);
}