package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class eip implements Iterable, Serializable {
    private static final eil a;
    public static final eip b = new ein(ejn.b);
    private static final long serialVersionUID = 1;
    public int c = 0;

    static {
        a = eig.a() ? new eio(0) : new eio(1);
    }

    public static eip i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static eip j(byte[] bArr, int i, int i2) {
        a.F(i, i + i2, bArr.length);
        return new ein(a.a(bArr, i, i2));
    }

    public abstract byte a(int i);

    public abstract byte b(int i);

    public abstract int c();

    protected abstract void d(byte[] bArr, int i);

    public abstract boolean equals(Object obj);

    public abstract void f(eii eiiVar) throws IOException;

    protected abstract int g(int i, int i2);

    public abstract eip h(int i);

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
    public /* synthetic */ Iterator iterator() {
        return new eij(this);
    }

    public final byte[] k() {
        int iC = c();
        if (iC == 0) {
            return ejn.b;
        }
        byte[] bArr = new byte[iC];
        d(bArr, iC);
        return bArr;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c()), c() <= 50 ? dti.f(this) : dti.f(h(47)).concat("..."));
    }
}
