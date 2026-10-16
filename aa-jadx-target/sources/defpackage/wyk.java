package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wyk {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {android.R.attr.theme, 2130970997};
    private static final int[] c = {2130969915};

    public static android.content.Context a(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        return b(context, attributeSet, i, i2, new int[0]);
    }

    public static android.content.Context b(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int[] iArr) {
        int i3 = c(context, attributeSet, c, i, i2)[0];
        boolean z = (context instanceof defpackage.pl) && ((defpackage.pl) context).a == i3;
        if (i3 == 0 || z) {
            return context;
        }
        defpackage.pl plVar = new defpackage.pl(context, i3);
        int[] iArrC = c(context, attributeSet, iArr, i, i2);
        int length = iArrC.length;
        for (int i4 = 0; i4 < length; i4 = 1) {
            int i5 = iArrC[0];
            if (i5 != 0) {
                plVar.getTheme().applyStyle(i5, true);
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            plVar.getTheme().applyStyle(resourceId, true);
        }
        return plVar;
    }

    private static int[] c(android.content.Context context, android.util.AttributeSet attributeSet, int[] iArr, int i, int i2) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        if (length > 0) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 = 0; i3 < iArr.length; i3 = 1) {
                iArr2[0] = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        return iArr2;
    }
}
