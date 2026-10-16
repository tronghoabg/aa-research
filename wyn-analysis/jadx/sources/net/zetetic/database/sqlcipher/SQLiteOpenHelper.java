package net.zetetic.database.sqlcipher;

import R8.v;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import ka.AbstractC3256n;
import net.zetetic.database.DatabaseErrorHandler;
import net.zetetic.database.Logger;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import o3.InterfaceC3644a;
import o3.d;

/* loaded from: classes5.dex */
public abstract class SQLiteOpenHelper implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41141a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41142b;

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteDatabase.CursorFactory f41143c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41144d;

    /* renamed from: e, reason: collision with root package name */
    public final int f41145e;

    /* renamed from: f, reason: collision with root package name */
    public SQLiteDatabase f41146f;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f41147g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41148h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41149i;

    /* renamed from: j, reason: collision with root package name */
    public final DatabaseErrorHandler f41150j;
    public final SQLiteDatabaseHook k;

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5) {
        this(context, str, cursorFactory, i5, null);
    }

    @Override // o3.d
    public final InterfaceC3644a I() {
        SQLiteDatabase sQLiteDatabaseA;
        synchronized (this) {
            sQLiteDatabaseA = a(true);
        }
        return sQLiteDatabaseA;
    }

    public final SQLiteDatabase a(boolean z2) {
        Context context = this.f41141a;
        SQLiteDatabase sQLiteDatabase = this.f41146f;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.f41146f = null;
            } else if (!z2 || !this.f41146f.W()) {
                return this.f41146f;
            }
        }
        if (this.f41148h) {
            throw new IllegalStateException("getDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabaseX = this.f41146f;
        try {
            this.f41148h = true;
            String str = this.f41142b;
            if (sQLiteDatabaseX != null) {
                if (z2 && sQLiteDatabaseX.W()) {
                    sQLiteDatabaseX.a0();
                }
            } else if (str == null) {
                sQLiteDatabaseX = SQLiteDatabase.X(268435456, ":memory:", null, null, null, new byte[0]);
            } else {
                try {
                    String path = !str.startsWith("file:") ? context.getDatabasePath(str).getPath() : str;
                    File file = new File(new File(path).getParent());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    sQLiteDatabaseX = SQLiteDatabase.X(this.f41149i ? 805306368 : 268435456, path, this.f41150j, this.f41143c, this.k, this.f41147g);
                } catch (SQLiteException e7) {
                    if (z2) {
                        throw e7;
                    }
                    Logger.a(e7, "SQLiteOpenHelper", "Couldn't open " + str + " for writing (will try read-only):");
                    sQLiteDatabaseX = SQLiteDatabase.X(1, context.getDatabasePath(str).getPath(), this.f41150j, this.f41143c, this.k, this.f41147g);
                }
            }
            b(sQLiteDatabaseX);
            int iV = sQLiteDatabaseX.V();
            int i5 = this.f41144d;
            if (iV != i5) {
                if (sQLiteDatabaseX.W()) {
                    throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabaseX.V() + " to " + i5 + ": " + str);
                }
                if (iV > 0 && iV < this.f41145e) {
                    File file2 = new File(sQLiteDatabaseX.J());
                    sQLiteDatabaseX.d();
                    if (!SQLiteDatabase.i(file2)) {
                        throw new IllegalStateException("Unable to delete obsolete database " + str + " with version " + iV);
                    }
                    this.f41148h = false;
                    SQLiteDatabase sQLiteDatabaseA = a(z2);
                    this.f41148h = false;
                    if (sQLiteDatabaseX != this.f41146f) {
                        sQLiteDatabaseX.d();
                    }
                    return sQLiteDatabaseA;
                }
                sQLiteDatabaseX.h(true);
                try {
                    if (iV == 0) {
                        d(sQLiteDatabaseX);
                    } else if (iV > i5) {
                        h(sQLiteDatabaseX, iV, i5);
                    } else {
                        o(sQLiteDatabaseX, iV, i5);
                    }
                    sQLiteDatabaseX.getClass();
                    sQLiteDatabaseX.z("PRAGMA user_version = " + i5, null);
                    sQLiteDatabaseX.k();
                    sQLiteDatabaseX.p();
                } catch (Throwable th) {
                    sQLiteDatabaseX.p();
                    throw th;
                }
            }
            i(sQLiteDatabaseX);
            if (sQLiteDatabaseX.W()) {
                Logger.b().a(5, null, "SQLiteOpenHelper", "Opened " + str + " in read-only mode");
            }
            this.f41146f = sQLiteDatabaseX;
            this.f41148h = false;
            return sQLiteDatabaseX;
        } catch (Throwable th2) {
            this.f41148h = false;
            if (sQLiteDatabaseX != null && sQLiteDatabaseX != this.f41146f) {
                sQLiteDatabaseX.d();
            }
            throw th2;
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f41148h) {
            throw new IllegalStateException("Closed during initialization");
        }
        SQLiteDatabase sQLiteDatabase = this.f41146f;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f41146f.d();
            this.f41146f = null;
        }
    }

    public abstract void d(SQLiteDatabase sQLiteDatabase);

    public void h(SQLiteDatabase sQLiteDatabase, int i5, int i10) {
        throw new SQLiteException(v.e(i5, i10, "Can't downgrade database from version ", " to "));
    }

    public void i(SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void o(SQLiteDatabase sQLiteDatabase, int i5, int i10);

    @Override // o3.d
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        synchronized (this) {
            try {
                if (this.f41149i != z2) {
                    SQLiteDatabase sQLiteDatabase = this.f41146f;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.f41146f.W()) {
                        if (z2) {
                            this.f41146f.y();
                        } else {
                            this.f41146f.o();
                        }
                    }
                    this.f41149i = z2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i5, 0, databaseErrorHandler);
    }

    public SQLiteOpenHelper(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i5, int i10, DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i5, i10, databaseErrorHandler, (SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(Context context, String str, byte[] bArr, SQLiteDatabase.CursorFactory cursorFactory, int i5, int i10, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z2) {
        if (i5 >= 1) {
            this.f41141a = context;
            this.f41142b = str;
            this.f41147g = bArr;
            this.f41143c = cursorFactory;
            this.f41144d = i5;
            this.f41150j = databaseErrorHandler;
            this.k = sQLiteDatabaseHook;
            this.f41149i = z2;
            this.f41145e = Math.max(0, i10);
            return;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i5, "Version must be >= 1, was "));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SQLiteOpenHelper(Context context, String str, String str2, SQLiteDatabase.CursorFactory cursorFactory, int i5, int i10, DatabaseErrorHandler databaseErrorHandler, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z2) {
        byte[] bArr;
        if (str2 != null && str2.length() != 0) {
            ByteBuffer byteBufferEncode = Charset.forName("UTF-8").encode(CharBuffer.wrap(str2));
            bArr = new byte[byteBufferEncode.limit()];
            byteBufferEncode.get(bArr);
        } else {
            bArr = new byte[0];
        }
        this(context, str, bArr, cursorFactory, i5, i10, databaseErrorHandler, sQLiteDatabaseHook, z2);
    }
}
