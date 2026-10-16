package com.google.android.apps.auto.components.coolwalk.focusring;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;
import defpackage.kwi;
import defpackage.kwj;
import defpackage.kwk;
import defpackage.wuk;
import defpackage.wuv;

/* loaded from: classes2.dex */
public class TappableRegion extends View implements wuv, kwj {
    public final kwi a;
    private wuk b;
    private boolean c;

    public TappableRegion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, R.style.Widget_Gearhead_Coolwalk_TappableRegion);
        this.c = true;
        this.b = new wuk(wuk.l(context, attributeSet, 0, R.style.Widget_Gearhead_Coolwalk_TappableRegion));
        kwi kwiVar = new kwi(context, this.b, attributeSet);
        this.a = kwiVar;
        setForeground(kwiVar);
        if (this.c) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kwk.b, 0, R.style.Widget_Gearhead_Coolwalk_TappableRegion);
            try {
                ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(6);
                colorStateList = colorStateList == null ? context.getColorStateList(R.color.coolwalk_tappable_region_ripple_color_selector) : colorStateList;
                typedArrayObtainStyledAttributes.recycle();
                super.setBackground(new RippleDrawable(colorStateList, null, new ColorDrawable(-1)));
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    @Override // defpackage.kwj
    public final kwi c() {
        return this.a;
    }

    @Override // defpackage.wuv
    public final void d(wuk wukVar) {
        this.b = wukVar;
        this.a.d(wukVar);
    }

    @Override // defpackage.wuv
    public final wuk fD() {
        throw null;
    }

    @Override // android.view.View
    public final boolean hasFocus() {
        return getParent() instanceof FocusInterceptor ? ((FocusInterceptor) getParent()).hasFocus() : super.hasFocus();
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        FocusInterceptor.b(this);
    }

    @Override // android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        return getParent() instanceof FocusInterceptor ? ((FocusInterceptor) getParent()).requestFocus(i, rect) : super.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        if (!this.c) {
            super.setBackground(drawable);
            return;
        }
        if (drawable != getBackground()) {
            this.c = false;
            super.setBackground(drawable);
        } else if (drawable != null) {
            getBackground().setState(drawable.getState());
        }
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

    @Override // android.view.View
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
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (getParent() instanceof FocusInterceptor) {
            throw new IllegalStateException("LayoutParams should not be set directly on TappableRegion. Call setLayoutParamsCompat() instead");
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

    public TappableRegion(Context context) {
        this(context, null);
    }
}
