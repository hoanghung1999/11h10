package oop;

import org.json.simple.JSONObject;

import javax.xml.bind.annotation.XmlRootElement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
@XmlRootElement(name="tournament")
public class Tournament {
    private Integer tour_id;
    private String tour_name;
    private Date tour_start_date;
    private Date tour_end_date;
    private String tour_location_date;
    private String tour_description;
    private int status;

    public Tournament() {
    }

    public Tournament(Integer tour_id, String tour_name, Date tour_start_date, Date tour_end_date, String tour_location_date, String tour_description) {
        this.tour_id = tour_id;
        this.tour_name = tour_name;
        this.tour_start_date = tour_start_date;
        this.tour_end_date = tour_end_date;
        this.tour_location_date = tour_location_date;
        this.tour_description = tour_description;
    }

    public Tournament(String tour_name, Date tour_start_date, Date tour_end_date, String tour_location_date, String tour_description) {
        this.tour_name = tour_name;
        this.tour_start_date = tour_start_date;
        this.tour_end_date = tour_end_date;
        this.tour_location_date = tour_location_date;
        this.tour_description = tour_description;
    }

    public Tournament(Integer tour_id, String tour_name, Date tour_start_date, Date tour_end_date, String tour_location_date, String tour_description, int status) {
        this.tour_id = tour_id;
        this.tour_name = tour_name;
        this.tour_start_date = tour_start_date;
        this.tour_end_date = tour_end_date;
        this.tour_location_date = tour_location_date;
        this.tour_description = tour_description;
        this.status = status;
    }

    public Integer getTour_id() {
        return tour_id;
    }

    public void setTour_id(Integer tour_id) {
        this.tour_id = tour_id;
    }

    public String getTour_name() {
        return tour_name;
    }

    public void setTour_name(String tour_name) {
        this.tour_name = tour_name;
    }

    public Date getTour_start_date() {
        return tour_start_date;
    }

    public void setTour_start_date(Date tour_start_date) {
        this.tour_start_date = tour_start_date;
    }

    public Date getTour_end_date() {
        return tour_end_date;
    }

    public void setTour_end_date(Date tour_end_date) {
        this.tour_end_date = tour_end_date;
    }

    public String getTour_location_date() {
        return tour_location_date;
    }

    public void setTour_location_date(String tour_location_date) {
        this.tour_location_date = tour_location_date;
    }

    public String getTour_description() {
        return tour_description;
    }

    public void setTour_description(String tour_description) {
        this.tour_description = tour_description;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public JSONObject toJson(){
        JSONObject tour = new JSONObject();
        tour.put("tour_id",tour_id);
        tour.put("tour_name",tour_name);
        tour.put("tour_start_date",tour_start_date);
        tour.put("tour_end_date",tour_end_date);
        tour.put("tour_location",tour_location_date);
        tour.put("tour_description",tour_description);
        tour.put("status",status);
       return tour;

    }
}
