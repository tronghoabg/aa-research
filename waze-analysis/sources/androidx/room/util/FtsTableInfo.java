package androidx.room.util;

import androidx.autofill.HintConstants;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FtsTableInfo {
    public static final Companion Companion = new Companion(null);
    public final Set<String> columns;
    public final String name;
    public final Set<String> options;

    public FtsTableInfo(String str, Set<String> set, Set<String> set2) {
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(set, "columns");
        x.f(set2, "options");
        this.name = str;
        this.columns = set;
        this.options = set2;
    }

    public static final FtsTableInfo read(SQLiteConnection sQLiteConnection, String str) {
        return Companion.read(sQLiteConnection, str);
    }

    public boolean equals(Object obj) {
        return FtsTableInfoKt.equalsCommon(this, obj);
    }

    public int hashCode() {
        return FtsTableInfoKt.hashCodeCommon(this);
    }

    public String toString() {
        return FtsTableInfoKt.toStringCommon(this);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final FtsTableInfo read(SQLiteConnection sQLiteConnection, String str) {
            x.f(sQLiteConnection, "connection");
            x.f(str, "tableName");
            return new FtsTableInfo(str, SchemaInfoUtilKt.readFtsColumns(sQLiteConnection, str), SchemaInfoUtilKt.readFtsOptions(sQLiteConnection, str));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
            x.f(supportSQLiteDatabase, "database");
            x.f(str, "tableName");
            return read(new SupportSQLiteConnection(supportSQLiteDatabase), str);
        }
    }

    public static final FtsTableInfo read(SupportSQLiteDatabase supportSQLiteDatabase, String str) {
        return Companion.read(supportSQLiteDatabase, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FtsTableInfo(String str, Set<String> set, String str2) {
        this(str, set, SchemaInfoUtilKt.parseFtsOptions(str2));
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        x.f(set, "columns");
        x.f(str2, "createSql");
    }
}
