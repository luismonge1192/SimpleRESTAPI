package service;

import java.text.ParseException;
import java.util.HashMap;

import model.Course;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private HashMap<Integer, Course> courses = new HashMap<Integer, Course>();

    public CourseService() throws ParseException {
        String start ="09/01/2019";
        String end ="12/23/2019";
        String professor = "Professor Doe";
        String description = "Introductory Course to Prepare Students for College";
        for (int i = 0; i < 10;i++){
            Course c = new Course(i,start,end,description,professor);
            courses.put(i,c);
        }
    }

    public HashMap<Integer, Course> getAll() {
        return courses;
    }
//
//    public void addCourse(){
//
//    }

    public void editCourse(int id, String[] args) throws ParseException {
        if (courses.containsKey(id)){
            Course c = courses.get(id);
            for (int i = 0 ; i < args.length;i++){
                if(args[i] == null){
                    continue;
                }else{
                    switch (i){
                        case 0:
                            c.setStartDate(args[i]);
                            break;
                        case 1:
                            c.setEndDate(args[i]);
                            break;
                        case 2:
                            c.setDescription(args[i]);
                            break;
                        default:
                            c.setProfessor(args[i]);
                            break;
                    }
                }
            }
            c.calculateDuration();
        }
    }
}