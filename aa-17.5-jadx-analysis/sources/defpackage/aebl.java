package defpackage;

/* loaded from: classes3.dex */
final class aebl implements aeag {
    public final ajmy a;
    private int b;
    private int c;

    public aebl(ajmy ajmyVar, int i) {
        this.a = ajmyVar;
        this.b = i;
    }

    @Override // defpackage.aeag
    public final int a() {
        return this.c;
    }

    @Override // defpackage.aeag
    public final int b() {
        return this.b;
    }

    @Override // defpackage.aeag
    public final void c(byte b) {
        this.a.N(b);
        this.b--;
        this.c++;
    }

    @Override // defpackage.aeag
    public final void d(byte[] bArr, int i, int i2) {
        this.a.L(bArr, i, i2);
        this.b -= i2;
        this.c += i2;
    }
}
