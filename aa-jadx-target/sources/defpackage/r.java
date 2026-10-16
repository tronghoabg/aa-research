package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class r extends defpackage.p {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private defpackage.o aj = this.j;
    public int ai = 0;

    public r() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        defpackage.o oVar;
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        java.util.ArrayList arrayList = this.q;
        arrayList.clear();
        if (this.ai == 1) {
            oVar = this.i;
            this.aj = oVar;
        } else {
            oVar = this.j;
            this.aj = oVar;
        }
        arrayList.add(oVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0014  */
    /* JADX WARN: Code duplicated, block: B:18:0x001b A[ORIG_RETURN, RETURN] */
    @Override // defpackage.p
    public final defpackage.o t(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                } else if (this.ai != 1) {
                    return null;
                }
            }
            if (this.ai != 0) {
                return null;
            }
        } else if (this.ai != 1) {
            return null;
        }
        return this.aj;
    }

    @Override // defpackage.p
    public final void x(defpackage.m mVar) {
        defpackage.p pVar = this.r;
        if (pVar == null) {
            return;
        }
        defpackage.o oVarT = pVar.t(2);
        defpackage.o oVarT2 = pVar.t(4);
        if (this.ai == 0) {
            oVarT = pVar.t(3);
            oVarT2 = pVar.t(5);
        }
        if (this.ag != -1) {
            defpackage.n nVarC = mVar.c(this.aj);
            defpackage.n nVarC2 = mVar.c(oVarT);
            int i = this.ag;
            defpackage.k kVarA = mVar.a();
            kVarA.h(nVarC, nVarC2, i);
            mVar.e(kVarA);
            return;
        }
        if (this.ah != -1) {
            defpackage.n nVarC3 = mVar.c(this.aj);
            defpackage.n nVarC4 = mVar.c(oVarT2);
            int i2 = -this.ah;
            defpackage.k kVarA2 = mVar.a();
            kVarA2.h(nVarC3, nVarC4, i2);
            mVar.e(kVarA2);
            return;
        }
        if (this.af != -1.0f) {
            defpackage.n nVarC5 = mVar.c(this.aj);
            defpackage.n nVarC6 = mVar.c(oVarT);
            defpackage.n nVarC7 = mVar.c(oVarT2);
            float f = this.af;
            defpackage.k kVarA3 = mVar.a();
            defpackage.j jVar = kVarA3.d;
            jVar.f(nVarC5, -1.0f);
            jVar.f(nVarC6, 1.0f - f);
            jVar.f(nVarC7, f);
            mVar.e(kVarA3);
        }
    }

    @Override // defpackage.p
    public final void y() {
        if (this.r == null) {
            return;
        }
        int iN = defpackage.m.n(this.aj);
        if (this.ai == 1) {
            this.w = iN;
            this.x = 0;
            j(this.r.d());
            p(0);
            return;
        }
        this.w = 0;
        this.x = iN;
        p(this.r.h());
        j(0);
    }
}
