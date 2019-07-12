package hanwon.yoo.controller;


import hanwon.yoo.model.People;
import hanwon.yoo.sevice.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;


    @RequestMapping(method = RequestMethod.POST, path = "/people")
    public People getPeople(){
        return peopleService.getNewPeople();
    }
}
