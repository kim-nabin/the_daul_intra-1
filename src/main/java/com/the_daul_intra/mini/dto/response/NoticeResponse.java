package com.the_daul_intra.mini.dto.response;

import com.the_daul_intra.mini.dto.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class NoticeResponse {

    private Long id;
    private String title;
    private String content;
    private Employee employee;
    private LocalDateTime updateDate;
}
