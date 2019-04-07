package dk.ahemmingsen.plandaytest.model;

import java.util.ArrayList;
import java.util.List;

public class UpcomingGuidesResponse {

    private String total;
    private List<Guide> data;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Guide> getData() {
        return data;
    }

    public void setData(ArrayList<Guide> data) {
        this.data = data;
    }

    public List<Guide> getUpcomingGuides() {
        return data;
    }
}
