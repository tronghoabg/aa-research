package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class crd {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;
    public defpackage.crd n;
    private java.util.List o;
    private boolean p;
    private boolean q;

    public crd(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.m = 0L;
        this.p = z3;
        this.q = z3;
    }

    public final java.util.List a() {
        java.util.List list = this.o;
        return list == null ? defpackage.afce.a : list;
    }

    public final void b() {
        defpackage.crd crdVar = this.n;
        if (crdVar != null) {
            crdVar.b();
        } else {
            this.p = true;
            this.q = true;
        }
    }

    public final boolean c() {
        defpackage.crd crdVar = this.n;
        if (crdVar != null) {
            return crdVar.c();
        }
        return this.p || this.q;
    }

    public final java.lang.String toString() {
        long j = this.l;
        long j2 = this.j;
        long j3 = this.g;
        long j4 = this.c;
        return "PointerInputChange(id=" + defpackage.crc.a(this.a) + ", uptimeMillis=" + this.b + ", position=" + defpackage.cji.d(j4) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + defpackage.cji.d(j3) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + defpackage.crl.a(this.i) + ", historical=" + a() + ", scrollDelta=" + defpackage.cji.d(j2) + ", scaleFactor=" + this.k + ", panOffset=" + defpackage.cji.d(j) + ")";
    }

    public crd(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, java.util.List list, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.o = list;
        this.m = j8;
    }
}
