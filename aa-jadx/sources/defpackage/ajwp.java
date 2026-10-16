package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class ajwp {
    protected byte[] a = null;
    protected int b = 0;

    protected final void a(byte b) {
        byte[] bArr = this.a;
        int i = this.b;
        bArr[i] = b;
        this.b = i + 1;
    }

    protected final void b(int i) {
        a((byte) (i & 255));
        a((byte) ((i >> 8) & 255));
        a((byte) ((i >> 16) & 255));
        a((byte) ((i >> 24) & 255));
    }

    protected final void c(int i) {
        a((byte) (i & 255));
        a((byte) (i >> 8));
    }
}
