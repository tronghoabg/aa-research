package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.n;
import com.google.android.material.k.ac;
import com.google.android.material.k.f;
import com.google.android.material.k.r;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, ac {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6336a = {R.attr.state_checkable};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f6337b = {R.attr.state_checked};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6338c = {R.attr.state_hovered};

    /* renamed from: d, reason: collision with root package name */
    private final c f6339d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6340e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6341f;

    public MaterialCardView(Context context, AttributeSet attributeSet, int i2) {
        super(com.google.android.material.theme.a.a.a(context, attributeSet, i2, com.waze.R.style.Widget_MaterialComponents_CardView), attributeSet, i2);
        this.f6341f = false;
        this.f6340e = true;
        TypedArray typedArrayA = n.a(getContext(), attributeSet, d.f6355a, i2, com.waze.R.style.Widget_MaterialComponents_CardView, new int[0]);
        c cVar = new c(this, attributeSet, i2);
        this.f6339d = cVar;
        cVar.j(super.getCardBackgroundColor());
        cVar.n(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        cVar.h(typedArrayA);
        typedArrayA.recycle();
    }

    public final r b() {
        return this.f6339d.e().a();
    }

    final void c(int i2, int i3, int i4, int i5) {
        super.setContentPadding(i2, i3, i4, i5);
    }

    final void d(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.google.android.material.k.ac
    public final void e(r rVar) {
        RectF rectF = new RectF();
        c cVar = this.f6339d;
        rectF.set(cVar.d().getBounds());
        setClipToOutline(rVar.o(rectF));
        cVar.m(rVar);
    }

    public final boolean f() {
        c cVar = this.f6339d;
        return cVar != null && cVar.t();
    }

    @Override // androidx.cardview.widget.CardView
    public final ColorStateList getCardBackgroundColor() {
        return this.f6339d.b();
    }

    @Override // androidx.cardview.widget.CardView
    public final int getContentPaddingBottom() {
        return this.f6339d.c().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public final int getContentPaddingLeft() {
        return this.f6339d.c().left;
    }

    @Override // androidx.cardview.widget.CardView
    public final int getContentPaddingRight() {
        return this.f6339d.c().right;
    }

    @Override // androidx.cardview.widget.CardView
    public final int getContentPaddingTop() {
        return this.f6339d.c().top;
    }

    @Override // androidx.cardview.widget.CardView
    public final float getRadius() {
        return this.f6339d.a();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f6341f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c cVar = this.f6339d;
        cVar.o();
        f.c(this, cVar.d());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 8);
        if (f()) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6336a);
        }
        if (this.f6341f) {
            mergeDrawableStates(iArrOnCreateDrawableState, f6337b);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                mergeDrawableStates(iArrOnCreateDrawableState, PRESSED_STATE_SET);
            }
            if (isHovered()) {
                mergeDrawableStates(iArrOnCreateDrawableState, f6338c);
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
        accessibilityEvent.setChecked(this.f6341f);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f6341f);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f6339d.i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.f6340e) {
            c cVar = this.f6339d;
            if (!cVar.s()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                cVar.u();
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void setCardBackgroundColor(int i2) {
        this.f6339d.j(ColorStateList.valueOf(i2));
    }

    @Override // androidx.cardview.widget.CardView
    public final void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f6339d.q();
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (this.f6341f != z) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        c cVar = this.f6339d;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void setContentPadding(int i2, int i3, int i4, int i5) {
        this.f6339d.n(i2, i3, i4, i5);
    }

    @Override // androidx.cardview.widget.CardView
    public final void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f6339d.r();
    }

    @Override // androidx.cardview.widget.CardView
    public final void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        c cVar = this.f6339d;
        cVar.r();
        cVar.p();
    }

    @Override // androidx.cardview.widget.CardView
    public final void setRadius(float f2) {
        super.setRadius(f2);
        this.f6339d.l(f2);
    }

    @Override // androidx.cardview.widget.CardView
    public final void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        c cVar = this.f6339d;
        cVar.r();
        cVar.p();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        if (f() && isEnabled()) {
            this.f6341f = !this.f6341f;
            refreshDrawableState();
            c cVar = this.f6339d;
            cVar.g();
            cVar.k(this.f6341f, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f6339d.j(colorStateList);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.waze.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
