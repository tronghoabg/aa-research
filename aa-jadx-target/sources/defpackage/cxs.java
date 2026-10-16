package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cxs implements defpackage.dlo {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    final /* synthetic */ defpackage.cxu d;

    public cxs(defpackage.cxu cxuVar) {
        this.d = cxuVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.d.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.d.b();
    }

    @Override // defpackage.dlu
    public final /* synthetic */ float dE(long j) {
        return defpackage.dln.n(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dF(float f) {
        return (f / a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dG(int i) {
        return (i / a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dH(long j) {
        return defpackage.dln.p(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ float dI(float f) {
        return f * a();
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dM(long j) {
        throw null;
    }

    @Override // defpackage.dlo
    public final /* synthetic */ int dN(float f) {
        return defpackage.dln.q(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dO(long j) {
        return defpackage.dln.r(this, j);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dP(long j) {
        return defpackage.dln.s(this, j);
    }

    @Override // defpackage.dlu
    public final /* synthetic */ long dQ(float f) {
        return defpackage.dln.o(this, f);
    }

    @Override // defpackage.dlo
    public final /* synthetic */ long dR(float f) {
        return defpackage.dln.o(this, (f / a()) + 0.0f);
    }

    public final defpackage.ctc n() {
        this.a = true;
        defpackage.cxu cxuVar = this.d;
        defpackage.ctc ctcVarJ = cxuVar.J();
        if (this.b == 9223372034707292159L) {
            this.b = defpackage.dlv.d(ctcVarJ.k(0L));
            this.c = ctcVarJ.h();
        }
        cxuVar.L().w.f();
        return ctcVarJ;
    }

    public final void o(defpackage.cvd cvdVar, float f) {
        defpackage.cxu cxuVar = this.d;
        defpackage.czb czbVar = cxuVar.o;
        if (czbVar == null) {
            czbVar = new defpackage.czb();
            cxuVar.o = czbVar;
        }
        int iBJ = defpackage.afga.bJ(czbVar.b, cvdVar);
        if (iBJ >= 0) {
            float[] fArr = czbVar.c;
            if (fArr[iBJ] != f) {
                fArr[iBJ] = f;
                czbVar.d[iBJ] = 1;
                return;
            } else {
                byte[] bArr = czbVar.d;
                if (bArr[iBJ] == 2) {
                    bArr[iBJ] = 0;
                    return;
                }
                return;
            }
        }
        int i = czbVar.a;
        defpackage.cvd[] cvdVarArr = czbVar.b;
        if (i == cvdVarArr.length) {
            int i2 = i + i;
            java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(cvdVarArr, i2);
            objArrCopyOf.getClass();
            czbVar.b = (defpackage.cvd[]) objArrCopyOf;
            float[] fArrCopyOf = java.util.Arrays.copyOf(czbVar.c, i2);
            fArrCopyOf.getClass();
            czbVar.c = fArrCopyOf;
            byte[] bArrCopyOf = java.util.Arrays.copyOf(czbVar.d, i2);
            bArrCopyOf.getClass();
            czbVar.d = bArrCopyOf;
        }
        czbVar.b[i] = cvdVar;
        czbVar.d[i] = 3;
        czbVar.c[i] = f;
        czbVar.a++;
    }

    public final void p() {
        this.a = false;
    }
}
