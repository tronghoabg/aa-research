package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kwo extends android.graphics.drawable.DrawableWrapper {
    public static final /* synthetic */ int c = 0;
    public final defpackage.kwn a;
    public final defpackage.kwn b;
    private final int d;

    public kwo(android.content.Context context, defpackage.wvi wviVar, android.graphics.Rect rect, android.graphics.Rect rect2, android.content.res.ColorStateList colorStateList, android.content.res.ColorStateList colorStateList2) {
        android.content.res.ColorStateList colorStateList3;
        defpackage.kwn[] kwnVarArr = new defpackage.kwn[2];
        if (colorStateList2 == null) {
            android.content.res.ColorStateList colorStateListValueOf = android.content.res.ColorStateList.valueOf(0);
            colorStateListValueOf.getClass();
            colorStateList3 = colorStateListValueOf;
        } else {
            colorStateList3 = colorStateList2;
        }
        android.content.res.Resources resources = context.getResources();
        defpackage.lel lelVar = defpackage.lem.a;
        lelVar.a();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_inner_focus_ring_stroke_width_hovered);
        android.content.res.Resources resources2 = context.getResources();
        lelVar.a();
        defpackage.kwn kwnVar = new defpackage.kwn(context, wviVar, colorStateList3, dimensionPixelSize, resources2.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_inner_focus_ring_stroke_width_focused));
        lelVar.a();
        kwnVarArr[0] = kwnVar;
        kwnVarArr[1] = new defpackage.kwn(context, wviVar, colorStateList, context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_focus_ring_stroke_width_hovered), context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.gearhead_focus_ring_stroke_width_focused));
        super(new android.graphics.drawable.LayerDrawable(kwnVarArr));
        android.graphics.drawable.Drawable drawable = e().getDrawable(1);
        drawable.getClass();
        this.a = (defpackage.kwn) drawable;
        android.graphics.drawable.Drawable drawable2 = e().getDrawable(0);
        drawable2.getClass();
        this.b = (defpackage.kwn) drawable2;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.coolwalk_inner_ring_size);
        this.d = dimensionPixelSize2;
        int i = rect != null ? rect.left : 0;
        int i2 = rect != null ? rect.top : 0;
        int i3 = rect != null ? rect.right : 0;
        int i4 = rect != null ? rect.bottom : 0;
        android.graphics.Rect rect3 = rect2 == null ? new android.graphics.Rect(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2) : rect2;
        int i5 = i;
        int i6 = i4;
        e().setLayerInset(1, i5, i2, i3, i6);
        e().setLayerInset(0, rect3.left + i5, i2 + rect3.top, i3 + rect3.right, i6 + rect3.bottom);
    }

    private final android.graphics.drawable.LayerDrawable e() {
        android.graphics.drawable.Drawable drawable = getDrawable();
        drawable.getClass();
        return (android.graphics.drawable.LayerDrawable) drawable;
    }

    public final defpackage.wvi a() {
        defpackage.wvi wviVarEL = this.a.eL();
        wviVarEL.getClass();
        return wviVarEL;
    }

    public final void b(android.content.res.ColorStateList colorStateList) {
        this.a.U(colorStateList);
    }

    public final void c(android.content.res.ColorStateList colorStateList) {
        this.b.U(colorStateList);
    }

    public final void d(defpackage.wvi wviVar) {
        wviVar.getClass();
        defpackage.kwn kwnVar = this.a;
        kwnVar.d(wviVar);
        defpackage.lem.a.a();
        this.b.d(wviVar.c(kwnVar.x() - this.d));
    }

    @Override // android.graphics.drawable.DrawableWrapper
    public final void setDrawable(android.graphics.drawable.Drawable drawable) {
        if (getDrawable() != null) {
            throw new java.lang.UnsupportedOperationException();
        }
        super.setDrawable(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kwo(android.content.Context context, defpackage.wvi wviVar, android.util.AttributeSet attributeSet) {
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        android.graphics.Rect rect3;
        android.graphics.Rect rect4;
        context.getClass();
        wviVar.getClass();
        if (attributeSet == null) {
            rect2 = null;
        } else {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.kwq.a, 0, 0);
            if (!typedArrayObtainStyledAttributes.hasValue(7) && !typedArrayObtainStyledAttributes.hasValue(5) && !typedArrayObtainStyledAttributes.hasValue(6) && !typedArrayObtainStyledAttributes.hasValue(4)) {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
                rect = new android.graphics.Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            } else {
                rect = new android.graphics.Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            rect2 = rect;
        }
        if (attributeSet == null) {
            rect4 = null;
        } else {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.kwq.a, 0, 0);
            if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                int dimensionPixelOffset2 = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(1, 0);
                rect3 = new android.graphics.Rect(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            } else {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.coolwalk_inner_ring_size);
                rect3 = new android.graphics.Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes2.recycle();
            rect4 = rect3;
        }
        int[] iArr = defpackage.kwq.a;
        this(context, wviVar, rect2, rect4, defpackage.kzi.a(attributeSet, context, iArr, 0), defpackage.kzi.a(attributeSet, context, iArr, 2));
    }
}
