package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aaew {
    public final double a;
    public final double b;

    static {
        new defpackage.aaew(0.0d, 0.0d);
    }

    public aaew(double d, double d2) {
        defpackage.acmj.h((java.lang.Double.isNaN(d) || java.lang.Double.isNaN(d2)) ? false : true, "NaN is not a valid value: (%s,%s)", new java.lang.Object[]{java.lang.Double.valueOf(d), java.lang.Double.valueOf(d2)});
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.aaew)) {
            return false;
        }
        defpackage.aaew aaewVar = (defpackage.aaew) obj;
        return this.a == aaewVar.a && this.b == aaewVar.b;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Double.valueOf(this.a), java.lang.Double.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        defpackage.zte zteVarA = defpackage.zte.a(this);
        zteVarA.c("x", this.a);
        zteVarA.c("y", this.b);
        return zteVarA.toString();
    }
}
