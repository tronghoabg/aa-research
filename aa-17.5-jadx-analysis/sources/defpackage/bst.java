package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class bst<T> extends cfx implements cwu {
    public amv a;
    public afeg b;
    public api c;
    public boolean d;

    public bst(amv amvVar, afeg afegVar, api apiVar) {
        this.a = amvVar;
        this.b = afegVar;
        this.c = apiVar;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        int i = 1;
        if (!ctsVar.eM() || !this.d) {
            aezu aezuVar = (aezu) this.b.invoke(new dlq((cuoVarV.a << 32) | (cuoVarV.b & 4294967295L)), new dle(j));
            anf anfVar = (anf) aezuVar.a;
            Object obj = aezuVar.b;
            amv amvVar = this.a;
            if (!affa.f(amvVar.n(), anfVar)) {
                amvVar.c.b(anfVar);
                bii biiVar = amvVar.g;
                if (((ajdz) biiVar.a).c()) {
                    try {
                        amu amuVar = amvVar.d;
                        float fA = amvVar.n().a(obj);
                        if (!Float.isNaN(fA)) {
                            amuVar.a(fA, BitmapDescriptorFactory.HUE_RED);
                            amvVar.l(null);
                        }
                        amvVar.k(obj);
                        amvVar.m(obj);
                    } finally {
                        biiVar.t();
                    }
                } else {
                    amvVar.l(obj);
                }
            }
            this.d = true;
        }
        this.d = ctsVar.eM() || this.d;
        return ctsVar.eK(cuoVarV.a, cuoVarV.b, afbf.a, new cib(ctsVar, this, cuoVarV, i));
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
    public final void q() {
        this.d = false;
    }
}
