package com.google.android.apps.auto.sdk.ui;

/* JADX INFO: loaded from: classes2.dex */
public class FocusClusterLayout extends android.widget.FrameLayout {
    private int a;

    public FocusClusterLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 0;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, defpackage.oyi.b, i, i2);
        try {
            defpackage.oyb oybVarB = defpackage.oyb.b(typedArrayObtainStyledAttributes.getInteger(0, 0), defpackage.oyb.NONE);
            int integer = typedArrayObtainStyledAttributes.getInteger(1, 0);
            if (integer != 0 && integer != 1) {
                throw new java.lang.IllegalArgumentException("Could not resolve requestFocusDescendantFocusability");
            }
            this.a = integer;
            typedArrayObtainStyledAttributes.recycle();
            defpackage.rsv.b(this);
            defpackage.rsv.c(this, new defpackage.rsv(defpackage.oyb.a(oybVarB)));
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        if (this.a == 1) {
            if (i == 33 || i == 130 || i == 17) {
                arrayList.add(this);
            } else if (i == 66) {
                i = 66;
                arrayList.add(this);
            }
        }
        super.addFocusables(arrayList, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (this.a != 1) {
            return super.requestFocus(i, rect);
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(262144);
        boolean zRequestFocus = super.requestFocus(i, rect);
        setDescendantFocusability(descendantFocusability);
        return zRequestFocus;
    }

    public FocusClusterLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public FocusClusterLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public FocusClusterLayout(android.content.Context context) {
        this(context, null, 0, 0);
    }
}
