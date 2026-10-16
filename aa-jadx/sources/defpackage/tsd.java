package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tsd implements defpackage.tsg {
    private final int a;
    private final int b;

    public tsd(int i, int i2) {
        this.a = i2;
        this.b = defpackage.tnm.k(i, 1.0f);
    }

    @Override // defpackage.tsg
    public final int a(int i) {
        return this.a;
    }

    @Override // defpackage.tsg
    public final void b(java.nio.ByteBuffer byteBuffer, int i) {
        for (int i2 = 0; i2 < this.a * i; i2++) {
            byteBuffer.putInt(this.b);
        }
    }
}
