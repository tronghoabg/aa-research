package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wro {
    private static final int[] a = {com.google.android.projection.gearhead.R.attr.colorPrimary};
    private static final int[] b = {com.google.android.projection.gearhead.R.attr.colorPrimaryVariant};

    public static android.content.res.TypedArray a(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        d(context, attributeSet, i, i2);
        e(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void b(android.content.Context context) {
        f(context, a, "Theme.AppCompat");
    }

    public static defpackage.lam c(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        d(context, attributeSet, i, i2);
        e(context, attributeSet, iArr, i, i2, iArr2);
        return defpackage.lam.C(context, attributeSet, iArr, i, i2);
    }

    private static void d(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wrf.b, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            if (!context.getTheme().resolveAttribute(com.google.android.projection.gearhead.R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                f(context, b, "Theme.MaterialComponents");
            }
        }
        b(context);
    }

    private static void e(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wrf.b, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        int length = iArr2.length;
        if (length != 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i3], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i3++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new java.lang.IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void f(android.content.Context context, int[] iArr, java.lang.String str) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.recycle();
        } else {
            typedArrayObtainStyledAttributes.recycle();
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "The style on this component requires your app theme to be ", " (or a descendant)."));
        }
    }
}
