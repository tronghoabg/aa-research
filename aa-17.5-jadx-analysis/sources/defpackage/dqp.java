package defpackage;

/* loaded from: classes.dex */
final class dqp {
    public dqn a = null;
    int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    final /* synthetic */ dqq h;
    private int i;
    private dqm j;
    private dqm k;
    private dqm l;
    private dqm m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public dqp(dqq dqqVar, int i, dqm dqmVar, dqm dqmVar2, dqm dqmVar3, dqm dqmVar4, int i2) {
        this.h = dqqVar;
        this.o = 0;
        this.q = 0;
        this.i = i;
        this.j = dqmVar;
        this.k = dqmVar2;
        this.l = dqmVar3;
        this.m = dqmVar4;
        this.n = dqqVar.aR;
        this.o = dqqVar.aN;
        this.p = dqqVar.aS;
        this.q = dqqVar.aO;
        this.r = i2;
    }

    public final int a() {
        int i = this.i;
        int i2 = this.d;
        return i == 1 ? i2 - this.h.aD : i2;
    }

    public final int b() {
        int i = this.i;
        int i2 = this.c;
        return i == 0 ? i2 - this.h.aC : i2;
    }

    public final void c(dqn dqnVar) {
        int i = this.i;
        dqq dqqVar = this.h;
        if (i == 0) {
            int iAe = dqqVar.ae(dqnVar, this.r);
            if (dqnVar.W() == 3) {
                this.g++;
                iAe = 0;
            }
            this.c += iAe + (dqnVar.ar != 8 ? dqqVar.aC : 0);
            int iC = dqqVar.c(dqnVar, this.r);
            if (this.a == null || this.b < iC) {
                this.a = dqnVar;
                this.b = iC;
                this.d = iC;
            }
        } else {
            int iAe2 = dqqVar.ae(dqnVar, this.r);
            int iC2 = dqqVar.c(dqnVar, this.r);
            if (dqnVar.X() == 3) {
                this.g++;
                iC2 = 0;
            }
            this.d += iC2 + (dqnVar.ar != 8 ? dqqVar.aD : 0);
            if (this.a == null || this.b < iAe2) {
                this.a = dqnVar;
                this.b = iAe2;
                this.c = iAe2;
            }
        }
        this.f++;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 787
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqp.d(boolean, int, boolean):void");
    }

    public final void e(int i) {
        int i2 = this.g;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.e + i5;
            dqq dqqVar = this.h;
            if (i6 >= dqqVar.aK) {
                break;
            }
            dqn dqnVar = dqqVar.aJ[i6];
            if (this.i == 0) {
                if (dqnVar != null && dqnVar.W() == 3 && dqnVar.C == 0) {
                    dqqVar.ak(dqnVar, 1, i4, dqnVar.X(), dqnVar.h());
                }
            } else if (dqnVar != null && dqnVar.X() == 3 && dqnVar.D == 0) {
                int i7 = i4;
                dqqVar.ak(dqnVar, dqnVar.W(), dqnVar.j(), 1, i7);
                i4 = i7;
            }
        }
        this.c = 0;
        this.d = 0;
        this.a = null;
        this.b = 0;
        int i8 = this.f;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.e + i9;
            dqq dqqVar2 = this.h;
            if (i10 >= dqqVar2.aK) {
                return;
            }
            dqn dqnVar2 = dqqVar2.aJ[i10];
            if (this.i == 0) {
                int iJ = dqnVar2.j();
                int i11 = dqqVar2.aC;
                if (dqnVar2.ar == 8) {
                    i11 = 0;
                }
                this.c += iJ + i11;
                int iC = dqqVar2.c(dqnVar2, this.r);
                if (this.a == null || this.b < iC) {
                    this.a = dqnVar2;
                    this.b = iC;
                    this.d = iC;
                }
            } else {
                int iAe = dqqVar2.ae(dqnVar2, this.r);
                int iC2 = dqqVar2.c(dqnVar2, this.r);
                int i12 = dqqVar2.aD;
                if (dqnVar2.ar == 8) {
                    i12 = 0;
                }
                this.d += iC2 + i12;
                if (this.a == null || this.b < iAe) {
                    this.a = dqnVar2;
                    this.b = iAe;
                    this.c = iAe;
                }
            }
        }
    }

    public final void f(int i, dqm dqmVar, dqm dqmVar2, dqm dqmVar3, dqm dqmVar4, int i2, int i3, int i4, int i5, int i6) {
        this.i = i;
        this.j = dqmVar;
        this.k = dqmVar2;
        this.l = dqmVar3;
        this.m = dqmVar4;
        this.n = i2;
        this.o = i3;
        this.p = i4;
        this.q = i5;
        this.r = i6;
    }
}
