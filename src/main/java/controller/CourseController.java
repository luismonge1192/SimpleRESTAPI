package controller;

import java.util.HashMap;

import model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CourseService;


@CrossOrigin
@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseService cs;

    @RequestMapping("/all")
    public HashMap<Integer, Course> getAll() {
        return cs.getAll();
    }

//    @RequestMapping("edit/{id}")
//    public Person editCourse(@PathVariable("id") int id) {
//        return cs.getPerson(id);
//    }
}
