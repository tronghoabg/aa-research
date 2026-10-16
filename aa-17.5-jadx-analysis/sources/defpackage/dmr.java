package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
final class dmr extends cfx implements cii {
    @Override // defpackage.cii
    public final void c(cie cieVar) {
        View viewG = vs.g(this);
        boolean z = false;
        if (this.q.A && vs.g(this).hasFocusable()) {
            z = true;
        }
        cieVar.a(z);
        View viewFindFocus = viewG.findFocus();
        if (viewFindFocus != null) {
            cieVar.c(chw.b(viewFindFocus, viewG));
        }
    }
}
