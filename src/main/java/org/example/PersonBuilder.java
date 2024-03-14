package org.example;

public class PersonBuilder implements IPersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder(Person person) {
        this.surname = person.getSurname();
    }


    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;

        if (this.age < 0) {

            throw new IllegalArgumentException("Аргумент некорректен: ");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {  // Возращает класс Person.
        Person person = new Person(name, surname, age, address);
        if (this.name == null || this.surname == null || this.age < 0 || this.address == null) {

            throw new IllegalStateException("Обнаружено пустое поле: ");
        }
        return person;

    }


}
