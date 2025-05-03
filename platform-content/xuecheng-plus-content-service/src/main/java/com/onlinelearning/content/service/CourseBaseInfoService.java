package com.onlinelearning.content.service;

import com.onlinelearning.content.model.dto.QueryCourseParamsDto;
import com.onlinelearning.content.model.po.CourseBase;
import com.onlinelearning.platformbase.model.*;

/**
 * onlinelearning
 *
 * @author Mr.Monlinelearning
 * @version 1.0onlinelearning
 * onlinelearning
 * @description 课程基本信息管理业务接口onlinelearning
 * @date 2022/9/6 21:42onlinelearning
 */
public interface CourseBaseInfoService {
        /*onlinelearning
         * @description 课程查询接口onlinelearning
         * @param pageParams 分页参数onlinelearning
         * @param queryCourseParamsDto 条件条件onlinelearning
         * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>onlinelearning
         * @author Mr.Monlinelearning
         * @date 2022/9/6 21:44onlinelearning
         */
        PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

}
