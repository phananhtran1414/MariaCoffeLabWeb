/*
 * FindCafe.java
 * 
 * All Rights Reserved.
 * Copyright (c) 2020 FPT University
 */
package utility;

/**
 * FindCafe class.<br>
 * 
 * <pre>
 * Class thực hiện thao tác với Cake
 * Trong class này sẽ tiến hành các xử lí dưới đây.
 * 
 * ・get address
 * ・get telephone
 * ・get email
 * ・get closed
 * ・get opended1
 * ・get opended2
 * ・get map
 * 
 * ・Set address
 * ・Set telephone
 * ・Set email
 * ・Set closed
 * ・Set opended1
 * ・Set opended2
 * ・Set map
 * 
 * </pre>
 * 
 * @author FU AnhTHPHE130193
 * @version 1.0
 */
public class FindCafe {
    /** Store address */
    private String address;
    /** Store telephone */
    private int telephone;
    /** Store email */
    private String email;
    /** Store closed */
    private String closed;
    /** Store opended1 */
    private String opended1;
    /** Store opended2 */
    private String opended2;
    /** Store map */
    private String map;

    /**
     * Constructor <br/>
     * 
     * @param address
     * @param telephone
     * @param email
     * @param Closed
     * @param Opended1
     * @param Opended2
     * @param map 
     */
    public FindCafe(String address, int telephone, String email, String Closed, String Opended1, String Opended2, String map) {
        this.address = address;
        this.telephone = telephone;
        this.email = email;
        this.closed = Closed;
        this.opended1 = Opended1;
        this.opended2 = Opended2;
        this.map = map;
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
     * Get telephone <br>
     * 
     * @return the telephone.
     */
    public int getTelephone() {
        return telephone;
    }

    /**
     * Get email <br>
     * 
     * @return the email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Get closed <br>
     * 
     * @return the closed.
     */
    public String getClosed() {
        return closed;
    }

    /**
     * Get opended1 <br>
     * 
     * @return the opended1.
     */
    public String getOpended1() {
        return opended1;
    }

    /**
     * Get opended2 <br>
     * 
     * @return the opended2.
     */
    public String getOpended2() {
        return opended2;
    }

    /**
     * Get map <br>
     * 
     * @return the map.
     */
    public String getMap() {
        return map;
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
     * Set telephone <br/>
     * 
     * @param telephone the telephone
     */
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    /**
     * Set email <br/>
     * 
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Set closed <br/>
     * 
     * @param closed the closed
     */
    public void setClosed(String closed) {
        this.closed = closed;
    }

    /**
     * Set opended1 <br/>
     * 
     * @param opended1 the opended1
     */
    public void setOpended1(String opended1) {
        this.opended1 = opended1;
    }

    /**
     * Set opended2 <br/>
     * 
     * @param opended2 the opended2
     */
    public void setOpended2(String opended2) {
        this.opended2 = opended2;
    }

    /**
     * Set map <br/>
     * 
     * @param map the map
     */
    public void setMap(String map) {
        this.map = map;
    }
    
    
}
