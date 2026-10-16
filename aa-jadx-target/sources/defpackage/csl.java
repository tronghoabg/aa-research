package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class csl implements defpackage.cub, defpackage.csz {
    public final defpackage.cxh a;
    public defpackage.csj b;
    public boolean c;

    public csl(defpackage.cxh cxhVar, defpackage.csj csjVar) {
        this.a = cxhVar;
        this.b = csjVar;
    }

    @Override // defpackage.dlo
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.dlu
    public final float dE(long j) {
        return defpackage.dln.n(this.a, j);
    }

    @Override // defpackage.dlo
    public final float dF(float f) {
        return (f / this.a.a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dG(int i) {
        return (i / this.a.a()) + 0.0f;
    }

    @Override // defpackage.dlo
    public final float dH(long j) {
        return defpackage.dln.p(this.a, j);
    }

    @Override // defpackage.dlo
    public final float dI(float f) {
        return f * this.a.a();
    }

    @Override // defpackage.dlo
    public final int dM(long j) {
        return java.lang.Math.round(defpackage.dln.p(this.a, j));
    }

    @Override // defpackage.dlo
    public final int dN(float f) {
        return defpackage.dln.q(this.a, f);
    }

    @Override // defpackage.dlo
    public final long dO(long j) {
        return defpackage.dln.r(this.a, j);
    }

    @Override // defpackage.dlo
    public final long dP(long j) {
        return defpackage.dln.s(this.a, j);
    }

    @Override // defpackage.dlu
    public final long dQ(float f) {
        return defpackage.dln.o(this.a, f);
    }

    @Override // defpackage.dlo
    public final long dR(float f) {
        defpackage.cxh cxhVar = this.a;
        return defpackage.dln.o(cxhVar, (f / cxhVar.a()) + 0.0f);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dS(int i, int i2, java.util.Map map, defpackage.affc affcVar) {
        return this.a.dT(i, i2, map, null, affcVar);
    }

    @Override // defpackage.cub
    public final defpackage.ctz dT(int i, int i2, java.util.Map map, defpackage.affc affcVar, defpackage.affc affcVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            defpackage.csc.c(defpackage.a.bz(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new defpackage.csk(i, i2, map, affcVar, affcVar2, this);
    }

    @Override // defpackage.csz
    public final boolean dU() {
        return false;
    }

    @Override // defpackage.csz
    public final defpackage.dlz p() {
        return this.a.p();
    }
}
