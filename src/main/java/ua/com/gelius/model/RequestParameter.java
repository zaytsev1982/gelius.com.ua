package ua.com.gelius.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestParameter {

    private Integer parameterOne;
    private Integer parameterTwo;
    private boolean flag;

}
