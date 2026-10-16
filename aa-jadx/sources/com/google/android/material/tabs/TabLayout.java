package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes3.dex */
@defpackage.fih
public class TabLayout extends android.widget.HorizontalScrollView {
    private static final defpackage.dzr E = new defpackage.dzt(16);
    public final java.util.ArrayList A;
    public androidx.viewpager.widget.ViewPager B;
    public int C;
    public defpackage.wva D;
    private final java.util.ArrayList F;
    private defpackage.wxd G;
    private int H;
    private final int I;
    private final int J;
    private final int K;
    private int L;
    private defpackage.wwz M;
    private android.animation.ValueAnimator N;
    private defpackage.fie O;
    private android.database.DataSetObserver P;
    private defpackage.wxe Q;
    private defpackage.wwy R;
    private boolean S;
    private final defpackage.dzr T;
    public int a;
    final defpackage.wxc b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public int i;
    public android.content.res.ColorStateList j;
    public android.content.res.ColorStateList k;
    public android.graphics.drawable.Drawable l;
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
    public final android.animation.TimeInterpolator z;

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        defpackage.wva wwuVar;
        super(defpackage.wyk.a(context, attributeSet, i, com.google.android.projection.gearhead.R.style.Widget_Design_TabLayout), attributeSet, i);
        this.a = -1;
        this.F = new java.util.ArrayList();
        this.i = -1;
        this.H = 0;
        this.q = androidx.car.app.model.Alert.DURATION_SHOW_INDEFINITELY;
        this.x = -1;
        this.A = new java.util.ArrayList();
        this.T = new defpackage.dzs(12);
        android.content.Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        defpackage.wxc wxcVar = new defpackage.wxc(this, context2);
        this.b = wxcVar;
        super.addView(wxcVar, 0, new android.widget.FrameLayout.LayoutParams(-2, -1));
        android.content.res.TypedArray typedArrayA = defpackage.wro.a(context2, attributeSet, defpackage.www.a, i, com.google.android.projection.gearhead.R.style.Widget_Design_TabLayout, 24);
        android.content.res.ColorStateList colorStateListB = defpackage.wpv.b(getBackground());
        if (colorStateListB != null) {
            defpackage.wvd wvdVar = new defpackage.wvd();
            wvdVar.O(colorStateListB);
            wvdVar.K(context2);
            wvdVar.N(getElevation());
            setBackground(wvdVar);
        }
        android.graphics.drawable.Drawable drawableBj = defpackage.sqs.bj(context2, typedArrayA, 5);
        android.graphics.drawable.Drawable drawableMutate = (drawableBj == null ? new android.graphics.drawable.GradientDrawable() : drawableBj).mutate();
        this.l = drawableMutate;
        defpackage.wpv.f(drawableMutate, this.H);
        int i2 = this.x;
        wxcVar.b(i2 == -1 ? this.l.getIntrinsicHeight() : i2);
        int color = typedArrayA.getColor(8, 0);
        this.H = color;
        defpackage.wpv.f(this.l, color);
        n(false);
        wxcVar.b(typedArrayA.getDimensionPixelSize(11, -1));
        int i3 = typedArrayA.getInt(10, 0);
        if (this.t != i3) {
            this.t = i3;
            wxcVar.postInvalidateOnAnimation();
        }
        int i4 = typedArrayA.getInt(7, 0);
        if (i4 != 0) {
            if (i4 == 1) {
                wwuVar = new defpackage.wwu();
            } else {
                if (i4 != 2) {
                    throw new java.lang.IllegalArgumentException(i4 + " is not a valid TabIndicatorAnimationMode");
                }
                wwuVar = new defpackage.wwv();
            }
            this.D = wwuVar;
        } else {
            this.D = new defpackage.wva();
        }
        this.w = typedArrayA.getBoolean(9, true);
        wxcVar.a();
        wxcVar.postInvalidateOnAnimation();
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(16, 0);
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.d = dimensionPixelSize;
        this.c = dimensionPixelSize;
        this.c = typedArrayA.getDimensionPixelSize(19, dimensionPixelSize);
        this.d = typedArrayA.getDimensionPixelSize(20, this.d);
        this.e = typedArrayA.getDimensionPixelSize(18, this.e);
        this.f = typedArrayA.getDimensionPixelSize(17, this.f);
        this.g = true != defpackage.sqs.bq(context2, com.google.android.projection.gearhead.R.attr.isMaterial3Theme, false) ? com.google.android.projection.gearhead.R.attr.textAppearanceButton : com.google.android.projection.gearhead.R.attr.textAppearanceTitleSmall;
        int resourceId = typedArrayA.getResourceId(24, com.google.android.projection.gearhead.R.style.TextAppearance_Design_Tab);
        this.h = resourceId;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, defpackage.ft.x);
        try {
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.j = defpackage.sqs.bi(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayA.hasValue(22)) {
                this.i = typedArrayA.getResourceId(22, resourceId);
            }
            int i5 = this.i;
            if (i5 != -1) {
                android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i5, defpackage.ft.x);
                try {
                    this.n = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) this.m);
                    android.content.res.ColorStateList colorStateListBi = defpackage.sqs.bi(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListBi != null) {
                        this.j = q(this.j.getDefaultColor(), colorStateListBi.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListBi.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (java.lang.Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayA.hasValue(25)) {
                this.j = defpackage.sqs.bi(context2, typedArrayA, 25);
            }
            if (typedArrayA.hasValue(23)) {
                this.j = q(this.j.getDefaultColor(), typedArrayA.getColor(23, 0));
            }
            defpackage.sqs.bi(context2, typedArrayA, 3);
            typedArrayA.getInt(4, -1);
            this.k = defpackage.sqs.bi(context2, typedArrayA, 21);
            this.s = typedArrayA.getInt(6, 300);
            this.z = defpackage.wqn.c(context2, com.google.android.projection.gearhead.R.attr.motionEasingEmphasizedInterpolator, defpackage.wlm.b);
            this.I = typedArrayA.getDimensionPixelSize(14, -1);
            this.J = typedArrayA.getDimensionPixelSize(13, -1);
            this.p = typedArrayA.getResourceId(0, 0);
            this.L = typedArrayA.getDimensionPixelSize(1, 0);
            this.u = typedArrayA.getInt(15, 1);
            this.r = typedArrayA.getInt(2, 0);
            this.v = typedArrayA.getBoolean(12, false);
            this.y = typedArrayA.getBoolean(26, false);
            typedArrayA.recycle();
            android.content.res.Resources resources = getResources();
            this.o = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.design_tab_text_size_2line);
            this.K = resources.getDimensionPixelSize(com.google.android.projection.gearhead.R.dimen.design_tab_scrollable_min_width);
            int i6 = this.u;
            wxcVar.setPaddingRelative((i6 == 0 || i6 == 2) ? java.lang.Math.max(0, this.L - this.c) : 0, 0, 0, 0);
            int i7 = this.u;
            if (i7 == 0) {
                int i8 = this.r;
                if (i8 == 0) {
                    android.util.Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
                } else if (i8 == 1) {
                    wxcVar.setGravity(1);
                } else if (i8 == 2) {
                }
                wxcVar.setGravity(8388611);
            } else if (i7 == 1 || i7 == 2) {
                if (this.r == 2) {
                    android.util.Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
                }
                wxcVar.setGravity(1);
            }
            n(true);
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private final int o(int i, float f) {
        defpackage.wxc wxcVar;
        android.view.View childAt;
        int i2 = this.u;
        if ((i2 != 0 && i2 != 2) || (childAt = (wxcVar = this.b).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        android.view.View childAt2 = i3 < wxcVar.getChildCount() ? wxcVar.getChildAt(i3) : null;
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

    private static android.content.res.ColorStateList q(int i, int i2) {
        return new android.content.res.ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private final void r(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            defpackage.wxc wxcVar = this.b;
            int childCount = wxcVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (wxcVar.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iO = o(i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            if (scrollX != iO) {
                if (this.N == null) {
                    android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
                    this.N = valueAnimator;
                    valueAnimator.setInterpolator(this.z);
                    this.N.setDuration(this.s);
                    this.N.addUpdateListener(new defpackage.wmr(this, 6));
                }
                this.N.setIntValues(scrollX, iO);
                this.N.start();
            }
            int i3 = this.s;
            android.animation.ValueAnimator valueAnimator2 = wxcVar.a;
            if (valueAnimator2 != null && valueAnimator2.isRunning() && wxcVar.b.a != i) {
                wxcVar.a.cancel();
            }
            wxcVar.d(true, i, i3);
            return;
        }
        m(i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, true, true, true);
    }

    private final void s(int i) {
        defpackage.wxc wxcVar = this.b;
        int childCount = wxcVar.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                android.view.View childAt = wxcVar.getChildAt(i2);
                boolean z = i2 == i;
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                } else {
                    childAt.setSelected(z);
                    childAt.setActivated(z);
                    if (childAt instanceof defpackage.wxf) {
                        ((defpackage.wxf) childAt).c();
                    }
                }
                i2++;
            }
        }
    }

    private final void t(android.widget.LinearLayout.LayoutParams layoutParams) {
        if (this.u == 1 && this.r == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
    }

    private final boolean u() {
        int i = this.u;
        return i == 0 || i == 2;
    }

    private final void v(androidx.viewpager.widget.ViewPager viewPager, boolean z) {
        com.google.android.material.tabs.TabLayout tabLayout;
        java.util.List list;
        java.util.List list2;
        androidx.viewpager.widget.ViewPager viewPager2 = this.B;
        if (viewPager2 != null) {
            defpackage.wxe wxeVar = this.Q;
            if (wxeVar != null && (list2 = viewPager2.f) != null) {
                list2.remove(wxeVar);
            }
            defpackage.wwy wwyVar = this.R;
            if (wwyVar != null && (list = this.B.g) != null) {
                list.remove(wwyVar);
            }
        }
        defpackage.wwz wwzVar = this.M;
        if (wwzVar != null) {
            j(wwzVar);
            this.M = null;
        }
        if (viewPager != null) {
            this.B = viewPager;
            defpackage.wxe wxeVar2 = this.Q;
            if (wxeVar2 == null) {
                wxeVar2 = new defpackage.wxe(this);
                this.Q = wxeVar2;
            }
            wxeVar2.b = 0;
            wxeVar2.a = 0;
            viewPager.d(wxeVar2);
            defpackage.wxg wxgVar = new defpackage.wxg(viewPager);
            this.M = wxgVar;
            e(wxgVar);
            defpackage.fie fieVar = viewPager.b;
            if (fieVar != null) {
                l(fieVar, true);
            }
            defpackage.wwy wwyVar2 = this.R;
            if (wwyVar2 == null) {
                wwyVar2 = new defpackage.wwy(this);
                this.R = wwyVar2;
            }
            wwyVar2.a = true;
            if (viewPager.g == null) {
                viewPager.g = new java.util.ArrayList();
            }
            viewPager.g.add(wwyVar2);
            tabLayout = this;
            tabLayout.m(viewPager.c, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, true, true, true);
        } else {
            tabLayout = this;
            tabLayout.B = null;
            tabLayout.l(null, false);
        }
        tabLayout.S = z;
    }

    public final int a() {
        defpackage.wxd wxdVar = this.G;
        if (wxdVar != null) {
            return wxdVar.c;
        }
        return -1;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view) {
        g(view);
    }

    public final int b() {
        return this.F.size();
    }

    public final defpackage.wxd c(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (defpackage.wxd) this.F.get(i);
    }

    public final defpackage.wxd d() {
        defpackage.wxd wxdVar = (defpackage.wxd) E.a();
        if (wxdVar == null) {
            wxdVar = new defpackage.wxd();
        }
        wxdVar.f = this;
        defpackage.dzr dzrVar = this.T;
        defpackage.wxf wxfVar = dzrVar != null ? (defpackage.wxf) dzrVar.a() : null;
        if (wxfVar == null) {
            wxfVar = new defpackage.wxf(this, getContext());
        }
        wxfVar.a(wxdVar);
        wxfVar.setFocusable(true);
        wxfVar.setMinimumWidth(p());
        if (android.text.TextUtils.isEmpty(wxdVar.b)) {
            wxfVar.setContentDescription(null);
        } else {
            wxfVar.setContentDescription(wxdVar.b);
        }
        wxdVar.g = wxfVar;
        int i = wxdVar.h;
        if (i != -1) {
            wxdVar.g.setId(i);
        }
        return wxdVar;
    }

    @java.lang.Deprecated
    public final void e(defpackage.wwz wwzVar) {
        java.util.ArrayList arrayList = this.A;
        if (arrayList.contains(wwzVar)) {
            return;
        }
        arrayList.add(wwzVar);
    }

    public final void f(defpackage.wxd wxdVar, boolean z) {
        java.util.ArrayList arrayList = this.F;
        int size = arrayList.size();
        if (wxdVar.f != this) {
            throw new java.lang.IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        wxdVar.c = size;
        arrayList.add(size, wxdVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((defpackage.wxd) arrayList.get(i2)).c == this.a) {
                i = i2;
            }
            ((defpackage.wxd) arrayList.get(i2)).c = i2;
        }
        this.a = i;
        defpackage.wxf wxfVar = wxdVar.g;
        wxfVar.setSelected(false);
        wxfVar.setActivated(false);
        defpackage.wxc wxcVar = this.b;
        int i3 = wxdVar.c;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
        t(layoutParams);
        wxcVar.addView(wxfVar, i3, layoutParams);
        if (z) {
            wxdVar.a();
        }
    }

    public final void g(android.view.View view) {
        if (!(view instanceof defpackage.wwx)) {
            throw new java.lang.IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        defpackage.wwx wwxVar = (defpackage.wwx) view;
        defpackage.wxd wxdVarD = d();
        java.lang.CharSequence charSequence = wwxVar.a;
        android.graphics.drawable.Drawable drawable = wwxVar.b;
        int i = wwxVar.c;
        if (!android.text.TextUtils.isEmpty(wwxVar.getContentDescription())) {
            wxdVarD.b = wwxVar.getContentDescription();
            wxdVarD.b();
        }
        f(wxdVarD, this.F.isEmpty());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public final void h() {
        int i;
        i();
        defpackage.fie fieVar = this.O;
        if (fieVar != null) {
            int iE = fieVar.e();
            for (int i2 = 0; i2 < iE; i2++) {
                defpackage.wxd wxdVarD = d();
                android.text.TextUtils.isEmpty(wxdVarD.b);
                wxdVarD.b();
                f(wxdVarD, false);
            }
            androidx.viewpager.widget.ViewPager viewPager = this.B;
            if (viewPager == null || iE <= 0 || (i = viewPager.c) == a() || i >= b()) {
                return;
            }
            k(c(i), true);
        }
    }

    public final void i() {
        defpackage.wxc wxcVar = this.b;
        for (int childCount = wxcVar.getChildCount() - 1; childCount >= 0; childCount--) {
            defpackage.wxf wxfVar = (defpackage.wxf) wxcVar.getChildAt(childCount);
            wxcVar.removeViewAt(childCount);
            if (wxfVar != null) {
                wxfVar.a(null);
                wxfVar.setSelected(false);
                this.T.b(wxfVar);
            }
            requestLayout();
        }
        java.util.Iterator it = this.F.iterator();
        while (it.hasNext()) {
            defpackage.wxd wxdVar = (defpackage.wxd) it.next();
            it.remove();
            wxdVar.f = null;
            wxdVar.g = null;
            wxdVar.a = null;
            wxdVar.h = -1;
            wxdVar.b = null;
            wxdVar.c = -1;
            wxdVar.d = null;
            E.b(wxdVar);
        }
        this.G = null;
    }

    @java.lang.Deprecated
    public final void j(defpackage.wwz wwzVar) {
        this.A.remove(wwzVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    public final void k(defpackage.wxd wxdVar, boolean z) {
        com.google.android.material.tabs.TabLayout tabLayout;
        defpackage.wxd wxdVar2 = this.G;
        if (wxdVar2 == wxdVar) {
            if (wxdVar2 != null) {
                java.util.ArrayList arrayList = this.A;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((defpackage.wwz) arrayList.get(size)).a(wxdVar);
                }
                r(wxdVar.c);
                return;
            }
            return;
        }
        int i = wxdVar != null ? wxdVar.c : -1;
        if (z) {
            if (wxdVar2 != null) {
                if (wxdVar2.c != -1) {
                    tabLayout = this;
                    tabLayout.r(i);
                }
                if (i != -1) {
                    tabLayout.s(i);
                }
            } else {
                wxdVar2 = null;
            }
            if (i != -1) {
                tabLayout = this;
                tabLayout.m(i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, true, true, true);
            } else {
                i = -1;
                tabLayout = this;
                tabLayout.r(i);
            }
            if (i != -1) {
                tabLayout.s(i);
            }
        } else {
            tabLayout = this;
        }
        tabLayout.G = wxdVar;
        if (wxdVar2 != null && wxdVar2.f != null) {
            java.util.ArrayList arrayList2 = tabLayout.A;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                ((defpackage.wwz) arrayList2.get(size2)).c(wxdVar2);
            }
        }
        if (wxdVar != null) {
            java.util.ArrayList arrayList3 = tabLayout.A;
            for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                ((defpackage.wwz) arrayList3.get(size3)).b(wxdVar);
            }
        }
    }

    public final void l(defpackage.fie fieVar, boolean z) {
        android.database.DataSetObserver dataSetObserver;
        defpackage.fie fieVar2 = this.O;
        if (fieVar2 != null && (dataSetObserver = this.P) != null) {
            fieVar2.d.unregisterObserver(dataSetObserver);
        }
        this.O = fieVar;
        if (z && fieVar != null) {
            if (this.P == null) {
                this.P = new defpackage.wxa(this);
            }
            fieVar.d.registerObserver(this.P);
        }
        h();
    }

    public final void m(int i, float f, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = java.lang.Math.round(f2);
        if (iRound >= 0) {
            defpackage.wxc wxcVar = this.b;
            if (iRound >= wxcVar.getChildCount()) {
                return;
            }
            if (z2) {
                wxcVar.b.a = java.lang.Math.round(f2);
                android.animation.ValueAnimator valueAnimator = wxcVar.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    wxcVar.a.cancel();
                }
                wxcVar.c(wxcVar.getChildAt(i), wxcVar.getChildAt(i + 1), f);
            }
            android.animation.ValueAnimator valueAnimator2 = this.N;
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
            defpackage.wxc wxcVar = this.b;
            if (i >= wxcVar.getChildCount()) {
                return;
            }
            android.view.View childAt = wxcVar.getChildAt(i);
            childAt.setMinimumWidth(p());
            t((android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.wva.e(this);
        if (this.B == null) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.viewpager.widget.ViewPager) {
                v((androidx.viewpager.widget.ViewPager) parent, true);
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
    protected final void onDraw(android.graphics.Canvas canvas) {
        defpackage.wxf wxfVar;
        android.graphics.drawable.Drawable drawable;
        int i = 0;
        while (true) {
            defpackage.wxc wxcVar = this.b;
            if (i >= wxcVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            android.view.View childAt = wxcVar.getChildAt(i);
            if ((childAt instanceof defpackage.wxf) && (drawable = (wxfVar = (defpackage.wxf) childAt).d) != null) {
                drawable.setBounds(wxfVar.getLeft(), wxfVar.getTop(), wxfVar.getRight(), wxfVar.getBottom());
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new defpackage.edn(accessibilityNodeInfo).t(defpackage.erh.K(1, b(), 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return u() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        java.util.ArrayList arrayList = this.F;
        android.content.Context context = getContext();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
        }
        int iRound = java.lang.Math.round(defpackage.wqn.e(context, 48));
        int mode = android.view.View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && android.view.View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size2 = android.view.View.MeasureSpec.getSize(i);
        if (android.view.View.MeasureSpec.getMode(i) != 0) {
            int iE = this.J;
            if (iE <= 0) {
                iE = (int) (size2 - defpackage.wqn.e(getContext(), 56));
            }
            this.q = iE;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            android.view.View childAt = getChildAt(0);
            int i4 = this.u;
            if (i4 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i4 != 1) {
                if (i4 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || u()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        defpackage.wva.d(this, f);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return java.lang.Math.max(0, ((this.b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight()) > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i) {
        g(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final android.widget.FrameLayout.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        g(view);
    }

    public TabLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.tabStyle);
    }

    public TabLayout(android.content.Context context) {
        this(context, null);
    }
}
