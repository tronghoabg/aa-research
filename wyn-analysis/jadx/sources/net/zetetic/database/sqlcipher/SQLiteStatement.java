package net.zetetic.database.sqlcipher;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.util.EventLog;
import o3.g;

/* loaded from: classes5.dex */
public final class SQLiteStatement extends SQLiteProgram implements g {
    @Override // o3.g
    public final int g() {
        a();
        try {
            try {
                SQLiteSession sQLiteSessionQ = this.f41152b.Q();
                String str = this.f41153c;
                Object[] objArr = this.f41157g;
                this.f41152b.getClass();
                return sQLiteSessionQ.d(SQLiteDatabase.P(this.f41154d), str, objArr);
            } catch (SQLiteDatabaseCorruptException e7) {
                SQLiteDatabase sQLiteDatabase = this.f41152b;
                synchronized (sQLiteDatabase.f41117e) {
                    EventLog.writeEvent(75004, sQLiteDatabase.f41119g.f41126b);
                    sQLiteDatabase.f41116d.c(sQLiteDatabase);
                    throw e7;
                }
            }
        } finally {
            d();
        }
    }

    public final String toString() {
        return "SQLiteProgram: " + this.f41153c;
    }

    @Override // o3.g
    public final long v() {
        a();
        try {
            try {
                SQLiteSession sQLiteSessionQ = this.f41152b.Q();
                String str = this.f41153c;
                Object[] objArr = this.f41157g;
                this.f41152b.getClass();
                return sQLiteSessionQ.f(SQLiteDatabase.P(this.f41154d), str, objArr);
            } catch (SQLiteDatabaseCorruptException e7) {
                SQLiteDatabase sQLiteDatabase = this.f41152b;
                synchronized (sQLiteDatabase.f41117e) {
                    EventLog.writeEvent(75004, sQLiteDatabase.f41119g.f41126b);
                    sQLiteDatabase.f41116d.c(sQLiteDatabase);
                    throw e7;
                }
            }
        } finally {
            d();
        }
    }
}
