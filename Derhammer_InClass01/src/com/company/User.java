package com.company;

public class User implements Comparable<User> {

    // Conor Derhammer
    // 801155393
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String gender;
    private String city;
    private String state;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public User(String firstName, String lastName, int age, String email, String gender, String city, String state) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.city = city;
        this.state = state;
    }
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public User(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + "firstname: " + firstName + ",lastname: " + lastName + ",age: " + age + ",email: " +
                email + ",gender: " + gender + ",city: " + city + ",state: " + state + "]";
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }
}
