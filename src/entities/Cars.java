/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rjbro
 */
public class Cars {

    private String carName;
    private int year;
    private int carPrice;
    private String carDescripton;
    private String photoPath;
    private int mileage;
    private int prev_owners;
    private int instock;
    private String status;
    
    /**
     * @return the carName
     */
    public String getCarName() {
        return carName;
    }

    /**
     * @param carName the carName to set
     */
    public void setCarName(String carName) {
        this.carName = carName;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the carPrice
     */
    public int getCarPrice() {
        return carPrice;
    }

    /**
     * @param carPrice the carPrice to set
     */
    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    /**
     * @return the carDescripton
     */
    public String getCarDescripton() {
        return carDescripton;
    }

    /**
     * @param carDescripton the carDescripton to set
     */
    public void setCarDescripton(String carDescripton) {
        this.carDescripton = carDescripton;
    }

    /**
     * @return the photoPath
     */
    public String getPhotoPath() {
        return photoPath;
    }

    /**
     * @param photoPath the photoPath to set
     */
    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    /**
     * @return the mileage
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * @param mileage the mileage to set
     */
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    /**
     * @return the prev_owners
     */
    public int getPrev_owners() {
        return prev_owners;
    }

    /**
     * @param prev_owners the prev_owners to set
     */
    public void setPrev_owners(int prev_owners) {
        this.prev_owners = prev_owners;
    }

    /**
     * @return the instock
     */
    public int getInstock() {
        return instock;
    }

    /**
     * @param instock the instock to set
     */
    public void setInstock(int instock) {
        this.instock = instock;
    }
       
    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }
 
    
}