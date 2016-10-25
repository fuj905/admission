package com.pandawork.mapper;

import com.pandawork.common.entity.Notice;

/**
 * 管理员处理mapper层
 * Created by fujia on 2016/10/25.
 */
public interface AdminMapper {

    /**
     * 增加一条新的公告
     * @param notice
     * @throws Exception
     */
    public void newNotice(Notice notice) throws Exception;

    /**
     * 根据公告id删除公告
     * @param notice
     * @throws Exception
     */
    public void delNoticeById(Notice notice) throws Exception;

    /**
     * 根据公告id修改一条公告
     * @param notice
     * @throws Exception
     */
    public void updateNoticeById(Notice notice) throws Exception;

    //public List<Notice> listNotice(Notice notice) throws Exception;
}
