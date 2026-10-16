package defpackage;

/* loaded from: classes.dex */
public abstract class cec {
    public cej h;
    public long i;
    public boolean j;
    public int k;

    public cec(long j, cej cejVar) {
        int i;
        long j2;
        int iNumberOfTrailingZeros;
        this.h = cejVar;
        this.i = j;
        afec afecVar = cek.a;
        if (j != 0) {
            cej cejVarX = x();
            long[] jArr = cejVarX.e;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = cejVarX.c;
                if (j3 != 0) {
                    j2 = cejVarX.d;
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = cejVarX.b;
                    if (j4 != 0) {
                        j2 = cejVarX.d + 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = j2 + iNumberOfTrailingZeros;
            }
            synchronized (cek.b) {
                ceh cehVar = cek.e;
                int i2 = cehVar.a + 1;
                long[] jArr2 = cehVar.b;
                int length = jArr2.length;
                if (i2 > length) {
                    int i3 = length + length;
                    long[] jArr3 = new long[i3];
                    int[] iArr = new int[i3];
                    woy.dp(jArr2, jArr3, 0, 0, jArr2.length);
                    woy.ds(cehVar.c, iArr, 0, 0, 14);
                    cehVar.b = jArr3;
                    cehVar.c = iArr;
                }
                int i4 = cehVar.a;
                cehVar.a = i4 + 1;
                int length2 = cehVar.d.length;
                if (cehVar.e >= length2) {
                    int i5 = length2 + length2;
                    int[] iArr2 = new int[i5];
                    int i6 = 0;
                    while (i6 < i5) {
                        int i7 = i6 + 1;
                        iArr2[i6] = i7;
                        i6 = i7;
                    }
                    woy.ds(cehVar.d, iArr2, 0, 0, 14);
                    cehVar.d = iArr2;
                }
                i = cehVar.e;
                int[] iArr3 = cehVar.d;
                cehVar.e = iArr3[i];
                cehVar.b[i4] = j;
                cehVar.c[i4] = i;
                iArr3[i] = i4;
                cehVar.c(i4);
            }
        } else {
            i = -1;
        }
        this.k = i;
    }

    public static final void E(cec cecVar) {
        cek.i.k(cecVar);
    }

    public void A(cej cejVar) {
        this.h = cejVar;
    }

    public void B(long j) {
        this.i = j;
    }

    public final void C() {
        if (this.j) {
            bxc.a("Cannot use a disposed snapshot");
        }
    }

    public final void D() {
        this.j = true;
    }

    public abstract cec b(afec afecVar);

    public void d() {
        this.j = true;
        synchronized (cek.b) {
            z();
        }
    }

    public abstract void e();

    public abstract void f();

    public abstract void g();

    public int h() {
        return 0;
    }

    public abstract afec i();

    public abstract afec k();

    public void m() {
        cek.c = cek.c.b(v());
    }

    public abstract void n(cev cevVar);

    public void p() {
        z();
    }

    public void q(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract boolean r();

    public long v() {
        return this.i;
    }

    public final cec w() {
        lah lahVar = cek.i;
        cec cecVar = (cec) lahVar.j();
        lahVar.k(this);
        return cecVar;
    }

    public cej x() {
        return this.h;
    }

    public final void y() {
        synchronized (cek.b) {
            m();
            p();
        }
    }

    public final void z() {
        int i = this.k;
        if (i >= 0) {
            cek.e.b(i);
            this.k = -1;
        }
    }
}
