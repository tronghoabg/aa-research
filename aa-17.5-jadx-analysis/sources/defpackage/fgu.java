package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes2.dex */
final class fgu {
    static final Property a;
    static final Property b;
    public static final /* synthetic */ int c = 0;
    private static final fgv d;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            d = new fgz();
        } else {
            d = new fgy();
        }
        a = new fgs(Float.class);
        b = new fgt(Rect.class);
    }

    static float a(View view) {
        return d.a(view);
    }

    static void b(View view, Matrix matrix) {
        d.b(view, matrix);
    }

    static void c(View view, int i, int i2, int i3, int i4) {
        d.c(view, i, i2, i3, i4);
    }

    static void d(View view, float f) {
        d.d(view, f);
    }

    static void e(View view, int i) {
        d.e(view, i);
    }

    static void f(View view, Matrix matrix) {
        d.f(view, matrix);
    }

    static void g(View view, Matrix matrix) {
        d.g(view, matrix);
    }
}
