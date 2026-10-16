package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
class ecv extends defpackage.ecu {
    private defpackage.dvl g;

    public ecv(defpackage.edf edfVar, defpackage.ecv ecvVar) {
        super(edfVar, ecvVar);
        this.g = null;
        this.g = ecvVar.g;
    }

    @Override // defpackage.edc
    public boolean A() {
        return this.a.isConsumed();
    }

    @Override // defpackage.edc
    public final defpackage.dvl w() {
        defpackage.dvl dvlVar = this.g;
        if (dvlVar != null) {
            return dvlVar;
        }
        android.view.WindowInsets windowInsets = this.a;
        defpackage.dvl dvlVarE = defpackage.dvl.e(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.g = dvlVarE;
        return dvlVarE;
    }

    @Override // defpackage.edc
    public defpackage.edf x() {
        return defpackage.edf.q(this.a.consumeStableInsets(), null);
    }

    @Override // defpackage.edc
    public defpackage.edf y() {
        return defpackage.edf.q(this.a.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.edc
    public void z(defpackage.dvl dvlVar) {
        this.g = dvlVar;
    }

    public ecv(defpackage.edf edfVar, android.view.WindowInsets windowInsets) {
        super(edfVar, windowInsets);
        this.g = null;
    }
}
