package ru.datateh.models;

import ru.datateh.utils.Criterias;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
    private String expectedPost;
    /**
     * Подходящая кандидату должность
     */
    private String suitablePost;
    /**
     * Карта критериев
     */
    Map<Criterias, Integer> criterias;

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
        return  expectedPost;
    }

    public void setWPost(String ExpectedPost) {
        this.expectedPost = ExpectedPost;
    }

    public String getPost() {
        return  suitablePost;
    }

    public void setPost(String SuitablePost) {
        this.suitablePost = SuitablePost;
    }

    public Map<Criterias, Integer> getCriterias() {
        return criterias;
    }

    public void setCriterias(Map<Criterias, Integer> criterias) {
        this.criterias = criterias;
    }
}
