package androidx.room.migration;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import h.g.b.x;
import h.j;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class Migration {
    public final int endVersion;
    public final int startVersion;

    public Migration(int i2, int i3) {
        this.startVersion = i2;
        this.endVersion = i3;
    }

    public void migrate(SQLiteConnection sQLiteConnection) {
        x.f(sQLiteConnection, "connection");
        if (!(sQLiteConnection instanceof SupportSQLiteConnection)) {
            throw new j("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        migrate(((SupportSQLiteConnection) sQLiteConnection).getDb());
    }

    public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        x.f(supportSQLiteDatabase, "db");
        throw new j("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
