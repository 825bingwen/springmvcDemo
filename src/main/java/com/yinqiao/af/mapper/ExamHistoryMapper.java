package com.yinqiao.af.mapper;

import com.yinqiao.af.model.ExamHistory;
import java.util.List;

public interface ExamHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AF_USER_EXAM_HISTORY
     *
     * @mbg.generated Thu Feb 08 10:50:40 CST 2018
     */
    int deleteByPrimaryKey(String hId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AF_USER_EXAM_HISTORY
     *
     * @mbg.generated Thu Feb 08 10:50:40 CST 2018
     */
    int insert(ExamHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AF_USER_EXAM_HISTORY
     *
     * @mbg.generated Thu Feb 08 10:50:40 CST 2018
     */
    ExamHistory selectByPrimaryKey(String hId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AF_USER_EXAM_HISTORY
     *
     * @mbg.generated Thu Feb 08 10:50:40 CST 2018
     */
    List<ExamHistory> selectAll(String telnum);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AF_USER_EXAM_HISTORY
     *
     * @mbg.generated Thu Feb 08 10:50:40 CST 2018
     */
    int updateByPrimaryKey(ExamHistory record);
    
    String isExist(String hId);
}