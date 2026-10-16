package androidx.sqlite;

import android.database.SQLException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final /* synthetic */ class SQLite__SQLiteKt {
    public static final Void throwSQLiteException(int i2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i2);
        if (str != null) {
            sb.append(", message: ".concat(str));
        }
        throw new SQLException(sb.toString());
    }
}
