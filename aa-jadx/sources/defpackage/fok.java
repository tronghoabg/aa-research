package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fok {
    public final java.lang.String a;
    public defpackage.fkb b;
    public java.lang.String c;
    public java.lang.String d;
    public defpackage.fjj e;
    public defpackage.fjj f;
    public long g;
    public long h;
    public long i;
    public defpackage.fjh j;
    public int k;
    public long l;
    public long m;
    public long n;
    public long o;
    public boolean p;
    public int q;
    public final int r;
    public long s;
    public int t;
    public final int u;
    public java.lang.String v;
    public java.lang.Boolean w;
    public int x;
    public int y;

    static {
        defpackage.fjv.b("WorkSpec");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fok(java.lang.String str, defpackage.fkb fkbVar, java.lang.String str2, java.lang.String str3, defpackage.fjj fjjVar, defpackage.fjj fjjVar2, long j, long j2, long j3, defpackage.fjh fjhVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, long j8, int i5, int i6, java.lang.String str4, java.lang.Boolean bool, int i7) {
        java.lang.String str5;
        defpackage.fkb fkbVar2 = (i7 & 2) != 0 ? defpackage.fkb.a : fkbVar;
        if ((i7 & 8) != 0) {
            java.lang.String name = androidx.work.OverwritingInputMerger.class.getName();
            name.getClass();
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, fkbVar2, str2, str5, (i7 & 16) != 0 ? defpackage.fjj.a : fjjVar, (i7 & 32) != 0 ? defpackage.fjj.a : fjjVar2, (i7 & 64) != 0 ? 0L : j, (i7 & 128) != 0 ? 0L : j2, (i7 & 256) != 0 ? 0L : j3, (i7 & defpackage.sp.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? defpackage.fjh.a : fjhVar, (i7 & 1024) != 0 ? 0 : i, (i7 & 2048) != 0 ? 1 : i2, (i7 & 4096) != 0 ? 30000L : j4, (i7 & 8192) != 0 ? -1L : j5, (i7 & 16384) != 0 ? 0L : j6, (32768 & i7) != 0 ? -1L : j7, ((65536 & i7) == 0) & z, (131072 & i7) != 0 ? 1 : i3, (262144 & i7) != 0 ? 0 : i4, 0, (1048576 & i7) != 0 ? Long.MAX_VALUE : j8, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? java.lang.Boolean.FALSE : bool);
    }

    public final long a() {
        long j;
        boolean zC = c();
        int i = this.k;
        int i2 = this.x;
        long j2 = this.l;
        long j3 = this.m;
        int i3 = this.q;
        boolean zD = d();
        long j4 = this.g;
        long j5 = this.i;
        long j6 = this.h;
        long j7 = this.s;
        if (i2 == 0) {
            throw null;
        }
        if (j7 != Long.MAX_VALUE && zD) {
            return i3 == 0 ? j7 : defpackage.afqt.h(j7, j3 + 900000);
        }
        if (zC) {
            return j3 + defpackage.afqt.i(i2 == 2 ? j2 * ((long) i) : (long) java.lang.Math.scalb(j2, i - 1), 18000000L);
        }
        if (!zD) {
            if (j3 == -1) {
                return Long.MAX_VALUE;
            }
            return j3 + j4;
        }
        if (i3 == 0) {
            j = j3 + j4;
            i3 = 0;
        } else {
            j = j3 + j6;
        }
        return (j5 == j6 || i3 != 0) ? j : j + (j6 - j5);
    }

    public final boolean b() {
        return !defpackage.afga.f(defpackage.fjh.a, this.j);
    }

    public final boolean c() {
        return this.b == defpackage.fkb.a && this.k > 0;
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fok)) {
            return false;
        }
        defpackage.fok fokVar = (defpackage.fok) obj;
        return defpackage.afga.f(this.a, fokVar.a) && this.b == fokVar.b && defpackage.afga.f(this.c, fokVar.c) && defpackage.afga.f(this.d, fokVar.d) && defpackage.afga.f(this.e, fokVar.e) && defpackage.afga.f(this.f, fokVar.f) && this.g == fokVar.g && this.h == fokVar.h && this.i == fokVar.i && defpackage.afga.f(this.j, fokVar.j) && this.k == fokVar.k && this.x == fokVar.x && this.l == fokVar.l && this.m == fokVar.m && this.n == fokVar.n && this.o == fokVar.o && this.p == fokVar.p && this.y == fokVar.y && this.q == fokVar.q && this.r == fokVar.r && this.s == fokVar.s && this.t == fokVar.t && this.u == fokVar.u && defpackage.afga.f(this.v, fokVar.v) && defpackage.afga.f(this.w, fokVar.w);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        int iF = defpackage.a.f(this.g);
        int iF2 = (((((((((iHashCode * 31) + iF) * 31) + defpackage.a.f(this.h)) * 31) + defpackage.a.f(this.i)) * 31) + this.j.hashCode()) * 31) + this.k;
        int i = this.x;
        defpackage.a.aV(i);
        int iF3 = defpackage.a.f(this.l);
        int iF4 = defpackage.a.f(this.m);
        int iF5 = defpackage.a.f(this.n);
        int iF6 = defpackage.a.f(this.o);
        int iE = defpackage.a.e(this.p);
        int i2 = this.y;
        defpackage.a.aV(i2);
        int iF7 = (((((((((((((((((((((iF2 * 31) + i) * 31) + iF3) * 31) + iF4) * 31) + iF5) * 31) + iF6) * 31) + iE) * 31) + i2) * 31) + this.q) * 31) + this.r) * 31) + defpackage.a.f(this.s)) * 31) + this.t;
        java.lang.String str = this.v;
        int iHashCode2 = ((((iF7 * 31) + this.u) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.w;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public fok(java.lang.String str, defpackage.fkb fkbVar, java.lang.String str2, java.lang.String str3, defpackage.fjj fjjVar, defpackage.fjj fjjVar2, long j, long j2, long j3, defpackage.fjh fjhVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, int i5, long j8, int i6, int i7, java.lang.String str4, java.lang.Boolean bool) {
        fkbVar.getClass();
        str2.getClass();
        str3.getClass();
        fjjVar.getClass();
        fjjVar2.getClass();
        fjhVar.getClass();
        if (i2 == 0 || i3 == 0) {
            throw null;
        }
        this.a = str;
        this.b = fkbVar;
        this.c = str2;
        this.d = str3;
        this.e = fjjVar;
        this.f = fjjVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = fjhVar;
        this.k = i;
        this.x = i2;
        this.l = j4;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = z;
        this.y = i3;
        this.q = i4;
        this.r = i5;
        this.s = j8;
        this.t = i6;
        this.u = i7;
        this.v = str4;
        this.w = bool;
    }
}
