package androidx.work.impl.model;

import androidx.autofill.HintConstants;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.l.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkNameDao_Impl implements WorkNameDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<WorkName> __insertAdapterOfWorkName;

    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "__db");
        this.__db = roomDatabase;
        this.__insertAdapterOfWorkName = new EntityInsertAdapter<WorkName>() { // from class: androidx.work.impl.model.WorkNameDao_Impl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement sQLiteStatement, WorkName workName) {
                x.f(sQLiteStatement, "statement");
                x.f(workName, "entity");
                sQLiteStatement.mo13248bindText(1, workName.getName());
                sQLiteStatement.mo13248bindText(2, workName.getWorkSpecId());
            }

            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
        };
    }

    static final List getNamesForWorkSpecId$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkSpecIdsWithName$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab insert$lambda$0(WorkNameDao_Impl workNameDao_Impl, WorkName workName, SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "_connection");
        workNameDao_Impl.__insertAdapterOfWorkName.insert(sQLiteConnection, (SQLiteConnection) workName);
        return ab.f48028a;
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getNamesForWorkSpecId(final String str) {
        x.f(str, "workSpecId");
        final String str2 = "SELECT name FROM workname WHERE work_spec_id=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkNameDao_Impl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkNameDao_Impl.getNamesForWorkSpecId$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getWorkSpecIdsWithName(final String str) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        final String str2 = "SELECT work_spec_id FROM workname WHERE name=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.WorkNameDao_Impl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkNameDao_Impl.getWorkSpecIdsWithName$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public void insert(final WorkName workName) {
        x.f(workName, "workName");
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.WorkNameDao_Impl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return WorkNameDao_Impl.insert$lambda$0(this.f$0, workName, (SQLiteConnection) obj);
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
