package com.dsky.baas.pointsservice.dao;

import com.dsky.baas.pointsservice.model.PointsPoolGameTotal;

public interface PointsPoolGameTotalMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_pool_game_total
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_pool_game_total
     *
     * @mbggenerated
     */
    int insert(PointsPoolGameTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_pool_game_total
     *
     * @mbggenerated
     */
    int insertSelective(PointsPoolGameTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_pool_game_total
     *
     * @mbggenerated
     */
    PointsPoolGameTotal selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_pool_game_total
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PointsPoolGameTotal record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table points_pool_game_total
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PointsPoolGameTotal record);
}