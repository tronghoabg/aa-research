package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ktz {
    public static final defpackage.afar a = defpackage.afga.cA(new defpackage.kbl(11));
    public static final defpackage.afar b = defpackage.afga.cA(new defpackage.kbl(12));
    public static final defpackage.afar c = defpackage.afga.cA(new defpackage.kbl(13));
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

    public ktz(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ktz)) {
            return false;
        }
        defpackage.ktz ktzVar = (defpackage.ktz) obj;
        return defpackage.a.i(this.d, ktzVar.d) && defpackage.a.i(this.e, ktzVar.e) && defpackage.a.i(this.f, ktzVar.f) && defpackage.a.i(this.g, ktzVar.g) && defpackage.a.i(this.h, ktzVar.h) && defpackage.a.i(this.i, ktzVar.i) && defpackage.a.i(this.j, ktzVar.j) && defpackage.a.i(this.k, ktzVar.k) && defpackage.a.i(this.l, ktzVar.l) && defpackage.a.i(this.m, ktzVar.m) && defpackage.a.i(this.n, ktzVar.n) && defpackage.a.i(this.o, ktzVar.o) && defpackage.a.i(this.p, ktzVar.p) && defpackage.a.i(this.q, ktzVar.q) && defpackage.a.i(this.r, ktzVar.r);
    }

    public final int hashCode() {
        int iF = defpackage.a.f(this.d) * 31;
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
        return ((((((((((((((((((((((((((iF + defpackage.a.f(this.e)) * 31) + defpackage.a.f(this.f)) * 31) + defpackage.a.f(j12)) * 31) + defpackage.a.f(j11)) * 31) + defpackage.a.f(j10)) * 31) + defpackage.a.f(j9)) * 31) + defpackage.a.f(j8)) * 31) + defpackage.a.f(j7)) * 31) + defpackage.a.f(j6)) * 31) + defpackage.a.f(j5)) * 31) + defpackage.a.f(j4)) * 31) + defpackage.a.f(j3)) * 31) + defpackage.a.f(j2)) * 31) + defpackage.a.f(j);
    }

    public final java.lang.String toString() {
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
        return "CarToggleButtonColors(containerColor=" + defpackage.ckd.g(this.d) + ", contentColor=" + defpackage.ckd.g(j14) + ", iconOnlyContentColor=" + defpackage.ckd.g(j13) + ", focusRingColor=" + defpackage.ckd.g(j12) + ", focusRingInnerColor=" + defpackage.ckd.g(j11) + ", pressedContentColor=" + defpackage.ckd.g(j10) + ", disabledContainerColor=" + defpackage.ckd.g(j9) + ", disabledContentColor=" + defpackage.ckd.g(j8) + ", checkedContainerColor=" + defpackage.ckd.g(j7) + ", checkedContentColor=" + defpackage.ckd.g(j6) + ", checkedFocusRingColor=" + defpackage.ckd.g(j5) + ", checkedFocusRingInnerColor=" + defpackage.ckd.g(j4) + ", labelColor=" + defpackage.ckd.g(j3) + ", disabledLabelColor=" + defpackage.ckd.g(j2) + ", checkedLabelColor=" + defpackage.ckd.g(j) + ")";
    }
}
