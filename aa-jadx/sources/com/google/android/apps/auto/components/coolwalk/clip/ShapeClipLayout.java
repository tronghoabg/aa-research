package com.google.android.apps.auto.components.coolwalk.clip;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u0002\b\u000b¢\u0006\u0004\b\t\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/clip/ShapeClipLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lkotlin/jvm/JvmOverloads;", "bgDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "setShape", "", "shape", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setBackgroundColor", "color", "setBackgroundResource", "resid", "setElevation", "elevation", "", "java.com.google.android.apps.auto.components.coolwalk.clip_clip"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ShapeClipLayout extends android.widget.FrameLayout {
    private final defpackage.wvd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        context.getClass();
        defpackage.wvd wvdVar = new defpackage.wvd(context, attributeSet, i, i2);
        wvdVar.O(android.content.res.ColorStateList.valueOf(0));
        wvdVar.U(android.content.res.ColorStateList.valueOf(0));
        super.setBackground(wvdVar);
        this.a = wvdVar;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.ksu.a, i, i2);
        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
        java.lang.Integer numValueOf = typedValuePeekValue != null ? java.lang.Integer.valueOf(typedValuePeekValue.type) : null;
        if (numValueOf != null && numValueOf.intValue() == 5) {
            wvdVar.L(new defpackage.wuv(android.util.TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, context.getResources().getDisplayMetrics())));
        } else if (numValueOf != null && numValueOf.intValue() == 6) {
            wvdVar.L(new defpackage.wvf(typedValuePeekValue.getFraction(1.0f, 1.0f)));
        }
        typedArrayObtainStyledAttributes.recycle();
        super.setElevation(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        setClipToOutline(true);
    }

    @Override // android.view.View
    public final void setBackground(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ ShapeClipLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, defpackage.affu affuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
