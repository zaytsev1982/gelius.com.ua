package ua.com.gelius.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.com.gelius.model.RequestParameter;
import ua.com.gelius.service.ResultRequestHandler;

@RestController
@Validated
public class ResultRestController {

    private final ResultRequestHandler resultRequestHandler;

    public ResultRestController(ResultRequestHandler resultRequestHandler) {
        this.resultRequestHandler = resultRequestHandler;
    }

    @GetMapping(value = "/result", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Integer> result(
        @RequestParam(value = "param1", defaultValue = "1") Integer param1,
        @RequestParam(value = "param2", defaultValue = "1") Integer param2,
        @RequestParam("flag") boolean flag) {

        RequestParameter parameters = RequestParameter
            .builder()
            .parameterOne(param1)
            .parameterTwo(param2)
            .flag(flag)
            .build();
        Integer result = resultRequestHandler.result(parameters);
        return ResponseEntity.ok().body(result);

    }

}
