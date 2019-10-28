package ua.com.gelius.service;

import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;
import ua.com.gelius.model.Digit;
import ua.com.gelius.repository.DigitRepository;

@Service
public class DigitServiceImpl implements DigitService {

    private final DigitRepository digitRepository;

    public DigitServiceImpl(DigitRepository digitRepository) {
        this.digitRepository = digitRepository;
    }

    @PostConstruct
    @Override
    public void init() {
        digitRepository.save(new Digit(null, 3));
    }

    @Override
    public Digit findOne(Long id) {
        return digitRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("digit with id " + id + " not found"));
    }
}
