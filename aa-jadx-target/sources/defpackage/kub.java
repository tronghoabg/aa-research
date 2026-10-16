package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kub {
    private final defpackage.kry a;
    private final float b = 0.38f;

    public kub(defpackage.kry kryVar) {
        this.a = kryVar;
    }

    public final long a(defpackage.bve bveVar) {
        bveVar.v(-2053410158);
        defpackage.ksw kswVar = defpackage.ksx.a;
        long jB = defpackage.ksx.b(defpackage.kfp.i(bveVar), this.a);
        float fD = defpackage.ckd.d(jB);
        float fC = defpackage.ckd.c(jB);
        float fB = defpackage.ckd.b(jB);
        float[] fArr = defpackage.clr.a;
        long jK = defpackage.cjv.k(fD, fC, fB, 0.38f, defpackage.clr.y[(int) (jB & 63)]);
        bveVar.o();
        return jK;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kub)) {
            return false;
        }
        defpackage.kub kubVar = (defpackage.kub) obj;
        if (this.a != kubVar.a) {
            return false;
        }
        float f = kubVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1052938076;
    }

    public final java.lang.String toString() {
        return "ModifiedToken(token=" + this.a + ", alpha=0.38)";
    }
}
