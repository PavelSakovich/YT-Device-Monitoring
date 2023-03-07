public class NewUser {
    public int id;
    public String name;
    public String city;
    public String street;
    public int age;


    public NewUser(int id, String name, String city, String street, int age) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.street = street;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getAge() {
        return age;
    }
}
