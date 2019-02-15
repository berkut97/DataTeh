package ru.DataTeh.models;

public class Criterias {
    /**
     * Объявление переменной, содержащей уровень навыка работы в программах MSO
     */
    private int MSO;
    /**
     * Объявление переменной, содержащей уровень опыта разработки приложений
     */
    private int Dev;
    /**
     * Объявление переменной, содержащей уровень знания C/C#
     */
    private int C;
    /**
     * Объявление переменной, содержащей уровень знания Java
     */
    private int J;
    /**
     * Объявление переменной, содержащей уровень знания языков СУБД
     */
    private int DB;
    /**
     * Объявление переменной, содержащей уровень знания языков Web-программирования
     */
    private int Web;
    /**
     * Объявление переменной, содержащей уровень опыта работы с документацией
     */
    private int Doc;
    /**
     * Объявление переменной, содержащей уровень опыта работы в сфере продаж
     */
    private int Trader;
    /**
     * Объявление переменной, содержащей уровень опыта работы с клиентами
     */
    private int Model;
    /**
     * Объявление переменной, содержащей уровень знания нотаций моделирования
     */
    private int Client;
    /**
     *
     * @return уровень навыка работы в программах MSO
     */
    public int getMSO() {
        return  MSO;
    }
    /**
     *
     * @param mso
     */
    public void setMSO(int mso) {
        this.MSO = mso;
    }
    /**
     *
     * @return  уровень опыта разработки приложений
     */
    public int getDev() {
        return  Dev;
    }
    /**
     *
     * @param dev
     */
    public void setDev(int dev) {
        this.Dev = dev;
    }
    /**
     *
     * @return уровень знания C/C#
     */
    public int getC() {
        return  C;
    }
    /**
     *
     * @param c
     */
    public void setC(int c) {
        this.C = c;
    }
    /**
     *
     * @return уровень знания Java
     */
    public int getJ() {
        return  J;
    }
    /**
     *
     * @param j
     */
    public void setJ(int j) {
        this.J = j;
    }
    /**
     *
     * @return уровень знания языков СУБД
     */
    public int getDB() {
        return  DB;
    }
    /**
     *
     * @param db
     */
    public void setDB(int db) {
        this.DB = db;
    }
    /**
     *
     * @return уровень знания языков Web-программирования
     */
    public int getWeb() {
        return  Web;
    }
    /**
     *
     * @param web
     */
    public void setWeb(int web) {
        this.Web = web;
    }
    /**
     *
     * @return уровень опыта работы с документацией
     */
    public int getDoc() {
        return  Doc;
    }
    /**
     *
     * @param doc
     */
    public void setDoc(int doc) {
        this.Doc = doc;
    }
    /**
     *
     * @return уровень опыта работы в сфере продаж
     */
    public int getTrader() {
        return  Trader;
    }
    /**
     *
     * @param trader
     */
    public void setTrader(int trader) {
        this.Trader = trader;
    }
    /**
     *
     * @return уровень опыта работы с клиентами
     */
    public int getClient() {
        return  Client;
    }
    /**
     *
     * @param client
     */
    public void setClient(int client) {
        this.Client = client;
    }
    /**
     *
     * @return знания нотаций моделирования
     */
    public int getModel() {
        return  Model;
    }
    /**
     *
     * @param model
     */
    public void setModel(int model) {
        this.Model = model;
    }
}
