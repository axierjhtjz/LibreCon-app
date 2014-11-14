package librecon;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Locale;

/**
 * Entity mapped to table TXOKO.
 */
public class Txoko implements Parcelable {

    private Long id;
    private String titleEs;
    private String titleEu;
    private String titleEn;
    private String textEs;
    private String textEu;
    private String textEn;
    private String picUrl;
    private Integer orderField;

    public Txoko() {
    }

    public Txoko(Long id) {
        this.id = id;
    }

    public Txoko(Long id, String titleEs, String titleEu, String titleEn, String textEs, String textEu, String textEn, String picUrl, Integer orderField) {
        this.id = id;
        this.titleEs = titleEs;
        this.titleEu = titleEu;
        this.titleEn = titleEn;
        this.textEs = textEs;
        this.textEu = textEu;
        this.textEn = textEn;
        this.picUrl = picUrl;
        this.orderField = orderField;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleEs() {
        return titleEs;
    }

    public void setTitleEs(String titleEs) {
        this.titleEs = titleEs;
    }

    public String getTitleEu() {
        return titleEu;
    }

    public void setTitleEu(String titleEu) {
        this.titleEu = titleEu;
    }

    public String getTitleEn() {
        return titleEn;
    }

    public void setTitleEn(String titleEn) {
        this.titleEn = titleEn;
    }

    public String getTextEs() {
        return textEs;
    }

    public void setTextEs(String textEs) {
        this.textEs = textEs;
    }

    public String getTextEu() {
        return textEu;
    }

    public void setTextEu(String textEu) {
        this.textEu = textEu;
    }

    public String getTextEn() {
        return textEn;
    }

    public void setTextEn(String textEn) {
        this.textEn = textEn;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Integer getOrderField() {
        return orderField;
    }

    public void setOrderField(Integer orderField) {
        this.orderField = orderField;
    }

    public String getTitle() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language.equals("eu"))
            return this.titleEu;
        else if (language.equals("en"))
            return this.titleEn;
        else
            return this.titleEs;
    }

    public String getText() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language.equals("eu"))
            return this.textEu;
        else if (language.equals("en"))
            return this.textEn;
        else
            return this.textEs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.titleEs);
        dest.writeString(this.titleEu);
        dest.writeString(this.titleEn);
        dest.writeString(this.textEs);
        dest.writeString(this.textEu);
        dest.writeString(this.textEn);
        dest.writeString(this.picUrl);
        dest.writeValue(this.orderField);
    }

    private Txoko(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.titleEs = in.readString();
        this.titleEu = in.readString();
        this.titleEn = in.readString();
        this.textEs = in.readString();
        this.textEu = in.readString();
        this.textEn = in.readString();
        this.picUrl = in.readString();
        this.orderField = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Creator<Txoko> CREATOR = new Creator<Txoko>() {
        public Txoko createFromParcel(Parcel source) {
            return new Txoko(source);
        }

        public Txoko[] newArray(int size) {
            return new Txoko[size];
        }
    };
}
