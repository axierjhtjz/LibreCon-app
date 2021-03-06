package librecon;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Entity mapped to table ME.
 */
public class Me implements Parcelable {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String cellPhone;
    private String company;
    private String position;
    private String picUrl;
    private String picUrlCircle;
    private String address;
    private String location;
    private String country;
    private String postalCode;
    private String hash;

    public Me() {
    }

    public Me(Long id) {
        this.id = id;
    }

    public Me(Long id, String name, String lastName, String email, String cellPhone, String company, String position, String picUrl, String picUrlCircle, String address, String location, String country, String postalCode, String hash) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.cellPhone = cellPhone;
        this.company = company;
        this.position = position;
        this.picUrl = picUrl;
        this.picUrlCircle = picUrlCircle;
        this.address = address;
        this.location = location;
        this.country = country;
        this.postalCode = postalCode;
        this.hash = hash;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPicUrlCircle() {
        return picUrlCircle;
    }

    public void setPicUrlCircle(String picUrlCircle) {
        this.picUrlCircle = picUrlCircle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.lastName);
        dest.writeString(this.email);
        dest.writeString(this.cellPhone);
        dest.writeString(this.company);
        dest.writeString(this.position);
        dest.writeString(this.picUrl);
        dest.writeString(this.picUrlCircle);
        dest.writeString(this.address);
        dest.writeString(this.location);
        dest.writeString(this.country);
        dest.writeString(this.postalCode);
        dest.writeString(this.hash);
    }

    private Me(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.lastName = in.readString();
        this.email = in.readString();
        this.cellPhone = in.readString();
        this.company = in.readString();
        this.position = in.readString();
        this.picUrl = in.readString();
        this.picUrlCircle = in.readString();
        this.address = in.readString();
        this.location = in.readString();
        this.country = in.readString();
        this.postalCode = in.readString();
        this.hash = in.readString();
    }

    public static final Creator<Me> CREATOR = new Creator<Me>() {
        public Me createFromParcel(Parcel source) {
            return new Me(source);
        }

        public Me[] newArray(int size) {
            return new Me[size];
        }
    };
}
