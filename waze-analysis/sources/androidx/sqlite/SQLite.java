package androidx.sqlite;

/* loaded from: classes4.dex */
public final class SQLite {
    public static final int SQLITE_DATA_BLOB = 4;
    public static final int SQLITE_DATA_FLOAT = 2;
    public static final int SQLITE_DATA_INTEGER = 1;
    public static final int SQLITE_DATA_NULL = 5;
    public static final int SQLITE_DATA_TEXT = 3;

    public static final void execSQL(SQLiteConnection sQLiteConnection, String str) throws Exception {
        SQLite__SQLite_nonWebKt.execSQL(sQLiteConnection, str);
    }

    public static final Void throwSQLiteException(int i2, String str) {
        return SQLite__SQLiteKt.throwSQLiteException(i2, str);
    }
}
