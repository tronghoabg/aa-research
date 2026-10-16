package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
class ecr extends ecq {
    static final ecy g = ecy.q(WindowInsets.CONSUMED, null);

    public ecr(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar, windowInsets);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public dve a(int i) {
        Insets insets = this.a.getInsets(ecw.a(i));
        return dve.e(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public dve c(int i) {
        Insets insetsIgnoringVisibility = this.a.getInsetsIgnoringVisibility(ecw.a(i));
        return dve.e(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public boolean u(int i) {
        return this.a.isVisible(ecw.a(i));
    }

    public ecr(ecy ecyVar, ecr ecrVar) {
        super(ecyVar, ecrVar);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public final void h(View view) {
    }
}
