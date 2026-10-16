package defpackage;

/* loaded from: classes.dex */
public final class u4 {
    public v4 a;
    public int b;
    public byte[] c;
    public byte[] d;
    public int e;

    public final void a() {
        v4 v4Var = this.a;
        int i = this.e;
        int i2 = this.b;
        int i3 = (i / i2) + 1;
        if (i3 >= 256) {
            throw new f4("HKDF cannot generate more than 255 blocks of HashLen size");
        }
        if (i != 0) {
            v4Var.a.k(this.d, 0, i2);
        }
        byte[] bArr = this.c;
        v4Var.a.k(bArr, 0, bArr.length);
        v4Var.a.j((byte) i3);
        v4Var.a(this.d);
    }
}
