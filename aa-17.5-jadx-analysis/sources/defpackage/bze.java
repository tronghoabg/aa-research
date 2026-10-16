package defpackage;

@afdo
/* loaded from: classes.dex */
public final class bze {
    public static final int a(zf zfVar) {
        int iA;
        int iA2 = zfVar.a(0);
        while (zfVar.b != 0 && zfVar.a(0) == iA2) {
            zfVar.g(0, zfVar.b());
            zfVar.f(zfVar.b - 1);
            int i = zfVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iA3 = zfVar.a(i3);
                int i4 = i3 + 1;
                int i5 = i4 + i4;
                int i6 = i5 - 1;
                int iA4 = zfVar.a(i6);
                if (i5 >= i || (iA = zfVar.a(i5)) <= iA4) {
                    if (iA4 > iA3) {
                        zfVar.g(i3, iA4);
                        zfVar.g(i6, iA3);
                        i3 = i6;
                    }
                } else if (iA > iA3) {
                    zfVar.g(i3, iA);
                    zfVar.g(i5, iA3);
                    i3 = i5;
                }
            }
        }
        return iA2;
    }

    public static final void b(zf zfVar, int i) {
        if (zfVar.b == 0 || !(zfVar.a(0) == i || zfVar.a(zfVar.b - 1) == i)) {
            int i2 = zfVar.b;
            zfVar.e(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = zfVar.a(i3);
                if (i <= iA) {
                    break;
                }
                zfVar.g(i2, iA);
                i2 = i3;
            }
            zfVar.g(i2, i);
        }
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
