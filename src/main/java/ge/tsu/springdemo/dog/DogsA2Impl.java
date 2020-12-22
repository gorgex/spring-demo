package ge.tsu.springdemo.dog;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("A2")
public class DogsA2Impl implements DogService {
    @Override
    public void addDog() {

    }
}
