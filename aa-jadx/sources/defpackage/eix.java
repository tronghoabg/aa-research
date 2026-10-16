package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eix implements java.lang.Iterable, java.io.Serializable {
    private static final defpackage.eit a;
    public static final defpackage.eix b = new defpackage.eiv(defpackage.ejv.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    static {
        a = defpackage.eio.a() ? new defpackage.eiw(0) : new defpackage.eiw(1);
    }

    public static defpackage.eix i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static defpackage.eix j(byte[] bArr, int i, int i2) {
        defpackage.a.E(i, i + i2, bArr.length);
        return new defpackage.eiv(a.a(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    protected abstract void d(byte[] bArr, int i);

    public abstract boolean equals(java.lang.Object obj);

    public abstract void f(defpackage.eiq eiqVar) throws java.io.IOException;

    protected abstract int g(int i, int i2);

    public abstract defpackage.eix h(int i);

    public final int hashCode() {
        int iG = this.c;
        if (iG == 0) {
            int iC = c();
            iG = g(iC, iC);
            if (iG == 0) {
                iG = 1;
            }
            this.c = iG;
        }
        return iG;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator iterator() {
        return new defpackage.eir(this);
    }

    public final byte[] k() {
        int iC = c();
        if (iC == 0) {
            return defpackage.ejv.b;
        }
        byte[] bArr = new byte[iC];
        d(bArr, iC);
        return bArr;
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(c()), c() <= 50 ? defpackage.duc.g(this) : defpackage.duc.g(h(47)).concat("..."));
    }
}
