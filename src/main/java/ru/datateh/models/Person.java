package ru.datateh.models;

import java.util.Date;

public class Person {
    /**
     * Имя кандидата
     */
    private String firstName;
    /**
     * Фамилия кандидата
     */
    private String secondName;
    /**
     * Отчество кандидата
     */
    private String patronymic;
    /**
     * Дата рождения кандидата
     */
    private Date DateOfBirth;
    /**
     * Желаюмая кандидатом должность
     */
    private String WPost;
    /**
     * Подходящая кандидату должность
     */
    private String Post;

    public String getFirstName() {
        return  firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getSecondName() {
        return  secondName;
    }

    public void setSecondName(String SecondName) {
        this.secondName = SecondName;
    }

    public String getPatronymic() {
        return  patronymic;
    }

    public void setPatronymic(String Patronymic) {
        this.patronymic = Patronymic;
    }

    public Date getDateOfBirth() {
        return  DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }

    public String getWPost() {
        return  WPost;
    }

    public void setWPost(String wPost) {
        this.WPost = wPost;
    }

    public String getPost() {
        return  Post;
    }

    public void setPost(String post) {
        this.Post = post;
    }
}
