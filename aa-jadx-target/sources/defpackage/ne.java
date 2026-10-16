package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ne {
    private static final java.lang.ThreadLocal f = new java.lang.ThreadLocal();
    static final int[] a = {-16842910};
    static final int[] b = {android.R.attr.state_focused};
    static final int[] c = {android.R.attr.state_pressed};
    static final int[] d = {android.R.attr.state_checked};
    static final int[] e = new int[0];
    private static final int[] g = new int[1];

    public static int a(android.content.Context context, int i) {
        android.content.res.ColorStateList colorStateListC = c(context, i);
        if (colorStateListC != null && colorStateListC.isStateful()) {
            return colorStateListC.getColorForState(a, colorStateListC.getDefaultColor());
        }
        java.lang.ThreadLocal threadLocal = f;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        int iB = b(context, i);
        return defpackage.dvk.e(iB, java.lang.Math.round(android.graphics.Color.alpha(iB) * f2));
    }

    public static int b(android.content.Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        defpackage.lam lamVarB = defpackage.lam.B(context, null, iArr);
        try {
            return lamVarB.z(0);
        } finally {
            lamVarB.w();
        }
    }

    public static android.content.res.ColorStateList c(android.content.Context context, int i) {
        int[] iArr = g;
        iArr[0] = i;
        defpackage.lam lamVarB = defpackage.lam.B(context, null, iArr);
        try {
            return lamVarB.r(0);
        } finally {
            lamVarB.w();
        }
    }

    public static void d(android.view.View view, android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(defpackage.ft.j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                android.util.Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
