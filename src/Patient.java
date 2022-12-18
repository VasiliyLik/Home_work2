//создаем класс Patient согласно условию
class Patient {
  public String name;
    public int age;
    public String diagnosis;
    public boolean client;
//конструктор
    Patient(String name, int age, String diagnosis, boolean client) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.client = client;
    }

    public String toString() {
        return "patient " + name + " - age = " + age;
    }
 }
