package com.the_daul_intra.mini.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ViewerResponse {
    private Long id;
    private String employeeNumber;
    private String name;
    private String contactInfo;
}
