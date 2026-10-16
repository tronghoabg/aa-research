package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class cej {
    public defpackage.ceq h;
    public long i;
    public boolean j;
    public int k;

    public cej(long j, defpackage.ceq ceqVar) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.h = ceqVar;
        this.i = j;
        defpackage.affc affcVar = defpackage.cer.a;
        if (j != 0) {
            defpackage.ceq ceqVarX = x();
            long[] jArr = ceqVarX.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = ceqVarX.c;
                if (j3 != 0) {
                    j2 = ceqVarX.d;
                    iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = ceqVarX.b;
                    if (j4 != 0) {
                        j2 = ceqVarX.d + 64;
                        iNumberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + ((long) iNumberOfTrailingZeros);
            }
            synchronized (defpackage.cer.b) {
                defpackage.ceo ceoVar = defpackage.cer.e;
                int i2 = ceoVar.a + 1;
                long[] jArr2 = ceoVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length + length;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    defpackage.afga.cj(jArr2, jArr3, 0, 0, jArr2.length);
                    defpackage.afga.cm(ceoVar.c, iArr, 0, 0, 14);
                    ceoVar.b = jArr3;
                    ceoVar.c = iArr;
                }
                int i4 = ceoVar.a;
                ceoVar.a = i4 + 1;
                int length2 = ceoVar.d.length;
                if (ceoVar.e >= length2) {
                    int i5 = length2 + length2;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    defpackage.afga.cm(ceoVar.d, iArr2, 0, 0, 14);
                    ceoVar.d = iArr2;
                }
                i = ceoVar.e;
                int[] iArr3 = ceoVar.d;
                ceoVar.e = iArr3[i];
                ceoVar.b[i4] = j;
                ceoVar.c[i4] = i;
                iArr3[i] = i4;
                ceoVar.c(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public void A(defpackage.ceq ceqVar) {
        this.h = ceqVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void C() {
        if (this.j) {
            defpackage.bxi.a("Cannot use a disposed snapshot");
        }
    }

    public final void D() {
        this.j = true;
    }

    public abstract defpackage.cej b(defpackage.affc affcVar);

    public void d() {
        this.j = true;
        synchronized (defpackage.cer.b) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract defpackage.affc i();

    public abstract defpackage.affc k();

    public void m() {
        defpackage.cer.c = defpackage.cer.c.b(v());
    }

    public abstract void n(defpackage.cfc cfcVar);

    public void p() {
        z();
    }

    public void q(int i) {
        throw new java.lang.IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean r();

    public long v() {
        return this.i;
    }

    public final defpackage.cej w() {
        defpackage.lam lamVar = defpackage.cer.i;
        defpackage.cej cejVar = (defpackage.cej) lamVar.j();
        lamVar.k(this);
        return cejVar;
    }

    public defpackage.ceq x() {
        return this.h;
    }

    public final void y() {
        synchronized (defpackage.cer.b) {
            m();
            p();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            defpackage.cer.e.b(i);
            this.k = -1;
        }
    }
}
