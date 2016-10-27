package me.supercube.model;

/**
 * Created by chenping on 2016/10/27.
 */
public class Client {

    private long clientuid;
    private String clientid;
    private String clientname;
    private String category;

    public long getClientuid() {
        return clientuid;
    }

    public void setClientuid(long clientuid) {
        this.clientuid = clientuid;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientuid=" + clientuid +
                ", clientid='" + clientid + '\'' +
                ", clientname='" + clientname + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
