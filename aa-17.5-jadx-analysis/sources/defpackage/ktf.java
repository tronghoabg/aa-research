package defpackage;

/* loaded from: classes.dex */
public final class ktf {
    public static final aezr a = woy.dG(new ksz(1));
    public static final aezr b = woy.dG(new ksz(0));
    public static final aezr c = woy.dG(new ksz(2));
    public static final aezr d = woy.dG(new ksz(3));
    public static final aezr e = woy.dG(new ksz(4));
    public static final aezr f = woy.dG(new ksz(5));
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;

    public ktf(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = j4;
        this.k = j5;
        this.l = j6;
        this.m = j7;
        this.n = j8;
    }

    public static /* synthetic */ ktf a(ktf ktfVar, long j, long j2, int i) {
        return new ktf((i & 1) != 0 ? ktfVar.g : 0L, (i & 2) != 0 ? ktfVar.h : j, j2, ktfVar.j, ktfVar.k, ktfVar.l, ktfVar.m, ktfVar.n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktf)) {
            return false;
        }
        ktf ktfVar = (ktf) obj;
        return a.j(this.g, ktfVar.g) && a.j(this.h, ktfVar.h) && a.j(this.i, ktfVar.i) && a.j(this.j, ktfVar.j) && a.j(this.k, ktfVar.k) && a.j(this.l, ktfVar.l) && a.j(this.m, ktfVar.m) && a.j(this.n, ktfVar.n);
    }

    public final int hashCode() {
        int iG = a.g(this.g) * 31;
        long j = this.n;
        long j2 = this.m;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        return ((((((((((((iG + a.g(this.h)) * 31) + a.g(this.i)) * 31) + a.g(j5)) * 31) + a.g(j4)) * 31) + a.g(j3)) * 31) + a.g(j2)) * 31) + a.g(j);
    }

    public final String toString() {
        long j = this.n;
        long j2 = this.m;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.i;
        long j7 = this.h;
        return "CarButtonColors(containerColor=" + cjv.g(this.g) + ", contentColor=" + cjv.g(j7) + ", iconOnlyContentColor=" + cjv.g(j6) + ", focusRingColor=" + cjv.g(j5) + ", focusRingInnerColor=" + cjv.g(j4) + ", pressedContentColor=" + cjv.g(j3) + ", disabledContainerColor=" + cjv.g(j2) + ", disabledContentColor=" + cjv.g(j) + ")";
    }
}
