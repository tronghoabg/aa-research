package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@defpackage.afeo
public final class bzk {
    public static final int a(defpackage.zm zmVar) {
        int iA;
        int iA2 = zmVar.a(0);
        while (zmVar.b != 0 && zmVar.a(0) == iA2) {
            zmVar.g(0, zmVar.b());
            zmVar.f(zmVar.b - 1);
            int i = zmVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int iA3 = zmVar.a(i3);
                int i4 = i3 + 1;
                int i5 = i4 + i4;
                int i6 = i5 - 1;
                int iA4 = zmVar.a(i6);
                if (i5 < i && (iA = zmVar.a(i5)) > iA4) {
                    if (iA <= iA3) {
                        break;
                    }
                    zmVar.g(i3, iA);
                    zmVar.g(i5, iA3);
                    i3 = i5;
                } else {
                    if (iA4 <= iA3) {
                        break;
                    }
                    zmVar.g(i3, iA4);
                    zmVar.g(i6, iA3);
                    i3 = i6;
                }
            }
        }
        return iA2;
    }

    public static final void b(defpackage.zm zmVar, int i) {
        if (zmVar.b == 0 || !(zmVar.a(0) == i || zmVar.a(zmVar.b - 1) == i)) {
            int i2 = zmVar.b;
            zmVar.e(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int iA = zmVar.a(i3);
                if (i <= iA) {
                    break;
                }
                zmVar.g(i2, iA);
                i2 = i3;
            }
            zmVar.g(i2, i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final java.lang.String toString() {
        throw null;
    }
}
