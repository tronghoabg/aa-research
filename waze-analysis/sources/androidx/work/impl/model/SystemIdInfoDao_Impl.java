package androidx.work.impl.model;

import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.impl.model.SystemIdInfoDao;
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
public final class SystemIdInfoDao_Impl implements SystemIdInfoDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<SystemIdInfo> __insertAdapterOfSystemIdInfo;

    public SystemIdInfoDao_Impl(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "__db");
        this.__db = roomDatabase;
        this.__insertAdapterOfSystemIdInfo = new EntityInsertAdapter<SystemIdInfo>() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement sQLiteStatement, SystemIdInfo systemIdInfo) {
                x.f(sQLiteStatement, "statement");
                x.f(systemIdInfo, "entity");
                sQLiteStatement.mo13248bindText(1, systemIdInfo.workSpecId);
                sQLiteStatement.mo13246bindLong(2, systemIdInfo.getGeneration());
                sQLiteStatement.mo13246bindLong(3, systemIdInfo.systemId);
            }

            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }
        };
    }

    static final SystemIdInfo getSystemIdInfo$lambda$0(String str, String str2, int i2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.mo13246bindLong(2, i2);
            return sQLiteStatementPrepare.step() ? new SystemIdInfo(sQLiteStatementPrepare.getText(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "work_spec_id")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "generation")), (int) sQLiteStatementPrepare.getLong(SQLiteStatementUtil.getColumnIndexOrThrow(sQLiteStatementPrepare, "system_id"))) : null;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final List getWorkSpecIds$lambda$0(String str, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                arrayList.add(sQLiteStatementPrepare.getText(0));
            }
            return arrayList;
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    static final ab insertSystemIdInfo$lambda$0(SystemIdInfoDao_Impl systemIdInfoDao_Impl, SystemIdInfo systemIdInfo, SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "_connection");
        systemIdInfoDao_Impl.__insertAdapterOfSystemIdInfo.insert(sQLiteConnection, (SQLiteConnection) systemIdInfo);
        return ab.f48028a;
    }

    static final ab removeSystemIdInfo$lambda$0(String str, String str2, int i2, SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(str);
        try {
            sQLiteStatementPrepare.mo13248bindText(1, str2);
            sQLiteStatementPrepare.mo13246bindLong(2, i2);
            sQLiteStatementPrepare.step();
            sQLiteStatementPrepare.close();
            return ab.f48028a;
        } catch (Throwable th) {
            sQLiteStatementPrepare.close();
            throw th;
        }
    }

    static final ab removeSystemIdInfo$lambda$1(String str, String str2, SQLiteConnection sQLiteConnection) {
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public SystemIdInfo getSystemIdInfo(final String str, final int i2) {
        x.f(str, "workSpecId");
        final String str2 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?";
        return (SystemIdInfo) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SystemIdInfoDao_Impl.getSystemIdInfo$lambda$0(str2, str, i2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public List<String> getWorkSpecIds() {
        final String str = "SELECT DISTINCT work_spec_id FROM SystemIdInfo";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SystemIdInfoDao_Impl.getWorkSpecIds$lambda$0(str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(final SystemIdInfo systemIdInfo) {
        x.f(systemIdInfo, "systemIdInfo");
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SystemIdInfoDao_Impl.insertSystemIdInfo$lambda$0(this.f$0, systemIdInfo, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(final String str) {
        x.f(str, "workSpecId");
        final String str2 = "DELETE FROM SystemIdInfo where work_spec_id=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SystemIdInfoDao_Impl.removeSystemIdInfo$lambda$1(str2, str, (SQLiteConnection) obj);
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

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public /* synthetic */ void removeSystemIdInfo(WorkGenerationalId workGenerationalId) {
        SystemIdInfoDao.CC.$default$removeSystemIdInfo(this, workGenerationalId);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(final String str, final int i2) {
        x.f(str, "workSpecId");
        final String str2 = "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return SystemIdInfoDao_Impl.removeSystemIdInfo$lambda$0(str2, str, i2, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public /* synthetic */ SystemIdInfo getSystemIdInfo(WorkGenerationalId workGenerationalId) {
        return SystemIdInfoDao.CC.$default$getSystemIdInfo(this, workGenerationalId);
    }
}
