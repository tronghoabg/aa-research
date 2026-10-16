package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class kwi extends DrawableWrapper {
    public static final /* synthetic */ int c = 0;
    public final kwh a;
    public final kwh b;
    private final int d;

    public kwi(Context context, wuk wukVar, Rect rect, Rect rect2, ColorStateList colorStateList, ColorStateList colorStateList2) throws Resources.NotFoundException {
        ColorStateList colorStateList3;
        kwh[] kwhVarArr = new kwh[2];
        if (colorStateList2 == null) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(0);
            colorStateListValueOf.getClass();
            colorStateList3 = colorStateListValueOf;
        } else {
            colorStateList3 = colorStateList2;
        }
        Resources resources = context.getResources();
        leg legVar = leh.a;
        legVar.a();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.gearhead_inner_focus_ring_stroke_width_hovered);
        Resources resources2 = context.getResources();
        legVar.a();
        kwh kwhVar = new kwh(context, wukVar, colorStateList3, dimensionPixelSize, resources2.getDimensionPixelSize(R.dimen.gearhead_inner_focus_ring_stroke_width_focused));
        legVar.a();
        kwhVarArr[0] = kwhVar;
        kwhVarArr[1] = new kwh(context, wukVar, colorStateList, context.getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_hovered), context.getResources().getDimensionPixelSize(R.dimen.gearhead_focus_ring_stroke_width_focused));
        super(new LayerDrawable(kwhVarArr));
        Drawable drawable = e().getDrawable(1);
        drawable.getClass();
        this.a = (kwh) drawable;
        Drawable drawable2 = e().getDrawable(0);
        drawable2.getClass();
        this.b = (kwh) drawable2;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.coolwalk_inner_ring_size);
        this.d = dimensionPixelSize2;
        int i = rect != null ? rect.left : 0;
        int i2 = rect != null ? rect.top : 0;
        int i3 = rect != null ? rect.right : 0;
        int i4 = rect != null ? rect.bottom : 0;
        Rect rect3 = rect2 == null ? new Rect(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2) : rect2;
        int i5 = i;
        int i6 = i4;
        e().setLayerInset(1, i5, i2, i3, i6);
        e().setLayerInset(0, rect3.left + i5, i2 + rect3.top, i3 + rect3.right, i6 + rect3.bottom);
    }

    private final LayerDrawable e() {
        Drawable drawable = getDrawable();
        drawable.getClass();
        return (LayerDrawable) drawable;
    }

    public final wuk a() {
        wuk wukVarFD = this.a.fD();
        wukVarFD.getClass();
        return wukVarFD;
    }

    public final void b(ColorStateList colorStateList) {
        this.a.U(colorStateList);
    }

    public final void c(ColorStateList colorStateList) {
        this.b.U(colorStateList);
    }

    public final void d(wuk wukVar) {
        wukVar.getClass();
        kwh kwhVar = this.a;
        kwhVar.d(wukVar);
        leh.a.a();
        this.b.d(wukVar.c(kwhVar.x() - this.d));
    }

    @Override // android.graphics.drawable.DrawableWrapper
    public final void setDrawable(Drawable drawable) {
        if (getDrawable() != null) {
            throw new UnsupportedOperationException();
        }
        super.setDrawable(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kwi(Context context, wuk wukVar, AttributeSet attributeSet) throws Resources.NotFoundException {
        Rect rect;
        Rect rect2;
        Rect rect3;
        Rect rect4;
        context.getClass();
        wukVar.getClass();
        if (attributeSet == null) {
            rect2 = null;
        } else {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kwk.a, 0, 0);
            if (!typedArrayObtainStyledAttributes.hasValue(7) && !typedArrayObtainStyledAttributes.hasValue(5) && !typedArrayObtainStyledAttributes.hasValue(6) && !typedArrayObtainStyledAttributes.hasValue(4)) {
                int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
                rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            } else {
                rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            rect2 = rect;
        }
        if (attributeSet == null) {
            rect4 = null;
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, kwk.a, 0, 0);
            if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                int dimensionPixelOffset2 = typedArrayObtainStyledAttributes2.getDimensionPixelOffset(1, 0);
                rect3 = new Rect(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            } else {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.coolwalk_inner_ring_size);
                rect3 = new Rect(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            }
            typedArrayObtainStyledAttributes2.recycle();
            rect4 = rect3;
        }
        int[] iArr = kwk.a;
        this(context, wukVar, rect2, rect4, kzd.a(attributeSet, context, iArr, 0), kzd.a(attributeSet, context, iArr, 2));
    }
}
