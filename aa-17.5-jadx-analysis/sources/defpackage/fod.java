package defpackage;

import androidx.work.OverwritingInputMerger;

/* loaded from: classes2.dex */
public final class fod {
    public final String a;
    public fju b;
    public String c;
    public String d;
    public fjc e;
    public fjc f;
    public long g;
    public long h;
    public long i;
    public fja j;
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
    public String v;
    public Boolean w;
    public int x;
    public int y;

    static {
        fjo.b("WorkSpec");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ fod(String str, fju fjuVar, String str2, String str3, fjc fjcVar, fjc fjcVar2, long j, long j2, long j3, fja fjaVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, long j8, int i5, int i6, String str4, Boolean bool, int i7) {
        String str5;
        fju fjuVar2 = (i7 & 2) != 0 ? fju.a : fjuVar;
        if ((i7 & 8) != 0) {
            String name = OverwritingInputMerger.class.getName();
            name.getClass();
            str5 = name;
        } else {
            str5 = str3;
        }
        this(str, fjuVar2, str2, str5, (i7 & 16) != 0 ? fjc.a : fjcVar, (i7 & 32) != 0 ? fjc.a : fjcVar2, (i7 & 64) != 0 ? 0L : j, (i7 & 128) != 0 ? 0L : j2, (i7 & 256) != 0 ? 0L : j3, (i7 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? fja.a : fjaVar, (i7 & 1024) != 0 ? 0 : i, (i7 & 2048) != 0 ? 1 : i2, (i7 & 4096) != 0 ? 30000L : j4, (i7 & 8192) != 0 ? -1L : j5, (i7 & 16384) != 0 ? 0L : j6, (32768 & i7) != 0 ? -1L : j7, ((65536 & i7) == 0) & z, (131072 & i7) != 0 ? 1 : i3, (262144 & i7) != 0 ? 0 : i4, 0, (1048576 & i7) != 0 ? Long.MAX_VALUE : j8, (2097152 & i7) != 0 ? 0 : i5, (4194304 & i7) != 0 ? -256 : i6, (8388608 & i7) != 0 ? null : str4, (i7 & 16777216) != 0 ? false : bool);
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
            return i3 == 0 ? j7 : afpt.h(j7, j3 + 900000);
        }
        if (zC) {
            return j3 + afpt.i(i2 == 2 ? j2 * i : (long) Math.scalb(j2, i - 1), 18000000L);
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
        return !affa.f(fja.a, this.j);
    }

    public final boolean c() {
        return this.b == fju.a && this.k > 0;
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fod)) {
            return false;
        }
        fod fodVar = (fod) obj;
        return affa.f(this.a, fodVar.a) && this.b == fodVar.b && affa.f(this.c, fodVar.c) && affa.f(this.d, fodVar.d) && affa.f(this.e, fodVar.e) && affa.f(this.f, fodVar.f) && this.g == fodVar.g && this.h == fodVar.h && this.i == fodVar.i && affa.f(this.j, fodVar.j) && this.k == fodVar.k && this.x == fodVar.x && this.l == fodVar.l && this.m == fodVar.m && this.n == fodVar.n && this.o == fodVar.o && this.p == fodVar.p && this.y == fodVar.y && this.q == fodVar.q && this.r == fodVar.r && this.s == fodVar.s && this.t == fodVar.t && this.u == fodVar.u && affa.f(this.v, fodVar.v) && affa.f(this.w, fodVar.w);
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        int iG = a.g(this.g);
        int iG2 = (((((((((iHashCode * 31) + iG) * 31) + a.g(this.h)) * 31) + a.g(this.i)) * 31) + this.j.hashCode()) * 31) + this.k;
        int i = this.x;
        a.aW(i);
        int iG3 = a.g(this.l);
        int iG4 = a.g(this.m);
        int iG5 = a.g(this.n);
        int iG6 = a.g(this.o);
        int iF = a.f(this.p);
        int i2 = this.y;
        a.aW(i2);
        int iG7 = (((((((((((((((((((((iG2 * 31) + i) * 31) + iG3) * 31) + iG4) * 31) + iG5) * 31) + iG6) * 31) + iF) * 31) + i2) * 31) + this.q) * 31) + this.r) * 31) + a.g(this.s)) * 31) + this.t;
        String str = this.v;
        int iHashCode2 = ((((iG7 * 31) + this.u) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.w;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public fod(String str, fju fjuVar, String str2, String str3, fjc fjcVar, fjc fjcVar2, long j, long j2, long j3, fja fjaVar, int i, int i2, long j4, long j5, long j6, long j7, boolean z, int i3, int i4, int i5, long j8, int i6, int i7, String str4, Boolean bool) {
        fjuVar.getClass();
        str2.getClass();
        str3.getClass();
        fjcVar.getClass();
        fjcVar2.getClass();
        fjaVar.getClass();
        if (i2 == 0 || i3 == 0) {
            throw null;
        }
        this.a = str;
        this.b = fjuVar;
        this.c = str2;
        this.d = str3;
        this.e = fjcVar;
        this.f = fjcVar2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = fjaVar;
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
