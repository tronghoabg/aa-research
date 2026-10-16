package androidx.room;

import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.coroutines.PassthroughConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.SupportSQLiteConnection;
import androidx.sqlite.driver.SupportSQLiteDriver;
import h.a.i;
import h.ab;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class RoomConnectionManager extends BaseRoomConnectionManager {
    private final List<RoomDatabase.Callback> callbacks;
    private final DatabaseConfiguration configuration;
    private final ConnectionPool connectionPool;
    private final RoomOpenDelegate openDelegate;
    private SupportSQLiteDatabase supportDatabase;
    private final SupportSQLiteOpenHelper supportOpenHelper;

    /* compiled from: WazeSource */
    final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    /* compiled from: WazeSource */
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i2) {
            super(i2);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(supportSQLiteDatabase));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onDowngrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
            x.f(supportSQLiteDatabase, "db");
            onUpgrade(supportSQLiteDatabase, i2, i3);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
            RoomConnectionManager.this.onOpen(new SupportSQLiteConnection(supportSQLiteDatabase));
            RoomConnectionManager.this.supportDatabase = supportSQLiteDatabase;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(SupportSQLiteDatabase supportSQLiteDatabase, int i2, int i3) {
            x.f(supportSQLiteDatabase, "db");
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(supportSQLiteDatabase), i2, i3);
        }
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, RoomOpenDelegate roomOpenDelegate, p<? super l<? super e<Object>, ? extends Object>, ? super e<Object>, ? extends Object> pVar) {
        PassthroughConnectionPool passthroughConnectionPoolNewConnectionPool;
        x.f(databaseConfiguration, "config");
        x.f(roomOpenDelegate, "openDelegate");
        x.f(pVar, "transactionWrapper");
        this.configuration = databaseConfiguration;
        this.openDelegate = roomOpenDelegate;
        List<RoomDatabase.Callback> list = databaseConfiguration.callbacks;
        this.callbacks = list == null ? i.h() : list;
        SQLiteDriver sQLiteDriver = databaseConfiguration.sqliteDriver;
        if (sQLiteDriver != null) {
            this.supportOpenHelper = null;
            if (sQLiteDriver.hasConnectionPool()) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, databaseConfiguration.sqliteDriver);
                String str = databaseConfiguration.name;
                passthroughConnectionPoolNewConnectionPool = new PassthroughConnectionPool(driverWrapper, str != null ? str : ":memory:", pVar);
            } else if (databaseConfiguration.name == null) {
                passthroughConnectionPoolNewConnectionPool = ConnectionPoolKt.newSingleConnectionPool(new BaseRoomConnectionManager.DriverWrapper(this, databaseConfiguration.sqliteDriver), ":memory:", databaseConfiguration.getPreparedStatementCacheSize$room_runtime());
            } else {
                BaseRoomConnectionManager.DriverWrapper driverWrapper2 = new BaseRoomConnectionManager.DriverWrapper(this, databaseConfiguration.sqliteDriver);
                String str2 = databaseConfiguration.name;
                int maxNumberOfReaders = getMaxNumberOfReaders(databaseConfiguration.journalMode);
                getMaxNumberOfWriters(databaseConfiguration.journalMode);
                passthroughConnectionPoolNewConnectionPool = ConnectionPoolKt.newConnectionPool(driverWrapper2, str2, maxNumberOfReaders, 1, databaseConfiguration.getPreparedStatementCacheSize$room_runtime());
            }
            this.connectionPool = passthroughConnectionPoolNewConnectionPool;
        } else {
            if (databaseConfiguration.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            SupportSQLiteOpenHelper supportSQLiteOpenHelperCreate = databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.Companion.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new SupportOpenHelperCallback(roomOpenDelegate.getVersion())).build());
            this.supportOpenHelper = supportSQLiteOpenHelperCreate;
            SupportSQLiteDriver supportSQLiteDriver = new SupportSQLiteDriver(supportSQLiteOpenHelperCreate);
            String str3 = databaseConfiguration.name;
            this.connectionPool = new PassthroughConnectionPool(supportSQLiteDriver, str3 != null ? str3 : ":memory:", pVar);
        }
        init();
    }

    static final ab _init_$lambda$1(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        roomConnectionManager.supportDatabase = supportSQLiteDatabase;
        return ab.f48028a;
    }

    private final void init() {
        RoomDatabase.JournalMode journalMode = getConfiguration().journalMode;
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.supportOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.setWriteAheadLoggingEnabled(journalMode == journalMode2);
        }
    }

    private final DatabaseConfiguration installOnOpenCallback(DatabaseConfiguration databaseConfiguration, final l<? super SupportSQLiteDatabase, ab> lVar) {
        List<RoomDatabase.Callback> listH = databaseConfiguration.callbacks;
        if (listH == null) {
            listH = i.h();
        }
        return DatabaseConfiguration.copy$default(databaseConfiguration, null, null, null, null, i.ag(listH, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                x.f(supportSQLiteDatabase, "db");
                lVar.invoke(supportSQLiteDatabase);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    public final void close() {
        this.connectionPool.close();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.supportOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
        }
    }

    @Override // androidx.room.BaseRoomConnectionManager
    protected List<RoomDatabase.Callback> getCallbacks() {
        return this.callbacks;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    protected DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    public final ConnectionPool getConnectionPool$room_runtime() {
        return this.connectionPool;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    protected RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    public final SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime() {
        return this.supportOpenHelper;
    }

    public final boolean isSupportDatabaseOpen() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public String resolveFileName$room_runtime(String str) {
        x.f(str, "fileName");
        if (x.n(str, ":memory:")) {
            return str;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(str).getAbsolutePath();
        x.c(absolutePath);
        return absolutePath;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public <R> Object useConnection(boolean z, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return this.connectionPool.useConnection(z, pVar, eVar);
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, l<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper> lVar, p<? super l<? super e<Object>, ? extends Object>, ? super e<Object>, ? extends Object> pVar) {
        x.f(databaseConfiguration, "config");
        x.f(lVar, "supportOpenHelperFactory");
        x.f(pVar, "transactionWrapper");
        this.configuration = databaseConfiguration;
        this.openDelegate = new NoOpOpenDelegate();
        List<RoomDatabase.Callback> list = databaseConfiguration.callbacks;
        this.callbacks = list == null ? i.h() : list;
        SupportSQLiteOpenHelper supportSQLiteOpenHelperInvoke = lVar.invoke(installOnOpenCallback(databaseConfiguration, new l() { // from class: androidx.room.RoomConnectionManager$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RoomConnectionManager._init_$lambda$1(this.f$0, (SupportSQLiteDatabase) obj);
            }
        }));
        this.supportOpenHelper = supportSQLiteOpenHelperInvoke;
        SupportSQLiteDriver supportSQLiteDriver = new SupportSQLiteDriver(supportSQLiteOpenHelperInvoke);
        String str = databaseConfiguration.name;
        this.connectionPool = new PassthroughConnectionPool(supportSQLiteDriver, str == null ? ":memory:" : str, pVar);
        init();
    }
}
