package androidx.viewpager.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ViewPager extends android.view.ViewGroup {
    public static final int[] a = {android.R.attr.layout_gravity};
    private static final java.util.Comparator h = new defpackage.cjd(7);
    private static final android.view.animation.Interpolator i = new defpackage.fif(0);
    private int A;
    private int B;
    private final boolean C;
    private float D;
    private float E;
    private float F;
    private float G;
    private int H;
    private android.view.VelocityTracker I;
    private int J;
    private int K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private int P;
    private final java.lang.Runnable Q;
    private int R;
    public defpackage.fie b;
    public int c;
    public android.widget.EdgeEffect d;
    public android.widget.EdgeEffect e;
    public java.util.List f;
    public java.util.List g;
    private int j;
    private final java.util.ArrayList k;
    private final defpackage.fii l;
    private final android.graphics.Rect m;
    private int n;
    private android.widget.Scroller o;
    private boolean p;
    private defpackage.fim q;
    private float r;
    private float s;
    private boolean t;
    private boolean u;
    private boolean v;
    private final int w;
    private boolean x;
    private boolean y;
    private int z;

    public ViewPager(android.content.Context context) {
        super(context);
        this.k = new java.util.ArrayList();
        this.l = new defpackage.fii();
        this.m = new android.graphics.Rect();
        this.n = -1;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.w = 1;
        this.C = true;
        this.H = -1;
        this.N = true;
        this.Q = new defpackage.eaw(this, 15, null);
        this.R = 0;
        p(context);
    }

    private final boolean A(int i2) {
        if (this.k.size() == 0) {
            if (this.N) {
                return false;
            }
            this.O = false;
            r(0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            if (this.O) {
                return false;
            }
            throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        defpackage.fii fiiVarU = u();
        float fS = s();
        float f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED / fS;
        int i3 = fiiVarU.b;
        float f2 = (i2 / fS) - fiiVarU.e;
        float f3 = fiiVarU.d + f;
        this.O = false;
        r(i3, f2 / f3);
        if (this.O) {
            return true;
        }
        throw new java.lang.IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean B(float f, float f2) {
        float f3;
        boolean z;
        float f4 = this.D - f;
        this.D = f;
        float height = getHeight();
        float width = f4 / getWidth();
        float f5 = f2 / height;
        if (defpackage.dtf.e(this.d) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            f3 = -defpackage.dtf.f(this.d, -width, 1.0f - f5);
        } else {
            f3 = defpackage.dtf.e(this.e) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? defpackage.dtf.f(this.e, width, f5) : 0.0f;
        }
        float width2 = f3 * getWidth();
        float f6 = f4 - width2;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = width2 != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        if (java.lang.Math.abs(f6) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f6;
        float fS = s();
        float f7 = this.r * fS;
        float f8 = this.s * fS;
        java.util.ArrayList arrayList = this.k;
        defpackage.fii fiiVar = (defpackage.fii) arrayList.get(0);
        defpackage.fii fiiVar2 = (defpackage.fii) arrayList.get(arrayList.size() - 1);
        if (fiiVar.b != 0) {
            f7 = fiiVar.e * fS;
            z = false;
        } else {
            z = true;
        }
        if (fiiVar2.b != this.b.e() - 1) {
            f8 = fiiVar2.e * fS;
        } else {
            z2 = true;
        }
        if (scrollX < f7) {
            if (z) {
                defpackage.dtf.f(this.d, (f7 - scrollX) / fS, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f7;
        } else if (scrollX > f8) {
            if (z2) {
                defpackage.dtf.f(this.e, (scrollX - f8) / fS, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f8;
        } else {
            z3 = z4;
        }
        int i2 = (int) scrollX;
        this.D += scrollX - i2;
        scrollTo(i2, getScrollY());
        A(i2);
        return z3;
    }

    private final boolean C() {
        this.H = -1;
        this.x = false;
        this.y = false;
        android.view.VelocityTracker velocityTracker = this.I;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.I = null;
        }
        this.d.onRelease();
        this.e.onRelease();
        return (this.d.isFinished() && this.e.isFinished()) ? false : true;
    }

    private final void D() {
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int s() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final android.graphics.Rect t(android.graphics.Rect rect, android.view.View view) {
        if (rect == null) {
            rect = new android.graphics.Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        android.view.ViewParent parent = view.getParent();
        while ((parent instanceof android.view.ViewGroup) && parent != this) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final defpackage.fii u() {
        int i2;
        int iS = s();
        float f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        float scrollX = iS > 0 ? getScrollX() / iS : 0.0f;
        float f2 = iS > 0 ? com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED / iS : 0.0f;
        int i3 = 0;
        int i4 = -1;
        boolean z = true;
        defpackage.fii fiiVar = null;
        float f3 = 0.0f;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (i3 >= arrayList.size()) {
                break;
            }
            defpackage.fii fiiVar2 = (defpackage.fii) arrayList.get(i3);
            if (!z && fiiVar2.b != (i2 = i4 + 1)) {
                fiiVar2 = this.l;
                fiiVar2.e = f + f3 + f2;
                fiiVar2.b = i2;
                fiiVar2.d = 1.0f;
                i3--;
            }
            defpackage.fii fiiVar3 = fiiVar2;
            f = fiiVar3.e;
            float f4 = fiiVar3.d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i3 == arrayList.size() - 1) {
                return fiiVar3;
            }
            i4 = fiiVar3.b;
            i3++;
            fiiVar = fiiVar3;
            f3 = fiiVar3.d;
            z = false;
        }
        return fiiVar;
    }

    private final void v(boolean z) {
        boolean z2 = this.R == 2;
        if (z2) {
            z(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A(currX);
                    }
                }
            }
        }
        this.v = false;
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                break;
            }
            defpackage.fii fiiVar = (defpackage.fii) arrayList.get(i2);
            if (fiiVar.c) {
                fiiVar.c = false;
                z2 = true;
            }
            i2++;
        }
        if (z2) {
            java.lang.Runnable runnable = this.Q;
            if (!z) {
                runnable.run();
            } else {
                int[] iArr = defpackage.ebt.a;
                postOnAnimation(runnable);
            }
        }
    }

    private final void w(int i2) {
        java.util.List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.fil filVar = (defpackage.fil) this.f.get(i3);
                if (filVar != null) {
                    filVar.b(i2);
                }
            }
        }
    }

    private final void x(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.D = motionEvent.getX(i2);
            this.H = motionEvent.getPointerId(i2);
            android.view.VelocityTracker velocityTracker = this.I;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void y(int i2, boolean z, int i3, boolean z2) {
        int scrollX;
        int i4;
        int iAbs;
        defpackage.fii fiiVarC = c(i2);
        int iS = fiiVarC != null ? (int) (s() * java.lang.Math.max(this.r, java.lang.Math.min(fiiVarC.e, this.s))) : 0;
        if (!z) {
            if (z2) {
                w(i2);
            }
            v(false);
            scrollTo(iS, 0);
            A(iS);
            return;
        }
        if (getChildCount() == 0) {
            z(false);
        } else {
            android.widget.Scroller scroller = this.o;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                boolean z3 = this.p;
                android.widget.Scroller scroller2 = this.o;
                scrollX = z3 ? scroller2.getCurrX() : scroller2.getStartX();
                this.o.abortAnimation();
                z(false);
            }
            int i5 = scrollX;
            int scrollY = getScrollY();
            int i6 = iS - i5;
            int i7 = -scrollY;
            if (i6 != 0) {
                i4 = i6;
            } else if (i7 == 0) {
                v(false);
                f();
                k(0);
            } else {
                i4 = 0;
            }
            z(true);
            k(2);
            int iS2 = s();
            int i8 = iS2 / 2;
            float f = iS2;
            float fSin = (float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i4) / f) - 0.5f) * 0.47123894f);
            int iAbs2 = java.lang.Math.abs(i3);
            if (iAbs2 > 0) {
                float f2 = i8;
                iAbs = java.lang.Math.round(java.lang.Math.abs((f2 + (fSin * f2)) / iAbs2) * 1000.0f) * 4;
            } else {
                iAbs = (int) (((java.lang.Math.abs(i4) / (f + com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED)) + 1.0f) * 100.0f);
            }
            int iMin = java.lang.Math.min(iAbs, 600);
            this.p = false;
            this.o.startScroll(i5, scrollY, i4, i7, iMin);
            postInvalidateOnAnimation();
        }
        if (z2) {
            w(i2);
        }
    }

    private final void z(boolean z) {
        if (this.u != z) {
            this.u = z;
        }
    }

    final defpackage.fii a(int i2, int i3) {
        defpackage.fii fiiVar = new defpackage.fii();
        fiiVar.b = i2;
        defpackage.fie fieVar = this.b;
        defpackage.bx bxVar = (defpackage.bx) fieVar;
        if (bxVar.b == null) {
            bxVar.b = new defpackage.w(bxVar.a);
        }
        long j = i2;
        android.support.v4.app.Fragment fragmentF = bxVar.a.f(defpackage.bx.a(getId(), j));
        if (fragmentF != null) {
            bxVar.b.o(fragmentF);
        } else {
            defpackage.wlc wlcVar = (defpackage.wlc) fieVar;
            fragmentF = ((defpackage.wkx) wlcVar.e.get(i2)).a(wlcVar.f, i2);
            fragmentF.getArguments().putInt("QuestionIndex", i2);
            bxVar.b.e(getId(), fragmentF, defpackage.bx.a(getId(), j), 1);
        }
        if (fragmentF != bxVar.c) {
            fragmentF.setMenuVisibility(false);
            fragmentF.setUserVisibleHint(false);
        }
        fiiVar.a = fragmentF;
        fiiVar.d = 1.0f;
        if (i3 >= 0) {
            java.util.ArrayList arrayList = this.k;
            if (i3 < arrayList.size()) {
                arrayList.add(i3, fiiVar);
                return fiiVar;
            }
        }
        this.k.add(fiiVar);
        return fiiVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i2, int i3) {
        defpackage.fii fiiVarB;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                android.view.View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fiiVarB = b(childAt)) != null && fiiVarB.b == this.c) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(java.util.ArrayList arrayList) {
        defpackage.fii fiiVarB;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fiiVarB = b(childAt)) != null && fiiVarB.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i2, android.view.ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new defpackage.fij();
        }
        defpackage.fij fijVar = (defpackage.fij) layoutParams;
        boolean z = fijVar.a | (view.getClass().getAnnotation(defpackage.fih.class) != null);
        fijVar.a = z;
        if (!this.t) {
            super.addView(view, i2, layoutParams);
        } else {
            if (fijVar != null && z) {
                throw new java.lang.IllegalStateException("Cannot add pager decor view during layout");
            }
            fijVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    final defpackage.fii b(android.view.View view) {
        int i2 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (i2 >= arrayList.size()) {
                return null;
            }
            defpackage.fii fiiVar = (defpackage.fii) arrayList.get(i2);
            if (((android.support.v4.app.Fragment) fiiVar.a).getView() == view) {
                return fiiVar;
            }
            i2++;
        }
    }

    final defpackage.fii c(int i2) {
        int i3 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.k;
            if (i3 >= arrayList.size()) {
                return null;
            }
            defpackage.fii fiiVar = (defpackage.fii) arrayList.get(i3);
            if (fiiVar.b == i2) {
                return fiiVar;
            }
            i3++;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        if (this.b == null) {
            return false;
        }
        int iS = s();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) iS) * this.r));
        }
        return i2 > 0 && scrollX < ((int) (((float) iS) * this.s));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.fij) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            v(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!A(currX)) {
                this.o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(defpackage.fil filVar) {
        if (this.f == null) {
            this.f = new java.util.ArrayList();
        }
        this.f.add(filVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        boolean zN;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() != 0) {
                zN = false;
            } else {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 21) {
                    zN = keyEvent.hasModifiers(2) ? n() : l(17);
                } else if (keyCode == 22) {
                    zN = keyEvent.hasModifiers(2) ? o() : l(66);
                } else if (keyCode != 61) {
                    zN = false;
                } else if (keyEvent.hasNoModifiers()) {
                    zN = l(2);
                } else if (keyEvent.hasModifiers(1)) {
                    zN = l(1);
                } else {
                    zN = false;
                }
            }
            if (!zN) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        defpackage.fii fiiVarB;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fiiVarB = b(childAt)) != null && fiiVarB.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        boolean zDraw;
        defpackage.fie fieVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (fieVar = this.b) == null || fieVar.e() <= 1)) {
            this.d.finish();
            this.e.finish();
            return;
        }
        if (this.d.isFinished()) {
            zDraw = false;
        } else {
            int iSave = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.r * width);
            this.d.setSize(height, width);
            zDraw = this.d.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        if (!this.e.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.s + 1.0f)) * width2);
            this.e.setSize(height2, width2);
            zDraw |= this.e.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        if (zDraw) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() {
        int iE = this.b.e();
        this.j = iE;
        int i2 = this.w;
        java.util.ArrayList arrayList = this.k;
        boolean z = arrayList.size() < (i2 + i2) + 1 && arrayList.size() < iE;
        int i3 = this.c;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            java.lang.Object obj = ((defpackage.fii) arrayList.get(i4)).a;
        }
        java.util.Collections.sort(arrayList, h);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                defpackage.fij fijVar = (defpackage.fij) getChildAt(i5).getLayoutParams();
                if (!fijVar.a) {
                    fijVar.c = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                }
            }
            j(i3, false, true, 0);
            requestLayout();
        }
    }

    public final void f() {
        g(this.c);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f0 A[PHI: r7 r10 r11
  0x00f0: PHI (r7v16 int) = (r7v15 int), (r7v4 int) binds: [B:60:0x00e7, B:57:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r10v32 float) = (r10v31 float), (r10v33 float) binds: [B:60:0x00e7, B:57:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x00f0: PHI (r11v32 int) = (r11v1 int), (r11v33 int) binds: [B:60:0x00e7, B:57:0x00d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0182 A[PHI: r4
  0x0182: PHI (r4v15 float) = (r4v14 float), (r4v17 float) binds: [B:97:0x0179, B:94:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    final void g(int i2) {
        defpackage.fii fiiVarC;
        java.lang.String hexString;
        java.util.ArrayList arrayList;
        defpackage.fii fiiVarA;
        float f;
        defpackage.fii fiiVarB;
        defpackage.fii fiiVarB2;
        float f2;
        int i3;
        int i4;
        defpackage.fii fiiVar;
        defpackage.fii fiiVar2;
        float f3;
        int i5 = this.c;
        if (i5 != i2) {
            fiiVarC = c(i5);
            this.c = i2;
        } else {
            fiiVarC = null;
        }
        if (this.b == null || this.v || getWindowToken() == null) {
            return;
        }
        this.b.b(this);
        int i6 = this.w;
        int iMax = java.lang.Math.max(0, this.c - i6);
        int iE = this.b.e();
        int iMin = java.lang.Math.min(iE - 1, this.c + i6);
        if (iE != this.j) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (android.content.res.Resources.NotFoundException unused) {
                hexString = java.lang.Integer.toHexString(getId());
            }
            throw new java.lang.IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.j + ", found: " + iE + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.b.getClass());
        }
        int i7 = 0;
        while (true) {
            arrayList = this.k;
            if (i7 < arrayList.size()) {
                fiiVarA = (defpackage.fii) arrayList.get(i7);
                int i8 = fiiVarA.b;
                int i9 = this.c;
                if (i8 >= i9) {
                    if (i8 != i9) {
                        break;
                    } else {
                        break;
                    }
                }
                i7++;
            }
            fiiVarA = null;
            break;
        }
        if (fiiVarA == null && iE > 0) {
            fiiVarA = a(this.c, i7);
        }
        if (fiiVarA != null) {
            int i10 = i7 - 1;
            defpackage.fii fiiVar3 = i10 >= 0 ? (defpackage.fii) arrayList.get(i10) : null;
            int iS = s();
            float f4 = 2.0f;
            if (iS <= 0) {
                f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                f2 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            } else {
                float f5 = 2.0f - fiiVarA.d;
                float paddingLeft = getPaddingLeft();
                f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                f2 = f5 + (paddingLeft / iS);
            }
            int i11 = this.c - 1;
            float f6 = f;
            while (i11 >= 0) {
                if (f6 < f2 || i11 >= iMax) {
                    f3 = f4;
                    if (fiiVar3 == null || i11 != fiiVar3.b) {
                        i7++;
                        f6 += a(i11, i10 + 1).d;
                        if (i10 >= 0) {
                            fiiVar3 = (defpackage.fii) arrayList.get(i10);
                        } else {
                            fiiVar3 = null;
                        }
                    } else {
                        i10--;
                        f6 += fiiVar3.d;
                        if (i10 >= 0) {
                            fiiVar3 = (defpackage.fii) arrayList.get(i10);
                        } else {
                            fiiVar3 = null;
                        }
                    }
                } else {
                    if (fiiVar3 == null) {
                        break;
                    }
                    f3 = f4;
                    if (i11 == fiiVar3.b && !fiiVar3.c) {
                        int i12 = i10 - 1;
                        i7--;
                        arrayList.remove(i10);
                        this.b.c(fiiVar3.a);
                        fiiVar3 = i12 >= 0 ? (defpackage.fii) arrayList.get(i12) : null;
                        i10 = i12;
                    }
                }
                i11--;
                f4 = f3;
            }
            float f7 = f4;
            int i13 = i7 + 1;
            float f8 = fiiVarA.d;
            boolean z = true;
            if (f8 < f7) {
                defpackage.fii fiiVar4 = i13 < arrayList.size() ? (defpackage.fii) arrayList.get(i13) : null;
                float paddingRight = iS <= 0 ? f : (getPaddingRight() / iS) + f7;
                int i14 = this.c + 1;
                int i15 = i13;
                while (i14 < iE) {
                    if (f8 < paddingRight || i14 <= iMin) {
                        int i16 = i15 + 1;
                        if (fiiVar4 == null || i14 != fiiVar4.b) {
                            f8 += a(i14, i15).d;
                            if (i16 < arrayList.size()) {
                                fiiVar4 = (defpackage.fii) arrayList.get(i16);
                            } else {
                                fiiVar4 = null;
                            }
                        } else {
                            f8 += fiiVar4.d;
                            if (i16 < arrayList.size()) {
                                fiiVar4 = (defpackage.fii) arrayList.get(i16);
                            } else {
                                fiiVar4 = null;
                            }
                        }
                        i15 = i16;
                    } else {
                        if (fiiVar4 == null) {
                            break;
                        }
                        if (i14 == fiiVar4.b && !fiiVar4.c) {
                            arrayList.remove(i15);
                            this.b.c(fiiVar4.a);
                            if (i15 < arrayList.size()) {
                                fiiVar4 = (defpackage.fii) arrayList.get(i15);
                            } else {
                                fiiVar4 = null;
                            }
                        }
                    }
                    i14++;
                    z = z;
                }
            }
            boolean z2 = z;
            int iE2 = this.b.e();
            int iS2 = s();
            float f9 = iS2 > 0 ? f / iS2 : f;
            if (fiiVarC != null) {
                int i17 = fiiVarC.b;
                int i18 = fiiVarA.b;
                if (i17 < i18) {
                    float f10 = fiiVarC.e + fiiVarC.d + f9;
                    int i19 = i17 + 1;
                    int i20 = 0;
                    while (i19 <= fiiVarA.b && i20 < arrayList.size()) {
                        java.lang.Object obj = arrayList.get(i20);
                        while (true) {
                            fiiVar2 = (defpackage.fii) obj;
                            if (i19 <= fiiVar2.b || i20 >= arrayList.size() - 1) {
                                break;
                            }
                            i20++;
                            obj = arrayList.get(i20);
                        }
                        while (i19 < fiiVar2.b) {
                            f10 += f9 + 1.0f;
                            i19++;
                        }
                        fiiVar2.e = f10;
                        f10 += fiiVar2.d + f9;
                        i19++;
                    }
                } else if (i17 > i18) {
                    int size = arrayList.size() - 1;
                    float f11 = fiiVarC.e;
                    while (true) {
                        i17--;
                        if (i17 < fiiVarA.b || size < 0) {
                            break;
                        }
                        java.lang.Object obj2 = arrayList.get(size);
                        while (true) {
                            fiiVar = (defpackage.fii) obj2;
                            if (i17 >= fiiVar.b || size <= 0) {
                                break;
                            }
                            size--;
                            obj2 = arrayList.get(size);
                        }
                        while (i17 > fiiVar.b) {
                            f11 -= f9 + 1.0f;
                            i17--;
                        }
                        f11 -= fiiVar.d + f9;
                        fiiVar.e = f11;
                    }
                }
            }
            int size2 = arrayList.size();
            float f12 = fiiVarA.e;
            int i21 = fiiVarA.b;
            int i22 = i21 - 1;
            this.r = i21 == 0 ? f12 : -3.4028235E38f;
            int i23 = iE2 - 1;
            this.s = i21 == i23 ? (fiiVarA.d + f12) - 1.0f : Float.MAX_VALUE;
            for (int i24 = i7 - 1; i24 >= 0; i24--) {
                defpackage.fii fiiVar5 = (defpackage.fii) arrayList.get(i24);
                while (true) {
                    i4 = fiiVar5.b;
                    if (i22 <= i4) {
                        break;
                    }
                    f12 -= f9 + 1.0f;
                    i22--;
                }
                f12 -= fiiVar5.d + f9;
                fiiVar5.e = f12;
                if (i4 == 0) {
                    this.r = f12;
                }
                i22--;
            }
            float f13 = fiiVarA.e + fiiVarA.d + f9;
            int i25 = fiiVarA.b + 1;
            while (i13 < size2) {
                defpackage.fii fiiVar6 = (defpackage.fii) arrayList.get(i13);
                while (true) {
                    i3 = fiiVar6.b;
                    if (i25 >= i3) {
                        break;
                    }
                    f13 += f9 + 1.0f;
                    i25++;
                }
                if (i3 == i23) {
                    this.s = (fiiVar6.d + f13) - 1.0f;
                }
                fiiVar6.e = f13;
                f13 += fiiVar6.d + f9;
                i25++;
                i13++;
            }
            defpackage.fie fieVar = this.b;
            java.lang.Object obj3 = fiiVarA.a;
            defpackage.bx bxVar = (defpackage.bx) fieVar;
            android.support.v4.app.Fragment fragment = bxVar.c;
            if (obj3 != fragment) {
                if (fragment != null) {
                    fragment.setMenuVisibility(false);
                    bxVar.c.setUserVisibleHint(false);
                }
                android.support.v4.app.Fragment fragment2 = (android.support.v4.app.Fragment) obj3;
                fragment2.setMenuVisibility(z2);
                fragment2.setUserVisibleHint(z2);
                bxVar.c = fragment2;
            }
        } else {
            f = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        this.b.d();
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            android.view.View childAt = getChildAt(i26);
            defpackage.fij fijVar = (defpackage.fij) childAt.getLayoutParams();
            fijVar.f = i26;
            if (!fijVar.a && fijVar.c == f && (fiiVarB2 = b(childAt)) != null) {
                fijVar.c = fiiVarB2.d;
                fijVar.e = fiiVarB2.b;
            }
        }
        if (hasFocus()) {
            android.view.View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                fiiVarB = null;
                break;
            }
            while (true) {
                java.lang.Object parent = viewFindFocus.getParent();
                if (parent == this) {
                    fiiVarB = b(viewFindFocus);
                    break;
                } else {
                    if (!(parent instanceof android.view.View)) {
                        fiiVarB = null;
                        break;
                    }
                    viewFindFocus = (android.view.View) parent;
                }
            }
            if (fiiVarB == null || fiiVarB.b != this.c) {
                for (int i27 = 0; i27 < getChildCount(); i27++) {
                    android.view.View childAt2 = getChildAt(i27);
                    defpackage.fii fiiVarB3 = b(childAt2);
                    if (fiiVarB3 != null && fiiVarB3.b == this.c && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.fij();
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.fij(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i2, int i3) {
        throw null;
    }

    public final void h(defpackage.fie fieVar) {
        java.util.ArrayList arrayList;
        defpackage.fie fieVar2 = this.b;
        if (fieVar2 != null) {
            fieVar2.f();
            this.b.b(this);
            int i2 = 0;
            while (true) {
                arrayList = this.k;
                if (i2 >= arrayList.size()) {
                    break;
                }
                defpackage.fii fiiVar = (defpackage.fii) arrayList.get(i2);
                defpackage.fie fieVar3 = this.b;
                int i3 = fiiVar.b;
                fieVar3.c(fiiVar.a);
                i2++;
            }
            this.b.d();
            arrayList.clear();
            int i4 = 0;
            while (i4 < getChildCount()) {
                if (!((defpackage.fij) getChildAt(i4).getLayoutParams()).a) {
                    removeViewAt(i4);
                    i4--;
                }
                i4++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = fieVar;
        this.j = 0;
        if (fieVar != null) {
            if (this.q == null) {
                this.q = new defpackage.fim(this);
            }
            this.b.f();
            this.v = false;
            boolean z = this.N;
            this.N = true;
            this.j = this.b.e();
            int i5 = this.n;
            if (i5 >= 0) {
                j(i5, false, true, 0);
                this.n = -1;
            } else if (z) {
                requestLayout();
            } else {
                f();
            }
        }
        java.util.List list = this.g;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.g.size();
        for (int i6 = 0; i6 < size; i6++) {
            defpackage.wwy wwyVar = (defpackage.wwy) this.g.get(i6);
            com.google.android.material.tabs.TabLayout tabLayout = wwyVar.b;
            if (tabLayout.B == this) {
                tabLayout.l(fieVar, wwyVar.a);
            }
        }
    }

    public final void i(int i2) {
        this.v = false;
        j(i2, !this.N, false, 0);
    }

    final void j(int i2, boolean z, boolean z2, int i3) {
        defpackage.fie fieVar = this.b;
        if (fieVar == null || fieVar.e() <= 0) {
            z(false);
            return;
        }
        if (!z2 && this.c == i2 && this.k.size() != 0) {
            z(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.b.e()) {
            i2 = this.b.e() - 1;
        }
        int i4 = this.w;
        int i5 = this.c;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            int i6 = 0;
            while (true) {
                java.util.ArrayList arrayList = this.k;
                if (i6 >= arrayList.size()) {
                    break;
                }
                ((defpackage.fii) arrayList.get(i6)).c = true;
                i6++;
            }
        }
        boolean z3 = this.c != i2;
        if (!this.N) {
            g(i2);
            y(i2, z, i3, z3);
        } else {
            this.c = i2;
            if (z3) {
                w(i2);
            }
            requestLayout();
        }
    }

    public final void k(int i2) {
        if (this.R == i2) {
            return;
        }
        this.R = i2;
        java.util.List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.fil filVar = (defpackage.fil) this.f.get(i3);
                if (filVar != null) {
                    filVar.a(i2);
                }
            }
        }
    }

    public final boolean l(int i2) {
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            android.view.ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof android.view.ViewGroup)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(viewFindFocus.getClass().getSimpleName());
                    for (android.view.ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof android.view.ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(" => ");
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    android.util.Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view ".concat(sb.toString()));
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        boolean zN = false;
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                zN = n();
            } else if (i2 == 66 || i2 == 2) {
                zN = o();
            }
        } else if (i2 == 17) {
            android.graphics.Rect rect = this.m;
            zN = (viewFindFocus == null || t(rect, viewFindNextFocus).left < t(rect, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : n();
        } else if (i2 == 66) {
            android.graphics.Rect rect2 = this.m;
            zN = (viewFindFocus == null || t(rect2, viewFindNextFocus).left > t(rect2, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : o();
        }
        if (zN) {
            playSoundEffect(android.view.SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return zN;
    }

    protected final boolean m(android.view.View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                android.view.View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && m(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    final boolean n() {
        int i2 = this.c;
        if (i2 <= 0) {
            return false;
        }
        q(i2 - 1);
        return true;
    }

    final boolean o() {
        defpackage.fie fieVar = this.b;
        if (fieVar == null || this.c >= fieVar.e() - 1) {
            return false;
        }
        q(this.c + 1);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.Q);
        android.widget.Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            C();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
            this.y = false;
            this.p = true;
            this.o.computeScrollOffset();
            if (this.R == 2 && java.lang.Math.abs(this.o.getFinalX() - this.o.getCurrX()) > this.M) {
                this.o.abortAnimation();
                this.v = false;
                f();
                this.x = true;
                D();
                k(1);
            } else if (defpackage.dtf.e(this.d) == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && defpackage.dtf.e(this.e) == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                v(false);
                this.x = false;
            } else {
                this.x = true;
                k(1);
                if (defpackage.dtf.e(this.d) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    defpackage.dtf.f(this.d, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f - (this.E / getHeight()));
                }
                if (defpackage.dtf.e(this.e) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    defpackage.dtf.f(this.e, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, this.E / getHeight());
                }
            }
        } else {
            if (this.x) {
                return true;
            }
            if (this.y) {
                return false;
            }
            if (action == 2) {
                int i2 = this.H;
                if (i2 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float f = x2 - this.D;
                    float fAbs = java.lang.Math.abs(f);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = java.lang.Math.abs(y2 - this.G);
                    if (f != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        float f2 = this.D;
                        if ((this.C || ((f2 >= this.A || f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) && (f2 <= getWidth() - this.A || f >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED))) && m(this, false, (int) f, (int) x2, (int) y2)) {
                            this.D = x2;
                            this.E = y2;
                            this.y = true;
                            return false;
                        }
                    }
                    float f3 = this.B;
                    if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                        this.x = true;
                        D();
                        k(1);
                        float f4 = this.F;
                        this.D = f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? f4 + this.B : f4 - this.B;
                        this.E = y2;
                        z(true);
                    } else if (fAbs2 > f3) {
                        this.y = true;
                    }
                    if (this.x && B(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                x(motionEvent);
            }
        }
        android.view.VelocityTracker velocityTrackerObtain = this.I;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.I = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        return this.x;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        defpackage.fii fiiVarB;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            i6 = i5 - i3;
            i7 = i4 - i2;
            if (i8 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                defpackage.fij fijVar = (defpackage.fij) childAt.getLayoutParams();
                if (fijVar.a) {
                    int i10 = fijVar.b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i7 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, childAt.getMeasuredHeight() + paddingTop);
                            i9++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = java.lang.Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = java.lang.Math.max((i7 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i6 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, childAt.getMeasuredHeight() + paddingTop);
                        i9++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = java.lang.Math.max((i6 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, childAt.getMeasuredHeight() + paddingTop);
                    i9++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
            i8++;
        }
        int i20 = (i7 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            android.view.View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                defpackage.fij fijVar2 = (defpackage.fij) childAt2.getLayoutParams();
                if (!fijVar2.a && (fiiVarB = b(childAt2)) != null) {
                    float f = i20;
                    int i22 = ((int) (fiiVarB.e * f)) + paddingLeft;
                    if (fijVar2.d) {
                        fijVar2.d = false;
                        childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (f * fijVar2.c), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((i6 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.P = i9;
        if (this.N) {
            y(this.c, false, 0, false);
        }
        this.N = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        defpackage.fij fijVar;
        defpackage.fij fijVar2;
        int i4;
        int i5;
        int i6;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i2), getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.A = java.lang.Math.min(measuredWidth / 10, this.z);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            android.view.View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && (fijVar2 = (defpackage.fij) childAt.getLayoutParams()) != null && fijVar2.a) {
                int i9 = fijVar2.b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z3 = (i11 == 48 || i11 == 80) ? true : z;
                if (i10 != 3 && i10 != 5) {
                    z2 = z;
                }
                int i12 = Integer.MIN_VALUE;
                if (z3) {
                    i4 = Integer.MIN_VALUE;
                    i12 = 1073741824;
                } else {
                    i4 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (fijVar2.width != -2) {
                    i5 = fijVar2.width != -1 ? fijVar2.width : paddingLeft;
                    i12 = 1073741824;
                } else {
                    i5 = paddingLeft;
                }
                if (fijVar2.height != -2) {
                    i6 = fijVar2.height != -1 ? fijVar2.height : measuredHeight;
                } else {
                    i6 = measuredHeight;
                    i8 = i4;
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(i5, i12), android.view.View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i7++;
            z = false;
        }
        int iMakeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.t = true;
        f();
        this.t = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            android.view.View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((fijVar = (defpackage.fij) childAt2.getLayoutParams()) == null || !fijVar.a)) {
                childAt2.measure(android.view.View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fijVar.c), 1073741824), iMakeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i2, android.graphics.Rect rect) {
        int i3;
        int i4;
        int i5;
        defpackage.fii fiiVarB;
        int i6 = i2 & 2;
        int childCount = getChildCount();
        if (i6 != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
            i5 = -1;
        }
        while (i3 != i5) {
            android.view.View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fiiVarB = b(childAt)) != null && fiiVarB.b == this.c && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof androidx.viewpager.widget.ViewPager.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.viewpager.widget.ViewPager.SavedState savedState = (androidx.viewpager.widget.ViewPager.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        if (this.b != null) {
            android.os.Parcelable parcelable2 = savedState.b;
            java.lang.ClassLoader classLoader = savedState.e;
            j(savedState.a, false, true, 0);
        } else {
            this.n = savedState.a;
            android.os.Parcelable parcelable3 = savedState.b;
            java.lang.ClassLoader classLoader2 = savedState.e;
        }
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
        androidx.viewpager.widget.ViewPager.SavedState savedState = new androidx.viewpager.widget.ViewPager.SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        if (this.b != null) {
            savedState.b = null;
        }
        return savedState;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            if (i4 > 0 && !this.k.isEmpty()) {
                if (!this.o.isFinished()) {
                    this.o.setFinalX(this.c * s());
                    return;
                }
                scrollTo((int) ((getScrollX() / ((i4 - getPaddingLeft()) - getPaddingRight())) * ((i2 - getPaddingLeft()) - getPaddingRight())), getScrollY());
                return;
            }
            defpackage.fii fiiVarC = c(this.c);
            int iMin = (int) ((fiiVarC != null ? java.lang.Math.min(fiiVarC.e, this.s) : com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin != getScrollX()) {
                v(false);
                scrollTo(iMin, getScrollY());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        defpackage.fie fieVar;
        int iMax;
        boolean zB;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (fieVar = this.b) == null || fieVar.e() == 0) {
            return false;
        }
        android.view.VelocityTracker velocityTrackerObtain = this.I;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.I = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.o.abortAnimation();
            this.v = false;
            f();
            float x = motionEvent.getX();
            this.F = x;
            this.D = x;
            float y = motionEvent.getY();
            this.G = y;
            this.E = y;
            this.H = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.D = motionEvent.getX(actionIndex);
                        this.H = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        x(motionEvent);
                        this.D = motionEvent.getX(motionEvent.findPointerIndex(this.H));
                    }
                } else if (this.x) {
                    y(this.c, true, 0, false);
                    zB = C();
                    if (zB) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (!this.x) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.H);
                if (iFindPointerIndex == -1) {
                    zB = C();
                } else {
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = java.lang.Math.abs(x2 - this.D);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = java.lang.Math.abs(y2 - this.E);
                    if (fAbs > this.B && fAbs > fAbs2) {
                        this.x = true;
                        D();
                        float f = this.F;
                        float f2 = x2 - f;
                        int i2 = this.B;
                        this.D = f2 > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? f + i2 : f - i2;
                        this.E = y2;
                        k(1);
                        z(true);
                        android.view.ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.x) {
                        int iFindPointerIndex2 = motionEvent.findPointerIndex(this.H);
                        zB = B(motionEvent.getX(iFindPointerIndex2), motionEvent.getY(iFindPointerIndex2));
                    }
                }
                if (zB) {
                    postInvalidateOnAnimation();
                }
            } else if (this.x) {
                int iFindPointerIndex3 = motionEvent.findPointerIndex(this.H);
                zB = B(motionEvent.getX(iFindPointerIndex3), motionEvent.getY(iFindPointerIndex3));
                if (zB) {
                    postInvalidateOnAnimation();
                }
            }
        } else if (this.x) {
            android.view.VelocityTracker velocityTracker = this.I;
            velocityTracker.computeCurrentVelocity(1000, this.K);
            int xVelocity = (int) velocityTracker.getXVelocity(this.H);
            this.v = true;
            int iS = s();
            int scrollX = getScrollX();
            defpackage.fii fiiVarU = u();
            float f3 = iS;
            float f4 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED / f3;
            int i3 = fiiVarU.b;
            float f5 = (scrollX / f3) - fiiVarU.e;
            float f6 = fiiVarU.d + f4;
            if (java.lang.Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.H)) - this.F)) <= this.L || java.lang.Math.abs(xVelocity) <= this.J || defpackage.dtf.e(this.d) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED || defpackage.dtf.e(this.e) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                iMax = ((int) ((f5 / f6) + (i3 >= this.c ? 0.4f : 0.6f))) + i3;
            } else {
                iMax = xVelocity > 0 ? i3 : i3 + 1;
            }
            java.util.ArrayList arrayList = this.k;
            if (arrayList.size() > 0) {
                iMax = java.lang.Math.max(((defpackage.fii) arrayList.get(0)).b, java.lang.Math.min(iMax, ((defpackage.fii) arrayList.get(arrayList.size() - 1)).b));
            }
            j(iMax, true, true, xVelocity);
            boolean zC = C();
            if (iMax == i3 && zC) {
                if (defpackage.dtf.e(this.e) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    this.e.onAbsorb(-xVelocity);
                } else if (defpackage.dtf.e(this.d) != com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                    this.d.onAbsorb(xVelocity);
                }
            }
            zB = zC;
            if (zB) {
                postInvalidateOnAnimation();
            }
        }
        return true;
    }

    final void p(android.content.Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.o = new android.widget.Scroller(context, i);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.B = viewConfiguration.getScaledPagingTouchSlop();
        this.J = (int) (400.0f * f);
        this.K = viewConfiguration.getScaledMaximumFlingVelocity();
        this.d = new android.widget.EdgeEffect(context);
        this.e = new android.widget.EdgeEffect(context);
        this.L = (int) (25.0f * f);
        this.M = (int) (f + f);
        this.z = (int) (f * 16.0f);
        defpackage.ebt.n(this, new defpackage.fik(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        defpackage.ebl.e(this, new defpackage.fig(this));
    }

    public final void q(int i2) {
        this.v = false;
        j(i2, true, false, 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    protected final void r(int i2, float f) {
        int iMax;
        int width;
        int left;
        if (this.P > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                defpackage.fij fijVar = (defpackage.fij) childAt.getLayoutParams();
                if (fijVar.a) {
                    int i4 = fijVar.b & 7;
                    if (i4 != 1) {
                        if (i4 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i4 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = java.lang.Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i5 = iMax;
                    width = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        java.util.List list = this.f;
        if (list != null) {
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                defpackage.fil filVar = (defpackage.fil) this.f.get(i6);
                if (filVar != null) {
                    filVar.c(i2, f);
                }
            }
        }
        this.O = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(android.view.View view) {
        if (this.t) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new defpackage.fij();
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager.widget.ViewPager.SavedState> CREATOR = new defpackage.mk(7);
        int a;
        android.os.Parcelable b;
        java.lang.ClassLoader e;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }

        public final java.lang.String toString() {
            return "FragmentPager.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new java.util.ArrayList();
        this.l = new defpackage.fii();
        this.m = new android.graphics.Rect();
        this.n = -1;
        this.r = -3.4028235E38f;
        this.s = Float.MAX_VALUE;
        this.w = 1;
        this.C = true;
        this.H = -1;
        this.N = true;
        this.Q = new defpackage.eaw(this, 15, null);
        this.R = 0;
        p(context);
    }
}
