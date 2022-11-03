package com.tencent.wxcloudrun.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Counter implements Serializable {

    private Integer id;

    private Integer count;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
