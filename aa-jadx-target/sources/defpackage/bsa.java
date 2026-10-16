package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsa {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public bsa(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.bsa)) {
            return false;
        }
        defpackage.bsa bsaVar = (defpackage.bsa) obj;
        return defpackage.a.i(this.a, bsaVar.a) && defpackage.a.i(this.b, bsaVar.b) && defpackage.a.i(this.c, bsaVar.c) && defpackage.a.i(this.d, bsaVar.d) && defpackage.a.i(this.e, bsaVar.e) && defpackage.a.i(this.f, bsaVar.f);
    }

    public final int hashCode() {
        int iF = defpackage.a.f(this.a) * 31;
        long j = this.f;
        long j2 = this.e;
        long j3 = this.d;
        return ((((((((iF + defpackage.a.f(this.b)) * 31) + defpackage.a.f(this.c)) * 31) + defpackage.a.f(j3)) * 31) + defpackage.a.f(j2)) * 31) + defpackage.a.f(j);
    }
}
