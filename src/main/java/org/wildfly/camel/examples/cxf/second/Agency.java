package org.wildfly.camel.examples.cxf.second;

/**
 * Created by samuele on 5/7/15.
 */
public class Agency {

    private String location;
    private String principal;
    private String agencyId;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }
}
