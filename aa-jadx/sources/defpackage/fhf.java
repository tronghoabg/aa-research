package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fhf extends defpackage.fhe {
    @Override // defpackage.fhb
    public final float a(android.view.View view) {
        return view.getTransitionAlpha();
    }

    @Override // defpackage.fhc, defpackage.fhb
    public final void b(android.view.View view, android.graphics.Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // defpackage.fhd, defpackage.fhb
    public final void c(android.view.View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.fhb
    public final void d(android.view.View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // defpackage.fhe, defpackage.fhb
    public final void e(android.view.View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.fhc, defpackage.fhb
    public final void f(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.fhc, defpackage.fhb
    public final void g(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
