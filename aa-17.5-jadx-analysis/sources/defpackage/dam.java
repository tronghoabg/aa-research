package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
final class dam {
    public static final dam a = new dam();

    public static final void a(View view, float[] fArr, float[] fArr2, int[] iArr) {
        cki.c(fArr);
        a.b(view, fArr, fArr2, iArr);
    }

    private final void b(View view, float[] fArr, float[] fArr2, int[] iArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            b((View) parent, fArr, fArr2, iArr);
            czz.j(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            czz.j(fArr, view.getLeft(), view.getTop(), fArr2);
        } else {
            view.getLocationInWindow(iArr);
            czz.j(fArr, -view.getScrollX(), -view.getScrollY(), fArr2);
            czz.j(fArr, iArr[0], iArr[1], fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        cjn.e(fArr2, matrix);
        czz.i(fArr, fArr2);
    }
}
