package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import defpackage.emq;
import defpackage.wmo;
import defpackage.wmp;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuk;
import defpackage.wuv;
import defpackage.wux;
import defpackage.wxp;
import defpackage.yo;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, wuv {
    private static final int[] f = {R.attr.state_checkable};
    private static final int[] i = {R.attr.state_checked};
    private static final int[] j = {R.attr.state_hovered};
    public final wmo g;
    public boolean h;
    private boolean k;

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        wux wuxVarG;
        super(wxp.a(context, attributeSet, i2, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_CardView), attributeSet, i2);
        this.h = false;
        this.k = true;
        TypedArray typedArrayA = wqr.a(getContext(), attributeSet, wmp.a, i2, com.google.android.projection.gearhead.R.style.Widget_MaterialComponents_CardView, new int[0]);
        wmo wmoVar = new wmo(this, attributeSet, i2);
        this.g = wmoVar;
        wmoVar.e(((yo) this.e.a).e);
        wmoVar.c.set(this.c.left, this.c.top, this.c.right, this.c.bottom);
        wmoVar.i();
        wmoVar.p = wub.h(wmoVar.b.getContext(), typedArrayA, 11);
        if (wmoVar.p == null) {
            wmoVar.p = ColorStateList.valueOf(-1);
        }
        wmoVar.j = typedArrayA.getDimensionPixelSize(12, 0);
        boolean z = typedArrayA.getBoolean(0, false);
        wmoVar.u = z;
        wmoVar.b.setLongClickable(z);
        wmoVar.n = wub.h(wmoVar.b.getContext(), typedArrayA, 6);
        Drawable drawableI = wub.i(wmoVar.b.getContext(), typedArrayA, 2);
        if (drawableI != null) {
            wmoVar.l = drawableI.mutate();
            wmoVar.l.setTintList(wmoVar.n);
            wmoVar.f(wmoVar.b.h, false);
        } else {
            wmoVar.l = wmo.a;
        }
        LayerDrawable layerDrawable = wmoVar.r;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(com.google.android.projection.gearhead.R.id.mtrl_card_checked_layer_id, wmoVar.l);
        }
        wmoVar.h = typedArrayA.getDimensionPixelSize(5, 0);
        wmoVar.g = typedArrayA.getDimensionPixelSize(4, 0);
        wmoVar.i = typedArrayA.getInteger(3, 8388661);
        wmoVar.m = wub.h(wmoVar.b.getContext(), typedArrayA, 7);
        if (wmoVar.m == null) {
            wmoVar.m = ColorStateList.valueOf(woy.m(wmoVar.b, com.google.android.projection.gearhead.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListH = wub.h(wmoVar.b.getContext(), typedArrayA, 1);
        wmoVar.e.O(colorStateListH == null ? ColorStateList.valueOf(0) : colorStateListH);
        Drawable drawable = wmoVar.q;
        if (drawable != null) {
            ((RippleDrawable) drawable).setColor(wmoVar.m);
        }
        wmoVar.d.N(wmoVar.b.e.b.getElevation());
        wmoVar.j();
        super.setBackgroundDrawable(wmoVar.d(wmoVar.d));
        wmoVar.k = wmoVar.o() ? wmoVar.c() : wmoVar.e;
        wmoVar.b.setForeground(wmoVar.d(wmoVar.k));
        if (wmoVar.f == -1.0f && (wuxVarG = wux.g(wmoVar.b.getContext(), typedArrayA, 8)) != null) {
            emq emqVarD = woy.D(wmoVar.b.getContext(), com.google.android.projection.gearhead.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            wmoVar.d.M(emqVarD);
            wmoVar.e.M(emqVarD);
            wue wueVar = wmoVar.s;
            if (wueVar != null) {
                wueVar.M(emqVarD);
            }
            wmoVar.g(wuxVarG);
        }
        typedArrayA.recycle();
    }

    public void d(wuk wukVar) {
        RectF rectF = new RectF();
        wmo wmoVar = this.g;
        rectF.set(wmoVar.d.getBounds());
        setClipToOutline(wukVar.j(rectF));
        wmoVar.g(wukVar);
    }

    public final ColorStateList e() {
        return this.g.d.D();
    }

    public final void f(ColorStateList colorStateList) {
        this.g.e(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public final void fB(int i2) {
        this.g.e(ColorStateList.valueOf(i2));
    }

    @Override // defpackage.wuv
    public final wuk fD() {
        return this.g.o.a();
    }

    public final boolean g() {
        wmo wmoVar = this.g;
        return wmoVar != null && wmoVar.u;
    }

    public final void h() {
        yo yoVar = (yo) this.e.a;
        if (yoVar.a != BitmapDescriptorFactory.HUE_RED) {
            yoVar.a = BitmapDescriptorFactory.HUE_RED;
            yoVar.b(null);
            yoVar.invalidateSelf();
        }
        wmo wmoVar = this.g;
        wmoVar.f = BitmapDescriptorFactory.HUE_RED;
        wmoVar.g(wmoVar.o.a().c(BitmapDescriptorFactory.HUE_RED));
        wmoVar.k.invalidateSelf();
        if (wmoVar.n() || wmoVar.m()) {
            wmoVar.i();
        }
        if (wmoVar.n()) {
            if (!wmoVar.t) {
                super.setBackgroundDrawable(wmoVar.d(wmoVar.d));
            }
            wmoVar.b.setForeground(wmoVar.d(wmoVar.k));
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wmo wmoVar = this.g;
        wmoVar.h();
        wub.e(this, wmoVar.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 8);
        if (g()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f);
        }
        if (this.h) {
            mergeDrawableStates(iArrOnCreateDrawableState, i);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                mergeDrawableStates(iArrOnCreateDrawableState, PRESSED_STATE_SET);
            }
            if (isHovered()) {
                mergeDrawableStates(iArrOnCreateDrawableState, j);
            }
            if (isEnabled()) {
                mergeDrawableStates(iArrOnCreateDrawableState, ENABLED_STATE_SET);
            }
            if (isFocused()) {
                mergeDrawableStates(iArrOnCreateDrawableState, FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                mergeDrawableStates(iArrOnCreateDrawableState, SELECTED_STATE_SET);
            }
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.h);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.h);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        int iCeil;
        int iCeil2;
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        wmo wmoVar = this.g;
        if (wmoVar.r != null) {
            MaterialCardView materialCardView = wmoVar.b;
            if (materialCardView.a) {
                float fB = wmoVar.b();
                iCeil = (int) Math.ceil(fB + fB);
                float fA = wmoVar.a();
                iCeil2 = (int) Math.ceil(fA + fA);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i4 = wmoVar.l() ? ((measuredWidth - wmoVar.g) - wmoVar.h) - iCeil2 : wmoVar.g;
            int i5 = wmoVar.k() ? wmoVar.g : ((measuredHeight - wmoVar.g) - wmoVar.h) - iCeil;
            int i6 = wmoVar.l() ? wmoVar.g : ((measuredWidth - wmoVar.g) - wmoVar.h) - iCeil2;
            int i7 = wmoVar.k() ? ((measuredHeight - wmoVar.g) - wmoVar.h) - iCeil : wmoVar.g;
            int layoutDirection = materialCardView.getLayoutDirection();
            wmoVar.r.setLayerInset(2, layoutDirection != 1 ? i4 : i6, i7, layoutDirection == 1 ? i4 : i6, i5);
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.k) {
            wmo wmoVar = this.g;
            if (!wmoVar.t) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                wmoVar.t = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.h != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        wmo wmoVar = this.g;
        if (wmoVar != null) {
            wmoVar.h();
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (g() && isEnabled()) {
            this.h = !this.h;
            refreshDrawableState();
            wmo wmoVar = this.g;
            Drawable drawable = wmoVar.q;
            if (drawable != null) {
                Rect bounds = drawable.getBounds();
                int i2 = bounds.bottom;
                wmoVar.q.setBounds(bounds.left, bounds.top, bounds.right, i2 - 1);
                wmoVar.q.setBounds(bounds.left, bounds.top, bounds.right, i2);
            }
            wmoVar.f(this.h, true);
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
