package androidx.work.impl.model;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.Data;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkProgressDao_Impl implements WorkProgressDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkProgress> __insertAdapterOfWorkProgress;

    public WorkProgressDao_Impl(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "__db");
        this.__db = roomDatabase;
        this.__insertAdapterOfWorkProgress = new EntityInsertAdapter<WorkProgress>() { // from class: androidx.work.impl.model.WorkProgressDao_Impl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement sQLiteStatement, WorkProgress workProgress) {
                x.f(sQLiteStatement, "statement");
                x.f(workProgress, "entity");
                sQLiteStatement.mo13248bindText(1, workProgress.getWorkSpecId());
                sQLiteStatement.mo13244bindBlob(2, Data.Companion.toByteArrayInternalV1(workProgress.getProgress()));
            }

            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
        };
    }

    static final ab delete$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final ab deleteAll$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final Data getProgressForWorkSpecId$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            Data dataFromByteArray = null;
            if (sQLiteStatementPrepare.step()) {
                byte[] blob = sQLiteStatementPrepare.isNull(0) ? null : sQLiteStatementPrepare.getBlob(0);
                if (blob != null) {
                    dataFromByteArray = Data.Companion.fromByteArray(blob);
                }
            }
            return dataFromByteArray;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab insert$lambda$0(WorkProgressDao_Impl workProgressDao_Impl, WorkProgress workProgress, SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "_connection");
        workProgressDao_Impl.__insertAdapterOfWorkProgress.insert(sQLiteConnection, (SQLiteConnection) workProgress);
        return ab.f48028a;
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void delete(final String str) {
        x.f(str, "workSpecId");
        final String str2 = "DELETE from WorkProgress where work_spec_id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkProgressDao_Impl.delete$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void deleteAll() {
        final String str = "DELETE FROM WorkProgress";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkProgressDao_Impl.deleteAll$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public Data getProgressForWorkSpecId(final String str) {
        x.f(str, "workSpecId");
        final String str2 = "SELECT progress FROM WorkProgress WHERE work_spec_id=?";
        return (Data) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkProgressDao_Impl.getProgressForWorkSpecId$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkProgressDao
    public void insert(final WorkProgress workProgress) {
        x.f(workProgress, "progress");
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkProgressDao_Impl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkProgressDao_Impl.insert$lambda$0(this.f$0, workProgress, (SQLiteConnection) obj);
            }
        });
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final List<c<?>> getRequiredConverters() {
            return i.h();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
