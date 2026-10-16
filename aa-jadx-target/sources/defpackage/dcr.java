package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dcr implements android.view.View.OnAttachStateChangeListener {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public dcr(android.view.View view, java.lang.Object obj, int i) {
        this.c = i;
        this.a = view;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        if (this.c != 0) {
            android.view.View view2 = this.a;
            defpackage.eqg eqgVarC = defpackage.edd.c(view2);
            if (eqgVarC == null) {
                defpackage.csc.a(defpackage.a.bl(view2, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new defpackage.afap();
            }
            defpackage.czl czlVar = (defpackage.czl) view2;
            ((defpackage.afgv) this.b).a = defpackage.dax.c(czlVar, eqgVarC.getLifecycle());
            czlVar.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        if (this.c != 0) {
            return;
        }
        this.a.removeOnAttachStateChangeListener(this);
        ((defpackage.bxt) this.b).B();
    }
}
