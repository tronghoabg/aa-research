package defpackage;

/* loaded from: classes.dex */
public final class ktu {
    private final krr a;
    private final float b = 0.38f;

    public ktu(krr krrVar) {
        this.a = krrVar;
    }

    public final long a(bux buxVar) {
        buxVar.v(-2053410158);
        kso ksoVar = ksp.a;
        long jB = ksp.b(kfn.i(buxVar), this.a);
        float fD = cjv.d(jB);
        float fC = cjv.c(jB);
        float fB = cjv.b(jB);
        float[] fArr = clj.a;
        long j = cjn.j(fD, fC, fB, 0.38f, clj.y[(int) (jB & 63)]);
        buxVar.o();
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktu)) {
            return false;
        }
        ktu ktuVar = (ktu) obj;
        if (this.a != ktuVar.a) {
            return false;
        }
        float f = ktuVar.b;
        return Float.compare(0.38f, 0.38f) == 0;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(0.38f);
    }

    public final String toString() {
        return "ModifiedToken(token=" + this.a + ", alpha=0.38)";
    }
}
