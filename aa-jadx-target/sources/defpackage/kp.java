package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kp {
    private static final int[] b = {android.R.attr.state_checked};
    private static final int[] c = new int[0];
    public static final android.graphics.Rect a = new android.graphics.Rect();

    public static android.graphics.Rect a(android.graphics.drawable.Drawable drawable) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.graphics.Insets insetsM = ep$.ExternalSyntheticApiModelOutline0.m(drawable);
            return new android.graphics.Rect(alh$.ExternalSyntheticApiModelOutline0.m(insetsM), alh$.ExternalSyntheticApiModelOutline0.m$2(insetsM), alh$.ExternalSyntheticApiModelOutline0.m$1(insetsM), alh$.ExternalSyntheticApiModelOutline0.m$3(insetsM));
        }
        android.graphics.drawable.Drawable drawableB = dto.b(drawable);
        boolean z = ko.a;
        if (android.os.Build.VERSION.SDK_INT < 29 && ko.a) {
            try {
                java.lang.Object objInvoke = ko.b.invoke(drawableB, null);
                if (objInvoke != null) {
                    return new android.graphics.Rect(ko.c.getInt(objInvoke), ko.d.getInt(objInvoke), ko.e.getInt(objInvoke), ko.f.getInt(objInvoke));
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
