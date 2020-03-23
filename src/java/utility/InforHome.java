/*
 * InforHome.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package utility;

/**
 * InforHome class.<br>
 * 
 * <pre>
 * Class thực hiện thao tác với InforHome
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・get title
 * ・get content
 * ・get picture
 * ・get sign1
 * ・get sign2
 * ・get sortContent
 * ・get address
 * ・get phone
 * 
 * ・Set title
 * ・Set content
 * ・Set picture
 * ・Set sign1
 * ・Set sign2
 * ・Set sortContent
 * ・Set address
 * ・Set phone
 * 
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class InforHome {
    /** Store title */
    private String title;
    /** Store content */
    private String content;
    /** Store picture */
    private String picture;
    /** Store sign1 */
    private String sign1;
    /** Store sign2 */
    private String sign2;
    /** Store sortContent */
    private String sortContent;
    /** Store address */
    private String address;
    /** Store phone */
    private String phone;

    
    /**
     * Constructor <br/>
     * 
     * @param title
     * @param content
     * @param picture
     * @param sign1
     * @param sign2
     * @param sortContent
     * @param address
     * @param phone 
     */
    public InforHome(String title, String content, String picture, String sign1, String sign2, String sortContent, String address, String phone) {
        this.title = title;
        this.content = content;
        this.picture = picture;
        this.sign1 = sign1;
        this.sign2 = sign2;
        this.sortContent = sortContent;
        this.address = address;
        this.phone = phone;
    }

    /**
     * Get title <br>
     * 
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set title <br/>
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get content <br>
     * 
     * @return the content.
     */
    public String getContent() {
        return content;
    }

    /**
     * Set content <br/>
     * 
     * @param content the content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Get picture <br>
     * 
     * @return the picture.
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Set picture <br/>
     * 
     * @param picture the picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * Get sign1 <br>
     * 
     * @return the sign1.
     */
    public String getSign1() {
        return sign1;
    }

    /**
     * Set sign1 <br/>
     * 
     * @param sign1 the sign1
     */
    public void setSign1(String sign1) {
        this.sign1 = sign1;
    }

    /**
     * Get sign2 <br>
     * 
     * @return the sign2.
     */
    public String getSign2() {
        return sign2;
    }

    /**
     * Set sign2 <br/>
     * 
     * @param sign2 the sign2
     */
    public void setSign2(String sign2) {
        this.sign2 = sign2;
    }

    /**
     * Get sortContent <br>
     * 
     * @return the sortContent.
     */
    public String getSortContent() {
        return sortContent;
    }

    /**
     * Set sortContent <br/>
     * 
     * @param sortContent the sortContent
     */
    public void setSortContent(String sortContent) {
        this.sortContent = sortContent;
    }

    /**
     * Get address <br>
     * 
     * @return the address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address <br/>
     * 
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get phone <br>
     * 
     * @return the phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Set phone <br/>
     * 
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
