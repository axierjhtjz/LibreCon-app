package librecon;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Locale;

/**
 * Entity mapped to table SPEAKER.
 */
public class Speaker implements Parcelable {

    private Long id;
    private String name;
    private String company;
    private String position;
    private String descriptionEs;
    private String descriptionEu;
    private String descriptionEn;
    private String picUrl;
    private String links;
    private String tags;
    private String picUrlCircle;

    public Speaker() {
    }

    public Speaker(Long id) {
        this.id = id;
    }

    public Speaker(Long id, String name, String company, String position, String descriptionEs, String descriptionEu, String descriptionEn, String picUrl, String links, String tags, String picUrlCircle) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.position = position;
        this.descriptionEs = descriptionEs;
        this.descriptionEu = descriptionEu;
        this.descriptionEn = descriptionEn;
        this.picUrl = picUrl;
        this.links = links;
        this.tags = tags;
        this.picUrlCircle = picUrlCircle;
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

    public String getDescriptionEs() {
        return descriptionEs;
    }

    public void setDescriptionEs(String descriptionEs) {
        this.descriptionEs = descriptionEs;
    }

    public String getDescriptionEu() {
        return descriptionEu;
    }

    public void setDescriptionEu(String descriptionEu) {
        this.descriptionEu = descriptionEu;
    }

    public String getDescriptionEn() {
        return descriptionEn;
    }

    public void setDescriptionEn(String descriptionEn) {
        this.descriptionEn = descriptionEn;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPicUrlCircle() {
        return picUrlCircle;
    }

    public void setPicUrlCircle(String picUrlCircle) {
        this.picUrlCircle = picUrlCircle;
    }

    public String getDescription() {
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        if (language.equals("eu"))
            return this.descriptionEu;
        else if (language.equals("en"))
            return this.descriptionEn;
        else
            return this.descriptionEs;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.name);
        dest.writeString(this.company);
        dest.writeString(this.position);
        dest.writeString(this.descriptionEs);
        dest.writeString(this.descriptionEu);
        dest.writeString(this.descriptionEn);
        dest.writeString(this.picUrl);
        dest.writeString(this.links);
        dest.writeString(this.tags);
        dest.writeString(this.picUrlCircle);
    }

    private Speaker(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.company = in.readString();
        this.position = in.readString();
        this.descriptionEs = in.readString();
        this.descriptionEu = in.readString();
        this.descriptionEn = in.readString();
        this.picUrl = in.readString();
        this.links = in.readString();
        this.tags = in.readString();
        this.picUrlCircle = in.readString();
    }

    public static final Creator<Speaker> CREATOR = new Creator<Speaker>() {
        public Speaker createFromParcel(Parcel source) {
            return new Speaker(source);
        }

        public Speaker[] newArray(int size) {
            return new Speaker[size];
        }
    };
}
