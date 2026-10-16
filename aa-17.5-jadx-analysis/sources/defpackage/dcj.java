package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class dcj implements View.OnAttachStateChangeListener {
    final /* synthetic */ View a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dcj(View view, Object obj, int i) {
        this.c = i;
        this.a = view;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.c != 0) {
            View view2 = this.a;
            eqa eqaVarD = ecw.d(view2);
            if (eqaVarD == null) {
                crt.a(a.bm(view2, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new aezp();
            }
            czd czdVar = (czd) view2;
            ((affv) this.b).a = czz.w(czdVar, eqaVarD.getLifecycle());
            czdVar.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.c != 0) {
            return;
        }
        this.a.removeOnAttachStateChangeListener(this);
        ((bxn) this.b).B();
    }
}
