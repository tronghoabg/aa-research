package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import h.a.i;
import h.c.j;
import h.g.b.x;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationForAllTables;
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;
    public final List<AutoMigrationSpec> autoMigrationSpecs;
    public final List<RoomDatabase.Callback> callbacks;
    public final Context context;
    public final String copyFromAssetPath;
    public final File copyFromFile;
    public final Callable<InputStream> copyFromInputStream;
    public final RoomDatabase.JournalMode journalMode;
    public final RoomDatabase.MigrationContainer migrationContainer;
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;
    public final Intent multiInstanceInvalidationServiceIntent;
    public final String name;
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    private int preparedStatementCacheSize;
    public final j queryCoroutineContext;
    public final Executor queryExecutor;
    public final boolean requireMigration;
    public final SQLiteDriver sqliteDriver;
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;
    public final Executor transactionExecutor;
    public final List<Object> typeConverters;
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3, boolean z4, SQLiteDriver sQLiteDriver, j jVar) {
        x.f(context, "context");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
        x.f(list2, "typeConverters");
        x.f(list3, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = factory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z;
        this.journalMode = journalMode;
        this.queryExecutor = executor;
        this.transactionExecutor = executor2;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z2;
        this.allowDestructiveMigrationOnDowngrade = z3;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = list2;
        this.autoMigrationSpecs = list3;
        this.allowDestructiveMigrationForAllTables = z4;
        this.sqliteDriver = sQLiteDriver;
        this.queryCoroutineContext = jVar;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
        this.preparedStatementCacheSize = 25;
    }

    public static /* synthetic */ DatabaseConfiguration copy$default(DatabaseConfiguration databaseConfiguration, Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List list2, List list3, boolean z4, SQLiteDriver sQLiteDriver, j jVar, int i2, Object obj) {
        j jVar2;
        SQLiteDriver sQLiteDriver2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i2 & 1) != 0 ? databaseConfiguration.context : context;
        String str3 = (i2 & 2) != 0 ? databaseConfiguration.name : str;
        SupportSQLiteOpenHelper.Factory factory2 = (i2 & 4) != 0 ? databaseConfiguration.sqliteOpenHelperFactory : factory;
        RoomDatabase.MigrationContainer migrationContainer2 = (i2 & 8) != 0 ? databaseConfiguration.migrationContainer : migrationContainer;
        List list4 = (i2 & 16) != 0 ? databaseConfiguration.callbacks : list;
        boolean z5 = (i2 & 32) != 0 ? databaseConfiguration.allowMainThreadQueries : z;
        RoomDatabase.JournalMode journalMode2 = (i2 & 64) != 0 ? databaseConfiguration.journalMode : journalMode;
        Executor executor3 = (i2 & 128) != 0 ? databaseConfiguration.queryExecutor : executor;
        Executor executor4 = (i2 & 256) != 0 ? databaseConfiguration.transactionExecutor : executor2;
        Intent intent2 = (i2 & 512) != 0 ? databaseConfiguration.multiInstanceInvalidationServiceIntent : intent;
        boolean z6 = (i2 & 1024) != 0 ? databaseConfiguration.requireMigration : z2;
        boolean z7 = (i2 & 2048) != 0 ? databaseConfiguration.allowDestructiveMigrationOnDowngrade : z3;
        Set set2 = (i2 & 4096) != 0 ? databaseConfiguration.migrationNotRequiredFrom : set;
        String str4 = (i2 & 8192) != 0 ? databaseConfiguration.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i2 & 16384) != 0 ? databaseConfiguration.copyFromFile : file;
        Callable callable2 = (i2 & 32768) != 0 ? databaseConfiguration.copyFromInputStream : callable;
        RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2 = (i2 & 65536) != 0 ? databaseConfiguration.prepackagedDatabaseCallback : prepackagedDatabaseCallback;
        List list5 = (i2 & 131072) != 0 ? databaseConfiguration.typeConverters : list2;
        List list6 = (i2 & 262144) != 0 ? databaseConfiguration.autoMigrationSpecs : list3;
        boolean z8 = (i2 & 524288) != 0 ? databaseConfiguration.allowDestructiveMigrationForAllTables : z4;
        SQLiteDriver sQLiteDriver3 = (i2 & 1048576) != 0 ? databaseConfiguration.sqliteDriver : sQLiteDriver;
        if ((i2 & 2097152) != 0) {
            sQLiteDriver2 = sQLiteDriver3;
            jVar2 = databaseConfiguration.queryCoroutineContext;
        } else {
            jVar2 = jVar;
            sQLiteDriver2 = sQLiteDriver3;
        }
        return databaseConfiguration.copy(context3, str3, factory2, migrationContainer2, list4, z5, journalMode2, executor3, executor4, intent2, z6, z7, set2, str4, file2, callable2, prepackagedDatabaseCallback2, list5, list6, z8, sQLiteDriver2, jVar2);
    }

    public final DatabaseConfiguration copy(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3, boolean z4, SQLiteDriver sQLiteDriver, j jVar) {
        x.f(context, "context");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
        x.f(list2, "typeConverters");
        x.f(list3, "autoMigrationSpecs");
        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, prepackagedDatabaseCallback, list2, list3, z4, sQLiteDriver, jVar);
        databaseConfiguration.useTempTrackingTable = this.useTempTrackingTable;
        databaseConfiguration.preparedStatementCacheSize = this.preparedStatementCacheSize;
        return databaseConfiguration;
    }

    public final Set<Integer> getMigrationNotRequiredFrom$room_runtime() {
        return this.migrationNotRequiredFrom;
    }

    public final int getPreparedStatementCacheSize$room_runtime() {
        return this.preparedStatementCacheSize;
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public boolean isMigrationRequired(int i2, int i3) {
        return MigrationUtil.isMigrationRequired(this, i2, i3);
    }

    public boolean isMigrationRequiredFrom(int i2) {
        return isMigrationRequired(i2, i2 + 1);
    }

    public final void setPreparedStatementCacheSize$room_runtime(int i2) {
        this.preparedStatementCacheSize = i2;
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, null, list2, list3, false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
        x.f(list2, "typeConverters");
        x.f(list3, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, null, null, null, null, i.h(), i.h(), false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z2, boolean z3, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3, boolean z4) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, null, list2, list3, z4, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
        x.f(list2, "typeConverters");
        x.f(list3, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, null, null, i.h(), i.h(), false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, null, i.h(), i.h(), false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, i.h(), i.h(), false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, prepackagedDatabaseCallback, list2, i.h(), false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
        x.f(list2, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file, Callable<InputStream> callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List<? extends Object> list2, List<? extends AutoMigrationSpec> list3) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor2, z2 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z3, z4, set, str2, file, callable, null, list2, list3, false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
        x.f(executor2, "transactionExecutor");
        x.f(list2, "typeConverters");
        x.f(list3, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List<? extends RoomDatabase.Callback> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, boolean z2, Set<Integer> set) {
        this(context, str, factory, migrationContainer, list, z, journalMode, executor, executor, null, z2, false, set, null, null, null, null, i.h(), i.h(), false, null, null);
        x.f(context, "context");
        x.f(factory, "sqliteOpenHelperFactory");
        x.f(migrationContainer, "migrationContainer");
        x.f(journalMode, "journalMode");
        x.f(executor, "queryExecutor");
    }
}
