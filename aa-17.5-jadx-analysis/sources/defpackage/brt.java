package defpackage;

/* loaded from: classes2.dex */
public final class brt extends cfx implements cwu {
    public ase a;
    public boolean b;
    public aew c;
    public boolean d;
    public adu e;
    public adu f;
    public float g = Float.NaN;
    public float h = Float.NaN;

    public brt(ase aseVar, boolean z, aew aewVar) {
        this.a = aseVar;
        this.b = z;
        this.c = aewVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        final brt brtVar;
        float fEA = ctsVar.eA(this.d ? 28.0f : ((ctoVar.c(dle.b(j)) != 0 && ctoVar.d(dle.a(j)) != 0) || this.b) ? 24.0f : 16.0f);
        adu aduVar = this.f;
        int iFloatValue = (int) (aduVar != null ? ((Number) aduVar.d()).floatValue() : fEA);
        final cuo cuoVarV = ctoVar.v(dlf.v(iFloatValue, iFloatValue));
        final float fEA2 = ctsVar.eA((32.0f - ctsVar.ex(fEA)) / 2.0f);
        float fEA3 = ctsVar.eA(24.0f);
        boolean z = this.d;
        if (z && this.b) {
            fEA2 = fEA3 - ctsVar.eA(2.0f);
        } else if (z && !this.b) {
            fEA2 = ctsVar.eA(2.0f);
        } else if (this.b) {
            fEA2 = fEA3;
        }
        adu aduVar2 = this.f;
        if (affa.e(aduVar2 != null ? (Float) aduVar2.c() : null, fEA)) {
            brtVar = this;
        } else {
            brtVar = this;
            ahnc.d(N(), null, 0, new brs(brtVar, fEA, (afck) null, 1, (byte[]) null), 3);
        }
        adu aduVar3 = brtVar.e;
        if (!affa.e(aduVar3 != null ? (Float) aduVar3.c() : null, fEA2)) {
            ahnc.d(brtVar.N(), null, 0, new brs(brtVar, fEA2, (afck) null, 0), 3);
        }
        if (Float.isNaN(brtVar.h) && Float.isNaN(brtVar.g)) {
            brtVar.h = fEA;
            brtVar.g = fEA2;
        }
        return ctsVar.eK(iFloatValue, iFloatValue, afbf.a, new afec() { // from class: brr
            @Override // defpackage.afec
            public final Object invoke(Object obj) {
                cun cunVar = (cun) obj;
                adu aduVar4 = brtVar.e;
                cunVar.x(cuoVarV, (int) (aduVar4 != null ? ((Number) aduVar4.d()).floatValue() : fEA2), 0);
                return afak.a;
            }
        });
    }

    @Override // defpackage.cfx
    public final void em() {
        this.e = null;
        this.f = null;
        this.h = Float.NaN;
        this.g = Float.NaN;
    }

    @Override // defpackage.cfx
    public final void er() {
        ahnc.d(N(), null, 0, new btm(this, (afck) null, 1), 3);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return tv.c(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return tv.d(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return tv.e(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return tv.f(this, csqVar, cspVar, i);
    }

    @Override // defpackage.cfx
    public final boolean x() {
        return false;
    }
}
