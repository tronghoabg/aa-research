package defpackage;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
class fgw extends fgv {
    private static boolean a = true;
    private static boolean b = true;
    private static boolean c = true;

    @Override // defpackage.fgv
    public void b(View view, Matrix matrix) {
        if (a) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    @Override // defpackage.fgv
    public void f(View view, Matrix matrix) {
        if (b) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                b = false;
            }
        }
    }

    @Override // defpackage.fgv
    public void g(View view, Matrix matrix) {
        if (c) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
    }
}
