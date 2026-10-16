package androidx.room.util;

import android.database.SQLException;
import androidx.room.PooledConnection;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import h.n.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class DBUtil__DBUtilKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.util.DBUtil__DBUtilKt$internalPerform$2, reason: invalid class name */
    public final class AnonymousClass2 extends g implements p<Transactor, e, Object> {
        final /* synthetic */ p<PooledConnection, e, Object> $block;
        final /* synthetic */ boolean $inTransaction;
        final /* synthetic */ boolean $isReadOnly;
        final /* synthetic */ RoomDatabase $this_internalPerform;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, boolean z2, RoomDatabase roomDatabase, p<? super PooledConnection, ? super e, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$inTransaction = z;
            this.$isReadOnly = z2;
            this.$this_internalPerform = roomDatabase;
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, this.$block, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(Transactor transactor, e eVar) {
            return ((AnonymousClass2) create(transactor, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
        
            if (r8.$this_internalPerform.getInvalidationTracker().sync$room_runtime(r8) != r0) goto L16;
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[PHI: r1 r9
  0x00b1: PHI (r1v12 androidx.room.Transactor) = (r1v9 androidx.room.Transactor), (r1v19 androidx.room.Transactor) binds: [B:37:0x00af, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]
  0x00b1: PHI (r9v14 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:37:0x00af, B:14:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00d6 A[RETURN] */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 227
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtilKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) throws Throwable {
            Transactor transactor = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                return this.$block.invoke(transactor, this);
            }
            Transactor.SQLiteTransactionType sQLiteTransactionType = this.$isReadOnly ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!this.$isReadOnly) {
                AnonymousClass2 anonymousClass2 = this;
                if (!((Boolean) transactor.inTransaction(anonymousClass2)).booleanValue()) {
                    this.$this_internalPerform.getInvalidationTracker().sync$room_runtime(anonymousClass2);
                }
            }
            AnonymousClass2 anonymousClass22 = this;
            Object objWithTransaction = transactor.withTransaction(sQLiteTransactionType, new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, null), anonymousClass22);
            if (!this.$isReadOnly && !((Boolean) transactor.inTransaction(anonymousClass22)).booleanValue()) {
                this.$this_internalPerform.getInvalidationTracker().refreshAsync();
            }
            return objWithTransaction;
        }
    }

    public static final void dropFtsSyncTriggers(SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "connection");
        List listB = i.b();
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            while (sQLiteStatement.step()) {
                listB.add(sQLiteStatement.getText(0));
            }
            r.y(sQLiteStatementPrepare, null);
            for (String str : i.a(listB)) {
                if (o.ah(str, "room_fts_content_sync_")) {
                    SQLite.execSQL(sQLiteConnection, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
                }
            }
        } finally {
        }
    }

    public static final void foreignKeyCheck(SQLiteConnection sQLiteConnection, String str) {
        x.f(sQLiteConnection, "db");
        x.f(str, "tableName");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare("PRAGMA foreign_key_check(`" + str + "`)");
        try {
            SQLiteStatement sQLiteStatement = sQLiteStatementPrepare;
            if (sQLiteStatement.step()) {
                throw new SQLException(processForeignKeyCheckFailure$DBUtil__DBUtilKt(sQLiteStatement));
            }
            r.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public static final <R> Object internalPerform(RoomDatabase roomDatabase, boolean z, boolean z2, p<? super PooledConnection, ? super e<? super R>, ? extends Object> pVar, e<? super R> eVar) {
        return roomDatabase.useConnection(z, new AnonymousClass2(z2, z, roomDatabase, pVar, null), eVar);
    }

    private static final String processForeignKeyCheckFailure$DBUtil__DBUtilKt(SQLiteStatement sQLiteStatement) {
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        do {
            if (i2 == 0) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(sQLiteStatement.getText(0));
                sb.append("'.\n");
                i2 = 0;
            }
            String text = sQLiteStatement.getText(3);
            if (!linkedHashMap.containsKey(text)) {
                linkedHashMap.put(text, sQLiteStatement.getText(2));
            }
            i2++;
        } while (sQLiteStatement.step());
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\nNumber of rows in violation: ");
        sb.append(i2);
        sb.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        return sb.toString();
    }
}
