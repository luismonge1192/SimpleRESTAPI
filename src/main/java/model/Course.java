package model;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
//import javax.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement
public class Course {
    private long id;
    private String description;
    private String professor;
    private Date startDate;
    private Date endDate;
    private long  duration; // in days

    public Course(long id, String startDate, String endDate, String description, String professor) throws ParseException {
        this.id = id;
        this.description = description;
        this.professor = professor;
        Date date1=new SimpleDateFormat("mm/dd/yyyy").parse(startDate);
        Date date2=new SimpleDateFormat("mm/dd/yyyy").parse(endDate);
        this.startDate = date1;
        this.endDate = date2;
        long diff = this.endDate.getTime() - this.startDate.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        this.duration = diffDays;
    }

    public void setStartDate(String startDate) throws ParseException {
        Date date1=new SimpleDateFormat("mm/dd/yyyy").parse(startDate);
        this.startDate = date1;
    }

    public void setEndDate(String endDate) throws ParseException{
        Date date2=new SimpleDateFormat("mm/dd/yyyy").parse(endDate);
        this.startDate = date2;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getDescription(){
        return this.description;
    }

    public String getProfessor(){
        return this.professor;
    }

    public Date getStartDate(){
        return this.startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public long getDuration() {
        return this.duration;
    }

    public void calculateDuration(){
        long dif = this.endDate.getTime() - this.startDate.getTime();
        int diffDays = (int) dif / (24 * 60 * 60 * 1000);
        this.duration = diffDays;
    }
}
