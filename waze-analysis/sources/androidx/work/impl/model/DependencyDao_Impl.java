package androidx.work.impl.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
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
public final class DependencyDao_Impl implements DependencyDao {
    public static final Companion Companion = new Companion(null);
    private final RoomDatabase __db;
    private final EntityInsertAdapter<Dependency> __insertAdapterOfDependency;

    public DependencyDao_Impl(RoomDatabase roomDatabase) {
        x.f(roomDatabase, "__db");
        this.__db = roomDatabase;
        this.__insertAdapterOfDependency = new EntityInsertAdapter<Dependency>() { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.room.EntityInsertAdapter
            public void bind(SQLiteStatement sQLiteStatement, Dependency dependency) {
                x.f(sQLiteStatement, "statement");
                x.f(dependency, "entity");
                sQLiteStatement.mo13248bindText(1, dependency.getWorkSpecId());
                sQLiteStatement.mo13248bindText(2, dependency.getPrerequisiteId());
            }

            @Override // androidx.room.EntityInsertAdapter
            protected String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
        };
    }

    static final List getDependentWorkIds$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
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

    static final List getPrerequisites$lambda$0(String str, String str2, SQLiteConnection sQLiteConnection) {
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean hasCompletedAllPrerequisites$lambda$0(java.lang.String r3, java.lang.String r4, androidx.sqlite.SQLiteConnection r5) {
        /*
            java.lang.String r0 = "_connection"
            h.g.b.x.f(r5, r0)
            androidx.sqlite.SQLiteStatement r3 = r5.prepare(r3)
            r5 = 1
            r3.mo13248bindText(r5, r4)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r3.step()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            if (r4 == 0) goto L1c
            long r1 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L21
            int r4 = (int) r1
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r5 = r0
        L1d:
            r3.close()
            return r5
        L21:
            r4 = move-exception
            r3.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.DependencyDao_Impl.hasCompletedAllPrerequisites$lambda$0(java.lang.String, java.lang.String, androidx.sqlite.SQLiteConnection):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean hasDependents$lambda$0(java.lang.String r3, java.lang.String r4, androidx.sqlite.SQLiteConnection r5) {
        /*
            java.lang.String r0 = "_connection"
            h.g.b.x.f(r5, r0)
            androidx.sqlite.SQLiteStatement r3 = r5.prepare(r3)
            r5 = 1
            r3.mo13248bindText(r5, r4)     // Catch: java.lang.Throwable -> L21
            boolean r4 = r3.step()     // Catch: java.lang.Throwable -> L21
            r0 = 0
            if (r4 == 0) goto L1c
            long r1 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L21
            int r4 = (int) r1
            if (r4 == 0) goto L1c
            goto L1d
        L1c:
            r5 = r0
        L1d:
            r3.close()
            return r5
        L21:
            r4 = move-exception
            r3.close()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.DependencyDao_Impl.hasDependents$lambda$0(java.lang.String, java.lang.String, androidx.sqlite.SQLiteConnection):boolean");
    }

    static final ab insertDependency$lambda$0(DependencyDao_Impl dependencyDao_Impl, Dependency dependency, SQLiteConnection sQLiteConnection) throws Exception {
        x.f(sQLiteConnection, "_connection");
        dependencyDao_Impl.__insertAdapterOfDependency.insert(sQLiteConnection, (SQLiteConnection) dependency);
        return ab.f48028a;
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getDependentWorkIds(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DependencyDao_Impl.getDependentWorkIds$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getPrerequisites(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT prerequisite_id FROM dependency WHERE work_spec_id=?";
        return (List) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DependencyDao_Impl.getPrerequisites$lambda$0(str2, str, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DependencyDao_Impl.hasCompletedAllPrerequisites$lambda$0(str2, str, (SQLiteConnection) obj));
            }
        })).booleanValue();
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(final String str) {
        x.f(str, TtmlNode.ATTR_ID);
        final String str2 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?";
        return ((Boolean) DBUtil.performBlocking(this.__db, true, false, new l() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DependencyDao_Impl.hasDependents$lambda$0(str2, str, (SQLiteConnection) obj));
            }
        })).booleanValue();
    }

    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(final Dependency dependency) {
        x.f(dependency, "dependency");
        DBUtil.performBlocking(this.__db, false, true, new l() { // from class: androidx.work.impl.model.DependencyDao_Impl$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return DependencyDao_Impl.insertDependency$lambda$0(this.f$0, dependency, (SQLiteConnection) obj);
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
