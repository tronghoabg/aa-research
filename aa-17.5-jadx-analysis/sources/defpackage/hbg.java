package defpackage;

/* loaded from: classes2.dex */
final class hbg {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final ckv f;
    public final long g;
    public final long h;

    public hbg(long j, long j2, long j3, long j4, long j5, ckv ckvVar, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = ckvVar;
        this.g = j6;
        this.h = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbg)) {
            return false;
        }
        hbg hbgVar = (hbg) obj;
        return a.j(this.a, hbgVar.a) && a.j(this.b, hbgVar.b) && a.j(this.c, hbgVar.c) && a.j(this.d, hbgVar.d) && a.j(this.e, hbgVar.e) && affa.f(this.f, hbgVar.f) && a.j(this.g, hbgVar.g) && a.j(this.h, hbgVar.h);
    }

    public final int hashCode() {
        int iG = a.g(this.a) * 31;
        ckv ckvVar = this.f;
        long j = this.e;
        long j2 = this.d;
        return ((((((((((((iG + a.g(this.b)) * 31) + a.g(this.c)) * 31) + a.g(j2)) * 31) + a.g(j)) * 31) + ckvVar.hashCode()) * 31) + a.g(this.g)) * 31) + a.g(this.h);
    }

    public final String toString() {
        long j = this.h;
        long j2 = this.g;
        long j3 = this.e;
        long j4 = this.d;
        long j5 = this.c;
        long j6 = this.b;
        return "CarFilterChipStyle(startIconColor=" + cjv.g(this.a) + ", endIconColor=" + cjv.g(j6) + ", textColor=" + cjv.g(j5) + ", backgroundColor=" + cjv.g(j4) + ", outlineColor=" + cjv.g(j3) + ", shape=" + this.f + ", focusRingColor=" + cjv.g(j2) + ", focusRingInnerColor=" + cjv.g(j) + ")";
    }
}
