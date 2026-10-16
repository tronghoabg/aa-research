package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adxp extends java.io.OutputStream {
    final /* synthetic */ defpackage.adxr a;

    public adxp(defpackage.adxr adxrVar) {
        this.a = adxrVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.c(bArr, i, i2);
    }
}
