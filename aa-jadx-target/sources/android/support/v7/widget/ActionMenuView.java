package android.support.v7.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ActionMenuView extends android.support.v7.widget.LinearLayoutCompat implements defpackage.hg, defpackage.hv {
    public defpackage.hh a;
    public boolean b;
    public defpackage.ip c;
    public defpackage.hf d;
    public defpackage.izq e;
    private android.content.Context i;
    private int j;
    private defpackage.hs k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        t();
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }

    public static final defpackage.is n() {
        defpackage.is isVar = new defpackage.is();
        isVar.gravity = 16;
        return isVar;
    }

    public static final defpackage.is o(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return n();
        }
        defpackage.is isVar = layoutParams instanceof defpackage.is ? new defpackage.is((defpackage.is) layoutParams) : new defpackage.is(layoutParams);
        if (isVar.gravity <= 0) {
            isVar.gravity = 16;
        }
        return isVar;
    }

    @Override // defpackage.hv
    public final void a(defpackage.hh hhVar) {
        this.a = hhVar;
    }

    @Override // defpackage.hg
    public final boolean b(defpackage.hj hjVar) {
        return this.a.z(hjVar, null, 0);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.is generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.is(getContext(), attributeSet);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof defpackage.is;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ defpackage.le generateDefaultLayoutParams() {
        return n();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: fU */
    protected final /* bridge */ /* synthetic */ defpackage.le generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    public final android.view.Menu g() {
        if (this.a == null) {
            android.content.Context context = getContext();
            defpackage.hh hhVar = new defpackage.hh(context);
            this.a = hhVar;
            hhVar.p(new defpackage.it(this, 0));
            defpackage.ip ipVar = new defpackage.ip(context);
            this.c = ipVar;
            ipVar.p();
            defpackage.ip ipVar2 = this.c;
            ir irVar = this.k;
            if (irVar == null) {
                irVar = new ir();
            }
            ipVar2.e = irVar;
            this.a.h(this.c, this.i);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return n();
    }

    public final void h() {
        defpackage.ip ipVar = this.c;
        if (ipVar != null) {
            ipVar.n();
        }
    }

    public final void i(defpackage.hs hsVar, defpackage.hf hfVar) {
        this.k = hsVar;
        this.d = hfVar;
    }

    public final void j(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new android.view.ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public final void k(defpackage.ip ipVar) {
        this.c = ipVar;
        ipVar.j(this);
    }

    protected final boolean l(int i) {
        boolean zC = false;
        if (i == 0) {
            return false;
        }
        android.view.KeyEvent.Callback childAt = getChildAt(i - 1);
        android.view.KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof defpackage.iq)) {
            zC = ((defpackage.iq) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof defpackage.iq)) ? zC : ((defpackage.iq) childAt2).d() | zC;
    }

    public final boolean m() {
        defpackage.ip ipVar = this.c;
        return ipVar != null && ipVar.l();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        defpackage.ip ipVar = this.c;
        if (ipVar != null) {
            ipVar.i();
            if (this.c.l()) {
                this.c.k();
                this.c.m();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int paddingLeft;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        int layoutDirection = getLayoutDirection();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i5 = i6 / 2;
            if (i9 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                defpackage.is isVar = (defpackage.is) childAt.getLayoutParams();
                if (isVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i9)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (layoutDirection == 1) {
                        paddingLeft = getPaddingLeft() + isVar.leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - isVar.rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i12 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + isVar.leftMargin) + isVar.rightMargin;
                    l(i9);
                    i11++;
                }
            }
            i9++;
        }
        if (childCount == 1) {
            if (i10 == 0) {
                android.view.View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = i5 - (measuredHeight2 / 2);
                int i14 = (i8 / 2) - (measuredWidth2 / 2);
                childAt2.layout(i14, i13, measuredWidth2 + i14, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i15 = i11 - (i10 ^ 1);
        int iMax = java.lang.Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (layoutDirection == 1) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                android.view.View childAt3 = getChildAt(i16);
                defpackage.is isVar2 = (defpackage.is) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !isVar2.a) {
                    int i17 = width2 - isVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + isVar2.leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt4 = getChildAt(i19);
            defpackage.is isVar3 = (defpackage.is) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !isVar3.a) {
                int i20 = paddingLeft2 + isVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft2 = i20 + measuredWidth4 + isVar3.rightMargin + iMax;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0130  */
    /* JADX WARN: Code duplicated, block: B:72:0x014a  */
    /* JADX WARN: Code duplicated, block: B:75:0x015d  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        boolean z2;
        ?? r3;
        boolean z3;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        defpackage.hh hhVar;
        boolean z6 = this.l;
        boolean z7 = android.view.View.MeasureSpec.getMode(i) == 1073741824;
        this.l = z7;
        if (z6 != z7) {
            this.m = 0;
        }
        int size = android.view.View.MeasureSpec.getSize(i);
        if (this.l && (hhVar = this.a) != null && size != this.m) {
            this.m = size;
            hhVar.l(true);
        }
        int childCount = getChildCount();
        if (!this.l || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                defpackage.is isVar = (defpackage.is) getChildAt(i11).getLayoutParams();
                isVar.rightMargin = 0;
                isVar.leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i2);
        int size2 = android.view.View.MeasureSpec.getSize(i);
        int size3 = android.view.View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = getChildMeasureSpec(i2, paddingTop, -2);
        int i12 = size2 - paddingLeft;
        int i13 = this.n;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = i13 + (i15 / i14);
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z8 = false;
        int iMax = 0;
        int iMax2 = 0;
        long j2 = 0;
        while (i19 < childCount2) {
            android.view.View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                i7 = size3;
                i8 = i16;
                i9 = paddingTop;
            } else {
                boolean z9 = childAt instanceof android.support.v7.view.menu.ActionMenuItemView;
                i17++;
                if (z9) {
                    int i20 = this.o;
                    r3 = 0;
                    childAt.setPadding(i20, 0, i20, 0);
                    z3 = true;
                } else {
                    r3 = 0;
                    z3 = false;
                }
                boolean z10 = z3;
                defpackage.is isVar2 = (defpackage.is) childAt.getLayoutParams();
                isVar2.f = r3;
                isVar2.c = r3;
                isVar2.b = r3;
                isVar2.d = r3;
                isVar2.leftMargin = r3;
                isVar2.rightMargin = r3;
                isVar2.e = z10 && ((android.support.v7.view.menu.ActionMenuItemView) childAt).b();
                i7 = size3;
                int i21 = true != isVar2.a ? i14 : 1;
                defpackage.is isVar3 = (defpackage.is) childAt.getLayoutParams();
                i8 = i16;
                i9 = paddingTop;
                int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, android.view.View.MeasureSpec.getMode(childMeasureSpec));
                android.support.v7.view.menu.ActionMenuItemView actionMenuItemView = z9 ? (android.support.v7.view.menu.ActionMenuItemView) childAt : null;
                boolean z11 = actionMenuItemView != null && actionMenuItemView.b();
                if (i21 > 0) {
                    z4 = z11;
                    if (!z11 || i21 >= 2) {
                        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i21 * i8, Integer.MIN_VALUE), iMakeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i10 = measuredWidth / i8;
                        if (measuredWidth % i8 != 0) {
                            i10++;
                        }
                        if (z4 && i10 < 2) {
                            i10 = 2;
                        }
                    }
                    if (isVar3.a && z4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    isVar3.d = z5;
                    isVar3.b = i10;
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i10 * i8, 1073741824), iMakeMeasureSpec);
                    iMax = java.lang.Math.max(iMax, i10);
                    if (isVar2.d) {
                        i18++;
                    }
                    z8 |= isVar2.a;
                    i14 -= i10;
                    iMax2 = java.lang.Math.max(iMax2, childAt.getMeasuredHeight());
                    if (i10 == 1) {
                        j2 |= (long) (1 << i19);
                    }
                } else {
                    z4 = z11;
                }
                i10 = 0;
                if (isVar3.a) {
                    z5 = false;
                } else {
                    z5 = false;
                }
                isVar3.d = z5;
                isVar3.b = i10;
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i10 * i8, 1073741824), iMakeMeasureSpec);
                iMax = java.lang.Math.max(iMax, i10);
                if (isVar2.d) {
                    i18++;
                }
                z8 |= isVar2.a;
                i14 -= i10;
                iMax2 = java.lang.Math.max(iMax2, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= (long) (1 << i19);
                }
            }
            i19++;
            size3 = i7;
            paddingTop = i9;
            i16 = i8;
        }
        int i22 = size3;
        int i23 = i16;
        int i24 = iMax;
        int i25 = iMax2;
        if (z8 && i17 == 2) {
            z = true;
            i17 = 2;
        } else {
            z = false;
        }
        boolean z12 = false;
        while (true) {
            if (i18 <= 0 || i14 <= 0) {
                i3 = i25;
                i4 = 1;
                j = 1;
                break;
            }
            int i26 = Integer.MAX_VALUE;
            long j3 = 0;
            int i27 = 0;
            int i28 = 0;
            j = 1;
            while (i28 < childCount2) {
                int i29 = i25;
                defpackage.is isVar4 = (defpackage.is) getChildAt(i28).getLayoutParams();
                boolean z13 = z;
                if (isVar4.d) {
                    int i30 = isVar4.b;
                    if (i30 < i26) {
                        j3 = 1 << i28;
                        i26 = i30;
                        i27 = 1;
                    } else if (i30 == i26) {
                        j3 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z = z13;
                i25 = i29;
            }
            i3 = i25;
            boolean z14 = z;
            j2 |= j3;
            if (i27 > i14) {
                i4 = 1;
                break;
            }
            int i31 = i26 + 1;
            for (int i32 = 0; i32 < childCount2; i32++) {
                android.view.View childAt2 = getChildAt(i32);
                defpackage.is isVar5 = (defpackage.is) childAt2.getLayoutParams();
                long j4 = 1 << i32;
                if ((j3 & j4) != 0) {
                    if (!z14 || !isVar5.e) {
                        z2 = true;
                    } else if (i14 == 1) {
                        int i33 = this.o;
                        z2 = true;
                        childAt2.setPadding(i33 + i23, 0, i33, 0);
                        i14 = 1;
                    } else {
                        z2 = true;
                    }
                    isVar5.b++;
                    isVar5.f = z2;
                    i14--;
                } else if (isVar5.b == i31) {
                    j2 |= j4;
                }
            }
            z12 = true;
            z = z14;
            i25 = i3;
        }
        if (z8 || i17 != i4) {
            i5 = i17;
            i6 = 0;
        } else {
            i6 = i4;
            i5 = i6;
        }
        if (i14 > 0 && j2 != 0 && (i14 < i5 - 1 || i6 != 0 || i24 > i4)) {
            float fBitCount = java.lang.Long.bitCount(j2);
            if (i6 == 0) {
                int i34 = childCount2 - 1;
                if ((j2 & j) != 0 && !((defpackage.is) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                if ((j2 & ((long) (1 << i34))) != 0 && !((defpackage.is) getChildAt(i34).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i35 = fBitCount > 0.0f ? (int) ((i14 * i23) / fBitCount) : 0;
            int i36 = 0;
            while (i36 < childCount2) {
                if ((j2 & ((long) (1 << i36))) != 0) {
                    android.view.View childAt3 = getChildAt(i36);
                    defpackage.is isVar6 = (defpackage.is) childAt3.getLayoutParams();
                    if (childAt3 instanceof android.support.v7.view.menu.ActionMenuItemView) {
                        isVar6.c = i35;
                        isVar6.f = true;
                        if (i36 == 0) {
                            if (!isVar6.e) {
                                isVar6.leftMargin = (-i35) / 2;
                            }
                            i36 = 0;
                        }
                    } else if (isVar6.a) {
                        isVar6.c = i35;
                        isVar6.f = true;
                        isVar6.rightMargin = (-i35) / 2;
                    } else {
                        int i37 = childCount2 - 1;
                        if (i36 != 0) {
                            isVar6.leftMargin = i35 / 2;
                        }
                        if (i36 != i37) {
                            isVar6.rightMargin = i35 / 2;
                        }
                    }
                    z12 = true;
                }
                i36++;
            }
        }
        if (z12) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                android.view.View childAt4 = getChildAt(i38);
                defpackage.is isVar7 = (defpackage.is) childAt4.getLayoutParams();
                if (isVar7.f) {
                    childAt4.measure(android.view.View.MeasureSpec.makeMeasureSpec((isVar7.b * i23) + isVar7.c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode == 1073741824 ? i22 : i3);
    }

    @Override // android.support.v7.widget.LinearLayoutCompat, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return o(layoutParams);
    }

    public ActionMenuView(android.content.Context context) {
        this(context, null);
    }
}
