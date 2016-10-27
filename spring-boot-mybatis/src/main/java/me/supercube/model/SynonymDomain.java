package me.supercube.model;

/**
 * Created by chenping on 2016/10/27.
 */
public class SynonymDomain {

    private long synonymdomainid;

    private String domainid;

    private String domainname;

    private String description;


    public long getSynonymdomainid() {
        return synonymdomainid;
    }

    public void setSynonymdomainid(long synonymdomainid) {
        this.synonymdomainid = synonymdomainid;
    }

    public String getDomainid() {
        return domainid;
    }

    public void setDomainid(String domainid) {
        this.domainid = domainid;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SynonymDomain{" +
                "synonymdomainid=" + synonymdomainid +
                ", domainid='" + domainid + '\'' +
                ", domainname='" + domainname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
