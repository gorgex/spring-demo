package ge.tsu.springdemo.dog;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("A1")
public class DogsA1Impl implements DogService {
    @Override
    public void addDog() {

    }
}
