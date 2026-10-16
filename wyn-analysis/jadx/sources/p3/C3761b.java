package p3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import ef.EnumC2526j;
import kotlin.jvm.internal.AbstractC3340k;
import o3.InterfaceC3644a;

/* renamed from: p3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3761b implements InterfaceC3644a {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f43203b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f43204c = new String[0];

    /* renamed from: d, reason: collision with root package name */
    public static final Object f43205d;

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f43206a;

    static {
        EnumC2526j enumC2526j = EnumC2526j.f34669c;
        f43205d = Fe.c.y(enumC2526j, new com.moloco.sdk.service_locator.h(27));
        Fe.c.y(enumC2526j, new com.moloco.sdk.service_locator.h(28));
    }

    public C3761b(SQLiteDatabase sQLiteDatabase) {
        this.f43206a = sQLiteDatabase;
    }

    @Override // o3.InterfaceC3644a
    public final o3.g A(String sql) throws SQLException {
        AbstractC3340k.e(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f43206a.compileStatement(sql);
        AbstractC3340k.d(sQLiteStatementCompileStatement, "compileStatement(...)");
        return new j(sQLiteStatementCompileStatement);
    }

    @Override // o3.InterfaceC3644a
    public final Cursor K(String query) {
        AbstractC3340k.e(query, "query");
        return t(new Ne.a(query));
    }

    @Override // o3.InterfaceC3644a
    public final boolean O() {
        return this.f43206a.inTransaction();
    }

    @Override // o3.InterfaceC3644a
    public final boolean R() {
        return this.f43206a.isWriteAheadLoggingEnabled();
    }

    @Override // o3.InterfaceC3644a
    public final int U(ContentValues contentValues, Object[] objArr) throws SQLException {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb2 = new StringBuilder("UPDATE ");
        sb2.append(f43203b[3]);
        sb2.append("WorkSpec SET ");
        int i5 = 0;
        for (String str : contentValues.keySet()) {
            sb2.append(i5 > 0 ? "," : "");
            sb2.append(str);
            objArr2[i5] = contentValues.get(str);
            sb2.append("=?");
            i5++;
        }
        for (int i10 = size; i10 < length; i10++) {
            objArr2[i10] = objArr[i10 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb2.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        o3.g gVarA = A(sb2.toString());
        int length2 = objArr2.length;
        int i11 = 0;
        while (i11 < length2) {
            Object obj = objArr2[i11];
            i11++;
            if (obj == null) {
                gVarA.N(i11);
            } else if (obj instanceof byte[]) {
                gVarA.H(i11, (byte[]) obj);
            } else if (obj instanceof Float) {
                gVarA.M(((Number) obj).floatValue(), i11);
            } else if (obj instanceof Double) {
                gVarA.M(((Number) obj).doubleValue(), i11);
            } else if (obj instanceof Long) {
                gVarA.G(i11, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                gVarA.G(i11, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                gVarA.G(i11, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                gVarA.G(i11, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                gVarA.x(i11, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i11 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                gVarA.G(i11, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((j) gVarA).f43235b.executeUpdateDelete();
    }

    @Override // o3.InterfaceC3644a
    public final void c() {
        this.f43206a.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43206a.close();
    }

    @Override // o3.InterfaceC3644a
    public final void f(String sql) throws SQLException {
        AbstractC3340k.e(sql, "sql");
        this.f43206a.execSQL(sql);
    }

    @Override // o3.InterfaceC3644a
    public final boolean isOpen() {
        return this.f43206a.isOpen();
    }

    @Override // o3.InterfaceC3644a
    public final void k() {
        this.f43206a.setTransactionSuccessful();
    }

    @Override // o3.InterfaceC3644a
    public final void l(String str, Object[] objArr) throws SQLException {
        this.f43206a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // o3.InterfaceC3644a
    public final void n() {
        this.f43206a.beginTransactionNonExclusive();
    }

    @Override // o3.InterfaceC3644a
    public final void p() {
        this.f43206a.endTransaction();
    }

    @Override // o3.InterfaceC3644a
    public final Cursor t(o3.f fVar) {
        Cursor cursorRawQueryWithFactory = this.f43206a.rawQueryWithFactory(new jb.c(new C3760a(fVar), 1), fVar.a(), f43204c, null);
        AbstractC3340k.d(cursorRawQueryWithFactory, "rawQueryWithFactory(...)");
        return cursorRawQueryWithFactory;
    }
}
