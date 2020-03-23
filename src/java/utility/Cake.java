/*
 * Cake.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package utility;

/**
 * Cake class.<br>
 * 
 * <pre>
 * Class thực hiện thao tác với Cake
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・get id
 * ・get title
 * ・get price
 * ・get sortContent
 * ・get content
 * ・get picture
 * 
 * ・Set id
 * ・Set title
 * ・Set price
 * ・Set sortContent
 * ・Set content
 * ・Set picture
 *
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class Cake {
    /** Store id */
    private int id;
    /** Store title */
    private String title;
    /** Store price */
    private float price;
    /** Store sort content */
    private String sortContent;
    /** Store content */
    private String content;
    /** Store picture */
    private String picture;

    
    /**
     * Constructor.<br>
     */
    public Cake(){}
    
    /**
     * Constructor.<br>
     * 
     * @param id
     * @param title
     * @param price
     * @param sortContent 
     * @param content 
     * @param picture 
     * 
     */
    public Cake(int id, String title, float price, String sortContent, String content, String picture) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.sortContent = sortContent;
        this.content = content;
        this.picture = picture;
    }

    /**
     * Get id.<br>
     * 
     * @return the id.
     */
    public int getId() {
        return id;
    }

    /**
     * Get title.<br>
     * 
     * @return the title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Get price.<br>
     * 
     * @return the price.
     */
    public float getPrice() {
        return price;
    }

    /**
     * Get sortContent.<br>
     * 
     * @return the sortContent.
     */
    public String getSortContent() {
        return sortContent;
    }

    /**
     * Get content.<br>
     * 
     * @return the content.
     */
    public String getContent() {
        return content;
    }

    /**
     * Get picture.<br>
     * 
     * @return the picture.
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Set id.<br>
     * 
     * @param id the id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set title.<br>
     * 
     * @param title the title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Set price.<br>
     * 
     * @param price the price.
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Set sortContent.<br>
     * 
     * @param sortContent the sortContent.
     */
    public void setSortContent(String sortContent) {
        this.sortContent = sortContent;
    }

    /**
     * Set content.<br>
     * 
     * @param content the content.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Set picture.<br>
     * 
     * @param picture the picture.
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
}
