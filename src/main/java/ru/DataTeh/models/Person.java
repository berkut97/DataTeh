package ru.DataTeh.models;

import java.util.Date;

public class Person {
    /**
     * Объявление переменной, содержащей ФИО кандидата
     */
    private String Name;
    /**
     * Объявление переменной, содержащей дату рождения кандидата
     */
    private Date DateOfBirth;
    /**
     * Объявление переменной, содержащей желаюмую кандидатом должность
     */
    private String WPost;
    /**
     * Объявление переменной, содержащей подходящую кандидату должность
     */
    private String Post;
    /**
     *
     * @return ФИО кандидата
     */
    public String getName() {
        return  Name;
    }
    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.Name = name;
    }
    /**
     *
     * @return дату рождения кандидата
     */
    public Date getDateOfBirth() {
        return  DateOfBirth;
    }
    /**
     *
     * @param dateOfBirth
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.DateOfBirth = dateOfBirth;
    }
    /**
     *
     * @return желаюмую кандидатом должность
     */
    public String getWPost() {
        return  WPost;
    }
    /**
     *
     * @param wPost
     */
    public void setWPost(String wPost) {
        this.WPost = wPost;
    }
    /**
     *
     * @return подходящую кандидату должность
     */
    public String getPost() {
        return  Post;
    }
    /**
     *
     * @param post
     */
    public void setPost(String post) {
        this.Post = post;
    }
}
