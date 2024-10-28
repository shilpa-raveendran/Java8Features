package com.shilpa.streamAPI;

public class Project {
    private String Name;
    private String client;
    private String leadName;

    public Project(String name, String client, String leadName) {
        Name = name;
        this.client = client;
        this.leadName = leadName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }
}
