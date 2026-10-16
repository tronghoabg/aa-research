package androidx.room;

import androidx.media3.common.C;
import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.concurrent.ExclusiveLock;
import androidx.room.migration.Migration;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.SQLiteStatement;
import e.b.c;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import h.k;
import h.m;
import h.n.o;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class BaseRoomConnectionManager {
    public static final int BUSY_TIMEOUT_MS = 3000;
    public static final Companion Companion = new Companion(null);
    private boolean isConfigured;
    private boolean isInitializing;

    /* compiled from: WazeSource */
    public final class DriverWrapper implements SQLiteDriver {
        private final SQLiteDriver actual;
        final /* synthetic */ BaseRoomConnectionManager this$0;

        public DriverWrapper(BaseRoomConnectionManager baseRoomConnectionManager, SQLiteDriver sQLiteDriver) {
            x.f(sQLiteDriver, "actual");
            this.this$0 = baseRoomConnectionManager;
            this.actual = sQLiteDriver;
        }

        private final SQLiteConnection openLocked(final String str) {
            boolean z = false;
            if (!this.this$0.isConfigured && !this.this$0.isInitializing && !x.n(str, ":memory:")) {
                z = true;
            }
            ExclusiveLock exclusiveLock = new ExclusiveLock(str, z);
            final BaseRoomConnectionManager baseRoomConnectionManager = this.this$0;
            return (SQLiteConnection) exclusiveLock.withLock(new a() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$$ExternalSyntheticLambda0
                @Override // h.g.a.a
                public final Object invoke() {
                    return BaseRoomConnectionManager.DriverWrapper.openLocked$lambda$1(baseRoomConnectionManager, this, str);
                }
            }, new l() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2
                @Override // h.g.a.l
                public final Void invoke(Throwable th) {
                    x.f(th, "error");
                    throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
                }
            });
        }

        static final SQLiteConnection openLocked$lambda$1(BaseRoomConnectionManager baseRoomConnectionManager, DriverWrapper driverWrapper, String str) throws Exception {
            if (baseRoomConnectionManager.isInitializing) {
                throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
            }
            SQLiteConnection sQLiteConnectionOpen = driverWrapper.actual.open(str);
            if (baseRoomConnectionManager.isConfigured) {
                baseRoomConnectionManager.configurationConnection(sQLiteConnectionOpen);
                return sQLiteConnectionOpen;
            }
            try {
                baseRoomConnectionManager.isInitializing = true;
                baseRoomConnectionManager.configureDatabase(sQLiteConnectionOpen);
                return sQLiteConnectionOpen;
            } finally {
                baseRoomConnectionManager.isInitializing = false;
            }
        }

        @Override // androidx.sqlite.SQLiteDriver
        public boolean hasConnectionPool() {
            return this.actual.hasConnectionPool();
        }

        @Override // androidx.sqlite.SQLiteDriver
        public SQLiteConnection open(String str) {
            x.f(str, "fileName");
            return openLocked(this.this$0.resolveFileName$room_runtime(str));
        }
    }

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[RoomDatabase.JournalMode.TRUNCATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void checkIdentity(SQLiteConnection sQLiteConnection) throws Exception {
        Object objA;
        RoomOpenDelegate.ValidationResult validationResultOnValidateSchema;
        if (hasRoomMasterTable(sQLiteConnection)) {
            SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(RoomMasterTable.READ_QUERY);
            try {
                SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
                String text = sQLiteStatement.step() ? sQLiteStatement.getText(0) : null;
                r.y(sQLiteStatementPrepare, null);
                if (x.n(getOpenDelegate().getIdentityHash(), text) || x.n(getOpenDelegate().getLegacyIdentityHash(), text)) {
                    return;
                }
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + text);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    r.y(sQLiteStatementPrepare, th);
                    throw th2;
                }
            }
        }
        SQLite.execSQL(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            BaseRoomConnectionManager baseRoomConnectionManager = this;
            validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(sQLiteConnection);
        } catch (Throwable th3) {
            objA = c.a(th3);
        }
        if (!validationResultOnValidateSchema.isValid) {
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultOnValidateSchema.expectedFoundMsg);
        }
        getOpenDelegate().onPostMigrate(sQLiteConnection);
        updateIdentity(sQLiteConnection);
        objA = ab.f48028a;
        if (m.e(objA)) {
            SQLite.execSQL(sQLiteConnection, "END TRANSACTION");
        }
        Throwable thC = m.c(objA);
        if (thC == null) {
            return;
        }
        SQLite.execSQL(sQLiteConnection, "ROLLBACK TRANSACTION");
        throw thC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configurationConnection(SQLiteConnection sQLiteConnection) throws Exception {
        configureBusyTimeout(sQLiteConnection);
        configureSynchronousFlag(sQLiteConnection);
        getOpenDelegate().onOpen(sQLiteConnection);
    }

    private final void configureBusyTimeout(SQLiteConnection sQLiteConnection) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA busy_timeout");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            long j2 = sQLiteStatement.getLong(0);
            r.y(sQLiteStatementPrepare, null);
            if (j2 < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                SQLite.execSQL(sQLiteConnection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r.y(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void configureDatabase(SQLiteConnection sQLiteConnection) throws Exception {
        Object objA;
        configureBusyTimeout(sQLiteConnection);
        configureJournalMode(sQLiteConnection);
        configureSynchronousFlag(sQLiteConnection);
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA user_version");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            int i2 = (int) sQLiteStatement.getLong(0);
            r.y(sQLiteStatementPrepare, null);
            if (i2 != getOpenDelegate().getVersion()) {
                SQLite.execSQL(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    BaseRoomConnectionManager baseRoomConnectionManager = this;
                    if (i2 == 0) {
                        onCreate(sQLiteConnection);
                    } else {
                        onMigrate(sQLiteConnection, i2, getOpenDelegate().getVersion());
                    }
                    SQLite.execSQL(sQLiteConnection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objA = ab.f48028a;
                } catch (Throwable th) {
                    objA = c.a(th);
                }
                if (m.e(objA)) {
                    SQLite.execSQL(sQLiteConnection, "END TRANSACTION");
                }
                Throwable thC = m.c(objA);
                if (thC != null) {
                    SQLite.execSQL(sQLiteConnection, "ROLLBACK TRANSACTION");
                    throw thC;
                }
            }
            onOpen(sQLiteConnection);
        } finally {
        }
    }

    private final void configureJournalMode(SQLiteConnection sQLiteConnection) throws Exception {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(sQLiteConnection, "PRAGMA journal_mode = WAL");
        } else {
            SQLite.execSQL(sQLiteConnection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void configureSynchronousFlag(SQLiteConnection sQLiteConnection) throws Exception {
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING) {
            SQLite.execSQL(sQLiteConnection, "PRAGMA synchronous = NORMAL");
        } else {
            SQLite.execSQL(sQLiteConnection, "PRAGMA synchronous = FULL");
        }
    }

    private final void createMasterTableIfNotExists(SQLiteConnection sQLiteConnection) throws Exception {
        SQLite.execSQL(sQLiteConnection, RoomMasterTable.CREATE_QUERY);
    }

    private final void dropAllTables(SQLiteConnection sQLiteConnection) throws Exception {
        if (!getConfiguration().allowDestructiveMigrationForAllTables) {
            getOpenDelegate().dropAllTables(sQLiteConnection);
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            List listB = i.b();
            while (sQLiteStatement.step()) {
                String text = sQLiteStatement.getText(0);
                if (!o.ah(text, "sqlite_") && !x.n(text, "android_metadata")) {
                    listB.add(new k(text, Boolean.valueOf(x.n(sQLiteStatement.getText(1), "view"))));
                }
            }
            List<k> listA = i.a(listB);
            r.y(sQLiteStatementPrepare, null);
            for (k kVar : listA) {
                String str = (String) kVar.a();
                if (((Boolean) kVar.b()).booleanValue()) {
                    SQLite.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS `" + str + '`');
                } else {
                    SQLite.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS `" + str + '`');
                }
            }
        } finally {
        }
    }

    private final boolean hasEmptySchema(SQLiteConnection sQLiteConnection) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            boolean z = false;
            if (sQLiteStatement.step()) {
                if (sQLiteStatement.getLong(0) == 0) {
                    z = true;
                }
            }
            r.y(sQLiteStatementPrepare, null);
            return z;
        } finally {
        }
    }

    private final boolean hasRoomMasterTable(SQLiteConnection sQLiteConnection) throws Exception {
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            boolean z = false;
            if (sQLiteStatement.step()) {
                if (sQLiteStatement.getLong(0) != 0) {
                    z = true;
                }
            }
            r.y(sQLiteStatementPrepare, null);
            return z;
        } finally {
        }
    }

    private final void invokeCreateCallback(SQLiteConnection sQLiteConnection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onCreate(sQLiteConnection);
        }
    }

    private final void invokeDestructiveMigrationCallback(SQLiteConnection sQLiteConnection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onDestructiveMigration(sQLiteConnection);
        }
    }

    private final void invokeOpenCallback(SQLiteConnection sQLiteConnection) {
        Iterator<T> it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).onOpen(sQLiteConnection);
        }
    }

    private final void updateIdentity(SQLiteConnection sQLiteConnection) throws Exception {
        createMasterTableIfNotExists(sQLiteConnection);
        SQLite.execSQL(sQLiteConnection, RoomMasterTable.createInsertQuery(getOpenDelegate().getIdentityHash()));
    }

    protected abstract List<RoomDatabase.Callback> getCallbacks();

    protected abstract DatabaseConfiguration getConfiguration();

    protected final int getMaxNumberOfReaders(RoomDatabase.JournalMode journalMode) {
        x.f(journalMode, "<this>");
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.AUTOMATIC;
        int iOrdinal = journalMode.ordinal();
        if (iOrdinal == 1) {
            return 1;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        throw new IllegalStateException("Can't get max number of reader for journal mode '" + journalMode + '\'');
    }

    protected final int getMaxNumberOfWriters(RoomDatabase.JournalMode journalMode) {
        x.f(journalMode, "<this>");
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.AUTOMATIC;
        int iOrdinal = journalMode.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return 1;
        }
        throw new IllegalStateException("Can't get max number of writers for journal mode '" + journalMode + '\'');
    }

    protected abstract RoomOpenDelegate getOpenDelegate();

    protected final void onCreate(SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "connection");
        boolean zHasEmptySchema = hasEmptySchema(sQLiteConnection);
        getOpenDelegate().createAllTables(sQLiteConnection);
        if (!zHasEmptySchema) {
            RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(sQLiteConnection);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: ".concat(String.valueOf(validationResultOnValidateSchema.expectedFoundMsg)));
            }
        }
        updateIdentity(sQLiteConnection);
        getOpenDelegate().onCreate(sQLiteConnection);
        invokeCreateCallback(sQLiteConnection);
    }

    protected final void onMigrate(SQLiteConnection sQLiteConnection, int i2, int i3) {
        x.f(sQLiteConnection, "connection");
        List<Migration> listFindMigrationPath = MigrationUtil.findMigrationPath(getConfiguration().migrationContainer, i2, i3);
        if (listFindMigrationPath != null) {
            getOpenDelegate().onPreMigrate(sQLiteConnection);
            Iterator<T> it = listFindMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(sQLiteConnection);
            }
            RoomOpenDelegate.ValidationResult validationResultOnValidateSchema = getOpenDelegate().onValidateSchema(sQLiteConnection);
            if (!validationResultOnValidateSchema.isValid) {
                throw new IllegalStateException("Migration didn't properly handle: ".concat(String.valueOf(validationResultOnValidateSchema.expectedFoundMsg)));
            }
            getOpenDelegate().onPostMigrate(sQLiteConnection);
            updateIdentity(sQLiteConnection);
            return;
        }
        if (!MigrationUtil.isMigrationRequired(getConfiguration(), i2, i3)) {
            dropAllTables(sQLiteConnection);
            invokeDestructiveMigrationCallback(sQLiteConnection);
            getOpenDelegate().createAllTables(sQLiteConnection);
        } else {
            throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.");
        }
    }

    protected final void onOpen(SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "connection");
        checkIdentity(sQLiteConnection);
        getOpenDelegate().onOpen(sQLiteConnection);
        invokeOpenCallback(sQLiteConnection);
        this.isConfigured = true;
    }

    public String resolveFileName$room_runtime(String str) {
        x.f(str, "fileName");
        return str;
    }

    public abstract <R> Object useConnection(boolean z, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar);

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
