package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class czl extends android.view.ViewGroup {
    private defpackage.bvi d;
    private defpackage.afer e;
    private boolean f;
    private boolean g;
    private java.lang.ref.WeakReference st;
    private android.os.IBinder su;
    private defpackage.bvh sv;

    public czl(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        defpackage.cjp cjpVar = new defpackage.cjp(this, 2);
        addOnAttachStateChangeListener(cjpVar);
        defpackage.izq izqVar = new defpackage.izq(this, null);
        ((java.util.ArrayList) defpackage.ebl.x(this).a).add(izqVar);
        this.e = new defpackage.axl(this, cjpVar, izqVar, 6);
    }

    private final defpackage.bvi a() {
        defpackage.bvi bviVar;
        defpackage.bvi bviVarB = this.d;
        if (bviVarB == null) {
            bviVarB = defpackage.dcw.b(this);
            defpackage.bvi bviVar2 = null;
            if (bviVarB != null) {
                n(bviVarB);
            } else {
                bviVarB = null;
            }
            if (bviVarB == null) {
                java.lang.ref.WeakReference weakReference = this.st;
                if (weakReference != null && (bviVar = (defpackage.bvi) weakReference.get()) != null && true == o(bviVar)) {
                    bviVar2 = bviVar;
                }
                if (bviVar2 != null) {
                    return bviVar2;
                }
                defpackage.bxt bxtVarD = defpackage.dcw.d(this);
                n(bxtVarD);
                return bxtVarD;
            }
        }
        return bviVarB;
    }

    private final defpackage.dbi k(android.view.View view, defpackage.dbi dbiVar) {
        defpackage.bvi bviVarA = a();
        defpackage.eqg eqgVarC = defpackage.edd.c(view);
        defpackage.esa esaVarH = defpackage.epv.h(view);
        defpackage.fbm fbmVarF = defpackage.ebq.f(view);
        if (bviVarA == dbiVar.a() && eqgVarC == dbiVar.b() && esaVarH == dbiVar.c() && fbmVarF == dbiVar.d()) {
            return dbiVar;
        }
        if (bviVarA.d() != dbiVar.a().d()) {
            e();
        }
        if (eqgVarC == null) {
            eqgVarC = dbiVar.b();
        }
        defpackage.eqg eqgVar = eqgVarC;
        if (fbmVarF == null) {
            fbmVarF = dbiVar.d();
        }
        defpackage.dbi dbiVar2 = new defpackage.dbi(dbiVar, view, bviVarA, eqgVar, fbmVarF, esaVarH);
        view.setTag(2131427501, new java.lang.ref.WeakReference(dbiVar2));
        return dbiVar2;
    }

    private final void l() {
        if (this.f) {
            return;
        }
        throw new java.lang.UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00ec A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:6:0x0008, B:15:0x0023, B:17:0x002d, B:20:0x0039, B:24:0x0042, B:25:0x0049, B:26:0x004a, B:29:0x0053, B:33:0x005c, B:34:0x0063, B:35:0x0064, B:38:0x006d, B:41:0x0075, B:43:0x0092, B:45:0x00ac, B:46:0x00ce, B:48:0x00d4, B:50:0x00dc, B:53:0x00e2, B:57:0x00ec, B:58:0x00fa, B:60:0x0108, B:62:0x010d, B:63:0x0125, B:54:0x00e6, B:42:0x008e, B:9:0x0011, B:11:0x0019, B:14:0x001f), top: B:72:0x0008, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0108 A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:6:0x0008, B:15:0x0023, B:17:0x002d, B:20:0x0039, B:24:0x0042, B:25:0x0049, B:26:0x004a, B:29:0x0053, B:33:0x005c, B:34:0x0063, B:35:0x0064, B:38:0x006d, B:41:0x0075, B:43:0x0092, B:45:0x00ac, B:46:0x00ce, B:48:0x00d4, B:50:0x00dc, B:53:0x00e2, B:57:0x00ec, B:58:0x00fa, B:60:0x0108, B:62:0x010d, B:63:0x0125, B:54:0x00e6, B:42:0x008e, B:9:0x0011, B:11:0x0019, B:14:0x001f), top: B:72:0x0008, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x010d A[Catch: all -> 0x0138, TryCatch #0 {, blocks: (B:6:0x0008, B:15:0x0023, B:17:0x002d, B:20:0x0039, B:24:0x0042, B:25:0x0049, B:26:0x004a, B:29:0x0053, B:33:0x005c, B:34:0x0063, B:35:0x0064, B:38:0x006d, B:41:0x0075, B:43:0x0092, B:45:0x00ac, B:46:0x00ce, B:48:0x00d4, B:50:0x00dc, B:53:0x00e2, B:57:0x00ec, B:58:0x00fa, B:60:0x0108, B:62:0x010d, B:63:0x0125, B:54:0x00e6, B:42:0x008e, B:9:0x0011, B:11:0x0019, B:14:0x001f), top: B:72:0x0008, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x000f  */
    private final void m() {
        defpackage.dbi dbiVarP;
        defpackage.dbi dbiVarK;
        defpackage.czz czzVar;
        defpackage.dcx dcxVar;
        defpackage.esa esaVar;
        if (this.sv == null) {
            try {
                this.f = true;
                if (getChildCount() == 0) {
                    dbiVarP = null;
                } else {
                    android.view.View childAt = getChildAt(0);
                    defpackage.czz czzVar2 = childAt instanceof defpackage.czz ? (defpackage.czz) childAt : null;
                    if (czzVar2 != null) {
                        dbiVarP = czzVar2.P();
                    } else {
                        dbiVarP = null;
                    }
                }
                android.view.View viewD = defpackage.day.d(this);
                defpackage.dbi dbiVarE = defpackage.day.e(viewD);
                if (dbiVarE == null) {
                    defpackage.bvi bviVarA = a();
                    defpackage.eqg eqgVarC = defpackage.edd.c(viewD);
                    if (eqgVarC == null) {
                        eqgVarC = dbiVarP != null ? dbiVarP.b() : null;
                        if (eqgVarC == null) {
                            throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
                        }
                    }
                    defpackage.eqg eqgVar = eqgVarC;
                    defpackage.fbm fbmVarF = defpackage.ebq.f(viewD);
                    if (fbmVarF == null) {
                        fbmVarF = dbiVarP != null ? dbiVarP.d() : null;
                        if (fbmVarF == null) {
                            throw new java.lang.IllegalStateException("Composed into the View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                        }
                    }
                    defpackage.fbm fbmVar = fbmVarF;
                    defpackage.esa esaVarH = defpackage.epv.h(viewD);
                    if (esaVarH != null) {
                        esaVar = esaVarH;
                    } else if (dbiVarP != null) {
                        esaVarH = dbiVarP.c();
                        esaVar = esaVarH;
                    } else {
                        esaVar = null;
                    }
                    dbiVarK = new defpackage.dbi(defpackage.day.e(defpackage.day.d(viewD)), viewD, bviVarA, eqgVar, fbmVar, esaVar);
                    viewD.setTag(2131427501, new java.lang.ref.WeakReference(dbiVarK));
                } else {
                    dbiVarK = k(viewD, dbiVarE);
                }
                defpackage.ccz cczVar = new defpackage.ccz(1003123809, true, new defpackage.cvi(this, 6));
                android.view.ViewGroup.LayoutParams layoutParams = defpackage.dcz.a;
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean = defpackage.dbq.a;
                if (defpackage.dbq.a.compareAndSet(false, true)) {
                    aiyk aiykVarQ = defpackage.afqt.q(1, 0, 6);
                    ahoc.d(ahoi.b((defpackage.afdo) defpackage.dap.a.a()), (defpackage.afdo) null, 0, new defpackage.dbp(aiykVarQ, null), 3);
                    defpackage.bzd.j(new defpackage.dbj(aiykVarQ, 5));
                }
                if (getChildCount() > 0) {
                    android.view.View childAt2 = getChildAt(0);
                    czzVar = childAt2 instanceof defpackage.czz ? (defpackage.czz) childAt2 : null;
                    if (czzVar != null) {
                        czzVar.W(dbiVarK);
                    }
                    if (czzVar == null) {
                        czzVar = new defpackage.czz(getContext(), dbiVarK);
                        addView(czzVar, defpackage.dcz.a);
                    }
                    czzVar.W(dbiVarK);
                    java.lang.Object tag = czzVar.getTag(2131429910);
                    dcxVar = tag instanceof defpackage.dcx ? (defpackage.dcx) tag : null;
                    if (dcxVar == null) {
                        dcxVar = new defpackage.dcx(czzVar, new defpackage.bvk(dbiVarK.a(), new defpackage.czi(czzVar.o)));
                        czzVar.setTag(2131429910, dcxVar);
                    }
                    dcxVar.e(cczVar);
                    czzVar.I = new defpackage.dcy(dbiVarK.a());
                    this.sv = dcxVar;
                    this.f = false;
                }
                removeAllViews();
                czzVar = null;
                if (czzVar == null) {
                    czzVar = new defpackage.czz(getContext(), dbiVarK);
                    addView(czzVar, defpackage.dcz.a);
                }
                czzVar.W(dbiVarK);
                java.lang.Object tag2 = czzVar.getTag(2131429910);
                if (tag2 instanceof defpackage.dcx) {
                }
                if (dcxVar == null) {
                    dcxVar = new defpackage.dcx(czzVar, new defpackage.bvk(dbiVarK.a(), new defpackage.czi(czzVar.o)));
                    czzVar.setTag(2131429910, dcxVar);
                }
                dcxVar.e(cczVar);
                czzVar.I = new defpackage.dcy(dbiVarK.a());
                this.sv = dcxVar;
                this.f = false;
            } catch (java.lang.Throwable th) {
                this.f = false;
                throw th;
            }
        }
    }

    private final void n(defpackage.bvi bviVar) {
        if (true != o(bviVar)) {
            bviVar = null;
        }
        if (bviVar != null) {
            this.st = new java.lang.ref.WeakReference(bviVar);
        }
    }

    private static final boolean o(defpackage.bvi bviVar) {
        return !(bviVar instanceof defpackage.bxt) || ((defpackage.bxo) ((defpackage.bxt) bviVar).l.b()).compareTo(defpackage.bxo.b) > 0;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        l();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        l();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public abstract void b(defpackage.bve bveVar, int i);

    public final void c() {
        if (isAttachedToWindow()) {
            android.os.IBinder windowToken = getWindowToken();
            defpackage.czz czzVar = null;
            if (this.su != windowToken) {
                this.su = windowToken;
                this.st = null;
            }
            if (getChildCount() != 0) {
                android.view.View childAt = getChildAt(0);
                if (childAt instanceof defpackage.czz) {
                    czzVar = (defpackage.czz) childAt;
                }
            }
            if (czzVar != null) {
                czzVar.W(k(defpackage.day.d(this), czzVar.P()));
            }
            if (i()) {
                m();
            }
        }
    }

    public final void d() {
        if (this.d == null && !isAttachedToWindow()) {
            throw new java.lang.IllegalStateException("createComposition requires a previous call to createComposition(ComposeViewContext), a parent reference, or the View to be attached to a window. Attach the View or call setParentCompositionReference.");
        }
        m();
    }

    public final void e() {
        android.view.View childAt = getChildAt(0);
        if (childAt instanceof defpackage.czz) {
        }
        defpackage.bvh bvhVar = this.sv;
        if (bvhVar != null) {
            bvhVar.d();
        }
        this.sv = null;
        requestLayout();
    }

    public final void ey(defpackage.bvi bviVar) {
        if (this.d != bviVar) {
            this.d = bviVar;
            if (bviVar != null) {
                this.st = null;
            }
            defpackage.bvh bvhVar = this.sv;
            if (bvhVar != null) {
                bvhVar.d();
                this.sv = null;
                if (isAttachedToWindow()) {
                    m();
                }
            }
        }
    }

    public void f(boolean z, int i, int i2, int i3, int i4) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public void g(int i, int i2) {
        android.view.View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), android.view.View.MeasureSpec.getMode(i)), android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(0, (android.view.View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), android.view.View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    protected boolean i() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.g || super.isTransitionGroup();
    }

    public final void j() {
        defpackage.afer cewVar;
        defpackage.afer aferVar = this.e;
        if (aferVar != null) {
            aferVar.invoke();
        }
        if (isAttachedToWindow()) {
            defpackage.eqg eqgVarC = defpackage.edd.c(this);
            if (eqgVarC == null) {
                defpackage.csc.a(defpackage.a.bl(this, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new defpackage.afap();
            }
            cewVar = defpackage.dax.c(this, eqgVarC.getLifecycle());
        } else {
            defpackage.afgv afgvVar = new defpackage.afgv();
            defpackage.dcr dcrVar = new defpackage.dcr(this, afgvVar, 1);
            addOnAttachStateChangeListener(dcrVar);
            afgvVar.a = new defpackage.bxn(this, dcrVar, 4);
            cewVar = new defpackage.cew(afgvVar, 18);
        }
        this.e = cewVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (defpackage.dcw.a(this).getParent() == null) {
            getHandler().postAtFrontOfQueue(new defpackage.ku(this, 14, null));
        } else {
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        f(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        m();
        g(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        android.view.View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.g = true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        l();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams, boolean z) {
        l();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        l();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        l();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        l();
        super.addView(view, layoutParams);
    }

    public czl(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public czl(android.content.Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ czl(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, defpackage.affu affuVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
