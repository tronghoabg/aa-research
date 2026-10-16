package android.support.v7.widget;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class RecyclerView extends android.view.ViewGroup implements defpackage.eal {
    public static final /* synthetic */ int ac = 0;
    private static final java.lang.Class[] af;
    public static final android.view.animation.Interpolator c;
    static final defpackage.mp d;
    public android.widget.EdgeEffect A;
    public android.widget.EdgeEffect B;
    public android.widget.EdgeEffect C;
    public android.widget.EdgeEffect D;
    public defpackage.lz E;
    public int F;
    public me G;
    public final int H;
    public float I;
    public float J;
    public final defpackage.mq K;
    public defpackage.lb L;
    public defpackage.kz M;
    public final defpackage.mo N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public defpackage.mt R;
    public final int[] S;
    final java.util.List T;
    boolean U;
    defpackage.eae V;
    defpackage.sr W;
    private int aA;
    private int aB;
    private int aC;
    private final int aD;
    private boolean aE;
    private boolean aF;
    private java.util.List aG;
    private final int[] aH;
    private defpackage.eam aI;
    private final int[] aJ;
    private final int[] aK;
    private java.lang.Runnable aL;
    private boolean aM;
    private int aN;
    private int aO;
    private final defpackage.eaf aP;
    private defpackage.ca aQ;
    private defpackage.izq aR;
    private final defpackage.izq aS;
    public defpackage.ca aa;
    public final defpackage.bil ab;
    private final float ag;
    private boolean ah;
    private final defpackage.mj ai;
    private final android.graphics.Rect aj;
    private android.graphics.Rect ak;
    private final java.util.ArrayList al;
    private mf am;
    private final java.lang.Runnable an;
    private boolean ao;
    private boolean ap;
    private int aq;
    private boolean ar;
    private int as;
    private final android.view.accessibility.AccessibilityManager at;
    private int au;
    private int av;
    private int aw;
    private android.view.VelocityTracker ax;
    private int ay;
    private int az;
    public final defpackage.mh e;
    android.support.v7.widget.RecyclerView.SavedState f;
    public defpackage.iv g;
    public defpackage.kf h;
    public boolean i;
    public final java.lang.Runnable j;
    public final android.graphics.Rect k;
    public final android.graphics.RectF l;
    public defpackage.lw m;
    public defpackage.mc n;
    public final java.util.List o;
    public final java.util.ArrayList p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public java.util.List x;
    public boolean y;
    boolean z;
    private static final int[] ad = {android.R.attr.nestedScrollingEnabled};
    private static final float ae = 2.3582017f;
    public static final boolean a = true;
    static final boolean b = true;

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        af = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        c = new defpackage.lu();
        d = new defpackage.mp();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        android.support.v7.widget.RecyclerView recyclerView = this;
        recyclerView.ah = false;
        recyclerView.ai = new defpackage.mj(recyclerView);
        recyclerView.e = new defpackage.mh(recyclerView);
        recyclerView.ab = new defpackage.bil((char[]) null, (byte[]) null, (byte[]) null);
        recyclerView.j = new defpackage.ap(recyclerView, 16, null);
        recyclerView.k = new android.graphics.Rect();
        recyclerView.aj = new android.graphics.Rect();
        recyclerView.l = new android.graphics.RectF();
        recyclerView.o = new java.util.ArrayList();
        recyclerView.p = new java.util.ArrayList();
        recyclerView.al = new java.util.ArrayList();
        recyclerView.an = new defpackage.ap(recyclerView, 15);
        recyclerView.aq = 0;
        recyclerView.y = false;
        recyclerView.z = false;
        recyclerView.au = 0;
        recyclerView.av = 0;
        recyclerView.aQ = d;
        recyclerView.E = new defpackage.mx();
        recyclerView.F = 0;
        recyclerView.aw = -1;
        recyclerView.I = Float.MIN_VALUE;
        recyclerView.J = Float.MIN_VALUE;
        recyclerView.aE = true;
        recyclerView.aF = true;
        recyclerView.K = new defpackage.mq(recyclerView);
        recyclerView.M = new defpackage.kz();
        recyclerView.N = new defpackage.mo();
        recyclerView.O = false;
        recyclerView.P = false;
        recyclerView.aR = new defpackage.izq(recyclerView);
        recyclerView.Q = false;
        recyclerView.aH = new int[2];
        recyclerView.aJ = new int[2];
        recyclerView.aK = new int[2];
        recyclerView.S = new int[2];
        recyclerView.T = new java.util.ArrayList();
        recyclerView.aL = new defpackage.ap(recyclerView, 17, null);
        recyclerView.aN = 0;
        recyclerView.aO = 0;
        recyclerView.aS = new defpackage.izq(recyclerView);
        defpackage.lv lvVar = new defpackage.lv(recyclerView);
        recyclerView.aP = lvVar;
        recyclerView.V = new defpackage.eae(recyclerView.getContext(), lvVar);
        recyclerView.setScrollContainer(true);
        recyclerView.setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        recyclerView.aC = viewConfiguration.getScaledTouchSlop();
        recyclerView.I = a$.ExternalSyntheticApiModelOutline1.m(viewConfiguration);
        recyclerView.J = a$.ExternalSyntheticApiModelOutline1.m$1(viewConfiguration);
        recyclerView.H = viewConfiguration.getScaledMinimumFlingVelocity();
        recyclerView.aD = viewConfiguration.getScaledMaximumFlingVelocity();
        recyclerView.ag = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        recyclerView.setWillNotDraw(recyclerView.getOverScrollMode() == 2);
        recyclerView.E.a = recyclerView.aR;
        recyclerView.g = new defpackage.iv(new defpackage.izq(recyclerView));
        recyclerView.h = new defpackage.kf(new defpackage.izq(recyclerView));
        int[] iArr = defpackage.ebt.a;
        if (defpackage.ebo.a(recyclerView) == 0) {
            defpackage.ebo.b(recyclerView, 8);
        }
        if (recyclerView.getImportantForAccessibility() == 0) {
            recyclerView.setImportantForAccessibility(1);
        }
        recyclerView.at = (android.view.accessibility.AccessibilityManager) recyclerView.getContext().getSystemService("accessibility");
        recyclerView.Y(new defpackage.mt(recyclerView));
        int[] iArr2 = defpackage.fw.a;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        defpackage.ebt.m(recyclerView, context, iArr2, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        java.lang.String string = typedArrayObtainStyledAttributes.getString(9);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            recyclerView.setDescendantFocusability(262144);
        }
        recyclerView.i = typedArrayObtainStyledAttributes.getBoolean(1, true);
        recyclerView.aF = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            android.graphics.drawable.Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables.".concat(recyclerView.n()));
            }
            android.content.res.Resources resources = recyclerView.getContext().getResources();
            new kx(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(2131166031), resources.getDimensionPixelSize(2131166033), resources.getDimensionPixelOffset(2131166032));
            recyclerView = this;
        }
        typedArrayObtainStyledAttributes.recycle();
        recyclerView.U = context.getPackageManager().hasSystemFeature("android.hardware.rotaryencoder.lowres");
        recyclerView.aR(context, string, attributeSet, i);
        int[] iArr3 = ad;
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        defpackage.ebt.m(recyclerView, context, iArr3, attributeSet, typedArrayObtainStyledAttributes2, i, 0);
        boolean z = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        recyclerView.setNestedScrollingEnabled(z);
        recyclerView.setTag(2131428439, java.lang.Boolean.TRUE);
    }

    public static void K(android.view.View view, android.graphics.Rect rect) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        android.graphics.Rect rect2 = mdVar.d;
        rect.set((view.getLeft() - rect2.left) - mdVar.leftMargin, (view.getTop() - rect2.top) - mdVar.topMargin, view.getRight() + rect2.right + mdVar.rightMargin, view.getBottom() + rect2.bottom + mdVar.bottomMargin);
    }

    private final int a(int i, float f) {
        float height = getHeight();
        float width = i / getWidth();
        float f2 = f / height;
        android.widget.EdgeEffect edgeEffect = this.A;
        float f3 = 0.0f;
        if (edgeEffect == null || defpackage.dtf.e(edgeEffect) == 0.0f) {
            android.widget.EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && defpackage.dtf.e(edgeEffect2) != 0.0f) {
                boolean zCanScrollHorizontally = canScrollHorizontally(1);
                android.widget.EdgeEffect edgeEffect3 = this.C;
                if (zCanScrollHorizontally) {
                    edgeEffect3.onRelease();
                } else {
                    float f4 = defpackage.dtf.f(edgeEffect3, width, f2);
                    if (defpackage.dtf.e(this.C) == 0.0f) {
                        this.C.onRelease();
                    }
                    f3 = f4;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollHorizontally2 = canScrollHorizontally(-1);
            android.widget.EdgeEffect edgeEffect4 = this.A;
            if (zCanScrollHorizontally2) {
                edgeEffect4.onRelease();
            } else {
                float f5 = -defpackage.dtf.f(edgeEffect4, -width, 1.0f - f2);
                if (defpackage.dtf.e(this.A) == 0.0f) {
                    this.A.onRelease();
                }
                f3 = f5;
            }
            invalidate();
        }
        return java.lang.Math.round(f3 * getWidth());
    }

    private final int aA(int i, float f) {
        float width = getWidth();
        float height = i / getHeight();
        float f2 = f / width;
        android.widget.EdgeEffect edgeEffect = this.B;
        float f3 = 0.0f;
        if (edgeEffect == null || defpackage.dtf.e(edgeEffect) == 0.0f) {
            android.widget.EdgeEffect edgeEffect2 = this.D;
            if (edgeEffect2 != null && defpackage.dtf.e(edgeEffect2) != 0.0f) {
                boolean zCanScrollVertically = canScrollVertically(1);
                android.widget.EdgeEffect edgeEffect3 = this.D;
                if (zCanScrollVertically) {
                    edgeEffect3.onRelease();
                } else {
                    float f4 = defpackage.dtf.f(edgeEffect3, height, 1.0f - f2);
                    if (defpackage.dtf.e(this.D) == 0.0f) {
                        this.D.onRelease();
                    }
                    f3 = f4;
                }
                invalidate();
            }
        } else {
            boolean zCanScrollVertically2 = canScrollVertically(-1);
            android.widget.EdgeEffect edgeEffect4 = this.B;
            if (zCanScrollVertically2) {
                edgeEffect4.onRelease();
            } else {
                float f5 = -defpackage.dtf.f(edgeEffect4, -height, f2);
                if (defpackage.dtf.e(this.B) == 0.0f) {
                    this.B.onRelease();
                }
                f3 = f5;
            }
            invalidate();
        }
        return java.lang.Math.round(f3 * getHeight());
    }

    private final defpackage.eam aB() {
        defpackage.eam eamVar = this.aI;
        if (eamVar != null) {
            return eamVar;
        }
        defpackage.eam eamVar2 = new defpackage.eam(this);
        this.aI = eamVar2;
        return eamVar2;
    }

    private final void aC() {
        aL();
        ac(0);
    }

    private final void aD() {
        android.view.View viewM;
        defpackage.mo moVar = this.N;
        moVar.b(1);
        J(moVar);
        moVar.i = false;
        ae();
        defpackage.bil bilVar = this.ab;
        bilVar.C();
        Q();
        aH();
        android.view.View focusedChild = (this.aE && hasFocus() && this.m != null) ? getFocusedChild() : null;
        defpackage.mr mrVarJ = (focusedChild == null || (viewM = m(focusedChild)) == null) ? null : j(viewM);
        if (mrVarJ == null) {
            aK();
        } else {
            moVar.m = this.m.c ? mrVarJ.e : -1L;
            moVar.l = this.y ? -1 : mrVarJ.v() ? mrVarJ.d : mrVarJ.a();
            android.view.View focusedChild2 = mrVarJ.a;
            int id = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof android.view.ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((android.view.ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id = focusedChild2.getId();
                }
            }
            moVar.n = id;
        }
        moVar.h = moVar.j && this.P;
        this.P = false;
        this.O = false;
        moVar.g = moVar.k;
        moVar.e = this.m.a();
        aF(this.aH);
        if (moVar.j) {
            int iA = this.h.a();
            for (int i = 0; i < iA; i++) {
                android.view.View viewD = this.h.d(i);
                defpackage.mr mrVar = viewD == null ? null : ((defpackage.md) viewD.getLayoutParams()).c;
                if (!mrVar.A() && (!mrVar.t() || this.m.c)) {
                    defpackage.lz.i(mrVar);
                    mrVar.d();
                    bilVar.Z(mrVar, defpackage.lz.n(mrVar));
                    if (moVar.h && mrVar.y() && !mrVar.v() && !mrVar.A() && !mrVar.t()) {
                        bilVar.B(e(mrVar), mrVar);
                    }
                }
            }
        }
        if (moVar.k) {
            int iB = this.h.b();
            for (int i2 = 0; i2 < iB; i2++) {
                android.view.View viewE = this.h.e(i2);
                defpackage.mr mrVar2 = viewE == null ? null : ((defpackage.md) viewE.getLayoutParams()).c;
                if (!mrVar2.A() && mrVar2.d == -1) {
                    mrVar2.d = mrVar2.c;
                }
            }
            boolean z = moVar.f;
            moVar.f = false;
            this.n.p(this.e, moVar);
            moVar.f = z;
            for (int i3 = 0; i3 < this.h.a(); i3++) {
                android.view.View viewD2 = this.h.d(i3);
                defpackage.mr mrVar3 = viewD2 == null ? null : ((defpackage.md) viewD2.getLayoutParams()).c;
                if (!mrVar3.A()) {
                    defpackage.aba abaVar = (defpackage.aba) bilVar.b;
                    defpackage.np npVar = (defpackage.np) abaVar.get(mrVar3);
                    if (npVar == null || (npVar.b & 4) == 0) {
                        defpackage.lz.i(mrVar3);
                        boolean zQ = mrVar3.q(8192);
                        mrVar3.d();
                        defpackage.euf eufVarN = defpackage.lz.n(mrVar3);
                        if (zQ) {
                            ax(mrVar3, eufVarN);
                        } else {
                            defpackage.np npVarA = (defpackage.np) abaVar.get(mrVar3);
                            if (npVarA == null) {
                                npVarA = defpackage.np.a();
                                abaVar.put(mrVar3, npVarA);
                            }
                            npVarA.b |= 2;
                            npVarA.c = eufVarN;
                        }
                    }
                }
            }
            x();
        } else {
            x();
        }
        R(true);
        af(false);
        moVar.d = 2;
    }

    private final void aE() {
        ae();
        Q();
        defpackage.mo moVar = this.N;
        moVar.b(6);
        this.g.d();
        moVar.e = this.m.a();
        moVar.c = 0;
        android.support.v7.widget.RecyclerView.SavedState savedState = this.f;
        if (savedState != null) {
            int i = this.m.d;
            android.os.Parcelable parcelable = savedState.a;
            if (parcelable != null) {
                this.n.ab(parcelable);
            }
            this.f = null;
        }
        moVar.g = false;
        this.n.p(this.e, moVar);
        moVar.f = false;
        moVar.j = moVar.j && this.E != null;
        moVar.d = 4;
        R(true);
        af(false);
    }

    private final void aF(int[] iArr) {
        int iA = this.h.a();
        if (iA == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MIN_VALUE;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < iA; i3++) {
            android.view.View viewD = this.h.d(i3);
            defpackage.mr mrVar = viewD == null ? null : ((defpackage.md) viewD.getLayoutParams()).c;
            if (!mrVar.A()) {
                int iC = mrVar.c();
                if (iC < i2) {
                    i2 = iC;
                }
                if (iC > i) {
                    i = iC;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i;
    }

    private final void aG(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.aw) {
            int i = actionIndex == 0 ? 1 : 0;
            this.aw = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.aA = x;
            this.ay = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.aB = y;
            this.az = y;
        }
    }

    private final void aH() {
        boolean z;
        if (this.y) {
            this.g.i();
            if (this.z) {
                this.n.fk();
            }
        }
        boolean zAP = aP();
        defpackage.iv ivVar = this.g;
        if (zAP) {
            ivVar.f();
        } else {
            ivVar.d();
        }
        boolean z2 = this.O || this.P;
        defpackage.mo moVar = this.N;
        boolean z3 = this.s && this.E != null && ((z = this.y) || z2 || this.n.u) && (!z || this.m.c);
        moVar.j = z3;
        moVar.k = z3 && z2 && !this.y && aP();
    }

    private final void aI() {
        boolean zIsFinished;
        android.widget.EdgeEffect edgeEffect = this.A;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.A.isFinished();
        } else {
            zIsFinished = false;
        }
        android.widget.EdgeEffect edgeEffect2 = this.B;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.C;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private final void aJ(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        android.graphics.Rect rect = this.k;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof defpackage.md) {
            defpackage.md mdVar = (defpackage.md) layoutParams;
            if (!mdVar.e) {
                android.graphics.Rect rect2 = mdVar.d;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        } else {
            view2 = null;
        }
        this.n.bf(this, view, rect, !this.s, view2 == null);
    }

    private final void aK() {
        defpackage.mo moVar = this.N;
        moVar.m = -1L;
        moVar.l = -1;
        moVar.n = -1;
    }

    private final void aL() {
        android.view.VelocityTracker velocityTracker = this.ax;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        ag(0);
        aI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void aM(int i) {
        boolean zAg = this.n.ag();
        int i2 = zAg;
        if (this.n.ah()) {
            i2 = (zAg ? 1 : 0) | 2;
        }
        at(i2, i);
    }

    private final void aN() {
        mn mnVar;
        this.K.d();
        defpackage.mc mcVar = this.n;
        if (mcVar == null || (mnVar = mcVar.t) == null) {
            return;
        }
        mnVar.i();
    }

    private final boolean aO(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = this.al;
        int action = motionEvent.getAction();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mf mfVar = (mf) arrayList.get(i);
            if (mfVar.j(motionEvent) && action != 3) {
                this.am = mfVar;
                return true;
            }
        }
        return false;
    }

    private final boolean aP() {
        return this.E != null && this.n.fj();
    }

    private final boolean aQ(android.widget.EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float fE = defpackage.dtf.e(edgeEffect) * i2;
        float fAbs = java.lang.Math.abs(-i);
        float f = this.ag * 0.015f;
        double dLog = java.lang.Math.log((fAbs * 0.35f) / f);
        double d2 = ae;
        return ((float) (((double) f) * java.lang.Math.exp((d2 / ((-1.0d) + d2)) * dLog))) < fE;
    }

    private final void aR(android.content.Context context, java.lang.String str, android.util.AttributeSet attributeSet, int i) {
        java.lang.Object[] objArr;
        java.lang.reflect.Constructor constructor;
        if (str != null) {
            java.lang.String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            if (strTrim.charAt(0) == '.') {
                strTrim = java.lang.String.valueOf(context.getPackageName()).concat(java.lang.String.valueOf(strTrim));
            } else if (!strTrim.contains(".")) {
                strTrim = android.support.v7.widget.RecyclerView.class.getPackage().getName() + '.' + strTrim;
            }
            try {
                java.lang.Class<? extends U> clsAsSubclass = java.lang.Class.forName(strTrim, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(defpackage.mc.class);
                try {
                    constructor = clsAsSubclass.getConstructor(af);
                    objArr = new java.lang.Object[]{context, attributeSet, java.lang.Integer.valueOf(i), 0};
                } catch (java.lang.NoSuchMethodException e) {
                    objArr = null;
                    try {
                        constructor = clsAsSubclass.getConstructor(null);
                    } catch (java.lang.NoSuchMethodException e2) {
                        e2.initCause(e);
                        throw new java.lang.IllegalStateException(defpackage.a.bw(strTrim, attributeSet, ": Error creating LayoutManager "), e2);
                    }
                }
                constructor.setAccessible(true);
                ab((defpackage.mc) constructor.newInstance(objArr));
            } catch (java.lang.ClassCastException e3) {
                throw new java.lang.IllegalStateException(defpackage.a.bw(strTrim, attributeSet, ": Class is not a LayoutManager "), e3);
            } catch (java.lang.ClassNotFoundException e4) {
                throw new java.lang.IllegalStateException(defpackage.a.bw(strTrim, attributeSet, ": Unable to find LayoutManager "), e4);
            } catch (java.lang.IllegalAccessException e5) {
                throw new java.lang.IllegalStateException(defpackage.a.bw(strTrim, attributeSet, ": Cannot access non-public constructor "), e5);
            } catch (java.lang.InstantiationException e6) {
                throw new java.lang.IllegalStateException(defpackage.a.bw(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e6);
            } catch (java.lang.reflect.InvocationTargetException e7) {
                throw new java.lang.IllegalStateException(defpackage.a.bw(strTrim, attributeSet, ": Could not instantiate the LayoutManager: "), e7);
            }
        }
    }

    private final defpackage.sr aS() {
        defpackage.sr srVar = this.W;
        if (srVar != null) {
            return srVar;
        }
        defpackage.sr srVar2 = new defpackage.sr((android.view.View) this);
        this.W = srVar2;
        return srVar2;
    }

    public static final int aq(int i, android.widget.EdgeEffect edgeEffect, android.widget.EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && defpackage.dtf.e(edgeEffect) != 0.0f) {
            int iRound = java.lang.Math.round(((-i2) / 4.0f) * defpackage.dtf.f(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || defpackage.dtf.e(edgeEffect2) == 0.0f) {
            return i;
        }
        float f = i2;
        int iRound2 = java.lang.Math.round((f / 4.0f) * defpackage.dtf.f(edgeEffect2, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static defpackage.mr k(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((defpackage.md) view.getLayoutParams()).c;
    }

    public static android.support.v7.widget.RecyclerView l(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof android.support.v7.widget.RecyclerView) {
            return (android.support.v7.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.support.v7.widget.RecyclerView recyclerViewL = l(viewGroup.getChildAt(i));
            if (recyclerViewL != null) {
                return recyclerViewL;
            }
        }
        return null;
    }

    public static void w(defpackage.mr mrVar) {
        java.lang.ref.WeakReference weakReference = mrVar.b;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            while (view != null) {
                if (view == mrVar.a) {
                    return;
                }
                java.lang.Object parent = view.getParent();
                view = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            mrVar.b = null;
        }
    }

    public final void A(int i, int i2) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int[] iArr = defpackage.ebt.a;
        setMeasuredDimension(defpackage.mc.au(i, paddingLeft, getMinimumWidth()), defpackage.mc.au(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void B(android.view.View view) {
        if (view != null) {
            defpackage.mr mrVar = ((defpackage.md) view.getLayoutParams()).c;
        }
        java.util.List list = this.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            nx nxVar = (nx) this.x.get(size);
            nxVar.h(view);
            defpackage.mr mrVarJ = nxVar.o.j(view);
            if (mrVarJ != null) {
                defpackage.mr mrVar2 = nxVar.b;
                if (mrVar2 == null || mrVarJ != mrVar2) {
                    nxVar.d(mrVarJ, false);
                    if (nxVar.a.remove(mrVarJ.a)) {
                        nxVar.l.c(nxVar.o, mrVarJ);
                    }
                } else {
                    nxVar.j((defpackage.mr) null, 0);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x02de  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:159:0x0307  */
    /* JADX WARN: Code duplicated, block: B:161:0x030f  */
    /* JADX WARN: Code duplicated, block: B:164:0x0316  */
    /* JADX WARN: Code duplicated, block: B:167:0x031e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0325  */
    /* JADX WARN: Code duplicated, block: B:173:0x032f A[LOOP:3: B:166:0x031c->B:173:0x032f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x033c  */
    /* JADX WARN: Code duplicated, block: B:179:0x0343  */
    /* JADX WARN: Code duplicated, block: B:182:0x034d A[LOOP:4: B:175:0x033a->B:182:0x034d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x0352  */
    /* JADX WARN: Code duplicated, block: B:216:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x0350 A[EDGE_INSN: B:219:0x0350->B:183:0x0350 BREAK  A[LOOP:4: B:175:0x033a->B:182:0x034d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x034b A[SYNTHETIC] */
    final void C() {
        int i;
        long j;
        defpackage.mr mrVarI;
        int i2;
        int iA;
        int i3;
        int iMin;
        defpackage.mr mrVarH;
        android.view.View view;
        defpackage.mr mrVarH2;
        android.view.View view2;
        int i4;
        android.view.View viewFindViewById;
        defpackage.kf kfVar;
        android.view.View view3;
        int i5;
        if (this.m == null) {
            android.util.Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.n == null) {
            android.util.Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        defpackage.mo moVar = this.N;
        moVar.i = false;
        boolean z = this.aM && !(this.aN == getWidth() && this.aO == getHeight());
        this.aN = 0;
        this.aO = 0;
        this.aM = false;
        if (moVar.d == 1) {
            aD();
            this.n.aX(this);
            aE();
        } else {
            defpackage.iv ivVar = this.g;
            if ((ivVar.b.isEmpty() || ivVar.a.isEmpty()) && !z && this.n.C == getWidth() && this.n.D == getHeight()) {
                this.n.aX(this);
            } else {
                this.n.aX(this);
                aE();
            }
        }
        moVar.b(4);
        ae();
        Q();
        moVar.d = 1;
        int i6 = -1;
        android.view.View view4 = null;
        if (moVar.j) {
            int iA2 = this.h.a() - 1;
            while (iA2 >= 0) {
                android.view.View viewD = this.h.d(iA2);
                defpackage.mr mrVar = viewD == null ? null : ((defpackage.md) viewD.getLayoutParams()).c;
                if (mrVar.A()) {
                    i5 = i6;
                } else {
                    long jE = e(mrVar);
                    defpackage.euf eufVar = new defpackage.euf(null);
                    eufVar.f(mrVar);
                    defpackage.bil bilVar = this.ab;
                    defpackage.mr mrVar2 = (defpackage.mr) ((defpackage.zz) bilVar.a).d(jE);
                    if (mrVar2 == null || mrVar2.A()) {
                        i5 = i6;
                        bilVar.Y(mrVar, eufVar);
                    } else {
                        boolean zF = bilVar.F(mrVar2);
                        boolean zF2 = bilVar.F(mrVar);
                        if (zF && mrVar2 == mrVar) {
                            bilVar.Y(mrVar, eufVar);
                            i5 = i6;
                        } else {
                            i5 = i6;
                            defpackage.euf eufVarX = bilVar.X(mrVar2, 4);
                            bilVar.Y(mrVar, eufVar);
                            defpackage.euf eufVarX2 = bilVar.X(mrVar, 8);
                            if (eufVarX == null) {
                                int iA3 = this.h.a();
                                for (int i7 = 0; i7 < iA3; i7++) {
                                    android.view.View viewD2 = this.h.d(i7);
                                    defpackage.mr mrVar3 = viewD2 == null ? null : ((defpackage.md) viewD2.getLayoutParams()).c;
                                    if (mrVar3 != mrVar && e(mrVar3) == jE) {
                                        defpackage.lw lwVar = this.m;
                                        if (lwVar == null || !lwVar.c) {
                                            throw new java.lang.IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + mrVar3 + " \n View Holder 2:" + mrVar + n());
                                        }
                                        throw new java.lang.IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + mrVar3 + " \n View Holder 2:" + mrVar + n());
                                    }
                                }
                                android.util.Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + mrVar2 + " cannot be found but it is necessary for " + mrVar + n());
                            } else {
                                mrVar2.n(false);
                                if (zF) {
                                    t(mrVar2);
                                }
                                if (mrVar2 != mrVar) {
                                    if (zF2) {
                                        t(mrVar);
                                    }
                                    mrVar2.h = mrVar;
                                    t(mrVar2);
                                    this.e.l(mrVar2);
                                    mrVar.n(false);
                                    mrVar.i = mrVar2;
                                }
                                if (this.E.k(mrVar2, mrVar, eufVarX, eufVarX2)) {
                                    S();
                                }
                            }
                        }
                    }
                }
                iA2--;
                i6 = i5;
            }
            i = i6;
            defpackage.bil bilVar2 = this.ab;
            defpackage.izq izqVar = this.aS;
            defpackage.aba abaVar = (defpackage.aba) bilVar2.b;
            for (int i8 = abaVar.d - 1; i8 >= 0; i8--) {
                defpackage.mr mrVar4 = (defpackage.mr) abaVar.d(i8);
                defpackage.np npVar = (defpackage.np) abaVar.e(i8);
                int i9 = npVar.b;
                if ((i9 & 3) == 3) {
                    izqVar.B(mrVar4);
                } else if ((i9 & 1) != 0) {
                    defpackage.euf eufVar2 = npVar.c;
                    if (eufVar2 == null) {
                        izqVar.B(mrVar4);
                    } else {
                        izqVar.D(mrVar4, eufVar2, npVar.d);
                    }
                } else if ((i9 & 14) == 14) {
                    izqVar.C(mrVar4, npVar.c, npVar.d);
                } else if ((i9 & 12) == 12) {
                    defpackage.euf eufVar3 = npVar.c;
                    defpackage.euf eufVar4 = npVar.d;
                    mrVar4.n(false);
                    android.support.v7.widget.RecyclerView recyclerView = (android.support.v7.widget.RecyclerView) izqVar.a;
                    if (recyclerView.y) {
                        if (recyclerView.E.k(mrVar4, mrVar4, eufVar3, eufVar4)) {
                            recyclerView.S();
                        }
                    } else if (recyclerView.E.m(mrVar4, eufVar3, eufVar4)) {
                        recyclerView.S();
                    }
                } else if ((i9 & 4) != 0) {
                    izqVar.D(mrVar4, npVar.c, null);
                } else if ((i9 & 8) != 0) {
                    izqVar.C(mrVar4, npVar.c, npVar.d);
                }
                defpackage.np.b(npVar);
            }
        } else {
            i = -1;
        }
        defpackage.mc mcVar = this.n;
        defpackage.mh mhVar = this.e;
        mcVar.aR(mhVar);
        moVar.b = moVar.e;
        this.y = false;
        this.z = false;
        moVar.j = false;
        moVar.k = false;
        this.n.u = false;
        java.util.ArrayList arrayList = mhVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        defpackage.mc mcVar2 = this.n;
        if (mcVar2.z) {
            mcVar2.y = 0;
            mcVar2.z = false;
            mhVar.m();
        }
        this.n.q(moVar);
        R(true);
        af(false);
        this.ab.C();
        int[] iArr = this.aH;
        int i10 = iArr[0];
        int i11 = iArr[1];
        aF(iArr);
        if (iArr[0] != i10 || iArr[1] != i11) {
            E(0, 0);
        }
        if (this.aE && this.m != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j = moVar.m;
                if (j == -1) {
                    mrVarI = null;
                } else {
                    mrVarI = null;
                }
                if (mrVarI != null) {
                    kfVar = this.h;
                    view3 = mrVarI.a;
                    if (!kfVar.k(view3)) {
                        if (this.h.a() > 0) {
                            int i12 = moVar.l;
                            if (i12 != i) {
                            }
                            iA = moVar.a();
                            i3 = i2;
                            while (true) {
                                if (i3 < iA) {
                                    mrVarH2 = h(i3);
                                    if (mrVarH2 != null) {
                                        view2 = mrVarH2.a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i3++;
                                        }
                                    }
                                }
                                for (iMin = java.lang.Math.min(iA, i2) - 1; iMin >= 0; iMin--) {
                                    mrVarH = h(iMin);
                                    if (mrVarH == null) {
                                        break;
                                        break;
                                    }
                                    view = mrVarH.a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.h.a() > 0) {
                        int i13 = moVar.l;
                        if (i13 != i) {
                        }
                        iA = moVar.a();
                        i3 = i2;
                        while (true) {
                            if (i3 < iA) {
                                mrVarH2 = h(i3);
                                if (mrVarH2 != null) {
                                    view2 = mrVarH2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                mrVarH = h(iMin);
                                if (mrVarH == null) {
                                    break;
                                    break;
                                }
                                view = mrVarH.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.a() > 0) {
                    int i14 = moVar.l;
                    if (i14 != i) {
                    }
                    iA = moVar.a();
                    i3 = i2;
                    while (true) {
                        if (i3 < iA) {
                            mrVarH2 = h(i3);
                            if (mrVarH2 != null) {
                                view2 = mrVarH2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            mrVarH = h(iMin);
                            if (mrVarH == null) {
                                break;
                                break;
                            }
                            view = mrVarH.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = moVar.n;
                    if (i4 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (this.h.k(getFocusedChild())) {
                j = moVar.m;
                if (j == -1 && this.m.c) {
                    mrVarI = i(j);
                } else {
                    mrVarI = null;
                }
                if (mrVarI != null) {
                    kfVar = this.h;
                    view3 = mrVarI.a;
                    if (!kfVar.k(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.h.a() > 0) {
                        int i15 = moVar.l;
                        i2 = i15 != i ? i15 : 0;
                        iA = moVar.a();
                        i3 = i2;
                        while (true) {
                            if (i3 < iA) {
                                mrVarH2 = h(i3);
                                if (mrVarH2 != null) {
                                    view2 = mrVarH2.a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                mrVarH = h(iMin);
                                if (mrVarH == null) {
                                    break;
                                }
                                view = mrVarH.a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.h.a() > 0) {
                    int i16 = moVar.l;
                    if (i16 != i) {
                    }
                    iA = moVar.a();
                    i3 = i2;
                    while (true) {
                        if (i3 < iA) {
                            mrVarH2 = h(i3);
                            if (mrVarH2 != null) {
                                view2 = mrVarH2.a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            mrVarH = h(iMin);
                            if (mrVarH == null) {
                                break;
                                break;
                            }
                            view = mrVarH.a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i4 = moVar.n;
                    if (i4 != -1 && (viewFindViewById = view4.findViewById(i4)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        aK();
    }

    public final void D(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        aB().f(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void E(int i, int i2) {
        this.av++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        defpackage.ca caVar = this.aa;
        if (caVar != null) {
            caVar.q(this, i, i2);
        }
        java.util.List list = this.aG;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((defpackage.ca) this.aG.get(size)).q(this, i, i2);
                }
            }
        }
        this.av--;
    }

    public final void F() {
        if (this.D != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectR = this.aQ.r(this);
        this.D = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectR.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void G() {
        if (this.A != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectR = this.aQ.r(this);
        this.A = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectR.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void H() {
        if (this.C != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectR = this.aQ.r(this);
        this.C = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectR.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void I() {
        if (this.B != null) {
            return;
        }
        android.widget.EdgeEffect edgeEffectR = this.aQ.r(this);
        this.B = edgeEffectR;
        if (this.i) {
            edgeEffectR.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectR.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    final void J(defpackage.mo moVar) {
        if (this.F != 2) {
            moVar.o = 0;
            moVar.p = 0;
        } else {
            android.widget.OverScroller overScroller = this.K.a;
            moVar.o = overScroller.getFinalX() - overScroller.getCurrX();
            moVar.p = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    final void L() {
        this.D = null;
        this.B = null;
        this.C = null;
        this.A = null;
    }

    public final void M() {
        if (this.p.size() == 0) {
            return;
        }
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.W("Cannot invalidate item decorations during a scroll or layout");
        }
        O();
        requestLayout();
    }

    public final void N(int i) {
        if (this.n == null) {
            return;
        }
        ac(2);
        this.n.ad(i);
        awakenScrollBars();
    }

    final void O() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            ((defpackage.md) this.h.e(i).getLayoutParams()).e = true;
        }
        java.util.ArrayList arrayList = this.e.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.md mdVar = (defpackage.md) ((defpackage.mr) arrayList.get(i2)).a.getLayoutParams();
            if (mdVar != null) {
                mdVar.e = true;
            }
        }
    }

    public final void P(int i, int i2, boolean z) {
        int i3;
        int iB = this.h.b();
        int i4 = 0;
        while (true) {
            i3 = i + i2;
            if (i4 >= iB) {
                break;
            }
            defpackage.mr mrVarK = k(this.h.e(i4));
            if (mrVarK != null && !mrVarK.A()) {
                int i5 = mrVarK.c;
                if (i5 >= i3) {
                    mrVarK.k(-i2, z);
                    this.N.f = true;
                } else if (i5 >= i) {
                    mrVarK.f(8);
                    mrVarK.k(-i2, z);
                    mrVarK.c = i - 1;
                    this.N.f = true;
                }
            }
            i4++;
        }
        defpackage.mh mhVar = this.e;
        java.util.ArrayList arrayList = mhVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            defpackage.mr mrVar = (defpackage.mr) arrayList.get(size);
            if (mrVar != null) {
                int i6 = mrVar.c;
                if (i6 >= i3) {
                    mrVar.k(-i2, z);
                } else if (i6 >= i) {
                    mrVar.f(8);
                    mhVar.h(size);
                }
            }
        }
    }

    public final void Q() {
        this.au++;
    }

    public final void R(boolean z) {
        int i;
        int i2 = this.au - 1;
        this.au = i2;
        if (i2 <= 0) {
            this.au = 0;
            if (z) {
                int i3 = this.as;
                this.as = 0;
                if (i3 != 0 && an()) {
                    android.view.accessibility.AccessibilityEvent accessibilityEventObtain = android.view.accessibility.AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    accessibilityEventObtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                java.util.List list = this.T;
                for (int size = list.size() - 1; size >= 0; size--) {
                    defpackage.mr mrVar = (defpackage.mr) list.get(size);
                    android.view.View view = mrVar.a;
                    if (view.getParent() == this && !mrVar.A() && (i = mrVar.p) != -1) {
                        view.setImportantForAccessibility(i);
                        mrVar.p = -1;
                    }
                }
                list.clear();
            }
        }
    }

    public final void S() {
        if (this.Q || !this.q) {
            return;
        }
        java.lang.Runnable runnable = this.aL;
        int[] iArr = defpackage.ebt.a;
        postOnAnimation(runnable);
        this.Q = true;
    }

    public final void T(boolean z) {
        this.z = z | this.z;
        this.y = true;
        int iB = this.h.b();
        int i = 0;
        while (true) {
            if (i >= iB) {
                break;
            }
            android.view.View viewE = this.h.e(i);
            defpackage.mr mrVar = viewE != null ? ((defpackage.md) viewE.getLayoutParams()).c : null;
            if (mrVar != null && !mrVar.A()) {
                mrVar.f(6);
            }
            i++;
        }
        O();
        defpackage.mh mhVar = this.e;
        java.util.ArrayList arrayList = mhVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            defpackage.mr mrVar2 = (defpackage.mr) arrayList.get(i2);
            if (mrVar2 != null) {
                mrVar2.f(6);
                mrVar2.e(null);
            }
        }
        defpackage.lw lwVar = mhVar.f.m;
        if (lwVar == null || !lwVar.c) {
            mhVar.g();
        }
    }

    public final void U() {
        defpackage.lz lzVar = this.E;
        if (lzVar != null) {
            lzVar.d();
        }
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            defpackage.mh mhVar = this.e;
            mcVar.aQ(mhVar);
            this.n.aR(mhVar);
        }
        this.e.c();
    }

    public final void V(mf mfVar) {
        this.al.remove(mfVar);
        if (this.am == mfVar) {
            this.am = null;
        }
    }

    public final void W(int i, int i2, int[] iArr) {
        defpackage.mr mrVar;
        ae();
        Q();
        defpackage.mo moVar = this.N;
        J(moVar);
        int iD = i != 0 ? this.n.d(i, this.e, moVar) : 0;
        int iE = i2 != 0 ? this.n.e(i2, this.e, moVar) : 0;
        int iA = this.h.a();
        for (int i3 = 0; i3 < iA; i3++) {
            android.view.View viewD = this.h.d(i3);
            defpackage.mr mrVarJ = j(viewD);
            if (mrVarJ != null && (mrVar = mrVarJ.i) != null) {
                int left = viewD.getLeft();
                int top = viewD.getTop();
                android.view.View view = mrVar.a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        R(true);
        af(false);
        if (iArr != null) {
            iArr[0] = iD;
            iArr[1] = iE;
        }
    }

    public final void X(int i) {
        if (this.v) {
            return;
        }
        ah();
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mcVar.ad(i);
            awakenScrollBars();
        }
    }

    public final void Y(defpackage.mt mtVar) {
        this.R = mtVar;
        defpackage.ebt.n(this, mtVar);
    }

    public final void Z(defpackage.lw lwVar) {
        suppressLayout(false);
        defpackage.lw lwVar2 = this.m;
        if (lwVar2 != null) {
            lwVar2.r(this.ai);
        }
        U();
        this.g.i();
        defpackage.lw lwVar3 = this.m;
        this.m = lwVar;
        if (lwVar != null) {
            lwVar.q(this.ai);
            lwVar.m(this);
        }
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.bt();
        }
        defpackage.mh mhVar = this.e;
        defpackage.lw lwVar4 = this.m;
        mhVar.c();
        mhVar.e(lwVar3, true);
        defpackage.dvd dvdVarP = mhVar.p();
        if (lwVar3 != null) {
            dvdVarP.a--;
        }
        if (dvdVarP.a == 0) {
            dvdVarP.f();
        }
        if (lwVar4 != null) {
            dvdVarP.a++;
        }
        mhVar.d();
        this.N.f = true;
        T(false);
        requestLayout();
    }

    public final void aa(defpackage.lz lzVar) {
        defpackage.lz lzVar2 = this.E;
        if (lzVar2 != null) {
            lzVar2.d();
            this.E.a = null;
        }
        this.E = lzVar;
        if (lzVar != null) {
            lzVar.a = this.aR;
        }
    }

    public final void ab(defpackage.mc mcVar) {
        if (mcVar == this.n) {
            return;
        }
        ah();
        if (this.n != null) {
            defpackage.lz lzVar = this.E;
            if (lzVar != null) {
                lzVar.d();
            }
            defpackage.mc mcVar2 = this.n;
            defpackage.mh mhVar = this.e;
            mcVar2.aQ(mhVar);
            this.n.aR(mhVar);
            mhVar.c();
            if (this.q) {
                this.n.bz(this);
            }
            this.n.bb(null);
            this.n = null;
        } else {
            this.e.c();
        }
        defpackage.kf kfVar = this.h;
        kfVar.a.d();
        java.util.List list = kfVar.b;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            kfVar.e.z((android.view.View) list.get(size));
            list.remove(size);
        }
        defpackage.izq izqVar = kfVar.e;
        int iW = izqVar.w();
        for (int i = 0; i < iW; i++) {
            android.view.View viewY = izqVar.y(i);
            ((android.support.v7.widget.RecyclerView) izqVar.a).B(viewY);
            viewY.clearAnimation();
        }
        ((android.support.v7.widget.RecyclerView) izqVar.a).removeAllViews();
        this.n = mcVar;
        if (mcVar != null) {
            if (mcVar.s != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + mcVar + " is already attached to a RecyclerView:" + mcVar.s.n());
            }
            this.n.bb(this);
            if (this.q) {
                this.n.aJ(this);
            }
        }
        this.e.m();
        requestLayout();
    }

    public final void ac(int i) {
        if (i == this.F) {
            return;
        }
        boolean z = this.ah;
        if (i == 1) {
            if (!z) {
                java.lang.System.identityHashCode(this);
                this.ah = true;
            }
            i = 1;
        } else if (z) {
            java.lang.System.identityHashCode(this);
            this.ah = false;
        }
        this.F = i;
        if (i != 2) {
            aN();
        }
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.aO(i);
        }
        defpackage.ca caVar = this.aa;
        if (caVar != null) {
            caVar.p(this, i);
        }
        java.util.List list = this.aG;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((defpackage.ca) this.aG.get(size)).p(this, i);
            }
        }
    }

    public final void ad(int i) {
        if (this.v) {
            return;
        }
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            mcVar.as(this, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        defpackage.mc mcVar = this.n;
        if (mcVar == null || !mcVar.bu(arrayList, i)) {
            if (b && isFocusable() && !this.ap && (!hasFocus() || this.ao)) {
                if (i != 2) {
                    if (i == 1) {
                        i = 1;
                    }
                }
                if (i == 2) {
                    arrayList.add(this);
                }
                super.addFocusables(arrayList, i, i2);
                if (i == 1) {
                    arrayList.add(this);
                }
                java.lang.Runnable runnable = this.an;
                removeCallbacks(runnable);
                this.t = true;
                post(runnable);
                return;
            }
            super.addFocusables(arrayList, i, i2);
        }
    }

    public final void ae() {
        int i = this.aq + 1;
        this.aq = i;
        if (i != 1 || this.v) {
            return;
        }
        this.u = false;
    }

    public final void af(boolean z) {
        int i = this.aq;
        if (i <= 0) {
            this.aq = 1;
            i = 1;
        }
        if (!z && !this.v) {
            this.u = false;
        }
        if (i == 1) {
            if (z && this.u && !this.v && this.n != null && this.m != null) {
                C();
            }
            if (!this.v) {
                this.u = false;
            }
        }
        this.aq--;
    }

    public final void ag(int i) {
        aB().b(i);
    }

    public final void ah() {
        ac(0);
        aN();
    }

    public final boolean aj(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return aB().e(i, i2, iArr, iArr2, i3);
    }

    public boolean ak(int i, int i2) {
        return al(i, i2, this.H, this.aD);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ba  */
    public final boolean al(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iMax;
        int iMax2;
        defpackage.mc mcVarG;
        int i7;
        mn mnVarD;
        int iA;
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            android.util.Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.v) {
            return false;
        }
        boolean zAg = mcVar.ag();
        boolean zAh = this.n.ah();
        if (!zAg || java.lang.Math.abs(i) < i3) {
            i = 0;
        }
        if (!zAh || java.lang.Math.abs(i2) < i3) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        if (i == 0) {
            i5 = 0;
        } else {
            android.widget.EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || defpackage.dtf.e(edgeEffect) == 0.0f) {
                android.widget.EdgeEffect edgeEffect2 = this.C;
                if (edgeEffect2 == null || defpackage.dtf.e(edgeEffect2) == 0.0f) {
                    i5 = 0;
                } else if (aQ(this.C, i, getWidth())) {
                    this.C.onAbsorb(i);
                    i = 0;
                }
            } else {
                int i8 = -i;
                if (aQ(this.A, i8, getWidth())) {
                    this.A.onAbsorb(i8);
                    i = 0;
                }
            }
            i5 = i;
            i = 0;
        }
        if (i2 == 0) {
            i6 = i2;
            i2 = 0;
        } else {
            android.widget.EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 == null || defpackage.dtf.e(edgeEffect3) == 0.0f) {
                android.widget.EdgeEffect edgeEffect4 = this.D;
                if (edgeEffect4 == null || defpackage.dtf.e(edgeEffect4) == 0.0f) {
                    i6 = i2;
                    i2 = 0;
                } else if (aQ(this.D, i2, getHeight())) {
                    this.D.onAbsorb(i2);
                    i2 = 0;
                }
            } else {
                int i9 = -i2;
                if (aQ(this.B, i9, getHeight())) {
                    this.B.onAbsorb(i9);
                    i2 = 0;
                }
            }
            i6 = 0;
        }
        if (i5 != 0) {
            int i10 = -i4;
            iMax = java.lang.Math.max(i10, java.lang.Math.min(i5, i4));
            iMax2 = java.lang.Math.max(i10, java.lang.Math.min(i2, i4));
            aM(1);
            this.K.a(iMax, iMax2);
        } else if (i2 != 0) {
            i5 = 0;
            int i11 = -i4;
            iMax = java.lang.Math.max(i11, java.lang.Math.min(i5, i4));
            iMax2 = java.lang.Math.max(i11, java.lang.Math.min(i2, i4));
            aM(1);
            this.K.a(iMax, iMax2);
        } else {
            iMax2 = 0;
            iMax = 0;
        }
        if (i == 0) {
            if (i6 == 0) {
                return (iMax == 0 && iMax2 == 0) ? false : true;
            }
            i = 0;
        }
        float f = i;
        float f2 = i6;
        if (!dispatchNestedPreFling(f, f2)) {
            boolean z = zAg || zAh;
            dispatchNestedFling(f, f2, z);
            me meVar = this.G;
            if (meVar != null && (mcVarG = meVar.a.g()) != null) {
                android.support.v7.widget.RecyclerView recyclerView = meVar.a;
                if (recyclerView.m != null && ((java.lang.Math.abs(i6) > (i7 = recyclerView.H) || java.lang.Math.abs(i) > i7) && (mcVarG instanceof defpackage.mm) && (mnVarD = meVar.d(mcVarG)) != null && (iA = meVar.a(mcVarG, i, i6)) != -1)) {
                    mnVarD.b = iA;
                    mcVarG.bc(mnVarD);
                    return true;
                }
            }
            if (z) {
                int i12 = -i4;
                aM(1);
                this.K.a(java.lang.Math.max(i12, java.lang.Math.min(i, i4)), java.lang.Math.max(i12, java.lang.Math.min(i6, i4)));
                return true;
            }
        }
        return false;
    }

    public final boolean am() {
        return !this.s || this.y || this.g.k();
    }

    public final boolean an() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.at;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public final boolean ao() {
        return this.au > 0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0117  */
    /* JADX WARN: Code duplicated, block: B:37:0x013d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    /* JADX WARN: Code duplicated, block: B:40:0x0168  */
    /* JADX WARN: Code duplicated, block: B:47:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    final boolean ap(int i, int i2, int i3, int i4, android.view.MotionEvent motionEvent, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f;
        boolean z;
        z();
        if (this.m != null) {
            int[] iArr = this.S;
            iArr[0] = 0;
            iArr[1] = 0;
            W(i, i2, iArr);
            int i13 = iArr[0];
            int i14 = iArr[1];
            i8 = i - i13;
            i9 = i2 - i14;
            i7 = i14;
            i6 = i13;
        } else {
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        if (!this.p.isEmpty()) {
            invalidate();
        }
        int[] iArr2 = this.S;
        iArr2[0] = 0;
        iArr2[1] = 0;
        int[] iArr3 = this.aJ;
        D(i6, i7, i8, i9, iArr3, i5, iArr2);
        int i15 = iArr2[0];
        int i16 = i8 - i15;
        int i17 = iArr2[1];
        int i18 = i9 - i17;
        boolean z2 = (i15 == 0 && i17 == 0) ? false : true;
        int i19 = this.aA;
        int i20 = iArr3[0];
        this.aA = i19 - i20;
        int i21 = this.aB;
        int i22 = iArr3[1];
        this.aB = i21 - i22;
        int[] iArr4 = this.aK;
        iArr4[0] = iArr4[0] + i20;
        iArr4[1] = iArr4[1] + i22;
        if (motionEvent != null) {
            if (i6 != 0) {
                aS().j(motionEvent.getDeviceId(), motionEvent.getSource(), i3, i6);
            }
            if (i7 != 0) {
                aS().j(motionEvent.getDeviceId(), motionEvent.getSource(), i4, i7);
            }
        }
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || dtb.f(motionEvent, 8194)) {
                i10 = i6;
            } else {
                float x = motionEvent.getX();
                float f2 = i16;
                float y = motionEvent.getY();
                float f3 = i18;
                if (f2 < 0.0f) {
                    G();
                    f = 0.0f;
                    i10 = i6;
                    defpackage.dtf.f(this.A, (-f2) / getWidth(), 1.0f - (y / getHeight()));
                    aS().i(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                } else {
                    i10 = i6;
                    f = 0.0f;
                    if (f2 > 0.0f) {
                        H();
                        defpackage.dtf.f(this.C, f2 / getWidth(), y / getHeight());
                        aS().i(motionEvent.getDeviceId(), motionEvent.getSource(), i3, false);
                    } else {
                        z = false;
                    }
                    if (f3 < f) {
                        I();
                        defpackage.dtf.f(this.B, (-f3) / getHeight(), x / getWidth());
                        aS().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                    } else if (f3 > f) {
                        F();
                        defpackage.dtf.f(this.D, f3 / getHeight(), 1.0f - (x / getWidth()));
                        aS().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                    } else {
                        if (!z || f2 != f || f3 != f) {
                        }
                        if (android.os.Build.VERSION.SDK_INT >= 31 && dtb.f(motionEvent, 4194304)) {
                            aI();
                        }
                    }
                    postInvalidateOnAnimation();
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        aI();
                    }
                }
                z = true;
                if (f3 < f) {
                    I();
                    defpackage.dtf.f(this.B, (-f3) / getHeight(), x / getWidth());
                    aS().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, true);
                } else if (f3 > f) {
                    F();
                    defpackage.dtf.f(this.D, f3 / getHeight(), 1.0f - (x / getWidth()));
                    aS().i(motionEvent.getDeviceId(), motionEvent.getSource(), i4, false);
                } else {
                    if (!z) {
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 31) {
                        aI();
                    }
                }
                postInvalidateOnAnimation();
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    aI();
                }
            }
            y(i, i2);
        } else {
            i10 = i6;
        }
        if (i10 == 0) {
            if (i7 != 0) {
                i11 = 0;
            } else {
                i12 = 0;
            }
            if (!awakenScrollBars()) {
                invalidate();
            }
            return !z2 ? true : true;
        }
        i11 = i10;
        E(i11, i7);
        i12 = i11;
        if (!awakenScrollBars()) {
            invalidate();
        }
        return !z2 ? true : true;
    }

    public final void ar(defpackage.mr mrVar, int i) {
        if (!ao()) {
            mrVar.a.setImportantForAccessibility(i);
        } else {
            mrVar.p = i;
            this.T.add(mrVar);
        }
    }

    public final void as(int i, int i2, boolean z) {
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            android.util.Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        if (true != mcVar.ag()) {
            i = 0;
        }
        if (true != this.n.ah()) {
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return;
            } else {
                i = 0;
            }
        }
        if (z) {
            int i3 = i != 0 ? 1 : 0;
            if (i2 != 0) {
                i3 |= 2;
            }
            at(i3, 1);
        }
        this.K.c(i, i2, Integer.MIN_VALUE, null);
    }

    public final void at(int i, int i2) {
        aB().h(i, i2);
    }

    public final defpackage.dvd au() {
        return this.e.p();
    }

    public final void av(defpackage.ly lyVar) {
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.W("Cannot remove item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.p;
        arrayList.remove(lyVar);
        if (arrayList.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        O();
        requestLayout();
    }

    public final void aw(defpackage.ly lyVar) {
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.W("Cannot add item decoration during a scroll  or layout");
        }
        java.util.ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(lyVar);
        O();
        requestLayout();
    }

    public final void ax(defpackage.mr mrVar, defpackage.euf eufVar) {
        mrVar.m(0, 8192);
        if (this.N.h && mrVar.y() && !mrVar.v() && !mrVar.A()) {
            this.ab.B(e(mrVar), mrVar);
        }
        this.ab.Z(mrVar, eufVar);
    }

    public final void ay(defpackage.ca caVar) {
        if (this.aG == null) {
            this.aG = new java.util.ArrayList();
        }
        this.aG.add(caVar);
    }

    public final void az(defpackage.ca caVar) {
        java.util.List list = this.aG;
        if (list != null) {
            list.remove(caVar);
        }
    }

    public final int b(defpackage.mr mrVar) {
        if (mrVar.q(524) || !mrVar.s()) {
            return -1;
        }
        defpackage.iv ivVar = this.g;
        int i = mrVar.c;
        java.util.ArrayList arrayList = ivVar.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            iu iuVar = (iu) arrayList.get(i2);
            int i3 = iuVar.a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = iuVar.b;
                    if (i4 <= i) {
                        int i5 = iuVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = iuVar.b;
                    if (i6 == i) {
                        i = iuVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (iuVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (iuVar.b <= i) {
                i += iuVar.d;
            }
        }
        return i;
    }

    public final int c(android.view.View view) {
        defpackage.mr mrVarK = k(view);
        if (mrVarK != null) {
            return mrVarK.a();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof defpackage.md) && this.n.u((defpackage.md) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null && mcVar.ag()) {
            return this.n.D(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null && mcVar.ag()) {
            return this.n.E(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null && mcVar.ag()) {
            return this.n.F(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null && mcVar.ah()) {
            return this.n.G(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null && mcVar.ah()) {
            return this.n.H(this.N);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null && mcVar.ah()) {
            return this.n.I(this.N);
        }
        return 0;
    }

    public final int d(android.view.View view) {
        defpackage.mr mrVarK = k(view);
        if (mrVarK != null) {
            return mrVarK.c();
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        defpackage.mc mcVarG = g();
        int iA = 0;
        if (mcVarG == null) {
            return false;
        }
        if (mcVarG.ah()) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 92 || keyCode == 93) {
                int measuredHeight = getMeasuredHeight();
                if (keyCode == 93) {
                    as(0, measuredHeight, false);
                } else {
                    as(0, -measuredHeight, false);
                }
                return true;
            }
            if (keyCode == 122 || keyCode == 123) {
                boolean zAk = mcVarG.ak();
                if (keyCode == 122) {
                    if (zAk) {
                        iA = this.m.a();
                    }
                } else if (!zAk) {
                    iA = this.m.a();
                }
                ad(iA);
                return true;
            }
        } else if (mcVarG.ag()) {
            int keyCode2 = keyEvent.getKeyCode();
            if (keyCode2 == 92 || keyCode2 == 93) {
                int measuredWidth = getMeasuredWidth();
                if (keyCode2 == 93) {
                    as(measuredWidth, 0, false);
                } else {
                    as(-measuredWidth, 0, false);
                }
                return true;
            }
            if (keyCode2 == 122 || keyCode2 == 123) {
                boolean zAk2 = mcVarG.ak();
                if (keyCode2 == 122) {
                    if (zAk2) {
                        iA = this.m.a();
                    }
                } else if (!zAk2) {
                    iA = this.m.a();
                }
                ad(iA);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return aB().c(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return aB().d(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return aB().e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return aB().f(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
        boolean z;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            ((defpackage.ly) arrayList.get(i)).i(canvas, this);
        }
        android.widget.EdgeEffect edgeEffect = this.A;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.i ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.A;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        android.widget.EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.i) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.B;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.C;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.i ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.C;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.D;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.i) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.D;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.E != null && arrayList.size() > 0 && this.E.h())) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    final long e(defpackage.mr mrVar) {
        return this.m.c ? mrVar.e : mrVar.c;
    }

    public final android.graphics.Rect f(android.view.View view) {
        defpackage.md mdVar = (defpackage.md) view.getLayoutParams();
        if (!mdVar.e) {
            return mdVar.d;
        }
        defpackage.mo moVar = this.N;
        if (moVar.g && (mdVar.eY() || mdVar.c.t())) {
            return mdVar.d;
        }
        android.graphics.Rect rect = mdVar.d;
        rect.set(0, 0, 0, 0);
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            android.graphics.Rect rect2 = this.k;
            rect2.set(0, 0, 0, 0);
            ((defpackage.ly) arrayList.get(i)).a(rect2, view, this, moVar);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        mdVar.e = false;
        return rect;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x00aa  */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0163, code lost:
    
        if (r5 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0181, code lost:
    
        if (r14 > 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0184, code lost:
    
        if (r5 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0187, code lost:
    
        if (r14 < 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0197, code lost:
    
        if ((r14 * r13) >= 0) goto L131;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public defpackage.mc g() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            return mcVar.f();
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager".concat(n()));
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            return mcVar.h(getContext(), attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager".concat(n()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final java.lang.CharSequence getAccessibilityClassName() {
        return "android.support.v7.widget.RecyclerView";
    }

    @Override // android.view.View
    public final int getBaseline() {
        if (this.n != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final boolean getClipToPadding() {
        return this.i;
    }

    public final defpackage.mr h(int i) {
        defpackage.mr mrVar = null;
        if (this.y) {
            return null;
        }
        int iB = this.h.b();
        for (int i2 = 0; i2 < iB; i2++) {
            defpackage.mr mrVarK = k(this.h.e(i2));
            if (mrVarK != null && !mrVarK.v() && b(mrVarK) == i) {
                if (!this.h.k(mrVarK.a)) {
                    return mrVarK;
                }
                mrVar = mrVarK;
            }
        }
        return mrVar;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return aB().g(0);
    }

    public final defpackage.mr i(long j) {
        defpackage.lw lwVar = this.m;
        defpackage.mr mrVar = null;
        if (lwVar != null && lwVar.c) {
            int iB = this.h.b();
            for (int i = 0; i < iB; i++) {
                defpackage.mr mrVarK = k(this.h.e(i));
                if (mrVarK != null && !mrVarK.v() && mrVarK.e == j) {
                    if (!this.h.k(mrVarK.a)) {
                        return mrVarK;
                    }
                    mrVar = mrVarK;
                }
            }
        }
        return mrVar;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.v;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return aB().a;
    }

    public final defpackage.mr j(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return k(view);
        }
        throw new java.lang.IllegalArgumentException(defpackage.a.bs(this, view, "View ", " is not a direct child of "));
    }

    public final android.view.View m(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof android.view.View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final java.lang.String n() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.au = 0;
        this.q = true;
        this.s = this.s && !isLayoutRequested();
        this.e.d();
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.aJ(this);
        }
        this.Q = false;
        java.lang.ThreadLocal threadLocal = defpackage.lb.a;
        defpackage.lb lbVar = (defpackage.lb) threadLocal.get();
        this.L = lbVar;
        if (lbVar == null) {
            this.L = new defpackage.lb();
            int[] iArr = defpackage.ebt.a;
            android.view.Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            defpackage.lb lbVar2 = this.L;
            lbVar2.e = (long) (1.0E9f / f);
            threadLocal.set(lbVar2);
        }
        this.L.c.add(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        defpackage.lz lzVar = this.E;
        if (lzVar != null) {
            lzVar.d();
        }
        ah();
        this.q = false;
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            mcVar.bz(this);
        }
        this.T.clear();
        removeCallbacks(this.aL);
        while (defpackage.np.a.a() != null) {
        }
        defpackage.mh mhVar = this.e;
        int i = 0;
        while (true) {
            java.util.ArrayList arrayList = mhVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            defpackage.ebl.i(((defpackage.mr) arrayList.get(i)).a);
            i++;
        }
        mhVar.e(mhVar.f.m, false);
        java.util.Iterator itA = new defpackage.ebw(this).a();
        while (itA.hasNext()) {
            defpackage.ebl.x((android.view.View) itA.next()).x();
        }
        defpackage.lb lbVar = this.L;
        if (lbVar != null) {
            lbVar.c.remove(this);
            this.L = null;
        }
        removeCallbacks(this.an);
        this.t = false;
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.ly) arrayList.get(i)).b(canvas, this);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v0 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v4 ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v2 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r16v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r16v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v3 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r17v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v21 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v21 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v22 ??, new type: lb
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v23 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v23 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v24 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v15 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v16 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v8 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v10 ??, new type: int[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v13 ??, new type: android.widget.OverScroller
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v14 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v17 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r18v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 'this'  ??, new type: android.support.v7.widget.RecyclerView
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v15 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.v) {
            return false;
        }
        this.am = null;
        if (aO(motionEvent)) {
            aC();
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            java.util.ArrayList arrayList = this.al;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                mf mfVar = (mf) arrayList.get(i);
                if (mfVar != null && mfVar != this.am) {
                    mfVar.j(motionEventObtain);
                }
            }
            return true;
        }
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            return false;
        }
        boolean zAg = mcVar.ag();
        boolean zAh = this.n.ah();
        android.view.VelocityTracker velocityTrackerObtain = this.ax;
        if (velocityTrackerObtain == null) {
            velocityTrackerObtain = android.view.VelocityTracker.obtain();
            this.ax = velocityTrackerObtain;
        }
        velocityTrackerObtain.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.ar) {
                this.ar = false;
            }
            this.aw = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.aA = x;
            this.ay = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.aB = y;
            this.az = y;
            android.widget.EdgeEffect edgeEffect = this.A;
            if (edgeEffect == null || defpackage.dtf.e(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z = false;
            } else {
                defpackage.dtf.f(this.A, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            }
            android.widget.EdgeEffect edgeEffect2 = this.C;
            if (edgeEffect2 != null && defpackage.dtf.e(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                defpackage.dtf.f(this.C, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            android.widget.EdgeEffect edgeEffect3 = this.B;
            if (edgeEffect3 != null && defpackage.dtf.e(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                defpackage.dtf.f(this.B, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            android.widget.EdgeEffect edgeEffect4 = this.D;
            if (edgeEffect4 == null || defpackage.dtf.e(edgeEffect4) == 0.0f || canScrollVertically(1)) {
                if (z || this.F == 2) {
                }
                int[] iArr = this.aK;
                iArr[1] = 0;
                iArr[0] = 0;
                aM(0);
            } else {
                defpackage.dtf.f(this.D, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            ac(1);
            ag(1);
            int[] iArr2 = this.aK;
            iArr2[1] = 0;
            iArr2[0] = 0;
            aM(0);
        } else if (actionMasked == 1) {
            this.ax.clear();
            ag(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.aw);
            if (iFindPointerIndex < 0) {
                android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.aw + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            float x2 = motionEvent.getX(iFindPointerIndex) + 0.5f;
            float y2 = motionEvent.getY(iFindPointerIndex) + 0.5f;
            if (this.F != 1) {
                int i2 = (int) y2;
                int i3 = (int) x2;
                int i4 = i3 - this.ay;
                int i5 = i2 - this.az;
                if (!zAg || java.lang.Math.abs(i4) <= this.aC) {
                    z2 = false;
                } else {
                    this.aA = i3;
                    z2 = true;
                }
                if (zAh && java.lang.Math.abs(i5) > this.aC) {
                    this.aB = i2;
                } else if (z2) {
                }
                ac(1);
            }
        } else if (actionMasked == 3) {
            aC();
        } else if (actionMasked == 5) {
            this.aw = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.aA = x3;
            this.ay = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.aB = y3;
            this.az = y3;
        } else if (actionMasked == 6) {
            aG(motionEvent);
        }
        return this.F == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C();
        this.s = true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            A(i, i2);
            return;
        }
        boolean z = false;
        if (mcVar.ai()) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            defpackage.mc mcVar2 = this.n;
            defpackage.mo moVar = this.N;
            mcVar2.bw(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.aM = z;
            if (z || this.m == null) {
                return;
            }
            if (moVar.d == 1) {
                aD();
            }
            this.n.aY(i, i2);
            moVar.i = true;
            aE();
            this.n.ba(i, i2);
            if (this.n.am()) {
                this.n.aY(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                moVar.i = true;
                aE();
                this.n.ba(i, i2);
            }
            this.aN = getMeasuredWidth();
            this.aO = getMeasuredHeight();
            return;
        }
        if (this.r) {
            mcVar.bw(i, i2);
            return;
        }
        if (this.w) {
            ae();
            Q();
            aH();
            R(true);
            defpackage.mo moVar2 = this.N;
            if (moVar2.k) {
                moVar2.g = true;
            } else {
                this.g.d();
                moVar2.g = false;
            }
            this.w = false;
            af(false);
        } else if (this.N.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        defpackage.lw lwVar = this.m;
        defpackage.mo moVar3 = this.N;
        if (lwVar != null) {
            moVar3.e = lwVar.a();
        } else {
            moVar3.e = 0;
        }
        ae();
        defpackage.mc mcVar3 = this.n;
        defpackage.mo moVar4 = this.N;
        mcVar3.bw(i, i2);
        af(false);
        moVar4.g = false;
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, android.graphics.Rect rect) {
        removeCallbacks(this.an);
        this.t = false;
        if (ao()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.support.v7.widget.RecyclerView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.support.v7.widget.RecyclerView.SavedState savedState = (android.support.v7.widget.RecyclerView.SavedState) parcelable;
        this.f = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    @Override // android.view.View
    protected final android.os.Parcelable onSaveInstanceState() {
        android.support.v7.widget.RecyclerView.SavedState savedState = new android.support.v7.widget.RecyclerView.SavedState(super.onSaveInstanceState());
        android.support.v7.widget.RecyclerView.SavedState savedState2 = this.f;
        if (savedState2 != null) {
            savedState.a = savedState2.a;
            return savedState;
        }
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            savedState.a = mcVar.P();
            return savedState;
        }
        savedState.a = null;
        return savedState;
    }

    public final boolean onScrollToTop(int i) {
        if (!this.aF || g() == null || !g().ah() || !canScrollVertically(-1)) {
            return false;
        }
        ad(0);
        return true;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        L();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX WARN: Code duplicated, block: B:61:0x0104  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z;
        int i;
        int iMin;
        int i2 = 0;
        if (!this.v && !this.ar) {
            mf mfVar = this.am;
            if (mfVar != null) {
                mfVar.k(motionEvent);
                int action = motionEvent.getAction();
                if (action == 3 || action == 1) {
                    this.am = null;
                }
            } else if (motionEvent.getAction() == 0 || !aO(motionEvent)) {
                defpackage.mc mcVar = this.n;
                if (mcVar != null) {
                    boolean zAg = mcVar.ag();
                    boolean zAh = this.n.ah();
                    if (this.ax == null) {
                        this.ax = android.view.VelocityTracker.obtain();
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionMasked == 0) {
                        int[] iArr = this.aK;
                        iArr[1] = 0;
                        iArr[0] = 0;
                        actionMasked = 0;
                    }
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                    int[] iArr2 = this.aK;
                    motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
                    if (actionMasked != 0) {
                        if (actionMasked == 1) {
                            this.ax.addMovement(motionEventObtain);
                            this.ax.computeCurrentVelocity(1000, this.aD);
                            float f = zAg ? -this.ax.getXVelocity(this.aw) : 0.0f;
                            float f2 = zAh ? -this.ax.getYVelocity(this.aw) : 0.0f;
                            if ((f == 0.0f && f2 == 0.0f) || !ak((int) f, (int) f2)) {
                                ac(0);
                            }
                            aL();
                        } else if (actionMasked == 2) {
                            int iFindPointerIndex = motionEvent.findPointerIndex(this.aw);
                            if (iFindPointerIndex < 0) {
                                android.util.Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.aw + " not found. Did any MotionEvents get skipped?");
                                return false;
                            }
                            float x = motionEvent.getX(iFindPointerIndex) + 0.5f;
                            float y = motionEvent.getY(iFindPointerIndex) + 0.5f;
                            int i3 = (int) x;
                            int i4 = this.aA - i3;
                            int i5 = (int) y;
                            int i6 = this.aB - i5;
                            if (this.F != 1) {
                                if (zAg) {
                                    int i7 = this.aC;
                                    int iMax = i4 > 0 ? java.lang.Math.max(0, i4 - i7) : java.lang.Math.min(0, i4 + i7);
                                    if (iMax != 0) {
                                        i4 = iMax;
                                        zAg = true;
                                    } else {
                                        i4 = iMax;
                                        z = false;
                                        zAg = true;
                                    }
                                    if (zAh) {
                                        i = this.aC;
                                        if (i6 > 0) {
                                            iMin = java.lang.Math.max(0, i6 - i);
                                        } else {
                                            iMin = java.lang.Math.min(0, i6 + i);
                                        }
                                        if (iMin != 0) {
                                            i6 = iMin;
                                            z = true;
                                            zAh = true;
                                        } else {
                                            i6 = iMin;
                                            zAh = true;
                                        }
                                    } else {
                                        zAh = false;
                                    }
                                    if (z) {
                                        ac(1);
                                    }
                                } else {
                                    zAg = false;
                                }
                                z = zAg;
                                if (zAh) {
                                    i = this.aC;
                                    if (i6 > 0) {
                                        iMin = java.lang.Math.max(0, i6 - i);
                                    } else {
                                        iMin = java.lang.Math.min(0, i6 + i);
                                    }
                                    if (iMin != 0) {
                                        i6 = iMin;
                                        z = true;
                                        zAh = true;
                                    } else {
                                        i6 = iMin;
                                        zAh = true;
                                    }
                                } else {
                                    zAh = false;
                                }
                                if (z) {
                                    ac(1);
                                }
                            }
                            boolean z2 = zAg;
                            boolean z3 = zAh;
                            if (this.F == 1) {
                                int[] iArr3 = this.S;
                                iArr3[0] = 0;
                                iArr3[1] = 0;
                                int iA = i4 - a(i4, motionEvent.getY());
                                int iAA = i6 - aA(i6, motionEvent.getX());
                                int i8 = true != z2 ? 0 : iA;
                                int i9 = true != z3 ? 0 : iAA;
                                int[] iArr4 = this.aJ;
                                if (aj(i8, i9, iArr3, iArr4, 0)) {
                                    iA -= iArr3[0];
                                    iAA -= iArr3[1];
                                    iArr2[0] = iArr2[0] + iArr4[0];
                                    iArr2[1] = iArr2[1] + iArr4[1];
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                int i10 = iAA;
                                this.aA = i3 - iArr4[0];
                                this.aB = i5 - iArr4[1];
                                if (ap(true != z2 ? 0 : iA, true != z3 ? 0 : i10, 0, 1, motionEvent, 0)) {
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                }
                                defpackage.lb lbVar = this.L;
                                if (lbVar != null) {
                                    if (iA != 0) {
                                        i2 = iA;
                                    } else if (i10 != 0) {
                                    }
                                    lbVar.a(this, i2, i10);
                                }
                            }
                        } else if (actionMasked == 3) {
                            aC();
                        } else if (actionMasked == 5) {
                            this.aw = motionEvent.getPointerId(actionIndex);
                            int x2 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.aA = x2;
                            this.ay = x2;
                            int y2 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.aB = y2;
                            this.az = y2;
                        } else if (actionMasked == 6) {
                            aG(motionEvent);
                        }
                        motionEventObtain.recycle();
                        return true;
                    }
                    this.aw = motionEvent.getPointerId(0);
                    int x3 = (int) (motionEvent.getX() + 0.5f);
                    this.aA = x3;
                    this.ay = x3;
                    int y3 = (int) (motionEvent.getY() + 0.5f);
                    this.aB = y3;
                    this.az = y3;
                    aM(0);
                    this.ax.addMovement(motionEventObtain);
                    motionEventObtain.recycle();
                    return true;
                }
            }
            aC();
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(android.view.View view, boolean z) {
        defpackage.mr mrVarK = k(view);
        if (mrVarK != null) {
            if (mrVarK.x()) {
                mrVarK.j();
            } else if (!mrVarK.A()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + mrVarK + n());
            }
        }
        view.clearAnimation();
        B(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(android.view.View view, android.view.View view2) {
        if (!this.n.bx(this, view, view2) && view2 != null) {
            aJ(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z) {
        if (android.os.Build.VERSION.SDK_INT < 36 || defpackage.mw.a() < 3700001) {
            return this.n.bf(this, view, rect, z, false);
        }
        android.graphics.Rect rect2 = this.ak;
        if (rect2 == null) {
            rect2 = new android.graphics.Rect();
            this.ak = rect2;
        }
        android.graphics.Rect rect3 = rect2;
        rect3.set(rect);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof defpackage.md) {
            defpackage.md mdVar = (defpackage.md) layoutParams;
            if (!mdVar.e) {
                android.graphics.Rect rect4 = mdVar.d;
                rect3.offset(-view.getScrollX(), -view.getScrollY());
                if (rect3.left <= 0) {
                    rect3.left -= rect4.left;
                }
                if (rect3.right >= view.getWidth()) {
                    rect3.right += rect4.right;
                }
                if (rect3.top <= 0) {
                    rect3.top -= rect4.top;
                }
                if (rect3.bottom >= view.getHeight()) {
                    rect3.bottom += rect4.bottom;
                }
                rect3.offset(view.getScrollX(), view.getScrollY());
            }
        }
        return this.n.bf(this, view, rect3, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        java.util.ArrayList arrayList = this.al;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mf) arrayList.get(i)).c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (!this.t) {
            return super.requestFocus(i, rect);
        }
        removeCallbacks(this.an);
        this.t = false;
        android.view.View viewFd = null;
        if (this.m != null && this.n != null && !ao() && !this.v) {
            z();
            viewFd = this.n.fd(i, this.e, this.N);
        }
        if ((viewFd != null && viewFd.requestFocus(i, rect)) || super.requestFocus(i, rect)) {
            return true;
        }
        this.ap = true;
        try {
            android.view.View viewFocusSearch = super.focusSearch(getRootView().findFocus(), i);
            if (viewFocusSearch != null) {
                viewFocusSearch.requestFocus(i, rect);
            }
            return true;
        } finally {
            this.ap = false;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.aq != 0 || this.v) {
            this.u = true;
        } else {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        defpackage.mc mcVar = this.n;
        if (mcVar == null) {
            android.util.Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.v) {
            return;
        }
        boolean zAg = mcVar.ag();
        boolean zAh = this.n.ah();
        if (!zAg) {
            if (!zAh) {
                return;
            } else {
                zAh = true;
            }
        }
        ap(true != zAg ? 0 : i, true != zAh ? 0 : i2, -1, -1, null, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        android.util.Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!ao()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            this.as |= contentChangeTypes != 0 ? contentChangeTypes : 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void setClipToPadding(boolean z) {
        if (z != this.i) {
            L();
        }
        this.i = z;
        super.setClipToPadding(z);
        if (this.s) {
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public final void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new java.lang.IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public final void setNestedScrollingEnabled(boolean z) {
        aB().a(z);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return aB().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        aB().b(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.v) {
            v("Do not suppressLayout in layout or scroll");
            if (z) {
                long jUptimeMillis = android.os.SystemClock.uptimeMillis();
                onTouchEvent(android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.v = true;
                this.ar = true;
                ah();
                return;
            }
            this.v = false;
            if (this.u && this.n != null && this.m != null) {
                requestLayout();
            }
            this.u = false;
        }
    }

    public final void t(defpackage.mr mrVar) {
        android.view.View view = mrVar.a;
        android.view.ViewParent parent = view.getParent();
        this.e.l(j(view));
        if (mrVar.x()) {
            this.h.g(view, -1, view.getLayoutParams(), true);
            return;
        }
        defpackage.kf kfVar = this.h;
        if (parent != this) {
            kfVar.f(view, -1, true);
            return;
        }
        int iX = kfVar.e.x(view);
        if (iX < 0) {
            java.util.Objects.toString(view);
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide ".concat(view.toString()));
        }
        kfVar.a.e(iX);
        kfVar.i(view);
    }

    public final void u(mf mfVar) {
        this.al.add(mfVar);
    }

    public final void v(java.lang.String str) {
        if (ao()) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling".concat(n()));
        }
        if (this.av > 0) {
            android.util.Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new java.lang.IllegalStateException("".concat(n())));
        }
    }

    final void x() {
        int iB = this.h.b();
        for (int i = 0; i < iB; i++) {
            android.view.View viewE = this.h.e(i);
            defpackage.mr mrVar = viewE == null ? null : ((defpackage.md) viewE.getLayoutParams()).c;
            if (!mrVar.A()) {
                mrVar.g();
            }
        }
        defpackage.mh mhVar = this.e;
        java.util.ArrayList arrayList = mhVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((defpackage.mr) arrayList.get(i2)).g();
        }
        java.util.ArrayList arrayList2 = mhVar.a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((defpackage.mr) arrayList2.get(i3)).g();
        }
        java.util.ArrayList arrayList3 = mhVar.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((defpackage.mr) mhVar.b.get(i4)).g();
            }
        }
    }

    public final void y(int i, int i2) {
        android.widget.EdgeEffect edgeEffect = this.A;
        boolean zIsFinished = false;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A.onRelease();
            zIsFinished = this.A.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.C;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.C.onRelease();
            zIsFinished |= this.C.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.B;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.B.onRelease();
            zIsFinished |= this.B.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.D;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.D.onRelease();
            zIsFinished |= this.D.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public final void z() {
        if (!this.s || this.y) {
            C();
            return;
        }
        if (this.g.k()) {
            if (!this.g.j(4) || this.g.j(11)) {
                if (this.g.k()) {
                    C();
                    return;
                }
                return;
            }
            ae();
            Q();
            this.g.f();
            if (!this.u) {
                int iA = this.h.a();
                for (int i = 0; i < iA; i++) {
                    defpackage.mr mrVarK = k(this.h.d(i));
                    if (mrVarK != null && !mrVarK.A() && mrVarK.y()) {
                        C();
                    }
                }
                this.g.c();
            }
            af(true);
            R(true);
        }
    }

    @Override // android.view.ViewGroup
    public final android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        defpackage.mc mcVar = this.n;
        if (mcVar != null) {
            return mcVar.fc(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager".concat(n()));
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130970264);
    }

    public RecyclerView(android.content.Context context) {
        this(context, null);
    }
}
