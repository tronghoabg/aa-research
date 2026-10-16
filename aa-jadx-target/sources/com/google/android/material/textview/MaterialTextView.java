package com.google.android.material.textview;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class MaterialTextView extends defpackage.kb {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(defpackage.wyk.b(context, attributeSet, i, 0, new int[0]), attributeSet, i);
        int i2 = defpackage.wyk.a;
        c(attributeSet, i, 0);
    }

    private static int a(android.content.Context context, android.content.res.TypedArray typedArray, int... iArr) {
        int iBg = -1;
        for (int i = 0; i < 2 && iBg < 0; i++) {
            iBg = defpackage.sqs.bg(context, typedArray, iArr[i], -1);
        }
        return iBg;
    }

    private final void b(android.content.res.Resources.Theme theme, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i, defpackage.wyj.a);
        int iA = a(getContext(), typedArrayObtainStyledAttributes, 2, 4);
        typedArrayObtainStyledAttributes.recycle();
        if (iA >= 0) {
            defpackage.dtf.b(this, iA);
        }
    }

    private final void c(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.Context context = getContext();
        if (defpackage.sqs.br(context.getTheme(), 2130970942, true)) {
            android.content.res.Resources.Theme theme = context.getTheme();
            int[] iArr = defpackage.wyj.b;
            android.content.res.TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int iA = a(context, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iA != -1) {
                return;
            }
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, i2);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                b(theme, resourceId);
            }
        }
    }

    @Override // defpackage.kb, android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i) {
        super.setTextAppearance(context, i);
        if (defpackage.sqs.bq(context, 2130970942, true)) {
            b(context.getTheme(), i);
        }
    }

    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    public MaterialTextView(android.content.Context context) {
        this(context, null);
    }

    @java.lang.Deprecated
    public MaterialTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(defpackage.wyk.a(context, attributeSet, i, i2), attributeSet, i);
        c(attributeSet, i, i2);
    }
}
