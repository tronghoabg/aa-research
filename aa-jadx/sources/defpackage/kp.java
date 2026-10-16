package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kp {
    private static final int[] b = {android.R.attr.state_checked};
    private static final int[] c = new int[0];
    public static final android.graphics.Rect a = new android.graphics.Rect();

    public static android.graphics.Rect a(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets opticalInsets = drawable.getOpticalInsets();
            return new android.graphics.Rect(opticalInsets.left, opticalInsets.top, opticalInsets.right, opticalInsets.bottom);
        }
        android.graphics.drawable.Drawable drawableB = defpackage.dto.b(drawable);
        boolean z = defpackage.ko.a;
        if (android.os.Build.VERSION.SDK_INT < 29 && defpackage.ko.a) {
            try {
                java.lang.Object objInvoke = defpackage.ko.b.invoke(drawableB, null);
                if (objInvoke != null) {
                    return new android.graphics.Rect(defpackage.ko.c.getInt(objInvoke), defpackage.ko.d.getInt(objInvoke), defpackage.ko.e.getInt(objInvoke), defpackage.ko.f.getInt(objInvoke));
                }
            } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            }
        }
        return a;
    }

    public static void b(android.graphics.drawable.Drawable drawable) {
        java.lang.String name = drawable.getClass().getName();
        if (android.os.Build.VERSION.SDK_INT < 29 || android.os.Build.VERSION.SDK_INT >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(b);
        } else {
            drawable.setState(c);
        }
        drawable.setState(state);
    }
}
