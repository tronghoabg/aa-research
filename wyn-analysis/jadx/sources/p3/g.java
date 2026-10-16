package p3;

import E5.Q;
import ac.C1346a;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;
import q3.C3865a;

/* loaded from: classes.dex */
public final class g extends SQLiteOpenHelper {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f43219h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f43220a;

    /* renamed from: b, reason: collision with root package name */
    public final C1346a f43221b;

    /* renamed from: c, reason: collision with root package name */
    public final N2.j f43222c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f43223d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f43224e;

    /* renamed from: f, reason: collision with root package name */
    public final C3865a f43225f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, final C1346a c1346a, final N2.j callback, boolean z2) {
        String string;
        super(context, str, null, callback.f8379b, new DatabaseErrorHandler() { // from class: p3.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i5 = g.f43219h;
                AbstractC3340k.b(sQLiteDatabase);
                C3761b c3761bW = gc.b.w(c1346a, sQLiteDatabase);
                callback.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c3761bW + ".path");
                SQLiteDatabase sQLiteDatabase2 = c3761bW.f43206a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        N2.j.g(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                AbstractC3340k.d(second, "second");
                                N2.j.g((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                N2.j.g(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c3761bW.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        AbstractC3340k.e(callback, "callback");
        this.f43220a = context;
        this.f43221b = c1346a;
        this.f43222c = callback;
        this.f43223d = z2;
        if (str == null) {
            string = UUID.randomUUID().toString();
            AbstractC3340k.d(string, "toString(...)");
        } else {
            string = str;
        }
        this.f43225f = new C3865a(context.getCacheDir(), string, false);
    }

    public final InterfaceC3644a a(boolean z2) throws IOException {
        C3865a c3865a = this.f43225f;
        try {
            c3865a.a((this.f43226g || getDatabaseName() == null) ? false : true);
            this.f43224e = false;
            SQLiteDatabase sQLiteDatabaseB = b(z2);
            if (!this.f43224e) {
                C3761b c3761bW = gc.b.w(this.f43221b, sQLiteDatabaseB);
                c3865a.b();
                return c3761bW;
            }
            close();
            InterfaceC3644a interfaceC3644aA = a(z2);
            c3865a.b();
            return interfaceC3644aA;
        } catch (Throwable th) {
            c3865a.b();
            throw th;
        }
    }

    public final SQLiteDatabase b(boolean z2) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.f43226g;
        Context context = this.f43220a;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z2) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                AbstractC3340k.b(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            AbstractC3340k.b(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z2) {
                    readableDatabase2 = getWritableDatabase();
                    AbstractC3340k.b(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    AbstractC3340k.b(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof e) {
                    e eVar = (e) th;
                    int iOrdinal = eVar.f43211a.ordinal();
                    th = eVar.f43212b;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        throw new Q((byte) 0, 9);
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f43223d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z2) {
                        readableDatabase = getWritableDatabase();
                        AbstractC3340k.b(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        AbstractC3340k.b(readableDatabase);
                    }
                    return readableDatabase;
                } catch (e e7) {
                    throw e7.f43212b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C3865a c3865a = this.f43225f;
        try {
            c3865a.a(c3865a.f44116a);
            super.close();
            this.f43221b.f17489b = null;
            this.f43226g = false;
        } finally {
            c3865a.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        AbstractC3340k.e(db2, "db");
        boolean z2 = this.f43224e;
        N2.j jVar = this.f43222c;
        if (!z2 && jVar.f8379b != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            jVar.i(gc.b.w(this.f43221b, db2));
        } catch (Throwable th) {
            throw new e(f.f43213a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        AbstractC3340k.e(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.f43222c.j(gc.b.w(this.f43221b, sqLiteDatabase));
        } catch (Throwable th) {
            throw new e(f.f43214b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i5, int i10) {
        AbstractC3340k.e(db2, "db");
        this.f43224e = true;
        try {
            this.f43222c.k(gc.b.w(this.f43221b, db2), i5, i10);
        } catch (Throwable th) {
            throw new e(f.f43216d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        AbstractC3340k.e(db2, "db");
        if (!this.f43224e) {
            try {
                this.f43222c.l(gc.b.w(this.f43221b, db2));
            } catch (Throwable th) {
                throw new e(f.f43217e, th);
            }
        }
        this.f43226g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i5, int i10) {
        AbstractC3340k.e(sqLiteDatabase, "sqLiteDatabase");
        this.f43224e = true;
        try {
            this.f43222c.m(gc.b.w(this.f43221b, sqLiteDatabase), i5, i10);
        } catch (Throwable th) {
            throw new e(f.f43215c, th);
        }
    }
}
