package com.wangfeng.bootbegin.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {

    /**
     * id : 1
     * author : zimug
     * title : 手摸手教你开发spring boot
     * content : c
     * createTime :
     * reader : [{"name":"zimug","age":18},{"name":"kobe","age":37}]
     */
    private Long id;
   // @JsonProperty("helpAuthor")
    private String author;
    private String title;
    private String content;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss",timezone = "GMT+8")
    private Date createTime;
    private List<Reader> reader;



}
