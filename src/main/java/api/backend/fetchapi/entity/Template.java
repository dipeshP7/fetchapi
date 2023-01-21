package api.backend.fetchapi.entity;

public class Template {
    private int templateId;
    private String name;
    private String location;

    public int getTemplateId(){
        return this.templateId;
    }
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return this.location;
    }

    public void setTemplateId(int templateId){
        this.templateId = templateId;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
