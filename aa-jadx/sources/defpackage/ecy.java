package defpackage;

/* JADX INFO: loaded from: classes.dex */
class ecy extends defpackage.ecx {
    static final defpackage.edf g = defpackage.edf.q(android.view.WindowInsets.CONSUMED, null);

    public ecy(defpackage.edf edfVar, android.view.WindowInsets windowInsets) {
        super(edfVar, windowInsets);
    }

    @Override // defpackage.ecu, defpackage.edc
    public defpackage.dvl a(int i) {
        android.graphics.Insets insets = this.a.getInsets(defpackage.edd.eR(i));
        return defpackage.dvl.e(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Override // defpackage.ecu, defpackage.edc
    public defpackage.dvl c(int i) {
        android.graphics.Insets insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(defpackage.edd.eR(i));
        return defpackage.dvl.e(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    @Override // defpackage.ecu, defpackage.edc
    public boolean u(int i) {
        return this.a.isVisible(defpackage.edd.eR(i));
    }

    public ecy(defpackage.edf edfVar, defpackage.ecy ecyVar) {
        super(edfVar, ecyVar);
    }

    @Override // defpackage.ecu, defpackage.edc
    public final void h(android.view.View view) {
    }
}
