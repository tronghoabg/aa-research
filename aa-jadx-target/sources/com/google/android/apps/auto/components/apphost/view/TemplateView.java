package com.google.android.apps.auto.components.apphost.view;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class TemplateView extends hlo implements defpackage.epl {
    public static final defpackage.yqm h = defpackage.yqm.c("CarApp.H");
    public static boolean i;
    private android.view.WindowInsets A;
    private java.lang.Boolean B;
    private final up C;
    public boolean j;
    public com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView k;
    public final kbq l;
    public final lzl m;
    public gha n;
    public boolean o;
    public final android.os.Handler p;
    public final defpackage.eqs q;
    private com.android.car.libraries.apphost.view.SurfaceViewContainer r;
    private com.android.car.libraries.apphost.view.TextureViewContainer s;
    private android.widget.FrameLayout t;
    private final int u;
    private com.android.car.libraries.apphost.view.MicrophoneRecordingView v;
    private wi w;
    private final defpackage.eqt x;
    private boolean y;
    private android.view.WindowInsets z;

    public TemplateView(android.content.Context context, android.util.AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.C = new up((byte[]) null);
        lzl lzlVar = new lzl();
        this.m = lzlVar;
        this.x = new defpackage.hlm(this, 9);
        this.q = new defpackage.eqs();
        this.y = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970860});
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ((lzi) lzlVar).a = defpackage.omf.u();
        lzlVar.g(new kbn(this));
        this.l = new kbq(lzlVar);
        this.p = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    private static final boolean r(gfa gfaVar) {
        gso gsoVarL;
        return (gfaVar == null || (gsoVarL = gfaVar.l(gso.class)) == null || !gsoVarL.c()) ? false : true;
    }

    @Override // defpackage.epl
    public final void eF(defpackage.eqg eqgVar) {
        defpackage.ngl.a().k.eM(eqgVar, this.x);
    }

    protected final int g() {
        return this.u;
    }

    protected final android.view.View h() {
        return this.j ? this.s : this.r;
    }

    protected final android.view.ViewGroup i() {
        return this.t;
    }

    public final com.android.car.libraries.apphost.view.MicrophoneRecordingView j() {
        com.android.car.libraries.apphost.view.MicrophoneRecordingView microphoneRecordingView = this.v;
        microphoneRecordingView.getClass();
        return microphoneRecordingView;
    }

    public final void k(android.view.WindowInsets windowInsets) {
        int systemWindowInsetLeft;
        int systemWindowInsetRight;
        boolean zEquals = j$.util.Objects.equals(this.A, windowInsets);
        boolean zR = r(((hlo) this).c);
        java.lang.Boolean bool = this.B;
        boolean z = false;
        if (bool != null && zR != bool.booleanValue()) {
            z = true;
        }
        this.B = java.lang.Boolean.valueOf(zR);
        if ((zEquals || !z) && this.z == null) {
            this.A = windowInsets;
            super.k(windowInsets);
        } else {
            this.z = windowInsets;
        }
        com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView speedbumpView = this.k;
        if (speedbumpView != null) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                android.graphics.Insets insetsM = bgp$.ExternalSyntheticApiModelOutline0.m(windowInsets, bgp$.ExternalSyntheticApiModelOutline0.m() | bgp$.ExternalSyntheticApiModelOutline0.m$1());
                systemWindowInsetLeft = alh$.ExternalSyntheticApiModelOutline0.m(insetsM);
                systemWindowInsetRight = alh$.ExternalSyntheticApiModelOutline0.m$1(insetsM);
            } else {
                systemWindowInsetLeft = windowInsets.getSystemWindowInsetLeft();
                systemWindowInsetRight = windowInsets.getSystemWindowInsetRight();
            }
            speedbumpView.setPadding(systemWindowInsetLeft, speedbumpView.getPaddingTop(), systemWindowInsetRight, speedbumpView.getPaddingBottom());
        }
    }

    protected final up n() {
        return this.C;
    }

    public final hlt o() {
        return this.j ? this.s : this.r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.epy epyVar = ((hlo) this).b;
        if (epyVar != null) {
            epyVar.c(this.l);
            epyVar.c(this);
        }
        this.y = true;
        if (this.w != null) {
            this.q.j(java.lang.Boolean.TRUE);
        }
        this.o = true;
        this.p.post(new jyr(this, 7));
        getViewTreeObserver().addOnGlobalFocusChangeListener(new hlk(this, 2, (byte[]) null));
    }

    public final void onDetachedFromWindow() {
        defpackage.epy epyVar = ((hlo) this).b;
        if (epyVar != null) {
            epyVar.d(this.l);
            epyVar.d(this);
        }
        this.y = false;
        this.q.j(java.lang.Boolean.FALSE);
        defpackage.ngl.a().k.k(this.x);
        this.o = false;
        super.onDetachedFromWindow();
    }

    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.r = findViewById(2131429638);
        this.s = findViewById(2131429761);
        if (defpackage.lem.a().b()) {
            this.r.d();
            this.s.setAlpha(0.0f);
        }
        this.t = (android.widget.FrameLayout) findViewById(2131429721);
        com.google.android.apps.auto.components.ui.speedbump.SpeedbumpView speedbumpViewFindViewById = findViewById(2131429553);
        this.k = speedbumpViewFindViewById;
        speedbumpViewFindViewById.f = this.t;
        this.v = findViewById(2131428885);
    }

    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        gfa gfaVar = ((hlo) this).c;
        if (gfaVar != null) {
            gfaVar.F(giv.class).a();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0307  */
    /* JADX WARN: Code duplicated, block: B:143:0x0326  */
    /* JADX WARN: Code duplicated, block: B:146:0x0334  */
    /* JADX WARN: Code duplicated, block: B:147:0x0336  */
    /* JADX WARN: Code duplicated, block: B:149:0x033c  */
    /* JADX WARN: Code duplicated, block: B:157:0x037a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0392  */
    /* JADX WARN: Code duplicated, block: B:184:0x043f  */
    /* JADX WARN: Code duplicated, block: B:187:0x044a  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31 */
    public final void p(androidx.car.app.model.TemplateWrapper templateWrapper, boolean z) {
        boolean z2;
        androidx.car.app.model.TemplateWrapper templateWrapperCopyOf;
        android.view.WindowInsets windowInsets;
        int i2;
        int i3;
        int i4;
        int i5;
        long integer;
        android.view.View viewE;
        android.view.View view;
        int i6;
        ?? F;
        gfb.b();
        gfa gfaVar = ((hlo) this).c;
        gfaVar.getClass();
        boolean z3 = gfaVar.b().getDisplayType() == 0 || gfaVar.b().getDisplayType() == 1;
        if (!gfaVar.F(ggq.class).f()) {
            if (templateWrapper.getTemplate() instanceof androidx.car.app.navigation.model.MapWithContentTemplate) {
                androidx.car.app.navigation.model.MapWithContentTemplate template = templateWrapper.getTemplate();
                if (gfaVar.i().c() >= 7 && (template.getContentTemplate() instanceof androidx.car.app.model.MessageTemplate)) {
                    z2 = true;
                }
            }
            z2 = false;
        } else if ((templateWrapper.getTemplate() instanceof androidx.car.app.navigation.model.MapWithContentTemplate) || (templateWrapper.getTemplate() instanceof androidx.car.app.navigation.model.PlaceListNavigationTemplate) || (templateWrapper.getTemplate() instanceof androidx.car.app.model.PlaceListMapTemplate) || (templateWrapper.getTemplate() instanceof androidx.car.app.navigation.model.MapTemplate) || (templateWrapper.getTemplate() instanceof androidx.car.app.navigation.model.RoutePreviewNavigationTemplate)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z3 && r(gfaVar) && gfaVar.d().b && !z2) {
            androidx.car.app.navigation.model.NavigationTemplate template2 = templateWrapper.getTemplate();
            templateWrapperCopyOf = androidx.car.app.model.TemplateWrapper.copyOf(templateWrapper);
            if (template2 instanceof androidx.car.app.navigation.model.NavigationTemplate) {
                templateWrapperCopyOf.setTemplate(new com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateNavigationTemplate(template2));
            } else if (gfaVar.F(ggq.class).f()) {
                templateWrapperCopyOf.setTemplate(new gsp(template2));
            } else {
                templateWrapperCopyOf.setTemplate(new com.google.android.apps.auto.components.apphost.template.gearhead.MinimizedStateMapBasedTemplate(template2));
            }
        } else {
            templateWrapperCopyOf = templateWrapper;
        }
        this.w = templateWrapperCopyOf.getTemplate();
        q();
        gha ghaVar = this.n;
        ghaVar.getClass();
        ghaVar.c(this.w);
        gfb.b();
        gfa gfaVar2 = ((hlo) this).c;
        gfaVar2.getClass();
        gnq gnqVarL = gfaVar2.l(gnq.class);
        gnqVarL.getClass();
        gnqVarL.d.b();
        gfaVar2.e().a("Emitter");
        try {
            androidx.car.app.model.TemplateWrapper templateWrapperB = defpackage.hmn.a.b(gfaVar2, templateWrapperCopyOf);
            boolean zM = hlo.m(gfaVar2);
            templateWrapperB.setTemplate(defpackage.gvt.b(templateWrapperB.getTemplate(), gfaVar2, zM ? gzl.d : gzl.a));
            hlu hluVar = ((hlo) this).a;
            if (hluVar != null) {
                int i7 = (zM ? 1 : 0) ^ (hluVar.D() == gzl.d ? 1 : 0);
                gzj template3 = templateWrapperB.getTemplate();
                int i8 = !z ? 1 : 0;
                if (template3 instanceof gzj) {
                    gzj gzjVar = template3;
                    gzj gzjVarC = hluVar.C();
                    i2 = 0;
                    if (gzjVarC instanceof gzj) {
                        F = defpackage.afga.f(gzjVarC.b.getClass(), gzjVar.b.getClass());
                    } else {
                        F = 0;
                    }
                    i6 = i8 & F;
                } else {
                    i2 = 0;
                    i6 = i8;
                }
                int i9 = (hluVar.C().getClass().equals(template3.getClass()) ? 1 : 0) & i6 & ((templateWrapperB.isRefresh() || hluVar.en()) ? 1 : i2);
                if (!hluVar.em()) {
                    i9 &= i7 ^ 1;
                }
                gfa gfaVar3 = ((hlo) this).c;
                gfaVar3.getClass();
                gfaVar3.F(ggq.class).O();
                ajku ajkuVar = ((hlo) this).g;
                ajkuVar.getClass();
                int iL = ajku.l((android.content.Context) ajkuVar.b);
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(ajkuVar.a);
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(iL);
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[i2] = numValueOf;
                objArr[1] = numValueOf2;
                gnb.c("CarApp.H", "Last night mode %d, new night mode %d", objArr);
                if ((i9 & ((iL != ajkuVar.a ? 1 : i2) ^ 1)) != 0) {
                    defpackage.ysr.bj(hluVar.C().getClass().equals(templateWrapperB.getTemplate().getClass()));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i2] = hluVar;
                    gnb.c("CarApp.H.Tem", "Updating presenter: %s", objArr2);
                    hluVar.el(templateWrapperB);
                    gnq gnqVarL2 = gfaVar2.l(gnq.class);
                    gnqVarL2.getClass();
                    gnqVarL2.a();
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    objArr3[i2] = hluVar;
                    gnb.c("CarApp.H.Tem", "Pausing presenter: %s", objArr3);
                    if (hluVar.getLifecycle().a().a(defpackage.epx.e)) {
                        hluVar.A();
                    }
                    hlo.l(hluVar);
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    objArr4[i2] = hluVar;
                    gnb.c("CarApp.H.Tem", "Destroying presenter: %s", objArr4);
                    hluVar.b();
                    ((hlo) this).a = null;
                }
                windowInsets = this.z;
                if (windowInsets != null) {
                    this.A = windowInsets;
                    super.k(windowInsets);
                    this.z = null;
                }
                if (this.y) {
                    this.q.j(java.lang.Boolean.TRUE);
                }
            }
            i2 = 0;
            gfa gfaVar4 = ((hlo) this).c;
            if (gfaVar4 == null) {
                throw new java.lang.IllegalStateException("templateContext is null when attempting to create a presenter");
            }
            hlu hluVarB = hlo.m(gfaVar4) ? defpackage.hlw.a.b(((hlo) this).c, templateWrapperB, gzl.d) : defpackage.hlw.a.a(((hlo) this).c, templateWrapperB);
            if (hluVarB == null) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                objArr5[i2] = templateWrapperB.getTemplate().getClass().getSimpleName();
                gnb.k("CarApp.H.Tem", "No presenter available for template type: %s", objArr5);
                hluVarB = null;
            } else {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                objArr6[i2] = hluVarB;
                gnb.c("CarApp.H.Tem", "Creating new presenter: %s", objArr6);
                hluVarB.F();
                android.view.WindowInsets windowInsets2 = ((hlo) this).d;
                if (windowInsets2 != null) {
                    hluVarB.z(windowInsets2, g());
                }
            }
            ((hlo) this).a = hluVarB;
            if (hluVarB != null) {
                up upVarN = n();
                android.view.ViewGroup viewGroupI = i();
                android.view.View viewH = h();
                gzl gzlVarD = hluVarB.D();
                gzl gzlVar = gzl.a;
                if (hluVar != null) {
                    i3 = hluVar.D() == gzlVar ? 1 : i2;
                } else {
                    i3 = 1;
                    hluVar = null;
                }
                int i10 = gzlVarD == gzlVar ? 1 : i2;
                gzl gzlVarD2 = hluVarB.D();
                gzl gzlVar2 = gzl.d;
                if ((gzlVarD2 == gzlVar2 || (hluVar != null && hluVar.D() == gzlVar2)) && hluVar != null && i10 == 0) {
                    if (i3 == 0) {
                        gob gobVar = hluVar instanceof gob ? (gob) hluVar : null;
                        if (hluVarB instanceof gob) {
                            gobVar = (gob) hluVarB;
                        }
                        ?? r2 = gobVar == null ? i2 : gobVar.C().a.getContentTemplate() instanceof androidx.car.app.model.MessageTemplate;
                        if (hluVar.D() == gzl.c) {
                            i4 = 1 != r2 ? 2132279299 : 2132279300;
                        } else {
                            i4 = 1 != r2 ? 2132279304 : 2132279305;
                        }
                        up.c(viewGroupI, hluVarB, i4);
                    } else {
                        i3 = 1;
                        if (i10 == 0 || i3 != 0) {
                            android.content.res.TypedArray typedArrayObtainStyledAttributes = viewGroupI.getContext().obtainStyledAttributes(new int[]{2130970897});
                            i5 = i2;
                            integer = typedArrayObtainStyledAttributes.getInteger(i5, i5);
                            typedArrayObtainStyledAttributes.recycle();
                            if (hluVarB.ek()) {
                                viewH.setVisibility(i5);
                                upVarN.a++;
                            }
                            android.view.View viewE2 = hluVarB.e();
                            if (hluVar == null) {
                                viewE = null;
                            } else {
                                viewE = hluVar.e();
                            }
                            if (viewE != null || android.os.Build.VERSION.SDK_INT != 28 || viewE.getMeasuredWidth() <= 0 || viewE.getMeasuredHeight() <= 0) {
                                view = viewE;
                            } else {
                                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(viewE.getMeasuredWidth(), viewE.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                                viewE.draw(new android.graphics.Canvas(bitmapCreateBitmap));
                                android.widget.ImageView imageView = new android.widget.ImageView(viewGroupI.getContext());
                                imageView.setImageBitmap(bitmapCreateBitmap);
                                viewGroupI.removeView(viewE);
                                viewGroupI.addView(imageView);
                                view = imageView;
                            }
                            viewE2.setAlpha(0.0f);
                            viewGroupI.addView(viewE2);
                            viewE2.animate().alpha(1.0f).setDuration(integer);
                            if (view != null) {
                                android.view.ViewPropertyAnimator duration = view.animate().alpha(0.0f).setDuration(integer);
                                duration.setListener(new kbr(upVarN, hluVar, viewH, viewGroupI, view, duration));
                            }
                        } else {
                            up.c(viewGroupI, hluVarB, 2132279298);
                        }
                    }
                } else if (i10 == 0) {
                    android.content.res.TypedArray typedArrayObtainStyledAttributes2 = viewGroupI.getContext().obtainStyledAttributes(new int[]{2130970897});
                    i5 = i2;
                    integer = typedArrayObtainStyledAttributes2.getInteger(i5, i5);
                    typedArrayObtainStyledAttributes2.recycle();
                    if (hluVarB.ek()) {
                        viewH.setVisibility(i5);
                        upVarN.a++;
                    }
                    android.view.View viewE3 = hluVarB.e();
                    if (hluVar == null) {
                        viewE = null;
                    } else {
                        viewE = hluVar.e();
                    }
                    if (viewE != null) {
                        view = viewE;
                    } else {
                        view = viewE;
                    }
                    viewE3.setAlpha(0.0f);
                    viewGroupI.addView(viewE3);
                    viewE3.animate().alpha(1.0f).setDuration(integer);
                    if (view != null) {
                        android.view.ViewPropertyAnimator duration2 = view.animate().alpha(0.0f).setDuration(integer);
                        duration2.setListener(new kbr(upVarN, hluVar, viewH, viewGroupI, view, duration2));
                    }
                } else {
                    android.content.res.TypedArray typedArrayObtainStyledAttributes3 = viewGroupI.getContext().obtainStyledAttributes(new int[]{2130970897});
                    i5 = i2;
                    integer = typedArrayObtainStyledAttributes3.getInteger(i5, i5);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (hluVarB.ek()) {
                        viewH.setVisibility(i5);
                        upVarN.a++;
                    }
                    android.view.View viewE4 = hluVarB.e();
                    if (hluVar == null) {
                        viewE = null;
                    } else {
                        viewE = hluVar.e();
                    }
                    if (viewE != null) {
                        view = viewE;
                    } else {
                        view = viewE;
                    }
                    viewE4.setAlpha(0.0f);
                    viewGroupI.addView(viewE4);
                    viewE4.animate().alpha(1.0f).setDuration(integer);
                    if (view != null) {
                        android.view.ViewPropertyAnimator duration3 = view.animate().alpha(0.0f).setDuration(integer);
                        duration3.setListener(new kbr(upVarN, hluVar, viewH, viewGroupI, view, duration3));
                    }
                }
            } else {
                h().setVisibility(8);
                android.view.View viewE5 = hluVar == null ? null : hluVar.e();
                if (viewE5 != null) {
                    i().removeView(viewE5);
                }
            }
            if (hluVarB != null) {
                defpackage.epy epyVar = ((hlo) this).b;
                if (epyVar != null) {
                    defpackage.epx epxVarA = epyVar.a();
                    if (epxVarA.a(defpackage.epx.d)) {
                        hluVarB.c();
                    }
                    if (epxVarA.a(defpackage.epx.e)) {
                        hluVarB.B();
                    }
                }
                hluVarB.K();
            }
            ajku ajkuVar2 = ((hlo) this).g;
            ajkuVar2.a = ajku.l((android.content.Context) ajkuVar2.b);
            gnqVarL.d.c();
            windowInsets = this.z;
            if (windowInsets != null) {
                this.A = windowInsets;
                super.k(windowInsets);
                this.z = null;
            }
            if (this.y) {
                this.q.j(java.lang.Boolean.TRUE);
            }
        } catch (gwn e) {
            gfaVar2.k().c(gfaVar2.d().a, gnr.e, gnz.a(new androidx.car.app.FailureResponse(e)));
            geh gehVarF = gfaVar2.f();
            gdv gdvVar = new gdv();
            gdvVar.a = e;
            gdvVar.e = 5;
            gehVarF.a(new gdw(gdvVar));
        }
    }

    public final void q() {
        boolean z;
        boolean zI = defpackage.acpd.I();
        wi wiVar = this.w;
        if (zI) {
            z = wiVar != null && ghr.d(wiVar.getClass());
        } else {
            z = wiVar instanceof androidx.car.app.navigation.model.NavigationTemplate;
        }
        boolean zBooleanValue = ((java.lang.Boolean) defpackage.ngl.a().k.e()).booleanValue();
        if (z || !zBooleanValue) {
            ((defpackage.yqj) h.l().ai(2902)).Q("Moderator OFF. isModerationExempt=%b, canInterrupt=%b", z, zBooleanValue);
            this.m.m();
        } else {
            ((defpackage.yqj) h.l().ai(2903)).Q("Moderator ON. isModerationExempt=%b, canInterrupt=%b", false, true);
            this.m.l();
        }
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eD(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eE(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eG(defpackage.eqg eqgVar) {
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eT(defpackage.eqg eqgVar) {
    }

    public TemplateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TemplateView(android.content.Context context) {
        this(context, null);
    }
}
