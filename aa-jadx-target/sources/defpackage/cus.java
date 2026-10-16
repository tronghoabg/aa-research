package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cus extends defpackage.cge implements defpackage.cyp, defpackage.czj {
    public long a;
    public defpackage.affc c;
    public defpackage.deq d;
    private aiwg e;
    private boolean f;
    private boolean g;
    private defpackage.der i;
    public float b = 1.0f;
    private final defpackage.affc h = new defpackage.chs(this, 11);

    public cus(long j, defpackage.affc affcVar) {
        this.a = j;
        this.c = affcVar;
    }

    public final void b() {
        aiwg aiwgVar = this.e;
        if (aiwgVar != null) {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
        }
        this.e = null;
        this.f = false;
        if (this.g) {
            d();
        }
    }

    public final void d() {
        aiwg aiwgVar = this.e;
        if (aiwgVar != null) {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
        }
        this.e = null;
        this.c.invoke(java.lang.Boolean.valueOf(this.f));
        this.g = this.f;
    }

    @Override // defpackage.cge
    public final void du() {
        b();
        aiwg aiwgVar = this.e;
        if (aiwgVar != null) {
            aiwgVar.s((java.util.concurrent.CancellationException) null);
        }
        this.e = null;
        this.f = false;
        this.d = null;
    }

    @Override // defpackage.czj
    public final void dv() {
        b();
    }

    @Override // defpackage.cge
    public final void dz() {
        defpackage.der derVar = this.i;
        if (derVar != null) {
            derVar.b();
        }
        this.i = defpackage.cjv.A(this, this.h);
    }

    public final void g(float f, defpackage.deq deqVar) {
        this.d = deqVar;
        long j = deqVar.c;
        long j2 = j >> 32;
        int i = (int) j;
        long j3 = deqVar.a;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) j2;
        int iMin = java.lang.Math.min(java.lang.Math.max(i2, 0), i3);
        int i4 = (int) j3;
        int iMin2 = java.lang.Math.min(java.lang.Math.max(i4, 0), i);
        long j4 = deqVar.b;
        int i5 = (int) (j4 >> 32);
        int i6 = (int) j4;
        float fMax = java.lang.Math.max((java.lang.Math.max(java.lang.Math.min(i5, i3), 0) - iMin) * (java.lang.Math.max(java.lang.Math.min(i6, i), 0) - iMin2), 0) / java.lang.Math.min(i3 * i, (i5 - i2) * (i6 - i4));
        boolean z = true;
        if (fMax <= f && fMax != 1.0f) {
            z = false;
        }
        if (z != this.f) {
            this.f = z;
            aiwg aiwgVar = this.e;
            if (aiwgVar != null) {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
            }
            this.e = null;
            if (z != this.g) {
                if (!z || this.a <= 0) {
                    d();
                } else {
                    this.e = ahoc.d(N(), (defpackage.afdo) null, 0, new defpackage.btt(this, (defpackage.afdk) null, 3), 3);
                }
            }
        }
    }

    @Override // defpackage.cge
    public final void q() {
        defpackage.der derVar = this.i;
        if (derVar != null) {
            derVar.b();
        }
        b();
    }

    @Override // defpackage.cyp
    public final void r() {
    }
}
