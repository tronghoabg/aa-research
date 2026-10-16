package defpackage;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes2.dex */
public class fby implements fbq {
    private final SQLiteProgram a;

    public fby(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.fbq
    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.fbq
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.fbq
    public final void c(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.fbq
    public final void d(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.fbq
    public final void e(int i, String str) {
        this.a.bindString(i, str);
    }
}
