package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class cuw implements defpackage.dlo {
    private boolean a;

    public static /* synthetic */ void A(defpackage.cuw cuwVar, defpackage.cux cuxVar, int i, int i2, defpackage.affc affcVar, int i3) {
        if ((i3 & 8) != 0) {
            affcVar = defpackage.cuy.a;
        }
        cuwVar.t(cuxVar, i, i2, 0.0f, affcVar);
    }

    @Override // defpackage.dlo
    public float a() {
        throw null;
    }

    @Override // defpackage.dlu
    public float b() {
        throw null;
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
        return dQ(dF(f));
    }

    public abstract int n();

    public abstract defpackage.dlz o();

    public float p(defpackage.cvd cvdVar) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(defpackage.cux cuxVar) {
        if (cuxVar instanceof defpackage.cyd) {
            ((defpackage.cyd) cuxVar).U(this.a);
        }
    }

    public final void r(defpackage.cux cuxVar, int i, int i2, float f) {
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d((((long) i2) & 4294967295L) | (i << 32), cuxVar.e), f, null);
    }

    public final void s(defpackage.cux cuxVar, long j, float f) {
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d(j, cuxVar.e), f, null);
    }

    public final void t(defpackage.cux cuxVar, int i, int i2, float f, defpackage.affc affcVar) {
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d((((long) i2) & 4294967295L) | (i << 32), cuxVar.e), f, affcVar);
    }

    public final void u(defpackage.cux cuxVar, long j, float f, defpackage.affc affcVar) {
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d(j, cuxVar.e), f, affcVar);
    }

    public final void v(defpackage.cux cuxVar, long j, defpackage.cmq cmqVar, float f) {
        q(cuxVar);
        cuxVar.y(defpackage.dlw.d(j, cuxVar.e), f, cmqVar);
    }

    public final void w(defpackage.affc affcVar) {
        this.a = true;
        affcVar.invoke(this);
        this.a = false;
    }

    public final void x(defpackage.cux cuxVar, int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (i << 32);
        if (o() == defpackage.dlz.a || n() == 0) {
            q(cuxVar);
            cuxVar.dD(defpackage.dlw.d(j, cuxVar.e), 0.0f, null);
            return;
        }
        long jN = ((long) ((n() - cuxVar.a) - ((int) (j >> 32)))) << 32;
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | jN, cuxVar.e), 0.0f, null);
    }

    public final void y(defpackage.cux cuxVar, int i, int i2, defpackage.affc affcVar) {
        long j = (((long) i2) & 4294967295L) | (i << 32);
        if (o() == defpackage.dlz.a || n() == 0) {
            q(cuxVar);
            cuxVar.dD(defpackage.dlw.d(j, cuxVar.e), 0.0f, affcVar);
            return;
        }
        long jN = ((long) ((n() - cuxVar.a) - ((int) (j >> 32)))) << 32;
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | jN, cuxVar.e), 0.0f, affcVar);
    }

    public final void z(defpackage.cux cuxVar, long j, defpackage.affc affcVar) {
        if (o() == defpackage.dlz.a || n() == 0) {
            q(cuxVar);
            cuxVar.dD(defpackage.dlw.d(j, cuxVar.e), 0.0f, affcVar);
            return;
        }
        int iN = n() - cuxVar.a;
        long j2 = j >> 32;
        q(cuxVar);
        cuxVar.dD(defpackage.dlw.d((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) (iN - ((int) j2))) << 32), cuxVar.e), 0.0f, affcVar);
    }
}
