package u0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class H implements G {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f46115a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f46116b = new int[2];

    @Override // u0.G
    public void a(@NotNull View view, @NotNull float[] matrix) {
        AbstractC3340k.e(view, "view");
        AbstractC3340k.e(matrix, "matrix");
        Matrix matrix2 = this.f46115a;
        matrix2.reset();
        view.transformMatrixToGlobal(matrix2);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f46116b;
        view.getLocationOnScreen(iArr);
        int i5 = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i5, iArr[1] - i10);
        e0.z.p(matrix, matrix2);
    }
}
