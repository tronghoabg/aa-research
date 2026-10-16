package android.support.v7.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class Toolbar extends android.view.ViewGroup implements defpackage.eak {
    public boolean A;
    public final defpackage.ngb B;
    public defpackage.izq C;
    private android.widget.ImageButton D;
    private int E;
    private int F;
    private int G;
    private int H;
    private android.content.res.ColorStateList I;
    private android.content.res.ColorStateList J;
    private boolean K;
    private boolean L;
    private final java.util.ArrayList M;
    private final int[] N;
    private defpackage.nm O;
    private android.window.OnBackInvokedCallback P;
    private android.window.OnBackInvokedDispatcher Q;
    private final java.lang.Runnable R;
    private final defpackage.izq S;
    public android.support.v7.widget.ActionMenuView a;
    public android.widget.TextView b;
    public android.widget.TextView c;
    public android.widget.ImageView d;
    public android.graphics.drawable.Drawable e;
    public java.lang.CharSequence f;
    public android.widget.ImageButton g;
    public android.view.View h;
    public android.content.Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public defpackage.mv r;
    public java.lang.CharSequence s;
    public java.lang.CharSequence t;
    public final java.util.ArrayList u;
    public java.util.ArrayList v;
    public defpackage.ip w;
    public defpackage.ni x;
    public defpackage.hs y;
    public defpackage.hf z;

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new java.util.ArrayList();
        this.u = new java.util.ArrayList();
        this.N = new int[2];
        this.B = new defpackage.ngb(new defpackage.ap(this, 18));
        this.v = new java.util.ArrayList();
        this.S = new defpackage.izq(this);
        this.R = new defpackage.ap(this, 19, null);
        android.content.Context context2 = getContext();
        int[] iArr = defpackage.ft.y;
        defpackage.lam lamVar = new defpackage.lam(context2, context2.obtainStyledAttributes(attributeSet, iArr, i, 0));
        defpackage.ebt.m(this, context, iArr, attributeSet, (android.content.res.TypedArray) lamVar.a, i, 0);
        this.k = lamVar.q(28, 0);
        this.l = lamVar.q(19, 0);
        this.H = lamVar.o(0, this.H);
        this.m = lamVar.o(2, 48);
        int iL = lamVar.l(22, 0);
        iL = lamVar.y(27) ? lamVar.l(27, iL) : iL;
        this.q = iL;
        this.p = iL;
        this.o = iL;
        this.n = iL;
        int iL2 = lamVar.l(25, -1);
        if (iL2 >= 0) {
            this.n = iL2;
        }
        int iL3 = lamVar.l(24, -1);
        if (iL3 >= 0) {
            this.o = iL3;
        }
        int iL4 = lamVar.l(26, -1);
        if (iL4 >= 0) {
            this.p = iL4;
        }
        int iL5 = lamVar.l(23, -1);
        if (iL5 >= 0) {
            this.q = iL5;
        }
        this.E = lamVar.m(13, -1);
        int iL6 = lamVar.l(9, Integer.MIN_VALUE);
        int iL7 = lamVar.l(5, Integer.MIN_VALUE);
        int iM = lamVar.m(7, 0);
        int iM2 = lamVar.m(8, 0);
        k();
        defpackage.mv mvVar = this.r;
        mvVar.h = false;
        if (iM != Integer.MIN_VALUE) {
            mvVar.e = iM;
            mvVar.a = iM;
        }
        if (iM2 != Integer.MIN_VALUE) {
            mvVar.f = iM2;
            mvVar.b = iM2;
        }
        if (iL6 != Integer.MIN_VALUE || iL7 != Integer.MIN_VALUE) {
            mvVar.a(iL6, iL7);
        }
        this.F = lamVar.l(10, Integer.MIN_VALUE);
        this.G = lamVar.l(6, Integer.MIN_VALUE);
        this.e = lamVar.s(4);
        this.f = lamVar.u(3);
        java.lang.CharSequence charSequenceU = lamVar.u(21);
        if (!android.text.TextUtils.isEmpty(charSequenceU)) {
            v(charSequenceU);
        }
        java.lang.CharSequence charSequenceU2 = lamVar.u(18);
        if (!android.text.TextUtils.isEmpty(charSequenceU2)) {
            u(charSequenceU2);
        }
        this.i = getContext();
        r(lamVar.q(17, 0));
        android.graphics.drawable.Drawable drawableS = lamVar.s(16);
        if (drawableS != null) {
            p(drawableS);
        }
        java.lang.CharSequence charSequenceU3 = lamVar.u(15);
        if (!android.text.TextUtils.isEmpty(charSequenceU3)) {
            o(charSequenceU3);
        }
        android.graphics.drawable.Drawable drawableS2 = lamVar.s(11);
        if (drawableS2 != null) {
            n(drawableS2);
        }
        java.lang.CharSequence charSequenceU4 = lamVar.u(12);
        if (!android.text.TextUtils.isEmpty(charSequenceU4)) {
            if (!android.text.TextUtils.isEmpty(charSequenceU4)) {
                J();
            }
            android.widget.ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(charSequenceU4);
            }
        }
        if (lamVar.y(29)) {
            android.content.res.ColorStateList colorStateListR = lamVar.r(29);
            this.I = colorStateListR;
            android.widget.TextView textView = this.b;
            if (textView != null) {
                textView.setTextColor(colorStateListR);
            }
        }
        if (lamVar.y(20)) {
            android.content.res.ColorStateList colorStateListR2 = lamVar.r(20);
            this.J = colorStateListR2;
            android.widget.TextView textView2 = this.c;
            if (textView2 != null) {
                textView2.setTextColor(colorStateListR2);
            }
        }
        if (lamVar.y(14)) {
            m(lamVar.q(14, 0));
        }
        lamVar.w();
    }

    protected static final defpackage.nj B(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.nj) {
            return new defpackage.nj((defpackage.nj) layoutParams);
        }
        if (layoutParams instanceof defpackage.ed) {
            return new defpackage.nj((defpackage.ed) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.nj((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.nj(layoutParams);
    }

    private final int C(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    private final int D(android.view.View view, int i) {
        defpackage.nj njVar = (defpackage.nj) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = njVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - njVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (iMax < njVar.topMargin) {
            iMax = njVar.topMargin;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            if (i4 < njVar.bottomMargin) {
                iMax = java.lang.Math.max(0, iMax - (njVar.bottomMargin - i4));
            }
        }
        return paddingTop + iMax;
    }

    private final int E(android.view.View view, int i, int[] iArr, int i2) {
        defpackage.nj njVar = (defpackage.nj) view.getLayoutParams();
        int i3 = njVar.leftMargin - iArr[0];
        int iMax = i + java.lang.Math.max(0, i3);
        iArr[0] = java.lang.Math.max(0, -i3);
        int iD = D(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iD, iMax + measuredWidth, view.getMeasuredHeight() + iD);
        return iMax + measuredWidth + njVar.rightMargin;
    }

    private final int F(android.view.View view, int i, int[] iArr, int i2) {
        defpackage.nj njVar = (defpackage.nj) view.getLayoutParams();
        int i3 = njVar.rightMargin - iArr[1];
        int iMax = i - java.lang.Math.max(0, i3);
        iArr[1] = java.lang.Math.max(0, -i3);
        int iD = D(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iD, iMax, view.getMeasuredHeight() + iD);
        return iMax - (measuredWidth + njVar.leftMargin);
    }

    private final int G(android.view.View view, int i, int i2, int i3, int i4, int[] iArr) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = java.lang.Math.max(0, i5) + java.lang.Math.max(0, i6);
        iArr[0] = java.lang.Math.max(0, -i5);
        iArr[1] = java.lang.Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private final void H(java.util.List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = getChildAt(i2);
                defpackage.nj njVar = (defpackage.nj) childAt.getLayoutParams();
                if (njVar.b == 0 && M(childAt) && C(njVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            android.view.View childAt2 = getChildAt(childCount);
            defpackage.nj njVar2 = (defpackage.nj) childAt2.getLayoutParams();
            if (njVar2.b == 0 && M(childAt2) && C(njVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void I(android.view.View view, boolean z) {
        defpackage.nj njVarB;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            njVarB = new defpackage.nj();
        } else {
            njVarB = !checkLayoutParams(layoutParams) ? B(layoutParams) : (defpackage.nj) layoutParams;
        }
        njVarB.b = 1;
        if (!z || this.h == null) {
            addView(view, njVarB);
        } else {
            view.setLayoutParams(njVarB);
            this.u.add(view);
        }
    }

    private final void J() {
        if (this.d == null) {
            this.d = new defpackage.jg(getContext());
        }
    }

    private final void K() {
        if (this.D == null) {
            this.D = new defpackage.jf(getContext(), null, 2130971065);
            defpackage.nj njVar = new defpackage.nj();
            njVar.a = (this.m & 112) | 8388611;
            this.D.setLayoutParams(njVar);
        }
    }

    private final boolean L(android.view.View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean M(android.view.View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private final void N(android.view.View view, int i, int i2, int i3, int i4) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = java.lang.Math.min(android.view.View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final defpackage.nm A() {
        defpackage.nm nmVar = this.O;
        if (nmVar != null) {
            return nmVar;
        }
        defpackage.nm nmVar2 = new defpackage.nm(this, true);
        this.O = nmVar2;
        return nmVar2;
    }

    public final int b() {
        defpackage.mv mvVar = this.r;
        if (mvVar != null) {
            return mvVar.g ? mvVar.b : mvVar.a;
        }
        return 0;
    }

    public final int c() {
        defpackage.hh hhVar;
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (hhVar = actionMenuView.a) == null || !hhVar.hasVisibleItems()) ? fS() : java.lang.Math.max(fS(), java.lang.Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof defpackage.nj);
    }

    public final int d() {
        return e() != null ? java.lang.Math.max(b(), java.lang.Math.max(this.F, 0)) : b();
    }

    public final android.graphics.drawable.Drawable e() {
        android.widget.ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final android.view.Menu f() {
        l();
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            android.view.Menu menuG = actionMenuView.g();
            if (this.x == null) {
                this.x = new defpackage.ni(this);
            }
            this.a.c.o();
            ((defpackage.hh) menuG).h(this.x, this.i);
            w();
        }
        return this.a.g();
    }

    public final int fS() {
        defpackage.mv mvVar = this.r;
        if (mvVar != null) {
            return mvVar.g ? mvVar.a : mvVar.b;
        }
        return 0;
    }

    public final android.view.MenuInflater g() {
        return new defpackage.gs(getContext());
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.nj();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.nj(getContext(), attributeSet);
    }

    public final java.lang.CharSequence h() {
        android.widget.ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final java.util.ArrayList i() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.Menu menuF = f();
        for (int i = 0; i < menuF.size(); i++) {
            arrayList.add(menuF.getItem(i));
        }
        return arrayList;
    }

    public final void j() {
        defpackage.ni niVar = this.x;
        defpackage.hj hjVar = niVar == null ? null : niVar.b;
        if (hjVar != null) {
            hjVar.collapseActionView();
        }
    }

    public final void k() {
        if (this.r == null) {
            this.r = new defpackage.mv();
        }
    }

    public final void l() {
        if (this.a == null) {
            android.support.v7.widget.ActionMenuView actionMenuView = new android.support.v7.widget.ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.j(this.j);
            android.support.v7.widget.ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.i(this.y, new defpackage.it(this, 2));
            defpackage.nj njVar = new defpackage.nj();
            njVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(njVar);
            I(this.a, false);
        }
    }

    public void m(int i) {
        g().inflate(i, f());
    }

    public final void n(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            J();
            if (!L(this.d)) {
                I(this.d, true);
            }
        } else {
            android.widget.ImageView imageView = this.d;
            if (imageView != null && L(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        android.widget.ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void o(java.lang.CharSequence charSequence) {
        if (!android.text.TextUtils.isEmpty(charSequence)) {
            K();
        }
        android.widget.ImageButton imageButton = this.D;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            a$.ExternalSyntheticApiModelOutline1.m(this.D, charSequence);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        w();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // android.view.View
    public final boolean onHoverEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (this.L) {
            i = actionMasked;
        } else {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked != 9) {
                i = actionMasked;
            } else if (!zOnHoverEvent) {
                this.L = true;
            }
        }
        if (i == 10 || i == 3) {
            this.L = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022b  */
    /* JADX WARN: Code duplicated, block: B:102:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0239  */
    /* JADX WARN: Code duplicated, block: B:106:0x023e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0253  */
    /* JADX WARN: Code duplicated, block: B:110:0x0276  */
    /* JADX WARN: Code duplicated, block: B:112:0x0279  */
    /* JADX WARN: Code duplicated, block: B:113:0x029d  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02b4 A[LOOP:0: B:118:0x02b2->B:119:0x02b4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x02cc A[LOOP:1: B:121:0x02ca->B:122:0x02cc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:125:0x02ed A[LOOP:2: B:124:0x02eb->B:125:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:129:0x032d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x032f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0333  */
    /* JADX WARN: Code duplicated, block: B:134:0x033b A[LOOP:3: B:133:0x0339->B:134:0x033b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:28:0x007d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:60:0x0134 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x013d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x0176  */
    /* JADX WARN: Code duplicated, block: B:81:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x018a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x019d  */
    /* JADX WARN: Code duplicated, block: B:88:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:96:0x01de  */
    /* JADX WARN: Code duplicated, block: B:97:0x0202  */
    /* JADX WARN: Code duplicated, block: B:99:0x0205  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iE;
        int iF;
        int iD;
        int iC;
        boolean z2;
        int iMax;
        int iMin;
        boolean zM;
        boolean zM2;
        int measuredHeight;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        defpackage.nj njVar;
        defpackage.nj njVar2;
        boolean z3;
        int i5;
        int paddingTop;
        int i6;
        boolean z4;
        int iMax2;
        int i7;
        int i8;
        int iMax3;
        int i9;
        boolean z5;
        int i10;
        int i11;
        int iMax4;
        int i12;
        java.util.ArrayList arrayList;
        int size;
        int iE2;
        int i13;
        int size2;
        int i14;
        int size3;
        int i15;
        int i16;
        int i17;
        int measuredWidth;
        int i18;
        int i19;
        int size4;
        int i20;
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        android.view.View view4;
        int layoutDirection = getLayoutDirection();
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = width - paddingRight;
        int[] iArr = this.N;
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        iArr[1] = 0;
        iArr[0] = 0;
        int[] iArr2 = defpackage.ebt.a;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? java.lang.Math.min(minimumHeight, i4 - i2) : 0;
        boolean z6 = layoutDirection == 1;
        if (M(this.D)) {
            android.view.View view5 = this.D;
            if (z6) {
                iF = F(view5, i21, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(view5, paddingLeft, iArr, iMin2);
            }
            if (M(this.g)) {
                view4 = this.g;
                if (z6) {
                    iF = F(view4, iF, iArr, iMin2);
                } else {
                    iE = E(view4, iE, iArr, iMin2);
                }
            }
            if (M(this.a)) {
                view3 = this.a;
                if (z6) {
                    iE = E(view3, iE, iArr, iMin2);
                } else {
                    iF = F(view3, iF, iArr, iMin2);
                }
            }
            if (getLayoutDirection() == 1) {
                iD = c();
            } else {
                iD = d();
            }
            if (getLayoutDirection() == 1) {
                iC = d();
            } else {
                iC = c();
            }
            z2 = z6;
            iArr[0] = java.lang.Math.max(0, iD - iE);
            iArr[1] = java.lang.Math.max(0, iC - (i21 - iF));
            iMax = java.lang.Math.max(iE, iD);
            iMin = java.lang.Math.min(iF, i21 - iC);
            if (M(this.h)) {
                view2 = this.h;
                if (z2) {
                    iMin = F(view2, iMin, iArr, iMin2);
                } else {
                    iMax = E(view2, iMax, iArr, iMin2);
                }
            }
            if (M(this.d)) {
                view = this.d;
                if (z2) {
                    iMin = F(view, iMin, iArr, iMin2);
                } else {
                    iMax = E(view, iMax, iArr, iMin2);
                }
            }
            zM = M(this.b);
            zM2 = M(this.c);
            if (zM) {
                defpackage.nj njVar3 = (defpackage.nj) this.b.getLayoutParams();
                measuredHeight = njVar3.bottomMargin + njVar3.topMargin + this.b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zM2) {
                defpackage.nj njVar4 = (defpackage.nj) this.c.getLayoutParams();
                measuredHeight += njVar4.topMargin + this.c.getMeasuredHeight() + njVar4.bottomMargin;
            }
            if (!zM || zM2) {
                if (zM) {
                    textView = this.b;
                } else {
                    textView = this.c;
                }
                if (zM2) {
                    textView2 = this.c;
                } else {
                    textView2 = this.b;
                }
                njVar = (defpackage.nj) textView.getLayoutParams();
                njVar2 = (defpackage.nj) textView2.getLayoutParams();
                z3 = (!zM && this.b.getMeasuredWidth() > 0) || (zM2 && this.c.getMeasuredWidth() > 0);
                i5 = this.H & 112;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + njVar.topMargin + this.p;
                } else if (i5 != 80) {
                    iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    if (iMax4 < njVar.topMargin + this.p) {
                        iMax4 = njVar.topMargin + this.p;
                    } else {
                        i12 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                        if (i12 < njVar.bottomMargin + this.q) {
                            iMax4 = java.lang.Math.max(0, iMax4 - ((njVar2.bottomMargin + this.q) - i12));
                        }
                    }
                    paddingTop = paddingTop2 + iMax4;
                } else {
                    paddingTop = (((height - paddingBottom) - njVar2.bottomMargin) - this.q) - measuredHeight;
                }
                if (z2) {
                    if (z3) {
                        i9 = this.n;
                        z5 = true;
                    } else {
                        i9 = 0;
                        z5 = false;
                    }
                    int i22 = i9 - iArr[1];
                    iMin -= java.lang.Math.max(0, i22);
                    iArr[1] = java.lang.Math.max(0, -i22);
                    if (zM) {
                        defpackage.nj njVar5 = (defpackage.nj) this.b.getLayoutParams();
                        int measuredWidth2 = iMin - this.b.getMeasuredWidth();
                        int measuredHeight2 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i10 = measuredWidth2 - this.o;
                        paddingTop = measuredHeight2 + njVar5.bottomMargin;
                    } else {
                        i10 = iMin;
                    }
                    if (zM2) {
                        defpackage.nj njVar6 = (defpackage.nj) this.c.getLayoutParams();
                        int i23 = paddingTop + njVar6.topMargin;
                        this.c.layout(iMin - this.c.getMeasuredWidth(), i23, iMin, this.c.getMeasuredHeight() + i23);
                        i11 = iMin - this.o;
                        int i24 = njVar6.bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (z5) {
                        iMin = java.lang.Math.min(i10, i11);
                    }
                    iMax3 = iMax;
                } else {
                    if (z3) {
                        i6 = this.n;
                        z4 = true;
                    } else {
                        i6 = 0;
                        z4 = false;
                    }
                    int i25 = i6 - iArr[0];
                    iMax2 = iMax + java.lang.Math.max(0, i25);
                    iArr[0] = java.lang.Math.max(0, -i25);
                    if (zM) {
                        defpackage.nj njVar7 = (defpackage.nj) this.b.getLayoutParams();
                        int measuredWidth3 = this.b.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.b.getMeasuredHeight() + paddingTop;
                        this.b.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i7 = measuredWidth3 + this.o;
                        paddingTop = measuredHeight3 + njVar7.bottomMargin;
                    } else {
                        i7 = iMax2;
                    }
                    if (zM2) {
                        defpackage.nj njVar8 = (defpackage.nj) this.c.getLayoutParams();
                        int i26 = paddingTop + njVar8.topMargin;
                        int measuredWidth4 = this.c.getMeasuredWidth() + iMax2;
                        this.c.layout(iMax2, i26, measuredWidth4, this.c.getMeasuredHeight() + i26);
                        i8 = measuredWidth4 + this.o;
                        int i27 = njVar8.bottomMargin;
                    } else {
                        i8 = iMax2;
                    }
                    if (z4) {
                        iMax3 = java.lang.Math.max(i7, i8);
                    } else {
                        iMax3 = iMax2;
                    }
                }
            } else {
                iMax3 = iMax;
                width = width;
            }
            arrayList = this.M;
            H(arrayList, 3);
            size = arrayList.size();
            iE2 = iMax3;
            for (i13 = 0; i13 < size; i13++) {
                iE2 = E((android.view.View) arrayList.get(i13), iE2, iArr, iMin2);
            }
            H(arrayList, 5);
            size2 = arrayList.size();
            for (i14 = 0; i14 < size2; i14++) {
                iMin = F((android.view.View) arrayList.get(i14), iMin, iArr, iMin2);
            }
            H(arrayList, 1);
            int i28 = iArr[0];
            int i29 = iArr[1];
            size3 = arrayList.size();
            i15 = i29;
            i16 = i28;
            i17 = 0;
            measuredWidth = 0;
            while (i17 < size3) {
                android.view.View view6 = (android.view.View) arrayList.get(i17);
                defpackage.nj njVar9 = (defpackage.nj) view6.getLayoutParams();
                int i30 = njVar9.leftMargin - i16;
                int i31 = njVar9.rightMargin - i15;
                int iMax5 = java.lang.Math.max(0, i30);
                int iMax6 = java.lang.Math.max(0, i31);
                int iMax7 = java.lang.Math.max(0, -i30);
                int iMax8 = java.lang.Math.max(0, -i31);
                measuredWidth += iMax5 + view6.getMeasuredWidth() + iMax6;
                i17++;
                i15 = iMax8;
                i16 = iMax7;
            }
            i18 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
            i19 = measuredWidth + i18;
            if (i18 >= iE2) {
                if (i19 > iMin) {
                    iE2 = i18 - (i19 - iMin);
                } else {
                    iE2 = i18;
                }
            }
            size4 = arrayList.size();
            for (i20 = 0; i20 < size4; i20++) {
                iE2 = E((android.view.View) arrayList.get(i20), iE2, iArr, iMin2);
            }
            arrayList.clear();
        }
        iE = paddingLeft;
        iF = i21;
        if (M(this.g)) {
            view4 = this.g;
            if (z6) {
                iF = F(view4, iF, iArr, iMin2);
            } else {
                iE = E(view4, iE, iArr, iMin2);
            }
        }
        if (M(this.a)) {
            view3 = this.a;
            if (z6) {
                iE = E(view3, iE, iArr, iMin2);
            } else {
                iF = F(view3, iF, iArr, iMin2);
            }
        }
        if (getLayoutDirection() == 1) {
            iD = c();
        } else {
            iD = d();
        }
        if (getLayoutDirection() == 1) {
            iC = d();
        } else {
            iC = c();
        }
        z2 = z6;
        iArr[0] = java.lang.Math.max(0, iD - iE);
        iArr[1] = java.lang.Math.max(0, iC - (i21 - iF));
        iMax = java.lang.Math.max(iE, iD);
        iMin = java.lang.Math.min(iF, i21 - iC);
        if (M(this.h)) {
            view2 = this.h;
            if (z2) {
                iMin = F(view2, iMin, iArr, iMin2);
            } else {
                iMax = E(view2, iMax, iArr, iMin2);
            }
        }
        if (M(this.d)) {
            view = this.d;
            if (z2) {
                iMin = F(view, iMin, iArr, iMin2);
            } else {
                iMax = E(view, iMax, iArr, iMin2);
            }
        }
        zM = M(this.b);
        zM2 = M(this.c);
        if (zM) {
            defpackage.nj njVar10 = (defpackage.nj) this.b.getLayoutParams();
            measuredHeight = njVar10.bottomMargin + njVar10.topMargin + this.b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zM2) {
            defpackage.nj njVar11 = (defpackage.nj) this.c.getLayoutParams();
            measuredHeight += njVar11.topMargin + this.c.getMeasuredHeight() + njVar11.bottomMargin;
        }
        if (zM) {
            if (zM) {
                textView = this.b;
            } else {
                textView = this.c;
            }
            if (zM2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            njVar = (defpackage.nj) textView.getLayoutParams();
            njVar2 = (defpackage.nj) textView2.getLayoutParams();
            if (zM) {
            }
            i5 = this.H & 112;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + njVar.topMargin + this.p;
            } else if (i5 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                if (iMax4 < njVar.topMargin + this.p) {
                    iMax4 = njVar.topMargin + this.p;
                } else {
                    i12 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    if (i12 < njVar.bottomMargin + this.q) {
                        iMax4 = java.lang.Math.max(0, iMax4 - ((njVar2.bottomMargin + this.q) - i12));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - njVar2.bottomMargin) - this.q) - measuredHeight;
            }
            if (z2) {
                if (z3) {
                    i9 = this.n;
                    z5 = true;
                } else {
                    i9 = 0;
                    z5 = false;
                }
                int i210 = i9 - iArr[1];
                iMin -= java.lang.Math.max(0, i210);
                iArr[1] = java.lang.Math.max(0, -i210);
                if (zM) {
                    defpackage.nj njVar12 = (defpackage.nj) this.b.getLayoutParams();
                    int measuredWidth5 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight4 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i10 = measuredWidth5 - this.o;
                    paddingTop = measuredHeight4 + njVar12.bottomMargin;
                } else {
                    i10 = iMin;
                }
                if (zM2) {
                    defpackage.nj njVar13 = (defpackage.nj) this.c.getLayoutParams();
                    int i211 = paddingTop + njVar13.topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i211, iMin, this.c.getMeasuredHeight() + i211);
                    i11 = iMin - this.o;
                    int i212 = njVar13.bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z5) {
                    iMin = java.lang.Math.min(i10, i11);
                }
                iMax3 = iMax;
            } else {
                if (z3) {
                    i6 = this.n;
                    z4 = true;
                } else {
                    i6 = 0;
                    z4 = false;
                }
                int i213 = i6 - iArr[0];
                iMax2 = iMax + java.lang.Math.max(0, i213);
                iArr[0] = java.lang.Math.max(0, -i213);
                if (zM) {
                    defpackage.nj njVar14 = (defpackage.nj) this.b.getLayoutParams();
                    int measuredWidth6 = this.b.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i7 = measuredWidth6 + this.o;
                    paddingTop = measuredHeight5 + njVar14.bottomMargin;
                } else {
                    i7 = iMax2;
                }
                if (zM2) {
                    defpackage.nj njVar15 = (defpackage.nj) this.c.getLayoutParams();
                    int i214 = paddingTop + njVar15.topMargin;
                    int measuredWidth7 = this.c.getMeasuredWidth() + iMax2;
                    this.c.layout(iMax2, i214, measuredWidth7, this.c.getMeasuredHeight() + i214);
                    i8 = measuredWidth7 + this.o;
                    int i215 = njVar15.bottomMargin;
                } else {
                    i8 = iMax2;
                }
                if (z4) {
                    iMax3 = java.lang.Math.max(i7, i8);
                } else {
                    iMax3 = iMax2;
                }
            }
        } else {
            if (zM) {
                textView = this.b;
            } else {
                textView = this.c;
            }
            if (zM2) {
                textView2 = this.c;
            } else {
                textView2 = this.b;
            }
            njVar = (defpackage.nj) textView.getLayoutParams();
            njVar2 = (defpackage.nj) textView2.getLayoutParams();
            if (zM) {
            }
            i5 = this.H & 112;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + njVar.topMargin + this.p;
            } else if (i5 != 80) {
                iMax4 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                if (iMax4 < njVar.topMargin + this.p) {
                    iMax4 = njVar.topMargin + this.p;
                } else {
                    i12 = (((height - paddingBottom) - measuredHeight) - iMax4) - paddingTop2;
                    if (i12 < njVar.bottomMargin + this.q) {
                        iMax4 = java.lang.Math.max(0, iMax4 - ((njVar2.bottomMargin + this.q) - i12));
                    }
                }
                paddingTop = paddingTop2 + iMax4;
            } else {
                paddingTop = (((height - paddingBottom) - njVar2.bottomMargin) - this.q) - measuredHeight;
            }
            if (z2) {
                if (z3) {
                    i9 = this.n;
                    z5 = true;
                } else {
                    i9 = 0;
                    z5 = false;
                }
                int i216 = i9 - iArr[1];
                iMin -= java.lang.Math.max(0, i216);
                iArr[1] = java.lang.Math.max(0, -i216);
                if (zM) {
                    defpackage.nj njVar16 = (defpackage.nj) this.b.getLayoutParams();
                    int measuredWidth8 = iMin - this.b.getMeasuredWidth();
                    int measuredHeight6 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i10 = measuredWidth8 - this.o;
                    paddingTop = measuredHeight6 + njVar16.bottomMargin;
                } else {
                    i10 = iMin;
                }
                if (zM2) {
                    defpackage.nj njVar17 = (defpackage.nj) this.c.getLayoutParams();
                    int i217 = paddingTop + njVar17.topMargin;
                    this.c.layout(iMin - this.c.getMeasuredWidth(), i217, iMin, this.c.getMeasuredHeight() + i217);
                    i11 = iMin - this.o;
                    int i218 = njVar17.bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (z5) {
                    iMin = java.lang.Math.min(i10, i11);
                }
                iMax3 = iMax;
            } else {
                if (z3) {
                    i6 = this.n;
                    z4 = true;
                } else {
                    i6 = 0;
                    z4 = false;
                }
                int i219 = i6 - iArr[0];
                iMax2 = iMax + java.lang.Math.max(0, i219);
                iArr[0] = java.lang.Math.max(0, -i219);
                if (zM) {
                    defpackage.nj njVar18 = (defpackage.nj) this.b.getLayoutParams();
                    int measuredWidth9 = this.b.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.b.getMeasuredHeight() + paddingTop;
                    this.b.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i7 = measuredWidth9 + this.o;
                    paddingTop = measuredHeight7 + njVar18.bottomMargin;
                } else {
                    i7 = iMax2;
                }
                if (zM2) {
                    defpackage.nj njVar19 = (defpackage.nj) this.c.getLayoutParams();
                    int i2110 = paddingTop + njVar19.topMargin;
                    int measuredWidth10 = this.c.getMeasuredWidth() + iMax2;
                    this.c.layout(iMax2, i2110, measuredWidth10, this.c.getMeasuredHeight() + i2110);
                    i8 = measuredWidth10 + this.o;
                    int i2111 = njVar19.bottomMargin;
                } else {
                    i8 = iMax2;
                }
                if (z4) {
                    iMax3 = java.lang.Math.max(i7, i8);
                } else {
                    iMax3 = iMax2;
                }
            }
        }
        arrayList = this.M;
        H(arrayList, 3);
        size = arrayList.size();
        iE2 = iMax3;
        while (i13 < size) {
            iE2 = E((android.view.View) arrayList.get(i13), iE2, iArr, iMin2);
        }
        H(arrayList, 5);
        size2 = arrayList.size();
        while (i14 < size2) {
            iMin = F((android.view.View) arrayList.get(i14), iMin, iArr, iMin2);
        }
        H(arrayList, 1);
        int i220 = iArr[0];
        int i221 = iArr[1];
        size3 = arrayList.size();
        i15 = i221;
        i16 = i220;
        i17 = 0;
        measuredWidth = 0;
        while (i17 < size3) {
            android.view.View view7 = (android.view.View) arrayList.get(i17);
            defpackage.nj njVar20 = (defpackage.nj) view7.getLayoutParams();
            int i32 = njVar20.leftMargin - i16;
            int i33 = njVar20.rightMargin - i15;
            int iMax9 = java.lang.Math.max(0, i32);
            int iMax10 = java.lang.Math.max(0, i33);
            int iMax11 = java.lang.Math.max(0, -i32);
            int iMax12 = java.lang.Math.max(0, -i33);
            measuredWidth += iMax9 + view7.getMeasuredWidth() + iMax10;
            i17++;
            i15 = iMax12;
            i16 = iMax11;
        }
        i18 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (measuredWidth / 2);
        i19 = measuredWidth + i18;
        if (i18 >= iE2) {
            if (i19 > iMin) {
                iE2 = i18 - (i19 - iMin);
            } else {
                iE2 = i18;
            }
        }
        size4 = arrayList.size();
        while (i20 < size4) {
            iE2 = E((android.view.View) arrayList.get(i20), iE2, iArr, iMin2);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int marginStart;
        int iMax;
        int iCombineMeasuredStates;
        int marginStart2;
        int[] iArr;
        int iCombineMeasuredStates2;
        int i3;
        int layoutDirection = getLayoutDirection();
        int iMax2 = 0;
        if (M(this.D)) {
            N(this.D, i, 0, i2, this.E);
            int measuredWidth = this.D.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            marginStart = measuredWidth + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            int measuredHeight = this.D.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) this.D.getLayoutParams();
            iMax = java.lang.Math.max(0, measuredHeight + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(0, this.D.getMeasuredState());
        } else {
            marginStart = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.g)) {
            N(this.g, i, 0, i2, this.E);
            int measuredWidth2 = this.g.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = (android.view.ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            marginStart = measuredWidth2 + marginLayoutParams3.getMarginStart() + marginLayoutParams3.getMarginEnd();
            int measuredHeight2 = this.g.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = (android.view.ViewGroup.MarginLayoutParams) this.g.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight2 + marginLayoutParams4.topMargin + marginLayoutParams4.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.g.getMeasuredState());
        }
        int[] iArr2 = this.N;
        char c = layoutDirection == 1 ? (char) 1 : (char) 0;
        int iD = d();
        int iMax3 = java.lang.Math.max(iD, marginStart);
        iArr2[c] = java.lang.Math.max(0, iD - marginStart);
        if (M(this.a)) {
            N(this.a, i, iMax3, i2, this.E);
            int measuredWidth3 = this.a.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams5 = (android.view.ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
            marginStart2 = measuredWidth3 + marginLayoutParams5.getMarginStart() + marginLayoutParams5.getMarginEnd();
            int measuredHeight3 = this.a.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams6 = (android.view.ViewGroup.MarginLayoutParams) this.a.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight3 + marginLayoutParams6.topMargin + marginLayoutParams6.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.a.getMeasuredState());
        } else {
            marginStart2 = 0;
        }
        int iC = c();
        int iMax4 = iMax3 + java.lang.Math.max(iC, marginStart2);
        iArr2[c ^ 1] = java.lang.Math.max(0, iC - marginStart2);
        if (M(this.h)) {
            iArr = iArr2;
            iMax4 += G(this.h, i, iMax4, i2, 0, iArr);
            int measuredHeight4 = this.h.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams7 = (android.view.ViewGroup.MarginLayoutParams) this.h.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight4 + marginLayoutParams7.topMargin + marginLayoutParams7.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (M(this.d)) {
            iMax4 += G(this.d, i, iMax4, i2, 0, iArr);
            int measuredHeight5 = this.d.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams8 = (android.view.ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            iMax = java.lang.Math.max(iMax, measuredHeight5 + marginLayoutParams8.topMargin + marginLayoutParams8.bottomMargin);
            iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            android.view.View childAt = getChildAt(i4);
            if (((defpackage.nj) childAt.getLayoutParams()).b == 0 && M(childAt)) {
                iMax4 += G(childAt, i, iMax4, i2, 0, iArr);
                int measuredHeight6 = childAt.getMeasuredHeight();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams9 = (android.view.ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int iMax5 = java.lang.Math.max(iMax, measuredHeight6 + marginLayoutParams9.topMargin + marginLayoutParams9.bottomMargin);
                iCombineMeasuredStates = android.view.View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i5 = iMax4;
        int i6 = this.p + this.q;
        int i7 = this.n + this.o;
        if (M(this.b)) {
            G(this.b, i, i5 + i7, i2, i6, iArr);
            int measuredWidth4 = this.b.getMeasuredWidth();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams10 = (android.view.ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            iMax2 = measuredWidth4 + marginLayoutParams10.getMarginStart() + marginLayoutParams10.getMarginEnd();
            int measuredHeight7 = this.b.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams11 = (android.view.ViewGroup.MarginLayoutParams) this.b.getLayoutParams();
            int i8 = measuredHeight7 + marginLayoutParams11.topMargin + marginLayoutParams11.bottomMargin;
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates, this.b.getMeasuredState());
            i3 = i8;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            i3 = 0;
        }
        if (M(this.c)) {
            iMax2 = java.lang.Math.max(iMax2, G(this.c, i, i5 + i7, i2, i3 + i6, iArr));
            int measuredHeight8 = this.c.getMeasuredHeight();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams12 = (android.view.ViewGroup.MarginLayoutParams) this.c.getLayoutParams();
            i3 += measuredHeight8 + marginLayoutParams12.topMargin + marginLayoutParams12.bottomMargin;
            iCombineMeasuredStates2 = android.view.View.combineMeasuredStates(iCombineMeasuredStates2, this.c.getMeasuredState());
        }
        if (M(this.b) || M(this.c)) {
            i3 += i6;
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(i5 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(java.lang.Math.max(iMax, i3) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.MenuItem menuItemFindItem;
        if (!(parcelable instanceof android.support.v7.widget.Toolbar.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.support.v7.widget.Toolbar.SavedState savedState = (android.support.v7.widget.Toolbar.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        defpackage.hh hhVar = actionMenuView != null ? actionMenuView.a : null;
        int i = savedState.a;
        if (i != 0 && this.x != null && hhVar != null && (menuItemFindItem = hhVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.b) {
            java.lang.Runnable runnable = this.R;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        k();
        defpackage.mv mvVar = this.r;
        boolean z = mvVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        mvVar.g = z2;
        if (!mvVar.h) {
            mvVar.a = mvVar.e;
            mvVar.b = mvVar.f;
            return;
        }
        if (z2) {
            int i2 = mvVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = mvVar.e;
            }
            mvVar.a = i2;
            int i3 = mvVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = mvVar.f;
            }
            mvVar.b = i3;
            return;
        }
        int i4 = mvVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = mvVar.e;
        }
        mvVar.a = i4;
        int i5 = mvVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = mvVar.f;
        }
        mvVar.b = i5;
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
        defpackage.hj hjVar;
        android.support.v7.widget.Toolbar.SavedState savedState = new android.support.v7.widget.Toolbar.SavedState(super.onSaveInstanceState());
        defpackage.ni niVar = this.x;
        if (niVar != null && (hjVar = niVar.b) != null) {
            savedState.a = hjVar.a;
        }
        savedState.b = y();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!zOnTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public void p(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            K();
            if (!L(this.D)) {
                I(this.D, true);
            }
        } else {
            android.widget.ImageButton imageButton = this.D;
            if (imageButton != null && L(imageButton)) {
                removeView(this.D);
                this.u.remove(this.D);
            }
        }
        android.widget.ImageButton imageButton2 = this.D;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void q(android.view.View.OnClickListener onClickListener) {
        K();
        this.D.setOnClickListener(onClickListener);
    }

    public final void r(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @Override // defpackage.eak
    public final void s(defpackage.izq izqVar) {
        this.B.C(izqVar);
    }

    @Override // defpackage.eak
    public final void t(defpackage.izq izqVar) {
        this.B.D(izqVar);
    }

    public void u(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.c;
        if (!zIsEmpty) {
            if (textView == null) {
                android.content.Context context = getContext();
                defpackage.kb kbVar = new defpackage.kb(context);
                this.c = kbVar;
                kbVar.setSingleLine();
                this.c.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!L(this.c)) {
                I(this.c, true);
            }
        } else if (textView != null && L(textView)) {
            removeView(this.c);
            this.u.remove(this.c);
        }
        android.widget.TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public void v(java.lang.CharSequence charSequence) {
        boolean zIsEmpty = android.text.TextUtils.isEmpty(charSequence);
        android.widget.TextView textView = this.b;
        if (!zIsEmpty) {
            if (textView == null) {
                android.content.Context context = getContext();
                defpackage.kb kbVar = new defpackage.kb(context);
                this.b = kbVar;
                kbVar.setSingleLine();
                this.b.setEllipsize(android.text.TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                android.content.res.ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!L(this.b)) {
                I(this.b, true);
            }
        } else if (textView != null && L(textView)) {
            removeView(this.b);
            this.u.remove(this.b);
        }
        android.widget.TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void w() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM = ag$.ExternalSyntheticApiModelOutline0.m(this);
            if (!x() || onBackInvokedDispatcherM == null || !isAttachedToWindow() || !this.A) {
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    ag$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcher, this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    this.P = new nh(new defpackage.ku(this, 7, null), 0);
                }
                ag$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, 1000000, this.P);
                this.Q = onBackInvokedDispatcherM;
            }
        }
    }

    public final boolean x() {
        defpackage.ni niVar = this.x;
        return (niVar == null || niVar.b == null) ? false : true;
    }

    public final boolean y() {
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.m();
    }

    public final boolean z() {
        defpackage.ip ipVar;
        android.support.v7.widget.ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ipVar = actionMenuView.c) == null || !ipVar.m()) ? false : true;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return B(layoutParams);
    }

    public Toolbar(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130971066);
    }

    public Toolbar(android.content.Context context) {
        this(context, null);
    }
}
