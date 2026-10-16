package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
class eco extends ecn {
    private dve g;

    public eco(ecy ecyVar, eco ecoVar) {
        super(ecyVar, ecoVar);
        this.g = null;
        this.g = ecoVar.g;
    }

    @Override // defpackage.ecv
    public boolean A() {
        return this.a.isConsumed();
    }

    @Override // defpackage.ecv
    public final dve w() {
        dve dveVar = this.g;
        if (dveVar != null) {
            return dveVar;
        }
        WindowInsets windowInsets = this.a;
        dve dveVarE = dve.e(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.g = dveVarE;
        return dveVarE;
    }

    @Override // defpackage.ecv
    public ecy x() {
        return ecy.q(this.a.consumeStableInsets(), null);
    }

    @Override // defpackage.ecv
    public ecy y() {
        return ecy.q(this.a.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.ecv
    public void z(dve dveVar) {
        this.g = dveVar;
    }

    public eco(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar, windowInsets);
        this.g = null;
    }
}
