package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ktl {
    public static final defpackage.afar a = defpackage.afga.cA(new defpackage.ksa(6));
    public static final defpackage.afar b = defpackage.afga.cA(new defpackage.ksa(7));
    public static final defpackage.afar c = defpackage.afga.cA(new defpackage.ksa(8));
    public static final defpackage.afar d = defpackage.afga.cA(new defpackage.ksa(9));
    public static final defpackage.afar e = defpackage.afga.cA(new defpackage.ksa(10));
    public static final defpackage.afar f = defpackage.afga.cA(new defpackage.ksa(11));
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;

    public ktl(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = j5;
        this.l = j6;
        this.m = j7;
        this.n = j8;
    }

    public static /* synthetic */ defpackage.ktl a(defpackage.ktl ktlVar, long j, long j2, int i) {
        return new defpackage.ktl((i & 1) != 0 ? ktlVar.g : 0L, (i & 2) != 0 ? ktlVar.h : j, j2, ktlVar.j, ktlVar.k, ktlVar.l, ktlVar.m, ktlVar.n);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ktl)) {
            return false;
        }
        defpackage.ktl ktlVar = (defpackage.ktl) obj;
        return defpackage.a.i(this.g, ktlVar.g) && defpackage.a.i(this.h, ktlVar.h) && defpackage.a.i(this.i, ktlVar.i) && defpackage.a.i(this.j, ktlVar.j) && defpackage.a.i(this.k, ktlVar.k) && defpackage.a.i(this.l, ktlVar.l) && defpackage.a.i(this.m, ktlVar.m) && defpackage.a.i(this.n, ktlVar.n);
    }

    public final int hashCode() {
        int iF = defpackage.a.f(this.g) * 31;
        long j = this.n;
        long j2 = this.m;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        return ((((((((((((iF + defpackage.a.f(this.h)) * 31) + defpackage.a.f(this.i)) * 31) + defpackage.a.f(j5)) * 31) + defpackage.a.f(j4)) * 31) + defpackage.a.f(j3)) * 31) + defpackage.a.f(j2)) * 31) + defpackage.a.f(j);
    }

    public final java.lang.String toString() {
        long j = this.n;
        long j2 = this.m;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.i;
        long j7 = this.h;
        return "CarButtonColors(containerColor=" + defpackage.ckd.g(this.g) + ", contentColor=" + defpackage.ckd.g(j7) + ", iconOnlyContentColor=" + defpackage.ckd.g(j6) + ", focusRingColor=" + defpackage.ckd.g(j5) + ", focusRingInnerColor=" + defpackage.ckd.g(j4) + ", pressedContentColor=" + defpackage.ckd.g(j3) + ", disabledContainerColor=" + defpackage.ckd.g(j2) + ", disabledContentColor=" + defpackage.ckd.g(j) + ")";
    }
}
