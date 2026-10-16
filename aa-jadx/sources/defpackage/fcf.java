package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class fcf implements defpackage.fbx {
    private final android.database.sqlite.SQLiteProgram a;

    public fcf(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.fbx
    public final void a(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.fbx
    public final void b(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.fbx
    public final void c(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.fbx
    public final void d(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.fbx
    public final void e(int i, java.lang.String str) {
        this.a.bindString(i, str);
    }
}
