package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.DBUtil;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.driver.SupportSQLiteConnection;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.c.h;
import h.c.j;
import h.d.a;
import h.d.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import h.k;
import h.k.n;
import h.l.c;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.bo;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private DatabaseConfiguration configuration;
    private RoomConnectionManager connectionManager;
    private af coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends Callback> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private j transactionContext;
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));
    private final ThreadLocal<j> suspendingTransactionContext = new ThreadLocal<>();
    private final Map<c<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    public final class JournalMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC = new JournalMode("AUTOMATIC", 0);
        public static final JournalMode TRUNCATE = new JournalMode("TRUNCATE", 1);
        public static final JournalMode WRITE_AHEAD_LOGGING = new JournalMode("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ JournalMode[] $values() {
            return new JournalMode[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        static {
            JournalMode[] journalModeArr$values = $values();
            $VALUES = journalModeArr$values;
            $ENTRIES = b.a(journalModeArr$values);
        }

        private JournalMode(String str, int i2) {
        }

        public static a<JournalMode> getEntries() {
            return $ENTRIES;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }

        public final JournalMode resolve$room_runtime(Context context) {
            x.f(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* compiled from: WazeSource */
    public abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }
    }

    /* compiled from: WazeSource */
    public interface QueryCallback {
        void onQuery(String str, List<? extends Object> list);
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.RoomDatabase$performClear$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name and collision with other inner class name */
        final class C01041 extends g implements p<Transactor, e<? super ab>, Object> {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RoomDatabase this$0;

            /* compiled from: WazeSource */
            /* renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
            final class C01051 extends g implements p<TransactionScope<ab>, e<? super ab>, Object> {
                final /* synthetic */ boolean $hasForeignKeys;
                final /* synthetic */ String[] $tableNames;
                int I$0;
                int I$1;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01051(boolean z, String[] strArr, e<? super C01051> eVar) {
                    super(2, eVar);
                    this.$hasForeignKeys = z;
                    this.$tableNames = strArr;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    C01051 c01051 = new C01051(this.$hasForeignKeys, this.$tableNames, eVar);
                    c01051.L$0 = obj;
                    return c01051;
                }

                @Override // h.g.a.p
                public final Object invoke(TransactionScope<ab> transactionScope, e<? super ab> eVar) {
                    return ((C01051) create(transactionScope, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r10) != r0) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r6, r11, r10) == r0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:19:0x007d). Please report as a decompilation issue!!! */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        h.c.a.a r0 = h.c.a.a.f48038a
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2c
                        if (r1 == r3) goto L24
                        if (r1 != r2) goto L1c
                        int r1 = r10.I$1
                        int r4 = r10.I$0
                        java.lang.Object r5 = r10.L$1
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r10.L$0
                        androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                        e.b.c.b(r11)
                        goto L7d
                    L1c:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L24:
                        java.lang.Object r1 = r10.L$0
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        e.b.c.b(r11)
                        goto L4a
                    L2c:
                        e.b.c.b(r11)
                        java.lang.Object r11 = r10.L$0
                        r1 = r11
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        boolean r11 = r10.$hasForeignKeys
                        if (r11 == 0) goto L4a
                        r11 = r1
                        androidx.room.PooledConnection r11 = (androidx.room.PooledConnection) r11
                        r4 = r10
                        h.c.e r4 = (h.c.e) r4
                        r10.L$0 = r1
                        r10.label = r3
                        java.lang.String r5 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r11 = androidx.room.TransactorKt.execSQL(r11, r5, r4)
                        if (r11 == r0) goto L7c
                    L4a:
                        java.lang.String[] r11 = r10.$tableNames
                        int r4 = r11.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r11
                    L52:
                        if (r4 >= r1) goto L7f
                        r11 = r5[r4]
                        r7 = r6
                        androidx.room.PooledConnection r7 = (androidx.room.PooledConnection) r7
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        java.lang.String r9 = "DELETE FROM `"
                        r8.<init>(r9)
                        r8.append(r11)
                        r11 = 96
                        r8.append(r11)
                        java.lang.String r11 = r8.toString()
                        r10.L$0 = r6
                        r10.L$1 = r5
                        r10.I$0 = r4
                        r10.I$1 = r1
                        r10.label = r2
                        java.lang.Object r11 = androidx.room.TransactorKt.execSQL(r7, r11, r10)
                        if (r11 != r0) goto L7d
                    L7c:
                        return r0
                    L7d:
                        int r4 = r4 + r3
                        goto L52
                    L7f:
                        h.ab r10 = h.ab.f48028a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C01041.C01051.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01041(RoomDatabase roomDatabase, boolean z, String[] strArr, e<? super C01041> eVar) {
                super(2, eVar);
                this.this$0 = roomDatabase;
                this.$hasForeignKeys = z;
                this.$tableNames = strArr;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C01041 c01041 = new C01041(this.this$0, this.$hasForeignKeys, this.$tableNames, eVar);
                c01041.L$0 = obj;
                return c01041;
            }

            @Override // h.g.a.p
            public final Object invoke(Transactor transactor, e<? super ab> eVar) {
                return ((C01041) create(transactor, eVar)).invokeSuspend(ab.f48028a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "VACUUM", r6) != r0) goto L29;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[PHI: r1
  0x0071: PHI (r1v6 androidx.room.Transactor) = (r1v3 androidx.room.Transactor), (r1v3 androidx.room.Transactor), (r1v8 androidx.room.Transactor) binds: [B:15:0x005b, B:17:0x006f, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x008c A[PHI: r1
  0x008c: PHI (r1v9 androidx.room.Transactor) = (r1v6 androidx.room.Transactor), (r1v11 androidx.room.Transactor) binds: [B:19:0x008a, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[PHI: r1 r7
  0x009a: PHI (r1v12 androidx.room.Transactor) = (r1v9 androidx.room.Transactor), (r1v14 androidx.room.Transactor) binds: [B:21:0x0098, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]
  0x009a: PHI (r7v18 java.lang.Object) = (r7v17 java.lang.Object), (r7v0 java.lang.Object) binds: [B:21:0x0098, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
            @Override // h.c.b.a.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instructions count: 232
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C01041.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, String[] strArr, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$hasForeignKeys = z;
            this.$tableNames = strArr;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return RoomDatabase.this.new AnonymousClass1(this.$hasForeignKeys, this.$tableNames, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                RoomConnectionManager roomConnectionManager = RoomDatabase.this.connectionManager;
                if (roomConnectionManager == null) {
                    x.j("connectionManager");
                    roomConnectionManager = null;
                }
                this.label = 1;
                if (roomConnectionManager.useConnection(false, new C01041(RoomDatabase.this, this.$hasForeignKeys, this.$tableNames, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    static final SupportSQLiteOpenHelper createConnectionManager$lambda$2(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        x.f(databaseConfiguration, "config");
        return roomDatabase.createOpenHelper(databaseConfiguration);
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    private final boolean isThreadInSuspendingTransaction() {
        j jVar = this.suspendingTransactionContext.get();
        return (jVar != null ? (TransactionElement) jVar.get(TransactionElement.Key) : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        af afVar = this.coroutineScope;
        RoomConnectionManager roomConnectionManager = null;
        if (afVar == null) {
            x.j("coroutineScope");
            afVar = null;
        }
        aj.h(afVar, null);
        getInvalidationTracker().stop$room_runtime();
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            x.j("connectionManager");
        } else {
            roomConnectionManager = roomConnectionManager2;
        }
        roomConnectionManager.close();
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i2 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    private final <T> T runInTransaction(final h.g.a.a<? extends T> aVar) {
        if (!inCompatibilityMode()) {
            return (T) DBUtil.performBlocking(this, false, true, new l() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return RoomDatabase.runInTransaction$lambda$12(aVar, (SQLiteConnection) obj);
                }
            });
        }
        beginTransaction();
        try {
            T tInvoke = aVar.invoke();
            setTransactionSuccessful();
            return tInvoke;
        } finally {
            endTransaction();
        }
    }

    static final ab runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return ab.f48028a;
    }

    static final Object runInTransaction$lambda$12(h.g.a.a aVar, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "it");
        return aVar.invoke();
    }

    private final /* synthetic */ <T extends SupportSQLiteOpenHelper> T unwrapOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        if (supportSQLiteOpenHelper != null) {
            while (true) {
                x.i();
                if (!(supportSQLiteOpenHelper instanceof SupportSQLiteOpenHelper)) {
                    if (!(supportSQLiteOpenHelper instanceof DelegatingOpenHelper)) {
                        break;
                    }
                    supportSQLiteOpenHelper = (T) ((DelegatingOpenHelper) supportSQLiteOpenHelper).getDelegate();
                } else {
                    return (T) supportSQLiteOpenHelper;
                }
            }
        }
        return null;
    }

    public final void addTypeConverter$room_runtime(c<?> cVar, Object obj) {
        x.f(cVar, "kclass");
        x.f(obj, "converter");
        this.typeConverters.put(cVar, obj);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode() && !inTransaction() && isThreadInSuspendingTransaction()) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    public abstract void clearAllTables();

    public void close() {
        this.closeBarrier.close$room_runtime();
    }

    public SupportSQLiteStatement compileStatement(String str) {
        x.f(str, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(str);
    }

    public List<Migration> createAutoMigrations(Map<c<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> map) {
        x.f(map, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(o.w((c) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final RoomConnectionManager createConnectionManager$room_runtime(DatabaseConfiguration databaseConfiguration) {
        RoomOpenDelegate roomOpenDelegate;
        x.f(databaseConfiguration, "configuration");
        try {
            RoomOpenDelegateMarker roomOpenDelegateMarkerCreateOpenDelegate = createOpenDelegate();
            x.d(roomOpenDelegateMarkerCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            roomOpenDelegate = (RoomOpenDelegate) roomOpenDelegateMarkerCreateOpenDelegate;
        } catch (h.j unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(databaseConfiguration, (l<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper>) new l() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return RoomDatabase.createConnectionManager$lambda$2(this.f$0, (DatabaseConfiguration) obj);
            }
        }, new RoomDatabase$createConnectionManager$2(this)) : new RoomConnectionManager(databaseConfiguration, roomOpenDelegate, new RoomDatabase$createConnectionManager$3(this));
    }

    protected abstract InvalidationTracker createInvalidationTracker();

    protected RoomOpenDelegateMarker createOpenDelegate() {
        throw new h.j();
    }

    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        x.f(databaseConfiguration, "config");
        throw new h.j();
    }

    public void endTransaction() {
        internalEndTransaction();
    }

    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        x.f(map, "autoMigrationSpecs");
        return i.h();
    }

    public final CloseBarrier getCloseBarrier$room_runtime() {
        return this.closeBarrier;
    }

    public final af getCoroutineScope() {
        af afVar = this.coroutineScope;
        if (afVar != null) {
            return afVar;
        }
        x.j("coroutineScope");
        return null;
    }

    public final SQLiteDriver getDriver() {
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration == null) {
            x.j("configuration");
            databaseConfiguration = null;
        }
        SQLiteDriver sQLiteDriver = databaseConfiguration.sqliteDriver;
        if (sQLiteDriver != null) {
            return sQLiteDriver;
        }
        throw new IllegalStateException("No SQLiteDriver was configured with Room.");
    }

    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        x.j("internalTracker");
        return null;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            x.j("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime = roomConnectionManager.getSupportOpenHelper$room_runtime();
        if (supportOpenHelper$room_runtime != null) {
            return supportOpenHelper$room_runtime;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final String getPath() {
        DatabaseConfiguration databaseConfiguration = this.configuration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            x.j("configuration");
            databaseConfiguration = null;
        }
        String str = databaseConfiguration.name;
        if (str == null) {
            return null;
        }
        DatabaseConfiguration databaseConfiguration3 = this.configuration;
        if (databaseConfiguration3 == null) {
            x.j("configuration");
        } else {
            databaseConfiguration2 = databaseConfiguration3;
        }
        return databaseConfiguration2.context.getDatabasePath(str).getPath();
    }

    public final j getQueryContext() {
        af afVar = this.coroutineScope;
        if (afVar == null) {
            x.j("coroutineScope");
            afVar = null;
        }
        return afVar.getCoroutineContext();
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        x.j("internalQueryExecutor");
        return null;
    }

    public Set<c<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(i.q(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(o.y((Class) it.next()));
        }
        return i.au(arrayList);
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return e.c.d.a.p();
    }

    protected Map<c<?>, List<c<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.h(r.a(i.q(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            c cVarY = o.y(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(i.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(o.y((Class) it2.next()));
            }
            k kVar = new k(cVarY, arrayList);
            linkedHashMap.put(kVar.c(), kVar.d());
        }
        return linkedHashMap;
    }

    public final Map<c<?>, List<c<?>>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return r.j();
    }

    public final ThreadLocal<j> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    public final j getTransactionContext$room_runtime() {
        j jVar = this.transactionContext;
        if (jVar != null) {
            return jVar;
        }
        x.j("transactionContext");
        return null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        x.j("internalTransactionExecutor");
        return null;
    }

    public final <T> T getTypeConverter(c<T> cVar) {
        x.f(cVar, "klass");
        T t = (T) this.typeConverters.get(cVar);
        x.d(t, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t;
    }

    public final boolean getUseTempTrackingTable$room_runtime() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            x.j("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.getSupportOpenHelper$room_runtime() != null;
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    public void init(DatabaseConfiguration databaseConfiguration) {
        j coroutineContext;
        x.f(databaseConfiguration, "configuration");
        this.configuration = databaseConfiguration;
        this.useTempTrackingTable = databaseConfiguration.getUseTempTrackingTable$room_runtime();
        this.connectionManager = createConnectionManager$room_runtime(databaseConfiguration);
        this.internalTracker = createInvalidationTracker();
        RoomDatabaseKt.validateAutoMigrations(this, databaseConfiguration);
        RoomDatabaseKt.validateTypeConverters(this, databaseConfiguration);
        j jVar = databaseConfiguration.queryCoroutineContext;
        af afVar = null;
        if (jVar != null) {
            h hVar = jVar.get(h.c.g.f48059a);
            x.d(hVar, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            kotlinx.coroutines.ab abVar = (kotlinx.coroutines.ab) hVar;
            this.internalQueryExecutor = bo.e(abVar);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                x.j("internalQueryExecutor");
                executor = null;
            }
            this.internalTransactionExecutor = new TransactionExecutor(executor);
            this.coroutineScope = aj.e(databaseConfiguration.queryCoroutineContext.plus(aj.P((br) databaseConfiguration.queryCoroutineContext.get(br.f51766a))));
            boolean zInCompatibilityMode = inCompatibilityMode();
            af afVar2 = this.coroutineScope;
            if (zInCompatibilityMode) {
                if (afVar2 == null) {
                    x.j("coroutineScope");
                    afVar2 = null;
                }
                coroutineContext = afVar2.getCoroutineContext().plus(abVar.limitedParallelism(1));
            } else {
                if (afVar2 == null) {
                    x.j("coroutineScope");
                    afVar2 = null;
                }
                coroutineContext = afVar2.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = databaseConfiguration.queryExecutor;
            this.internalTransactionExecutor = new TransactionExecutor(databaseConfiguration.transactionExecutor);
            Executor executor2 = this.internalQueryExecutor;
            if (executor2 == null) {
                x.j("internalQueryExecutor");
                executor2 = null;
            }
            af afVarE = aj.e(bo.f(executor2).plus(aj.Q()));
            this.coroutineScope = afVarE;
            if (afVarE == null) {
                x.j("coroutineScope");
                afVarE = null;
            }
            j coroutineContext2 = afVarE.getCoroutineContext();
            Executor executor3 = this.internalTransactionExecutor;
            if (executor3 == null) {
                x.j("internalTransactionExecutor");
                executor3 = null;
            }
            this.transactionContext = coroutineContext2.plus(bo.f(executor3));
        }
        this.allowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            x.j("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime = roomConnectionManager.getSupportOpenHelper$room_runtime();
        if (supportOpenHelper$room_runtime != null) {
            while (!(supportOpenHelper$room_runtime instanceof PrePackagedCopyOpenHelper)) {
                if (!(supportOpenHelper$room_runtime instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime = null;
                    break;
                }
                supportOpenHelper$room_runtime = ((DelegatingOpenHelper) supportOpenHelper$room_runtime).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime = null;
            break;
        }
        PrePackagedCopyOpenHelper prePackagedCopyOpenHelper = (PrePackagedCopyOpenHelper) supportOpenHelper$room_runtime;
        if (prePackagedCopyOpenHelper != null) {
            prePackagedCopyOpenHelper.setDatabaseConfiguration(databaseConfiguration);
        }
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            x.j("connectionManager");
            roomConnectionManager2 = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime2 = roomConnectionManager2.getSupportOpenHelper$room_runtime();
        if (supportOpenHelper$room_runtime2 != null) {
            while (!(supportOpenHelper$room_runtime2 instanceof AutoClosingRoomOpenHelper)) {
                if (!(supportOpenHelper$room_runtime2 instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime2 = null;
                    break;
                }
                supportOpenHelper$room_runtime2 = ((DelegatingOpenHelper) supportOpenHelper$room_runtime2).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime2 = null;
            break;
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) supportOpenHelper$room_runtime2;
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.getAutoCloser$room_runtime();
            AutoCloser autoCloser$room_runtime = autoClosingRoomOpenHelper.getAutoCloser$room_runtime();
            af afVar3 = this.coroutineScope;
            if (afVar3 == null) {
                x.j("coroutineScope");
            } else {
                afVar = afVar3;
            }
            autoCloser$room_runtime.initCoroutineScope(afVar);
            getInvalidationTracker().setAutoCloser$room_runtime(autoClosingRoomOpenHelper.getAutoCloser$room_runtime());
        }
        if (databaseConfiguration.multiInstanceInvalidationServiceIntent != null) {
            if (databaseConfiguration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            getInvalidationTracker().initMultiInstanceInvalidation$room_runtime(databaseConfiguration.context, databaseConfiguration.name, databaseConfiguration.multiInstanceInvalidationServiceIntent);
        }
    }

    protected void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        internalInitInvalidationTracker(new SupportSQLiteConnection(supportSQLiteDatabase));
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            x.j("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    public final boolean isOpenInternal$room_runtime() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            SupportSQLiteDatabase delegateDatabase$room_runtime = autoCloser.getDelegateDatabase$room_runtime();
            if (delegateDatabase$room_runtime != null) {
                return delegateDatabase$room_runtime.isOpen();
            }
            return false;
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            x.j("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    protected final void performClear(boolean z, String... strArr) {
        x.f(strArr, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(z, strArr, null));
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        x.f(supportSQLiteQuery, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().getWritableDatabase().query(supportSQLiteQuery, cancellationSignal) : getOpenHelper().getWritableDatabase().query(supportSQLiteQuery);
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z) {
        this.useTempTrackingTable = z;
    }

    public final <R> Object useConnection(boolean z, p<? super Transactor, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            x.j("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.useConnection(z, pVar, eVar);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    public class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private final List<AutoMigrationSpec> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SQLiteDriver driver;
        private final h.g.a.a<T> factory;
        private boolean inMemoryTrackingTableMode;
        private JournalMode journalMode;
        private final c<T> klass;
        private final MigrationContainer migrationContainer;
        private final Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private j queryCallbackCoroutineContext;
        private Executor queryCallbackExecutor;
        private j queryCoroutineContext;
        private Executor queryExecutor;
        private boolean requireMigration;
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        public Builder(Context context, Class<T> cls, String str) {
            x.f(context, "context");
            x.f(cls, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = o.y(cls);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        public Builder<T> addAutoMigrationSpec(AutoMigrationSpec autoMigrationSpec) {
            x.f(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        public Builder<T> addCallback(Callback callback) {
            x.f(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public Builder<T> addMigrations(Migration... migrationArr) {
            x.f(migrationArr, "migrations");
            for (Migration migration : migrationArr) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrationArr, migrationArr.length));
            return this;
        }

        public Builder<T> addTypeConverter(Object obj) {
            x.f(obj, "typeConverter");
            this.typeConverters.add(obj);
            return this;
        }

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public T build() {
            QueryInterceptorOpenHelperFactory queryInterceptorOpenHelperFactory;
            SupportSQLiteOpenHelper.Factory factory;
            T tInvoke;
            kotlinx.coroutines.ab abVarF;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.validateMigrationsNotRequired(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            } else {
                SupportSQLiteOpenHelper.Factory factory2 = this.supportOpenHelperFactory;
                if (sQLiteDriver == null) {
                    queryInterceptorOpenHelperFactory = factory2;
                } else {
                    if (factory2 != null) {
                        throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                    }
                    queryInterceptorOpenHelperFactory = null;
                }
            }
            long j2 = this.autoCloseTimeout;
            boolean z = j2 > 0;
            boolean z2 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z3 = this.queryCallback != null;
            if (queryInterceptorOpenHelperFactory != null) {
                if (z) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j2, timeUnit, null, 4, null));
                }
                if (z2) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i2 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i3 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i2 + i3 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    queryInterceptorOpenHelperFactory = new PrePackagedCopyOpenHelperFactory(str, file, callable, queryInterceptorOpenHelperFactory);
                }
                if (z3) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if (executor2 != null) {
                        abVarF = bo.f(executor2);
                    } else {
                        abVarF = this.queryCallbackCoroutineContext;
                        if (abVarF == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    af afVarE = aj.e(abVarF);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, afVarE, queryCallback);
                }
                factory = queryInterceptorOpenHelperFactory;
            } else {
                factory = null;
            }
            if (factory == null) {
                if (z) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z2) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
                if (z3) {
                    throw new IllegalArgumentException("Query Callback is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z4 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime = this.journalMode.resolve$room_runtime(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z4, journalModeResolve$room_runtime, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            databaseConfiguration.setUseTempTrackingTable$room_runtime(this.inMemoryTrackingTableMode);
            h.g.a.a<T> aVar = this.factory;
            if (aVar == null || (tInvoke = aVar.invoke()) == null) {
                tInvoke = (T) KClassUtil.findAndInstantiateDatabaseImpl$default(o.w(this.klass), null, 2, null);
            }
            tInvoke.init(databaseConfiguration);
            return tInvoke;
        }

        public Builder<T> createFromAsset(String str, PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            x.f(str, "databaseFilePath");
            x.f(prepackagedDatabaseCallback, "callback");
            this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.copyFromAssetPath = str;
            return this;
        }

        public Builder<T> createFromFile(File file, PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            x.f(file, "databaseFile");
            x.f(prepackagedDatabaseCallback, "callback");
            this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.copyFromFile = file;
            return this;
        }

        public Builder<T> createFromInputStream(Callable<InputStream> callable, PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
            x.f(callable, "inputStreamCallable");
            x.f(prepackagedDatabaseCallback, "callback");
            this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
            this.copyFromInputStream = callable;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigration(boolean z) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(boolean z, int... iArr) {
            x.f(iArr, "startVersions");
            for (int i2 : iArr) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i2));
            }
            this.allowDestructiveMigrationForAllTables = z;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean z) {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = z;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        public Builder<T> setAutoCloseTimeout(long j2, TimeUnit timeUnit) {
            x.f(timeUnit, "autoCloseTimeUnit");
            if (j2 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.autoCloseTimeout = j2;
            this.autoCloseTimeUnit = timeUnit;
            return this;
        }

        public final Builder<T> setDriver(SQLiteDriver sQLiteDriver) {
            x.f(sQLiteDriver, "driver");
            this.driver = sQLiteDriver;
            return this;
        }

        public final Builder<T> setInMemoryTrackingMode(boolean z) {
            this.inMemoryTrackingTableMode = z;
            return this;
        }

        public Builder<T> setJournalMode(JournalMode journalMode) {
            x.f(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        public Builder<T> setMultiInstanceInvalidationServiceIntent(Intent intent) {
            x.f(intent, "invalidationServiceIntent");
            if (this.name == null) {
                intent = null;
            }
            this.multiInstanceInvalidationIntent = intent;
            return this;
        }

        public Builder<T> setQueryCallback(QueryCallback queryCallback, Executor executor) {
            x.f(queryCallback, "queryCallback");
            x.f(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            this.queryCallbackCoroutineContext = null;
            return this;
        }

        public final Builder<T> setQueryCoroutineContext(j jVar) {
            x.f(jVar, "context");
            if (this.queryExecutor != null || this.transactionExecutor != null) {
                throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
            }
            if (jVar.get(h.c.g.f48059a) == null) {
                throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
            }
            this.queryCoroutineContext = jVar;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor executor) {
            x.f(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }

        public Builder<T> setTransactionExecutor(Executor executor) {
            x.f(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.transactionExecutor = executor;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder<T> createFromAsset(String str) {
            x.f(str, "databaseFilePath");
            this.copyFromAssetPath = str;
            return this;
        }

        public Builder<T> createFromFile(File file) {
            x.f(file, "databaseFile");
            this.copyFromFile = file;
            return this;
        }

        public Builder<T> createFromInputStream(Callable<InputStream> callable) {
            x.f(callable, "inputStreamCallable");
            this.copyFromInputStream = callable;
            return this;
        }

        public final Builder<T> setQueryCallback(j jVar, QueryCallback queryCallback) {
            x.f(jVar, "context");
            x.f(queryCallback, "queryCallback");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = null;
            this.queryCallbackCoroutineContext = jVar;
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(int... iArr) {
            x.f(iArr, "startVersions");
            for (int i2 : iArr) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i2));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(c<T> cVar, String str, h.g.a.a<? extends T> aVar, Context context) {
            x.f(cVar, "klass");
            x.f(context, "context");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = cVar;
            this.context = context;
            this.name = str;
            this.factory = aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void internalInitInvalidationTracker(SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "connection");
        getInvalidationTracker().internalInit$room_runtime(sQLiteConnection);
    }

    public <T> T getTypeConverter(Class<T> cls) {
        x.f(cls, "klass");
        return (T) this.typeConverters.get(o.y(cls));
    }

    /* compiled from: WazeSource */
    public abstract class Callback {
        public void onCreate(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                onCreate(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }

        public void onDestructiveMigration(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                onDestructiveMigration(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }

        public void onOpen(SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                onOpen(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }

        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }

        public void onDestructiveMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }

        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            x.f(supportSQLiteDatabase, "db");
        }
    }

    /* compiled from: WazeSource */
    public class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        public final void addMigration(Migration migration) {
            x.f(migration, "migration");
            int i2 = migration.startVersion;
            int i3 = migration.endVersion;
            Integer numValueOf = Integer.valueOf(i2);
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            TreeMap<Integer, Migration> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            TreeMap<Integer, Migration> treeMap3 = treeMap2;
            Integer numValueOf2 = Integer.valueOf(i3);
            if (treeMap3.containsKey(numValueOf2)) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(numValueOf2) + " with " + migration);
            }
            treeMap3.put(numValueOf2, migration);
        }

        public void addMigrations(List<? extends Migration> list) {
            x.f(list, "migrations");
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int i2, int i3) {
            return MigrationUtil.contains(this, i2, i3);
        }

        public List<Migration> findMigrationPath(int i2, int i3) {
            return MigrationUtil.findMigrationPath(this, i2, i3);
        }

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public final k<Map<Integer, Migration>, Iterable<Integer>> getSortedDescendingNodes$room_runtime(int i2) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i2));
            if (treeMap == null) {
                return null;
            }
            return new k<>(treeMap, treeMap.descendingKeySet());
        }

        public final k<Map<Integer, Migration>, Iterable<Integer>> getSortedNodes$room_runtime(int i2) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(i2));
            if (treeMap == null) {
                return null;
            }
            return new k<>(treeMap, treeMap.keySet());
        }

        public void addMigrations(Migration... migrationArr) {
            x.f(migrationArr, "migrations");
            for (Migration migration : migrationArr) {
                addMigration(migration);
            }
        }
    }

    public <V> V runInTransaction(final Callable<V> callable) {
        x.f(callable, TtmlNode.TAG_BODY);
        return (V) runInTransaction(new h.g.a.a() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda2
            @Override // h.g.a.a
            public final Object invoke() {
                return callable.call();
            }
        });
    }

    public void runInTransaction(final Runnable runnable) {
        x.f(runnable, TtmlNode.TAG_BODY);
        runInTransaction(new h.g.a.a() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return RoomDatabase.runInTransaction$lambda$10(runnable);
            }
        });
    }

    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        x.f(supportSQLiteQuery, "query");
        return query$default(this, supportSQLiteQuery, null, 2, null);
    }

    public Cursor query(String str, Object[] objArr) {
        x.f(str, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(str, objArr));
    }
}
