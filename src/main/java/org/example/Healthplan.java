package org.example;

public class Healthplan {
    // id, name ve plan
    private int id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Healthplan{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", plan=").append(plan);
        sb.append('}');
        return sb.toString();
    }


}
