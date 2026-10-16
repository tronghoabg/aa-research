package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class am implements defpackage.eqt {
    final /* synthetic */ defpackage.ao a;

    public am(defpackage.ao aoVar) {
        this.a = aoVar;
    }

    @Override // defpackage.eqt
    public final /* bridge */ /* synthetic */ void ea(java.lang.Object obj) {
        if (((defpackage.eqg) obj) != null) {
            defpackage.ao aoVar = this.a;
            if (aoVar.d) {
                android.view.View viewRequireView = aoVar.requireView();
                if (viewRequireView.getParent() != null) {
                    throw new java.lang.IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (aoVar.e != null) {
                    if (defpackage.bt.ac(3)) {
                        android.util.Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + aoVar.e);
                    }
                    aoVar.e.setContentView(viewRequireView);
                }
            }
        }
    }
}
