package ua.com.gelius.service;

import org.springframework.stereotype.Service;
import ua.com.gelius.model.Digit;
import ua.com.gelius.model.RequestParameter;

@Service
public class ResultRequestHandler {

    private final DigitService digitService;

    public ResultRequestHandler(DigitService digitService) {
        this.digitService = digitService;
    }

    public Integer result(RequestParameter requestParameter) {
        Digit digit = digitService.findOne(1L);
        return requestParameter.isFlag()
            ? requestParameter.getParameterOne() + requestParameter.getParameterTwo() + digit.getNumeral()
            : requestParameter.getParameterOne() - requestParameter.getParameterTwo() + digit.getNumeral();
    }
}
