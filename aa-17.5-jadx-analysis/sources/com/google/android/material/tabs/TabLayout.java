package com.google.android.material.tabs;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.car.app.model.Alert;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import defpackage.dzk;
import defpackage.dzl;
import defpackage.dzm;
import defpackage.edg;
import defpackage.erb;
import defpackage.fhy;
import defpackage.fia;
import defpackage.fs;
import defpackage.wkn;
import defpackage.wox;
import defpackage.woy;
import defpackage.wqr;
import defpackage.wub;
import defpackage.wue;
import defpackage.wvk;
import defpackage.wvx;
import defpackage.wvy;
import defpackage.wvz;
import defpackage.wwa;
import defpackage.wwb;
import defpackage.wwc;
import defpackage.wwd;
import defpackage.wwf;
import defpackage.wwg;
import defpackage.wwh;
import defpackage.wwi;
import defpackage.wwj;
import defpackage.wxp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@fia
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    private static final dzk E = new dzm(16);
    public final ArrayList A;
    public ViewPager B;
    public int C;
    public wox D;
    private final ArrayList F;
    private wwg G;
    private int H;
    private final int I;
    private final int J;
    private final int K;
    private int L;
    private wwc M;
    private ValueAnimator N;
    private fhy O;
    private DataSetObserver P;
    private wwh Q;
    private wwb R;
    private boolean S;
    private final dzk T;
    public int a;
    final wwf b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public ColorStateList j;
    public ColorStateList k;
    public Drawable l;
    public float m;
    public float n;
    public float o;
    public final int p;
    public int q;
    public int r;
    int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    int x;
    public boolean y;
    public final TimeInterpolator z;

    public TabLayout(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        wox wvxVar;
        super(wxp.a(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.a = -1;
        this.F = new ArrayList();
        this.i = -1;
        this.H = 0;
        this.q = Alert.DURATION_SHOW_INDEFINITELY;
        this.x = -1;
        this.A = new ArrayList();
        this.T = new dzl(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        wwf wwfVar = new wwf(this, context2);
        this.b = wwfVar;
        super.addView(wwfVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayA = wqr.a(context2, attributeSet, wvz.a, i, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListB = woy.b(getBackground());
        if (colorStateListB != null) {
            wue wueVar = new wue();
            wueVar.O(colorStateListB);
            wueVar.K(context2);
            wueVar.N(getElevation());
            setBackground(wueVar);
        }
        Drawable drawableI = wub.i(context2, typedArrayA, 5);
        Drawable drawableMutate = (drawableI == null ? new GradientDrawable() : drawableI).mutate();
        this.l = drawableMutate;
        woy.f(drawableMutate, this.H);
        int i2 = this.x;
        wwfVar.b(i2 == -1 ? this.l.getIntrinsicHeight() : i2);
        int color = typedArrayA.getColor(8, 0);
        this.H = color;
        woy.f(this.l, color);
        n(false);
        wwfVar.b(typedArrayA.getDimensionPixelSize(11, -1));
        int i3 = typedArrayA.getInt(10, 0);
        if (this.t != i3) {
            this.t = i3;
            wwfVar.postInvalidateOnAnimation();
        }
        int i4 = typedArrayA.getInt(7, 0);
        if (i4 != 0) {
            if (i4 == 1) {
                wvxVar = new wvx();
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
                }
                wvxVar = new wvy();
            }
            this.D = wvxVar;
        } else {
            this.D = new wox(null);
        }
        this.w = typedArrayA.getBoolean(9, true);
        wwfVar.a();
        wwfVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = typedArrayA.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = typedArrayA.getDimensionPixelSize(20, this.d);
        this.e = typedArrayA.getDimensionPixelSize(18, this.e);
        this.f = typedArrayA.getDimensionPixelSize(17, this.f);
        this.g = true != woy.z(context2, R.attr.isMaterial3Theme, false) ? R.attr.textAppearanceButton : R.attr.textAppearanceTitleSmall;
        int resourceId = typedArrayA.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, fs.x);
        try {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = wub.h(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayA.hasValue(22)) {
                this.i = typedArrayA.getResourceId(22, resourceId);
            }
            int i5 = this.i;
            if (i5 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i5, fs.x);
                try {
                    this.n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, (int) this.m);
                    ColorStateList colorStateListH = wub.h(context2, typedArrayObtainStyledAttributes, 3);
                    if (colorStateListH != null) {
                        this.j = q(this.j.getDefaultColor(), colorStateListH.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListH.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayA.hasValue(25)) {
                this.j = wub.h(context2, typedArrayA, 25);
            }
            if (typedArrayA.hasValue(23)) {
                this.j = q(this.j.getDefaultColor(), typedArrayA.getColor(23, 0));
            }
            wub.h(context2, typedArrayA, 3);
            typedArrayA.getInt(4, -1);
            this.k = wub.h(context2, typedArrayA, 21);
            this.s = typedArrayA.getInt(6, 300);
            this.z = woy.C(context2, R.attr.motionEasingEmphasizedInterpolator, wkn.b);
            this.I = typedArrayA.getDimensionPixelSize(14, -1);
            this.J = typedArrayA.getDimensionPixelSize(13, -1);
            this.p = typedArrayA.getResourceId(0, 0);
            this.L = typedArrayA.getDimensionPixelSize(1, 0);
            this.u = typedArrayA.getInt(15, 1);
            this.r = typedArrayA.getInt(2, 0);
            this.v = typedArrayA.getBoolean(12, false);
            this.y = typedArrayA.getBoolean(26, false);
            typedArrayA.recycle();
            Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.K = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            int i6 = this.u;
            wwfVar.setPaddingRelative((i6 == 0 || i6 == 2) ? Math.max(0, this.L - this.c) : 0, 0, 0, 0);
            int i7 = this.u;
            if (i7 == 0) {
                int i8 = this.r;
                if (i8 == 0) {
                    Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                } else if (i8 == 1) {
                    wwfVar.setGravity(1);
                } else if (i8 == 2) {
                }
                wwfVar.setGravity(8388611);
            } else if (i7 == 1 || i7 == 2) {
                if (this.r == 2) {
                    Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                wwfVar.setGravity(1);
            }
            n(true);
        } finally {
        }
    }

    private final int o(int i, float f) {
        wwf wwfVar;
        View childAt;
        int i2 = this.u;
        if ((i2 != 0 && i2 != 2) || (childAt = (wwfVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < wwfVar.getChildCount() ? wwfVar.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    private final int p() {
        int i = this.I;
        if (i != -1) {
            return i;
        }
        int i2 = this.u;
        if (i2 == 0 || i2 == 2) {
            return this.K;
        }
        return 0;
    }

    private static ColorStateList q(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void r(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            wwf wwfVar = this.b;
            int childCount = wwfVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (wwfVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iO = o(i, BitmapDescriptorFactory.HUE_RED);
            if (scrollX != iO) {
                if (this.N == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.N = valueAnimator;
                    valueAnimator.setInterpolator(this.z);
                    this.N.setDuration(this.s);
                    this.N.addUpdateListener(new wvk(this, 5));
                }
                this.N.setIntValues(scrollX, iO);
                this.N.start();
            }
            int i3 = this.s;
            ValueAnimator valueAnimator2 = wwfVar.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && wwfVar.b.a != i) {
                wwfVar.a.cancel();
            }
            wwfVar.d(true, i, i3);
            return;
        }
        m(i, BitmapDescriptorFactory.HUE_RED, true, true, true);
    }

    private final void s(int i) {
        wwf wwfVar = this.b;
        int childCount = wwfVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = wwfVar.getChildAt(i2);
                boolean z = i2 == i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof wwi) {
                        ((wwi) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void t(LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = BitmapDescriptorFactory.HUE_RED;
        }
    }

    private final boolean u() {
        int i = this.u;
        return i == 0 || i == 2;
    }

    private final void v(ViewPager viewPager, boolean z) {
        TabLayout tabLayout;
        List list;
        List list2;
        ViewPager viewPager2 = this.B;
        if (viewPager2 != null) {
            wwh wwhVar = this.Q;
            if (wwhVar != null && (list2 = viewPager2.f) != null) {
                list2.remove(wwhVar);
            }
            wwb wwbVar = this.R;
            if (wwbVar != null && (list = this.B.g) != null) {
                list.remove(wwbVar);
            }
        }
        wwc wwcVar = this.M;
        if (wwcVar != null) {
            j(wwcVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.B = viewPager;
            wwh wwhVar2 = this.Q;
            if (wwhVar2 == null) {
                wwhVar2 = new wwh(this);
                this.Q = wwhVar2;
            }
            wwhVar2.b = 0;
            wwhVar2.a = 0;
            viewPager.d(wwhVar2);
            wwj wwjVar = new wwj(viewPager);
            this.M = wwjVar;
            e(wwjVar);
            fhy fhyVar = viewPager.b;
            if (fhyVar != null) {
                l(fhyVar, true);
            }
            wwb wwbVar2 = this.R;
            if (wwbVar2 == null) {
                wwbVar2 = new wwb(this);
                this.R = wwbVar2;
            }
            wwbVar2.a = true;
            if (viewPager.g == null) {
                viewPager.g = new ArrayList();
            }
            viewPager.g.add(wwbVar2);
            tabLayout = this;
            tabLayout.m(viewPager.c, BitmapDescriptorFactory.HUE_RED, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.B = null;
            tabLayout.l(null, false);
        }
        tabLayout.S = z;
    }

    public final int a() {
        wwg wwgVar = this.G;
        if (wwgVar != null) {
            return wwgVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        g(view);
    }

    public final int b() {
        return this.F.size();
    }

    public final wwg c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (wwg) this.F.get(i);
    }

    public final wwg d() {
        wwg wwgVar = (wwg) E.a();
        if (wwgVar == null) {
            wwgVar = new wwg();
        }
        wwgVar.f = this;
        dzk dzkVar = this.T;
        wwi wwiVar = dzkVar != null ? (wwi) dzkVar.a() : null;
        if (wwiVar == null) {
            wwiVar = new wwi(this, getContext());
        }
        wwiVar.a(wwgVar);
        wwiVar.setFocusable(true);
        wwiVar.setMinimumWidth(p());
        if (TextUtils.isEmpty(wwgVar.b)) {
            wwiVar.setContentDescription(null);
        } else {
            wwiVar.setContentDescription(wwgVar.b);
        }
        wwgVar.g = wwiVar;
        int i = wwgVar.h;
        if (i != -1) {
            wwgVar.g.setId(i);
        }
        return wwgVar;
    }

    @Deprecated
    public final void e(wwc wwcVar) {
        ArrayList arrayList = this.A;
        if (arrayList.contains(wwcVar)) {
            return;
        }
        arrayList.add(wwcVar);
    }

    public final void f(wwg wwgVar, boolean z) {
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        if (wwgVar.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        wwgVar.c = size;
        arrayList.add(size, wwgVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((wwg) arrayList.get(i2)).c == this.a) {
                i = i2;
            }
            ((wwg) arrayList.get(i2)).c = i2;
        }
        this.a = i;
        wwi wwiVar = wwgVar.g;
        wwiVar.setSelected(false);
        wwiVar.setActivated(false);
        wwf wwfVar = this.b;
        int i3 = wwgVar.c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        t(layoutParams);
        wwfVar.addView(wwiVar, i3, layoutParams);
        if (z) {
            wwgVar.a();
        }
    }

    public final void g(View view) {
        if (!(view instanceof wwa)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        wwa wwaVar = (wwa) view;
        wwg wwgVarD = d();
        CharSequence charSequence = wwaVar.a;
        Drawable drawable = wwaVar.b;
        int i = wwaVar.c;
        if (!TextUtils.isEmpty(wwaVar.getContentDescription())) {
            wwgVarD.b = wwaVar.getContentDescription();
            wwgVarD.b();
        }
        f(wwgVarD, this.F.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i;
        i();
        fhy fhyVar = this.O;
        if (fhyVar != null) {
            int iE = fhyVar.e();
            for (int i2 = 0; i2 < iE; i2++) {
                wwg wwgVarD = d();
                if (TextUtils.isEmpty(wwgVarD.b) && !TextUtils.isEmpty(null)) {
                    wwgVarD.g.setContentDescription(null);
                }
                wwgVarD.b();
                f(wwgVarD, false);
            }
            ViewPager viewPager = this.B;
            if (viewPager == null || iE <= 0 || (i = viewPager.c) == a() || i >= b()) {
                return;
            }
            k(c(i), true);
        }
    }

    public final void i() {
        wwf wwfVar = this.b;
        for (int childCount = wwfVar.getChildCount() - 1; childCount >= 0; childCount--) {
            wwi wwiVar = (wwi) wwfVar.getChildAt(childCount);
            wwfVar.removeViewAt(childCount);
            if (wwiVar != null) {
                wwiVar.a(null);
                wwiVar.setSelected(false);
                this.T.b(wwiVar);
            }
            requestLayout();
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            wwg wwgVar = (wwg) it.next();
            it.remove();
            wwgVar.f = null;
            wwgVar.g = null;
            wwgVar.a = null;
            wwgVar.h = -1;
            wwgVar.b = null;
            wwgVar.c = -1;
            wwgVar.d = null;
            E.b(wwgVar);
        }
        this.G = null;
    }

    @Deprecated
    public final void j(wwc wwcVar) {
        this.A.remove(wwcVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.wwg r10, boolean r11) {
        /*
            r9 = this;
            wwg r0 = r9.G
            r1 = -1
            if (r0 != r10) goto L22
            if (r0 == 0) goto L80
            java.util.ArrayList r11 = r9.A
            int r0 = r11.size()
            int r0 = r0 + r1
        Le:
            if (r0 < 0) goto L1c
            java.lang.Object r1 = r11.get(r0)
            wwc r1 = (defpackage.wwc) r1
            r1.a(r10)
            int r0 = r0 + (-1)
            goto Le
        L1c:
            int r10 = r10.c
            r9.r(r10)
            return
        L22:
            if (r10 == 0) goto L28
            int r2 = r10.c
            r4 = r2
            goto L29
        L28:
            r4 = r1
        L29:
            if (r11 == 0) goto L4b
            if (r0 == 0) goto L34
            int r11 = r0.c
            if (r11 != r1) goto L32
            goto L35
        L32:
            r3 = r9
            goto L42
        L34:
            r0 = 0
        L35:
            if (r4 == r1) goto L40
            r7 = 1
            r8 = 1
            r5 = 0
            r6 = 1
            r3 = r9
            r3.m(r4, r5, r6, r7, r8)
            goto L45
        L40:
            r4 = r1
            goto L32
        L42:
            r3.r(r4)
        L45:
            if (r4 == r1) goto L4c
            r3.s(r4)
            goto L4c
        L4b:
            r3 = r9
        L4c:
            r3.G = r10
            if (r0 == 0) goto L69
            com.google.android.material.tabs.TabLayout r9 = r0.f
            if (r9 == 0) goto L69
            java.util.ArrayList r9 = r3.A
            int r11 = r9.size()
            int r11 = r11 + r1
        L5b:
            if (r11 < 0) goto L69
            java.lang.Object r2 = r9.get(r11)
            wwc r2 = (defpackage.wwc) r2
            r2.c(r0)
            int r11 = r11 + (-1)
            goto L5b
        L69:
            if (r10 == 0) goto L80
            java.util.ArrayList r9 = r3.A
            int r11 = r9.size()
            int r11 = r11 + r1
        L72:
            if (r11 < 0) goto L80
            java.lang.Object r0 = r9.get(r11)
            wwc r0 = (defpackage.wwc) r0
            r0.b(r10)
            int r11 = r11 + (-1)
            goto L72
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.k(wwg, boolean):void");
    }

    public final void l(fhy fhyVar, boolean z) {
        DataSetObserver dataSetObserver;
        fhy fhyVar2 = this.O;
        if (fhyVar2 != null && (dataSetObserver = this.P) != null) {
            fhyVar2.d.unregisterObserver(dataSetObserver);
        }
        this.O = fhyVar;
        if (z && fhyVar != null) {
            if (this.P == null) {
                this.P = new wwd(this);
            }
            fhyVar.d.registerObserver(this.P);
        }
        h();
    }

    public final void m(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            wwf wwfVar = this.b;
            if (iRound >= wwfVar.getChildCount()) {
                return;
            }
            if (z2) {
                wwfVar.b.a = Math.round(f2);
                ValueAnimator valueAnimator = wwfVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    wwfVar.a.cancel();
                }
                wwfVar.c(wwfVar.getChildAt(i), wwfVar.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.N;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.N.cancel();
            }
            int iO = o(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < a() && iO >= scrollX) || (i > a() && iO <= scrollX) || i == a();
            if (getLayoutDirection() == 1) {
                z4 = (i < a() && iO <= scrollX) || (i > a() && iO >= scrollX) || i == a();
            }
            if (z4 || this.C == 1 || z3) {
                if (i < 0) {
                    iO = 0;
                }
                scrollTo(iO, 0);
            }
            if (z) {
                s(iRound);
            }
        }
    }

    public final void n(boolean z) {
        int i = 0;
        while (true) {
            wwf wwfVar = this.b;
            if (i >= wwfVar.getChildCount()) {
                return;
            }
            View childAt = wwfVar.getChildAt(i);
            childAt.setMinimumWidth(p());
            t((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        wub.d(this);
        if (this.B == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                v((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.S) {
            v(null, false);
            this.S = false;
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        wwi wwiVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            wwf wwfVar = this.b;
            if (i >= wwfVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = wwfVar.getChildAt(i);
            if ((childAt instanceof wwi) && (drawable = (wwiVar = (wwi) childAt).d) != null) {
                drawable.setBounds(wwiVar.getLeft(), wwiVar.getTop(), wwiVar.getRight(), wwiVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new edg(accessibilityNodeInfo).t(erb.z(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return u() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            java.util.ArrayList r0 = r6.F
            android.content.Context r1 = r6.getContext()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L17
            java.lang.Object r5 = r0.get(r4)
            wwg r5 = (defpackage.wwg) r5
            int r4 = r4 + 1
            goto Lc
        L17:
            r0 = 48
            float r0 = defpackage.woy.E(r1, r0)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L3e
            if (r1 == 0) goto L2f
            goto L51
        L2f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L51
        L3e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L51
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L51
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L51:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L6f
            int r1 = r6.J
            if (r1 <= 0) goto L60
            goto L6d
        L60:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.woy.E(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L6d:
            r6.q = r1
        L6f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lba
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.u
            if (r0 == 0) goto L92
            if (r0 == r5) goto L86
            r1 = 2
            if (r0 == r1) goto L92
            goto Lba
        L86:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L91
            goto L9c
        L91:
            return
        L92:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Lba
        L9c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = getChildMeasureSpec(r8, r0, r1)
            int r6 = r6.getMeasuredWidth()
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            r7.measure(r6, r8)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || u()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        wub.c(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        g(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context) {
        this(context, null);
    }
}
