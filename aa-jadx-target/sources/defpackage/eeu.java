package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eeu {
    public int a;
    public int b;
    public float[] c;
    public float[] d;
    public float[] e;
    public float[] f;
    public float g;
    public int h;
    public final int i;
    public int j;
    public android.view.View k;
    private int[] m;
    private int[] n;
    private int[] o;
    private int p;
    private android.view.VelocityTracker q;
    private final float r;
    private final android.widget.OverScroller s;
    private final defpackage.eet t;
    private boolean u;
    private final android.view.ViewGroup v;
    private int l = -1;
    private final java.lang.Runnable w = new eaw(this, 4, (byte[]) null);

    private eeu(android.content.Context context, android.view.ViewGroup viewGroup, defpackage.eet eetVar) {
        defpackage.a.ak(eetVar, "Callback may not be null");
        this.v = viewGroup;
        this.t = eetVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.i = i;
        this.h = i;
        this.b = viewConfiguration.getScaledTouchSlop();
        this.r = viewConfiguration.getScaledMaximumFlingVelocity();
        this.g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.s = new android.widget.OverScroller(context, new fif(1));
    }

    public static defpackage.eeu b(android.view.ViewGroup viewGroup, defpackage.eet eetVar) {
        return new defpackage.eeu(viewGroup.getContext(), viewGroup, eetVar);
    }

    public static defpackage.eeu m(android.view.ViewGroup viewGroup, defpackage.eet eetVar) {
        defpackage.eeu eeuVarB = b(viewGroup, eetVar);
        eeuVarB.b = eeuVarB.b;
        return eeuVarB;
    }

    private final int n(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        int i4 = width / 2;
        float fSin = (float) java.lang.Math.sin((java.lang.Math.min(1.0f, java.lang.Math.abs(i) / width) - 0.5f) * 0.47123894f);
        int iAbs2 = java.lang.Math.abs(i2);
        if (iAbs2 > 0) {
            float f = i4;
            iAbs = java.lang.Math.round(java.lang.Math.abs((f + (fSin * f)) / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((java.lang.Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return java.lang.Math.min(iAbs, 600);
    }

    private final void o(int i) {
        float[] fArr = this.c;
        if (fArr == null || !g(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.d[i] = 0.0f;
        this.e[i] = 0.0f;
        this.f[i] = 0.0f;
        this.m[i] = 0;
        this.n[i] = 0;
        this.o[i] = 0;
        this.p = (~(1 << i)) & this.p;
    }

    private final void p(float f, float f2) {
        this.u = true;
        this.t.e(this.k, f, f2);
        this.u = false;
        if (this.a == 1) {
            f(0);
        }
    }

    private final void q() {
        float f = this.r;
        this.q.computeCurrentVelocity(1000, f);
        p(y(this.q.getXVelocity(this.l), this.g, f), y(this.q.getYVelocity(this.l), this.g, f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eet] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void r(float f, float f2, int i) {
        int i2;
        boolean zU = u(f, f2, i, 1);
        ?? r0 = zU;
        if (u(f2, f, i, 4)) {
            r0 = (zU ? 1 : 0) | 4;
        }
        ?? r1 = r0;
        if (u(f, f2, i, 2)) {
            r1 = (r0 == true ? 1 : 0) | 2;
        }
        ?? r2 = r1;
        if (u(f2, f, i, 8)) {
            i2 = (r1 == true ? 1 : 0) | 8;
        }
        if (r2 == 0) {
            r2 = i2;
            return;
        }
        r2 = i2;
        int[] iArr = this.n;
        iArr[i] = (iArr[i] | r2) == true ? 1 : 0;
        this.t.b(r2, i);
    }

    private final void s(float f, float f2, int i) {
        float[] fArr = this.c;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.d;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.e;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.m;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.n;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.o;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.c = fArr2;
            this.d = fArr3;
            this.e = fArr4;
            this.f = fArr5;
            this.m = iArr;
            this.n = iArr2;
            this.o = iArr3;
            fArr = fArr2;
        }
        this.e[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.d;
        this.f[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.m;
        int i3 = (int) f;
        int i4 = (int) f2;
        android.view.ViewGroup viewGroup = this.v;
        int i5 = i3 < viewGroup.getLeft() + this.h ? 1 : 0;
        if (i4 < viewGroup.getTop() + this.h) {
            i5 |= 4;
        }
        if (i3 > viewGroup.getRight() - this.h) {
            i5 |= 2;
        }
        if (i4 > viewGroup.getBottom() - this.h) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.p |= 1 << i;
    }

    private final void t(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (x(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.e[pointerId] = x;
                this.f[pointerId] = y;
            }
        }
    }

    private final boolean u(float f, float f2, int i, int i2) {
        float fAbs = java.lang.Math.abs(f);
        float fAbs2 = java.lang.Math.abs(f2);
        if ((this.m[i] & i2) == i2 && (this.j & i2) != 0 && (this.o[i] & i2) != i2 && (this.n[i] & i2) != i2) {
            float f3 = this.b;
            if (fAbs > f3 || fAbs2 > f3) {
                if (fAbs < fAbs2 * 0.5f) {
                    this.t.j();
                }
                if ((this.n[i] & i2) == 0 && fAbs > this.b) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean v(android.view.View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        defpackage.eet eetVar = this.t;
        boolean z = eetVar.a(view) > 0;
        boolean z2 = eetVar.i() > 0;
        if (z && z2) {
            int i = this.b;
            return (f * f) + (f2 * f2) > ((float) (i * i));
        }
        if (z) {
            return java.lang.Math.abs(f) > ((float) this.b);
        }
        return z2 && java.lang.Math.abs(f2) > ((float) this.b);
    }

    private final boolean w(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int left = this.k.getLeft();
        int top = this.k.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.s.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        android.view.View view = this.k;
        int i8 = (int) this.g;
        int i9 = (int) this.r;
        int iZ = z(i3, i8, i9);
        int iZ2 = z(i4, (int) this.g, i9);
        int iAbs = java.lang.Math.abs(i7);
        int iAbs2 = java.lang.Math.abs(i6);
        int iAbs3 = java.lang.Math.abs(iZ);
        int iAbs4 = java.lang.Math.abs(iZ2);
        int i10 = iAbs3 + iAbs4;
        int i11 = iAbs + iAbs2;
        if (iZ != 0) {
            f = iAbs3 / i10;
        } else {
            f = iAbs / i11;
        }
        if (iZ2 != 0) {
            f2 = i10;
            f3 = iAbs4;
        } else {
            f2 = i11;
            f3 = iAbs2;
        }
        float f4 = f3 / f2;
        defpackage.eet eetVar = this.t;
        this.s.startScroll(left, top, i7, i6, (int) ((n(i7, iZ, eetVar.a(view)) * f) + (n(i6, iZ2, eetVar.i()) * f4)));
        f(2);
        return true;
    }

    private final boolean x(int i) {
        return g(i);
    }

    private static final float y(float f, float f2, float f3) {
        float fAbs = java.lang.Math.abs(f);
        if (fAbs < f2) {
            return 0.0f;
        }
        if (fAbs > f3) {
            return f > 0.0f ? f3 : -f3;
        }
        return f;
    }

    private static final int z(int i, int i2, int i3) {
        int iAbs = java.lang.Math.abs(i);
        if (iAbs < i2) {
            return 0;
        }
        if (iAbs > i3) {
            return i > 0 ? i3 : -i3;
        }
        return i;
    }

    public final android.view.View a(int i, int i2) {
        android.view.ViewGroup viewGroup = this.v;
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.l = -1;
        float[] fArr = this.c;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.d, 0.0f);
            java.util.Arrays.fill(this.e, 0.0f);
            java.util.Arrays.fill(this.f, 0.0f);
            java.util.Arrays.fill(this.m, 0);
            java.util.Arrays.fill(this.n, 0);
            java.util.Arrays.fill(this.o, 0);
            this.p = 0;
        }
        android.view.VelocityTracker velocityTracker = this.q;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.q = null;
        }
    }

    public final void d(android.view.View view, int i) {
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = this.v;
        if (parent != viewGroup) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bl(viewGroup, "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (", ")"));
        }
        this.k = view;
        this.l = i;
        this.t.c(view, i);
        f(1);
    }

    public final void e(android.view.MotionEvent motionEvent) {
        int iFindPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        int i = 0;
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        android.view.VelocityTracker velocityTrackerObtain = this.q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View viewA = a((int) x, (int) y);
            s(x, y, pointerId);
            k(viewA, pointerId);
            if ((this.m[pointerId] & this.j) != 0) {
                this.t.k();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.a == 1) {
                q();
            }
            c();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.a == 1) {
                    p(0.0f, 0.0f);
                }
                c();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (this.a == 1 && pointerId2 == this.l) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i < pointerCount) {
                        int pointerId3 = motionEvent.getPointerId(i);
                        if (pointerId3 != this.l) {
                            android.view.View viewA2 = a((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                            android.view.View view = this.k;
                            if (viewA2 == view && k(view, pointerId3)) {
                                if (this.l == -1) {
                                    break;
                                }
                            }
                        }
                        i++;
                    }
                    q();
                }
                o(pointerId2);
                return;
            }
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            float x2 = motionEvent.getX(actionIndex);
            int i2 = (int) x2;
            float y2 = motionEvent.getY(actionIndex);
            int i3 = (int) y2;
            s(x2, y2, pointerId4);
            if (this.a == 0) {
                k(a(i2, i3), pointerId4);
                if ((this.m[pointerId4] & this.j) != 0) {
                    this.t.k();
                    return;
                }
                return;
            }
            android.view.View view2 = this.k;
            if (view2 != null && i2 >= view2.getLeft() && i2 < view2.getRight() && i3 >= view2.getTop() && i3 < view2.getBottom()) {
                k(this.k, pointerId4);
                return;
            }
            return;
        }
        if (this.a == 1) {
            int i4 = this.l;
            if (!x(i4) || (iFindPointerIndex = motionEvent.findPointerIndex(i4)) == -1) {
                return;
            }
            float x3 = motionEvent.getX(iFindPointerIndex);
            float y3 = motionEvent.getY(iFindPointerIndex);
            float[] fArr = this.e;
            int i5 = this.l;
            float f = x3 - fArr[i5];
            float f2 = y3 - this.f[i5];
            int i6 = (int) f;
            int left = this.k.getLeft() + i6;
            int i7 = (int) f2;
            int top = this.k.getTop() + i7;
            int left2 = this.k.getLeft();
            int top2 = this.k.getTop();
            if (i6 != 0) {
                left = this.t.g(this.k, left);
                int[] iArr = defpackage.ebt.a;
                this.k.offsetLeftAndRight(left - left2);
            }
            if (i7 != 0) {
                top = this.t.h(this.k, top);
                int[] iArr2 = defpackage.ebt.a;
                this.k.offsetTopAndBottom(top - top2);
            }
            if (i6 != 0 || i7 != 0) {
                this.t.l(this.k, left, top);
            }
        } else {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i);
                if (x(pointerId5)) {
                    float x4 = motionEvent.getX(i);
                    float y4 = motionEvent.getY(i);
                    float f3 = x4 - this.c[pointerId5];
                    float f4 = y4 - this.d[pointerId5];
                    r(f3, f4, pointerId5);
                    if (this.a == 1) {
                        break;
                    }
                    android.view.View viewA3 = a((int) x4, (int) y4);
                    if (v(viewA3, f3, f4) && k(viewA3, pointerId5)) {
                        break;
                    }
                }
                i++;
            }
        }
        t(motionEvent);
    }

    public final void f(int i) {
        this.v.removeCallbacks(this.w);
        if (this.a != i) {
            this.a = i;
            this.t.d(i);
            if (this.a == 0) {
                this.k = null;
            }
        }
    }

    public final boolean g(int i) {
        return (this.p & (1 << i)) != 0;
    }

    public final boolean h(int i, int i2) {
        if (this.u) {
            return w(i, i2, (int) this.q.getXVelocity(this.l), (int) this.q.getYVelocity(this.l));
        }
        throw new java.lang.IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec  */
    public final boolean i(android.view.MotionEvent motionEvent) {
        android.view.View viewA;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
            actionMasked = 0;
        }
        android.view.VelocityTracker velocityTrackerObtain = this.q;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.q = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            s(x, y, pointerId);
            android.view.View viewA2 = a((int) x, (int) y);
            if (viewA2 == this.k && this.a == 2) {
                k(viewA2, pointerId);
            }
            if ((this.m[pointerId] & this.j) != 0) {
                this.t.k();
            }
        } else if (actionMasked == 1) {
            c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                c();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x2 = motionEvent.getX(actionIndex);
                float y2 = motionEvent.getY(actionIndex);
                s(x2, y2, pointerId2);
                int i = this.a;
                if (i == 0) {
                    if ((this.m[pointerId2] & this.j) != 0) {
                        this.t.k();
                    }
                } else if (i == 2 && (viewA = a((int) x2, (int) y2)) == this.k) {
                    k(viewA, pointerId2);
                }
            } else if (actionMasked == 6) {
                o(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.c != null && this.d != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i2 = 0; i2 < pointerCount; i2++) {
                int pointerId3 = motionEvent.getPointerId(i2);
                if (x(pointerId3)) {
                    float x3 = motionEvent.getX(i2);
                    float y3 = motionEvent.getY(i2);
                    float f = x3 - this.c[pointerId3];
                    float f2 = y3 - this.d[pointerId3];
                    android.view.View viewA3 = a((int) x3, (int) y3);
                    boolean zV = v(viewA3, f, f2);
                    if (!zV) {
                        r(f, f2, pointerId3);
                        if (this.a == 1) {
                            break;
                        }
                        break;
                        break;
                    }
                    int left = viewA3.getLeft();
                    defpackage.eet eetVar = this.t;
                    int iG = eetVar.g(viewA3, ((int) f) + left);
                    int top = viewA3.getTop();
                    int iH = eetVar.h(viewA3, ((int) f2) + top);
                    int iA = eetVar.a(viewA3);
                    int i3 = eetVar.i();
                    if ((iA == 0 || (iA > 0 && iG == left)) && (i3 == 0 || (i3 > 0 && iH == top))) {
                        break;
                    }
                    r(f, f2, pointerId3);
                    if (this.a == 1 || (zV && k(viewA3, pointerId3))) {
                        break;
                    }
                }
            }
            t(motionEvent);
        }
        return this.a == 1;
    }

    public final boolean j(android.view.View view, int i, int i2) {
        this.k = view;
        this.l = -1;
        boolean zW = w(i, i2, 0, 0);
        if (zW || this.a != 0 || this.k == null) {
            return zW;
        }
        this.k = null;
        return false;
    }

    final boolean k(android.view.View view, int i) {
        if (view == this.k && this.l == i) {
            return true;
        }
        if (view == null || !this.t.f(view, i)) {
            return false;
        }
        this.l = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.a == 2) {
            android.widget.OverScroller overScroller = this.s;
            boolean zComputeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.k.getLeft();
            int top = currY - this.k.getTop();
            if (left != 0) {
                android.view.View view = this.k;
                int[] iArr = defpackage.ebt.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                android.view.View view2 = this.k;
                int[] iArr2 = defpackage.ebt.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.t.l(this.k, currX, currY);
            }
            if (!zComputeScrollOffset) {
                this.v.post(this.w);
            } else if (currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                this.v.post(this.w);
            }
        }
        return this.a == 2;
    }
}
