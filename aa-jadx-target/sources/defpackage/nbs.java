package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nbs {
    public static final defpackage.nbs a = new defpackage.nbs(0, 0, 7);
    public final long b;
    public final long c;
    public final long d;

    public /* synthetic */ nbs(long j, long j2, int i) {
        j = (i & 1) != 0 ? defpackage.cjv.c() : j;
        j2 = (i & 2) != 0 ? defpackage.cjv.c() : j2;
        long jC = defpackage.cjv.c();
        this.b = j;
        this.c = j2;
        this.d = jC;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nbs)) {
            return false;
        }
        defpackage.nbs nbsVar = (defpackage.nbs) obj;
        return defpackage.a.i(this.b, nbsVar.b) && defpackage.a.i(this.c, nbsVar.c) && defpackage.a.i(this.d, nbsVar.d);
    }

    public final int hashCode() {
        return (((defpackage.a.f(this.b) * 31) + defpackage.a.f(this.c)) * 31) + defpackage.a.f(this.d);
    }

    public final java.lang.String toString() {
        long j = this.d;
        long j2 = this.c;
        return "PagerIndicatorColors(indicatorTint=" + defpackage.ckd.g(this.b) + ", focusRingColor=" + defpackage.ckd.g(j2) + ", background=" + defpackage.ckd.g(j) + ")";
    }
}
