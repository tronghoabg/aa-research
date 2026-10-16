package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class clf extends defpackage.cka {
    public final long a;

    public clf(long j) {
        this.a = j;
    }

    @Override // defpackage.cka
    public final void a(long j, defpackage.cjs cjsVar, float f) {
        cjsVar.h(1.0f);
        long jK = this.a;
        if (f != 1.0f) {
            float fA = defpackage.ckd.a(jK) * f;
            float fD = defpackage.ckd.d(jK);
            float fC = defpackage.ckd.c(jK);
            float fB = defpackage.ckd.b(jK);
            float[] fArr = defpackage.clr.a;
            jK = defpackage.cjv.k(fD, fC, fB, fA, defpackage.clr.y[(int) (jK & 63)]);
        }
        cjsVar.j(jK);
        if (cjsVar.c != null) {
            cjsVar.m(null);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.clf) && this.a == ((defpackage.clf) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final java.lang.String toString() {
        return "SolidColor(value=" + defpackage.ckd.g(this.a) + ")";
    }
}
