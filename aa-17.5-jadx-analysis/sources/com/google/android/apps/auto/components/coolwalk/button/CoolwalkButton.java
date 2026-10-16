package com.google.android.apps.auto.components.coolwalk.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.auto.components.coolwalk.focusring.FocusInterceptor;
import com.google.android.material.button.MaterialButton;
import com.google.android.projection.gearhead.R;
import defpackage.ksl;
import defpackage.kwi;
import defpackage.kwj;
import defpackage.spu;
import defpackage.wuk;

/* loaded from: classes2.dex */
public class CoolwalkButton extends MaterialButton implements kwj {
    public final kwi b;
    private final LayerDrawable c;

    public CoolwalkButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kwi kwiVar = new kwi(getContext(), fD(), attributeSet);
        this.b = kwiVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ksl.a);
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            ColorStateList colorStateListAM = spu.aM(getContext(), R.attr.colorOnContainer);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(6, false);
            colorStateList = colorStateList == null ? colorStateListAM : colorStateList;
            if (z) {
                kwiVar.c(colorStateList);
            } else {
                kwiVar.c(null);
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        Drawable foreground = super.getForeground();
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{foreground == null ? new ColorDrawable(0) : foreground, kwiVar});
        this.c = layerDrawable;
        super.setForeground(layerDrawable);
    }

    @Override // defpackage.kwj
    public final kwi c() {
        return this.b;
    }

    @Override // com.google.android.material.button.MaterialButton, defpackage.wuv
    public final void d(wuk wukVar) {
        wuk wukVarFD = fD();
        super.d(wukVar);
        kwi kwiVar = this.b;
        if (kwiVar.a() == wukVarFD) {
            kwiVar.d(wukVar);
        }
    }

    @Override // android.view.View
    public final Drawable getForeground() {
        return this.c.getDrawable(0);
    }

    @Override // android.view.View
    public final boolean hasFocus() {
        return getParent() instanceof FocusInterceptor ? ((FocusInterceptor) getParent()).hasFocus() : super.hasFocus();
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FocusInterceptor.b(this);
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return getParent() instanceof FocusInterceptor ? ((FocusInterceptor) getParent()).requestFocus(i, rect) : super.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        FocusInterceptor.a(this);
    }

    @Override // android.view.View
    public final void setDuplicateParentStateEnabled(boolean z) {
        super.setDuplicateParentStateEnabled(z);
        FocusInterceptor.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        FocusInterceptor.a(this);
    }

    @Override // android.view.View
    public final void setFocusable(int i) {
        super.setFocusable(i);
        FocusInterceptor.a(this);
    }

    @Override // android.view.View
    public final void setForeground(Drawable drawable) {
        if (drawable == null) {
            drawable = new ColorDrawable(0);
        }
        LayerDrawable layerDrawable = this.c;
        if (layerDrawable == null) {
            super.setForeground(drawable);
        } else {
            layerDrawable.setDrawable(0, drawable);
            super.setForeground(layerDrawable);
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (getParent() instanceof FocusInterceptor) {
            throw new IllegalStateException("LayoutParams should not be set directly on CoolwalkButton. Call setLayoutParamsCompat() instead");
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (getParent() instanceof FocusInterceptor) {
            ((FocusInterceptor) getParent()).setVisibility(i);
        }
        super.setVisibility(i);
    }

    public CoolwalkButton(Context context) {
        this(context, null);
    }
}
