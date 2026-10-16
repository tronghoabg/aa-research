package androidx.swiperefreshlayout.widget;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeRefreshLayout extends android.view.ViewGroup implements defpackage.eao, defpackage.ean, defpackage.eal {
    private static final java.lang.String k = "SwipeRefreshLayout";
    private static final int[] l = {android.R.attr.enabled};
    private final android.view.animation.DecelerateInterpolator A;
    private int B;
    private android.view.animation.Animation C;
    private android.view.animation.Animation D;
    private android.view.animation.Animation E;
    private android.view.animation.Animation F;
    private int G;
    private android.view.animation.Animation.AnimationListener H;
    private final android.view.animation.Animation I;
    private final android.view.animation.Animation J;
    private final defpackage.euf K;
    public defpackage.fdc a;
    public boolean b;
    public int c;
    public defpackage.fct d;
    public int e;
    public int f;
    public int g;
    public defpackage.fcv h;
    public boolean i;
    public boolean j;
    private android.view.View m;
    private int n;
    private float o;
    private float p;
    private final defpackage.eam q;
    private final int[] r;
    private final int[] s;
    private final int[] t;
    private boolean u;
    private int v;
    private float w;
    private float x;
    private boolean y;
    private int z;

    public SwipeRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        this.o = -1.0f;
        this.r = new int[2];
        this.s = new int[2];
        this.t = new int[2];
        this.z = -1;
        this.B = -1;
        this.H = new defpackage.fcz(this, 1);
        this.I = new defpackage.fda(this);
        this.J = new defpackage.fdb(this);
        this.n = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.v = getResources().getInteger(android.R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.A = new android.view.animation.DecelerateInterpolator(2.0f);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.G = (int) (displayMetrics.density * 40.0f);
        this.d = new defpackage.fct(getContext());
        defpackage.fcv fcvVar = new defpackage.fcv(getContext());
        this.h = fcvVar;
        defpackage.fcu fcuVar = fcvVar.a;
        float f = fcvVar.b.getDisplayMetrics().density;
        fcuVar.d(2.5f * f);
        fcuVar.p = 7.5f * f;
        fcuVar.g();
        fcuVar.q = (int) (10.0f * f);
        fcuVar.r = (int) (f * 5.0f);
        fcvVar.invalidateSelf();
        this.d.setImageDrawable(this.h);
        this.d.setVisibility(8);
        addView(this.d);
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.g = i;
        this.o = i;
        this.K = new defpackage.euf(null);
        this.q = new defpackage.eam(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.G;
        this.c = i2;
        this.f = i2;
        a(1.0f);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private final android.view.animation.Animation m(int i, int i2) {
        defpackage.fcy fcyVar = new defpackage.fcy(this, i, i2);
        fcyVar.setDuration(300L);
        defpackage.fct fctVar = this.d;
        fctVar.a = null;
        fctVar.clearAnimation();
        this.d.startAnimation(fcyVar);
        return fcyVar;
    }

    private final void n() {
        if (this.m == null) {
            for (int i = 0; i < getChildCount(); i++) {
                android.view.View childAt = getChildAt(i);
                if (!childAt.equals(this.d)) {
                    this.m = childAt;
                    return;
                }
            }
        }
    }

    private final void o(float f) {
        if (f > this.o) {
            r(true, true);
            return;
        }
        this.b = false;
        this.h.d(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        defpackage.fcz fczVar = new defpackage.fcz(this, 0);
        this.e = this.c;
        android.view.animation.Animation animation = this.J;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.A);
        defpackage.fct fctVar = this.d;
        fctVar.a = fczVar;
        fctVar.clearAnimation();
        this.d.startAnimation(animation);
        this.h.b(false);
    }

    private final void p(float f) {
        this.h.b(true);
        float fMin = java.lang.Math.min(1.0f, java.lang.Math.abs(f / this.o));
        float fMax = (float) java.lang.Math.max(((double) fMin) - 0.4d, 0.0d);
        float fAbs = java.lang.Math.abs(f) - this.o;
        float f2 = this.g;
        double dMax = java.lang.Math.max(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Math.min(fAbs, f2 + f2) / f2) / 4.0f;
        float f3 = fMin * f2;
        float fPow = (float) (dMax - java.lang.Math.pow(dMax, 2.0d));
        float f4 = fPow + fPow;
        float f5 = f2 * f4;
        int i = this.f + ((int) (f3 + f5 + f5));
        if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
        }
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        float f6 = this.o;
        defpackage.fcv fcvVar = this.h;
        if (f < f6) {
            if (fcvVar.getAlpha() > 76 && !u(this.E)) {
                this.E = m(this.h.getAlpha(), 76);
            }
        } else if (fcvVar.getAlpha() < 255 && !u(this.F)) {
            this.F = m(this.h.getAlpha(), 255);
        }
        float f7 = (fMax * 5.0f) / 3.0f;
        this.h.d(java.lang.Math.min(0.8f, f7 * 0.8f));
        this.h.c(java.lang.Math.min(1.0f, f7));
        defpackage.fcv fcvVar2 = this.h;
        fcvVar2.a.g = (((f7 * 0.4f) - 0.25f) + f4 + f4) * 0.5f;
        fcvVar2.invalidateSelf();
        j(i - this.c);
    }

    private final void q(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.z) {
            this.z = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private final void r(boolean z, boolean z2) {
        if (this.b != z) {
            this.i = z2;
            n();
            this.b = z;
            if (!z) {
                k(this.H);
                return;
            }
            int i = this.c;
            android.view.animation.Animation.AnimationListener animationListener = this.H;
            this.e = i;
            android.view.animation.Animation animation = this.I;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.A);
            if (animationListener != null) {
                this.d.a = animationListener;
            }
            this.d.clearAnimation();
            this.d.startAnimation(animation);
        }
    }

    private final void s(float f) {
        float f2 = this.x;
        float f3 = f - f2;
        float f4 = this.n;
        if (f3 <= f4 || this.y) {
            return;
        }
        this.w = f2 + f4;
        this.y = true;
        this.h.setAlpha(76);
    }

    private static final boolean u(android.view.animation.Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    public final void a(float f) {
        int i = this.e;
        j((i + ((int) ((this.f - i) * f))) - this.d.getTop());
    }

    public final void b() {
        this.d.clearAnimation();
        this.h.stop();
        this.d.setVisibility(8);
        this.d.getBackground().setAlpha(255);
        this.h.setAlpha(255);
        j(this.f - this.c);
        this.c = this.d.getTop();
    }

    public final void c(float f) {
        this.d.setScaleX(f);
        this.d.setScaleY(f);
    }

    @Override // defpackage.ean
    public final void d(android.view.View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 285) {
            return super.dispatchKeyEvent(keyEvent);
        }
        i(true, true);
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.q.c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.q.d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.q.e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.q.f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // defpackage.ean
    public final void e(android.view.View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, i5, this.t);
    }

    @Override // defpackage.eao
    public final void f(android.view.View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        int i6;
        if (i5 != 0) {
            return;
        }
        int i7 = iArr[1];
        int[] iArr2 = this.s;
        this.q.f(i, i2, i3, i4, iArr2, 0, iArr);
        int i8 = i4 - (iArr[1] - i7);
        if (i8 == 0) {
            i8 = i4 + iArr2[1];
            i6 = 0;
        } else {
            i6 = i8;
        }
        if (i8 >= 0 || l()) {
            return;
        }
        float fAbs = this.p + java.lang.Math.abs(i8);
        this.p = fAbs;
        p(fAbs);
        iArr[1] = iArr[1] + i6;
    }

    @Override // defpackage.ean
    public final void g(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        int i3 = this.B;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.K.b();
    }

    @Override // defpackage.ean
    public final void h(android.view.View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.q.g(0);
    }

    public final void i(boolean z, boolean z2) {
        if (z) {
            if (!this.b) {
                this.b = true;
                j((this.g + this.f) - this.c);
                this.i = z2;
                android.view.animation.Animation.AnimationListener animationListener = this.H;
                this.d.setVisibility(0);
                this.h.setAlpha(255);
                defpackage.fcw fcwVar = new defpackage.fcw(this);
                this.C = fcwVar;
                fcwVar.setDuration(this.v);
                if (animationListener != null) {
                    this.d.a = animationListener;
                }
                this.d.clearAnimation();
                this.d.startAnimation(this.C);
                return;
            }
            z = true;
        }
        r(z, false);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.q.a;
    }

    public final void j(int i) {
        this.d.bringToFront();
        defpackage.fct fctVar = this.d;
        int[] iArr = defpackage.ebt.a;
        fctVar.offsetTopAndBottom(i);
        this.c = this.d.getTop();
    }

    public final void k(android.view.animation.Animation.AnimationListener animationListener) {
        defpackage.fcx fcxVar = new defpackage.fcx(this);
        this.D = fcxVar;
        fcxVar.setDuration(150L);
        defpackage.fct fctVar = this.d;
        fctVar.a = animationListener;
        fctVar.clearAnimation();
        this.d.startAnimation(this.D);
    }

    public final boolean l() {
        android.view.View view = this.m;
        return view instanceof android.widget.ListView ? ((android.widget.ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        n();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !l() && !this.b && !this.u) {
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    this.y = false;
                    this.z = -1;
                } else if (actionMasked == 2) {
                    int i = this.z;
                    if (i == -1) {
                        android.util.Log.e(k, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    if (iFindPointerIndex >= 0) {
                        s(motionEvent.getY(iFindPointerIndex));
                    }
                } else if (actionMasked == 3) {
                    this.y = false;
                    this.z = -1;
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
                return this.y;
            }
            j(this.f - this.d.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.z = pointerId;
            this.y = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 >= 0) {
                this.x = motionEvent.getY(iFindPointerIndex2);
                return this.y;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.m == null) {
            n();
        }
        android.view.View view = this.m;
        if (view != null) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.d.getMeasuredWidth();
            int measuredHeight2 = this.d.getMeasuredHeight();
            defpackage.fct fctVar = this.d;
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.c;
            int i8 = i5 + i6;
            fctVar.layout(i5 - i6, i7, i8, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.m == null) {
            n();
        }
        android.view.View view = this.m;
        if (view == null) {
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.d.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824));
        this.B = -1;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) == this.d) {
                this.B = i3;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(android.view.View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.p;
            float f2 = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
            if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                float f3 = i2;
                if (f3 > f) {
                    iArr[1] = (int) f;
                    this.p = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
                } else {
                    f2 = f - f3;
                    this.p = f2;
                    iArr[1] = i2;
                }
                p(f2);
            }
        }
        int[] iArr2 = this.r;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(android.view.View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0, this.t);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i) {
        this.K.c(i, 0);
        startNestedScroll(i & 2);
        this.p = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        this.u = true;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState savedState = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        i(savedState.a, false);
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        return new androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState(super.onSaveInstanceState(), this.b);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i) {
        return (!isEnabled() || this.b || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(android.view.View view) {
        this.K.d(0);
        this.u = false;
        float f = this.p;
        if (f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            o(f);
            this.p = com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED;
        } else {
            post(new defpackage.eaw(this, 14));
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || l() || this.b || this.u) {
            return false;
        }
        if (actionMasked == 0) {
            this.z = motionEvent.getPointerId(0);
            this.y = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.z);
                if (iFindPointerIndex < 0) {
                    android.util.Log.e(k, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.y) {
                    float y = (motionEvent.getY(iFindPointerIndex) - this.w) * 0.5f;
                    this.y = false;
                    o(y);
                }
                this.z = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.z);
                if (iFindPointerIndex2 < 0) {
                    android.util.Log.e(k, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                s(y2);
                if (this.y) {
                    float f = (y2 - this.w) * 0.5f;
                    if (f <= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    p(f);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        android.util.Log.e(k, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.z = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    q(motionEvent);
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        b();
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        this.q.a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.q.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.q.b(0);
    }

    @Override // defpackage.ean
    public final boolean t(android.view.View view, android.view.View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    public static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.swiperefreshlayout.widget.SwipeRefreshLayout.SavedState> CREATOR = new defpackage.eep(9);
        final boolean a;

        public SavedState(android.os.Parcel parcel) {
            super(parcel);
            this.a = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
        }

        public SavedState(android.os.Parcelable parcelable, boolean z) {
            super(parcelable);
            this.a = z;
        }
    }

    public SwipeRefreshLayout(android.content.Context context) {
        this(context, null);
    }
}
