package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class n extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private static final View.OnTouchListener f6758b = new m();

    /* renamed from: a, reason: collision with root package name */
    com.google.android.material.k.r f6759a;

    /* renamed from: c, reason: collision with root package name */
    private o f6760c;

    /* renamed from: d, reason: collision with root package name */
    private int f6761d;

    /* renamed from: e, reason: collision with root package name */
    private final float f6762e;

    /* renamed from: f, reason: collision with root package name */
    private final float f6763f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6764g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6765h;

    /* renamed from: i, reason: collision with root package name */
    private ColorStateList f6766i;

    /* renamed from: j, reason: collision with root package name */
    private PorterDuff.Mode f6767j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f6768k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6769l;

    /* JADX WARN: Multi-variable type inference failed */
    protected n(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(com.google.android.material.theme.a.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, p.f6782a);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f6761d = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f6759a = com.google.android.material.k.r.m(context2, attributeSet, 0, 0).i();
        }
        float f2 = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        this.f6762e = f2;
        setBackgroundTintList(com.google.android.material.internal.t.n(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(com.waze.c.c.e.h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f6763f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f6764g = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f6765h = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(f6758b);
        setFocusable(true);
        if (getBackground() == null) {
            int iD = com.google.android.material.focus.d.d(com.google.android.material.focus.d.b(this, R.attr.colorSurface), com.google.android.material.focus.d.b(this, R.attr.colorOnSurface), f2);
            com.google.android.material.k.r rVar = this.f6759a;
            if (rVar != null) {
                int i2 = o.f6771d;
                com.google.android.material.k.k kVar = new com.google.android.material.k.k(rVar);
                kVar.v(ColorStateList.valueOf(iD));
                gradientDrawable = kVar;
            } else {
                Resources resources = getResources();
                int i3 = o.f6771d;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iD);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f6766i;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackgroundDrawable(gradientDrawable);
        }
    }

    final float a() {
        return this.f6763f;
    }

    final int b() {
        return this.f6761d;
    }

    final int c() {
        return this.f6765h;
    }

    final void f(ViewGroup viewGroup) {
        this.f6769l = true;
        viewGroup.addView(this);
        this.f6769l = false;
    }

    final void g() {
        this.f6761d = 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o oVar = this.f6760c;
        if (oVar != null) {
            oVar.q();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o oVar = this.f6760c;
        if (oVar != null) {
            if (u.a().i(oVar.f6778c)) {
                o.f6770a.post(new i(oVar, 0));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        o oVar = this.f6760c;
        if (oVar != null) {
            oVar.r();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int i4 = this.f6764g;
        if (i4 <= 0 || getMeasuredWidth() <= i4) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f6766i != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f6766i);
            drawable.setTintMode(this.f6767j);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6766i = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f6767j);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6767j = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f6769l || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f6768k = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        o oVar = this.f6760c;
        if (oVar != null) {
            oVar.E();
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f6758b);
        super.setOnClickListener(onClickListener);
    }

    protected n(Context context) {
        this(context, null);
    }
}
