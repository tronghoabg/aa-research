package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class chg implements defpackage.dlo {
    public defpackage.che a = defpackage.cho.a;
    public defpackage.khb b;

    @Override // defpackage.dlo
    public final float a() {
        return this.a.m().a();
    }

    @Override // defpackage.dlu
    public final float b() {
        return this.a.m().b();
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

    public final long n() {
        return this.a.l();
    }

    public final defpackage.dlz o() {
        return this.a.n();
    }

    public final void p() {
        this.b = null;
    }

    public final defpackage.khb q(defpackage.affc affcVar) {
        defpackage.khb khbVar = new defpackage.khb(affcVar, (byte[]) null);
        this.b = khbVar;
        return khbVar;
    }
}
