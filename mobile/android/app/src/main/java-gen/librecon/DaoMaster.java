package librecon;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import de.greenrobot.dao.AbstractDaoMaster;
import de.greenrobot.dao.identityscope.IdentityScopeType;

import librecon.AssistantDao;
import librecon.SpeakerDao;
import librecon.ScheduleDao;
import librecon.ScheduleSpeakerDao;
import librecon.TagDao;
import librecon.SponsorDao;
import librecon.ExpositorDao;
import librecon.TxokoDao;
import librecon.LastModifiedDao;
import librecon.MeDao;
import librecon.MeetingDao;
import librecon.AssistantMeetingDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * Master of DAO (schema version 19): knows all DAOs.
*/
public class DaoMaster extends AbstractDaoMaster {
    public static final int SCHEMA_VERSION = 19;

    /** Creates underlying database table using DAOs. */
    public static void createAllTables(SQLiteDatabase db, boolean ifNotExists) {
        AssistantDao.createTable(db, ifNotExists);
        SpeakerDao.createTable(db, ifNotExists);
        ScheduleDao.createTable(db, ifNotExists);
        ScheduleSpeakerDao.createTable(db, ifNotExists);
        TagDao.createTable(db, ifNotExists);
        SponsorDao.createTable(db, ifNotExists);
        ExpositorDao.createTable(db, ifNotExists);
        TxokoDao.createTable(db, ifNotExists);
        LastModifiedDao.createTable(db, ifNotExists);
        MeDao.createTable(db, ifNotExists);
        MeetingDao.createTable(db, ifNotExists);
        AssistantMeetingDao.createTable(db, ifNotExists);
    }
    
    /** Drops underlying database table using DAOs. */
    public static void dropAllTables(SQLiteDatabase db, boolean ifExists) {
        AssistantDao.dropTable(db, ifExists);
        SpeakerDao.dropTable(db, ifExists);
        ScheduleDao.dropTable(db, ifExists);
        ScheduleSpeakerDao.dropTable(db, ifExists);
        TagDao.dropTable(db, ifExists);
        SponsorDao.dropTable(db, ifExists);
        ExpositorDao.dropTable(db, ifExists);
        TxokoDao.dropTable(db, ifExists);
        LastModifiedDao.dropTable(db, ifExists);
        MeDao.dropTable(db, ifExists);
        MeetingDao.dropTable(db, ifExists);
        AssistantMeetingDao.dropTable(db, ifExists);
    }
    
    public static abstract class OpenHelper extends SQLiteOpenHelper {

        public OpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory, SCHEMA_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            Log.i("greenDAO", "Creating tables for schema version " + SCHEMA_VERSION);
            createAllTables(db, false);
        }
    }
    
    /** WARNING: Drops all table on Upgrade! Use only during development. */
    public static class DevOpenHelper extends OpenHelper {
        public DevOpenHelper(Context context, String name, CursorFactory factory) {
            super(context, name, factory);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            Log.i("greenDAO", "Upgrading schema from version " + oldVersion + " to " + newVersion + " by dropping all tables");
            dropAllTables(db, true);
            onCreate(db);
        }
    }

    public DaoMaster(SQLiteDatabase db) {
        super(db, SCHEMA_VERSION);
        registerDaoClass(AssistantDao.class);
        registerDaoClass(SpeakerDao.class);
        registerDaoClass(ScheduleDao.class);
        registerDaoClass(ScheduleSpeakerDao.class);
        registerDaoClass(TagDao.class);
        registerDaoClass(SponsorDao.class);
        registerDaoClass(ExpositorDao.class);
        registerDaoClass(TxokoDao.class);
        registerDaoClass(LastModifiedDao.class);
        registerDaoClass(MeDao.class);
        registerDaoClass(MeetingDao.class);
        registerDaoClass(AssistantMeetingDao.class);
    }
    
    public DaoSession newSession() {
        return new DaoSession(db, IdentityScopeType.Session, daoConfigMap);
    }
    
    public DaoSession newSession(IdentityScopeType type) {
        return new DaoSession(db, type, daoConfigMap);
    }
    
}