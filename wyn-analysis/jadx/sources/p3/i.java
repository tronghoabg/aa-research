package p3;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public class i implements o3.e {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f43234a;

    public i(SQLiteProgram delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f43234a = delegate;
    }

    @Override // o3.e
    public final void G(int i5, long j8) {
        this.f43234a.bindLong(i5, j8);
    }

    @Override // o3.e
    public final void H(int i5, byte[] bArr) {
        this.f43234a.bindBlob(i5, bArr);
    }

    @Override // o3.e
    public final void M(double d3, int i5) {
        this.f43234a.bindDouble(i5, d3);
    }

    @Override // o3.e
    public final void N(int i5) {
        this.f43234a.bindNull(i5);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43234a.close();
    }

    @Override // o3.e
    public final void x(int i5, String value) {
        AbstractC3340k.e(value, "value");
        this.f43234a.bindString(i5, value);
    }
}
