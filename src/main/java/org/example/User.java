package org.example;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) throws IllegalNameException {
        if(name.length() >20){
            throw new IllegalNameException("Length cannot be bigger " + " 20 symbols. You entered " +name);
        }
        this.name = name;
    }

    public void setAge(Integer age) {
        if (age<=0 || age >100) {
            throw new IllegalAgeException("Age of a user cannot be 0" + " or more than 100. You entered" + age);
        }
        this.age = age;

    }

}
