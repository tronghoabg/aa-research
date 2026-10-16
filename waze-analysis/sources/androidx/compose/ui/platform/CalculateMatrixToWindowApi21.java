package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class CalculateMatrixToWindowApi21 implements CalculateMatrixToWindow {
    private final int[] tmpLocation;
    private final float[] tmpMatrix;

    private CalculateMatrixToWindowApi21(float[] fArr) {
        this.tmpMatrix = fArr;
        this.tmpLocation = new int[2];
    }

    /* renamed from: preConcat-tU-YjHk, reason: not valid java name */
    private final void m10214preConcattUYjHk(float[] fArr, Matrix matrix) {
        AndroidMatrixConversions_androidKt.m8096setFromtUYjHk(this.tmpMatrix, matrix);
        AndroidComposeView_androidKt.m10201preTransformJiSxe2E(fArr, this.tmpMatrix);
    }

    /* renamed from: preTranslate-3XD1CNM, reason: not valid java name */
    private final void m10215preTranslate3XD1CNM(float[] fArr, float f2, float f3) {
        AndroidComposeView_androidKt.m10202preTranslatecG2Xzmc(fArr, f2, f3, this.tmpMatrix);
    }

    /* renamed from: transformMatrixToWindow-EL8BTi8, reason: not valid java name */
    private final void m10216transformMatrixToWindowEL8BTi8(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            m10216transformMatrixToWindowEL8BTi8((View) parent, fArr);
            m10215preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m10215preTranslate3XD1CNM(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.tmpLocation);
            m10215preTranslate3XD1CNM(fArr, -view.getScrollX(), -view.getScrollY());
            m10215preTranslate3XD1CNM(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        m10214preConcattUYjHk(fArr, matrix);
    }

    @Override // androidx.compose.ui.platform.CalculateMatrixToWindow
    /* renamed from: calculateMatrixToWindow-EL8BTi8 */
    public void mo10213calculateMatrixToWindowEL8BTi8(View view, float[] fArr) {
        androidx.compose.ui.graphics.Matrix.m8501resetimpl(fArr);
        m10216transformMatrixToWindowEL8BTi8(view, fArr);
    }

    public /* synthetic */ CalculateMatrixToWindowApi21(float[] fArr, o oVar) {
        this(fArr);
    }
}
