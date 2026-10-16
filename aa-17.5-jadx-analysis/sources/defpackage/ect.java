package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes2.dex */
class ect extends ecs {
    static final ecy h = ecy.q(WindowInsets.CONSUMED, null);

    public ect(ecy ecyVar, WindowInsets windowInsets) {
        super(ecyVar, windowInsets);
    }

    @Override // defpackage.ecr, defpackage.ecn, defpackage.ecv
    public dve a(int i) {
        return dve.f(this.a.getInsets(ecx.a(i)));
    }

    @Override // defpackage.ecr, defpackage.ecn, defpackage.ecv
    public dve c(int i) {
        return dve.f(this.a.getInsetsIgnoringVisibility(ecx.a(i)));
    }

    @Override // defpackage.ecr, defpackage.ecn, defpackage.ecv
    public boolean u(int i) {
        return this.a.isVisible(ecx.a(i));
    }

    public ect(ecy ecyVar, ect ectVar) {
        super(ecyVar, ectVar);
    }

    @Override // defpackage.ecn, defpackage.ecv
    public void j(View view) {
    }
}
