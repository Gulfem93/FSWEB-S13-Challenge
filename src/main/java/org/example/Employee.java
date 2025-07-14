package org.example;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;
    private Healthplan healthPlan;

    // Constructor
    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    // Healthplan ekleme metodu
    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Hata: Geçersiz index. Dizi sınırlarının dışında.");
        } else if (healthplans[index] == null || healthplans[index].isEmpty()) {
            healthplans[index] = name;
            System.out.println("Healthplan başarıyla eklendi: " + name);
        } else {
            System.out.println("Hata: Belirtilen index (" + index + ") zaten dolu. Mevcut değer: " + healthplans[index]);
        }
    }

    // Getter ve Setter metodları (isteğe bağlı)
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public Healthplan getHealthPlan() {
        return healthPlan;
    }

    
}
