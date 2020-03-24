package com.shuaiyu.mvpyu;

import android.app.Application;
import android.content.Context;

import com.shuaiyu.mvpyu.db.DaoMaster;
import com.shuaiyu.mvpyu.db.DaoSession;
import com.shuaiyu.mvpyu.db.GreenDaoManager;

import org.greenrobot.greendao.database.Database;

public class MyApp extends Application {
    private DaoSession daoSession;
    public static Context context;
    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        // encrypted SQLCipher database
        // note: you need to add SQLCipher to your dependencies, check the build.gradle file
        // DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "notes-db-encrypted");
        // Database db = helper.getEncryptedWritableDb("encryption-key");
        GreenDaoManager.getInstance();
    }
    public static   Context getContext(){
        return context;
    }

}
