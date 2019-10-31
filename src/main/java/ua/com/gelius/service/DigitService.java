package ua.com.gelius.service;

import ua.com.gelius.model.Digit;

public interface DigitService {

    void init();

    Digit findOne(Long id);

}
