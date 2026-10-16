package t3;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class z extends y {
    @Override // gc.b
    public final void J(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // t3.y, gc.b
    public final void K(int i5, View view) {
        view.setTransitionVisibility(i5);
    }

    @Override // t3.y
    public final void Q(View view, int i5, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i5, i10, i11, i12);
    }

    @Override // t3.y
    public final void R(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // t3.y
    public final void S(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // gc.b
    public final float v(View view) {
        return view.getTransitionAlpha();
    }
}
