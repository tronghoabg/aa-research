package com.google.android.material.bottomsheet;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends defpackage.dsn<V> implements wrx {
    int A;
    public int B;
    public java.lang.ref.WeakReference C;
    final java.util.List D;
    public final java.util.ArrayList E;
    defpackage.wsc F;
    public int G;
    public java.lang.ref.WeakReference H;
    public boolean I;
    final android.util.SparseIntArray J;
    final android.util.SparseIntArray K;
    final android.util.SparseIntArray L;
    private int M;
    private float N;
    private boolean O;
    private int P;
    private int Q;
    private android.content.res.ColorStateList R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private defpackage.wvi W;
    private boolean X;
    private final defpackage.wmx Y;
    private android.animation.ValueAnimator Z;
    public boolean a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private boolean af;
    private final float ag;
    private int ah;
    private android.view.VelocityTracker ai;
    private int aj;
    private java.util.Map ak;
    private final android.graphics.Rect al;
    private final defpackage.eet am;
    public int b;
    public boolean c;
    public int d;
    public defpackage.wvd e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    int p;
    public int q;
    public int r;
    float s;
    public int t;
    float u;
    public boolean v;
    public boolean w;
    public boolean x;
    public int y;
    public defpackage.eeu z;

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = 0;
        this.a = true;
        this.f = -1;
        this.S = -1;
        this.Y = new defpackage.wmx(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.aa = true;
        this.ac = true;
        this.y = 4;
        this.ag = 0.1f;
        this.D = new java.util.ArrayList();
        this.E = new java.util.ArrayList();
        this.aj = -1;
        this.J = new android.util.SparseIntArray();
        this.K = new android.util.SparseIntArray();
        this.L = new android.util.SparseIntArray();
        this.al = new android.graphics.Rect();
        this.am = new defpackage.wmt(this);
        this.Q = context.getResources().getDimensionPixelSize(2131167916);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.wne.a);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.R = defpackage.sqs.bi(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.W = new defpackage.wvi(defpackage.wvi.l(context, attributeSet, 2130968751, 2132150661));
        }
        if (this.W != null) {
            defpackage.wvd wvdVar = new defpackage.wvd(this.W);
            this.e = wvdVar;
            wvdVar.K(context);
            android.content.res.ColorStateList colorStateList = this.R;
            if (colorStateList != null) {
                this.e.O(colorStateList);
            } else {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.e.setTint(typedValue.data);
            }
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(T(), 1.0f);
        this.Z = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.Z.addUpdateListener(new wmr(this, 0));
        this.u = typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || typedValuePeekValue.data != -1) {
            R(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            R(typedValuePeekValue.data);
        }
        I(typedArrayObtainStyledAttributes.getBoolean(10, false));
        this.T = typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.a != z) {
            this.a = z;
            if (this.C != null) {
                X();
            }
            K((this.a && this.y == 6) ? 3 : this.y);
            ab(this.y, true);
            aa();
        }
        this.w = typedArrayObtainStyledAttributes.getBoolean(15, false);
        this.x = typedArrayObtainStyledAttributes.getBoolean(5, true);
        this.aa = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.M = typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.s = f;
        if (this.C != null) {
            Y();
        }
        android.util.TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            H(typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0));
        } else {
            H(typedValuePeekValue2.data);
        }
        this.b = typedArrayObtainStyledAttributes.getInt(14, 500);
        this.c = typedArrayObtainStyledAttributes.getBoolean(11, false);
        this.ac = typedArrayObtainStyledAttributes.getBoolean(4, true);
        this.h = typedArrayObtainStyledAttributes.getBoolean(20, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(21, false);
        this.j = typedArrayObtainStyledAttributes.getBoolean(22, false);
        this.U = typedArrayObtainStyledAttributes.getBoolean(23, true);
        this.k = typedArrayObtainStyledAttributes.getBoolean(17, false);
        this.l = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.m = typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.V = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        this.N = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static com.google.android.material.bottomsheet.BottomSheetBehavior B(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof defpackage.dsq)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        defpackage.dsn dsnVar = ((defpackage.dsq) layoutParams).a;
        if (dsnVar instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) {
            return (com.google.android.material.bottomsheet.BottomSheetBehavior) dsnVar;
        }
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private final float T() {
        java.lang.ref.WeakReference weakReference;
        android.view.WindowInsets rootWindowInsets;
        if (this.e == null || (weakReference = this.C) == null || weakReference.get() == null || android.os.Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        android.view.View view = (android.view.View) this.C.get();
        if (!ae() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return java.lang.Math.max(ah(this.e.x(), a$.ExternalSyntheticApiModelOutline0.m(rootWindowInsets, 0)), ah(this.e.y(), a$.ExternalSyntheticApiModelOutline0.m(rootWindowInsets, 1)));
    }

    private final int U(android.view.View view, int i, int i2) {
        int iA;
        java.lang.String string = view.getResources().getString(i);
        defpackage.wmu wmuVar = new defpackage.wmu(this, i2);
        java.util.List listG = defpackage.ebt.g(view);
        int i3 = 0;
        while (true) {
            if (i3 >= listG.size()) {
                int i4 = -1;
                for (int i5 = 0; i5 < 32 && i4 == -1; i5++) {
                    i4 = defpackage.ebt.a[i5];
                    boolean z = true;
                    for (int i6 = 0; i6 < listG.size(); i6++) {
                        z &= ((defpackage.edm) listG.get(i6)).a() != i4;
                    }
                    if (true != z) {
                        i4 = -1;
                    }
                }
                iA = i4;
                break;
            }
            if (android.text.TextUtils.equals(string, ((defpackage.edm) listG.get(i3)).b())) {
                iA = ((defpackage.edm) listG.get(i3)).a();
                break;
            }
            i3++;
        }
        if (iA != -1) {
            defpackage.ebt.h(view, new defpackage.edm(null, iA, string, wmuVar, null));
        }
        return iA;
    }

    private final int V() {
        int iMin;
        int i;
        int i2;
        if (this.O) {
            iMin = java.lang.Math.min(java.lang.Math.max(this.P, this.B - ((this.A * 9) / 16)), this.ah);
            i = this.n;
        } else {
            if (!this.T && !this.h && (i2 = this.g) > 0) {
                return java.lang.Math.max(this.d, i2 + this.Q);
            }
            iMin = this.d;
            i = this.n;
        }
        return iMin + i;
    }

    private final int W(int i) {
        if (i == 3) {
            return y();
        }
        if (i != 4) {
            return i != 5 ? this.r : this.B;
        }
        return this.t;
    }

    private final void X() {
        int iV = V();
        boolean z = this.a;
        int i = this.B;
        if (z) {
            this.t = java.lang.Math.max(i - iV, this.q);
        } else {
            this.t = i - iV;
        }
    }

    private final void Y() {
        this.r = (int) (this.B * (1.0f - this.s));
    }

    private final void Z() {
        this.G = -1;
        this.aj = -1;
        this.H = null;
        android.view.VelocityTracker velocityTracker = this.ai;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.ai = null;
        }
    }

    private final void aa() {
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        defpackage.ebt.l(view, 1048576);
        defpackage.ebt.l(view, 524288);
        defpackage.ebt.l(view, 262144);
        android.util.SparseIntArray sparseIntArray = this.K;
        int i = sparseIntArray.get(0, -1);
        if (i != -1) {
            defpackage.ebt.l(view, i);
            sparseIntArray.delete(0);
        }
        android.util.SparseIntArray sparseIntArray2 = this.J;
        int i2 = sparseIntArray2.get(0, -1);
        if (i2 != -1) {
            defpackage.ebt.l(view, i2);
            sparseIntArray2.delete(0);
        }
        android.util.SparseIntArray sparseIntArray3 = this.L;
        int i3 = sparseIntArray3.get(0, -1);
        if (i3 != -1) {
            defpackage.ebt.l(view, i3);
            sparseIntArray3.delete(0);
        }
        if (!this.a && this.y != 6) {
            sparseIntArray2.put(0, U(view, 2132083228, 6));
        }
        if (this.v && this.y != 5) {
            defpackage.ebt.t(view, defpackage.edm.i, new defpackage.wmu(this, 5));
        }
        int i4 = this.y;
        if (i4 == 3) {
            if (P()) {
                sparseIntArray3.put(0, U(view, 2132083224, 4));
            }
        } else if (i4 == 4) {
            sparseIntArray.put(0, U(view, 2132083226, 3));
        } else {
            if (i4 != 6) {
                return;
            }
            if (P()) {
                sparseIntArray3.put(0, U(view, 2132083224, 4));
            }
            sparseIntArray.put(0, U(view, 2132083226, 3));
        }
    }

    private final void ab(int i, boolean z) {
        android.animation.ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        boolean z2 = this.y == 3 && (this.V || ae());
        if (this.X == z2 || this.e == null) {
            return;
        }
        this.X = z2;
        if (!z || (valueAnimator = this.Z) == null) {
            android.animation.ValueAnimator valueAnimator2 = this.Z;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.Z.cancel();
            }
            this.e.P(this.X ? T() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.Z.reverse();
        } else {
            this.Z.setFloatValues(this.e.p.k, z2 ? T() : 1.0f);
            this.Z.start();
        }
    }

    private final void ac(boolean z) {
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null) {
            return;
        }
        android.view.ViewParent parent = ((android.view.View) weakReference.get()).getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                if (this.ak != null) {
                    return;
                } else {
                    this.ak = new java.util.HashMap(childCount);
                }
            }
            for (int i = 0; i < childCount; i++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i);
                if (childAt != this.C.get() && z) {
                    this.ak.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                }
            }
            if (z) {
                return;
            }
            this.ak = null;
        }
    }

    private final boolean ad() {
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            if (((java.lang.ref.WeakReference) it.next()).get() != null) {
                return true;
            }
        }
        return false;
    }

    private final boolean ae() {
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((android.view.View) this.C.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean af(android.view.View view) {
        java.util.Iterator it = this.D.iterator();
        while (it.hasNext()) {
            if (((java.lang.ref.WeakReference) it.next()).get() == view) {
                return true;
            }
        }
        return false;
    }

    private final boolean ag() {
        if (this.z != null) {
            return this.x || this.y == 1;
        }
        return false;
    }

    private static final float ah(float f, android.view.RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float fM = a$.ExternalSyntheticApiModelOutline0.m(roundedCorner);
            if (fM > 0.0f && f > 0.0f) {
                return fM / f;
            }
        }
        return 0.0f;
    }

    private static final int ai(int i, int i2, int i3, int i4) {
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = android.view.View.MeasureSpec.getMode(childMeasureSpec);
        int size = android.view.View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = java.lang.Math.min(size, i3);
        }
        return android.view.View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    public final android.view.View A() {
        java.util.List list = this.D;
        if (list.isEmpty()) {
            return null;
        }
        return (android.view.View) ((java.lang.ref.WeakReference) list.get(0)).get();
    }

    public final void C(defpackage.wmv wmvVar) {
        java.util.ArrayList arrayList = this.E;
        if (arrayList.contains(wmvVar)) {
            return;
        }
        arrayList.add(wmvVar);
    }

    public final void D() {
        defpackage.wsc wscVar = this.F;
        if (wscVar == null) {
            return;
        }
        wscVar.f();
    }

    public final void E(int i) {
        android.view.View view = (android.view.View) this.C.get();
        if (view != null) {
            java.util.ArrayList arrayList = this.E;
            if (arrayList.isEmpty()) {
                return;
            }
            int i2 = this.t;
            if (i <= i2 && i2 != y()) {
                y();
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                ((defpackage.wmv) arrayList.get(i3)).b(view);
            }
        }
    }

    public final void F() {
        defpackage.wsc wscVar = this.F;
        if (wscVar == null) {
            return;
        }
        ny nyVarC = wscVar.c();
        if (nyVarC == null || android.os.Build.VERSION.SDK_INT < 34) {
            J(true == this.v ? 5 : 4);
            return;
        }
        boolean z = this.v;
        defpackage.wsc wscVar2 = this.F;
        if (!z) {
            android.animation.Animator animatorE = wscVar2.e();
            animatorE.setDuration(wlm.b(wscVar2.b, wscVar2.c, nyVarC.b));
            animatorE.start();
            J(4);
            return;
        }
        android.animation.Animator.AnimatorListener wmqVar = new wmq(this);
        android.view.View view = wscVar2.a;
        android.animation.ObjectAnimator objectAnimatorOfFloat = android.animation.ObjectAnimator.ofFloat(view, (android.util.Property<android.view.View, java.lang.Float>) android.view.View.TRANSLATION_Y, view.getHeight() * view.getScaleY());
        objectAnimatorOfFloat.setInterpolator(new epc());
        objectAnimatorOfFloat.setDuration(wlm.b(wscVar2.b, wscVar2.c, nyVarC.b));
        objectAnimatorOfFloat.addListener(new wsb(wscVar2));
        objectAnimatorOfFloat.addListener(wmqVar);
        objectAnimatorOfFloat.start();
    }

    final void G(android.view.View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view.isNestedScrollingEnabled()) {
            this.D.add(new java.lang.ref.WeakReference(view));
            return;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                G(viewGroup.getChildAt(i));
            }
        }
    }

    public final void H(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.p = i;
        ab(this.y, true);
    }

    public final void I(boolean z) {
        if (this.v != z) {
            this.v = z;
            if (!z && this.y == 5) {
                J(4);
            }
            aa();
        }
    }

    public final void J(int i) {
        if (!this.v && i == 5) {
            android.util.Log.w("BottomSheetBehavior", "Cannot set state: 5");
            return;
        }
        int i2 = (i == 6 && this.a && W(6) <= this.q) ? 3 : i;
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null || weakReference.get() == null) {
            K(i);
            return;
        }
        android.view.View view = (android.view.View) this.C.get();
        defpackage.adqy adqyVar = new defpackage.adqy(this, view, i2, 1);
        android.view.ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
            view.post(adqyVar);
        } else {
            adqyVar.run();
        }
    }

    public final void K(int i) {
        android.view.View view;
        if (this.y == i) {
            return;
        }
        this.y = i;
        int i2 = 4;
        if (i != 4 && i != 3 && i != 6 && this.v && i == 5) {
            i = 5;
        }
        java.lang.ref.WeakReference weakReference = this.C;
        if (weakReference == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        int i3 = 0;
        if (i == 3) {
            ac(true);
        } else {
            if (i == 6 || i == 5) {
                i2 = i;
            } else if (i == 4) {
            }
            ac(false);
            i = i2;
        }
        ab(i, true);
        while (true) {
            java.util.ArrayList arrayList = this.E;
            if (i3 >= arrayList.size()) {
                aa();
                return;
            } else {
                ((defpackage.wmv) arrayList.get(i3)).a(view, i);
                i3++;
            }
        }
    }

    public final void L(ny nyVar) {
        defpackage.wsc wscVar = this.F;
        if (wscVar == null) {
            return;
        }
        wscVar.e = nyVar;
    }

    public final void M(android.view.View view, int i, boolean z) {
        int iW = W(i);
        defpackage.eeu eeuVar = this.z;
        if (eeuVar == null || (!z ? eeuVar.j(view, view.getLeft(), iW) : eeuVar.h(view.getLeft(), iW))) {
            K(i);
            return;
        }
        K(2);
        ab(i, true);
        this.Y.a(i);
    }

    public final void N(ny nyVar) {
        defpackage.wsc wscVar = this.F;
        if (wscVar == null) {
            return;
        }
        wscVar.h(nyVar);
    }

    public final boolean O() {
        return this.v;
    }

    final boolean P() {
        return (this.w && this.v) ? false : true;
    }

    public final boolean Q(android.view.View view, float f) {
        if (this.w) {
            return true;
        }
        if (view.getTop() < this.t) {
            return false;
        }
        return java.lang.Math.abs((((float) view.getTop()) + (f * this.ag)) - ((float) this.t)) / ((float) V()) > 0.5f;
    }

    public final void R(int i) {
        boolean z = this.O;
        if (i == -1) {
            if (z) {
                return;
            } else {
                this.O = true;
            }
        } else {
            if (!z && this.d == i) {
                return;
            }
            this.O = false;
            this.d = java.lang.Math.max(0, i);
        }
        S();
    }

    public final void S() {
        android.view.View view;
        if (this.C != null) {
            X();
            if (this.y != 4 || (view = (android.view.View) this.C.get()) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // defpackage.dsn
    public final void a(defpackage.dsq dsqVar) {
        this.C = null;
        this.z = null;
        this.F = null;
    }

    @Override // defpackage.dsn
    public final void b() {
        this.C = null;
        this.z = null;
        this.F = null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0077  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x008e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    @Override // defpackage.dsn
    public final void c(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i) {
        int top;
        int top2;
        int i2;
        int i3;
        float yVelocity;
        int i4 = 3;
        if (view.getTop() == y()) {
            K(3);
            return;
        }
        if (af(view2) && this.af) {
            if (this.ae > 0) {
                if (!this.a && view.getTop() > this.r) {
                    i4 = 6;
                }
            } else if (this.v) {
                android.view.VelocityTracker velocityTracker = this.ai;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.N);
                    yVelocity = this.ai.getYVelocity(this.G);
                }
                if (Q(view, yVelocity)) {
                    i4 = 5;
                } else if (this.ae == 0) {
                    top2 = view.getTop();
                    if (this.a) {
                        i2 = this.r;
                        i3 = this.t;
                        if (top2 < i2) {
                            if (top2 >= java.lang.Math.abs(top2 - i3)) {
                            }
                        } else if (java.lang.Math.abs(top2 - i2) < java.lang.Math.abs(top2 - i3)) {
                            i4 = 4;
                        }
                        i4 = 6;
                    } else if (java.lang.Math.abs(top2 - this.q) >= java.lang.Math.abs(top2 - this.t)) {
                        i4 = 4;
                    }
                } else {
                    if (!this.a) {
                        top = view.getTop();
                        if (java.lang.Math.abs(top - this.r) < java.lang.Math.abs(top - this.t)) {
                            i4 = 6;
                        }
                    }
                    i4 = 4;
                }
            } else if (this.ae == 0) {
                top2 = view.getTop();
                if (this.a) {
                    i2 = this.r;
                    i3 = this.t;
                    if (top2 < i2) {
                        if (top2 >= java.lang.Math.abs(top2 - i3)) {
                        }
                    } else if (java.lang.Math.abs(top2 - i2) < java.lang.Math.abs(top2 - i3)) {
                        i4 = 4;
                    }
                    i4 = 6;
                } else if (java.lang.Math.abs(top2 - this.q) >= java.lang.Math.abs(top2 - this.t)) {
                    i4 = 4;
                }
            } else {
                if (!this.a) {
                    top = view.getTop();
                    if (java.lang.Math.abs(top - this.r) < java.lang.Math.abs(top - this.t)) {
                        i4 = 6;
                    }
                }
                i4 = 4;
            }
            M(view, i4, false);
            this.af = false;
        }
    }

    @Override // defpackage.dsn
    public final boolean d(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View viewA;
        int i;
        java.lang.ref.WeakReference weakReference;
        defpackage.eeu eeuVar;
        if (!view.isShown() || !this.x) {
            this.ad = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Z();
            actionMasked = 0;
        }
        android.view.VelocityTracker velocityTrackerObtain = this.ai;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.ai = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        android.view.View view2 = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.aj = (int) motionEvent.getY();
            int x2 = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            java.util.List list = this.D;
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    android.view.View view3 = (android.view.View) ((java.lang.ref.WeakReference) it.next()).get();
                    if (view3 != null && coordinatorLayout.k(view3, x2, y)) {
                        view2 = view3;
                        break;
                    }
                }
            }
            java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(view2);
            this.H = weakReference2;
            if (this.y != 2 && weakReference2.get() != null) {
                this.G = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.I = true;
            }
            this.ad = this.G == -1 && !coordinatorLayout.k(view, x, this.aj);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.I = false;
            this.H = null;
            this.G = -1;
            if (this.ad) {
                this.ad = false;
                return false;
            }
        }
        if (!this.ad && (eeuVar = this.z) != null && eeuVar.i(motionEvent)) {
            return true;
        }
        if (actionMasked == 2 && ad() && !this.ad && this.y != 1 && (!this.c ? (viewA = A()) == null || !coordinatorLayout.k(viewA, (int) motionEvent.getX(), (int) motionEvent.getY()) : (weakReference = this.H) == null || weakReference.get() == null) && this.z != null && (i = this.aj) != -1) {
            if (java.lang.Math.abs(i - motionEvent.getY()) > this.z.b) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dsn
    public final boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int i2 = 0;
        if (this.C == null) {
            this.P = coordinatorLayout.getResources().getDimensionPixelSize(2131165921);
            boolean z = (android.os.Build.VERSION.SDK_INT < 29 || this.T || this.O) ? false : true;
            if (this.h || this.i || this.j || this.k || this.l || this.m) {
                defpackage.wqn.i(view, new defpackage.wms(this, z));
            } else if (z) {
                z = true;
                defpackage.wqn.i(view, new defpackage.wms(this, z));
            }
            defpackage.wnd wndVar = new defpackage.wnd(view);
            int[] iArr = defpackage.ebt.a;
            defpackage.kwv.G(view, wndVar);
            this.C = new java.lang.ref.WeakReference(view);
            this.F = new defpackage.wsc(view);
            defpackage.wvd wvdVar = this.e;
            if (wvdVar != null) {
                view.setBackground(wvdVar);
                defpackage.wvd wvdVar2 = this.e;
                float elevation = this.u;
                if (elevation == -1.0f) {
                    elevation = view.getElevation();
                }
                wvdVar2.N(elevation);
            } else {
                android.content.res.ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    view.setBackgroundTintList(colorStateList);
                }
            }
            aa();
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        if (this.z == null) {
            this.z = defpackage.eeu.b(coordinatorLayout, this.am);
        }
        int top = view.getTop();
        coordinatorLayout.j(view, i);
        this.A = coordinatorLayout.getWidth();
        this.B = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.ah = height;
        int i3 = this.B;
        int i4 = i3 - height;
        int i5 = this.o;
        if (i4 < i5) {
            boolean z2 = this.U;
            int i6 = this.S;
            if (z2) {
                height = i6 == -1 ? i3 : java.lang.Math.min(i3, i6);
                this.ah = height;
            } else {
                int i7 = i3 - i5;
                height = i6 != -1 ? java.lang.Math.min(i7, i6) : i7;
                this.ah = height;
            }
        }
        this.q = java.lang.Math.max(0, this.B - height);
        Y();
        X();
        int i8 = this.y;
        if (i8 == 3) {
            int iY = y();
            int[] iArr2 = defpackage.ebt.a;
            view.offsetTopAndBottom(iY);
        } else if (i8 == 6) {
            int i9 = this.r;
            int[] iArr3 = defpackage.ebt.a;
            view.offsetTopAndBottom(i9);
        } else if (this.v && i8 == 5) {
            int i10 = this.B;
            int[] iArr4 = defpackage.ebt.a;
            view.offsetTopAndBottom(i10);
        } else if (i8 == 4) {
            int i11 = this.t;
            int[] iArr5 = defpackage.ebt.a;
            view.offsetTopAndBottom(i11);
        } else if (i8 == 1 || i8 == 2) {
            int top2 = top - view.getTop();
            int[] iArr6 = defpackage.ebt.a;
            view.offsetTopAndBottom(top2);
        }
        ab(this.y, false);
        java.util.List list = this.D;
        list.clear();
        if (this.c) {
            G(view);
        } else {
            list.add(new java.lang.ref.WeakReference(z(view)));
        }
        while (true) {
            java.util.ArrayList arrayList = this.E;
            if (i2 >= arrayList.size()) {
                return true;
            }
            ((defpackage.wmv) arrayList.get(i2)).c(view);
            i2++;
        }
    }

    @Override // defpackage.dsn
    public final boolean f(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.graphics.Rect rect, boolean z) {
        if (!this.ac || view.isInTouchMode()) {
            return false;
        }
        int i = this.y;
        if (i != 4 && i != 6) {
            return false;
        }
        android.graphics.Rect rect2 = this.al;
        if (view.getLocalVisibleRect(rect2)) {
            int[] iArr = defpackage.ebt.a;
            defpackage.edf edfVarA = defpackage.ebm.a(view);
            if (edfVarA != null) {
                rect2.bottom -= edfVarA.f(519).e;
            }
            if (rect.top >= rect2.top && rect.bottom <= rect2.bottom) {
                return false;
            }
        }
        J(3);
        return true;
    }

    @Override // defpackage.dsn
    public final boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.y == 1 && actionMasked == 0) {
            return true;
        }
        if (ag()) {
            this.z.e(motionEvent);
        }
        if (actionMasked == 0) {
            Z();
        }
        android.view.VelocityTracker velocityTrackerObtain = this.ai;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.ai = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (ag() && actionMasked == 2 && !this.ad) {
            float fAbs = java.lang.Math.abs(this.aj - motionEvent.getY());
            defpackage.eeu eeuVar = this.z;
            if (fAbs > eeuVar.b) {
                eeuVar.d(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.ad;
    }

    @Override // defpackage.dsn
    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ai(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f, marginLayoutParams.width), ai(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, this.S, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.dsn
    public final boolean k(android.view.View view) {
        return ad() && af(view) && this.y != 3 && !this.ab;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (r5 == false) goto L32;
     */
    @Override // defpackage.dsn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int[] r7, int r8) {
        /*
            r2 = this;
            r3 = 1
            if (r8 != r3) goto L5
            goto L97
        L5:
            boolean r8 = r2.af(r5)
            if (r8 == 0) goto L97
            int r8 = r4.getTop()
            int r0 = r8 - r6
            if (r6 <= 0) goto L4a
            boolean r1 = r2.af
            if (r1 != 0) goto L22
            boolean r1 = r2.aa
            if (r1 != 0) goto L22
            boolean r5 = r5.canScrollVertically(r3)
            if (r5 == 0) goto L22
            goto L5c
        L22:
            int r5 = r2.y()
            if (r0 >= r5) goto L3a
            int r5 = r2.y()
            int r8 = r8 - r5
            r7[r3] = r8
            int[] r5 = defpackage.ebt.a
            int r5 = -r8
            r4.offsetTopAndBottom(r5)
            r5 = 3
            r2.K(r5)
            goto L89
        L3a:
            boolean r5 = r2.x
            if (r5 == 0) goto L97
            r7[r3] = r6
            int r5 = -r6
            int[] r7 = defpackage.ebt.a
            r4.offsetTopAndBottom(r5)
            r2.K(r3)
            goto L89
        L4a:
            if (r6 >= 0) goto L89
            r1 = -1
            boolean r5 = r5.canScrollVertically(r1)
            boolean r1 = r2.af
            if (r1 != 0) goto L5f
            boolean r1 = r2.aa
            if (r1 != 0) goto L5f
            if (r5 != 0) goto L5c
            goto L61
        L5c:
            r2.ab = r3
            return
        L5f:
            if (r5 != 0) goto L89
        L61:
            int r5 = r2.t
            if (r0 <= r5) goto L7a
            boolean r0 = r2.O()
            if (r0 == 0) goto L6c
            goto L7a
        L6c:
            int r8 = r8 - r5
            r7[r3] = r8
            int[] r5 = defpackage.ebt.a
            int r5 = -r8
            r4.offsetTopAndBottom(r5)
            r5 = 4
            r2.K(r5)
            goto L89
        L7a:
            boolean r5 = r2.x
            if (r5 == 0) goto L97
            r7[r3] = r6
            int r5 = -r6
            int[] r7 = defpackage.ebt.a
            r4.offsetTopAndBottom(r5)
            r2.K(r3)
        L89:
            int r4 = r4.getTop()
            r2.E(r4)
            r2.ae = r6
            r2.af = r3
            r3 = 0
            r2.ab = r3
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.m(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int[], int):void");
    }

    @Override // defpackage.dsn
    public final void o(android.view.View view, android.os.Parcelable parcelable) {
        com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) parcelable;
        int i = this.M;
        int i2 = 4;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.d = savedState.b;
            }
            if (i == -1 || (i & 2) == 2) {
                this.a = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.v = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.w = savedState.g;
            }
        }
        int i3 = savedState.a;
        if (i3 != 1 && i3 != 2) {
            i2 = i3;
        }
        this.y = i2;
    }

    @Override // defpackage.dsn
    public final android.os.Parcelable p(android.view.View view) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(android.view.View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.dsn
    public final boolean q(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i, int i2) {
        this.ae = 0;
        this.af = false;
        return (i & 2) != 0;
    }

    public final int y() {
        if (this.a) {
            return this.q;
        }
        return java.lang.Math.max(this.p, this.U ? 0 : this.o);
    }

    final android.view.View z(android.view.View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view.isNestedScrollingEnabled()) {
            return view;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                android.view.View viewZ = z(viewGroup.getChildAt(i));
                if (viewZ != null) {
                    return viewZ;
                }
            }
        }
        return null;
    }

    public BottomSheetBehavior() {
        this.M = 0;
        this.a = true;
        this.f = -1;
        this.S = -1;
        this.Y = new defpackage.wmx(this);
        this.s = 0.5f;
        this.u = -1.0f;
        this.x = true;
        this.aa = true;
        this.ac = true;
        this.y = 4;
        this.ag = 0.1f;
        this.D = new java.util.ArrayList();
        this.E = new java.util.ArrayList();
        this.aj = -1;
        this.J = new android.util.SparseIntArray();
        this.K = new android.util.SparseIntArray();
        this.L = new android.util.SparseIntArray();
        this.al = new android.graphics.Rect();
        this.am = new defpackage.wmt(this);
    }

    @Override // defpackage.dsn
    public final void n(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int[] iArr) {
    }
}
