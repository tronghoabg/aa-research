package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fha {
    static final android.util.Property a;
    static final android.util.Property b;
    public static final /* synthetic */ int c = 0;
    private static final defpackage.fhb d;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            d = new defpackage.fhf();
        } else {
            d = new defpackage.fhe();
        }
        a = new defpackage.fgy(java.lang.Float.class);
        b = new defpackage.fgz(android.graphics.Rect.class);
    }

    static float a(android.view.View view) {
        return d.a(view);
    }

    static void b(android.view.View view, android.graphics.Matrix matrix) {
        d.b(view, matrix);
    }

    static void c(android.view.View view, int i, int i2, int i3, int i4) {
        d.c(view, i, i2, i3, i4);
    }

    static void d(android.view.View view, float f) {
        d.d(view, f);
    }

    static void e(android.view.View view, int i) {
        d.e(view, i);
    }

    static void f(android.view.View view, android.graphics.Matrix matrix) {
        d.f(view, matrix);
    }

    static void g(android.view.View view, android.graphics.Matrix matrix) {
        d.g(view, matrix);
    }
}
