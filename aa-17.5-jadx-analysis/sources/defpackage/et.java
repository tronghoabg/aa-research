package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
final class et extends ebv {
    final /* synthetic */ fe a;

    public et(fe feVar) {
        this.a = feVar;
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void a() {
        fe feVar = this.a;
        feVar.r.setAlpha(1.0f);
        feVar.J.w(null);
        feVar.J = null;
    }

    @Override // defpackage.ebv, defpackage.ebu
    public final void b() {
        fe feVar = this.a;
        feVar.r.setVisibility(0);
        if (feVar.r.getParent() instanceof View) {
            View view = (View) feVar.r.getParent();
            int[] iArr = ebm.a;
            view.requestApplyInsets();
        }
    }
}
