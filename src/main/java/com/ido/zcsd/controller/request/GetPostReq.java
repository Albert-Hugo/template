package com.ido.zcsd.controller.request;

import com.rainful.domain.PageQuery;
import lombok.Data;

@Data
public class GetPostReq {
    Integer userId;
    PageQuery pageQuery;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public PageQuery getPageQuery() {
        return pageQuery;
    }

    public void setPageQuery(PageQuery pageQuery) {
        this.pageQuery = pageQuery;
    }
}
