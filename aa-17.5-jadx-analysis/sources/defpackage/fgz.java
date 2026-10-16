package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
final class fgz extends fgy {
    @Override // defpackage.fgv
    public final float a(View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.fgw, defpackage.fgv
    public final void b(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.fgx, defpackage.fgv
    public final void c(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.fgv
    public final void d(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.fgy, defpackage.fgv
    public final void e(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.fgw, defpackage.fgv
    public final void f(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.fgw, defpackage.fgv
    public final void g(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
