public class Person {
    private String Name;
    private String Birthdate;
    private String Department;
    private String Major;
    private String Age;
    private String Height;
    private String Weight;
    private double Distance;
    private double Time;
    
    public static void main(String[] args) {
        Person person_obj = new Person();
        int Speed = 80;
        person_obj.setInformation("Name: Michael Mervin Ruswan", "\nBirthdate: 27 June 2002", "\nDepartment: Informatics and Tourism", "\nMajor: Information Technology", "\nAge: 19", "\nHeight: 165 cm", "\nWeight: 50 kg");
        System.out.println(person_obj.getInformation());
        System.out.println("Speed: " + Speed + " km/minute");
        person_obj.Distance = 0.8;
        person_obj.Time = person_obj.Distance / Speed;
        person_obj.setDistanceTime(person_obj.Distance, person_obj.Time);
        System.out.println(person_obj.getDistanceTime());
    }
    //Informasi
    public void setInformation(String Name, String Birthdate, String Department, String Major, String Age, String Height, String Weight) {
        this.Name = Name;
        this.Birthdate = Birthdate;
        this.Department = Department;
        this.Major = Major;
        this.Age = Age;
        this.Height = Height;
        this.Weight = Weight;
    }
    //Jarak dan Waktu
    public String getInformation() {
        return this.Name + this.Birthdate + this.Department + this.Major + this.Age + this.Height + this.Weight;
    }

    public void setDistanceTime(double Distance, double Time) {
        this.Distance = Distance;
        this.Time = Time;
    }

    public String getDistanceTime() {
        return "Distance: " + String.valueOf(this.Distance) +"\nTime: " + String.valueOf(this.Time);
    }

}