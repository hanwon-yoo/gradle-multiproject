package hanwon.yoo.sevice;

import hanwon.yoo.model.People;
import org.springframework.stereotype.Service;


@Service
public class PeopleService {

    public People getNewPeople() {
        return new People();
    }
}
