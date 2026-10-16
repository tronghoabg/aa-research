package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ViewInfo {
    public static final Companion Companion = new Companion(null);
    public final String name;
    public final String sql;

    public ViewInfo(String str, String str2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        this.name = str;
        this.sql = str2;
    }

    public static final ViewInfo read(SQLiteConnection sQLiteConnection, String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(Object obj) {
        return ViewInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return ViewInfoKt.hashCodeCommon(this);
    }

    public String toString() {
        return ViewInfoKt.toStringCommon(this);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ViewInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            x.f(supportSQLiteDatabase, "database");
            x.f(str, "viewName");
            return read(new SupportSQLiteConnection(supportSQLiteDatabase), str);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final ViewInfo read(SQLiteConnection sQLiteConnection, String str) {
            x.f(sQLiteConnection, "connection");
            x.f(str, "viewName");
            return SchemaInfoUtilKt.readViewInfo(sQLiteConnection, str);
        }
    }

    public static final ViewInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }
}
