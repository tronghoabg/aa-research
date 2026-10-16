package t3;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class y extends gc.b {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f45737f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f45738g = true;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f45739h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f45740i = true;

    @Override // gc.b
    public void K(int i5, View view) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT == 28) {
            super.K(i5, view);
        } else if (f45740i) {
            try {
                view.setTransitionVisibility(i5);
            } catch (NoSuchMethodError unused) {
                f45740i = false;
            }
        }
    }

    public void Q(View view, int i5, int i10, int i11, int i12) {
        if (f45739h) {
            try {
                view.setLeftTopRightBottom(i5, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f45739h = false;
            }
        }
    }

    public void R(View view, Matrix matrix) {
        if (f45737f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f45737f = false;
            }
        }
    }

    public void S(View view, Matrix matrix) {
        if (f45738g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f45738g = false;
            }
        }
    }
}
