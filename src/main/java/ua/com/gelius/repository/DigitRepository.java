package ua.com.gelius.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.gelius.model.Digit;

public interface DigitRepository extends JpaRepository<Digit, Long> {

}
