package androidx.gridlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.LogPrinter;
import android.util.Printer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.google.android.projection.gearhead.R;
import defpackage.ebm;
import defpackage.eob;
import defpackage.eoc;
import defpackage.eod;
import defpackage.eoe;
import defpackage.eof;
import defpackage.eog;
import defpackage.eoh;
import defpackage.eoj;
import defpackage.eok;
import defpackage.eol;
import defpackage.eop;
import defpackage.eoq;
import defpackage.eor;
import defpackage.eos;
import defpackage.eou;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class GridLayout extends ViewGroup {
    private static final eol A;
    static final Printer a = new LogPrinter(3, GridLayout.class.getName());
    public static final eol b;
    public static final eol c;
    public static final eol d;
    public static final eol e;
    public static final eol f;
    public static final eol g;
    public static final eol h;
    public static final eol i;
    public static final eol j;
    public static final eol k;
    private static final int t;
    private static final int u;
    private static final int v;
    private static final int w;
    private static final int x;
    private static final int y;
    private static final eol z;
    final eop l;
    final eop m;
    int n;
    boolean o;
    int p;
    int q;
    int r;
    public Printer s;

    static {
        int i2 = eoc.a;
        int[] iArr = eob.a;
        t = 3;
        u = 4;
        v = 1;
        w = 6;
        x = 5;
        y = 2;
        b = new eod();
        eoe eoeVar = new eoe();
        z = eoeVar;
        eof eofVar = new eof();
        A = eofVar;
        c = eoeVar;
        d = eofVar;
        e = eoeVar;
        f = eofVar;
        g = new eog(eoeVar, eofVar);
        h = new eog(eofVar, eoeVar);
        i = new eoh();
        j = new eoj();
        k = new eok();
    }

    public GridLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        eop eopVar = new eop(this, true);
        this.l = eopVar;
        eop eopVar2 = new eop(this, false);
        this.m = eopVar2;
        this.n = 0;
        this.o = false;
        this.p = 1;
        this.r = 0;
        this.s = a;
        this.q = context.getResources().getDimensionPixelOffset(R.dimen.default_gap);
        int[] iArr = eob.a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ebm.n(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        try {
            eopVar2.g(typedArrayObtainStyledAttributes.getInt(u, Integer.MIN_VALUE));
            m();
            requestLayout();
            eopVar.g(typedArrayObtainStyledAttributes.getInt(v, Integer.MIN_VALUE));
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
            eopVar2.h(typedArrayObtainStyledAttributes.getBoolean(x, true));
            m();
            requestLayout();
            eopVar.h(typedArrayObtainStyledAttributes.getBoolean(y, true));
            m();
            requestLayout();
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static int a(int i2, int i3) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3 + i2), View.MeasureSpec.getMode(i2));
    }

    public static eol d(int i2, boolean z2) {
        int i3 = (i2 & (true != z2 ? 112 : 7)) >> (true != z2 ? 4 : 0);
        return i3 != 1 ? i3 != 3 ? i3 != 5 ? i3 != 7 ? b : k : z2 ? h : d : z2 ? g : c : i;
    }

    public static eou e(int i2, int i3, eol eolVar, float f2) {
        return new eou(i2 != Integer.MIN_VALUE, i2, i3, eolVar, f2);
    }

    public static void f(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static final eos g(View view) {
        return (eos) view.getLayoutParams();
    }

    public static final int h(View view, boolean z2) {
        return z2 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private final int i() {
        int childCount = getChildCount();
        int iHashCode = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                iHashCode = (iHashCode * 31) + ((eos) childAt.getLayoutParams()).hashCode();
            }
        }
        return iHashCode;
    }

    private final int j(View view, boolean z2, boolean z3) {
        int[] iArr;
        if (this.p == 1) {
            return b(view, z2, z3);
        }
        eop eopVar = z2 ? this.l : this.m;
        if (z3) {
            if (eopVar.f == null) {
                eopVar.f = new int[eopVar.a() + 1];
            }
            if (!eopVar.g) {
                eopVar.c(true);
                eopVar.g = true;
            }
            iArr = eopVar.f;
        } else {
            if (eopVar.h == null) {
                eopVar.h = new int[eopVar.a() + 1];
            }
            if (!eopVar.i) {
                eopVar.c(false);
                eopVar.i = true;
            }
            iArr = eopVar.h;
        }
        eos eosVarG = g(view);
        eou eouVar = z2 ? eosVarG.b : eosVarG.a;
        return iArr[z3 ? eouVar.c.a : eouVar.c.b];
    }

    private final void k(eos eosVar, boolean z2) {
        eor eorVar = (z2 ? eosVar.b : eosVar.a).c;
        int i2 = eorVar.a;
        String str = true != z2 ? "row" : "column";
        if (i2 != Integer.MIN_VALUE && i2 < 0) {
            f(str.concat(" indices must be positive"));
        }
        if (i2 != Integer.MIN_VALUE && i2 > 100000) {
            f(str.concat(" indices must be less than or equal to 100000"));
        }
        int i3 = (z2 ? this.l : this.m).b;
        if (i3 != Integer.MIN_VALUE) {
            if (eorVar.b > i3) {
                f(str + " indices (start + span) mustn't exceed the " + str + " count");
            }
            if (eorVar.a() > i3) {
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
            eos eosVar = (eos) getChildAt(i6).getLayoutParams();
            eou eouVar = z3 ? eosVar.a : eosVar.b;
            eor eorVar = eouVar.c;
            boolean z4 = eouVar.b;
            int iA = eorVar.a();
            if (z4) {
                i5 = eorVar.a;
            }
            eou eouVar2 = z3 ? eosVar.b : eosVar.a;
            eor eorVar2 = eouVar2.c;
            boolean z5 = eouVar2.b;
            int iA2 = eorVar2.a();
            if (i3 != 0) {
                iA2 = Math.min(iA2, i3 - (z5 ? Math.min(eorVar2.a, i3) : 0));
            }
            if (z5) {
                i4 = eorVar2.a;
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 != 0) {
                if (!z4 || !z2) {
                    while (true) {
                        int i7 = i4 + iA2;
                        if (i7 <= i3) {
                            for (int i8 = i4; i8 < i7; i8++) {
                                if (iArr[i8] <= i5) {
                                }
                            }
                            break;
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
                Arrays.fill(iArr, Math.min(i4, i3), Math.min(i4 + iA2, i3), i5 + iA);
            }
            if (z3) {
                q(eosVar, i5, iA, i4, iA2);
            } else {
                q(eosVar, i4, iA2, i5, iA);
            }
            i4 += iA2;
        }
        this.r = i();
    }

    private final void m() {
        this.r = 0;
        eop eopVar = this.l;
        if (eopVar != null) {
            eopVar.d();
        }
        eop eopVar2 = this.m;
        if (eopVar2 != null) {
            eopVar2.d();
        }
        n();
    }

    private final void n() {
        eop eopVar;
        eop eopVar2 = this.l;
        if (eopVar2 == null || (eopVar = this.m) == null) {
            return;
        }
        eopVar2.e();
        eopVar.e();
    }

    private final void o(View view, int i2, int i3, int i4, int i5) {
        view.measure(getChildMeasureSpec(i2, c(view, true), i4), getChildMeasureSpec(i3, c(view, false), i5));
    }

    private final void p(int i2, int i3, boolean z2) {
        int i4;
        int i5;
        GridLayout gridLayout;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt.getVisibility() == 8) {
                gridLayout = this;
                i4 = i2;
                i5 = i3;
            } else {
                eos eosVarG = g(childAt);
                if (z2) {
                    int i7 = eosVarG.width;
                    int i8 = eosVarG.height;
                    gridLayout = this;
                    i4 = i2;
                    i5 = i3;
                    gridLayout.o(childAt, i4, i5, i7, i8);
                } else {
                    i4 = i2;
                    i5 = i3;
                    boolean z3 = this.n == 0;
                    eou eouVar = z3 ? eosVarG.b : eosVarG.a;
                    if (eouVar.a(z3) == k) {
                        eor eorVar = eouVar.c;
                        eop eopVar = z3 ? this.l : this.m;
                        int i9 = eorVar.b;
                        int[] iArrJ = eopVar.j();
                        int iC = (iArrJ[i9] - iArrJ[eorVar.a]) - this.c(childAt, z3);
                        if (z3) {
                            int i10 = eosVarG.height;
                            gridLayout = this;
                            gridLayout.o(childAt, i4, i5, iC, i10);
                        } else {
                            int i11 = eosVarG.width;
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

    private static void q(eos eosVar, int i2, int i3, int i4, int i5) {
        eosVar.a = eosVar.a.b(new eor(i2, i3 + i2));
        eosVar.b = eosVar.b.b(new eor(i4, i5 + i4));
    }

    public final int b(View view, boolean z2, boolean z3) {
        eos eosVarG = g(view);
        int i2 = z2 ? z3 ? eosVarG.leftMargin : eosVarG.rightMargin : z3 ? eosVarG.topMargin : eosVarG.bottomMargin;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.o && view.getClass() != Space.class) {
            return this.q / 2;
        }
        return 0;
    }

    public final int c(View view, boolean z2) {
        return j(view, z2, true) + j(view, z2, false);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof eos)) {
            return false;
        }
        eos eosVar = (eos) layoutParams;
        k(eosVar, true);
        k(eosVar, false);
        return true;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eos();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof eos ? new eos((eos) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new eos((ViewGroup.MarginLayoutParams) layoutParams) : new eos(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        GridLayout gridLayout = this;
        gridLayout.l();
        int i10 = i4 - i2;
        int paddingLeft = gridLayout.getPaddingLeft();
        int paddingTop = gridLayout.getPaddingTop();
        int paddingRight = gridLayout.getPaddingRight();
        eop eopVar = gridLayout.l;
        int paddingBottom = gridLayout.getPaddingBottom();
        eopVar.f((i10 - paddingLeft) - paddingRight);
        eop eopVar2 = gridLayout.m;
        eopVar2.f(((i5 - i3) - paddingTop) - paddingBottom);
        int[] iArrJ = eopVar.j();
        int[] iArrJ2 = eopVar2.j();
        int childCount = gridLayout.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = gridLayout.getChildAt(i11);
            if (childAt.getVisibility() == 8) {
                i9 = i11;
                i6 = i10;
                i7 = paddingLeft;
                i8 = paddingTop;
            } else {
                eos eosVarG = g(childAt);
                eou eouVar = eosVarG.b;
                eou eouVar2 = eosVarG.a;
                eor eorVar = eouVar.c;
                eor eorVar2 = eouVar2.c;
                i6 = i10;
                int i12 = iArrJ[eorVar.a];
                int i13 = iArrJ2[eorVar2.a];
                int i14 = iArrJ[eorVar.b] - i12;
                int i15 = iArrJ2[eorVar2.b] - i13;
                int iH = h(childAt, true);
                i7 = paddingLeft;
                i8 = paddingTop;
                int iH2 = h(childAt, false);
                eol eolVarA = eouVar.a(true);
                eol eolVarA2 = eouVar2.a(false);
                eoq eoqVar = (eoq) eopVar.l().C(i11);
                eoq eoqVar2 = (eoq) eopVar2.l().C(i11);
                i9 = i11;
                int iB = eolVarA.b(childAt, i14 - eoqVar.b(true));
                int iB2 = eolVarA2.b(childAt, i15 - eoqVar2.b(true));
                int iJ = gridLayout.j(childAt, true, true);
                int iJ2 = gridLayout.j(childAt, false, true);
                int iJ3 = gridLayout.j(childAt, true, false);
                int i16 = iJ + iJ3;
                int iJ4 = iJ2 + gridLayout.j(childAt, false, false);
                int iA = eoqVar.a(gridLayout, childAt, eolVarA, iH + i16, true);
                int iA2 = eoqVar2.a(this, childAt, eolVarA2, iH2 + iJ4, false);
                int iE = eolVarA.e(iH, i14 - i16);
                int iE2 = eolVarA2.e(iH2, i15 - iJ4);
                int i17 = i12 + iB + iA;
                int i18 = getLayoutDirection() == 1 ? (((i6 - iE) - paddingRight) - iJ3) - i17 : i7 + iJ + i17;
                int i19 = i8 + i13 + iB2 + iA2 + iJ2;
                if (iE != childAt.getMeasuredWidth() || iE2 != childAt.getMeasuredHeight()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(iE, 1073741824), View.MeasureSpec.makeMeasureSpec(iE2, 1073741824));
                }
                childAt.layout(i18, i19, iE + i18, iE2 + i19);
            }
            i11 = i9 + 1;
            gridLayout = this;
            i10 = i6;
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
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iB + paddingLeft, getSuggestedMinimumWidth()), i2, 0), View.resolveSizeAndState(Math.max(iB2 + paddingTop, getSuggestedMinimumHeight()), i3, 0));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        m();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new eos(getContext(), attributeSet);
    }

    public GridLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GridLayout(Context context) {
        this(context, null);
    }
}
