package com.google.android.material.button;

import A.e0;
import Fe.g;
import O7.a;
import O7.b;
import O7.c;
import Va.M6;
import W7.k;
import Y0.e;
import a8.AbstractC1340a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import c8.C1577a;
import c8.C1586j;
import c8.C1587k;
import c8.u;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, u {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f26843r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f26844s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f26845d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f26846e;

    /* renamed from: f, reason: collision with root package name */
    public a f26847f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f26848g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f26849h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f26850i;

    /* renamed from: j, reason: collision with root package name */
    public String f26851j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f26852l;

    /* renamed from: m, reason: collision with root package name */
    public int f26853m;

    /* renamed from: n, reason: collision with root package name */
    public int f26854n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26855o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26856p;

    /* renamed from: q, reason: collision with root package name */
    public int f26857q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(h8.a.a(context, attributeSet, com.wynauto.wyn.R.attr.materialButtonStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Button), attributeSet, com.wynauto.wyn.R.attr.materialButtonStyle);
        this.f26846e = new LinkedHashSet();
        this.f26855o = false;
        this.f26856p = false;
        Context context2 = getContext();
        TypedArray typedArrayF = k.f(context2, attributeSet, I7.a.f5407i, com.wynauto.wyn.R.attr.materialButtonStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f26854n = typedArrayF.getDimensionPixelSize(12, 0);
        int i5 = typedArrayF.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f26848g = k.g(i5, mode);
        this.f26849h = Ba.c.w(getContext(), typedArrayF, 14);
        this.f26850i = Ba.c.z(getContext(), typedArrayF, 10);
        this.f26857q = typedArrayF.getInteger(11, 1);
        this.k = typedArrayF.getDimensionPixelSize(13, 0);
        c cVar = new c(this, C1587k.b(context2, attributeSet, com.wynauto.wyn.R.attr.materialButtonStyle, com.wynauto.wyn.R.style.Widget_MaterialComponents_Button).a());
        this.f26845d = cVar;
        cVar.f8891c = typedArrayF.getDimensionPixelOffset(1, 0);
        cVar.f8892d = typedArrayF.getDimensionPixelOffset(2, 0);
        cVar.f8893e = typedArrayF.getDimensionPixelOffset(3, 0);
        cVar.f8894f = typedArrayF.getDimensionPixelOffset(4, 0);
        if (typedArrayF.hasValue(8)) {
            int dimensionPixelSize = typedArrayF.getDimensionPixelSize(8, -1);
            cVar.f8895g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            C1586j c1586jE = cVar.f8890b.e();
            c1586jE.f19755e = new C1577a(f10);
            c1586jE.f19756f = new C1577a(f10);
            c1586jE.f19757g = new C1577a(f10);
            c1586jE.f19758h = new C1577a(f10);
            cVar.c(c1586jE.a());
            cVar.f8903p = true;
        }
        cVar.f8896h = typedArrayF.getDimensionPixelSize(20, 0);
        cVar.f8897i = k.g(typedArrayF.getInt(7, -1), mode);
        cVar.f8898j = Ba.c.w(getContext(), typedArrayF, 6);
        cVar.k = Ba.c.w(getContext(), typedArrayF, 19);
        cVar.f8899l = Ba.c.w(getContext(), typedArrayF, 16);
        cVar.f8904q = typedArrayF.getBoolean(5, false);
        cVar.f8907t = typedArrayF.getDimensionPixelSize(9, 0);
        cVar.f8905r = typedArrayF.getBoolean(21, true);
        WeakHashMap weakHashMap = S.f38779a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayF.hasValue(0)) {
            cVar.f8902o = true;
            setSupportBackgroundTintList(cVar.f8898j);
            setSupportBackgroundTintMode(cVar.f8897i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f8891c, paddingTop + cVar.f8893e, paddingEnd + cVar.f8892d, paddingBottom + cVar.f8894f);
        typedArrayF.recycle();
        setCompoundDrawablePadding(this.f26854n);
        c(this.f26850i != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (int i5 = 0; i5 < lineCount; i5++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i5));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f26845d;
        return (cVar == null || cVar.f8902o) ? false : true;
    }

    public final void b() {
        int i5 = this.f26857q;
        boolean z2 = true;
        if (i5 != 1 && i5 != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f26850i, null, null, null);
            return;
        }
        if (i5 == 3 || i5 == 4) {
            setCompoundDrawablesRelative(null, null, this.f26850i, null);
        } else if (i5 == 16 || i5 == 32) {
            setCompoundDrawablesRelative(null, this.f26850i, null, null);
        }
    }

    public final void c(boolean z2) {
        Drawable drawable = this.f26850i;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f26850i = drawableMutate;
            drawableMutate.setTintList(this.f26849h);
            PorterDuff.Mode mode = this.f26848g;
            if (mode != null) {
                this.f26850i.setTintMode(mode);
            }
            int intrinsicWidth = this.k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f26850i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f26850i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f26850i;
            int i5 = this.f26852l;
            int i10 = this.f26853m;
            drawable2.setBounds(i5, i10, intrinsicWidth + i5, intrinsicHeight + i10);
            this.f26850i.setVisible(true, z2);
        }
        if (z2) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.f26857q;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f26850i) || (((i11 == 3 || i11 == 4) && drawable5 != this.f26850i) || ((i11 == 16 || i11 == 32) && drawable4 != this.f26850i))) {
            b();
        }
    }

    public final void d(int i5, int i10) {
        if (this.f26850i == null || getLayout() == null) {
            return;
        }
        int i11 = this.f26857q;
        if (!(i11 == 1 || i11 == 2) && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.f26852l = 0;
                if (i11 == 16) {
                    this.f26853m = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.k;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f26850i.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f26854n) - getPaddingBottom()) / 2);
                if (this.f26853m != iMax) {
                    this.f26853m = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f26853m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f26857q;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f26852l = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.k;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f26850i.getIntrinsicWidth();
        }
        int textLayoutWidth = i5 - getTextLayoutWidth();
        WeakHashMap weakHashMap = S.f38779a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - intrinsicWidth) - this.f26854n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f26857q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f26852l != paddingEnd) {
            this.f26852l = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f26851j)) {
            return this.f26851j;
        }
        c cVar = this.f26845d;
        return ((cVar == null || !cVar.f8904q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f26845d.f8895g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f26850i;
    }

    public int getIconGravity() {
        return this.f26857q;
    }

    public int getIconPadding() {
        return this.f26854n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.f26849h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f26848g;
    }

    public int getInsetBottom() {
        return this.f26845d.f8894f;
    }

    public int getInsetTop() {
        return this.f26845d.f8893e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f26845d.f8899l;
        }
        return null;
    }

    public C1587k getShapeAppearanceModel() {
        if (a()) {
            return this.f26845d.f8890b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f26845d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f26845d.f8896h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f26845d.f8898j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f26845d.f8897i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f26855o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            g.K(this, this.f26845d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i5) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i5 + 2);
        c cVar = this.f26845d;
        if (cVar != null && cVar.f8904q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26843r);
        }
        if (this.f26855o) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f26844s);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f26855o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f26845d;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f8904q);
        accessibilityNodeInfo.setChecked(this.f26855o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i5, int i10, int i11, int i12) {
        super.onLayout(z2, i5, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f44826a);
        setChecked(bVar.f8888c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f8888c = this.f26855o;
        return bVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i5, int i10, int i11) {
        super.onTextChanged(charSequence, i5, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f26845d.f8905r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f26850i != null) {
            if (this.f26850i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f26851j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i5) {
        if (!a()) {
            super.setBackgroundColor(i5);
            return;
        }
        c cVar = this.f26845d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i5);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f26845d;
        cVar.f8902o = true;
        ColorStateList colorStateList = cVar.f8898j;
        MaterialButton materialButton = cVar.f8889a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.f8897i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i5) {
        setBackgroundDrawable(i5 != 0 ? g.B(getContext(), i5) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (a()) {
            this.f26845d.f8904q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        c cVar = this.f26845d;
        if (cVar == null || !cVar.f8904q || !isEnabled() || this.f26855o == z2) {
            return;
        }
        this.f26855o = z2;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z10 = this.f26855o;
            if (!materialButtonToggleGroup.f26863f) {
                materialButtonToggleGroup.b(getId(), z10);
            }
        }
        if (this.f26856p) {
            return;
        }
        this.f26856p = true;
        Iterator it = this.f26846e.iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        this.f26856p = false;
    }

    public void setCornerRadius(int i5) {
        if (a()) {
            c cVar = this.f26845d;
            if (cVar.f8903p && cVar.f8895g == i5) {
                return;
            }
            cVar.f8895g = i5;
            cVar.f8903p = true;
            float f10 = i5;
            C1586j c1586jE = cVar.f8890b.e();
            c1586jE.f19755e = new C1577a(f10);
            c1586jE.f19756f = new C1577a(f10);
            c1586jE.f19757g = new C1577a(f10);
            c1586jE.f19758h = new C1577a(f10);
            cVar.c(c1586jE.a());
        }
    }

    public void setCornerRadiusResource(int i5) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f26845d.b(false).i(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f26850i != drawable) {
            this.f26850i = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i5) {
        if (this.f26857q != i5) {
            this.f26857q = i5;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i5) {
        if (this.f26854n != i5) {
            this.f26854n = i5;
            setCompoundDrawablePadding(i5);
        }
    }

    public void setIconResource(int i5) {
        setIcon(i5 != 0 ? g.B(getContext(), i5) : null);
    }

    public void setIconSize(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.k != i5) {
            this.k = i5;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f26849h != colorStateList) {
            this.f26849h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f26848g != mode) {
            this.f26848g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i5) {
        setIconTint(e.getColorStateList(getContext(), i5));
    }

    public void setInsetBottom(int i5) {
        c cVar = this.f26845d;
        cVar.d(cVar.f8893e, i5);
    }

    public void setInsetTop(int i5) {
        c cVar = this.f26845d;
        cVar.d(i5, cVar.f8894f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f26847f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f26847f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((e0) aVar).f152b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f26845d;
            if (cVar.f8899l != colorStateList) {
                cVar.f8899l = colorStateList;
                MaterialButton materialButton = cVar.f8889a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(AbstractC1340a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i5) {
        if (a()) {
            setRippleColor(e.getColorStateList(getContext(), i5));
        }
    }

    @Override // c8.u
    public void setShapeAppearanceModel(C1587k c1587k) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f26845d.c(c1587k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (a()) {
            c cVar = this.f26845d;
            cVar.f8901n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f26845d;
            if (cVar.k != colorStateList) {
                cVar.k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i5) {
        if (a()) {
            setStrokeColor(e.getColorStateList(getContext(), i5));
        }
    }

    public void setStrokeWidth(int i5) {
        if (a()) {
            c cVar = this.f26845d;
            if (cVar.f8896h != i5) {
                cVar.f8896h = i5;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i5) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i5));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f26845d;
        if (cVar.f8898j != colorStateList) {
            cVar.f8898j = colorStateList;
            if (cVar.b(false) != null) {
                cVar.b(false).setTintList(cVar.f8898j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f26845d;
        if (cVar.f8897i != mode) {
            cVar.f8897i = mode;
            if (cVar.b(false) == null || cVar.f8897i == null) {
                return;
            }
            cVar.b(false).setTintMode(cVar.f8897i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i5) {
        super.setTextAlignment(i5);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f26845d.f8905r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f26855o);
    }
}
