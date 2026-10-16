package defpackage;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class syf extends sxt {
    public syf() {
        super(qnl.EXEC_SQL_FIX, 10L);
    }

    private static void c(SQLiteDatabase sQLiteDatabase, List list) throws SQLException {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                sQLiteDatabase.execSQL(str);
            } catch (SQLiteException e) {
                Log.e("EXEC_SQL_FIX", "Unable to execute query ".concat(String.valueOf(str)));
                throw e;
            }
        }
    }

    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 2) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = sxyVar.b;
        qnz qnzVar = (qnz) xxhVar.b();
        qnp qnpVar = qnzVar.b == 2 ? (qnp) qnzVar.c : qnp.a;
        if (qnpVar.f) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        File databasePath = contextCreateDeviceProtectedStorageContext.getDatabasePath(qnpVar.c);
        if (databasePath.exists()) {
            SQLiteDatabase sQLiteDatabaseOpenDatabase = SQLiteDatabase.openDatabase(databasePath.getPath(), null, 0);
            try {
                int version = sQLiteDatabaseOpenDatabase.getVersion();
                int i = qnpVar.d;
                if (i == 0 || i == version) {
                    int iAq = a.aq(qnpVar.b);
                    if (iAq == 0) {
                        iAq = 1;
                    }
                    int i2 = iAq - 2;
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new UnsupportedOperationException("This command type is not supported");
                        }
                        contextCreateDeviceProtectedStorageContext.deleteDatabase(qnpVar.c);
                    } else if (qnpVar.g) {
                        aboh abohVar = qnpVar.e;
                        sQLiteDatabaseOpenDatabase.beginTransaction();
                        try {
                            c(sQLiteDatabaseOpenDatabase, abohVar);
                            sQLiteDatabaseOpenDatabase.setTransactionSuccessful();
                            sQLiteDatabaseOpenDatabase.endTransaction();
                        } catch (Throwable th) {
                            sQLiteDatabaseOpenDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        c(sQLiteDatabaseOpenDatabase, qnpVar.e);
                    }
                }
                if (sQLiteDatabaseOpenDatabase != null) {
                    sQLiteDatabaseOpenDatabase.close();
                }
            } catch (Throwable th2) {
                if (sQLiteDatabaseOpenDatabase != null) {
                    try {
                        sQLiteDatabaseOpenDatabase.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        return sxyVar;
    }

    @Override // defpackage.sxt
    public final String b() {
        return "EXEC_SQL_FIX";
    }
}
