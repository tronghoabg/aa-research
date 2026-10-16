package androidx.drawerlayout.widget;

/* JADX INFO: loaded from: classes2.dex */
public class DrawerLayout extends android.view.ViewGroup {
    public static final /* synthetic */ int j = 0;
    private static final boolean l;
    private int A;
    private float B;
    private float C;
    private final java.util.ArrayList D;
    private android.graphics.Rect E;
    private android.graphics.Matrix F;
    private final defpackage.edy G;
    public final defpackage.eeu b;
    public final defpackage.eeu c;
    public int d;
    public boolean e;
    public java.util.List f;
    public android.graphics.drawable.Drawable g;
    public defpackage.edf h;
    public boolean i;
    private float m;
    private final int n;
    private int o;
    private float p;
    private final android.graphics.Paint q;
    private final defpackage.emb r;
    private final defpackage.emb s;
    private boolean t;
    private boolean u;
    private android.window.OnBackInvokedCallback v;
    private android.window.OnBackInvokedDispatcher w;
    private int x;
    private int y;
    private int z;
    private static final int[] k = {android.R.attr.colorPrimaryDark};
    public static final int[] a = {android.R.attr.layout_gravity};

    static {
        l = android.os.Build.VERSION.SDK_INT >= 29;
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new defpackage.ely();
        this.o = -1728053248;
        this.q = new android.graphics.Paint();
        int i2 = 1;
        this.u = true;
        this.x = 3;
        this.y = 3;
        this.z = 3;
        this.A = 3;
        this.G = new defpackage.edy() { // from class: elw
            @Override // defpackage.edy
            public final boolean a(android.view.View view) {
                if (!androidx.drawerlayout.widget.DrawerLayout.w(view)) {
                    return false;
                }
                androidx.drawerlayout.widget.DrawerLayout drawerLayout = this.a;
                if (drawerLayout.a(view) == 2) {
                    return false;
                }
                drawerLayout.q(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.n = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        defpackage.emb embVar = new defpackage.emb(this, 3);
        this.r = embVar;
        defpackage.emb embVar2 = new defpackage.emb(this, 5);
        this.s = embVar2;
        defpackage.eeu eeuVarM = defpackage.eeu.m(this, embVar);
        this.b = eeuVarM;
        eeuVarM.j = 1;
        eeuVarM.g = f2;
        embVar.b = eeuVarM;
        defpackage.eeu eeuVarM2 = defpackage.eeu.m(this, embVar2);
        this.c = eeuVarM2;
        eeuVarM2.j = 2;
        eeuVarM2.g = f2;
        embVar2.b = eeuVarM2;
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        defpackage.ebt.n(this, new defpackage.elx(this));
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            defpackage.ebl.e(this, new defpackage.juj(i2));
            setSystemUiVisibility(1280);
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(k);
            try {
                this.g = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, defpackage.elv.a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.m = typedArrayObtainStyledAttributes2.getDimension(0, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
            } else {
                this.m = getResources().getDimension(com.google.android.projection.gearhead.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.D = new java.util.ArrayList();
        } catch (java.lang.Throwable th2) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th2;
        }
    }

    public static java.lang.String f(int i) {
        if ((i & 3) == 3) {
            return "LEFT";
        }
        return (i & 5) == 5 ? "RIGHT" : java.lang.Integer.toHexString(i);
    }

    static final boolean r(android.view.View view) {
        return ((defpackage.ema) view.getLayoutParams()).a == 0;
    }

    public static final boolean t(android.view.View view) {
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(((defpackage.ema) view.getLayoutParams()).a, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static final boolean w(android.view.View view) {
        if (t(view)) {
            return (((defpackage.ema) view.getLayoutParams()).d & 1) == 1;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bl(view, "View ", " is not a drawer"));
    }

    public static final boolean x(android.view.View view) {
        if (t(view)) {
            return ((defpackage.ema) view.getLayoutParams()).b > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bl(view, "View ", " is not a drawer"));
    }

    public final int a(android.view.View view) {
        if (!t(view)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(view, "View ", " is not a drawer"));
        }
        int i = ((defpackage.ema) view.getLayoutParams()).a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.x;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.z : this.A;
            if (i3 != 3) {
                return i3;
            }
        } else if (i == 5) {
            int i4 = this.y;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.A : this.z;
            if (i5 != 3) {
                return i5;
            }
        } else if (i == 8388611) {
            int i6 = this.z;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.x : this.y;
            if (i7 != 3) {
                return i7;
            }
        } else {
            if (i != 8388613) {
                return 0;
            }
            int i8 = this.A;
            if (i8 != 3) {
                return i8;
            }
            int i9 = layoutDirection == 0 ? this.y : this.x;
            if (i9 != 3) {
                return i9;
            }
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            android.view.View childAt = getChildAt(i3);
            if (!t(childAt)) {
                this.D.add(childAt);
            } else if (w(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
        }
        if (!z) {
            java.util.ArrayList arrayList2 = this.D;
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                android.view.View view = (android.view.View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.D.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (d() != null || t(view)) {
            view.setImportantForAccessibility(4);
        } else {
            view.setImportantForAccessibility(1);
        }
    }

    public final int b(android.view.View view) {
        return android.view.Gravity.getAbsoluteGravity(((defpackage.ema) view.getLayoutParams()).a, getLayoutDirection());
    }

    public final android.view.View c(int i) {
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = getChildAt(i2);
            if ((b(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.ema) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            fMax = java.lang.Math.max(fMax, ((defpackage.ema) getChildAt(i).getLayoutParams()).b);
        }
        this.p = fMax;
        defpackage.eeu eeuVar = this.b;
        defpackage.eeu eeuVar2 = this.c;
        boolean zL = eeuVar.l();
        boolean zL2 = eeuVar2.l();
        if (zL || zL2) {
            postInvalidateOnAnimation();
        }
    }

    final android.view.View d() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if ((((defpackage.ema) childAt.getLayoutParams()).d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.p <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return false;
            }
            android.view.View childAt = getChildAt(childCount);
            android.graphics.Rect rect = this.E;
            if (rect == null) {
                rect = new android.graphics.Rect();
                this.E = rect;
            }
            childAt.getHitRect(rect);
            if (this.E.contains((int) x, (int) y) && !r(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    int scrollX2 = getScrollX() - childAt.getLeft();
                    int scrollY2 = getScrollY() - childAt.getTop();
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    android.graphics.Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        android.graphics.Matrix matrix2 = this.F;
                        if (matrix2 == null) {
                            matrix2 = new android.graphics.Matrix();
                            this.F = matrix2;
                        }
                        matrix.invert(matrix2);
                        motionEventObtain.transform(this.F);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j2) {
        android.graphics.drawable.Drawable background;
        int height = getHeight();
        boolean zR = r(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zR) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                android.view.View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && t(childAt) && childAt.getHeight() >= height) {
                    if (o(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        float f = this.p;
        if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && zR) {
            int i4 = this.o;
            android.graphics.Paint paint = this.q;
            paint.setColor((((int) ((i4 >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final android.view.View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (t(childAt) && x(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final void g(boolean z) {
        int childCount = getChildCount();
        boolean zJ = false;
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            defpackage.ema emaVar = (defpackage.ema) childAt.getLayoutParams();
            if (t(childAt) && (!z || emaVar.c)) {
                zJ |= o(childAt, 3) ? this.b.j(childAt, -childAt.getWidth(), childAt.getTop()) : this.c.j(childAt, getWidth(), childAt.getTop());
                emaVar.c = false;
            }
        }
        this.r.n();
        this.s.n();
        if (zJ) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new defpackage.ema();
    }

    @Override // android.view.ViewGroup
    protected final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof defpackage.ema) {
            return new defpackage.ema((defpackage.ema) layoutParams);
        }
        return layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? new defpackage.ema((android.view.ViewGroup.MarginLayoutParams) layoutParams) : new defpackage.ema(layoutParams);
    }

    public final void h(int i) {
        i(i, 3);
        i(i, 5);
    }

    public final void i(int i, int i2) {
        android.view.View viewC;
        int absoluteGravity = android.view.Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.x = i;
        } else if (i2 == 5) {
            this.y = i;
        } else if (i2 == 8388611) {
            this.z = i;
        } else if (i2 == 8388613) {
            this.A = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.b : this.c).c();
        }
        if (i != 1) {
            if (i == 2 && (viewC = c(absoluteGravity)) != null) {
                v(viewC);
                return;
            }
            return;
        }
        android.view.View viewC2 = c(absoluteGravity);
        if (viewC2 != null) {
            q(viewC2);
        }
    }

    public final void j(android.view.View view, float f) {
        defpackage.ema emaVar = (defpackage.ema) view.getLayoutParams();
        if (f == emaVar.b) {
            return;
        }
        emaVar.b = f;
        java.util.List list = this.f;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.elz) this.f.get(size)).d(f);
            }
        }
    }

    public void k(int i) {
        this.o = i;
        invalidate();
    }

    public final void l() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            android.view.View viewE = e();
            android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (viewE == null || onBackInvokedDispatcherFindOnBackInvokedDispatcher == null || a(viewE) != 0 || !isAttachedToWindow()) {
                android.window.OnBackInvokedDispatcher onBackInvokedDispatcher = this.w;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.v);
                    this.w = null;
                    return;
                }
                return;
            }
            if (this.w == null) {
                if (this.v == null) {
                    this.v = new defpackage.nh(new defpackage.eaw(this, 5), 3);
                }
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.v);
                this.w = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            }
        }
    }

    public final void m(android.view.View view) {
        defpackage.edm edmVar = defpackage.edm.i;
        defpackage.ebt.l(view, edmVar.a());
        if (!w(view) || a(view) == 2) {
            return;
        }
        defpackage.ebt.t(view, edmVar, this.G);
    }

    public final void n(android.view.View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = getChildAt(i);
            if (z ? childAt != view : t(childAt)) {
                childAt.setImportantForAccessibility(4);
            } else {
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final boolean o(android.view.View view, int i) {
        return (b(view) & i) == i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.u = true;
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.u = true;
        this.r.n();
        this.s.n();
        l();
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        if (!this.i || this.g == null) {
            return;
        }
        defpackage.edf edfVar = this.h;
        int iD = edfVar != null ? edfVar.d() : 0;
        if (iD > 0) {
            this.g.setBounds(0, 0, getWidth(), iD);
            this.g.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View viewA;
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        defpackage.eeu eeuVar = this.c;
        defpackage.eeu eeuVar2 = this.b;
        int actionMasked = motionEvent.getActionMasked();
        boolean zI = eeuVar.i(motionEvent) | eeuVar2.i(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                g(true);
                this.e = false;
            } else if (actionMasked == 2) {
                float[] fArr4 = eeuVar2.c;
                if (fArr4 != null) {
                    for (int i = 0; i < fArr4.length; i++) {
                        if (eeuVar2.g(i)) {
                            float[] fArr5 = eeuVar2.c;
                            if (fArr5 != null && (fArr = eeuVar2.d) != null && (fArr2 = eeuVar2.e) != null && (fArr3 = eeuVar2.f) != null) {
                                float f = fArr2[i] - fArr5[i];
                                float f2 = fArr3[i] - fArr[i];
                                int i2 = eeuVar2.b;
                                if ((f * f) + (f2 * f2) > i2 * i2) {
                                    this.r.n();
                                    this.s.n();
                                    break;
                                }
                            } else {
                                android.util.Log.w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                g(true);
                this.e = false;
            }
            z = false;
        } else {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.B = x;
            this.C = y;
            z = this.p > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && (viewA = eeuVar2.a((int) x, (int) y)) != null && r(viewA);
            this.e = false;
        }
        if (!zI && !z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (!((defpackage.ema) getChildAt(i3).getLayoutParams()).c) {
                }
            }
            if (!this.e) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (i == 4) {
            if (e() != null) {
                keyEvent.startTracking();
                return true;
            }
            i = 4;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, android.view.KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        android.view.View viewE = e();
        if (viewE != null && a(viewE) == 0) {
            g(false);
        }
        return viewE != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f;
        this.t = true;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            android.view.View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                defpackage.ema emaVar = (defpackage.ema) childAt.getLayoutParams();
                if (r(childAt)) {
                    childAt.layout(emaVar.leftMargin, emaVar.topMargin, emaVar.leftMargin + childAt.getMeasuredWidth(), emaVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    float f2 = measuredWidth;
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (o(childAt, 3)) {
                        i5 = (-measuredWidth) + ((int) (emaVar.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        int i7 = i3 - i;
                        int i8 = i7 - ((int) (emaVar.b * f2));
                        float f3 = (i7 - i8) / f2;
                        i5 = i8;
                        f = f3;
                    }
                    int i9 = measuredWidth + i5;
                    float f4 = emaVar.b;
                    int i10 = emaVar.a & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        if (i12 < emaVar.topMargin) {
                            i12 = emaVar.topMargin;
                        } else if (i12 + measuredHeight > i11 - emaVar.bottomMargin) {
                            i12 = (i11 - emaVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i5, i12, i9, measuredHeight + i12);
                    } else if (i10 != 80) {
                        childAt.layout(i5, emaVar.topMargin, i9, emaVar.topMargin + measuredHeight);
                    } else {
                        int i13 = i4 - i2;
                        childAt.layout(i5, (i13 - emaVar.bottomMargin) - childAt.getMeasuredHeight(), i9, i13 - emaVar.bottomMargin);
                    }
                    if (f != f4) {
                        j(childAt, f);
                    }
                    int i14 = emaVar.b > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i14) {
                        childAt.setVisibility(i14);
                    }
                }
            }
        }
        if (l) {
            int[] iArr = defpackage.ebt.a;
            defpackage.edf edfVarA = defpackage.ebm.a(this);
            if (edfVarA != null) {
                defpackage.eeu eeuVar = this.b;
                defpackage.dvl dvlVarE = edfVarA.b.E();
                eeuVar.h = java.lang.Math.max(eeuVar.i, dvlVarE.b);
                defpackage.eeu eeuVar2 = this.c;
                eeuVar2.h = java.lang.Math.max(eeuVar2.i, dvlVarE.d);
            }
        }
        this.t = false;
        this.u = false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:63:0x0193  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        boolean z;
        int mode = android.view.View.MeasureSpec.getMode(i);
        int mode2 = android.view.View.MeasureSpec.getMode(i2);
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            if (isInEditMode()) {
                throw new java.lang.IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        } else if (mode2 != 1073741824) {
            mode = 1073741824;
            if (isInEditMode()) {
                throw new java.lang.IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        if (this.h != null) {
            int[] iArr = defpackage.ebt.a;
            if (getFitsSystemWindows()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < childCount) {
            android.view.View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                defpackage.ema emaVar = (defpackage.ema) childAt.getLayoutParams();
                if (z) {
                    int absoluteGravity = android.view.Gravity.getAbsoluteGravity(emaVar.a, layoutDirection);
                    int[] iArr2 = defpackage.ebt.a;
                    boolean fitsSystemWindows = childAt.getFitsSystemWindows();
                    defpackage.edf edfVarP = this.h;
                    if (fitsSystemWindows) {
                        if (absoluteGravity == 3) {
                            edfVarP = edfVarP.p(edfVarP.b(), edfVarP.d(), i3, edfVarP.a());
                        } else if (absoluteGravity == 5) {
                            edfVarP = edfVarP.p(i3, edfVarP.d(), edfVarP.c(), edfVarP.a());
                        }
                        defpackage.ebt.d(childAt, edfVarP);
                    } else {
                        if (absoluteGravity == 3) {
                            edfVarP = edfVarP.p(edfVarP.b(), edfVarP.d(), i3, edfVarP.a());
                        } else if (absoluteGravity == 5) {
                            edfVarP = edfVarP.p(i3, edfVarP.d(), edfVarP.c(), edfVarP.a());
                        }
                        emaVar.leftMargin = edfVarP.b();
                        emaVar.topMargin = edfVarP.d();
                        emaVar.rightMargin = edfVarP.c();
                        emaVar.bottomMargin = edfVarP.a();
                    }
                }
                if (!r(childAt)) {
                    if (!t(childAt)) {
                        throw new java.lang.IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    int[] iArr3 = defpackage.ebt.a;
                    float elevation = childAt.getElevation();
                    float f = this.m;
                    if (elevation != f) {
                        childAt.setElevation(f);
                    }
                    int iB = b(childAt) & 7;
                    int i7 = iB == 3 ? 1 : i3;
                    if (i7 == 0) {
                        if (i7 == 0) {
                            if (i6 == 0) {
                                i6 = i3;
                            }
                        }
                        i5 |= i7;
                        childAt.measure(getChildMeasureSpec(i, this.n + emaVar.leftMargin + emaVar.rightMargin, emaVar.width), getChildMeasureSpec(i2, emaVar.topMargin + emaVar.bottomMargin, emaVar.height));
                        i6 |= i7 ^ 1;
                    } else if (i5 == 0) {
                        i5 = i3;
                        if (i7 == 0) {
                            if (i6 == 0) {
                                i6 = i3;
                            }
                        }
                        i5 |= i7;
                        childAt.measure(getChildMeasureSpec(i, this.n + emaVar.leftMargin + emaVar.rightMargin, emaVar.width), getChildMeasureSpec(i2, emaVar.topMargin + emaVar.bottomMargin, emaVar.height));
                        i6 |= i7 ^ 1;
                    }
                    throw new java.lang.IllegalStateException("Child drawer has absolute gravity " + f(iB) + " but this DrawerLayout already has a drawer view along that edge");
                }
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec((size - emaVar.leftMargin) - emaVar.rightMargin, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((size2 - emaVar.topMargin) - emaVar.bottomMargin, 1073741824));
            }
            i4++;
            i3 = 0;
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        android.view.View viewC;
        if (!(parcelable instanceof androidx.drawerlayout.widget.DrawerLayout.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = (androidx.drawerlayout.widget.DrawerLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        int i = savedState.a;
        if (i != 0 && (viewC = c(i)) != null) {
            v(viewC);
        }
        int i2 = savedState.b;
        if (i2 != 3) {
            i(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            i(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            i(i4, 8388611);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            i(i5, 8388613);
        }
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        androidx.drawerlayout.widget.DrawerLayout.SavedState savedState = new androidx.drawerlayout.widget.DrawerLayout.SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            defpackage.ema emaVar = (defpackage.ema) getChildAt(i).getLayoutParams();
            int i2 = emaVar.d;
            if (i2 == 1 || i2 == 2) {
                savedState.a = emaVar.a;
                break;
            }
        }
        savedState.b = this.x;
        savedState.e = this.y;
        savedState.f = this.z;
        savedState.g = this.A;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        android.view.View viewD;
        defpackage.eeu eeuVar = this.b;
        eeuVar.e(motionEvent);
        this.c.e(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.B = x;
            this.C = y;
            this.e = false;
        } else if (action == 1) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            android.view.View viewA = eeuVar.a((int) x2, (int) y2);
            if (viewA != null && r(viewA)) {
                float f = x2 - this.B;
                float f2 = y2 - this.C;
                int i = eeuVar.b;
                z = (f * f) + (f2 * f2) >= ((float) (i * i)) || (viewD = d()) == null || a(viewD) == 2;
            }
            g(z);
        } else if (action == 3) {
            g(true);
            this.e = false;
        }
        return true;
    }

    public final void p() {
        android.view.View viewC = c(8388611);
        if (viewC == null) {
            throw new java.lang.IllegalArgumentException("No drawer view found with gravity ".concat(java.lang.String.valueOf(f(8388611))));
        }
        q(viewC);
    }

    public final void q(android.view.View view) {
        if (!t(view)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(view, "View ", " is not a sliding drawer"));
        }
        defpackage.ema emaVar = (defpackage.ema) view.getLayoutParams();
        if (this.u) {
            emaVar.b = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            emaVar.d = 0;
        } else {
            emaVar.d |= 4;
            if (o(view, 3)) {
                this.b.j(view, -view.getWidth(), view.getTop());
            } else {
                this.c.j(view, getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            g(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t) {
            return;
        }
        super.requestLayout();
    }

    public final boolean s() {
        android.view.View viewC = c(8388611);
        if (viewC != null) {
            return w(viewC);
        }
        return false;
    }

    public final boolean u() {
        android.view.View viewC = c(8388611);
        if (viewC != null) {
            return x(viewC);
        }
        return false;
    }

    public final void v(android.view.View view) {
        if (!t(view)) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(view, "View ", " is not a sliding drawer"));
        }
        defpackage.ema emaVar = (defpackage.ema) view.getLayoutParams();
        if (this.u) {
            emaVar.b = 1.0f;
            emaVar.d = 1;
            n(view, true);
            m(view);
            l();
        } else {
            emaVar.d |= 2;
            if (o(view, 3)) {
                this.b.j(view, 0, view.getTop());
            } else {
                this.c.j(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new defpackage.ema(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.drawerlayout.widget.DrawerLayout.SavedState> CREATOR = new defpackage.mk(6);
        int a;
        int b;
        int e;
        int f;
        int g;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = 0;
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(android.os.Parcelable parcelable) {
            super(parcelable);
            this.a = 0;
        }
    }

    public DrawerLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(android.content.Context context) {
        this(context, null);
    }
}
