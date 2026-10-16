package net.zetetic.database.sqlcipher;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.text.TextUtils;
import android.util.EventLog;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.DatabaseUtils;
import net.zetetic.database.DefaultDatabaseErrorHandler;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteSession;
import o3.InterfaceC3644a;
import o3.f;
import o3.g;
import wg.b;

/* loaded from: classes5.dex */
public final class SQLiteDatabase extends SQLiteClosable implements InterfaceC3644a {

    /* renamed from: j, reason: collision with root package name */
    public static final WeakHashMap f41113j = new WeakHashMap();
    public static final String[] k = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public final CursorFactory f41115c;

    /* renamed from: d, reason: collision with root package name */
    public final DatabaseErrorHandler f41116d;

    /* renamed from: g, reason: collision with root package name */
    public final SQLiteDatabaseConfiguration f41119g;

    /* renamed from: h, reason: collision with root package name */
    public SQLiteConnectionPool f41120h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41121i;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f41114b = new ThreadLocal<SQLiteSession>() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.1
        @Override // java.lang.ThreadLocal
        public final SQLiteSession initialValue() {
            SQLiteConnectionPool sQLiteConnectionPool;
            SQLiteDatabase sQLiteDatabase = SQLiteDatabase.this;
            synchronized (sQLiteDatabase.f41117e) {
                sQLiteDatabase.b0();
                sQLiteConnectionPool = sQLiteDatabase.f41120h;
            }
            return new SQLiteSession(sQLiteConnectionPool);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public final Object f41117e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final CloseGuard f41118f = new CloseGuard();

    /* renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$2, reason: invalid class name */
    class AnonymousClass2 implements SQLiteTransactionListener {
    }

    /* renamed from: net.zetetic.database.sqlcipher.SQLiteDatabase$3, reason: invalid class name */
    class AnonymousClass3 implements SQLiteTransactionListener {
    }

    public interface CursorFactory {
        Cursor a();
    }

    public interface CustomFunction {
        void a();
    }

    public SQLiteDatabase(int i5, String str, DatabaseErrorHandler databaseErrorHandler, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, byte[] bArr) {
        this.f41115c = cursorFactory;
        this.f41116d = databaseErrorHandler == null ? new DefaultDatabaseErrorHandler() : databaseErrorHandler;
        this.f41119g = new SQLiteDatabaseConfiguration(str, i5, bArr, sQLiteDatabaseHook);
    }

    public static int P(boolean z2) {
        int i5 = z2 ? 1 : 2;
        Looper looperMyLooper = Looper.myLooper();
        return (looperMyLooper == null || looperMyLooper != Looper.getMainLooper()) ? i5 : i5 | 4;
    }

    public static SQLiteDatabase X(int i5, String str, DatabaseErrorHandler databaseErrorHandler, CursorFactory cursorFactory, SQLiteDatabaseHook sQLiteDatabaseHook, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase = new SQLiteDatabase(i5, str, databaseErrorHandler, cursorFactory, sQLiteDatabaseHook, bArr);
        try {
            try {
                sQLiteDatabase.Y();
                return sQLiteDatabase;
            } catch (SQLiteDatabaseCorruptException unused) {
                synchronized (sQLiteDatabase.f41117e) {
                    EventLog.writeEvent(75004, sQLiteDatabase.f41119g.f41126b);
                    sQLiteDatabase.f41116d.c(sQLiteDatabase);
                    sQLiteDatabase.Y();
                    return sQLiteDatabase;
                }
            }
        } catch (SQLiteException e7) {
            Logger.a(e7, "SQLiteDatabase", "Failed to open database '" + sQLiteDatabase.D() + "'.");
            sQLiteDatabase.d();
            throw e7;
        }
    }

    public static boolean i(File file) {
        boolean zDelete = file.delete() | new File(file.getPath() + "-journal").delete() | new File(file.getPath() + "-shm").delete() | new File(file.getPath() + "-wal").delete();
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            final String str = file.getName() + "-mj";
            File[] fileArrListFiles = parentFile.listFiles(new FileFilter() { // from class: net.zetetic.database.sqlcipher.SQLiteDatabase.4
                @Override // java.io.FileFilter
                public final boolean accept(File file2) {
                    return file2.getName().startsWith(str);
                }
            });
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    zDelete |= file2.delete();
                }
            }
        }
        return zDelete;
    }

    @Override // o3.InterfaceC3644a
    public final g A(String str) {
        a();
        try {
            return new SQLiteStatement(this, str, null, null);
        } finally {
            d();
        }
    }

    public final List B() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f41117e) {
            try {
                Cursor cursorZ = null;
                if (this.f41120h == null) {
                    return null;
                }
                if (!this.f41121i) {
                    arrayList.add(new Pair("main", this.f41119g.f41125a));
                    return arrayList;
                }
                a();
                try {
                    try {
                        cursorZ = Z("pragma database_list;", null);
                        while (cursorZ.moveToNext()) {
                            arrayList.add(new Pair(cursorZ.getString(1), cursorZ.getString(2)));
                        }
                        cursorZ.close();
                        return arrayList;
                    } catch (Throwable th) {
                        if (cursorZ != null) {
                            cursorZ.close();
                        }
                        throw th;
                    }
                } finally {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String D() {
        String str;
        synchronized (this.f41117e) {
            str = this.f41119g.f41126b;
        }
        return str;
    }

    public final String J() {
        String str;
        synchronized (this.f41117e) {
            str = this.f41119g.f41125a;
        }
        return str;
    }

    @Override // o3.InterfaceC3644a
    public final Cursor K(String str) {
        a();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null, null);
            CursorFactory cursorFactory = this.f41115c;
            SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.f41135a, sQLiteDirectCursorDriver.f41137c, sQLiteDirectCursorDriver.f41138d);
            try {
                return cursorFactory == null ? new SQLiteCursor(sQLiteDirectCursorDriver, sQLiteDirectCursorDriver.f41136b, sQLiteQuery) : cursorFactory.a();
            } catch (RuntimeException e7) {
                sQLiteQuery.d();
                throw e7;
            }
        } finally {
            d();
        }
    }

    @Override // o3.InterfaceC3644a
    public final boolean O() {
        a();
        try {
            return Q().f41163e != null;
        } finally {
            d();
        }
    }

    public final SQLiteSession Q() {
        return (SQLiteSession) this.f41114b.get();
    }

    @Override // o3.InterfaceC3644a
    public final boolean R() {
        boolean z2;
        synchronized (this.f41117e) {
            b0();
            z2 = (this.f41119g.f41127c & 536870912) != 0;
        }
        return z2;
    }

    @Override // o3.InterfaceC3644a
    public final int U(ContentValues contentValues, Object[] objArr) {
        int length = objArr.length;
        String[] strArr = new String[length];
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = objArr[i10].toString();
        }
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        a();
        try {
            StringBuilder sb2 = new StringBuilder(120);
            sb2.append("UPDATE ");
            sb2.append(k[3]);
            sb2.append("WorkSpec");
            sb2.append(" SET ");
            int size = contentValues.size();
            int i11 = length + size;
            Object[] objArr2 = new Object[i11];
            for (String str : contentValues.keySet()) {
                sb2.append(i5 > 0 ? "," : "");
                sb2.append(str);
                objArr2[i5] = contentValues.get(str);
                sb2.append("=?");
                i5++;
            }
            for (int i12 = size; i12 < i11; i12++) {
                objArr2[i12] = strArr[i12 - size];
            }
            if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
                sb2.append(" WHERE ");
                sb2.append("last_enqueue_time = 0 AND interval_duration <> 0 ");
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, sb2.toString(), objArr2, null);
            try {
                int iG = sQLiteStatement.g();
                d();
                return iG;
            } finally {
                sQLiteStatement.d();
            }
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final int V() {
        a();
        try {
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, "PRAGMA user_version;", null, null);
            try {
                sQLiteStatement.a();
                try {
                    try {
                        SQLiteSession sQLiteSessionQ = sQLiteStatement.f41152b.Q();
                        String str = sQLiteStatement.f41153c;
                        Object[] objArr = sQLiteStatement.f41157g;
                        sQLiteStatement.f41152b.getClass();
                        long jG = sQLiteSessionQ.g(P(sQLiteStatement.f41154d), str, objArr);
                        sQLiteStatement.d();
                        return Long.valueOf(jG).intValue();
                    } catch (SQLiteDatabaseCorruptException e7) {
                        SQLiteDatabase sQLiteDatabase = sQLiteStatement.f41152b;
                        synchronized (sQLiteDatabase.f41117e) {
                            EventLog.writeEvent(75004, sQLiteDatabase.f41119g.f41126b);
                            sQLiteDatabase.f41116d.c(sQLiteDatabase);
                            throw e7;
                        }
                    }
                } finally {
                    sQLiteStatement.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        } finally {
            d();
        }
    }

    public final boolean W() {
        boolean z2;
        synchronized (this.f41117e) {
            z2 = true;
            if ((this.f41119g.f41127c & 1) != 1) {
                z2 = false;
            }
        }
        return z2;
    }

    public final void Y() {
        synchronized (this.f41117e) {
            SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41119g;
            if (sQLiteDatabaseConfiguration == null) {
                throw new IllegalArgumentException("configuration must not be null.");
            }
            SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
            sQLiteConnectionPool.k = sQLiteConnectionPool.w(sQLiteConnectionPool.f41081d, true);
            sQLiteConnectionPool.f41083f = true;
            sQLiteConnectionPool.f41078a.a();
            this.f41120h = sQLiteConnectionPool;
            this.f41118f.a();
        }
        WeakHashMap weakHashMap = f41113j;
        synchronized (weakHashMap) {
            weakHashMap.put(this, null);
        }
    }

    public final Cursor Z(String str, String[] strArr) {
        a();
        try {
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, str, null, null);
            CursorFactory cursorFactory = this.f41115c;
            SQLiteQuery sQLiteQuery = new SQLiteQuery(sQLiteDirectCursorDriver.f41135a, sQLiteDirectCursorDriver.f41137c, sQLiteDirectCursorDriver.f41138d);
            if (strArr != null) {
                try {
                    for (int length = strArr.length; length != 0; length--) {
                        sQLiteQuery.x(length, strArr[length - 1]);
                    }
                } catch (RuntimeException e7) {
                    sQLiteQuery.d();
                    throw e7;
                }
            }
            return cursorFactory == null ? new SQLiteCursor(sQLiteDirectCursorDriver, sQLiteDirectCursorDriver.f41136b, sQLiteQuery) : cursorFactory.a();
        } finally {
            d();
        }
    }

    public final void a0() {
        synchronized (this.f41117e) {
            try {
                b0();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41119g;
                int i5 = sQLiteDatabaseConfiguration.f41127c;
                boolean z2 = true;
                if ((i5 & 1) != 1) {
                    z2 = false;
                }
                if (z2) {
                    sQLiteDatabaseConfiguration.f41127c = i5 & (-2);
                    try {
                        this.f41120h.y(sQLiteDatabaseConfiguration);
                    } catch (RuntimeException e7) {
                        this.f41119g.f41127c = i5;
                        throw e7;
                    }
                }
            } finally {
            }
        }
    }

    @Override // net.zetetic.database.sqlcipher.SQLiteClosable
    public final void b() {
        w(false);
    }

    public final void b0() {
        if (this.f41120h == null) {
            throw new IllegalStateException(b.c(new StringBuilder("The database '"), this.f41119g.f41126b, "' is not open."));
        }
    }

    @Override // o3.InterfaceC3644a
    public final void c() {
        h(true);
    }

    @Override // o3.InterfaceC3644a
    public final void f(String str) {
        z(str, null);
    }

    public final void finalize() throws Throwable {
        try {
            w(true);
        } finally {
            super.finalize();
        }
    }

    public final void h(boolean z2) {
        a();
        try {
            Q().b(z2 ? 2 : 1, P(false), null);
        } finally {
            d();
        }
    }

    @Override // o3.InterfaceC3644a
    public final boolean isOpen() {
        boolean z2;
        synchronized (this.f41117e) {
            z2 = this.f41120h != null;
        }
        return z2;
    }

    @Override // o3.InterfaceC3644a
    public final void k() {
        a();
        try {
            SQLiteSession.Transaction transaction = Q().f41163e;
            if (transaction == null) {
                throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
            }
            if (transaction.f41165b) {
                throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
            }
            transaction.f41165b = true;
        } finally {
            d();
        }
    }

    @Override // o3.InterfaceC3644a
    public final void l(String str, Object[] objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Empty bindArgs");
        }
        z(str, objArr);
    }

    @Override // o3.InterfaceC3644a
    public final void n() {
        h(false);
    }

    public final void o() {
        synchronized (this.f41117e) {
            try {
                b0();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41119g;
                int i5 = sQLiteDatabaseConfiguration.f41127c;
                if ((i5 & 536870912) == 0) {
                    return;
                }
                sQLiteDatabaseConfiguration.f41127c = i5 & (-536870913);
                try {
                    this.f41120h.y(sQLiteDatabaseConfiguration);
                } catch (RuntimeException e7) {
                    SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f41119g;
                    sQLiteDatabaseConfiguration2.f41127c = 536870912 | sQLiteDatabaseConfiguration2.f41127c;
                    throw e7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o3.InterfaceC3644a
    public final void p() {
        a();
        try {
            Q().c(null);
        } finally {
            d();
        }
    }

    @Override // o3.InterfaceC3644a
    public final Cursor t(f fVar) {
        a();
        try {
            String strA = fVar.a();
            SQLiteDirectCursorDriver sQLiteDirectCursorDriver = new SQLiteDirectCursorDriver(this, strA, "", null);
            SQLiteQuery sQLiteQuery = new SQLiteQuery(this, strA, null);
            fVar.b(sQLiteQuery);
            return new SQLiteCursor(sQLiteDirectCursorDriver, "", sQLiteQuery);
        } finally {
            d();
        }
    }

    public final String toString() {
        return "SQLiteDatabase: " + J();
    }

    public final void w(boolean z2) {
        SQLiteConnectionPool sQLiteConnectionPool;
        Throwable th;
        synchronized (this.f41117e) {
            try {
                CloseGuard closeGuard = this.f41118f;
                if (closeGuard != null) {
                    if (z2 && (th = closeGuard.f41043a) != null) {
                        Log.w("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", th);
                    }
                    this.f41118f.f41043a = null;
                }
                sQLiteConnectionPool = this.f41120h;
                this.f41120h = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z2) {
            return;
        }
        WeakHashMap weakHashMap = f41113j;
        synchronized (weakHashMap) {
            weakHashMap.remove(this);
        }
        if (sQLiteConnectionPool != null) {
            sQLiteConnectionPool.d(false);
        }
    }

    public final void y() {
        synchronized (this.f41117e) {
            try {
                b0();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.f41119g;
                int i5 = sQLiteDatabaseConfiguration.f41127c;
                if ((i5 & 536870912) != 0) {
                    return;
                }
                boolean z2 = true;
                if ((i5 & 1) != 1) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                if (sQLiteDatabaseConfiguration.f41125a.equalsIgnoreCase(":memory:")) {
                    Logger.b().a(4, null, "SQLiteDatabase", "can't enable WAL for memory databases.");
                    return;
                }
                if (this.f41121i) {
                    if (Logger.b().b(3, "SQLiteDatabase")) {
                        Logger.b().a(3, null, "SQLiteDatabase", "this database: " + this.f41119g.f41126b + " has attached databases. can't  enable WAL.");
                    }
                    return;
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.f41119g;
                sQLiteDatabaseConfiguration2.f41127c |= 536870912;
                try {
                    this.f41120h.y(sQLiteDatabaseConfiguration2);
                } catch (RuntimeException e7) {
                    this.f41119g.f41127c &= -536870913;
                    throw e7;
                }
            } finally {
            }
        }
    }

    public final void z(String str, Object[] objArr) {
        boolean z2;
        a();
        try {
            if (DatabaseUtils.a(str) == 3) {
                synchronized (this.f41117e) {
                    try {
                        if (this.f41121i) {
                            z2 = false;
                        } else {
                            z2 = true;
                            this.f41121i = true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z2) {
                    o();
                }
            }
            SQLiteStatement sQLiteStatement = new SQLiteStatement(this, str, objArr, null);
            try {
                sQLiteStatement.g();
            } finally {
                sQLiteStatement.d();
            }
        } finally {
            d();
        }
    }
}
