package com.businessassistantbcn.opendata.dto.bcnzones;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor
public class BcnZonesResponseDto {
	
    @JsonProperty("count")
    private int count;
    
    @JsonProperty("elements")
    private BcnZonesDto[] elements;
    
}
