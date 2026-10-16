package androidx.sqlite.driver;

import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import h.g.b.x;
import h.n.o;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SupportSQLiteDriver implements SQLiteDriver {
    private final SupportSQLiteOpenHelper openHelper;

    public SupportSQLiteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        x.f(supportSQLiteOpenHelper, "openHelper");
        this.openHelper = supportSQLiteOpenHelper;
    }

    public static /* synthetic */ void hasConnectionPool$annotations() {
    }

    @Override // androidx.sqlite.SQLiteDriver
    public boolean hasConnectionPool() {
        return true;
    }

    @Override // androidx.sqlite.SQLiteDriver
    public SupportSQLiteConnection open(String str) {
        x.f(str, "fileName");
        String databaseName = this.openHelper.getDatabaseName();
        if (databaseName == null) {
            if (!x.n(str, ":memory:")) {
                throw new IllegalArgumentException("This driver is configured to open an in-memory database but a file-based named '" + str + "' was requested.");
            }
        } else if (!x.n(databaseName, str) && !x.n(o.C(databaseName, '/', databaseName), o.C(str, '/', str))) {
            throw new IllegalArgumentException("This driver is configured to open a database named '" + this.openHelper.getDatabaseName() + "' but '" + str + "' was requested.");
        }
        return new SupportSQLiteConnection(this.openHelper.getWritableDatabase());
    }
}
