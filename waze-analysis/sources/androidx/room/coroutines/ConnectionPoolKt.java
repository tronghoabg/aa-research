package androidx.room.coroutines;

import androidx.sqlite.SQLiteDriver;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ConnectionPoolKt {
    public static final ConnectionPool newConnectionPool(SQLiteDriver sQLiteDriver, String str, int i2, int i3, int i4) {
        x.f(sQLiteDriver, "driver");
        x.f(str, "fileName");
        return new ConnectionPoolImpl(sQLiteDriver, str, i2, i3, i4);
    }

    public static /* synthetic */ ConnectionPool newConnectionPool$default(SQLiteDriver sQLiteDriver, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            i4 = 25;
        }
        return newConnectionPool(sQLiteDriver, str, i2, i3, i4);
    }

    public static final ConnectionPool newSingleConnectionPool(SQLiteDriver sQLiteDriver, String str, int i2) {
        x.f(sQLiteDriver, "driver");
        x.f(str, "fileName");
        return new ConnectionPoolImpl(sQLiteDriver, str, i2);
    }

    public static /* synthetic */ ConnectionPool newSingleConnectionPool$default(SQLiteDriver sQLiteDriver, String str, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 25;
        }
        return newSingleConnectionPool(sQLiteDriver, str, i2);
    }
}
