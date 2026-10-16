package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bqb {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public bqb(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.c : this.e;
        }
        return z2 ? this.h : this.j;
    }

    public final long b(boolean z, boolean z2) {
        if (z) {
            return z2 ? this.b : this.d;
        }
        return z2 ? this.g : this.i;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.bqb)) {
            return false;
        }
        defpackage.bqb bqbVar = (defpackage.bqb) obj;
        return defpackage.a.i(this.a, bqbVar.a) && defpackage.a.i(this.b, bqbVar.b) && defpackage.a.i(this.c, bqbVar.c) && defpackage.a.i(this.d, bqbVar.d) && defpackage.a.i(this.e, bqbVar.e) && defpackage.a.i(this.f, bqbVar.f) && defpackage.a.i(this.g, bqbVar.g) && defpackage.a.i(this.h, bqbVar.h) && defpackage.a.i(this.i, bqbVar.i) && defpackage.a.i(this.j, bqbVar.j);
    }

    public final int hashCode() {
        int iF = defpackage.a.f(this.a) * 31;
        long j = this.j;
        long j2 = this.i;
        long j3 = this.h;
        long j4 = this.g;
        long j5 = this.f;
        long j6 = this.e;
        long j7 = this.d;
        return ((((((((((((((((iF + defpackage.a.f(this.b)) * 31) + defpackage.a.f(this.c)) * 31) + defpackage.a.f(j7)) * 31) + defpackage.a.f(j6)) * 31) + defpackage.a.f(j5)) * 31) + defpackage.a.f(j4)) * 31) + defpackage.a.f(j3)) * 31) + defpackage.a.f(j2)) * 31) + defpackage.a.f(j);
    }
}
