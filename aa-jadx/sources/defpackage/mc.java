package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class mc {
    public int A;
    public int B;
    public int C;
    public int D;
    public final defpackage.bil E;
    public final defpackage.bil F;
    private final defpackage.no a;
    private final defpackage.no b;
    defpackage.kf r;
    public android.support.v7.widget.RecyclerView s;
    public defpackage.mn t;
    public boolean u;
    public boolean v;
    public final boolean w;
    public final boolean x;
    public int y;
    public boolean z;

    public mc() {
        defpackage.ma maVar = new defpackage.ma(this, 1);
        this.a = maVar;
        defpackage.ma maVar2 = new defpackage.ma(this, 0);
        this.b = maVar2;
        this.E = new defpackage.bil(maVar);
        this.F = new defpackage.bil(maVar2);
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = true;
    }

    public static defpackage.mb aB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        defpackage.mb mbVar = new defpackage.mb();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.fw.a, i, i2);
        mbVar.a = typedArrayObtainStyledAttributes.getInt(0, 1);
        mbVar.b = typedArrayObtainStyledAttributes.getInt(11, 1);
        mbVar.c = typedArrayObtainStyledAttributes.getBoolean(10, false);
        mbVar.d = typedArrayObtainStyledAttributes.getBoolean(12, false);
        typedArrayObtainStyledAttributes.recycle();
        return mbVar;
    }

    public static int au(int i, int i2, int i3) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? java.lang.Math.max(i2, i3) : size;
        }
        return java.lang.Math.min(size, java.lang.Math.max(i2, i3));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001b  */
    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    public static int aw(int i, int i2, int i3, int i4, boolean z) {
        int iMax = java.lang.Math.max(0, i - i3);
        if (z) {
            if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                i2 = 0;
                i4 = 0;
            } else {
                i4 = iMax;
            }
        } else if (i4 >= 0) {
            i2 = 1073741824;
        } else if (i4 == -1) {
            i4 = iMax;
        } else if (i4 != -2) {
            i2 = 0;
            i4 = 0;
        } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
            i4 = iMax;
            i2 = Integer.MIN_VALUE;
        } else {
            i4 = iMax;
            i2 = 0;
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static final int bA(android.view.View view) {
        return view.getBottom() + ((defpackage.md) view.getLayoutParams()).d.bottom;
    }

    public static final int bB(android.view.View view) {
        return view.getLeft() - bk(view);
    }

    public static final int bC(android.view.View view) {
        return view.getRight() + bm(view);
    }

    public static final int bD(android.view.View view) {
        return view.getTop() - ((defpackage.md) view.getLayoutParams()).d.top;
    }

    public static final int bh(android.view.View view) {
        return ((defpackage.md) view.getLayoutParams()).d.bottom;
    }

    public static final int bi(android.view.View view) {
        android.graphics.Rect rect = ((defpackage.md) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bj(android.view.View view) {
        android.graphics.Rect rect = ((defpackage.md) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bk(android.view.View view) {
        return ((defpackage.md) view.getLayoutParams()).d.left;
    }

    public static final int bl(android.view.View view) {
        return ((defpackage.md) view.getLayoutParams()).eX();
    }

    public static final int bm(android.view.View view) {
        return ((defpackage.md) view.getLayoutParams()).d.right;
    }

    public static final int bn(android.view.View view) {
        return ((defpackage.md) view.getLayoutParams()).d.top;
    }

    public static final void bq(android.view.View view, int i, int i2, int i3, int i4) {
        android.graphics.Rect rect = ((defpackage.md) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    public static final void br(android.view.View view, int i, int i2, int i3, int i4) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        android.graphics.Rect rect = mdVar.d;
        view.layout(i + rect.left + mdVar.leftMargin, i2 + rect.top + mdVar.topMargin, (i3 - rect.right) - mdVar.rightMargin, (i4 - rect.bottom) - mdVar.bottomMargin);
    }

    public void C(int i, int i2) {
        bv(i);
    }

    public int D(defpackage.mo moVar) {
        return 0;
    }

    public int E(defpackage.mo moVar) {
        return 0;
    }

    public int F(defpackage.mo moVar) {
        return 0;
    }

    public int G(defpackage.mo moVar) {
        throw null;
    }

    public int H(defpackage.mo moVar) {
        throw null;
    }

    public int I(defpackage.mo moVar) {
        throw null;
    }

    public android.os.Parcelable P() {
        return null;
    }

    public android.view.View U(int i) {
        int iAv = av();
        for (int i2 = 0; i2 < iAv; i2++) {
            android.view.View viewAD = aD(i2);
            defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(viewAD);
            if (mrVarK != null && mrVarK.c() == i && !mrVarK.A() && (this.s.N.g || !mrVarK.v())) {
                return viewAD;
            }
        }
        return null;
    }

    public void W(java.lang.String str) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.v(str);
        }
    }

    public void Z(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        defpackage.mh mhVar = recyclerView.e;
        defpackage.mo moVar = recyclerView.N;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.s.canScrollVertically(-1) && !this.s.canScrollHorizontally(-1) && !this.s.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        defpackage.lw lwVar = this.s.m;
        if (lwVar != null) {
            accessibilityEvent.setItemCount(lwVar.a());
        }
    }

    public final int aA() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        int[] iArr = defpackage.ebt.a;
        return recyclerView.getMinimumWidth();
    }

    public final android.view.View aC(android.view.View view) {
        android.view.View viewM;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || (viewM = recyclerView.m(view)) == null || this.r.k(viewM)) {
            return null;
        }
        return viewM;
    }

    public final android.view.View aD(int i) {
        defpackage.kf kfVar = this.r;
        if (kfVar != null) {
            return kfVar.d(i);
        }
        return null;
    }

    public final android.view.View aE() {
        android.view.View focusedChild;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.r.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aF(android.view.View view, int i, boolean z) {
        int i2 = android.support.v7.widget.RecyclerView.ac;
        defpackage.mr mrVar = view == null ? null : ((defpackage.md) view.getLayoutParams()).c;
        if (z || mrVar.v()) {
            this.s.ab.A(mrVar);
        } else {
            this.s.ab.D(mrVar);
        }
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        if (mrVar.B() || mrVar.w()) {
            if (mrVar.w()) {
                mrVar.p();
            } else {
                mrVar.i();
            }
            this.r.g(view, i, view.getLayoutParams(), false);
        } else {
            android.view.ViewParent parent = view.getParent();
            android.support.v7.widget.RecyclerView recyclerView = this.s;
            defpackage.kf kfVar = this.r;
            if (parent == recyclerView) {
                int iC = kfVar.c(view);
                if (i == -1) {
                    i = this.r.a();
                }
                if (iC == -1) {
                    throw new java.lang.IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.s.indexOfChild(view) + this.s.n());
                }
                if (iC != i) {
                    defpackage.mc mcVar = this.s.n;
                    android.view.View viewAD = mcVar.aD(iC);
                    if (viewAD == null) {
                        throw new java.lang.IllegalArgumentException("Cannot move a child from non-existing index:" + iC + mcVar.s.toString());
                    }
                    mcVar.aI(iC);
                    defpackage.md mdVar2 = (defpackage.md) viewAD.getLayoutParams();
                    defpackage.mr mrVar2 = ((defpackage.md) viewAD.getLayoutParams()).c;
                    if (mrVar2.v()) {
                        mcVar.s.ab.A(mrVar2);
                    } else {
                        mcVar.s.ab.D(mrVar2);
                    }
                    mcVar.r.g(viewAD, i, mdVar2, mrVar2.v());
                }
            } else {
                kfVar.f(view, i, false);
                mdVar.e = true;
                defpackage.mn mnVar = this.t;
                if (mnVar != null && mnVar.f && mnVar.e(view) == mnVar.f()) {
                    mnVar.g = view;
                }
            }
        }
        if (mdVar.f) {
            mrVar.a.invalidate();
            mdVar.f = false;
        }
    }

    public final void aG(android.view.View view, android.graphics.Rect rect) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.f(view));
        }
    }

    public final void aH(defpackage.mh mhVar) {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            }
            android.view.View viewAD = aD(iAv);
            int i = android.support.v7.widget.RecyclerView.ac;
            defpackage.mr mrVar = viewAD == null ? null : ((defpackage.md) viewAD.getLayoutParams()).c;
            if (!mrVar.A()) {
                if (!mrVar.t() || mrVar.v() || this.s.m.c) {
                    aI(iAv);
                    mhVar.k(viewAD);
                    this.s.ab.D(mrVar);
                } else {
                    aU(iAv);
                    mhVar.j(mrVar);
                }
            }
        }
    }

    public final void aI(int i) {
        aD(i);
        this.r.h(i);
    }

    public final void aJ(android.support.v7.widget.RecyclerView recyclerView) {
        this.v = true;
        aM(recyclerView);
    }

    public void aK(int i) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aL(int i) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            int iA = recyclerView.h.a();
            for (int i2 = 0; i2 < iA; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aN(android.view.View view, defpackage.edn ednVar) {
        defpackage.mr mrVarK = android.support.v7.widget.RecyclerView.k(view);
        if (mrVarK == null || mrVarK.v() || this.r.k(mrVarK.a)) {
            return;
        }
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        fg(recyclerView.e, recyclerView.N, view, ednVar);
    }

    public final void aP() {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            } else {
                this.r.j(iAv);
            }
        }
    }

    public final void aQ(defpackage.mh mhVar) {
        int iAv = av();
        while (true) {
            iAv--;
            if (iAv < 0) {
                return;
            }
            android.view.View viewAD = aD(iAv);
            int i = android.support.v7.widget.RecyclerView.ac;
            if (!(viewAD == null ? null : ((defpackage.md) viewAD.getLayoutParams()).c).A()) {
                aT(iAv, mhVar);
            }
        }
    }

    public final void aR(defpackage.mh mhVar) {
        java.util.ArrayList arrayList = mhVar.a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            android.view.View view = ((defpackage.mr) arrayList.get(i)).a;
            int i2 = android.support.v7.widget.RecyclerView.ac;
            defpackage.mr mrVar = ((defpackage.md) view.getLayoutParams()).c;
            if (!mrVar.A()) {
                mrVar.n(false);
                if (mrVar.x()) {
                    this.s.removeDetachedView(view, false);
                }
                defpackage.lz lzVar = this.s.E;
                if (lzVar != null) {
                    lzVar.c(mrVar);
                }
                mrVar.n(true);
                mhVar.f(view);
            }
        }
        arrayList.clear();
        java.util.ArrayList arrayList2 = mhVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.s.invalidate();
        }
    }

    public final void aS(android.view.View view, defpackage.mh mhVar) {
        defpackage.kf kfVar = this.r;
        int i = kfVar.c;
        if (i == 1) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new java.lang.IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            kfVar.c = 1;
            kfVar.d = view;
            defpackage.izq izqVar = kfVar.e;
            int iX = izqVar.x(view);
            if (iX >= 0) {
                if (kfVar.a.g(iX)) {
                    kfVar.l(view);
                }
                izqVar.A(iX);
            }
            kfVar.c = 0;
            kfVar.d = null;
            mhVar.i(view);
        } catch (java.lang.Throwable th) {
            kfVar.c = 0;
            kfVar.d = null;
            throw th;
        }
    }

    public final void aT(int i, defpackage.mh mhVar) {
        android.view.View viewAD = aD(i);
        aU(i);
        mhVar.i(viewAD);
    }

    public final void aU(int i) {
        if (aD(i) != null) {
            this.r.j(i);
        }
    }

    public final void aV() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void aW() {
        this.u = true;
    }

    public final void aX(android.support.v7.widget.RecyclerView recyclerView) {
        aY(android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void aY(int i, int i2) {
        this.C = android.view.View.MeasureSpec.getSize(i);
        int mode = android.view.View.MeasureSpec.getMode(i);
        this.A = mode;
        if (mode == 0 && !android.support.v7.widget.RecyclerView.a) {
            this.C = 0;
        }
        this.D = android.view.View.MeasureSpec.getSize(i2);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        this.B = mode2;
        if (mode2 != 0 || android.support.v7.widget.RecyclerView.a) {
            return;
        }
        this.D = 0;
    }

    public final void aZ(int i, int i2) {
        this.s.setMeasuredDimension(i, i2);
    }

    public void ad(int i) {
        throw null;
    }

    public boolean ag() {
        return false;
    }

    public boolean ah() {
        throw null;
    }

    public boolean ai() {
        throw null;
    }

    public boolean ak() {
        return false;
    }

    public boolean am() {
        return false;
    }

    public void as(android.support.v7.widget.RecyclerView recyclerView, int i) {
        throw null;
    }

    public final int av() {
        defpackage.kf kfVar = this.r;
        if (kfVar != null) {
            return kfVar.a();
        }
        return 0;
    }

    public final int ax() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        defpackage.lw lwVar = recyclerView != null ? recyclerView.m : null;
        if (lwVar != null) {
            return lwVar.a();
        }
        return 0;
    }

    public final int ay() {
        return this.s.getLayoutDirection();
    }

    public final int az() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        int[] iArr = defpackage.ebt.a;
        return recyclerView.getMinimumHeight();
    }

    public final void ba(int i, int i2) {
        int iAv = av();
        if (iAv == 0) {
            this.s.A(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < iAv; i7++) {
            android.view.View viewAD = aD(i7);
            android.graphics.Rect rect = this.s.k;
            android.support.v7.widget.RecyclerView.K(viewAD, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.s.k.set(i4, i5, i3, i6);
        fh(this.s.k, i, i2);
    }

    public final void bb(android.support.v7.widget.RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.s = null;
            this.r = null;
            this.C = 0;
            this.D = 0;
        } else {
            this.s = recyclerView;
            this.r = recyclerView.h;
            this.C = recyclerView.getWidth();
            this.D = recyclerView.getHeight();
        }
        this.A = 1073741824;
        this.B = 1073741824;
    }

    public final void bc(defpackage.mn mnVar) {
        defpackage.mn mnVar2 = this.t;
        if (mnVar2 != null && mnVar != mnVar2 && mnVar2.f) {
            mnVar2.i();
        }
        this.t = mnVar;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        recyclerView.K.d();
        if (mnVar.h) {
            android.util.Log.w("RecyclerView", "An instance of " + mnVar.getClass().getSimpleName() + " was started more than once. Each instance of" + mnVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        mnVar.c = recyclerView;
        mnVar.d = this;
        int i = mnVar.b;
        if (i == -1) {
            throw new java.lang.IllegalArgumentException("Invalid target position");
        }
        mnVar.c.N.a = i;
        mnVar.f = true;
        mnVar.e = true;
        mnVar.g = mnVar.c.n.U(mnVar.f());
        mnVar.c.K.b();
        mnVar.h = true;
    }

    public final boolean bd() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        return recyclerView != null && recyclerView.hasFocus();
    }

    public final boolean be() {
        defpackage.mn mnVar = this.t;
        return mnVar != null && mnVar.f;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    public final boolean bf(android.support.v7.widget.RecyclerView recyclerView, android.view.View view, android.graphics.Rect rect, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = this.C - getPaddingRight();
        int paddingBottom = this.D - getPaddingBottom();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - paddingLeft;
        int i2 = top - paddingTop;
        int i3 = iHeight - paddingBottom;
        int iMin = java.lang.Math.min(0, i);
        int i4 = iWidth - paddingRight;
        int iMin2 = java.lang.Math.min(0, i2);
        int iMax = java.lang.Math.max(0, i4);
        int iMax2 = java.lang.Math.max(0, i3);
        if (ay() == 1) {
            iMin = iMax != 0 ? iMax : java.lang.Math.max(iMin, i4);
        } else if (iMin == 0) {
            iMin = java.lang.Math.min(i, iMax);
        }
        if (iMin2 == 0) {
            iMin2 = java.lang.Math.min(i2, iMax2);
        }
        int i5 = new int[]{iMin, iMin2}[0];
        if (!z2) {
            if (i5 == 0) {
                if (iMin2 != 0) {
                    i5 = 0;
                }
            }
            if (z) {
                recyclerView.scrollBy(i5, iMin2);
            } else {
                recyclerView.as(i5, iMin2, false);
            }
            return true;
        }
        android.view.View focusedChild = recyclerView.getFocusedChild();
        if (focusedChild != null) {
            int paddingLeft2 = getPaddingLeft();
            int paddingTop2 = getPaddingTop();
            int paddingRight2 = this.C - getPaddingRight();
            int paddingBottom2 = this.D - getPaddingBottom();
            android.graphics.Rect rect2 = this.s.k;
            android.support.v7.widget.RecyclerView.K(focusedChild, rect2);
            if (rect2.left - i5 < paddingRight2 && rect2.right - i5 > paddingLeft2 && rect2.top - iMin2 < paddingBottom2 && rect2.bottom - iMin2 > paddingTop2) {
                if (i5 == 0) {
                    if (iMin2 != 0) {
                        i5 = 0;
                    }
                }
                if (z) {
                    recyclerView.scrollBy(i5, iMin2);
                } else {
                    recyclerView.as(i5, iMin2, false);
                }
                return true;
            }
        }
        return false;
    }

    public boolean bg(android.view.View view, int i, int i2, defpackage.md mdVar) {
        return (!view.isLayoutRequested() && this.w && defpackage.tna.al(view.getWidth(), i, mdVar.width) && defpackage.tna.al(view.getHeight(), i2, mdVar.height)) ? false : true;
    }

    public final void bo(android.view.View view, android.graphics.Rect rect) {
        android.graphics.Matrix matrix;
        android.graphics.Rect rect2 = ((defpackage.md) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.s != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            android.graphics.RectF rectF = this.s.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public final boolean bp(android.view.View view) {
        return (this.E.H(view) && this.F.H(view)) ? false : true;
    }

    public final void bs(android.view.View view) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        android.graphics.Rect rectF = this.s.f(view);
        int i = rectF.left + rectF.right;
        int i2 = rectF.top + rectF.bottom;
        int iAw = aw(this.C, this.A, getPaddingLeft() + getPaddingRight() + mdVar.leftMargin + mdVar.rightMargin + i, mdVar.width, ag());
        int iAw2 = aw(this.D, this.B, getPaddingTop() + getPaddingBottom() + mdVar.topMargin + mdVar.bottomMargin + i2, mdVar.height, ah());
        if (bg(view, iAw, iAw2, mdVar)) {
            view.measure(iAw, iAw2);
        }
    }

    public boolean bu(java.util.ArrayList arrayList, int i) {
        return false;
    }

    public final void bw(int i, int i2) {
        this.s.A(i, i2);
    }

    public boolean bx(android.support.v7.widget.RecyclerView recyclerView, android.view.View view, android.view.View view2) {
        return be() || recyclerView.ao();
    }

    public final void by(java.lang.Runnable runnable) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    public final void bz(android.support.v7.widget.RecyclerView recyclerView) {
        this.v = false;
        ar(recyclerView);
    }

    public int d(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        return 0;
    }

    public int e(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        throw null;
    }

    public abstract defpackage.md f();

    public int fa(defpackage.mh mhVar, defpackage.mo moVar) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || recyclerView.m == null || !ag()) {
            return 1;
        }
        return this.s.m.a();
    }

    public int fb(defpackage.mh mhVar, defpackage.mo moVar) {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null || recyclerView.m == null || !ah()) {
            return 1;
        }
        return this.s.m.a();
    }

    public defpackage.md fc(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.md) {
            return new defpackage.md((defpackage.md) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.md((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.md(layoutParams);
    }

    public android.view.View fd(int i, defpackage.mh mhVar, defpackage.mo moVar) {
        return null;
    }

    public android.view.View fe(android.view.View view, int i, defpackage.mh mhVar, defpackage.mo moVar) {
        return null;
    }

    public void ff(defpackage.mh mhVar, defpackage.mo moVar, defpackage.edn ednVar) {
        if (this.s.canScrollVertically(-1) || this.s.canScrollHorizontally(-1)) {
            ednVar.g(8192);
            ednVar.M(true);
            ednVar.m(67108864, true);
        }
        if (this.s.canScrollVertically(1) || this.s.canScrollHorizontally(1)) {
            ednVar.g(4096);
            ednVar.M(true);
            ednVar.m(67108864, true);
        }
        ednVar.t(defpackage.erh.K(fb(mhVar, moVar), fa(mhVar, moVar), 0));
    }

    public void fg(defpackage.mh mhVar, defpackage.mo moVar, android.view.View view, defpackage.edn ednVar) {
        ednVar.u(defpackage.erh.J(ah() ? bl(view) : 0, 1, ag() ? bl(view) : 0, 1, false));
    }

    public void fh(android.graphics.Rect rect, int i, int i2) {
        aZ(au(i, rect.width() + getPaddingLeft() + getPaddingRight(), aA()), au(i2, rect.height() + getPaddingTop() + getPaddingBottom(), az()));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c A[PHI: r0
  0x008c: PHI (r0v7 int) = (r0v4 int), (r0v16 int) binds: [B:26:0x007f, B:19:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean fi(int i, android.os.Bundle bundle) {
        int paddingTop;
        int paddingLeft;
        float f;
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        defpackage.mh mhVar = recyclerView.e;
        defpackage.mo moVar = recyclerView.N;
        if (recyclerView == null) {
            return false;
        }
        int iHeight = this.D;
        int iWidth = this.C;
        android.graphics.Rect rect = new android.graphics.Rect();
        if (this.s.getMatrix().isIdentity() && this.s.getGlobalVisibleRect(rect)) {
            iHeight = rect.height();
            iWidth = rect.width();
        }
        if (i == 4096) {
            paddingTop = this.s.canScrollVertically(1) ? (iHeight - getPaddingTop()) - getPaddingBottom() : 0;
            if (this.s.canScrollHorizontally(1)) {
                paddingLeft = (iWidth - getPaddingLeft()) - getPaddingRight();
            } else {
                paddingLeft = 0;
            }
        } else if (i != 8192) {
            paddingTop = 0;
            paddingLeft = 0;
        } else {
            paddingTop = this.s.canScrollVertically(-1) ? -((iHeight - getPaddingTop()) - getPaddingBottom()) : 0;
            if (this.s.canScrollHorizontally(-1)) {
                paddingLeft = -((iWidth - getPaddingLeft()) - getPaddingRight());
            } else {
                paddingLeft = 0;
            }
        }
        if (paddingTop == 0) {
            if (paddingLeft == 0) {
                return false;
            }
            paddingTop = 0;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                return false;
            }
        } else {
            f = 1.0f;
        }
        if (java.lang.Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
            if (java.lang.Float.compare(1.0f, f) != 0 && java.lang.Float.compare(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f) != 0) {
                paddingTop = (int) (paddingTop * f);
                paddingLeft = (int) (paddingLeft * f);
            }
            this.s.as(paddingLeft, paddingTop, true);
            return true;
        }
        android.support.v7.widget.RecyclerView recyclerView2 = this.s;
        defpackage.lw lwVar = recyclerView2.m;
        if (lwVar == null) {
            return false;
        }
        if (i == 4096) {
            recyclerView2.ad(lwVar.a() - 1);
            return true;
        }
        if (i != 8192) {
            return true;
        }
        recyclerView2.ad(0);
        return true;
    }

    public boolean fj() {
        return false;
    }

    public final int getPaddingBottom() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int getPaddingEnd() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = defpackage.ebt.a;
        return recyclerView.getPaddingEnd();
    }

    public final int getPaddingLeft() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int getPaddingRight() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int getPaddingStart() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = defpackage.ebt.a;
        return recyclerView.getPaddingStart();
    }

    public final int getPaddingTop() {
        android.support.v7.widget.RecyclerView recyclerView = this.s;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public defpackage.md h(android.content.Context context, android.util.AttributeSet attributeSet) {
        return new defpackage.md(context, attributeSet);
    }

    public void p(defpackage.mh mhVar, defpackage.mo moVar) {
        throw null;
    }

    public boolean u(defpackage.md mdVar) {
        return mdVar != null;
    }

    public void bt() {
    }

    public void fk() {
    }

    public void aM(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void aO(int i) {
    }

    public void ab(android.os.Parcelable parcelable) {
    }

    public void ar(android.support.v7.widget.RecyclerView recyclerView) {
    }

    public void bv(int i) {
    }

    public void q(defpackage.mo moVar) {
    }

    public void A(int i, int i2) {
    }

    public void B(int i, int i2) {
    }

    public void ao(int i, defpackage.kz kzVar) {
    }

    public void y(int i, int i2) {
    }

    public void an(int i, int i2, defpackage.mo moVar, defpackage.kz kzVar) {
    }
}
