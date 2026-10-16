package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class dmz extends defpackage.cge implements defpackage.ciq {
    @Override // defpackage.ciq
    public final void c(defpackage.cim cimVar) {
        android.view.View viewN = defpackage.vz.n(this);
        boolean z = false;
        if (this.q.A && defpackage.vz.n(this).hasFocusable()) {
            z = true;
        }
        cimVar.a(z);
        android.view.View viewFindFocus = viewN.findFocus();
        if (viewFindFocus != null) {
            cimVar.c(defpackage.cie.b(viewFindFocus, viewN));
        }
    }
}
