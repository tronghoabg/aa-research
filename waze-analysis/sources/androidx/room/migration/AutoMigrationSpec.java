package androidx.room.migration;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface AutoMigrationSpec {
    void onPostMigrate(SQLiteConnection sQLiteConnection);

    void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase);

    /* compiled from: WazeSource */
    /* renamed from: androidx.room.migration.AutoMigrationSpec$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$onPostMigrate(AutoMigrationSpec autoMigrationSpec, SQLiteConnection sQLiteConnection) {
            x.f(sQLiteConnection, "connection");
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                autoMigrationSpec.onPostMigrate(((SupportSQLiteConnection) sQLiteConnection).getDb());
            }
        }
    }
}
