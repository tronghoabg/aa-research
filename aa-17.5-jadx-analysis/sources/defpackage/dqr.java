package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class dqr extends dqn {
    public float a = -1.0f;
    public int b = -1;
    public int c = -1;
    public dqm d = this.U;
    public int e = 0;
    private boolean f;

    public dqr() {
        this.ac.clear();
        this.ac.add(this.d);
        int length = this.ab.length;
        for (int i = 0; i < 6; i++) {
            this.ab[i] = this.d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dqn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dqm U(int r3) {
        /*
            r2 = this;
            int r3 = r3 + (-1)
            r0 = 1
            if (r3 == r0) goto L14
            r1 = 2
            if (r3 == r1) goto Lf
            r1 = 3
            if (r3 == r1) goto L14
            r0 = 4
            if (r3 == r0) goto Lf
            goto L1b
        Lf:
            int r3 = r2.e
            if (r3 != 0) goto L1b
            goto L18
        L14:
            int r3 = r2.e
            if (r3 != r0) goto L1b
        L18:
            dqm r2 = r2.d
            return r2
        L1b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqr.U(int):dqm");
    }

    @Override // defpackage.dqn
    public final void a(doy doyVar, boolean z) {
        dqo dqoVar = (dqo) this.ae;
        if (dqoVar == null) {
            return;
        }
        Object objU = dqoVar.U(2);
        Object objU2 = dqoVar.U(4);
        dqn dqnVar = this.ae;
        boolean z2 = dqnVar != null && dqnVar.aA[0] == 2;
        if (this.e == 0) {
            objU = dqoVar.U(3);
            objU2 = dqoVar.U(5);
            z2 = dqnVar != null && dqnVar.aA[1] == 2;
        }
        if (this.f) {
            dqm dqmVar = this.d;
            if (dqmVar.c) {
                dpb dpbVarB = doyVar.b(dqmVar);
                doyVar.f(dpbVarB, this.d.a());
                if (this.b != -1) {
                    if (z2) {
                        doyVar.g(doyVar.b(objU2), dpbVarB, 0, 5);
                    }
                } else if (this.c != -1 && z2) {
                    dpb dpbVarB2 = doyVar.b(objU2);
                    doyVar.g(dpbVarB, doyVar.b(objU), 0, 5);
                    doyVar.g(dpbVarB2, dpbVarB, 0, 5);
                }
                this.f = false;
                return;
            }
        }
        if (this.b != -1) {
            dpb dpbVarB3 = doyVar.b(this.d);
            doyVar.m(dpbVarB3, doyVar.b(objU), this.b, 8);
            if (z2) {
                doyVar.g(doyVar.b(objU2), dpbVarB3, 0, 5);
                return;
            }
            return;
        }
        if (this.c != -1) {
            dpb dpbVarB4 = doyVar.b(this.d);
            dpb dpbVarB5 = doyVar.b(objU2);
            doyVar.m(dpbVarB4, dpbVarB5, -this.c, 8);
            if (z2) {
                doyVar.g(dpbVarB4, doyVar.b(objU), 0, 5);
                doyVar.g(dpbVarB5, dpbVarB4, 0, 5);
                return;
            }
            return;
        }
        if (this.a != -1.0f) {
            dpb dpbVarB6 = doyVar.b(this.d);
            dpb dpbVarB7 = doyVar.b(objU2);
            float f = this.a;
            dox doxVarA = doyVar.a();
            doxVarA.e.g(dpbVarB6, -1.0f);
            doxVarA.e.g(dpbVarB7, f);
            doyVar.e(doxVarA);
        }
    }

    @Override // defpackage.dqn
    public final void ac(boolean z) {
        if (this.ae == null) {
            return;
        }
        int iO = doy.o(this.d);
        if (this.e == 1) {
            this.aj = iO;
            this.ak = 0;
            B(this.ae.h());
            M(0);
            return;
        }
        this.aj = 0;
        this.ak = iO;
        M(this.ae.j());
        B(0);
    }

    public final void ae(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = -1;
            this.c = i;
        }
    }

    public final void af(float f) {
        if (f > -1.0f) {
            this.a = f;
            this.b = -1;
            this.c = -1;
        }
    }

    public final void ag(int i) {
        dqm dqmVar;
        if (this.e == i) {
            return;
        }
        this.e = i;
        ArrayList arrayList = this.ac;
        arrayList.clear();
        if (this.e == 1) {
            dqmVar = this.T;
            this.d = dqmVar;
        } else {
            dqmVar = this.U;
            this.d = dqmVar;
        }
        arrayList.add(dqmVar);
        dqm[] dqmVarArr = this.ab;
        int length = dqmVarArr.length;
        for (int i2 = 0; i2 < 6; i2++) {
            dqmVarArr[i2] = this.d;
        }
    }

    @Override // defpackage.dqn
    public final boolean ay() {
        return true;
    }

    public final void b(int i) {
        this.d.f(i);
        this.f = true;
    }

    public final void c(int i) {
        if (i >= 0) {
            this.a = -1.0f;
            this.b = i;
            this.c = -1;
        }
    }

    @Override // defpackage.dqn
    public final boolean e() {
        return this.f;
    }

    @Override // defpackage.dqn
    public final boolean f() {
        return this.f;
    }
}
