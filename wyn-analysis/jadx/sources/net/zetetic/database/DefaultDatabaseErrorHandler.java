package net.zetetic.database;

import android.database.sqlite.SQLiteException;
import android.util.Pair;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteConnection;
import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* loaded from: classes5.dex */
public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    public static void a(String str) {
        if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
            return;
        }
        Logger.b().a(6, null, "DefaultDatabaseErrorHandler", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.i(new File(str));
        } catch (Exception e7) {
            Logger.b().a(5, null, "DefaultDatabaseErrorHandler", "delete failed: " + e7.getMessage());
        }
    }

    @Override // net.zetetic.database.DatabaseErrorHandler
    public final void c(SQLiteDatabase sQLiteDatabase) {
        List listB = null;
        Logger.b().a(6, null, "DefaultDatabaseErrorHandler", "Corruption reported by sqlite on database: " + sQLiteDatabase.J());
        if (SQLiteConnection.o()) {
            return;
        }
        if (!sQLiteDatabase.isOpen()) {
            a(sQLiteDatabase.J());
            return;
        }
        try {
            try {
                listB = sQLiteDatabase.B();
            } catch (SQLiteException unused) {
            }
            try {
                sQLiteDatabase.d();
            } catch (SQLiteException unused2) {
            }
        } finally {
            if (listB != null) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    a((String) ((Pair) it.next()).second);
                }
            } else {
                a(sQLiteDatabase.J());
            }
        }
    }
}
