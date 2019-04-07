package dk.ahemmingsen.plandaytest.model;

public class Guide {

    private String startDate;
    private String endDate;
    private String name;
    private String url;
    private boolean login_Required;
    private Object venue;
    private String objType;
    private String icon;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isLogin_Required() {
        return login_Required;
    }

    public void setLogin_Required(boolean login_Required) {
        this.login_Required = login_Required;
    }

    public Object getVenue() {
        return venue;
    }

    public void setVenue(Object venue) {
        this.venue = venue;
    }

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
