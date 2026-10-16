package androidx.room.migration.bundle;

import h.g.b.o;
import h.g.b.x;
import h.o.c;
import kotlinx.b.a.q;
import kotlinx.b.b;
import kotlinx.b.b.d;
import kotlinx.b.c.ca;
import kotlinx.b.j;

/* compiled from: WazeSource */
@j
/* loaded from: classes4.dex */
public final class DatabaseViewBundle implements SchemaEquality<DatabaseViewBundle> {
    public static final Companion Companion = new Companion(null);
    private final String createSql;
    private final String viewName;

    public /* synthetic */ DatabaseViewBundle(int i2, String str, String str2, ca caVar) {
        if ((i2 & 3) != 3) {
            c.m(i2, 3, DatabaseViewBundle$$serializer.INSTANCE.getDescriptor());
        }
        this.viewName = str;
        this.createSql = str2;
    }

    public static /* synthetic */ void getCreateSql$annotations() {
    }

    public static /* synthetic */ void getViewName$annotations() {
    }

    public static final /* synthetic */ void write$Self$room_migration(DatabaseViewBundle databaseViewBundle, d dVar, q qVar) {
        dVar.encodeStringElement(qVar, 0, databaseViewBundle.viewName);
        dVar.encodeStringElement(qVar, 1, databaseViewBundle.createSql);
    }

    public final String createView() {
        return BundleUtil.replaceViewName(this.createSql, this.viewName);
    }

    public final String getCreateSql() {
        return this.createSql;
    }

    public final String getViewName() {
        return this.viewName;
    }

    @Override // androidx.room.migration.bundle.SchemaEquality
    public boolean isSchemaEqual(DatabaseViewBundle databaseViewBundle) {
        x.f(databaseViewBundle, "other");
        return x.n(this.viewName, databaseViewBundle.viewName) && x.n(this.createSql, databaseViewBundle.createSql);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final b<DatabaseViewBundle> serializer() {
            return DatabaseViewBundle$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public DatabaseViewBundle(String str, String str2) {
        x.f(str, "viewName");
        x.f(str2, "createSql");
        this.viewName = str;
        this.createSql = str2;
    }
}
