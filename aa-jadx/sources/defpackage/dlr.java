package defpackage;

/* JADX INFO: loaded from: classes.dex */
@defpackage.afeo
public final class dlr implements java.lang.Comparable {
    public final float a;

    public static int a(float f, float f2) {
        if (java.lang.Float.isNaN(f) || java.lang.Float.isNaN(f2)) {
            return 0;
        }
        return java.lang.Float.compare(f, f2);
    }

    public static java.lang.String b(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    public static final boolean c(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object obj) {
        return a(this.a, ((defpackage.dlr) obj).a);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.dlr) && java.lang.Float.compare(this.a, ((defpackage.dlr) obj).a) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return b(this.a);
    }
}
