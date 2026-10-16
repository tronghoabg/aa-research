package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
final class dmn extends cfx implements ViewTreeObserver.OnGlobalFocusChangeListener, cii {
    private ViewTreeObserver a;
    private final afec b = new ddz(this, 6);
    private final afec c = new ddz(this, 7);

    private final ciu b() {
        boolean z;
        if (!this.q.A) {
            crt.c("visitLocalDescendants called on an unattached node");
        }
        cfx cfxVar = this.q;
        if ((cfxVar.s & 1024) != 0) {
            boolean z2 = false;
            for (cfx cfxVar2 = cfxVar.u; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                if ((cfxVar2.r & 1024) != 0) {
                    cfx cfxVarN = cfxVar2;
                    byw bywVar = null;
                    while (cfxVarN != null) {
                        if (cfxVarN instanceof ciu) {
                            ciu ciuVar = (ciu) cfxVarN;
                            if (z2) {
                                return ciuVar;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                            int i = 0;
                            for (cfx cfxVar3 = ((cwe) cfxVarN).C; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                                if ((cfxVar3.r & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cfxVarN = cfxVar3;
                                    } else {
                                        if (bywVar == null) {
                                            bywVar = new byw(new cfx[16]);
                                        }
                                        if (cfxVarN != null) {
                                            bywVar.n(cfxVarN);
                                        }
                                        bywVar.n(cfxVar3);
                                        cfxVarN = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        cfxVarN = bzi.n(bywVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // defpackage.cii
    public final void c(cie cieVar) {
        cieVar.a(false);
        cieVar.f(this.b);
        cieVar.g(this.c);
    }

    @Override // defpackage.cfx
    public final void er() {
        ViewTreeObserver viewTreeObserver = tt.c(this).getViewTreeObserver();
        this.a = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (bzi.q(this).k == null) {
            return;
        }
        View viewG = vs.g(this);
        cic cicVar = ((czq) bzi.s(this)).J;
        cym cymVarS = bzi.s(this);
        boolean z = (view == null || affa.f(view, cymVarS) || !vs.h(viewG, view)) ? false : true;
        boolean z2 = (view2 == null || affa.f(view2, cymVarS) || !vs.h(viewG, view2)) ? false : true;
        if (z) {
            if (z2) {
                return;
            }
        } else if (z2) {
            ciu ciuVarB = b();
            if (ciuVarB.g().a()) {
                return;
            }
            mt.s(ciuVarB);
            return;
        }
        if (z && b().g().b()) {
            cicVar.k(false, false, 8);
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.a = null;
        tt.c(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
