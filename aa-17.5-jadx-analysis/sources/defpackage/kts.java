package defpackage;

/* loaded from: classes.dex */
public final class kts {
    public static final aezr a = woy.dG(new kbh(11));
    public static final aezr b = woy.dG(new kbh(12));
    public static final aezr c = woy.dG(new kbh(13));
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;

    public kts(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
        this.k = j8;
        this.l = j9;
        this.m = j10;
        this.n = j11;
        this.o = j12;
        this.p = j13;
        this.q = j14;
        this.r = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kts)) {
            return false;
        }
        kts ktsVar = (kts) obj;
        return a.j(this.d, ktsVar.d) && a.j(this.e, ktsVar.e) && a.j(this.f, ktsVar.f) && a.j(this.g, ktsVar.g) && a.j(this.h, ktsVar.h) && a.j(this.i, ktsVar.i) && a.j(this.j, ktsVar.j) && a.j(this.k, ktsVar.k) && a.j(this.l, ktsVar.l) && a.j(this.m, ktsVar.m) && a.j(this.n, ktsVar.n) && a.j(this.o, ktsVar.o) && a.j(this.p, ktsVar.p) && a.j(this.q, ktsVar.q) && a.j(this.r, ktsVar.r);
    }

    public final int hashCode() {
        int iG = a.g(this.d) * 31;
        long j = this.r;
        long j2 = this.q;
        long j3 = this.p;
        long j4 = this.o;
        long j5 = this.n;
        long j6 = this.m;
        long j7 = this.l;
        long j8 = this.k;
        long j9 = this.j;
        long j10 = this.i;
        long j11 = this.h;
        long j12 = this.g;
        return ((((((((((((((((((((((((((iG + a.g(this.e)) * 31) + a.g(this.f)) * 31) + a.g(j12)) * 31) + a.g(j11)) * 31) + a.g(j10)) * 31) + a.g(j9)) * 31) + a.g(j8)) * 31) + a.g(j7)) * 31) + a.g(j6)) * 31) + a.g(j5)) * 31) + a.g(j4)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }

    public final String toString() {
        long j = this.r;
        long j2 = this.q;
        long j3 = this.p;
        long j4 = this.o;
        long j5 = this.n;
        long j6 = this.m;
        long j7 = this.l;
        long j8 = this.k;
        long j9 = this.j;
        long j10 = this.i;
        long j11 = this.h;
        long j12 = this.g;
        long j13 = this.f;
        long j14 = this.e;
        return "CarToggleButtonColors(containerColor=" + cjv.g(this.d) + ", contentColor=" + cjv.g(j14) + ", iconOnlyContentColor=" + cjv.g(j13) + ", focusRingColor=" + cjv.g(j12) + ", focusRingInnerColor=" + cjv.g(j11) + ", pressedContentColor=" + cjv.g(j10) + ", disabledContainerColor=" + cjv.g(j9) + ", disabledContentColor=" + cjv.g(j8) + ", checkedContainerColor=" + cjv.g(j7) + ", checkedContentColor=" + cjv.g(j6) + ", checkedFocusRingColor=" + cjv.g(j5) + ", checkedFocusRingInnerColor=" + cjv.g(j4) + ", labelColor=" + cjv.g(j3) + ", disabledLabelColor=" + cjv.g(j2) + ", checkedLabelColor=" + cjv.g(j) + ")";
    }
}
