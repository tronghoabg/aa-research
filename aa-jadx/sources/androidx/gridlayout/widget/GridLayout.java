package androidx.gridlayout.widget;

/* JADX INFO: loaded from: classes2.dex */
public class GridLayout extends android.view.ViewGroup {
    private static final defpackage.eor A;
    static final android.util.Printer a = new android.util.LogPrinter(3, androidx.gridlayout.widget.GridLayout.class.getName());
    public static final defpackage.eor b;
    public static final defpackage.eor c;
    public static final defpackage.eor d;
    public static final defpackage.eor e;
    public static final defpackage.eor f;
    public static final defpackage.eor g;
    public static final defpackage.eor h;
    public static final defpackage.eor i;
    public static final defpackage.eor j;
    public static final defpackage.eor k;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;
    private static final int x;
    private static final int y;
    private static final defpackage.eor z;
    final defpackage.eov l;
    final defpackage.eov m;
    int n;
    boolean o;
    int p;
    int q;
    int r;
    public android.util.Printer s;

    static {
        int i2 = defpackage.eoi.a;
        int[] iArr = defpackage.eoh.a;
        t = 3;
        u = 4;
        v = 1;
        w = 6;
        x = 5;
        y = 2;
        b = new defpackage.eoj();
        defpackage.eok eokVar = new defpackage.eok();
        z = eokVar;
        defpackage.eol eolVar = new defpackage.eol();
        A = eolVar;
        c = eokVar;
        d = eolVar;
        e = eokVar;
        f = eolVar;
        g = new defpackage.eom(eokVar, eolVar);
        h = new defpackage.eom(eolVar, eokVar);
        i = new defpackage.eon();
        j = new defpackage.eop();
        k = new defpackage.eoq();
    }

    public GridLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        defpackage.eov eovVar = new defpackage.eov(this, true);
        this.l = eovVar;
        defpackage.eov eovVar2 = new defpackage.eov(this, false);
        this.m = eovVar2;
        this.n = 0;
        this.o = false;
        this.p = 1;
        this.r = 0;
        this.s = a;
        this.q = context.getResources().getDimensionPixelOffset(com.google.android.projection.gearhead.R.dimen.default_gap);
        int[] iArr = defpackage.eoh.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        defpackage.ebt.m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        try {
            eovVar2.g(typedArrayObtainStyledAttributes.getInt(u, Integer.MIN_VALUE));
            m();
            requestLayout();
            eovVar.g(typedArrayObtainStyledAttributes.getInt(v, Integer.MIN_VALUE));
            m();
            requestLayout();
            int i3 = typedArrayObtainStyledAttributes.getInt(t, 0);
            if (this.n != i3) {
                this.n = i3;
                m();
                requestLayout();
            }
            this.o = typedArrayObtainStyledAttributes.getBoolean(w, false);
            requestLayout();
            this.p = typedArrayObtainStyledAttributes.getInt(0, 1);
            requestLayout();
            eovVar2.h(typedArrayObtainStyledAttributes.getBoolean(x, true));
            m();
            requestLayout();
            eovVar.h(typedArrayObtainStyledAttributes.getBoolean(y, true));
            m();
            requestLayout();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static int a(int i2, int i3) {
        return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i3 + i2), android.view.View.MeasureSpec.getMode(i2));
    }

    public static defpackage.eor d(int i2, boolean z2) {
        int i3 = (i2 & (true != z2 ? 112 : 7)) >> (true != z2 ? 4 : 0);
        if (i3 == 1) {
            return i;
        }
        if (i3 == 3) {
            return z2 ? g : c;
        }
        if (i3 != 5) {
            return i3 != 7 ? b : k;
        }
        return z2 ? h : d;
    }

    public static defpackage.epa e(int i2, int i3, defpackage.eor eorVar, float f2) {
        return new defpackage.epa(i2 != Integer.MIN_VALUE, i2, i3, eorVar, f2);
    }

    public static void f(java.lang.String str) {
        throw new java.lang.IllegalArgumentException(str.concat(". "));
    }

    public static final defpackage.eoy g(android.view.View view) {
        return (defpackage.eoy) view.getLayoutParams();
    }

    public static final int h(android.view.View view, boolean z2) {
        return z2 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private final int i() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                iHashCode = (iHashCode * 31) + ((defpackage.eoy) childAt.getLayoutParams()).hashCode();
            }
        }
        return iHashCode;
    }

    private final int j(android.view.View view, boolean z2, boolean z3) {
        int[] iArr;
        if (this.p == 1) {
            return b(view, z2, z3);
        }
        defpackage.eov eovVar = z2 ? this.l : this.m;
        if (z3) {
            if (eovVar.f == null) {
                eovVar.f = new int[eovVar.a() + 1];
            }
            if (!eovVar.g) {
                eovVar.c(true);
                eovVar.g = true;
            }
            iArr = eovVar.f;
        } else {
            if (eovVar.h == null) {
                eovVar.h = new int[eovVar.a() + 1];
            }
            if (!eovVar.i) {
                eovVar.c(false);
                eovVar.i = true;
            }
            iArr = eovVar.h;
        }
        defpackage.eoy eoyVarG = g(view);
        defpackage.epa epaVar = z2 ? eoyVarG.b : eoyVarG.a;
        return iArr[z3 ? epaVar.c.a : epaVar.c.b];
    }

    private final void k(defpackage.eoy eoyVar, boolean z2) {
        defpackage.eox eoxVar = (z2 ? eoyVar.b : eoyVar.a).c;
        int i2 = eoxVar.a;
        java.lang.String str = true != z2 ? "row" : "column";
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            f(str.concat(" indices must be positive"));
        }
        if (i2 != Integer.MIN_VALUE && i2 > 100000) {
            f(str.concat(" indices must be less than or equal to 100000"));
        }
        int i3 = (z2 ? this.l : this.m).b;
        if (i3 != Integer.MIN_VALUE) {
            if (eoxVar.b > i3) {
                f(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (eoxVar.a() > i3) {
                f(str + " span mustn't exceed the " + str + " count");
            }
        }
    }

    private final void l() {
        boolean z2;
        int i2 = this.r;
        if (i2 != 0) {
            if (i2 != i()) {
                this.s.println("The fields of some layout parameters were modified in between layout operations. Check the javadoc for GridLayout.LayoutParams#rowSpec.");
                m();
                l();
                return;
            }
            return;
        }
        boolean z3 = this.n == 0;
        int i3 = (z3 ? this.l : this.m).b;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 0;
        }
        int[] iArr = new int[i3];
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            defpackage.eoy eoyVar = (defpackage.eoy) getChildAt(i6).getLayoutParams();
            defpackage.epa epaVar = z3 ? eoyVar.a : eoyVar.b;
            defpackage.eox eoxVar = epaVar.c;
            boolean z4 = epaVar.b;
            int iA = eoxVar.a();
            if (z4) {
                i5 = eoxVar.a;
            }
            defpackage.epa epaVar2 = z3 ? eoyVar.b : eoyVar.a;
            defpackage.eox eoxVar2 = epaVar2.c;
            boolean z5 = epaVar2.b;
            int iA2 = eoxVar2.a();
            if (i3 != 0) {
                iA2 = java.lang.Math.min(iA2, i3 - (z5 ? java.lang.Math.min(eoxVar2.a, i3) : 0));
            }
            if (z5) {
                i4 = eoxVar2.a;
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 != 0) {
                if (!z4 || !z2) {
                    while (true) {
                        int i7 = i4 + iA2;
                        if (i7 <= i3) {
                            int i8 = i4;
                            while (true) {
                                if (i8 >= i7) {
                                    break;
                                } else if (iArr[i8] > i5) {
                                    break;
                                } else {
                                    i8++;
                                }
                            }
                        }
                        if (z2) {
                            i5++;
                        } else if (i7 <= i3) {
                            i4++;
                        } else {
                            i5++;
                            i4 = 0;
                        }
                    }
                }
                java.util.Arrays.fill(iArr, java.lang.Math.min(i4, i3), java.lang.Math.min(i4 + iA2, i3), i5 + iA);
            }
            if (z3) {
                q(eoyVar, i5, iA, i4, iA2);
            } else {
                q(eoyVar, i4, iA2, i5, iA);
            }
            i4 += iA2;
        }
        this.r = i();
    }

    private final void m() {
        this.r = 0;
        defpackage.eov eovVar = this.l;
        if (eovVar != null) {
            eovVar.d();
        }
        defpackage.eov eovVar2 = this.m;
        if (eovVar2 != null) {
            eovVar2.d();
        }
        n();
    }

    private final void n() {
        defpackage.eov eovVar;
        defpackage.eov eovVar2 = this.l;
        if (eovVar2 == null || (eovVar = this.m) == null) {
            return;
        }
        eovVar2.e();
        eovVar.e();
    }

    private final void o(android.view.View view, int i2, int i3, int i4, int i5) {
        view.measure(getChildMeasureSpec(i2, c(view, true), i4), getChildMeasureSpec(i3, c(view, false), i5));
    }

    private final void p(int i2, int i3, boolean z2) {
        int i4;
        int i5;
        androidx.gridlayout.widget.GridLayout gridLayout;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            android.view.View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                gridLayout = this;
                i4 = i2;
                i5 = i3;
            } else {
                defpackage.eoy eoyVarG = g(childAt);
                if (z2) {
                    int i7 = eoyVarG.width;
                    int i8 = eoyVarG.height;
                    gridLayout = this;
                    i4 = i2;
                    i5 = i3;
                    gridLayout.o(childAt, i4, i5, i7, i8);
                } else {
                    i4 = i2;
                    i5 = i3;
                    boolean z3 = this.n == 0;
                    defpackage.epa epaVar = z3 ? eoyVarG.b : eoyVarG.a;
                    if (epaVar.a(z3) == k) {
                        defpackage.eox eoxVar = epaVar.c;
                        defpackage.eov eovVar = z3 ? this.l : this.m;
                        int i9 = eoxVar.b;
                        int[] iArrJ = eovVar.j();
                        int iC = (iArrJ[i9] - iArrJ[eoxVar.a]) - this.c(childAt, z3);
                        if (z3) {
                            int i10 = eoyVarG.height;
                            gridLayout = this;
                            gridLayout.o(childAt, i4, i5, iC, i10);
                        } else {
                            int i11 = eoyVarG.width;
                            gridLayout = this;
                            gridLayout.o(childAt, i4, i5, i11, iC);
                        }
                    } else {
                        gridLayout = this;
                    }
                }
            }
            i6++;
            this = gridLayout;
            i2 = i4;
            i3 = i5;
        }
    }

    private static void q(defpackage.eoy eoyVar, int i2, int i3, int i4, int i5) {
        eoyVar.a = eoyVar.a.b(new defpackage.eox(i2, i3 + i2));
        eoyVar.b = eoyVar.b.b(new defpackage.eox(i4, i5 + i4));
    }

    public final int b(android.view.View view, boolean z2, boolean z3) {
        int i2;
        defpackage.eoy eoyVarG = g(view);
        if (z2) {
            i2 = z3 ? eoyVarG.leftMargin : eoyVarG.rightMargin;
        } else {
            i2 = z3 ? eoyVarG.topMargin : eoyVarG.bottomMargin;
        }
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.o && view.getClass() != android.widget.Space.class) {
            return this.q / 2;
        }
        return 0;
    }

    public final int c(android.view.View view, boolean z2) {
        return j(view, z2, true) + j(view, z2, false);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof defpackage.eoy)) {
            return false;
        }
        defpackage.eoy eoyVar = (defpackage.eoy) layoutParams;
        k(eoyVar, true);
        k(eoyVar, false);
        return true;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.eoy();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.eoy) {
            return new defpackage.eoy((defpackage.eoy) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.eoy((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.eoy(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        androidx.gridlayout.widget.GridLayout gridLayout = this;
        gridLayout.l();
        int i9 = i4 - i2;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        defpackage.eov eovVar = gridLayout.l;
        int paddingBottom = gridLayout.getPaddingBottom();
        eovVar.f((i9 - paddingLeft) - paddingRight);
        defpackage.eov eovVar2 = gridLayout.m;
        eovVar2.f(((i5 - i3) - paddingTop) - paddingBottom);
        int[] iArrJ = eovVar.j();
        int[] iArrJ2 = eovVar2.j();
        int childCount = gridLayout.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            android.view.View childAt = gridLayout.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                i6 = i9;
                i7 = paddingLeft;
                i8 = paddingTop;
            } else {
                defpackage.eoy eoyVarG = g(childAt);
                defpackage.epa epaVar = eoyVarG.b;
                defpackage.epa epaVar2 = eoyVarG.a;
                defpackage.eox eoxVar = epaVar.c;
                defpackage.eox eoxVar2 = epaVar2.c;
                i6 = i9;
                int i11 = iArrJ[eoxVar.a];
                int i12 = iArrJ2[eoxVar2.a];
                int i13 = iArrJ[eoxVar.b] - i11;
                int i14 = iArrJ2[eoxVar2.b] - i12;
                int iH = h(childAt, true);
                i7 = paddingLeft;
                i8 = paddingTop;
                int iH2 = h(childAt, false);
                defpackage.eor eorVarA = epaVar.a(true);
                defpackage.eor eorVarA2 = epaVar2.a(false);
                defpackage.eow eowVar = (defpackage.eow) eovVar.l().C(i10);
                defpackage.eow eowVar2 = (defpackage.eow) eovVar2.l().C(i10);
                int iB = eorVarA.b(childAt, i13 - eowVar.b(true));
                int iB2 = eorVarA2.b(childAt, i14 - eowVar2.b(true));
                int iJ = gridLayout.j(childAt, true, true);
                int iJ2 = gridLayout.j(childAt, false, true);
                int iJ3 = gridLayout.j(childAt, true, false);
                int i15 = iJ + iJ3;
                int iJ4 = iJ2 + gridLayout.j(childAt, false, false);
                int iA = eowVar.a(gridLayout, childAt, eorVarA, iH + i15, true);
                int iA2 = eowVar2.a(this, childAt, eorVarA2, iH2 + iJ4, false);
                int iE = eorVarA.e(iH, i13 - i15);
                int iE2 = eorVarA2.e(iH2, i14 - iJ4);
                int i16 = i11 + iB + iA;
                int i17 = getLayoutDirection() == 1 ? (((i6 - iE) - paddingRight) - iJ3) - i16 : i7 + iJ + i16;
                int i18 = i8 + i12 + iB2 + iA2 + iJ2;
                if (iE != childAt.getMeasuredWidth() || iE2 != childAt.getMeasuredHeight()) {
                    childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(iE, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(iE2, 1073741824));
                }
                childAt.layout(i17, i18, iE + i17, iE2 + i18);
            }
            i10++;
            gridLayout = this;
            i9 = i6;
            paddingLeft = i7;
            paddingTop = i8;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int iB;
        int iB2;
        l();
        n();
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int iA = a(i2, -paddingLeft);
        int iA2 = a(i3, -paddingTop);
        p(iA, iA2, true);
        if (this.n == 0) {
            iB = this.l.b(iA);
            p(iA, iA2, false);
            iB2 = this.m.b(iA2);
        } else {
            int iB3 = this.m.b(iA2);
            p(iA, iA2, false);
            iB = this.l.b(iA);
            iB2 = iB3;
        }
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(iB + paddingLeft, getSuggestedMinimumWidth()), i2, 0), android.view.View.resolveSizeAndState(java.lang.Math.max(iB2 + paddingTop, getSuggestedMinimumHeight()), i3, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        m();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.eoy(getContext(), attributeSet);
    }

    public GridLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(android.content.Context context) {
        this(context, null);
    }
}
