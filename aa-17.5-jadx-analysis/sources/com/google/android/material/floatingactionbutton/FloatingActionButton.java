package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.projection.gearhead.R;
import defpackage.a;
import defpackage.aat;
import defpackage.dsf;
import defpackage.dsg;
import defpackage.dsj;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.imr;
import defpackage.wkq;
import defpackage.wpb;
import defpackage.wph;
import defpackage.wpi;
import defpackage.wpk;
import defpackage.wpl;
import defpackage.wpm;
import defpackage.wpy;
import defpackage.wqr;
import defpackage.wqx;
import defpackage.wtg;
import defpackage.wub;
import defpackage.wue;
import defpackage.wuk;
import defpackage.wuv;
import defpackage.wvv;
import defpackage.wxp;
import defpackage.ykd;
import java.util.List;

/* loaded from: classes3.dex */
public class FloatingActionButton extends wqx implements wuv, dsf {
    public int a;
    public boolean b;
    public final Rect c;
    private ColorStateList e;
    private PorterDuff.Mode f;
    private ColorStateList g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Rect l;
    private wpl m;
    private final wvv n;
    private final imr o;

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        Drawable drawable;
        Drawable layerDrawable;
        super(wxp.a(context, attributeSet, i, R.style.Widget_Design_FloatingActionButton), attributeSet, i);
        this.c = new Rect();
        this.l = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wpm.b, i, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.e = wub.h(context2, typedArrayA, 1);
        this.f = a.R(typedArrayA.getInt(2, -1), null);
        this.g = wub.h(context2, typedArrayA, 15);
        this.i = typedArrayA.getInt(8, -1);
        this.j = typedArrayA.getDimensionPixelSize(7, 0);
        this.h = typedArrayA.getDimensionPixelSize(3, 0);
        float dimension = typedArrayA.getDimension(5, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayA.getDimension(12, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayA.getDimension(14, BitmapDescriptorFactory.HUE_RED);
        this.b = typedArrayA.getBoolean(19, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(13, 0);
        this.k = dimensionPixelSize2;
        wpl wplVarI = i();
        if (wplVarI.z != dimensionPixelSize2) {
            wplVarI.z = dimensionPixelSize2;
            wplVarI.h();
        }
        wkq wkqVarA = wkq.a(context2, typedArrayA, 18);
        wkq wkqVarA2 = wkq.a(context2, typedArrayA, 11);
        wuk wukVar = new wuk(wuk.i(context2, attributeSet, i, R.style.Widget_Design_FloatingActionButton, wuk.a));
        boolean z = typedArrayA.getBoolean(6, false);
        setEnabled(typedArrayA.getBoolean(0, true));
        typedArrayA.recycle();
        imr imrVar = new imr(this);
        this.o = imrVar;
        imrVar.d(attributeSet, i);
        this.n = new wvv(this);
        i().g(wukVar);
        wpl wplVarI2 = i();
        ColorStateList colorStateList2 = this.e;
        PorterDuff.Mode mode = this.f;
        ColorStateList colorStateList3 = this.g;
        int i2 = this.h;
        wuk wukVar2 = wplVarI2.l;
        ebe.m(wukVar2);
        wplVarI2.m = new wpk(wukVar2);
        wplVarI2.m.setTintList(colorStateList2);
        if (mode != null) {
            wplVarI2.m.setTintMode(mode);
        }
        wplVarI2.m.K(wplVarI2.B.getContext());
        if (i2 > 0) {
            Context context3 = wplVarI2.B.getContext();
            wuk wukVar3 = wplVarI2.l;
            ebe.m(wukVar3);
            wpb wpbVar = new wpb(wukVar3);
            int color = context3.getColor(R.color.design_fab_stroke_top_outer_color);
            int color2 = context3.getColor(R.color.design_fab_stroke_top_inner_color);
            colorStateList = colorStateList3;
            int color3 = context3.getColor(R.color.design_fab_stroke_end_inner_color);
            int color4 = context3.getColor(R.color.design_fab_stroke_end_outer_color);
            wpbVar.c = color;
            wpbVar.d = color2;
            wpbVar.e = color3;
            wpbVar.f = color4;
            float f = i2;
            if (wpbVar.b != f) {
                wpbVar.b = f;
                wpbVar.a.setStrokeWidth(f * 1.3333f);
                wpbVar.g = true;
                wpbVar.invalidateSelf();
            }
            wpbVar.b(colorStateList2);
            wplVarI2.o = wpbVar;
            wpb wpbVar2 = wplVarI2.o;
            ebe.m(wpbVar2);
            wue wueVar = wplVarI2.m;
            ebe.m(wueVar);
            layerDrawable = new LayerDrawable(new Drawable[]{wpbVar2, wueVar});
            drawable = null;
        } else {
            colorStateList = colorStateList3;
            drawable = null;
            wplVarI2.o = null;
            layerDrawable = wplVarI2.m;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(wtg.b(colorStateList), layerDrawable, drawable);
        wplVarI2.n = rippleDrawable;
        FocusRingDrawable.c(wplVarI2.B.getContext(), rippleDrawable, wplVarI2.m);
        wplVarI2.p = rippleDrawable;
        i().u = dimensionPixelSize;
        wpl wplVarI3 = i();
        if (wplVarI3.r != dimension) {
            wplVarI3.r = dimension;
            wplVarI3.e(dimension, wplVarI3.s, wplVarI3.t);
        }
        wpl wplVarI4 = i();
        if (wplVarI4.s != dimension2) {
            wplVarI4.s = dimension2;
            wplVarI4.e(wplVarI4.r, dimension2, wplVarI4.t);
        }
        wpl wplVarI5 = i();
        if (wplVarI5.t != dimension3) {
            wplVarI5.t = dimension3;
            wplVarI5.e(wplVarI5.r, wplVarI5.s, dimension3);
        }
        i().w = wkqVarA;
        i().x = wkqVarA2;
        i().q = z;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private final int h(int i) {
        int i2 = this.j;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        return i != -1 ? i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    private final wpl i() {
        wpl wplVar = this.m;
        if (wplVar != null) {
            return wplVar;
        }
        wpl wplVar2 = new wpl(this, new ykd(this, null));
        this.m = wplVar2;
        return wplVar2;
    }

    private final void j() {
        setTooltipText(isClickable() ? getContentDescription() : null);
    }

    @Override // defpackage.dsf
    public final dsg a() {
        return new Behavior();
    }

    public final int b() {
        return h(this.i);
    }

    @Override // defpackage.wuv
    public final void d(wuk wukVar) {
        i().g(wukVar);
    }

    final void e() {
        wpl wplVarI = i();
        FloatingActionButton floatingActionButton = wplVarI.B;
        if (floatingActionButton.getVisibility() == 0) {
            if (wplVarI.A == 1) {
                return;
            }
        } else if (wplVarI.A != 2) {
            return;
        }
        Animator animator = wplVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!wplVarI.l()) {
            floatingActionButton.g(4, false);
            return;
        }
        wkq wkqVar = wplVarI.x;
        AnimatorSet animatorSetB = wkqVar != null ? wplVarI.b(wkqVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) : wplVarI.c(BitmapDescriptorFactory.HUE_RED, 0.4f, 0.4f, wpl.d, wpl.e);
        animatorSetB.addListener(new wph(wplVarI));
        animatorSetB.start();
    }

    final void f() {
        wpl wplVarI = i();
        FloatingActionButton floatingActionButton = wplVarI.B;
        if (floatingActionButton.getVisibility() != 0) {
            if (wplVarI.A == 2) {
                return;
            }
        } else if (wplVarI.A != 1) {
            return;
        }
        Animator animator = wplVarI.v;
        if (animator != null) {
            animator.cancel();
        }
        wkq wkqVar = wplVarI.w;
        if (!wplVarI.l()) {
            floatingActionButton.g(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            wplVarI.f(1.0f);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            float f = BitmapDescriptorFactory.HUE_RED;
            floatingActionButton.setAlpha(BitmapDescriptorFactory.HUE_RED);
            if (wkqVar == null) {
                f = 0.4f;
            }
            floatingActionButton.setScaleY(f);
            floatingActionButton.setScaleX(f);
            wplVarI.f(f);
        }
        wkq wkqVar2 = wplVarI.w;
        AnimatorSet animatorSetB = wkqVar2 != null ? wplVarI.b(wkqVar2, 1.0f, 1.0f, 1.0f) : wplVarI.c(1.0f, 1.0f, 1.0f, wpl.b, wpl.c);
        animatorSetB.addListener(new wpi(wplVarI));
        animatorSetB.start();
    }

    @Override // defpackage.wuv
    public final wuk fD() {
        throw null;
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        return this.e;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        return this.f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wpl wplVarI = i();
        wue wueVar = wplVarI.m;
        if (wueVar != null) {
            wub.e(wplVarI.B, wueVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i().B.getViewTreeObserver();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iB = b();
        this.a = (iB - this.k) / 2;
        i().i();
        int iMin = Math.min(View.resolveSize(iB, i), View.resolveSize(iB, i2));
        Rect rect = this.c;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.d);
        wvv wvvVar = this.n;
        Bundle bundle = (Bundle) extendableSavedState.a.get("expandableWidgetHelper");
        ebe.m(bundle);
        wvvVar.b = bundle.getBoolean("expanded", false);
        wvvVar.a = bundle.getInt("expandedComponentIdHint", 0);
        if (wvvVar.b) {
            View view = (View) wvvVar.c;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).b(view);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        aat aatVar = extendableSavedState.a;
        wvv wvvVar = this.n;
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", wvvVar.b);
        bundle.putInt("expandedComponentIdHint", wvvVar.a);
        aatVar.put("expandableWidgetHelper", bundle);
        return extendableSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.l;
            rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            Rect rect2 = this.c;
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            int i = -this.m.a();
            rect.inset(i, i);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public final void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.e != colorStateList) {
            this.e = colorStateList;
            wpl wplVarI = i();
            wue wueVar = wplVarI.m;
            if (wueVar != null) {
                wueVar.setTintList(colorStateList);
            }
            wpb wpbVar = wplVarI.o;
            if (wpbVar != null) {
                wpbVar.b(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            wue wueVar = i().m;
            if (wueVar != null) {
                wueVar.setTintMode(mode);
            }
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z) {
        super.setClickable(z);
        j();
    }

    @Override // android.view.View
    public final void setContentDescription(CharSequence charSequence) {
        super.setContentDescription(charSequence);
        j();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        wue wueVar = i().m;
        if (wueVar != null) {
            wueVar.N(f);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            i().h();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.o.f(i);
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        super.setScaleX(f);
        i();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        super.setScaleY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        super.setTranslationX(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        i();
    }

    @Override // android.view.View
    public final void setTranslationZ(float f) {
        super.setTranslationZ(f);
        i();
    }

    public class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public class BaseBehavior<T extends FloatingActionButton> extends dsg<T> {
        private Rect a;
        private final boolean b;

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wpm.c);
            this.b = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        private final boolean J(View view, FloatingActionButton floatingActionButton) {
            return (this.b && ((dsj) floatingActionButton.getLayoutParams()).f == view.getId() && floatingActionButton.d == 0) ? false : true;
        }

        private static boolean K(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof dsj) {
                return ((dsj) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                return false;
            }
            Rect rect = this.a;
            if (rect == null) {
                rect = new Rect();
                this.a = rect;
            }
            wpy.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.d()) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        private final boolean M(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((dsj) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.e();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        @Override // defpackage.dsg
        public final void c(dsj dsjVar) {
            if (dsjVar.h == 0) {
                dsjVar.h = 80;
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List listA = coordinatorLayout.a(floatingActionButton);
            int size = listA.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = (View) listA.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    if (K(view2) && M(view2, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (L(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(floatingActionButton, i);
            Rect rect = floatingActionButton.c;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return true;
            }
            dsj dsjVar = (dsj) floatingActionButton.getLayoutParams();
            int i4 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - dsjVar.rightMargin ? rect.right : floatingActionButton.getLeft() <= dsjVar.leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - dsjVar.bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= dsjVar.topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                int[] iArr = ebm.a;
                floatingActionButton.offsetTopAndBottom(i2);
            }
            if (i4 == 0) {
                return true;
            }
            int[] iArr2 = ebm.a;
            floatingActionButton.offsetLeftAndRight(i4);
            return true;
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void n(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else if (K(view2)) {
                M(view2, floatingActionButton);
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean t(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.c;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public BaseBehavior() {
            this.b = true;
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.floatingActionButtonStyle);
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }
}
