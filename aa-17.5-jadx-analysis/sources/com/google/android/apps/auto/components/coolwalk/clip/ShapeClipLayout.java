package com.google.android.apps.auto.components.coolwalk.clip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.afeu;
import defpackage.ksm;
import defpackage.wtw;
import defpackage.wue;
import defpackage.wug;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/clip/ShapeClipLayout;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "bgDrawable", "Lcom/google/android/material/shape/MaterialShapeDrawable;", "setShape", "", "shape", "Lcom/google/android/material/shape/ShapeAppearanceModel;", "setBackground", "background", "Landroid/graphics/drawable/Drawable;", "setBackgroundColor", "color", "setBackgroundResource", "resid", "setElevation", "elevation", "", "java.com.google.android.apps.auto.components.coolwalk.clip_clip"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ShapeClipLayout extends FrameLayout {
    private final wue a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        context.getClass();
        wue wueVar = new wue(context, attributeSet, i, i2);
        wueVar.O(ColorStateList.valueOf(0));
        wueVar.U(ColorStateList.valueOf(0));
        super.setBackground(wueVar);
        this.a = wueVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ksm.a, i, i2);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(0);
        Integer numValueOf = typedValuePeekValue != null ? Integer.valueOf(typedValuePeekValue.type) : null;
        if (numValueOf != null && numValueOf.intValue() == 5) {
            wueVar.L(new wtw(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, context.getResources().getDisplayMetrics())));
        } else if (numValueOf != null && numValueOf.intValue() == 6) {
            wueVar.L(new wug(typedValuePeekValue.getFraction(1.0f, 1.0f)));
        }
        typedArrayObtainStyledAttributes.recycle();
        super.setElevation(BitmapDescriptorFactory.HUE_RED);
        setClipToOutline(true);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShapeClipLayout(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    public /* synthetic */ ShapeClipLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, afeu afeuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
