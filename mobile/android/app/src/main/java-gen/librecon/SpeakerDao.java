package librecon;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import librecon.Speaker;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table SPEAKER.
*/
public class SpeakerDao extends AbstractDao<Speaker, Long> {

    public static final String TABLENAME = "SPEAKER";

    /**
     * Properties of entity Speaker.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Company = new Property(2, String.class, "company", false, "COMPANY");
        public final static Property Position = new Property(3, String.class, "position", false, "POSITION");
        public final static Property DescriptionEs = new Property(4, String.class, "descriptionEs", false, "DESCRIPTION_ES");
        public final static Property DescriptionEu = new Property(5, String.class, "descriptionEu", false, "DESCRIPTION_EU");
        public final static Property DescriptionEn = new Property(6, String.class, "descriptionEn", false, "DESCRIPTION_EN");
        public final static Property PicUrl = new Property(7, String.class, "picUrl", false, "PIC_URL");
        public final static Property Links = new Property(8, String.class, "links", false, "LINKS");
        public final static Property Tags = new Property(9, String.class, "tags", false, "TAGS");
        public final static Property PicUrlCircle = new Property(10, String.class, "picUrlCircle", false, "PIC_URL_CIRCLE");
    };


    public SpeakerDao(DaoConfig config) {
        super(config);
    }
    
    public SpeakerDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'SPEAKER' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NAME' TEXT," + // 1: name
                "'COMPANY' TEXT," + // 2: company
                "'POSITION' TEXT," + // 3: position
                "'DESCRIPTION_ES' TEXT," + // 4: descriptionEs
                "'DESCRIPTION_EU' TEXT," + // 5: descriptionEu
                "'DESCRIPTION_EN' TEXT," + // 6: descriptionEn
                "'PIC_URL' TEXT," + // 7: picUrl
                "'LINKS' TEXT," + // 8: links
                "'TAGS' TEXT," + // 9: tags
                "'PIC_URL_CIRCLE' TEXT);"); // 10: picUrlCircle
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'SPEAKER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Speaker entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String company = entity.getCompany();
        if (company != null) {
            stmt.bindString(3, company);
        }
 
        String position = entity.getPosition();
        if (position != null) {
            stmt.bindString(4, position);
        }
 
        String descriptionEs = entity.getDescriptionEs();
        if (descriptionEs != null) {
            stmt.bindString(5, descriptionEs);
        }
 
        String descriptionEu = entity.getDescriptionEu();
        if (descriptionEu != null) {
            stmt.bindString(6, descriptionEu);
        }
 
        String descriptionEn = entity.getDescriptionEn();
        if (descriptionEn != null) {
            stmt.bindString(7, descriptionEn);
        }
 
        String picUrl = entity.getPicUrl();
        if (picUrl != null) {
            stmt.bindString(8, picUrl);
        }
 
        String links = entity.getLinks();
        if (links != null) {
            stmt.bindString(9, links);
        }
 
        String tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(10, tags);
        }
 
        String picUrlCircle = entity.getPicUrlCircle();
        if (picUrlCircle != null) {
            stmt.bindString(11, picUrlCircle);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Speaker readEntity(Cursor cursor, int offset) {
        Speaker entity = new Speaker( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // company
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // position
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // descriptionEs
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // descriptionEu
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // descriptionEn
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // picUrl
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // links
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // tags
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // picUrlCircle
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Speaker entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setCompany(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setPosition(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setDescriptionEs(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDescriptionEu(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setDescriptionEn(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setPicUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLinks(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setTags(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPicUrlCircle(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Speaker entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Speaker entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
