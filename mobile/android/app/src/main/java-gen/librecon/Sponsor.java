package librecon;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Locale;

/**
 * Entity mapped to table SPONSOR.
 */
public class Sponsor implements Parcelable {

    private Long id;
    private String nameEs;
    private String nameEu;
    private String nameEn;
    private String picUrl;
    private String url;
    private Integer orderField;

    public Sponsor() {
    }

    public Sponsor(Long id) {
        this.id = id;
    }

    public Sponsor(Long id, String nameEs, String nameEu, String nameEn, String picUrl, String url, Integer orderField) {
        this.id = id;
        this.nameEs = nameEs;
        this.nameEu = nameEu;
        this.nameEn = nameEn;
        this.picUrl = picUrl;
        this.url = url;
        this.orderField = orderField;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEs() {
        return nameEs;
    }

    public void setNameEs(String nameEs) {
        this.nameEs = nameEs;
    }

    public String getNameEu() {
        return nameEu;
    }

    public void setNameEu(String nameEu) {
        this.nameEu = nameEu;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getOrderField() {
        return orderField;
    }

    public void setOrderField(Integer orderField) {
        this.orderField = orderField;
    }

    public String getName() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language.equals("eu")) {
            return this.nameEu;
        } else if (language.equals("en"))
            return this.nameEn;
        else
            return this.nameEs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.nameEs);
        dest.writeString(this.nameEu);
        dest.writeString(this.nameEn);
        dest.writeString(this.picUrl);
        dest.writeString(this.url);
        dest.writeValue(this.orderField);
    }

    private Sponsor(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.nameEs = in.readString();
        this.nameEu = in.readString();
        this.nameEn = in.readString();
        this.picUrl = in.readString();
        this.url = in.readString();
        this.orderField = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<Sponsor> CREATOR = new Creator<Sponsor>() {
        public Sponsor createFromParcel(Parcel source) {
            return new Sponsor(source);
        }

        public Sponsor[] newArray(int size) {
            return new Sponsor[size];
        }
    };
}
