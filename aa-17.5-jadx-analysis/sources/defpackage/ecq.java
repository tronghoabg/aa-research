package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
class ecq extends ecp {
    private dve g;
    private dve h;
    private dve k;

    public ecq(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar, windowInsets);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.ecv
    public dve D() {
        dve dveVar = this.h;
        if (dveVar != null) {
            return dveVar;
        }
        dve dveVarF = dve.f(this.a.getMandatorySystemGestureInsets());
        this.h = dveVarF;
        return dveVarF;
    }

    @Override // defpackage.ecv
    public dve E() {
        dve dveVar = this.g;
        if (dveVar != null) {
            return dveVar;
        }
        dve dveVarF = dve.f(this.a.getSystemGestureInsets());
        this.g = dveVarF;
        return dveVarF;
    }

    @Override // defpackage.ecv
    public dve F() {
        dve dveVar = this.k;
        if (dveVar != null) {
            return dveVar;
        }
        dve dveVarF = dve.f(this.a.getTappableElementInsets());
        this.k = dveVarF;
        return dveVarF;
    }

    @Override // defpackage.ecn, defpackage.ecv
    public ecy e(int i, int i2, int i3, int i4) {
        return ecy.q(this.a.inset(i, i2, i3, i4), null);
    }

    public ecq(ecy ecyVar, ecq ecqVar) {
        super(ecyVar, ecqVar);
        this.g = null;
        this.h = null;
        this.k = null;
    }

    @Override // defpackage.eco, defpackage.ecv
    public void z(dve dveVar) {
    }
}
