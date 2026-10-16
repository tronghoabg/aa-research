package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kon extends java.io.OutputStream {
    public final java.io.OutputStream a;
    private final defpackage.pbp b;

    public kon(java.io.OutputStream outputStream, defpackage.pbp pbpVar) {
        this.a = outputStream;
        this.b = pbpVar;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws java.lang.Throwable {
        defpackage.kou.m().b(this.b, new defpackage.kom(this, bArr, i, i2, 0));
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws java.lang.Throwable {
        defpackage.kou.m().b(this.b, new defpackage.kol(this, i, 0));
    }
}
