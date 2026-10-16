package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r extends p {
    public float af = -1.0f;
    public int ag = -1;
    public int ah = -1;
    private o aj = this.j;
    public int ai = 0;

    public r() {
        this.q.clear();
        this.q.add(this.aj);
    }

    public final void A(int i) {
        o oVar;
        if (this.ai == i) {
            return;
        }
        this.ai = i;
        ArrayList arrayList = this.q;
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x001b A[ORIG_RETURN, RETURN] */
    @Override // defpackage.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.o t(int r3) {
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
            int r3 = r2.ai
            if (r3 == 0) goto L18
            goto L1b
        L14:
            int r3 = r2.ai
            if (r3 != r0) goto L1b
        L18:
            o r2 = r2.aj
            return r2
        L1b:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r.t(int):o");
    }

    @Override // defpackage.p
    public final void x(m mVar) {
        p pVar = this.r;
        if (pVar == null) {
            return;
        }
        o oVarT = pVar.t(2);
        o oVarT2 = pVar.t(4);
        if (this.ai == 0) {
            oVarT = pVar.t(3);
            oVarT2 = pVar.t(5);
        }
        if (this.ag != -1) {
            n nVarC = mVar.c(this.aj);
            n nVarC2 = mVar.c(oVarT);
            int i = this.ag;
            k kVarA = mVar.a();
            kVarA.h(nVarC, nVarC2, i);
            mVar.e(kVarA);
            return;
        }
        if (this.ah != -1) {
            n nVarC3 = mVar.c(this.aj);
            n nVarC4 = mVar.c(oVarT2);
            int i2 = -this.ah;
            k kVarA2 = mVar.a();
            kVarA2.h(nVarC3, nVarC4, i2);
            mVar.e(kVarA2);
            return;
        }
        if (this.af != -1.0f) {
            n nVarC5 = mVar.c(this.aj);
            n nVarC6 = mVar.c(oVarT);
            n nVarC7 = mVar.c(oVarT2);
            float f = this.af;
            k kVarA3 = mVar.a();
            j jVar = kVarA3.d;
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
        int iN = m.n(this.aj);
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
