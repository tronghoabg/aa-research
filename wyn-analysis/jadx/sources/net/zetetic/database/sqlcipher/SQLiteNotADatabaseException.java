package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteException;

/* loaded from: classes5.dex */
public class SQLiteNotADatabaseException extends SQLiteException {
    public SQLiteNotADatabaseException() {
    }

    public SQLiteNotADatabaseException(String str) {
        super(str);
    }

    public SQLiteNotADatabaseException(String str, Throwable th) {
        super(str, th);
    }
}
