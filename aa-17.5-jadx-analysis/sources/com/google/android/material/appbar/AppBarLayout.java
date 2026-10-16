package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.dsf;
import defpackage.dsg;
import defpackage.dsj;
import defpackage.eae;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ecy;
import defpackage.ocf;
import defpackage.wkn;
import defpackage.wkt;
import defpackage.wku;
import defpackage.wkv;
import defpackage.wkx;
import defpackage.wkz;
import defpackage.wla;
import defpackage.wlb;
import defpackage.wld;
import defpackage.wle;
import defpackage.wly;
import defpackage.woy;
import defpackage.wpx;
import defpackage.wqr;
import defpackage.wub;
import defpackage.wue;
import defpackage.wwe;
import defpackage.wxp;
import defpackage.ykd;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements dsf {
    public boolean a;
    public int b;
    public ecy c;
    public List d;
    public boolean e;
    public boolean f;
    public final List g;
    public final LinkedHashSet h;
    public int i;
    public Drawable j;
    public Integer k;
    public final float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private ColorStateList r;
    private int s;
    private WeakReference t;
    private ValueAnimator u;
    private ValueAnimator.AnimatorUpdateListener v;
    private final long w;
    private final TimeInterpolator x;
    private int[] y;
    private Behavior z;

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(wxp.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.n = -1;
        this.o = -1;
        this.p = -1;
        this.b = 0;
        this.g = new ArrayList();
        this.h = new LinkedHashSet();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = wle.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = wle.a;
        Context context3 = getContext();
        TypedArray typedArrayA = wqr.a(context3, attributeSet, wle.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (typedArrayA.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, typedArrayA.getResourceId(0, 0)));
            }
            typedArrayA.recycle();
            TypedArray typedArrayA2 = wqr.a(context2, attributeSet, wlb.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            this.r = wub.h(context2, typedArrayA2, 6);
            this.w = woy.u(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            this.x = woy.C(context2, R.attr.motionEasingStandardInterpolator, wkn.a);
            if (typedArrayA2.hasValue(4)) {
                j(typedArrayA2.getBoolean(4, false), false, false);
            }
            if (typedArrayA2.hasValue(3)) {
                wle.a(this, typedArrayA2.getDimensionPixelSize(3, 0));
            }
            setBackground(typedArrayA2.getDrawable(0));
            if (typedArrayA2.hasValue(2)) {
                setKeyboardNavigationCluster(typedArrayA2.getBoolean(2, false));
            }
            if (typedArrayA2.hasValue(1)) {
                setTouchscreenBlocksFocus(typedArrayA2.getBoolean(1, false));
            }
            this.l = getResources().getDimension(R.dimen.design_appbar_elevation);
            this.f = typedArrayA2.getBoolean(5, false);
            this.s = typedArrayA2.getResourceId(7, -1);
            Drawable drawable = typedArrayA2.getDrawable(8);
            Drawable drawable2 = this.j;
            if (drawable2 != drawable) {
                Integer numValueOf = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
                this.j = drawableMutate;
                if (drawableMutate instanceof wue) {
                    numValueOf = Integer.valueOf(((wue) drawableMutate).w);
                } else {
                    ColorStateList colorStateListB = woy.b(drawableMutate);
                    if (colorStateListB != null) {
                        numValueOf = Integer.valueOf(colorStateListB.getDefaultColor());
                    }
                }
                this.k = numValueOf;
                Drawable drawable3 = this.j;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        this.j.setState(getDrawableState());
                    }
                    this.j.setLayoutDirection(getLayoutDirection());
                    this.j.setVisible(getVisibility() == 0, false);
                    this.j.setCallback(this);
                }
                k();
                postInvalidateOnAnimation();
            }
            typedArrayA2.recycle();
            wkt wktVar = new wkt(this, 0);
            int[] iArr3 = ebm.a;
            ebe.e(this, wktVar);
        } catch (Throwable th) {
            typedArrayA.recycle();
            throw th;
        }
    }

    protected static final wkv m(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new wkv((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new wkv((ViewGroup.MarginLayoutParams) layoutParams) : new wkv(layoutParams);
    }

    private final void o() {
        Behavior behavior = this.z;
        BaseBehavior.SavedState savedStateN = null;
        if (behavior != null && this.n != -1 && this.b == 0) {
            savedStateN = behavior.N(AbsSavedState.c, this);
        }
        this.n = -1;
        this.o = -1;
        this.p = -1;
        if (savedStateN != null) {
            this.z.P(savedStateN, false);
        }
    }

    private final void p(float f, float f2) {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.w);
        this.u.setInterpolator(this.x);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.v;
        if (animatorUpdateListener != null) {
            this.u.addUpdateListener(animatorUpdateListener);
        }
        this.u.start();
    }

    private final boolean q() {
        return this.j != null && e() > 0;
    }

    private final boolean r() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dsf
    public final dsg a() {
        Behavior behavior = new Behavior();
        this.z = behavior;
        return behavior;
    }

    public final int b() {
        int iMin;
        int minimumHeight;
        int i = this.o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                wkv wkvVar = (wkv) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = wkvVar.a;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = wkvVar.topMargin + wkvVar.bottomMargin;
                    if ((i3 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i3 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            iMin = Math.min(iMin, measuredHeight - e());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + minimumHeight;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - e());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.o = iMax;
        return iMax;
    }

    final int c() {
        int i = this.p;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                wkv wkvVar = (wkv) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + wkvVar.topMargin + wkvVar.bottomMargin;
                int i3 = wkvVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight;
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.p = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof wkv;
    }

    public final int d() {
        int iE = e();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0) {
            int i = minimumHeight + minimumHeight + iE;
            return i < getHeight() ? i : minimumHeight + iE;
        }
        int childCount = getChildCount();
        int minimumHeight2 = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
        if (minimumHeight2 == 0) {
            return getHeight() / 3;
        }
        int i2 = minimumHeight2 + minimumHeight2 + iE;
        return i2 < getHeight() ? i2 : minimumHeight2 + iE;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (q()) {
            int iSave = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, -this.m);
            this.j.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.j;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        ecy ecyVar = this.c;
        if (ecyVar != null) {
            return ecyVar.d();
        }
        return 0;
    }

    public final int f() {
        int i = this.n;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int minimumHeight = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                wkv wkvVar = (wkv) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = wkvVar.a;
                if ((i3 & 1) == 0) {
                    break;
                }
                minimumHeight += measuredHeight + wkvVar.topMargin + wkvVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        minimumHeight -= e();
                    }
                    i2 = 0;
                }
                if ((i3 & 2) != 0) {
                    minimumHeight -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, minimumHeight);
        this.n = iMax;
        return iMax;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final wkv generateLayoutParams(AttributeSet attributeSet) {
        return new wkv(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new wkv();
    }

    final void h(int i) {
        this.m = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.d;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ykd ykdVar = (ykd) this.d.get(i2);
                if (ykdVar != null) {
                    CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) ykdVar.a;
                    collapsingToolbarLayout.e = i;
                    ecy ecyVar = collapsingToolbarLayout.f;
                    int iD = ecyVar != null ? ecyVar.d() : 0;
                    int childCount = collapsingToolbarLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = collapsingToolbarLayout.getChildAt(i3);
                        wkx wkxVar = (wkx) childAt.getLayoutParams();
                        wld wldVarC = CollapsingToolbarLayout.c(childAt);
                        int i4 = wkxVar.a;
                        if (i4 == 1) {
                            wldVarC.c(dlz.j(-i, 0, collapsingToolbarLayout.a(childAt)));
                        } else if (i4 == 2) {
                            wldVarC.c(Math.round((-i) * wkxVar.b));
                        }
                    }
                    collapsingToolbarLayout.h();
                    if (collapsingToolbarLayout.d != null && iD > 0) {
                        collapsingToolbarLayout.postInvalidateOnAnimation();
                    }
                    int height = collapsingToolbarLayout.getHeight();
                    int minimumHeight = height - collapsingToolbarLayout.getMinimumHeight();
                    int iB = height - collapsingToolbarLayout.b();
                    int i5 = minimumHeight - iD;
                    int i6 = collapsingToolbarLayout.e + i5;
                    float fAbs = Math.abs(i);
                    wpx wpxVar = collapsingToolbarLayout.a;
                    float f = i5;
                    float f2 = iB / f;
                    wpxVar.A(Math.min(1.0f, f2));
                    wpxVar.d = i6;
                    float f3 = fAbs / f;
                    wpxVar.z(f3);
                    wpx wpxVar2 = collapsingToolbarLayout.b;
                    wpxVar2.A(Math.min(1.0f, f2));
                    wpxVar2.d = i6;
                    wpxVar2.z(f3);
                }
            }
        }
    }

    public final void i(boolean z) {
        j(z, isLaidOut(), true);
    }

    public final void j(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    public final void k() {
        setWillNotDraw(!q());
    }

    final boolean l(View view) {
        int i;
        if (this.t == null && (i = this.s) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.s);
            }
            if (viewFindViewById != null) {
                this.t = new WeakReference(viewFindViewById);
            }
        }
        WeakReference weakReference = this.t;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    final boolean n(boolean z) {
        if (this.e == z) {
            return false;
        }
        this.e = z;
        refreshDrawableState();
        if (getBackground() instanceof wue) {
            ColorStateList colorStateList = this.r;
            float f = BitmapDescriptorFactory.HUE_RED;
            if (colorStateList != null) {
                float f2 = true != z ? 1.0f : 0.0f;
                if (true == z) {
                    f = 1.0f;
                }
                p(f2, f);
            } else if (this.f) {
                float f3 = z ? 0.0f : this.l;
                if (z) {
                    f = this.l;
                }
                p(f3, f);
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wub.d(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] iArr = this.y;
        if (iArr == null) {
            iArr = new int[4];
            this.y = iArr;
        }
        int length = iArr.length;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z = this.q;
        boolean z2 = false;
        iArr[0] = true != z ? -2130970437 : R.attr.state_liftable;
        int i2 = -2130970438;
        if (!z) {
            z2 = true;
        } else if (this.e) {
            i2 = R.attr.state_lifted;
        }
        iArr[1] = i2;
        iArr[2] = true != z2 ? R.attr.state_collapsible : -2130970431;
        int i3 = -2130970430;
        if (z && this.e) {
            i3 = R.attr.state_collapsed;
        }
        iArr[3] = i3;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.t;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.t = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getFitsSystemWindows() && r()) {
            int iE = e();
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = getChildAt(childCount);
                int[] iArr = ebm.a;
                childAt.offsetTopAndBottom(iE);
            }
        }
        o();
        boolean z2 = false;
        this.a = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((wkv) getChildAt(i5).getLayoutParams()).b != null) {
                this.a = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), e());
        }
        if (this.f) {
            z2 = true;
            break;
        }
        int childCount3 = getChildCount();
        for (int i6 = 0; i6 < childCount3; i6++) {
            int i7 = ((wkv) getChildAt(i6).getLayoutParams()).a;
            if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                z2 = true;
                break;
            }
        }
        if (this.q != z2) {
            this.q = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && r()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = dlz.j(getMeasuredHeight() + e(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += e();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        o();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        final wue wueVar;
        boolean z = drawable instanceof wue;
        Context context = getContext();
        if (z) {
            wueVar = (wue) drawable;
        } else {
            ColorStateList colorStateListB = woy.b(drawable);
            if (colorStateListB == null) {
                wueVar = null;
            } else {
                wue wueVar2 = new wue();
                wueVar2.O(colorStateListB);
                wueVar = wueVar2;
            }
        }
        if (wueVar != null && wueVar.D() != null) {
            this.i = wueVar.D().getDefaultColor();
            final ColorStateList colorStateList = this.r;
            if (colorStateList != null) {
                Context context2 = getContext();
                TypedValue typedValueX = woy.x(context2.getTheme(), R.attr.colorSurface);
                final Integer numValueOf = typedValueX != null ? Integer.valueOf(woy.p(context2, typedValueX)) : null;
                this.v = new ValueAnimator.AnimatorUpdateListener() { // from class: wks
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        Integer num;
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ColorStateList colorStateList2 = colorStateList;
                        AppBarLayout appBarLayout = this.a;
                        int iO = woy.o(appBarLayout.i, colorStateList2.getDefaultColor(), fFloatValue);
                        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iO);
                        wue wueVar3 = wueVar;
                        wueVar3.O(colorStateListValueOf);
                        if (appBarLayout.j != null && (num = appBarLayout.k) != null && num.equals(numValueOf)) {
                            appBarLayout.j.setTint(iO);
                        }
                        List<wkw> list = appBarLayout.g;
                        if (!list.isEmpty()) {
                            for (wkw wkwVar : list) {
                                if (wueVar3.D() != null) {
                                    wkwVar.a();
                                }
                            }
                        }
                        LinkedHashSet linkedHashSet = appBarLayout.h;
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (it.hasNext()) {
                            ((ykd) it.next()).j(fFloatValue);
                        }
                    }
                };
            } else {
                wueVar.K(context);
                this.v = new ocf(this, wueVar, 4);
            }
            drawable = wueVar;
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        wub.c(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class BaseBehavior<T extends AppBarLayout> extends wkz<T> {
        public int a;
        private int c;
        private ValueAnimator d;
        private SavedState e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View R(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((dsj) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void W(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (ebm.a(coordinatorLayout) != null) {
                return;
            }
            ebm.o(coordinatorLayout, new wku(this, appBarLayout, coordinatorLayout));
        }

        private final void X(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int iE = appBarLayout.e() + appBarLayout.getPaddingTop();
            int iL = L() - iE;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                wkv wkvVar = (wkv) childAt.getLayoutParams();
                if (Y(wkvVar.a, 32)) {
                    top -= wkvVar.topMargin;
                    bottom += wkvVar.bottomMargin;
                }
                int i2 = -iL;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                wkv wkvVar2 = (wkv) childAt2.getLayoutParams();
                int i3 = wkvVar2.a;
                if ((i3 & 17) == 17) {
                    int iE2 = -childAt2.getTop();
                    int minimumHeight = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        iE2 -= appBarLayout.e();
                    }
                    if (Y(i3, 2)) {
                        minimumHeight += childAt2.getMinimumHeight();
                    } else if (Y(i3, 5)) {
                        int minimumHeight2 = childAt2.getMinimumHeight() + minimumHeight;
                        if (iL < minimumHeight2) {
                            iE2 = minimumHeight2;
                        } else {
                            minimumHeight = minimumHeight2;
                        }
                    }
                    if (Y(i3, 32)) {
                        iE2 += wkvVar2.topMargin;
                        minimumHeight -= wkvVar2.bottomMargin;
                    }
                    if (iL < (minimumHeight + iE2) / 2) {
                        iE2 = minimumHeight;
                    }
                    Z(coordinatorLayout, appBarLayout, dlz.j(iE2 + iE, -appBarLayout.f(), 0));
                }
            }
        }

        private static boolean Y(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void Z(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float fAbs = Math.abs(L() - i);
            float fAbs2 = Math.abs(BitmapDescriptorFactory.HUE_RED);
            int iRound = fAbs2 > BitmapDescriptorFactory.HUE_RED ? Math.round((fAbs / fAbs2) * 1000.0f) * 3 : (int) (((fAbs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int iL = L();
            ValueAnimator valueAnimator = this.d;
            if (iL == i) {
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.d = valueAnimator2;
                valueAnimator2.setInterpolator(wkn.e);
                this.d.addUpdateListener(new wwe(this, coordinatorLayout, appBarLayout, 1));
            } else {
                valueAnimator.cancel();
            }
            this.d.setDuration(Math.min(iRound, 600));
            this.d.setIntValues(iL, i);
            this.d.start();
        }

        private static final View aa(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof eae) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static final void ab(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, int r9, int r10, boolean r11) {
            /*
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                r4 = 0
                if (r3 >= r1) goto L21
                android.view.View r5 = r8.getChildAt(r3)
                int r6 = r5.getTop()
                if (r0 < r6) goto L1e
                int r6 = r5.getBottom()
                if (r0 > r6) goto L1e
                goto L22
            L1e:
                int r3 = r3 + 1
                goto La
            L21:
                r5 = r4
            L22:
                if (r5 == 0) goto L5b
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                wkv r0 = (defpackage.wkv) r0
                int r0 = r0.a
                r1 = r0 & 1
                if (r1 == 0) goto L5b
                int r1 = r5.getMinimumHeight()
                r3 = 1
                if (r10 <= 0) goto L49
                r10 = r0 & 12
                if (r10 == 0) goto L49
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.e()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L49:
                r10 = r0 & 2
                if (r10 == 0) goto L5b
                int r9 = -r9
                int r10 = r5.getBottom()
                int r10 = r10 - r1
                int r0 = r8.e()
                int r10 = r10 - r0
                if (r9 < r10) goto L5b
                goto L5c
            L5b:
                r3 = r2
            L5c:
                boolean r9 = r8.f
                if (r9 == 0) goto L68
                android.view.View r9 = aa(r7)
                boolean r3 = r8.l(r9)
            L68:
                boolean r9 = r8.n(r3)
                if (r11 != 0) goto La4
                if (r9 == 0) goto Lcb
                mko r7 = r7.h
                java.util.ArrayList r7 = r7.x(r8)
                if (r7 != 0) goto L79
                goto L7e
            L79:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>(r7)
            L7e:
                if (r4 != 0) goto L82
                java.util.List r4 = java.util.Collections.EMPTY_LIST
            L82:
                int r7 = r4.size()
            L86:
                if (r2 >= r7) goto Lcb
                java.lang.Object r9 = r4.get(r2)
                android.view.View r9 = (android.view.View) r9
                android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
                dsj r9 = (defpackage.dsj) r9
                dsg r9 = r9.a
                boolean r10 = r9 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r10 == 0) goto La1
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r9 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r9
                int r7 = r9.d
                if (r7 == 0) goto Lcb
                goto La4
            La1:
                int r2 = r2 + 1
                goto L86
            La4:
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                if (r7 == 0) goto Lb1
                android.graphics.drawable.Drawable r7 = r8.getBackground()
                r7.jumpToCurrentState()
            Lb1:
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                if (r7 == 0) goto Lbe
                android.graphics.drawable.Drawable r7 = r8.getForeground()
                r7.jumpToCurrentState()
            Lbe:
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                if (r7 == 0) goto Lcb
                android.animation.StateListAnimator r7 = r8.getStateListAnimator()
                r7.jumpToCurrentState()
            Lcb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.ab(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        @Override // defpackage.wkz
        public final /* bridge */ /* synthetic */ int J(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.c()) + appBarLayout.e();
        }

        @Override // defpackage.wkz
        public final /* synthetic */ int K(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.wkz
        public final int L() {
            return U() + this.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
        @Override // defpackage.wkz
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ int M(androidx.coordinatorlayout.widget.CoordinatorLayout r18, android.view.View r19, int r20, int r21, int r22) {
            /*
                Method dump skipped, instructions count: 333
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.M(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int, int, int):int");
        }

        final SavedState N(Parcelable parcelable, AppBarLayout appBarLayout) {
            int iU = U();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + iU;
                if (childAt.getTop() + iU <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.c;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z = iU == 0;
                    savedState.b = z;
                    savedState.a = !z && (-iU) >= appBarLayout.f();
                    savedState.e = i;
                    savedState.g = bottom == childAt.getMinimumHeight() + appBarLayout.e();
                    savedState.f = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // defpackage.wkz
        public final /* bridge */ /* synthetic */ void O(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            X(coordinatorLayout, appBarLayout);
            if (appBarLayout.f) {
                appBarLayout.n(appBarLayout.l(aa(coordinatorLayout)));
            }
        }

        final void P(SavedState savedState, boolean z) {
            if (this.e == null || z) {
                this.e = savedState;
            }
        }

        @Override // defpackage.wkz
        public final /* bridge */ /* synthetic */ boolean Q(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void S(androidx.coordinatorlayout.widget.CoordinatorLayout r9, com.google.android.material.appbar.AppBarLayout r10, android.view.View r11, int r12, int[] r13) {
            /*
                r8 = this;
                if (r12 == 0) goto L25
                if (r12 >= 0) goto Lf
                int r0 = r10.f()
                int r0 = -r0
                int r1 = r10.b()
                int r1 = r1 + r0
                goto L15
            Lf:
                int r0 = r10.f()
                int r0 = -r0
                r1 = 0
            L15:
                r6 = r0
                r7 = r1
                if (r6 == r7) goto L25
                r0 = 1
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r12
                int r8 = r2.T(r3, r4, r5, r6, r7)
                r13[r0] = r8
                goto L26
            L25:
                r4 = r10
            L26:
                boolean r8 = r4.f
                if (r8 == 0) goto L31
                boolean r8 = r4.l(r11)
                r4.n(r8)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.S(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int[]):void");
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.c == 0 || i == 1) {
                X(coordinatorLayout, appBarLayout);
                if (appBarLayout.f) {
                    appBarLayout.n(appBarLayout.l(view2));
                }
            }
            this.f = new WeakReference(view2);
        }

        @Override // defpackage.wlc, defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            BaseBehavior<T> baseBehavior;
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.g(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            SavedState savedState = this.e;
            if (savedState == null || (i2 & 8) != 0) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.f();
                        if (i3 != 0) {
                            baseBehavior.Z(coordinatorLayout2, appBarLayout, i4);
                        } else {
                            baseBehavior.M(coordinatorLayout2, appBarLayout, i4, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            baseBehavior.Z(coordinatorLayout2, appBarLayout, 0);
                        } else {
                            baseBehavior.M(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                        }
                    }
                }
            } else if (savedState.a) {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                baseBehavior.M(coordinatorLayout2, appBarLayout, -appBarLayout.f(), Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
            } else {
                baseBehavior = this;
                coordinatorLayout2 = coordinatorLayout;
                if (savedState.b) {
                    baseBehavior.M(coordinatorLayout2, appBarLayout, 0, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                } else {
                    View childAt = appBarLayout.getChildAt(savedState.e);
                    baseBehavior.M(coordinatorLayout2, appBarLayout, (-childAt.getBottom()) + (baseBehavior.e.g ? childAt.getMinimumHeight() + appBarLayout.e() : Math.round(childAt.getHeight() * baseBehavior.e.f)), Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
                }
            }
            appBarLayout.b = 0;
            baseBehavior.e = null;
            baseBehavior.V(dlz.j(baseBehavior.U(), -appBarLayout.f(), 0));
            ab(coordinatorLayout2, appBarLayout, baseBehavior.U(), 0, true);
            appBarLayout.h(baseBehavior.U());
            baseBehavior.W(coordinatorLayout2, appBarLayout);
            return true;
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((dsj) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void o(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int[] iArr, int i2) {
            S(coordinatorLayout, (AppBarLayout) view, view2, i, iArr);
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            int i4;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i3 < 0) {
                i4 = i3;
                iArr[1] = T(coordinatorLayout, appBarLayout, i4, -appBarLayout.c(), 0);
            } else {
                i4 = i3;
            }
            if (i4 == 0) {
                W(coordinatorLayout, appBarLayout);
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ void q(View view, Parcelable parcelable) {
            if (!(parcelable instanceof SavedState)) {
                this.e = null;
            } else {
                P((SavedState) parcelable, true);
                Parcelable parcelable2 = this.e.d;
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ Parcelable r(View view) {
            android.view.AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            SavedState savedStateN = N(absSavedState, (AppBarLayout) view);
            return savedStateN == null ? absSavedState : savedStateN;
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z = false;
            if ((i & 2) != 0 && (appBarLayout.f || appBarLayout.e || (appBarLayout.f() != 0 && coordinatorLayout.getHeight() - view2.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new wly(1);
            boolean a;
            boolean b;
            int e;
            float f;
            boolean g;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.a = parcel.readByte() != 0;
                this.b = parcel.readByte() != 0;
                this.e = parcel.readInt();
                this.f = parcel.readFloat();
                this.g = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.e);
                parcel.writeFloat(this.f);
                parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new wkv();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m(layoutParams);
    }

    public static class ScrollingViewBehavior extends wla {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wlb.f);
            this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        static final AppBarLayout M(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.wla
        public final float J(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int iF = appBarLayout.f();
            int iB = appBarLayout.b();
            dsg dsgVar = ((dsj) appBarLayout.getLayoutParams()).a;
            int iL = dsgVar instanceof BaseBehavior ? ((BaseBehavior) dsgVar).L() : 0;
            return ((iB == 0 || iF + iL > iB) && (i = iF - iB) != 0) ? (iL / i) + 1.0f : BitmapDescriptorFactory.HUE_RED;
        }

        @Override // defpackage.wla
        public final int K(View view) {
            return ((AppBarLayout) view).f();
        }

        @Override // defpackage.wla
        public final /* bridge */ /* synthetic */ View L(List list) {
            return M(list);
        }

        @Override // defpackage.wlc, defpackage.dsg
        public /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.dsg
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayoutM = M(coordinatorLayout.a(view));
            if (appBarLayoutM != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayoutM.j(false, !z, true);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.dsg
        public final boolean j(View view) {
            return view instanceof AppBarLayout;
        }

        @Override // defpackage.dsg
        public final void k(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                ebm.o(coordinatorLayout, null);
            }
        }

        @Override // defpackage.dsg
        public final /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            ecy ecyVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View viewL = L(coordinatorLayout.a(view));
            if (viewL == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (viewL.getFitsSystemWindows() && (ecyVar = coordinatorLayout.e) != null) {
                size += ecyVar.d() + ecyVar.a();
            }
            int iK = size + K(viewL);
            int measuredHeight = viewL.getMeasuredHeight();
            if (P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                iK -= measuredHeight;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(iK, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        @Override // defpackage.dsg
        public void n(CoordinatorLayout coordinatorLayout, View view, View view2) {
            dsg dsgVar = ((dsj) view2.getLayoutParams()).a;
            if (dsgVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) dsgVar).a) + this.c) - N(view2);
                int[] iArr = ebm.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.f) {
                    appBarLayout.n(appBarLayout.l(view));
                }
            }
        }

        public ScrollingViewBehavior() {
        }
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }
}
