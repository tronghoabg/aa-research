package r9;

import A7.C0240c0;
import ac.C1346a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteProgram;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import me.C3558a;
import n9.C3610e;
import ne.C3618a;
import p7.AbstractC3772b;
import w9.InterfaceC4396o;

/* loaded from: classes4.dex */
public final class K extends AbstractC3772b {

    /* renamed from: e, reason: collision with root package name */
    public final J f44576e;

    /* renamed from: f, reason: collision with root package name */
    public final a2.v f44577f;

    /* renamed from: g, reason: collision with root package name */
    public final O f44578g;

    /* renamed from: h, reason: collision with root package name */
    public final X2.j f44579h;

    /* renamed from: i, reason: collision with root package name */
    public final C3558a f44580i;

    /* renamed from: j, reason: collision with root package name */
    public final C0240c0 f44581j;
    public final I k;

    /* renamed from: l, reason: collision with root package name */
    public SQLiteDatabase f44582l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44583m;

    public K(Context context, String str, s9.f fVar, a2.v vVar, J5.n nVar) {
        J j8 = new J(context, vVar, e0(str, fVar));
        this.k = new I(this);
        this.f44576e = j8;
        this.f44577f = vVar;
        this.f44578g = new O(this, vVar);
        this.f44579h = new X2.j(28, this, vVar);
        C3558a c3558a = new C3558a();
        c3558a.f40736a = this;
        c3558a.f40737b = vVar;
        this.f44580i = c3558a;
        this.f44581j = new C0240c0(this, nVar);
    }

    public static void c0(SQLiteProgram sQLiteProgram, Object[] objArr) {
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                sQLiteProgram.bindNull(i5 + 1);
            } else if (obj instanceof String) {
                sQLiteProgram.bindString(i5 + 1, (String) obj);
            } else if (obj instanceof Integer) {
                sQLiteProgram.bindLong(i5 + 1, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                sQLiteProgram.bindLong(i5 + 1, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                sQLiteProgram.bindDouble(i5 + 1, ((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    A6.c.s("Unknown argument %s of type %s", obj, obj.getClass());
                    throw null;
                }
                sQLiteProgram.bindBlob(i5 + 1, (byte[]) obj);
            }
        }
    }

    public static void d0(Context context, s9.f fVar, String str) {
        String path = context.getDatabasePath(e0(str, fVar)).getPath();
        String strF = N0.a.f(path, "-journal");
        String strF2 = N0.a.f(path, "-wal");
        File file = new File(path);
        File file2 = new File(strF);
        File file3 = new File(strF2);
        try {
            A6.h.s(file);
            A6.h.s(file2);
            A6.h.s(file3);
        } catch (IOException e7) {
            throw new m9.G("Failed to clear persistence." + e7, m9.F.UNKNOWN);
        }
    }

    public static String e0(String str, s9.f fVar) {
        try {
            return "firestore." + URLEncoder.encode(str, "utf-8") + "." + URLEncoder.encode(fVar.f45370a, "utf-8") + "." + URLEncoder.encode(fVar.f45371b, "utf-8");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // p7.AbstractC3772b
    public final w B() {
        return new C1346a(this, 19);
    }

    @Override // p7.AbstractC3772b
    public final z D() {
        return this.f44581j;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3940A E() {
        return this.f44580i;
    }

    @Override // p7.AbstractC3772b
    public final Q G() {
        return this.f44578g;
    }

    @Override // p7.AbstractC3772b
    public final boolean J() {
        return this.f44583m;
    }

    @Override // p7.AbstractC3772b
    public final Object O(String str, InterfaceC4396o interfaceC4396o) {
        Ba.c.p("b", "Starting transaction: %s", 1, str);
        this.f44582l.beginTransactionWithListener(this.k);
        try {
            Object obj = interfaceC4396o.get();
            this.f44582l.setTransactionSuccessful();
            return obj;
        } finally {
            this.f44582l.endTransaction();
        }
    }

    @Override // p7.AbstractC3772b
    public final void P(String str, Runnable runnable) {
        Ba.c.p("b", "Starting transaction: %s", 1, str);
        this.f44582l.beginTransactionWithListener(this.k);
        try {
            runnable.run();
            this.f44582l.setTransactionSuccessful();
        } finally {
            this.f44582l.endTransaction();
        }
    }

    @Override // p7.AbstractC3772b
    public final void S() {
        A6.c.z(this.f44583m, "SQLitePersistence shutdown without start!", new Object[0]);
        this.f44583m = false;
        this.f44582l.close();
        this.f44582l = null;
    }

    @Override // p7.AbstractC3772b
    public final void T() {
        boolean z2;
        A6.c.z(!this.f44583m, "SQLitePersistence double-started!", new Object[0]);
        this.f44583m = true;
        try {
            this.f44582l = this.f44576e.getWritableDatabase();
            O o7 = this.f44578g;
            C3618a c3618aG0 = o7.f44590a.g0("SELECT highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos, target_count FROM target_globals LIMIT 1");
            C3943D c3943d = new C3943D(o7, 2);
            Cursor cursorI = c3618aG0.i();
            try {
                if (cursorI.moveToFirst()) {
                    c3943d.accept(cursorI);
                    cursorI.close();
                    z2 = true;
                } else {
                    cursorI.close();
                    z2 = false;
                }
                A6.c.z(z2, "Missing target_globals entry", new Object[0]);
                long j8 = o7.f44593d;
                C0240c0 c0240c0 = this.f44581j;
                c0240c0.getClass();
                J5.n nVar = new J5.n();
                nVar.f5655a = j8;
                c0240c0.f828c = nVar;
            } catch (Throwable th) {
                if (cursorI != null) {
                    try {
                        cursorI.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteDatabaseLockedException e7) {
            throw new RuntimeException("Failed to gain exclusive lock to the Cloud Firestore client's offline persistence. This generally means you are using Cloud Firestore from multiple processes in your app. Keep in mind that multi-process Android apps execute the code in your Application class in all processes, so you may need to avoid initializing Cloud Firestore in your Application class. If you are intentionally using Cloud Firestore from multiple processes, you can only enable offline persistence (that is, call setPersistenceEnabled(true)) in one of them.", e7);
        }
    }

    public final void f0(String str, Object... objArr) {
        this.f44582l.execSQL(str, objArr);
    }

    public final C3618a g0(String str) {
        SQLiteDatabase sQLiteDatabase = this.f44582l;
        C3618a c3618a = new C3618a();
        c3618a.f41020a = sQLiteDatabase;
        c3618a.f41021b = str;
        return c3618a;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3944a u() {
        return this.f44579h;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3945b x(C3610e c3610e) {
        a2.v vVar = this.f44577f;
        md.J j8 = new md.J();
        j8.f40580a = this;
        j8.f40581b = vVar;
        String str = c3610e.f40955a;
        if (str == null) {
            str = "";
        }
        j8.f40582c = str;
        return j8;
    }

    @Override // p7.AbstractC3772b
    public final InterfaceC3949f y(C3610e c3610e) {
        return new F(this, this.f44577f, c3610e);
    }

    @Override // p7.AbstractC3772b
    public final v z(C3610e c3610e, InterfaceC3949f interfaceC3949f) {
        a2.v vVar = this.f44577f;
        R1.q qVar = new R1.q();
        qVar.f10158b = this;
        qVar.f10159c = vVar;
        String str = c3610e.f40955a;
        if (str == null) {
            str = "";
        }
        qVar.f10161e = str;
        qVar.f10162f = v9.B.f47037u;
        qVar.f10160d = interfaceC3949f;
        return qVar;
    }
}
