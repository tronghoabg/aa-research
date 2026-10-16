package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.CancellationSignal;
import android.util.EventLog;
import net.zetetic.database.CursorWindow;
import net.zetetic.database.Logger;

/* loaded from: classes5.dex */
public final class SQLiteQuery extends SQLiteProgram {

    /* renamed from: i, reason: collision with root package name */
    public final CancellationSignal f41158i;

    public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
        super(sQLiteDatabase, str, null, cancellationSignal);
        this.f41158i = cancellationSignal;
    }

    public final int i(CursorWindow cursorWindow, int i5, int i10, boolean z2) {
        CursorWindow cursorWindow2;
        String str;
        a();
        try {
            try {
                cursorWindow.a();
            } catch (Throwable th) {
                th = th;
            }
            try {
                SQLiteSession sQLiteSessionQ = this.f41152b.Q();
                String str2 = this.f41153c;
                Object[] objArr = this.f41157g;
                this.f41152b.getClass();
                cursorWindow2 = cursorWindow;
                try {
                    int iE = sQLiteSessionQ.e(str2, objArr, cursorWindow2, i5, i10, z2, SQLiteDatabase.P(this.f41154d), this.f41158i);
                    cursorWindow2.d();
                    d();
                    return iE;
                } catch (SQLiteDatabaseCorruptException e7) {
                    e = e7;
                    SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
                    SQLiteDatabase sQLiteDatabase = this.f41152b;
                    synchronized (sQLiteDatabase.f41117e) {
                        str = sQLiteDatabase.f41119g.f41126b;
                    }
                    EventLog.writeEvent(75004, str);
                    sQLiteDatabase.f41116d.c(sQLiteDatabase);
                    throw sQLiteDatabaseCorruptException;
                } catch (SQLiteException e10) {
                    e = e10;
                    SQLiteException sQLiteException = e;
                    Logger.b().a(6, null, "SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + this.f41153c);
                    throw sQLiteException;
                }
            } catch (SQLiteDatabaseCorruptException e11) {
                e = e11;
                cursorWindow2 = cursorWindow;
            } catch (SQLiteException e12) {
                e = e12;
            } catch (Throwable th2) {
                th = th2;
                cursorWindow2 = cursorWindow;
                Throwable th3 = th;
                cursorWindow2.d();
                throw th3;
            }
        } catch (Throwable th4) {
            d();
            throw th4;
        }
    }

    public final String toString() {
        return "SQLiteQuery: " + this.f41153c;
    }
}
