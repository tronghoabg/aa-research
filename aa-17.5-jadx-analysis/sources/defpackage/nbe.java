package defpackage;

/* loaded from: classes.dex */
public final class nbe {
    public static final nbe a = new nbe(0, 0, 7);
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ nbe(long j, long j2, int i) {
        j = (i & 1) != 0 ? cjn.n() : j;
        j2 = (i & 2) != 0 ? cjn.n() : j2;
        long jN = cjn.n();
        this.b = j;
        this.c = j2;
        this.d = jN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbe)) {
            return false;
        }
        nbe nbeVar = (nbe) obj;
        return a.j(this.b, nbeVar.b) && a.j(this.c, nbeVar.c) && a.j(this.d, nbeVar.d);
    }

    public final int hashCode() {
        return (((a.g(this.b) * 31) + a.g(this.c)) * 31) + a.g(this.d);
    }

    public final String toString() {
        long j = this.d;
        long j2 = this.c;
        return "PagerIndicatorColors(indicatorTint=" + cjv.g(this.b) + ", focusRingColor=" + cjv.g(j2) + ", background=" + cjv.g(j) + ")";
    }
}
