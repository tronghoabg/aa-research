package androidx.room.support;

import android.content.Context;
import android.util.Log;
import androidx.room.DatabaseConfiguration;
import androidx.room.DelegatingOpenHelper;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.FileUtil;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.util.ProcessLock;
import h.a.i;
import h.g.b.x;
import h.k.n;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class PrePackagedCopyOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final Context context;
    private final String copyFromAssetPath;
    private final File copyFromFile;
    private final Callable<InputStream> copyFromInputStream;
    private DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public PrePackagedCopyOpenHelper(Context context, String str, File file, Callable<InputStream> callable, int i2, SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        x.f(context, "context");
        x.f(supportSQLiteOpenHelper, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i2;
        this.delegate = supportSQLiteOpenHelper;
    }

    private final void copyDatabaseFile(File file, boolean z) throws IOException {
        FileChannel fileChannelNewChannel;
        String str = this.copyFromAssetPath;
        if (str != null) {
            fileChannelNewChannel = Channels.newChannel(this.context.getAssets().open(str));
            x.e(fileChannelNewChannel, "newChannel(...)");
        } else {
            File file2 = this.copyFromFile;
            if (file2 != null) {
                FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(file2).getChannel());
                x.e(fileChannelConvertMaybeLegacyFileChannelFromLibrary, "getChannel(...)");
                fileChannelNewChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
            } else {
                Callable<InputStream> callable = this.copyFromInputStream;
                if (callable == null) {
                    throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
                }
                try {
                    fileChannelNewChannel = Channels.newChannel(callable.call());
                    x.e(fileChannelNewChannel, "newChannel(...)");
                } catch (Exception e2) {
                    throw new IOException("inputStreamCallable exception on call", e2);
                }
            }
        }
        File fileCreateTempFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        fileCreateTempFile.deleteOnExit();
        FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary2 = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileOutputStream(fileCreateTempFile).getChannel());
        x.c(fileChannelConvertMaybeLegacyFileChannelFromLibrary2);
        FileUtil.copy(fileChannelNewChannel, fileChannelConvertMaybeLegacyFileChannelFromLibrary2);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for ".concat(String.valueOf(file.getAbsolutePath())));
        }
        x.c(fileCreateTempFile);
        dispatchOnOpenPrepackagedDatabase(fileCreateTempFile, z);
        if (fileCreateTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + fileCreateTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final SupportSQLiteOpenHelper createFrameworkOpenHelper(File file) {
        try {
            final int version = DBUtil.readVersion(file);
            FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            SupportSQLiteOpenHelper.Configuration.Builder builderName = SupportSQLiteOpenHelper.Configuration.Companion.builder(this.context).name(file.getAbsolutePath());
            final int iH = n.h(version, 1);
            return frameworkSQLiteOpenHelperFactory.create(builderName.callback(new SupportSQLiteOpenHelper.Callback(iH) { // from class: androidx.room.support.PrePackagedCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                    x.f(supportSQLiteDatabase, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                    x.f(supportSQLiteDatabase, "db");
                    int i2 = version;
                    if (i2 <= 0) {
                        supportSQLiteDatabase.setVersion(i2);
                    }
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
                    x.f(supportSQLiteDatabase, "db");
                }
            }).build());
        } catch (IOException e2) {
            throw new RuntimeException("Malformed database file, unable to read version.", e2);
        }
    }

    private final void dispatchOnOpenPrepackagedDatabase(File file, boolean z) throws IOException {
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            x.j("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperCreateFrameworkOpenHelper = createFrameworkOpenHelper(file);
        try {
            SupportSQLiteOpenHelper supportSQLiteOpenHelper = supportSQLiteOpenHelperCreateFrameworkOpenHelper;
            SupportSQLiteDatabase writableDatabase = z ? supportSQLiteOpenHelper.getWritableDatabase() : supportSQLiteOpenHelper.getReadableDatabase();
            DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                x.j("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            x.c(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            i.aW(supportSQLiteOpenHelperCreateFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final void verifyDatabaseFile(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName == null) {
            throw new IllegalStateException("Required value was null.");
        }
        File databasePath = this.context.getDatabasePath(databaseName);
        DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            x.j("databaseConfiguration");
            databaseConfiguration = null;
        }
        ProcessLock processLock = new ProcessLock(databaseName, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            ProcessLock.lock$default(processLock, false, 1, null);
            if (databasePath.exists()) {
                try {
                    x.c(databasePath);
                    int version = DBUtil.readVersion(databasePath);
                    if (version != this.databaseVersion) {
                        DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                        if (databaseConfiguration3 == null) {
                            x.j("databaseConfiguration");
                            databaseConfiguration3 = null;
                        }
                        if (databaseConfiguration3.migrationContainer.findMigrationPath(version, this.databaseVersion) == null) {
                            DatabaseConfiguration databaseConfiguration4 = this.databaseConfiguration;
                            if (databaseConfiguration4 == null) {
                                x.j("databaseConfiguration");
                            } else {
                                databaseConfiguration2 = databaseConfiguration4;
                            }
                            if (!databaseConfiguration2.isMigrationRequired(version, this.databaseVersion)) {
                                if (this.context.deleteDatabase(databaseName)) {
                                    try {
                                        copyDatabaseFile(databasePath, z);
                                    } catch (IOException e2) {
                                        Log.w(Room.LOG_TAG, "Unable to copy database file.", e2);
                                    }
                                } else {
                                    Log.w(Room.LOG_TAG, "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                                }
                            }
                        }
                    }
                } catch (IOException e3) {
                    Log.w(Room.LOG_TAG, "Unable to read database version.", e3);
                }
            } else {
                try {
                    x.c(databasePath);
                    copyDatabaseFile(databasePath, z);
                } catch (IOException e4) {
                    throw new RuntimeException("Unable to copy database file.", e4);
                }
            }
        } finally {
            processLock.unlock();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return getDelegate().getDatabaseName();
    }

    @Override // androidx.room.DelegatingOpenHelper
    public SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    public final void setDatabaseConfiguration(DatabaseConfiguration databaseConfiguration) {
        x.f(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        getDelegate().setWriteAheadLoggingEnabled(z);
    }
}
