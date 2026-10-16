package defpackage;

/* JADX INFO: loaded from: classes2.dex */
class fhb {
    private static boolean a = true;
    private static java.lang.reflect.Field b;
    private static boolean c;

    public float a(android.view.View view) {
        if (a) {
            try {
                return view.getTransitionAlpha();
            } catch (java.lang.NoSuchMethodError unused) {
                a = false;
            }
        }
        return view.getAlpha();
    }

    public void b(android.view.View view, android.graphics.Matrix matrix) {
        throw null;
    }

    public void c(android.view.View view, int i, int i2, int i3, int i4) {
        throw null;
    }

    public void d(android.view.View view, float f) {
        if (a) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (java.lang.NoSuchMethodError unused) {
                a = false;
            }
        }
        view.setAlpha(f);
    }

    public void e(android.view.View view, int i) {
        if (!c) {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mViewFlags");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
                android.util.Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            c = true;
        }
        java.lang.reflect.Field field = b;
        if (field != null) {
            try {
                b.setInt(view, (field.getInt(view) & (-13)) | i);
            } catch (java.lang.IllegalAccessException unused2) {
            }
        }
    }

    public void f(android.view.View view, android.graphics.Matrix matrix) {
        throw null;
    }

    public void g(android.view.View view, android.graphics.Matrix matrix) {
        throw null;
    }
}
