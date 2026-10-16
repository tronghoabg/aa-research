package androidx.room;

import androidx.room.TriggerBasedInvalidationTracker;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.r;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import h.n.o;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class TriggerBasedInvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String DROP_TRACKING_TABLE_SQL = "DROP TABLE IF EXISTS room_table_modification_log";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";
    private static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1";
    private static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    private final RoomDatabase database;
    private final ObservedTableStates observedTableStates;
    private final ObservedTableVersions observedTableVersions;
    private a<Boolean> onAllowRefresh;
    private final l<Set<Integer>, ab> onInvalidatedTablesIds;
    private final AtomicBoolean pendingRefresh;
    private final Map<String, String> shadowTablesMap;
    private final Map<String, Integer> tableIdLookup;
    private final String[] tablesNames;
    private final boolean useTempTable;
    private final Map<String, Set<String>> viewTables;
    public static final Companion Companion = new Companion(null);
    private static final String[] TRIGGERS = {"INSERT", "UPDATE", "DELETE"};

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.checkInvalidatedTables(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1, reason: invalid class name and case insensitive filesystem */
    final class C04531 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C04531(e<? super C04531> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.notifyInvalidation(this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$startTrackingTable$1, reason: invalid class name and case insensitive filesystem */
    final class C04541 extends c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04541(e<? super C04541> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.startTrackingTable(null, 0, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1, reason: invalid class name and case insensitive filesystem */
    final class C04551 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C04551(e<? super C04551> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TriggerBasedInvalidationTracker.this.stopTrackingTable(null, 0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TriggerBasedInvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, ? extends Set<String>> map2, String[] strArr, boolean z, l<? super Set<Integer>, ab> lVar) {
        String lowerCase;
        x.f(roomDatabase, "database");
        x.f(map, "shadowTablesMap");
        x.f(map2, "viewTables");
        x.f(strArr, "tableNames");
        x.f(lVar, "onInvalidatedTablesIds");
        this.database = roomDatabase;
        this.shadowTablesMap = map;
        this.viewTables = map2;
        this.useTempTable = z;
        this.onInvalidatedTablesIds = lVar;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new a() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                TriggerBasedInvalidationTracker.Companion companion = TriggerBasedInvalidationTracker.Companion;
                return true;
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String lowerCase2 = strArr[i2].toLowerCase(Locale.ROOT);
            x.e(lowerCase2, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i2));
            String str = this.shadowTablesMap.get(strArr[i2]);
            if (str != null) {
                lowerCase = str.toLowerCase(Locale.ROOT);
                x.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr2[i2] = lowerCase2;
        }
        this.tablesNames = strArr2;
        for (Map.Entry<String, String> entry : this.shadowTablesMap.entrySet()) {
            String lowerCase3 = entry.getValue().toLowerCase(Locale.ROOT);
            x.e(lowerCase3, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = entry.getKey().toLowerCase(Locale.ROOT);
                x.e(lowerCase4, "toLowerCase(...)");
                Map<String, Integer> map3 = this.tableIdLookup;
                map3.put(lowerCase4, r.h(map3, lowerCase3));
            }
        }
        this.observedTableStates = new ObservedTableStates(this.tablesNames.length);
        this.observedTableVersions = new ObservedTableVersions(this.tablesNames.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object checkInvalidatedTables(androidx.room.PooledConnection r5, h.c.e<? super java.util.Set<java.lang.Integer>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.room.TriggerBasedInvalidationTracker.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$checkInvalidatedTables$1
            r0.<init>(r6)
        L18:
            java.lang.Object r4 = r0.result
            h.c.a.a r6 = h.c.a.a.f48038a
            int r1 = r0.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.L$0
            java.util.Set r5 = (java.util.Set) r5
            e.b.c.b(r4)
            return r5
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            java.lang.Object r5 = r0.L$0
            androidx.room.PooledConnection r5 = (androidx.room.PooledConnection) r5
            e.b.c.b(r4)
            goto L52
        L3e:
            e.b.c.b(r4)
            androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda0 r4 = new androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda0
            r4.<init>()
            r0.L$0 = r5
            r0.label = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.usePrepared(r1, r4, r0)
            if (r4 == r6) goto L6a
        L52:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L69
            r0.L$0 = r4
            r0.label = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = androidx.room.TransactorKt.execSQL(r5, r1, r0)
            if (r5 == r6) goto L6a
        L69:
            return r4
        L6a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.checkInvalidatedTables(androidx.room.PooledConnection, h.c.e):java.lang.Object");
    }

    static final Set checkInvalidatedTables$lambda$14(SQLiteStatement sQLiteStatement) {
        x.f(sQLiteStatement, "statement");
        Set setM = e.c.d.a.m();
        while (sQLiteStatement.step()) {
            setM.add(Integer.valueOf((int) sQLiteStatement.getLong(0)));
        }
        return e.c.d.a.l(setM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object notifyInvalidation(h.c.e<? super java.util.Set<java.lang.Integer>> r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.room.TriggerBasedInvalidationTracker.C04531
            if (r0 == 0) goto L13
            r0 = r9
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.C04531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            androidx.room.concurrent.CloseBarrier r0 = (androidx.room.concurrent.CloseBarrier) r0
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L83
        L2b:
            r8 = move-exception
            goto L9f
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            e.b.c.b(r9)
            androidx.room.RoomDatabase r9 = r8.database
            androidx.room.concurrent.CloseBarrier r9 = r9.getCloseBarrier$room_runtime()
            boolean r2 = r9.block$room_runtime()
            if (r2 == 0) goto La3
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.pendingRefresh     // Catch: java.lang.Throwable -> L9d
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L56
            java.util.Set r8 = e.c.d.a.p()     // Catch: java.lang.Throwable -> L9d
            r9.unblock$room_runtime()
            return r8
        L56:
            h.g.a.a<java.lang.Boolean> r2 = r8.onAllowRefresh     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L9d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L9d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L6c
            java.util.Set r8 = e.c.d.a.p()     // Catch: java.lang.Throwable -> L9d
            r9.unblock$room_runtime()
            return r8
        L6c:
            androidx.room.RoomDatabase r2 = r8.database     // Catch: java.lang.Throwable -> L9d
            androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 r5 = new androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1     // Catch: java.lang.Throwable -> L9d
            r6 = 0
            r5.<init>(r8, r6)     // Catch: java.lang.Throwable -> L9d
            h.g.a.p r5 = (h.g.a.p) r5     // Catch: java.lang.Throwable -> L9d
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L9d
            r0.label = r3     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r2.useConnection(r4, r5, r0)     // Catch: java.lang.Throwable -> L9d
            if (r0 == r1) goto L9c
            r7 = r0
            r0 = r9
            r9 = r7
        L83:
            java.util.Set r9 = (java.util.Set) r9     // Catch: java.lang.Throwable -> L2b
            r1 = r9
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L98
            androidx.room.ObservedTableVersions r1 = r8.observedTableVersions     // Catch: java.lang.Throwable -> L2b
            r1.increment(r9)     // Catch: java.lang.Throwable -> L2b
            h.g.a.l<java.util.Set<java.lang.Integer>, h.ab> r8 = r8.onInvalidatedTablesIds     // Catch: java.lang.Throwable -> L2b
            r8.invoke(r9)     // Catch: java.lang.Throwable -> L2b
        L98:
            r0.unblock$room_runtime()
            return r9
        L9c:
            return r1
        L9d:
            r8 = move-exception
            r0 = r9
        L9f:
            r0.unblock$room_runtime()
            throw r8
        La3:
            java.util.Set r8 = e.c.d.a.p()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.notifyInvalidation(h.c.e):java.lang.Object");
    }

    static final boolean onAllowRefresh$lambda$0() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object refreshInvalidation$room_runtime$default(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, String[] strArr, a aVar, a aVar2, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            aVar = new a() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda4
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 4) != 0) {
            aVar2 = new a() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda5
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        return triggerBasedInvalidationTracker.refreshInvalidation$room_runtime(strArr, aVar, aVar2, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshInvalidationAsync$room_runtime$default(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, a aVar, a aVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = new a() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        if ((i2 & 2) != 0) {
            aVar2 = new a() { // from class: androidx.room.TriggerBasedInvalidationTracker$$ExternalSyntheticLambda3
                @Override // h.g.a.a
                public final Object invoke() {
                    return ab.f48028a;
                }
            };
        }
        triggerBasedInvalidationTracker.refreshInvalidationAsync$room_runtime(aVar, aVar2);
    }

    private final String[] resolveViews(String[] strArr) {
        Set setM = e.c.d.a.m();
        for (String str : strArr) {
            Map<String, Set<String>> map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            Set<String> set = map.get(lowerCase);
            if (set != null) {
                setM.addAll(set);
            } else {
                setM.add(str);
            }
        }
        return (String[]) e.c.d.a.l(setM).toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        if (androidx.room.TransactorKt.execSQL(r13, r15, r0) != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d7, code lost:
    
        if (androidx.room.TransactorKt.execSQL(r7, r15, r0) != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d7 -> B:26:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startTrackingTable(androidx.room.PooledConnection r13, int r14, h.c.e<? super h.ab> r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.startTrackingTable(androidx.room.PooledConnection, int, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007f -> B:19:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stopTrackingTable(androidx.room.PooledConnection r9, int r10, h.c.e<? super h.ab> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof androidx.room.TriggerBasedInvalidationTracker.C04551
            if (r0 == 0) goto L13
            r0 = r11
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = (androidx.room.TriggerBasedInvalidationTracker.C04551) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$stopTrackingTable$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$2
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$0
            androidx.room.PooledConnection r4 = (androidx.room.PooledConnection) r4
            e.b.c.b(r11)
            r11 = r10
            r10 = r4
            goto L82
        L39:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L41:
            e.b.c.b(r11)
            java.lang.String[] r8 = r8.tablesNames
            r8 = r8[r10]
            java.lang.String[] r10 = androidx.room.TriggerBasedInvalidationTracker.TRIGGERS
            int r11 = r10.length
            r2 = 0
            r7 = r2
            r2 = r8
            r8 = r11
            r11 = r10
            r10 = r9
            r9 = r7
        L52:
            if (r9 >= r8) goto L84
            r4 = r11[r9]
            androidx.room.TriggerBasedInvalidationTracker$Companion r5 = androidx.room.TriggerBasedInvalidationTracker.Companion
            java.lang.String r4 = androidx.room.TriggerBasedInvalidationTracker.Companion.access$getTriggerName(r5, r2, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DROP TRIGGER IF EXISTS `"
            r5.<init>(r6)
            r5.append(r4)
            r4 = 96
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r11
            r0.I$0 = r9
            r0.I$1 = r8
            r0.label = r3
            java.lang.Object r4 = androidx.room.TransactorKt.execSQL(r10, r4, r0)
            if (r4 != r1) goto L82
            return r1
        L82:
            int r9 = r9 + r3
            goto L52
        L84:
            h.ab r8 = h.ab.f48028a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.stopTrackingTable(androidx.room.PooledConnection, int, h.c.e):java.lang.Object");
    }

    public final void configureConnection(SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA query_only");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            sQLiteStatement.step();
            boolean z = sQLiteStatement.getBoolean(0);
            r.y(sQLiteStatementPrepare, null);
            if (z) {
                return;
            }
            SQLite.execSQL(sQLiteConnection, "PRAGMA temp_store = MEMORY");
            SQLite.execSQL(sQLiteConnection, "PRAGMA recursive_triggers = 1");
            SQLite.execSQL(sQLiteConnection, DROP_TRACKING_TABLE_SQL);
            if (this.useTempTable) {
                SQLite.execSQL(sQLiteConnection, CREATE_TRACKING_TABLE_SQL);
            } else {
                SQLite.execSQL(sQLiteConnection, o.ac(CREATE_TRACKING_TABLE_SQL, "TEMP", ""));
            }
            this.observedTableStates.forceNeedSync$room_runtime();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                r.y(sQLiteStatementPrepare, th);
                throw th2;
            }
        }
    }

    public final k<Set<String>> createFlow$room_runtime(String[] strArr, int[] iArr, boolean z) {
        x.f(strArr, "resolvedTableNames");
        x.f(iArr, "tableIds");
        return ai.E(new TriggerBasedInvalidationTracker$createFlow$1(this, iArr, z, strArr, null));
    }

    public final a<Boolean> getOnAllowRefresh$room_runtime() {
        return this.onAllowRefresh;
    }

    public final boolean onObserverAdded$room_runtime(int[] iArr) {
        x.f(iArr, "tableIds");
        return this.observedTableStates.onObserverAdded$room_runtime(iArr);
    }

    public final boolean onObserverRemoved$room_runtime(int[] iArr) {
        x.f(iArr, "tableIds");
        return this.observedTableStates.onObserverRemoved$room_runtime(iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object refreshInvalidation$room_runtime(java.lang.String[] r5, h.g.a.a<h.ab> r6, h.g.a.a<h.ab> r7, h.c.e<? super java.lang.Boolean> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$refreshInvalidation$1
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.L$1
            int[] r4 = (int[]) r4
            java.lang.Object r5 = r0.L$0
            r7 = r5
            h.g.a.a r7 = (h.g.a.a) r7
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r4 = move-exception
            goto L84
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            e.b.c.b(r8)
            h.k r5 = r4.validateTableNames$room_runtime(r5)
            java.lang.Object r5 = r5.b()
            int[] r5 = (int[]) r5
            r6.invoke()
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L30
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L30
            r0.label = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r4.notifyInvalidation(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 == r1) goto L83
            r4 = r5
        L57:
            java.util.Set r8 = (java.util.Set) r8     // Catch: java.lang.Throwable -> L30
            int r5 = r4.length     // Catch: java.lang.Throwable -> L30
            r6 = 0
            if (r5 != 0) goto L66
            java.util.Collection r8 = (java.util.Collection) r8     // Catch: java.lang.Throwable -> L30
            boolean r4 = r8.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L7a
            goto L7b
        L66:
            r0 = r6
        L67:
            if (r0 >= r5) goto L7a
            r1 = r4[r0]     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r2 = new java.lang.Integer     // Catch: java.lang.Throwable -> L30
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L30
            boolean r1 = r8.contains(r2)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L77
            goto L7b
        L77:
            int r0 = r0 + 1
            goto L67
        L7a:
            r3 = r6
        L7b:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L30
            r7.invoke()
            return r4
        L83:
            return r1
        L84:
            r7.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.refreshInvalidation$room_runtime(java.lang.String[], h.g.a.a, h.g.a.a, h.c.e):java.lang.Object");
    }

    public final void refreshInvalidationAsync$room_runtime(a<ab> aVar, a<ab> aVar2) {
        x.f(aVar, "onRefreshScheduled");
        x.f(aVar2, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            aVar.invoke();
            aj.z(this.database.getCoroutineScope(), new ae("Room Invalidation Tracker Refresh"), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, aVar2, null), 2);
        }
    }

    public final void resetSync$room_runtime() {
        this.observedTableStates.resetTriggerState$room_runtime();
    }

    public final void setOnAllowRefresh$room_runtime(a<Boolean> aVar) {
        x.f(aVar, "<set-?>");
        this.onAllowRefresh = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object syncTriggers$room_runtime(h.c.e<? super h.ab> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = (androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1 r0 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.L$0
            androidx.room.concurrent.CloseBarrier r7 = (androidx.room.concurrent.CloseBarrier) r7
            e.b.c.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L2b:
            r8 = move-exception
            goto L63
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            e.b.c.b(r8)
            androidx.room.RoomDatabase r8 = r7.database
            androidx.room.concurrent.CloseBarrier r8 = r8.getCloseBarrier$room_runtime()
            boolean r2 = r8.block$room_runtime()
            if (r2 == 0) goto L67
            androidx.room.RoomDatabase r2 = r7.database     // Catch: java.lang.Throwable -> L5f
            androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1 r4 = new androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            r4.<init>(r7, r5)     // Catch: java.lang.Throwable -> L5f
            h.g.a.p r4 = (h.g.a.p) r4     // Catch: java.lang.Throwable -> L5f
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L5f
            r0.label = r3     // Catch: java.lang.Throwable -> L5f
            r7 = 0
            java.lang.Object r7 = r2.useConnection(r7, r4, r0)     // Catch: java.lang.Throwable -> L5f
            if (r7 == r1) goto L5e
            r7 = r8
        L5a:
            r7.unblock$room_runtime()
            goto L67
        L5e:
            return r1
        L5f:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L63:
            r7.unblock$room_runtime()
            throw r8
        L67:
            h.ab r7 = h.ab.f48028a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker.syncTriggers$room_runtime(h.c.e):java.lang.Object");
    }

    public final h.k<String[], int[]> validateTableNames$room_runtime(String[] strArr) {
        x.f(strArr, "names");
        String[] strArrResolveViews = resolveViews(strArr);
        int length = strArrResolveViews.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrResolveViews[i2];
            Map<String, Integer> map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            x.e(lowerCase, "toLowerCase(...)");
            Integer num = map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name ".concat(String.valueOf(str)));
            }
            iArr[i2] = num.intValue();
        }
        return new h.k<>(strArrResolveViews, iArr);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getTriggerName(String str, String str2) {
            return "room_table_modification_trigger_" + str + '_' + str2;
        }

        public /* synthetic */ Companion(h.g.b.o oVar) {
            this();
        }
    }
}
