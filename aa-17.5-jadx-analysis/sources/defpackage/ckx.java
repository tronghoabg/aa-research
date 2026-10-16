package defpackage;

/* loaded from: classes.dex */
public final class ckx extends cjs {
    public final long a;

    public ckx(long j) {
        this.a = j;
    }

    @Override // defpackage.cjs
    public final void a(long j, cjk cjkVar, float f) {
        cjkVar.h(1.0f);
        long j2 = this.a;
        if (f != 1.0f) {
            float fA = cjv.a(j2) * f;
            float fD = cjv.d(j2);
            float fC = cjv.c(j2);
            float fB = cjv.b(j2);
            float[] fArr = clj.a;
            j2 = cjn.j(fD, fC, fB, fA, clj.y[(int) (j2 & 63)]);
        }
        cjkVar.j(j2);
        if (cjkVar.c != null) {
            cjkVar.m(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckx) && this.a == ((ckx) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "SolidColor(value=" + cjv.g(this.a) + ")";
    }
}
