package androidx.sqlite.driver;

import android.database.sqlite.SQLiteDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class AndroidSQLiteDriver implements SQLiteDriver {
    public static /* synthetic */ void hasConnectionPool$annotations() {
    }

    @Override // androidx.sqlite.SQLiteDriver
    public boolean hasConnectionPool() {
        return true;
    }

    @Override // androidx.sqlite.SQLiteDriver
    public SQLiteConnection open(String str) {
        x.f(str, "fileName");
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(str, (SQLiteDatabase.CursorFactory) null);
        x.c(sQLiteDatabaseOpenOrCreateDatabase);
        return new SupportSQLiteConnection(new FrameworkSQLiteDatabase(sQLiteDatabaseOpenOrCreateDatabase));
    }
}
