package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class czw extends defpackage.cge implements defpackage.dda, defpackage.czc, defpackage.crz, defpackage.cpz, defpackage.cxe, defpackage.czh {
    final /* synthetic */ defpackage.czz a;
    private final defpackage.affc b = new defpackage.chq(this, 14);

    public czw(defpackage.czz czzVar) {
        this.a = czzVar;
    }

    @Override // defpackage.cpz
    public final boolean A(android.view.KeyEvent keyEvent) {
        defpackage.chz chzVar;
        int i = defpackage.cie.a;
        long jI = defpackage.tn.i(keyEvent);
        if (jI == defpackage.tn.e(260)) {
            chzVar = new defpackage.chz(2);
        } else if (jI == defpackage.tn.e(261)) {
            chzVar = new defpackage.chz(1);
        } else if (jI == defpackage.tn.e(61)) {
            chzVar = new defpackage.chz(true != keyEvent.isShiftPressed() ? 1 : 2);
        } else if (jI == defpackage.tn.e(22)) {
            chzVar = new defpackage.chz(4);
        } else if (jI == defpackage.tn.e(21)) {
            chzVar = new defpackage.chz(3);
        } else if (jI == defpackage.tn.e(19) || jI == defpackage.tn.e(92)) {
            chzVar = new defpackage.chz(5);
        } else if (jI == defpackage.tn.e(20) || jI == defpackage.tn.e(93)) {
            chzVar = new defpackage.chz(6);
        } else if (jI == defpackage.tn.e(23) || jI == defpackage.tn.e(66) || jI == defpackage.tn.e(160)) {
            chzVar = new defpackage.chz(7);
        } else {
            chzVar = (jI == defpackage.tn.e(4) || jI == defpackage.tn.e(111)) ? new defpackage.chz(8) : null;
        }
        if (chzVar == null || defpackage.tn.h(keyEvent) != 2) {
            return false;
        }
        defpackage.czz czzVar = this.a;
        defpackage.cik cikVar = czzVar.J;
        defpackage.cjc cjcVarB = cikVar.b();
        if (cjcVarB != null && cjcVarB.a && czzVar.i(chzVar.a)) {
            czzVar.Q().invoke(chzVar, java.lang.Boolean.valueOf(keyEvent.getRepeatCount() > 0));
            return true;
        }
        defpackage.cjj cjjVarG = czzVar.g();
        int i2 = chzVar.a;
        java.lang.Boolean boolD = cikVar.d(i2, cjjVarG, new defpackage.chs(chzVar, 16));
        if (boolD == null) {
            return true;
        }
        if (boolD.booleanValue()) {
            czzVar.Q().invoke(chzVar, java.lang.Boolean.valueOf(keyEvent.getRepeatCount() > 0));
            return true;
        }
        if (defpackage.ly.p(i2)) {
            java.lang.Integer numD = defpackage.cie.d(i2);
            int iIntValue = numD != null ? numD.intValue() : 2;
            android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
            android.view.View rootView = czzVar.getRootView();
            rootView.getClass();
            android.view.View viewFindNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, czzVar, iIntValue);
            if (viewFindNextFocus == null || defpackage.afga.f(viewFindNextFocus, czzVar)) {
                return cikVar.j(i2);
            }
        }
        return false;
    }

    @Override // defpackage.cpz
    public final boolean B(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.crz
    public final boolean c(csb csbVar) {
        return false;
    }

    @Override // defpackage.dda
    public final java.lang.Object d(defpackage.ctc ctcVar, defpackage.afer aferVar, defpackage.afdk afdkVar) {
        long j = ctcVar.j(0L);
        java.lang.Object objInvoke = aferVar.invoke();
        defpackage.cjj cjjVarF = objInvoke != null ? ((defpackage.cjj) objInvoke).f(j) : null;
        if (cjjVarF != null) {
            this.a.requestRectangleOnScreen(new android.graphics.Rect((int) cjjVarF.b, (int) cjjVarF.c, (int) cjjVarF.d, (int) cjjVarF.e), false);
        }
        return defpackage.afbk.a;
    }

    @Override // defpackage.cxe
    public final defpackage.ctz dt(defpackage.cub cubVar, defpackage.ctx ctxVar, long j) {
        defpackage.cux cuxVarV = ctxVar.v(j);
        return cubVar.dT(cuxVarV.a, cuxVarV.b, defpackage.afcf.a, this.b, new defpackage.chq(cuxVarV, 15));
    }

    @Override // defpackage.czh
    public final java.lang.Object dx() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int h(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.c(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int i(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.d(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int j(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.e(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    @Override // defpackage.cxe
    public final /* synthetic */ int k(defpackage.csz cszVar, defpackage.csy csyVar, int i) {
        return defpackage.ud.f(new defpackage.cxd(this), cszVar, csyVar, i);
    }

    public final defpackage.csx l() {
        return this.a.n;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean y() {
        return false;
    }

    @Override // defpackage.czc
    public final /* synthetic */ boolean z() {
        return true;
    }

    @Override // defpackage.czc
    public final /* synthetic */ void D() {
    }

    @Override // defpackage.crz
    public final void f() {
    }

    @Override // defpackage.czc
    public final void g(defpackage.dek dekVar) {
    }
}
