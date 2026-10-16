package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class czn extends cfx implements dcs, cyu, crq, cpq, cwu, cyz {
    final /* synthetic */ czq a;
    private final afec b = new cep(this, 15);

    public czn(czq czqVar) {
        this.a = czqVar;
    }

    @Override // defpackage.cpq
    public final boolean A(KeyEvent keyEvent) {
        chr chrVar;
        int i = chw.a;
        long jF = rl.f(keyEvent);
        if (jF == ti.g(260)) {
            chrVar = new chr(2);
        } else if (jF == ti.g(261)) {
            chrVar = new chr(1);
        } else if (jF == ti.g(61)) {
            chrVar = new chr(true != keyEvent.isShiftPressed() ? 1 : 2);
        } else {
            chrVar = jF == ti.g(22) ? new chr(4) : jF == ti.g(21) ? new chr(3) : (jF == ti.g(19) || jF == ti.g(92)) ? new chr(5) : (jF == ti.g(20) || jF == ti.g(93)) ? new chr(6) : (jF == ti.g(23) || jF == ti.g(66) || jF == ti.g(160)) ? new chr(7) : (jF == ti.g(4) || jF == ti.g(111)) ? new chr(8) : null;
        }
        if (chrVar == null || rl.e(keyEvent) != 2) {
            return false;
        }
        czq czqVar = this.a;
        cic cicVar = czqVar.J;
        ciu ciuVarB = cicVar.b();
        if (ciuVarB != null && ciuVarB.a && czqVar.i(chrVar.a)) {
            czqVar.Q().invoke(chrVar, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
            return true;
        }
        cjb cjbVarG = czqVar.g();
        int i2 = chrVar.a;
        Boolean boolD = cicVar.d(i2, cjbVarG, new chk(chrVar, 16));
        if (boolD == null) {
            return true;
        }
        if (boolD.booleanValue()) {
            czqVar.Q().invoke(chrVar, Boolean.valueOf(keyEvent.getRepeatCount() > 0));
            return true;
        }
        if (lv.q(i2)) {
            Integer numD = chw.d(i2);
            int iIntValue = numD != null ? numD.intValue() : 2;
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = czqVar.getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, czqVar, iIntValue);
            if (viewFindNextFocus == null || affa.f(viewFindNextFocus, czqVar)) {
                return cicVar.j(i2);
            }
        }
        return false;
    }

    @Override // defpackage.cpq
    public final boolean B(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.crq
    public final boolean c(crs crsVar) {
        return false;
    }

    @Override // defpackage.dcs
    public final Object d(cst cstVar, afdr afdrVar, afck afckVar) {
        long j = cstVar.j(0L);
        Object objInvoke = afdrVar.invoke();
        cjb cjbVarF = objInvoke != null ? ((cjb) objInvoke).f(j) : null;
        if (cjbVarF != null) {
            this.a.requestRectangleOnScreen(new Rect((int) cjbVarF.b, (int) cjbVarF.c, (int) cjbVarF.d, (int) cjbVarF.e), false);
        }
        return afak.a;
    }

    @Override // defpackage.cwu
    public final ctq el(cts ctsVar, cto ctoVar, long j) {
        cuo cuoVarV = ctoVar.v(j);
        return ctsVar.eL(cuoVarV.a, cuoVarV.b, afbf.a, this.b, new cep(cuoVarV, 16));
    }

    @Override // defpackage.cyz
    public final Object ep() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int h(csq csqVar, csp cspVar, int i) {
        return ty.d(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int i(csq csqVar, csp cspVar, int i) {
        return ty.e(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int j(csq csqVar, csp cspVar, int i) {
        return ty.f(new cwt(this), csqVar, cspVar, i);
    }

    @Override // defpackage.cwu
    public final /* synthetic */ int k(csq csqVar, csp cspVar, int i) {
        return ty.g(new cwt(this), csqVar, cspVar, i);
    }

    public final cso l() {
        return this.a.n;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.cyu
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.crq
    public final void f() {
    }

    @Override // defpackage.cyu
    public final void g(dec decVar) {
    }
}
