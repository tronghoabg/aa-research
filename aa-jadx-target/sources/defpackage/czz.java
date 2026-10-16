package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class czz extends android.view.ViewGroup implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener, android.view.ViewTreeObserver.OnTouchModeChangeListener, defpackage.cyu, defpackage.cjf, defpackage.cqp, defpackage.epl, defpackage.cyr, defpackage.cig, defpackage.dem {
    public static java.lang.Class a;
    public static java.lang.reflect.Method b;
    public static java.lang.reflect.Method c;
    public static java.lang.Runnable d;
    public static java.lang.reflect.Method e;
    public static java.lang.reflect.Method f;
    public final float[] A;
    public final float[] B;
    public defpackage.affc C;
    public final defpackage.cvz D;
    public android.view.MotionEvent E;
    public long F;
    public boolean G;
    public final defpackage.afer H;
    public defpackage.dcy I;
    public final defpackage.cik J;
    public final defpackage.czy K;
    public final defpackage.zo M;
    public final defpackage.aan N;
    public defpackage.aan O;
    public final defpackage.cjq P;
    public final defpackage.cgp Q;
    public final defpackage.bgf R;
    public defpackage.daw T;
    public final defpackage.bil U;
    public final defpackage.khb V;
    public final defpackage.mku W;
    private float aA;
    private float aB;
    private float aC;
    private final java.lang.Runnable aD;
    private defpackage.affg aE;
    private final defpackage.dbt aF;
    private final defpackage.afer aG;
    private boolean aH;
    private boolean aI;
    private android.view.View aJ;
    private final defpackage.aan aK;
    private final defpackage.cif aL;
    private defpackage.fbl aM;
    private final defpackage.kwv aN;
    private defpackage.kwv aO;
    public defpackage.sr aa;
    public defpackage.kwv ab;
    private final defpackage.bwx ac;
    private long ad;
    private final boolean ae;
    private defpackage.dbz af;
    private final java.lang.Runnable ag;
    private final defpackage.bwx ah;
    private android.view.View ai;
    private boolean aj;
    private final defpackage.cqr ak;
    private final defpackage.bwx al;
    private defpackage.dlm am;
    private boolean an;
    private long ao;
    private final int[] ap;
    private final float[] aq;
    private final android.graphics.Matrix ar;
    private long as;
    private boolean at;
    private long au;
    private defpackage.dkf av;
    private final java.util.concurrent.atomic.AtomicReference aw;
    private final defpackage.bwx ax;
    private final defpackage.bwx ay;
    private float az;
    public defpackage.dbn g;
    public defpackage.cdo h;
    public final defpackage.afbz i;
    public defpackage.afdo j;
    public final defpackage.cgz k;
    public final defpackage.bwx l;
    public final defpackage.bys m;
    public final defpackage.csx n;
    public final defpackage.cxl o;
    public final defpackage.dep p;
    public final defpackage.dah q;
    public final defpackage.cgx r;
    public boolean s;
    public final defpackage.bys t;
    public final defpackage.cgl u;
    public boolean v;
    public final defpackage.cyx w;
    public boolean x;
    public defpackage.dau y;
    public final defpackage.cxy z;
    public static final defpackage.dai S = new defpackage.dai();
    public static final defpackage.aan L = new defpackage.aan(16);

    /* JADX WARN: Multi-variable type inference failed */
    public czz(android.content.Context context, defpackage.dbi dbiVar) {
        super(context);
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.ac = new androidx.compose.runtime.ParcelableSnapshotMutableState(dbiVar, bxvVar);
        this.ad = 9205357640488583168L;
        this.ae = true;
        this.h = defpackage.cdk.a;
        this.i = new defpackage.afbz();
        this.ag = new defpackage.bgf(this, 4);
        this.ah = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.dln.t(context), defpackage.bxv.a);
        defpackage.cik cikVar = new defpackage.cik(this, this);
        this.J = cikVar;
        this.j = dbiVar.a().d();
        defpackage.cgz cgzVar = new defpackage.cgz();
        this.k = cgzVar;
        this.l = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, bxvVar);
        defpackage.cew cewVar = new defpackage.cew(this, 11);
        defpackage.lam lamVar = defpackage.byp.a;
        this.m = new defpackage.bvr(cewVar, null);
        this.n = new defpackage.csx();
        defpackage.cxl cxlVar = new defpackage.cxl(false, 3, 0 == true ? 1 : 0);
        cxlVar.ad(defpackage.cvc.a);
        cxlVar.ab(r());
        cxlVar.af(q());
        defpackage.cgf cgfVar = new defpackage.cyc<defpackage.czw>() { // from class: czz.1
            @Override // defpackage.cyc
            public final /* bridge */ /* synthetic */ defpackage.cge d() {
                return new defpackage.czw(defpackage.czz.this);
            }

            @Override // defpackage.cyc
            public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
            }

            public final boolean equals(java.lang.Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return defpackage.czz.this.hashCode();
            }
        };
        defpackage.cgf cgfVar2 = cikVar.d;
        cxlVar.ae((cgfVar2 != defpackage.cgf.e ? new defpackage.cga(cgfVar, cgfVar2) : cgfVar).a(cgzVar.c));
        this.o = cxlVar;
        defpackage.zo zoVar = defpackage.zp.a;
        defpackage.zo zoVar2 = new defpackage.zo(6);
        this.M = zoVar2;
        defpackage.dep depVar = new defpackage.dep(zoVar2, this);
        this.p = depVar;
        defpackage.mku mkuVar = new defpackage.mku(cxlVar, new defpackage.dds(), zoVar2);
        this.W = mkuVar;
        defpackage.dah dahVar = new defpackage.dah(this);
        this.q = dahVar;
        defpackage.cgx cgxVar = new defpackage.cgx(this, new defpackage.bgp((java.lang.Object) this, 3, (short[]) null));
        this.r = cgxVar;
        this.P = new defpackage.cjq(this);
        defpackage.khb khbVar = new defpackage.khb((byte[]) null, (char[]) null);
        this.V = khbVar;
        this.N = new defpackage.aan(16);
        this.ak = new defpackage.cqr();
        this.aL = new defpackage.cif(cxlVar);
        this.al = new androidx.compose.runtime.ParcelableSnapshotMutableState(new android.content.res.Configuration(context.getResources().getConfiguration()), bxvVar);
        int i = 12;
        this.t = new defpackage.bvr(new defpackage.cew(this, i), null);
        this.u = new defpackage.cgl(this, khbVar);
        this.Q = new defpackage.cgp(new defpackage.cgu(context), mkuVar, this, depVar, context.getPackageName());
        this.w = new defpackage.cyx(new defpackage.chq(this, i));
        this.z = new defpackage.cxy(cxlVar);
        this.ao = 9223372034707292159L;
        this.ap = new int[]{0, 0};
        this.aq = defpackage.ckq.e();
        this.ar = new android.graphics.Matrix();
        this.A = defpackage.ckq.e();
        this.B = defpackage.ckq.e();
        this.as = -1L;
        this.au = 9187343241974906880L;
        this.aw = new java.util.concurrent.atomic.AtomicReference(null);
        this.ax = dbiVar.f;
        defpackage.dlz dlzVarC = defpackage.cie.c(context.getResources().getConfiguration().getLayoutDirection());
        this.ay = new androidx.compose.runtime.ParcelableSnapshotMutableState(dlzVarC == null ? defpackage.dlz.a : dlzVarC, bxvVar);
        this.D = new defpackage.cvz(this);
        this.U = new defpackage.bil((short[]) null);
        this.aK = new defpackage.aan(16);
        this.az = Float.NaN;
        this.aA = Float.NaN;
        this.aB = Float.NaN;
        this.aC = Float.NaN;
        this.R = new defpackage.bgf(this, 6, null);
        this.aD = new defpackage.bgf(this, 5);
        int i2 = 13;
        this.aF = new defpackage.dbt(context, new defpackage.chq(this, i2));
        this.aG = new defpackage.cew(this, i2);
        this.H = new defpackage.cew(this, 14);
        addOnAttachStateChangeListener(cgxVar);
        setWillNotDraw(false);
        setFocusable(true);
        defpackage.dax.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        defpackage.ebt.n(this, dahVar);
        setOnDragListener(cgzVar);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            defpackage.day.b(this);
        }
        if (defpackage.a.O()) {
            android.view.View view = new android.view.View(context);
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(1, 1));
            view.setTag(2131428359, java.lang.Boolean.TRUE);
            this.ai = view;
            addView(view, -1);
        }
        this.aN = android.os.Build.VERSION.SDK_INT >= 31 ? new defpackage.kwv((char[]) null) : null;
        this.K = new defpackage.czy(this);
    }

    public static final boolean X(defpackage.czz czzVar, android.view.KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public static final boolean Z(defpackage.czz czzVar, android.view.MotionEvent motionEvent) {
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b0  */
    private final int ab(android.view.MotionEvent motionEvent) {
        int actionMasked;
        removeCallbacks(this.R);
        try {
            this.as = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
            ai();
            long jA = defpackage.ckq.a(this.A, (((long) java.lang.Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getX())) << 32));
            this.au = (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawX() - java.lang.Float.intBitsToFloat((int) (jA >> 32)))) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getRawY() - java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)))) & 4294967295L);
            boolean z = true;
            this.at = true;
            v(false);
            defpackage.afgq afgqVar = new defpackage.afgq();
            int actionMasked2 = motionEvent.getActionMasked();
            android.view.MotionEvent motionEvent2 = this.E;
            boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && an(motionEvent, motionEvent2)) {
                if (motionEvent2.getButtonState() != 0 || (actionMasked = motionEvent2.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                    this.aL.c();
                } else if (motionEvent2.getActionMasked() != 10 && z2) {
                    V(motionEvent2, 10, motionEvent2.getEventTime(), true);
                }
            }
            int toolType = motionEvent.getToolType(0);
            if (!z2 && toolType == 3 && actionMasked2 != 3) {
                if (actionMasked2 == 9) {
                    actionMasked2 = 9;
                } else if (ap(motionEvent, 1)) {
                    V(motionEvent, 9, motionEvent.getEventTime(), true);
                }
            }
            int buttonState = motionEvent.getButtonState();
            if (actionMasked2 == 8 && buttonState == 0 && motionEvent2 != 0 && !motionEvent2.isFromSource(4098)) {
                afgqVar.a = true;
            }
            if (motionEvent2 != 0) {
                motionEvent2.recycle();
            }
            android.view.MotionEvent motionEvent3 = this.E;
            if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                android.view.MotionEvent motionEvent4 = this.E;
                int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                if (motionEvent.getAction() == 9 && motionEvent.getHistorySize() == 0) {
                    if (pointerId >= 0) {
                        this.ak.d(pointerId);
                    }
                } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                    android.view.MotionEvent motionEvent5 = this.E;
                    float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                    android.view.MotionEvent motionEvent6 = this.E;
                    float y = motionEvent6 != null ? motionEvent6.getY() : Float.NaN;
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (x == x2 && y == y2) {
                        z = false;
                    }
                    android.view.MotionEvent motionEvent7 = this.E;
                    long eventTime = motionEvent7 != null ? motionEvent7.getEventTime() : -1L;
                    long eventTime2 = motionEvent.getEventTime();
                    if (z || eventTime != eventTime2) {
                        if (pointerId >= 0) {
                            this.ak.d(pointerId);
                        }
                        this.aL.b();
                    }
                }
            }
            this.E = android.view.MotionEvent.obtainNoHistory(motionEvent);
            if (afgqVar.a) {
                V(motionEvent, 10, motionEvent.getEventTime(), true);
            }
            int iL = L(motionEvent);
            if ((iL & 4) == 0 && afgqVar.a) {
                this.aL.b();
                V(motionEvent, 9, motionEvent.getEventTime(), true);
            }
            this.at = false;
            return iL;
        } catch (java.lang.Throwable th) {
            this.at = false;
            throw th;
        }
    }

    private final defpackage.dkf ac() {
        defpackage.dkf dkfVar = this.av;
        if (dkfVar != null) {
            return dkfVar;
        }
        defpackage.dkf dkfVar2 = new defpackage.dkf(this, this, new defpackage.ngb(this), new defpackage.czu(this, 1), new defpackage.czu(this, 0));
        this.av = dkfVar2;
        return dkfVar2;
    }

    private final void ad(android.view.ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof defpackage.czz) {
                ((defpackage.czz) childAt).x();
            } else if (childAt instanceof android.view.ViewGroup) {
                ad((android.view.ViewGroup) childAt);
            }
        }
    }

    private final void ae() {
        if (this.aj) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.aj = false;
        }
    }

    private final void af(defpackage.cxl cxlVar) {
        cxlVar.H();
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            af((defpackage.cxl) objArr[i2]);
        }
    }

    private final void ag(defpackage.cxl cxlVar) {
        this.z.j(cxlVar, false);
        defpackage.bzc bzcVarK = cxlVar.k();
        java.lang.Object[] objArr = bzcVarK.a;
        int i = bzcVarK.b;
        for (int i2 = 0; i2 < i; i2++) {
            ag((defpackage.cxl) objArr[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    private final void ah(android.view.ViewStructure viewStructure) {
        defpackage.cgp cgpVar = this.Q;
        if (cgpVar != null) {
            defpackage.mku mkuVar = cgpVar.i;
            android.view.autofill.AutofillId autofillId = cgpVar.e;
            java.lang.String str = cgpVar.c;
            defpackage.dep depVar = cgpVar.b;
            java.lang.Object obj = mkuVar.b;
            defpackage.xi.d(viewStructure, (defpackage.cxl) obj, autofillId, str, depVar);
            defpackage.aan aanVarC = defpackage.aao.c(obj, viewStructure);
            while (aanVarC.g()) {
                java.lang.Object objH = aanVarC.h(aanVarC.b - 1);
                objH.getClass();
                android.view.ViewStructure viewStructure2 = (android.view.ViewStructure) objH;
                java.lang.Object objH2 = aanVarC.h(aanVarC.b - 1);
                objH2.getClass();
                java.util.List listV = ((defpackage.cxl) objH2).v();
                int size = listV.size();
                for (int i = 0; i < size; i++) {
                    defpackage.cxl cxlVar = (defpackage.cxl) listV.get(i);
                    if (!cxlVar.D && cxlVar.am() && cxlVar.an()) {
                        defpackage.ddz ddzVarR = cxlVar.r();
                        if (ddzVarR != null) {
                            defpackage.aau aauVar = ddzVarR.c;
                            if (defpackage.aau.f(aauVar, defpackage.ddy.g) || defpackage.aau.f(aauVar, defpackage.ddy.h) || defpackage.aau.f(aauVar, defpackage.def.r) || defpackage.aau.f(aauVar, defpackage.def.s) || (android.os.Build.VERSION.SDK_INT >= 34 && defpackage.aau.f(aauVar, defpackage.deg.c))) {
                                android.view.ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                defpackage.xi.d(viewStructureNewChild, cxlVar, cgpVar.e, str, depVar);
                                aanVarC.p(cxlVar);
                                aanVarC.p(viewStructureNewChild);
                            } else {
                                aanVarC.p(cxlVar);
                                aanVarC.p(viewStructure2);
                            }
                        } else {
                            aanVarC.p(cxlVar);
                            aanVarC.p(viewStructure2);
                        }
                    }
                }
            }
        }
        defpackage.cgl cglVar = this.u;
        if (cglVar != null) {
            ?? r0 = cglVar.c.a;
            if (r0.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(r0.size());
            java.util.Iterator it = r0.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                int iIntValue = ((java.lang.Number) entry.getKey()).intValue();
                android.view.ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                a$.ExternalSyntheticApiModelOutline1.m(viewStructureNewChild2, cglVar.b, iIntValue);
                viewStructureNewChild2.setId(iIntValue, cglVar.a.getContext().getPackageName(), null, null);
                a$.ExternalSyntheticApiModelOutline1.m(viewStructureNewChild2, defpackage.dai.ao(defpackage.cgr.b));
                throw null;
            }
        }
    }

    private final void ai() {
        int i = android.os.Build.VERSION.SDK_INT;
        float[] fArr = this.A;
        if (i >= 29) {
            defpackage.day.a(this, fArr, this.ar, this.ap);
        } else {
            dav.a(this, fArr, this.aq, this.ap);
        }
        defpackage.dbb.d(fArr, this.B);
    }

    private final void aj(boolean z) {
        this.l.b(java.lang.Boolean.valueOf(z));
    }

    private final void ak(android.content.res.Configuration configuration) {
        android.content.res.Configuration configurationM = M();
        if (defpackage.afga.f(configurationM, configuration)) {
            return;
        }
        this.al.b(new android.content.res.Configuration(configuration));
        if (configurationM.fontScale == configuration.fontScale && configurationM.densityDpi == configuration.densityDpi) {
            return;
        }
        this.ah.b(defpackage.dln.t(getContext().createConfigurationContext(configuration)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    private final void al() {
        boolean z;
        int[] iArr = this.ap;
        getLocationOnScreen(iArr);
        long j = this.ao;
        long j2 = j >> 32;
        int i = (int) (j & 4294967295L);
        int i2 = (int) j2;
        int i3 = iArr[0];
        if (i2 == i3 && i == iArr[1] && this.as >= 0) {
            z = false;
        } else {
            this.ao = (4294967295L & ((long) iArr[1])) | (((long) i3) << 32);
            if (i2 == Integer.MAX_VALUE || i == Integer.MAX_VALUE) {
                z = false;
            } else {
                defpackage.bzc bzcVarK = this.o.k();
                java.lang.Object[] objArr = bzcVarK.a;
                int i4 = bzcVarK.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((defpackage.cxl) objArr[i5]).o().D();
                }
                z = true;
            }
        }
        T();
        android.view.View rootView = this.aJ;
        if (rootView == null) {
            rootView = getRootView();
            this.aJ = rootView;
        }
        defpackage.dep depVar = this.p;
        long j3 = this.ao;
        long jD = defpackage.dlv.d(this.au);
        float[] fArr = this.A;
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        int length = fArr.length;
        int i6 = fArr[0] == 1.0f ? 1 : 0;
        int i7 = fArr[1] == 0.0f ? 1 : 0;
        int i8 = fArr[2] == 0.0f ? 1 : 0;
        int i9 = fArr[4] == 0.0f ? 1 : 0;
        int i10 = fArr[5] == 1.0f ? 1 : 0;
        int i11 = fArr[6] == 0.0f ? 1 : 0;
        int i12 = fArr[8] == 0.0f ? 1 : 0;
        int i13 = fArr[9] == 0.0f ? 1 : 0;
        int i14 = fArr[10] == 1.0f ? 1 : 0;
        int i15 = i6 & i7 & i8 & i9 & i10 & i11 & i12 & i13 & i14;
        if ((((i15 + i15) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0))) & 2) != 0) {
            fArr = null;
        }
        depVar.e = depVar.c.a(j3, jD, fArr, width, height) || depVar.e;
        this.z.b(z);
        depVar.c();
    }

    private final boolean am(android.view.MotionEvent motionEvent) {
        android.view.MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.E) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    private static final boolean an(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private static final boolean ao(android.view.MotionEvent motionEvent) {
        boolean z = (java.lang.Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (java.lang.Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (java.lang.Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || (android.os.Build.VERSION.SDK_INT >= 29 && !defpackage.day.c(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final boolean ap(android.view.MotionEvent motionEvent, int i) {
        if (i == 5) {
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) getWidth()) && y >= 0.0f && y <= ((float) getHeight());
    }

    private static final long aq(int i) {
        int mode = android.view.View.MeasureSpec.getMode(i);
        int size = android.view.View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode != 1073741824) {
            throw new java.lang.IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    @Override // defpackage.cyu
    public final void A(defpackage.cxl cxlVar, boolean z, boolean z2) {
        defpackage.cxy cxyVar = this.z;
        if (!z) {
            int iAv = cxlVar.av();
            int i = iAv - 1;
            if (iAv == 0) {
                throw null;
            }
            if (i == 0 || i == 1 || i == 2 || i == 3) {
                defpackage.dai daiVar = cxyVar.h;
                return;
            }
            if (i != 4) {
                throw new defpackage.afas();
            }
            defpackage.cxl cxlVarL = cxlVar.l();
            boolean z3 = cxlVarL == null || cxlVarL.an();
            if (!z2 && (cxlVar.al() || (cxlVar.ai() && cxlVar.an() == z3 && cxlVar.an() == cxlVar.ao()))) {
                defpackage.dai daiVar2 = cxyVar.h;
                return;
            }
            cxlVar.L();
            if (!cxlVar.D && cxlVar.ao() && z3) {
                if ((cxlVarL == null || !cxlVarL.ai()) && (cxlVarL == null || !cxlVarL.al())) {
                    cxyVar.i.x(cxlVar, 4);
                }
                if (cxyVar.c) {
                    return;
                }
                U(null);
                return;
            }
            return;
        }
        int iAv2 = cxlVar.av();
        int i2 = iAv2 - 1;
        if (iAv2 == 0) {
            throw null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            throw new defpackage.afas();
                        }
                    }
                }
            }
            defpackage.dai daiVar3 = cxyVar.h;
            return;
        }
        if ((cxlVar.ak() || cxlVar.aj()) && !z2) {
            defpackage.dai daiVar4 = cxyVar.h;
            return;
        }
        cxlVar.w.e();
        cxlVar.L();
        if (cxlVar.D) {
            return;
        }
        defpackage.cxl cxlVarL2 = cxlVar.l();
        if (defpackage.afga.f(cxlVar.s(), java.lang.Boolean.TRUE) && ((cxlVarL2 == null || !cxlVarL2.ak()) && (cxlVarL2 == null || !cxlVarL2.aj()))) {
            cxyVar.i.x(cxlVar, 2);
        } else if (cxlVar.an() && ((cxlVarL2 == null || !cxlVarL2.ai()) && (cxlVarL2 == null || !cxlVarL2.al()))) {
            cxyVar.i.x(cxlVar, 4);
        }
        if (cxyVar.c) {
            return;
        }
        U(null);
    }

    @Override // defpackage.cyu
    public final void B() {
        defpackage.dah dahVar = this.q;
        dahVar.m = true;
        android.os.Handler handlerN = dahVar.n();
        if (dahVar.B() && !dahVar.q && handlerN != null) {
            dahVar.q = true;
            handlerN.post(dahVar.r);
        }
        defpackage.cgx cgxVar = this.r;
        cgxVar.b = true;
        android.os.Handler handlerG = cgxVar.g();
        if (!cgxVar.n() || cgxVar.c || handlerG == null) {
            return;
        }
        cgxVar.c = true;
        handlerG.post(cgxVar.d);
    }

    @Override // defpackage.cyu
    public final void C(defpackage.afer aferVar) {
        defpackage.aan aanVar = this.aK;
        if (aanVar.e(aferVar)) {
            return;
        }
        aanVar.p(aferVar);
    }

    @Override // defpackage.cyu
    public final void D(defpackage.cxl cxlVar) {
        this.z.g.f(cxlVar);
        U(null);
    }

    @Override // defpackage.cyu
    public final void E(float f2) {
        if (defpackage.a.O()) {
            if (f2 > 0.0f) {
                if (java.lang.Float.isNaN(this.az) || f2 > this.az) {
                    this.az = f2;
                    return;
                }
                return;
            }
            if (f2 < 0.0f) {
                if (java.lang.Float.isNaN(this.aA) || f2 < this.aA) {
                    this.aA = f2;
                }
            }
        }
    }

    @Override // defpackage.cyu
    public final boolean F() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? defpackage.daz.a(this) : this.x;
    }

    @Override // defpackage.cyu
    public final defpackage.czt G() {
        return P().e;
    }

    @Override // defpackage.cyu
    public final void H() {
        this.aj = true;
    }

    @Override // defpackage.cyu
    public final defpackage.fbl I() {
        defpackage.fbl fblVar = this.aM;
        if (fblVar != null) {
            return fblVar;
        }
        defpackage.fbl fblVar2 = new defpackage.fbl(ac());
        this.aM = fblVar2;
        return fblVar2;
    }

    @Override // defpackage.cyu
    public final defpackage.wde J() {
        return (defpackage.wde) this.ax.a();
    }

    @Override // defpackage.cyu
    public final defpackage.kwv K() {
        return P().j();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final int L(android.view.MotionEvent motionEvent) {
        java.lang.Object obj;
        if (this.aH) {
            this.aH = false;
            defpackage.dbx dbxVar = P().i;
            defpackage.dco.a.b(new defpackage.crk(motionEvent.getMetaState()));
        }
        defpackage.cqr cqrVar = this.ak;
        defpackage.to toVarF = cqrVar.f(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        if (toVarF == null) {
            this.aL.c();
            return 0;
        }
        ?? r1 = toVarF.b;
        int size = r1.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = r1.get(size);
            if (((defpackage.crf) obj).e) {
                if (actionMasked != 0) {
                    if (actionMasked == 5) {
                        actionMasked = 5;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        defpackage.crf crfVar = (defpackage.crf) obj;
        if (crfVar != null) {
            this.ad = crfVar.d;
        }
        int iD = this.aL.d(toVarF, this, ap(motionEvent, toVarF.a));
        toVarF.c = null;
        if ((actionMasked == 0 || actionMasked == 5) && (iD & 1) == 0) {
            cqrVar.d(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iD;
    }

    public final android.content.res.Configuration M() {
        return (android.content.res.Configuration) this.al.a();
    }

    public final defpackage.czz N() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public final defpackage.dau O() {
        defpackage.dau dauVar = this.y;
        if (dauVar != null) {
            return dauVar;
        }
        defpackage.dau dauVar2 = new defpackage.dau(getContext());
        addView(dauVar2, -1);
        requestLayout();
        this.y = dauVar2;
        return dauVar2;
    }

    public final defpackage.dbi P() {
        return (defpackage.dbi) this.ac.a();
    }

    public final defpackage.affg Q() {
        defpackage.affg affgVar = this.aE;
        if (affgVar != null) {
            return affgVar;
        }
        defpackage.czv czvVar = new defpackage.czv(this);
        this.aE = czvVar;
        return czvVar;
    }

    public final void R(int i, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
        int iD;
        defpackage.dah dahVar = this.q;
        if (defpackage.afga.f(str, dahVar.o)) {
            int iD2 = dahVar.w.d(i);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!defpackage.afga.f(str, dahVar.p) || (iD = dahVar.x.d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public final void S() {
        af(this.o);
    }

    public final void T() {
        if (this.at) {
            return;
        }
        long jCurrentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.as) {
            this.as = jCurrentAnimationTimeMillis;
            ai();
            android.view.ViewParent parent = getParent();
            android.view.View view = this;
            while (parent instanceof android.view.ViewGroup) {
                view = (android.view.View) parent;
                parent = ((android.view.ViewGroup) view).getParent();
            }
            int[] iArr = this.ap;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            this.au = (((long) java.lang.Float.floatToRawIntBits(f2 - iArr[0])) << 32) | (((long) java.lang.Float.floatToRawIntBits(f3 - iArr[1])) & 4294967295L);
        }
    }

    public final void U(defpackage.cxl cxlVar) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (cxlVar != null) {
            while (cxlVar != null && cxlVar.aw() == 1) {
                if (!this.an) {
                    defpackage.cxl cxlVarL = cxlVar.l();
                    if (cxlVarL == null) {
                        break;
                    }
                    long j = cxlVarL.p().d;
                    if (defpackage.dlm.j(j) && defpackage.dlm.i(j)) {
                        break;
                    }
                }
                cxlVar = cxlVar.l();
            }
            if (cxlVar == this.o) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void V(android.view.MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        int i2 = 0;
        android.view.MotionEvent.PointerProperties[] pointerPropertiesArr = new android.view.MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new android.view.MotionEvent.PointerProperties();
        }
        int i4 = 1;
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = new android.view.MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new android.view.MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((actionIndex < 0 || actionIndex > i6) ? i2 : i4) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            android.view.MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            long jL = l((((long) java.lang.Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(pointerCoords.x)) << 32));
            pointerCoords.x = java.lang.Float.intBitsToFloat((int) (jL >> 32));
            pointerCoords.y = java.lang.Float.intBitsToFloat((int) (jL & 4294967295L));
            i6++;
            i2 = 0;
            i4 = 1;
        }
        int buttonState = z ? 0 : motionEvent.getButtonState();
        long downTime = motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime();
        android.view.MotionEvent motionEventA = android.os.Build.VERSION.SDK_INT >= 34 ? defpackage.dbc.a(downTime, j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags(), (i == 9 || i == 7 || i == 10 || android.os.Build.VERSION.SDK_INT < 29) ? 0 : alh$.ExternalSyntheticApiModelOutline0.m(motionEvent)) : android.view.MotionEvent.obtain(downTime, j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        defpackage.to toVarF = this.ak.f(motionEventA, this);
        toVarF.getClass();
        this.aL.d(toVarF, this, true);
        motionEventA.recycle();
    }

    public final void W(defpackage.dbi dbiVar) {
        if (this.j != dbiVar.a().d() && !this.o.v().isEmpty()) {
            defpackage.csc.b("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        defpackage.cej cejVar = (defpackage.cej) defpackage.cer.i.j();
        defpackage.affc affcVarI = cejVar != null ? cejVar.i() : null;
        defpackage.cej cejVarH = defpackage.bzd.h(cejVar);
        try {
            defpackage.dbi dbiVarP = P();
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            if (defpackage.afga.f(dbiVar, dbiVarP)) {
                return;
            }
            if (isAttachedToWindow()) {
                dbiVarP.f();
                dbiVar.g();
            }
            this.ac.b(dbiVar);
            this.j = dbiVar.a().d();
        } catch (java.lang.Throwable th) {
            defpackage.bzd.k(cejVar, cejVarH, affcVarI);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [bys, java.lang.Object] */
    public final boolean Y() {
        defpackage.kwv kwvVar;
        if (android.os.Build.VERSION.SDK_INT >= 31 && (kwvVar = this.aN) != null && ((java.lang.Boolean) kwvVar.a.a()).booleanValue()) {
            return true;
        }
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof defpackage.czz) {
                return ((defpackage.czz) parent).Y();
            }
        }
        return false;
    }

    public final defpackage.kwv aa() {
        defpackage.kwv kwvVar = this.aO;
        if (kwvVar == null) {
            kwvVar = new defpackage.kwv(true != isInTouchMode() ? 2 : 1);
            this.aO = kwvVar;
        }
        return kwvVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(java.util.ArrayList arrayList, int i, int i2) {
        defpackage.cjc cjcVar = this.J.b;
        if (!cjcVar.A) {
            return;
        }
        if (!cjcVar.q.A) {
            defpackage.csc.c("visitSubtreeIf called on an unattached node");
        }
        defpackage.bzc bzcVar = new defpackage.bzc(new defpackage.cge[16]);
        defpackage.cge cgeVar = cjcVar.q;
        defpackage.cge cgeVar2 = cgeVar.u;
        if (cgeVar2 == null) {
            defpackage.cjv.x(bzcVar, cgeVar);
        } else {
            bzcVar.n(cgeVar2);
        }
        while (true) {
            int i3 = bzcVar.b;
            if (i3 == 0) {
                return;
            }
            defpackage.cge cgeVar3 = (defpackage.cge) bzcVar.c(i3 - 1);
            if ((cgeVar3.s & 1024) != 0) {
                for (defpackage.cge cgeVar4 = cgeVar3; cgeVar4 != null && cgeVar4.A; cgeVar4 = cgeVar4.u) {
                    if ((cgeVar4.r & 1024) != 0) {
                        defpackage.cge cgeVarO = cgeVar4;
                        defpackage.bzc bzcVar2 = null;
                        while (cgeVarO != null) {
                            int i4 = 0;
                            if (cgeVarO instanceof defpackage.cjc) {
                                defpackage.cjc cjcVar2 = (defpackage.cjc) cgeVarO;
                                if (cjcVar2.A && ((defpackage.cio) cjcVar2.b()).a) {
                                    super.addFocusables(arrayList, i, i2);
                                    if (cjcVar.A) {
                                        if (!cjcVar.q.A) {
                                            defpackage.csc.c("visitSubtreeIf called on an unattached node");
                                        }
                                        defpackage.bzc bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                        defpackage.cge cgeVar5 = cjcVar.q;
                                        defpackage.cge cgeVar6 = cgeVar5.u;
                                        if (cgeVar6 == null) {
                                            defpackage.cjv.x(bzcVar3, cgeVar5);
                                        } else {
                                            bzcVar3.n(cgeVar6);
                                        }
                                        while (true) {
                                            int i5 = bzcVar3.b;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            defpackage.cge cgeVar7 = (defpackage.cge) bzcVar3.c(i5 - 1);
                                            if ((cgeVar7.s & 1024) != 0) {
                                                for (defpackage.cge cgeVar8 = cgeVar7; cgeVar8 != null && cgeVar8.A; cgeVar8 = cgeVar8.u) {
                                                    if ((cgeVar8.r & 1024) != 0) {
                                                        defpackage.cge cgeVarO2 = cgeVar8;
                                                        defpackage.bzc bzcVar4 = null;
                                                        while (cgeVarO2 != null) {
                                                            if (cgeVarO2 instanceof defpackage.cjc) {
                                                                defpackage.cjc cjcVar3 = (defpackage.cjc) cgeVarO2;
                                                                if (cjcVar3.A) {
                                                                    defpackage.cim cimVarB = cjcVar3.b();
                                                                    if (cjcVar3.A && !cjcVar3.a && ((defpackage.cio) cimVarB).a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((cgeVarO2.r & 1024) != 0 && (cgeVarO2 instanceof defpackage.cwo)) {
                                                                int i6 = 0;
                                                                for (defpackage.cge cgeVar9 = ((defpackage.cwo) cgeVarO2).C; cgeVar9 != null; cgeVar9 = cgeVar9.u) {
                                                                    if ((cgeVar9.r & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            cgeVarO2 = cgeVar9;
                                                                        } else {
                                                                            if (bzcVar4 == null) {
                                                                                bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                                                            }
                                                                            if (cgeVarO2 != null) {
                                                                                bzcVar4.n(cgeVarO2);
                                                                            }
                                                                            bzcVar4.n(cgeVar9);
                                                                            cgeVarO2 = null;
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 != 1) {
                                                                }
                                                            }
                                                            cgeVarO2 = defpackage.cjv.o(bzcVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            defpackage.cjv.x(bzcVar3, cgeVar7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((cgeVarO.r & 1024) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                for (defpackage.cge cgeVar10 = ((defpackage.cwo) cgeVarO).C; cgeVar10 != null; cgeVar10 = cgeVar10.u) {
                                    if ((cgeVar10.r & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            cgeVarO = cgeVar10;
                                        } else {
                                            if (bzcVar2 == null) {
                                                bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (cgeVarO != null) {
                                                bzcVar2.n(cgeVarO);
                                            }
                                            bzcVar2.n(cgeVar10);
                                            cgeVarO = null;
                                        }
                                    }
                                }
                                if (i4 != 1) {
                                }
                            }
                            cgeVarO = defpackage.cjv.o(bzcVar2);
                        }
                    }
                }
            }
            defpackage.cjv.x(bzcVar, cgeVar3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i) {
        view.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: afat */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.Map] */
    @Override // android.view.View
    public final void autofill(android.util.SparseArray sparseArray) throws afat {
        defpackage.ddz ddzVarR;
        defpackage.cgp cgpVar = this.Q;
        if (cgpVar != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                android.view.autofill.AutofillValue autofillValueM = ep$.ExternalSyntheticApiModelOutline1.m(sparseArray.get(iKeyAt));
                defpackage.cxl cxlVar = (defpackage.cxl) ((defpackage.zo) cgpVar.i.a).a(iKeyAt);
                if (cxlVar != null && (ddzVarR = cxlVar.r()) != null) {
                    defpackage.ddn ddnVar = (defpackage.ddn) ddzVarR.g(defpackage.ddy.g);
                    if (ddnVar != null) {
                    }
                    defpackage.ddn ddnVar2 = (defpackage.ddn) ddzVarR.g(defpackage.ddy.h);
                    if (ddnVar2 != null) {
                    }
                }
            }
        }
        defpackage.cgl cglVar = this.u;
        if (cglVar != null) {
            ?? r9 = cglVar.c.a;
            if (r9.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                android.view.autofill.AutofillValue autofillValueM2 = ep$.ExternalSyntheticApiModelOutline1.m(sparseArray.get(iKeyAt2));
                if (a$.ExternalSyntheticApiModelOutline1.m$2(autofillValueM2)) {
                    a$.ExternalSyntheticApiModelOutline1.m(autofillValueM2).toString();
                    if (((cgq) r9.get(java.lang.Integer.valueOf(iKeyAt2))) != null) {
                        throw null;
                    }
                } else {
                    if (ep$.ExternalSyntheticApiModelOutline1.m(autofillValueM2)) {
                        throw new afat("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (ep$.ExternalSyntheticApiModelOutline1.m$1(autofillValueM2)) {
                        throw new afat("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (a$.ExternalSyntheticApiModelOutline1.m(autofillValueM2)) {
                        throw new afat("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.q.z(false, i, this.ad);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.q.z(true, i, this.ad);
    }

    @Override // defpackage.cig
    public final void dX(defpackage.cjc cjcVar, defpackage.cjc cjcVar2) {
        int i;
        defpackage.cyg cygVar;
        boolean z;
        defpackage.cyg cygVar2;
        boolean z2;
        if (cjcVar != null) {
            if (!cjcVar.q.A) {
                defpackage.csc.c("visitAncestors called on an unattached node");
            }
            defpackage.cge cgeVar = cjcVar.q;
            defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVar);
            defpackage.aaw aawVar = null;
            java.util.ArrayList arrayList = null;
            while (true) {
                if (cxlVarR == null) {
                    break;
                }
                if ((cxlVarR.v.f.s & 2097152) != 0) {
                    while (cgeVar != null) {
                        if ((cgeVar.r & 2097152) != 0) {
                            defpackage.cge cgeVarO = cgeVar;
                            defpackage.bzc bzcVar = null;
                            while (cgeVarO != null) {
                                if (cgeVarO instanceof defpackage.cpv) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(cgeVarO);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (cgeVarO.r & 2097152) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                    int i2 = 0;
                                    for (defpackage.cge cgeVar2 = ((defpackage.cwo) cgeVarO).C; cgeVar2 != null; cgeVar2 = cgeVar2.u) {
                                        if ((cgeVar2.r & 2097152) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                cgeVarO = cgeVar2;
                                            } else {
                                                if (bzcVar == null) {
                                                    bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                }
                                                if (cgeVarO != null) {
                                                    bzcVar.n(cgeVarO);
                                                }
                                                bzcVar.n(cgeVar2);
                                                cgeVarO = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                cgeVarO = defpackage.cjv.o(bzcVar);
                            }
                        }
                        cgeVar = cgeVar.t;
                    }
                }
                cxlVarR = cxlVarR.l();
                cgeVar = (cxlVarR == null || (cygVar2 = cxlVarR.v) == null) ? null : cygVar2.e;
            }
            if (arrayList == null) {
                return;
            }
            if (cjcVar2 != null) {
                if (!cjcVar2.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar3 = cjcVar2.q;
                defpackage.cxl cxlVarR2 = defpackage.cjv.r(cjcVar2);
                defpackage.aaw aawVar2 = null;
                while (cxlVarR2 != null) {
                    if ((cxlVarR2.v.f.s & 2097152) != 0) {
                        while (cgeVar3 != null) {
                            if ((cgeVar3.r & 2097152) != 0) {
                                defpackage.cge cgeVarO2 = cgeVar3;
                                defpackage.bzc bzcVar2 = null;
                                while (cgeVarO2 != null) {
                                    if (cgeVarO2 instanceof defpackage.cpv) {
                                        if (aawVar2 == null) {
                                            defpackage.aaw aawVar3 = defpackage.aax.a;
                                            aawVar2 = new defpackage.aaw(6);
                                        }
                                        aawVar2.j(cgeVarO2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cgeVarO2.r & 2097152) != 0 && (cgeVarO2 instanceof defpackage.cwo)) {
                                        int i3 = 0;
                                        for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO2).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                            if ((cgeVar4.r & 2097152) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    cgeVarO2 = cgeVar4;
                                                } else {
                                                    if (bzcVar2 == null) {
                                                        bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (cgeVarO2 != null) {
                                                        bzcVar2.n(cgeVarO2);
                                                    }
                                                    bzcVar2.n(cgeVar4);
                                                    cgeVarO2 = null;
                                                }
                                            }
                                        }
                                        if (i3 != 1) {
                                        }
                                    }
                                    cgeVarO2 = defpackage.cjv.o(bzcVar2);
                                }
                            }
                            cgeVar3 = cgeVar3.t;
                        }
                    }
                    cxlVarR2 = cxlVarR2.l();
                    cgeVar3 = (cxlVarR2 == null || (cygVar = cxlVarR2.v) == null) ? null : cygVar.e;
                }
                aawVar = aawVar2;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                defpackage.cpv cpvVar = (defpackage.cpv) arrayList.get(i);
                if (aawVar == null || !aawVar.a(cpvVar)) {
                    cpvVar.I();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [ckc, java.lang.Object] */
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
    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(android.graphics.Canvas canvas) throws java.lang.Throwable {
        if (!isAttachedToWindow()) {
            af(this.o);
        }
        v(true);
        defpackage.cer.b().e();
        this.s = true;
        ?? r0 = P().p.a;
        android.graphics.Canvas canvas2 = ((defpackage.cjm) r0).a;
        ((defpackage.cjm) r0).a = canvas;
        this.o.C(r0, null);
        ((defpackage.cjm) r0).a = canvas2;
        defpackage.aan aanVar = this.N;
        if (aanVar.g()) {
            int i = aanVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((defpackage.cys) aanVar.c(i2)).j();
            }
        }
        int i3 = defpackage.dcm.a;
        aanVar.k();
        this.s = false;
        defpackage.aan aanVar2 = this.O;
        if (aanVar2 != null) {
            this.N.q(aanVar2);
            aanVar2.k();
        }
        if (defpackage.a.O()) {
            if (java.lang.Float.compare(this.az, this.aB) != 0) {
                float f2 = this.az;
                this.aB = f2;
                defpackage.dbd.a(this, f2);
            }
            android.view.View view = this.ai;
            if (view != null) {
                if (java.lang.Float.compare(this.aA, this.aC) != 0) {
                    float f3 = this.aA;
                    this.aC = f3;
                    defpackage.dbd.a(view, f3);
                }
                if (!java.lang.Float.isNaN(this.aA)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
            }
            this.az = Float.NaN;
            this.aA = Float.NaN;
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0351  */
    /* JADX WARN: Code duplicated, block: B:219:0x0358  */
    /* JADX WARN: Code duplicated, block: B:222:0x0360  */
    /* JADX WARN: Code duplicated, block: B:223:0x037d  */
    /* JADX WARN: Code duplicated, block: B:228:0x0390  */
    /* JADX WARN: Code duplicated, block: B:231:0x0398  */
    /* JADX WARN: Code duplicated, block: B:232:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:241:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:398:0x05e6  */
    /* JADX WARN: Code duplicated, block: B:405:0x05f3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v18, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v22, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v23, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v44 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46, types: [bzc] */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v49, types: [bzc] */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [bzc] */
    /* JADX WARN: Type inference failed for: r1v68 */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [bzc] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [bzc] */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76, types: [bzc] */
    /* JADX WARN: Type inference failed for: r1v90 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r1v93 */
    /* JADX WARN: Type inference failed for: r1v94 */
    /* JADX WARN: Type inference failed for: r1v95 */
    /* JADX WARN: Type inference failed for: r1v96 */
    /* JADX WARN: Type inference failed for: r1v97 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46, types: [cge] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v55, types: [cge] */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62, types: [bzc] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43, types: [bzc] */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64 */
    /* JADX WARN: Type inference failed for: r8v65 */
    /* JADX WARN: Type inference failed for: r8v66, types: [bzc] */
    /* JADX WARN: Type inference failed for: r8v68 */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX WARN: Type inference failed for: r8v72 */
    /* JADX WARN: Type inference failed for: r8v73 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        int i;
        int i2;
        defpackage.aahg aahgVar;
        long j;
        long eventTime;
        float pressure;
        long eventTime2;
        long j2;
        long jFloatToRawIntBits;
        ?? r30;
        cpu cpuVar;
        defpackage.cpv cpvVar;
        boolean z;
        defpackage.cyg cygVar;
        ?? O;
        defpackage.cyg cygVar2;
        defpackage.cpv cpvVar2;
        boolean z2;
        int size;
        int size2;
        defpackage.cyg cygVar3;
        boolean z3;
        ?? r6;
        defpackage.cyg cygVar4;
        ?? r7;
        ?? O2;
        defpackage.dbt dbtVar;
        int action;
        defpackage.crz crzVar;
        int size3;
        defpackage.cyg cygVar5;
        boolean z4;
        ?? O3;
        defpackage.cyg cygVar6;
        boolean z5 = false;
        if (this.G) {
            java.lang.Runnable runnable = this.aD;
            removeCallbacks(runnable);
            if (motionEvent.getActionMasked() == 8) {
                this.G = false;
            } else {
                runnable.run();
            }
        }
        if (ao(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        byte b2 = -1;
        int i3 = 16;
        int i4 = 1;
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (ab(motionEvent) & 4) != 0;
            }
            android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
            float f2 = -motionEvent.getAxisValue(26);
            getContext();
            float fM$1 = a$.ExternalSyntheticApiModelOutline1.m$1(viewConfiguration) * f2;
            getContext();
            csb csbVar = new csb(fM$1, f2 * a$.ExternalSyntheticApiModelOutline1.m(viewConfiguration), motionEvent.getEventTime(), motionEvent.getDeviceId());
            defpackage.cik cikVar = this.J;
            defpackage.bso bsoVar = new defpackage.bso(this, motionEvent, 7);
            if (cikVar.c.a) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            defpackage.cjc cjcVarA = cikVar.a();
            if (cjcVarA != null) {
                if (!cjcVarA.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar = cjcVarA.q;
                defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarA);
                loop0: while (true) {
                    if (cxlVarR == null) {
                        O3 = 0;
                        break;
                    }
                    if ((cxlVarR.v.f.s & 16384) != 0) {
                        while (cgeVar != null) {
                            if ((cgeVar.r & 16384) != 0) {
                                O3 = cgeVar;
                                ?? bzcVar = 0;
                                while (O3 != 0) {
                                    if (O3 instanceof defpackage.crz) {
                                        break loop0;
                                    }
                                    if ((O3.r & 16384) != 0 && (O3 instanceof defpackage.cwo)) {
                                        defpackage.cge cgeVar2 = ((defpackage.cwo) O3).C;
                                        int i5 = 0;
                                        while (cgeVar2 != null) {
                                            if ((cgeVar2.r & 16384) != 0) {
                                                i5++;
                                                if (i5 == 1) {
                                                    O3 = O3;
                                                    bzcVar = bzcVar;
                                                    bzcVar = bzcVar;
                                                    O3 = cgeVar2;
                                                } else {
                                                    if (bzcVar == 0) {
                                                        bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (O3 != 0) {
                                                        bzcVar.n(O3);
                                                    }
                                                    bzcVar.n(cgeVar2);
                                                    O3 = 0;
                                                }
                                            } else {
                                                O3 = O3;
                                                bzcVar = bzcVar;
                                            }
                                            cgeVar2 = cgeVar2.u;
                                            O3 = O3;
                                            bzcVar = bzcVar;
                                        }
                                        if (i5 != 1) {
                                            O3 = O3;
                                            bzcVar = bzcVar;
                                        } else {
                                            O3 = O3;
                                            bzcVar = bzcVar;
                                        }
                                    }
                                    O3 = defpackage.cjv.o(bzcVar);
                                }
                            }
                            cgeVar = cgeVar.t;
                        }
                    }
                    cxlVarR = cxlVarR.l();
                    cgeVar = (cxlVarR == null || (cygVar6 = cxlVarR.v) == null) ? null : cygVar6.e;
                }
                crzVar = (defpackage.crz) O3;
            } else {
                crzVar = null;
            }
            if (crzVar != null) {
                if (!crzVar.M().A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar3 = crzVar.M().t;
                defpackage.cxl cxlVarR2 = defpackage.cjv.r(crzVar);
                java.util.ArrayList arrayList = null;
                while (cxlVarR2 != null) {
                    if ((cxlVarR2.v.f.s & 16384) != 0) {
                        while (cgeVar3 != null) {
                            if ((cgeVar3.r & 16384) != 0) {
                                defpackage.cge cgeVarO = cgeVar3;
                                defpackage.bzc bzcVar2 = null;
                                while (cgeVarO != null) {
                                    if (cgeVarO instanceof defpackage.crz) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        arrayList.add(cgeVarO);
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    if (z4 && (cgeVarO.r & 16384) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                        int i6 = 0;
                                        for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                            if ((cgeVar4.r & 16384) != 0) {
                                                i6++;
                                                if (i6 == 1) {
                                                    cgeVarO = cgeVar4;
                                                } else {
                                                    if (bzcVar2 == null) {
                                                        bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (cgeVarO != null) {
                                                        bzcVar2.n(cgeVarO);
                                                    }
                                                    bzcVar2.n(cgeVar4);
                                                    cgeVarO = null;
                                                }
                                            }
                                        }
                                        if (i6 != 1) {
                                        }
                                    }
                                    cgeVarO = defpackage.cjv.o(bzcVar2);
                                }
                            }
                            cgeVar3 = cgeVar3.t;
                        }
                    }
                    cxlVarR2 = cxlVarR2.l();
                    cgeVar3 = (cxlVarR2 == null || (cygVar5 = cxlVarR2.v) == null) ? null : cygVar5.e;
                }
                if (arrayList != null && (size3 = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i7 = size3 - 1;
                        ((defpackage.crz) arrayList.get(size3)).f();
                        if (i7 < 0) {
                            break;
                        }
                        size3 = i7;
                    }
                }
                ?? M = crzVar.M();
                ?? bzcVar3 = 0;
                while (M != 0) {
                    if (M instanceof defpackage.crz) {
                    } else if ((M.r & 16384) != 0 && (M instanceof defpackage.cwo)) {
                        defpackage.cge cgeVar5 = ((defpackage.cwo) M).C;
                        int i8 = 0;
                        while (cgeVar5 != null) {
                            if ((cgeVar5.r & 16384) != 0) {
                                i8++;
                                if (i8 == 1) {
                                    M = M;
                                    bzcVar3 = bzcVar3;
                                    bzcVar3 = bzcVar3;
                                    M = cgeVar5;
                                } else {
                                    if (bzcVar3 == 0) {
                                        bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (M != 0) {
                                        bzcVar3.n(M);
                                    }
                                    bzcVar3.n(cgeVar5);
                                    M = 0;
                                }
                            } else {
                                M = M;
                                bzcVar3 = bzcVar3;
                            }
                            cgeVar5 = cgeVar5.u;
                            M = M;
                            bzcVar3 = bzcVar3;
                        }
                        if (i8 != 1) {
                            M = M;
                            bzcVar3 = bzcVar3;
                        } else {
                            M = M;
                            bzcVar3 = bzcVar3;
                        }
                    }
                    M = defpackage.cjv.o(bzcVar3);
                }
                if (((java.lang.Boolean) bsoVar.invoke()).booleanValue()) {
                    return true;
                }
                ?? M2 = crzVar.M();
                ?? bzcVar4 = 0;
                while (M2 != 0) {
                    if (M2 instanceof defpackage.crz) {
                        if (((defpackage.crz) M2).c(csbVar)) {
                            return true;
                        }
                    } else if ((M2.r & 16384) != 0 && (M2 instanceof defpackage.cwo)) {
                        defpackage.cge cgeVar6 = ((defpackage.cwo) M2).C;
                        int i9 = 0;
                        while (cgeVar6 != null) {
                            if ((cgeVar6.r & 16384) != 0) {
                                i9++;
                                if (i9 == 1) {
                                    M2 = M2;
                                    bzcVar4 = bzcVar4;
                                    bzcVar4 = bzcVar4;
                                    M2 = cgeVar6;
                                } else {
                                    if (bzcVar4 == 0) {
                                        bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                    }
                                    if (M2 != 0) {
                                        bzcVar4.n(M2);
                                    }
                                    bzcVar4.n(cgeVar6);
                                    M2 = 0;
                                }
                            } else {
                                M2 = M2;
                                bzcVar4 = bzcVar4;
                            }
                            cgeVar6 = cgeVar6.u;
                            M2 = M2;
                            bzcVar4 = bzcVar4;
                        }
                        if (i9 != 1) {
                            M2 = M2;
                            bzcVar4 = bzcVar4;
                        } else {
                            M2 = M2;
                            bzcVar4 = bzcVar4;
                        }
                    }
                    M2 = defpackage.cjv.o(bzcVar4);
                }
                if (arrayList != null) {
                    int size4 = arrayList.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        if (((defpackage.crz) arrayList.get(i10)).c(csbVar)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        defpackage.cqr cqrVar = this.ak;
        int actionMasked = motionEvent.getActionMasked();
        cqrVar.c(motionEvent);
        if (actionMasked == 3) {
            cqrVar.a.clear();
            cqrVar.b.clear();
            i = 16;
            aahgVar = null;
        } else {
            cqrVar.b(motionEvent);
            int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
            boolean z6 = actionMasked == 0 || actionMasked == 2 || actionMasked == 5;
            int pointerCount = motionEvent.getPointerCount();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(pointerCount);
            int i11 = 0;
            while (i11 < pointerCount) {
                byte b3 = b2;
                int i12 = pointerCount;
                long jA = cqrVar.a(motionEvent.getPointerId(i11));
                float x = motionEvent.getX(i11);
                float y = motionEvent.getY(i11);
                int i13 = i3;
                long jFloatToRawIntBits2 = java.lang.Float.floatToRawIntBits(x);
                int i14 = i4;
                boolean z7 = z6;
                long jFloatToRawIntBits3 = java.lang.Float.floatToRawIntBits(y);
                ?? r24 = i11 != actionIndex ? i14 : z5;
                defpackage.zz zzVar = cqrVar.c;
                cqq cqqVar = (cqq) zzVar.d(jA);
                long j3 = (jFloatToRawIntBits2 << 32) | (jFloatToRawIntBits3 & 4294967295L);
                if (i11 == actionIndex) {
                    zzVar.h(jA);
                } else {
                    if (z7) {
                        long eventTime3 = motionEvent.getEventTime() & 2147483647L;
                        j = 1;
                        zzVar.g(jA, new cqq((eventTime3 + eventTime3) | 1 | (((long) ((((short) java.lang.Float.intBitsToFloat((int) (j3 >> 32))) << 16) | ((char) ((short) java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L)))))) << 32)));
                    }
                    eventTime = motionEvent.getEventTime();
                    long j4 = j;
                    pressure = motionEvent.getPressure(i11);
                    if (cqqVar != null) {
                        eventTime2 = (cqqVar.a >> i14) & 2147483647L;
                    } else {
                        eventTime2 = motionEvent.getEventTime();
                    }
                    j2 = eventTime2;
                    if (cqqVar != null) {
                        int i15 = (int) (cqqVar.a >>> 32);
                        jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits((short) ((char) i15))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(i15 >> 16)) << 32);
                    } else {
                        jFloatToRawIntBits = j3;
                    }
                    if (cqqVar != null || (cqqVar.a & j4) == 0) {
                        r30 = 0;
                    } else {
                        r30 = i14;
                    }
                    if (motionEvent.getHistorySize() > 0) {
                        cpuVar = new cpu(jA, eventTime, j3, (boolean) r24, pressure, j2, jFloatToRawIntBits, (boolean) r30, new cpw(motionEvent, i11));
                    } else {
                        cpuVar = new cpu(jA, eventTime, j3, (boolean) r24, pressure, j2, jFloatToRawIntBits, (boolean) r30);
                    }
                    arrayList2.add(cpuVar);
                    i11++;
                    b2 = b3;
                    pointerCount = i12;
                    i3 = i13;
                    i4 = i14;
                    z6 = z7;
                    z5 = false;
                }
                j = 1;
                eventTime = motionEvent.getEventTime();
                long j5 = j;
                pressure = motionEvent.getPressure(i11);
                if (cqqVar != null) {
                    eventTime2 = (cqqVar.a >> i14) & 2147483647L;
                } else {
                    eventTime2 = motionEvent.getEventTime();
                }
                j2 = eventTime2;
                if (cqqVar != null) {
                    int i16 = (int) (cqqVar.a >>> 32);
                    jFloatToRawIntBits = (((long) java.lang.Float.floatToRawIntBits((short) ((char) i16))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(i16 >> 16)) << 32);
                } else {
                    jFloatToRawIntBits = j3;
                }
                if (cqqVar != null) {
                    r30 = 0;
                } else {
                    r30 = 0;
                }
                if (motionEvent.getHistorySize() > 0) {
                    cpuVar = new cpu(jA, eventTime, j3, (boolean) r24, pressure, j2, jFloatToRawIntBits, (boolean) r30, new cpw(motionEvent, i11));
                } else {
                    cpuVar = new cpu(jA, eventTime, j3, (boolean) r24, pressure, j2, jFloatToRawIntBits, (boolean) r30);
                }
                arrayList2.add(cpuVar);
                i11++;
                b2 = b3;
                pointerCount = i12;
                i3 = i13;
                i4 = i14;
                z6 = z7;
                z5 = false;
            }
            i = i3;
            int i17 = i4;
            cqrVar.e(motionEvent);
            if (!motionEvent.isFromSource(2097152)) {
                throw new java.lang.IllegalArgumentException("MotionEvent must be a touch navigation source");
            }
            android.view.InputDevice device = motionEvent.getDevice();
            if (device != null) {
                android.view.InputDevice.MotionRange motionRange = device.getMotionRange(0);
                android.view.InputDevice.MotionRange motionRange2 = device.getMotionRange(i17);
                if (motionRange == null || motionRange2 != null) {
                    if (motionRange2 == null || motionRange != null) {
                        if (motionRange != null) {
                            float range = motionRange.getRange();
                            float range2 = motionRange2.getRange();
                            if (range > range2 && (range2 == 0.0f || range / range2 >= 5.0f)) {
                                i2 = 1;
                            } else if (range2 <= range || (range != 0.0f && range2 / range < 5.0f)) {
                            }
                        }
                        i2 = 0;
                    }
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            aahgVar = new defpackage.aahg(arrayList2, i2, motionEvent);
        }
        defpackage.cik cikVar2 = this.J;
        if (aahgVar == null) {
            defpackage.cjc cjcVarB = cikVar2.b();
            if (cjcVarB != null) {
                if (!cjcVarB.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar7 = cjcVarB.q;
                defpackage.cxl cxlVarR3 = defpackage.cjv.r(cjcVarB);
                loop26: while (true) {
                    if (cxlVarR3 == null) {
                        O = 0;
                        break;
                    }
                    if ((cxlVarR3.v.f.s & 2097152) != 0) {
                        while (cgeVar7 != null) {
                            if ((cgeVar7.r & 2097152) != 0) {
                                O = cgeVar7;
                                ?? r8 = 0;
                                while (O != 0) {
                                    if (O instanceof defpackage.cpv) {
                                        break loop26;
                                    }
                                    if ((O.r & 2097152) != 0 && (O instanceof defpackage.cwo)) {
                                        defpackage.cge cgeVar8 = ((defpackage.cwo) O).C;
                                        ?? bzcVar5 = r8;
                                        ?? r9 = O;
                                        int i18 = 0;
                                        while (cgeVar8 != null) {
                                            if ((cgeVar8.r & 2097152) != 0) {
                                                i18++;
                                                if (i18 == 1) {
                                                    bzcVar5 = bzcVar5;
                                                    r9 = cgeVar8;
                                                } else {
                                                    if (bzcVar5 == 0) {
                                                        bzcVar5 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (r9 != 0) {
                                                        bzcVar5.n(r9);
                                                    }
                                                    bzcVar5.n(cgeVar8);
                                                    r9 = 0;
                                                }
                                            }
                                            cgeVar8 = cgeVar8.u;
                                            r9 = r9;
                                            bzcVar5 = bzcVar5;
                                        }
                                        if (i18 != 1) {
                                            r8 = bzcVar5;
                                        } else {
                                            O = r9;
                                            r8 = bzcVar5;
                                        }
                                    }
                                    O = defpackage.cjv.o(r8);
                                }
                            }
                            cgeVar7 = cgeVar7.t;
                        }
                    }
                    cxlVarR3 = cxlVarR3.l();
                    cgeVar7 = (cxlVarR3 == null || (cygVar2 = cxlVarR3.v) == null) ? null : cygVar2.e;
                }
                cpvVar = (defpackage.cpv) O;
            } else {
                cpvVar = null;
            }
            if (cpvVar != null) {
                if (!cpvVar.M().A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar9 = cpvVar.M().t;
                defpackage.cxl cxlVarR4 = defpackage.cjv.r(cpvVar);
                java.util.ArrayList arrayList3 = null;
                while (cxlVarR4 != null) {
                    if ((cxlVarR4.v.f.s & 2097152) != 0) {
                        while (cgeVar9 != null) {
                            if ((cgeVar9.r & 2097152) != 0) {
                                defpackage.cge cgeVarO2 = cgeVar9;
                                defpackage.bzc bzcVar6 = null;
                                while (cgeVarO2 != null) {
                                    if (cgeVarO2 instanceof defpackage.cpv) {
                                        if (arrayList3 == null) {
                                            arrayList3 = new java.util.ArrayList();
                                        }
                                        arrayList3.add(cgeVarO2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (cgeVarO2.r & 2097152) != 0 && (cgeVarO2 instanceof defpackage.cwo)) {
                                        defpackage.bzc bzcVar7 = bzcVar6;
                                        defpackage.cge cgeVar10 = cgeVarO2;
                                        int i19 = 0;
                                        for (defpackage.cge cgeVar11 = ((defpackage.cwo) cgeVarO2).C; cgeVar11 != null; cgeVar11 = cgeVar11.u) {
                                            if ((cgeVar11.r & 2097152) != 0) {
                                                i19++;
                                                if (i19 == 1) {
                                                    cgeVar10 = cgeVar11;
                                                } else {
                                                    if (bzcVar7 == null) {
                                                        bzcVar7 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (cgeVar10 != null) {
                                                        bzcVar7.n(cgeVar10);
                                                    }
                                                    bzcVar7.n(cgeVar11);
                                                    cgeVar10 = null;
                                                }
                                            }
                                        }
                                        if (i19 != 1) {
                                            bzcVar6 = bzcVar7;
                                            cgeVarO2 = defpackage.cjv.o(bzcVar6);
                                        } else {
                                            cgeVarO2 = cgeVar10;
                                            bzcVar6 = bzcVar7;
                                        }
                                    } else {
                                        cgeVarO2 = defpackage.cjv.o(bzcVar6);
                                    }
                                }
                            }
                            cgeVar9 = cgeVar9.t;
                        }
                    }
                    cxlVarR4 = cxlVarR4.l();
                    cgeVar9 = (cxlVarR4 == null || (cygVar = cxlVarR4.v) == null) ? null : cygVar.e;
                }
                cpvVar.I();
                if (arrayList3 != null) {
                    int size5 = arrayList3.size();
                    for (int i20 = 0; i20 < size5; i20++) {
                        ((defpackage.cpv) arrayList3.get(i20)).I();
                    }
                }
            }
            this.aF.a();
            return true;
        }
        if (!cikVar2.c.a) {
            defpackage.cjc cjcVarB2 = cikVar2.b();
            if (cjcVarB2 != null) {
                if (!cjcVarB2.q.A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar12 = cjcVarB2.q;
                defpackage.cxl cxlVarR5 = defpackage.cjv.r(cjcVarB2);
                loop14: while (true) {
                    if (cxlVarR5 == null) {
                        r6 = 0;
                        break;
                    }
                    if ((cxlVarR5.v.f.s & 2097152) != 0) {
                        while (cgeVar12 != null) {
                            if ((cgeVar12.r & 2097152) != 0) {
                                r6 = cgeVar12;
                                ?? r10 = 0;
                                while (r6 != 0) {
                                    if (r6 instanceof defpackage.cpv) {
                                        break loop14;
                                    }
                                    if ((r6.r & 2097152) == 0 || !(r6 instanceof defpackage.cwo)) {
                                        r7 = r10;
                                        r7 = r10;
                                        r7 = r10;
                                        O2 = defpackage.cjv.o(r7);
                                    } else {
                                        defpackage.cge cgeVar13 = ((defpackage.cwo) r6).C;
                                        ?? bzcVar8 = r10;
                                        ?? r11 = r6;
                                        int i21 = 0;
                                        while (cgeVar13 != null) {
                                            if ((cgeVar13.r & 2097152) != 0) {
                                                i21++;
                                                if (i21 == 1) {
                                                    r7 = r10;
                                                    r7 = r10;
                                                    bzcVar8 = bzcVar8;
                                                    r11 = cgeVar13;
                                                } else {
                                                    if (bzcVar8 == 0) {
                                                        bzcVar8 = new defpackage.bzc(new defpackage.cge[i]);
                                                    }
                                                    if (r11 != 0) {
                                                        bzcVar8.n(r11);
                                                    }
                                                    bzcVar8.n(cgeVar13);
                                                    r11 = 0;
                                                }
                                            } else {
                                                r7 = r10;
                                                r7 = r10;
                                            }
                                            cgeVar13 = cgeVar13.u;
                                            i = 16;
                                            r11 = r11;
                                            bzcVar8 = bzcVar8;
                                        }
                                        r7 = r10;
                                        r7 = r10;
                                        if (i21 != 1) {
                                            r7 = bzcVar8;
                                            r7 = r10;
                                            r7 = r10;
                                            r7 = r10;
                                            O2 = defpackage.cjv.o(r7);
                                        } else {
                                            O2 = r11;
                                            r7 = bzcVar8;
                                        }
                                    }
                                    i = 16;
                                    r6 = O2;
                                    r10 = r7;
                                }
                            }
                            cgeVar12 = cgeVar12.t;
                            i = 16;
                        }
                    }
                    cxlVarR5 = cxlVarR5.l();
                    cgeVar12 = (cxlVarR5 == null || (cygVar4 = cxlVarR5.v) == null) ? null : cygVar4.e;
                    i = 16;
                }
                cpvVar2 = (defpackage.cpv) r6;
            } else {
                cpvVar2 = null;
            }
            if (cpvVar2 != null) {
                if (!cpvVar2.M().A) {
                    defpackage.csc.c("visitAncestors called on an unattached node");
                }
                defpackage.cge cgeVar14 = cpvVar2.M().t;
                defpackage.cxl cxlVarR6 = defpackage.cjv.r(cpvVar2);
                java.util.ArrayList arrayList4 = null;
                while (cxlVarR6 != null) {
                    if ((cxlVarR6.v.f.s & 2097152) != 0) {
                        while (cgeVar14 != null) {
                            if ((cgeVar14.r & 2097152) != 0) {
                                defpackage.cge cgeVarO3 = cgeVar14;
                                defpackage.bzc bzcVar9 = null;
                                while (cgeVarO3 != null) {
                                    if (cgeVarO3 instanceof defpackage.cpv) {
                                        if (arrayList4 == null) {
                                            arrayList4 = new java.util.ArrayList();
                                        }
                                        arrayList4.add(cgeVarO3);
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (z3 && (cgeVarO3.r & 2097152) != 0 && (cgeVarO3 instanceof defpackage.cwo)) {
                                        defpackage.bzc bzcVar10 = bzcVar9;
                                        defpackage.cge cgeVar15 = cgeVarO3;
                                        int i22 = 0;
                                        for (defpackage.cge cgeVar16 = ((defpackage.cwo) cgeVarO3).C; cgeVar16 != null; cgeVar16 = cgeVar16.u) {
                                            if ((cgeVar16.r & 2097152) != 0) {
                                                i22++;
                                                if (i22 == 1) {
                                                    cgeVar15 = cgeVar16;
                                                } else {
                                                    if (bzcVar10 == null) {
                                                        bzcVar10 = new defpackage.bzc(new defpackage.cge[16]);
                                                    }
                                                    if (cgeVar15 != null) {
                                                        bzcVar10.n(cgeVar15);
                                                    }
                                                    bzcVar10.n(cgeVar16);
                                                    cgeVar15 = null;
                                                }
                                            }
                                        }
                                        if (i22 != 1) {
                                            bzcVar9 = bzcVar10;
                                        } else {
                                            cgeVarO3 = cgeVar15;
                                            bzcVar9 = bzcVar10;
                                        }
                                    }
                                    cgeVarO3 = defpackage.cjv.o(bzcVar9);
                                }
                            }
                            cgeVar14 = cgeVar14.t;
                        }
                    }
                    cxlVarR6 = cxlVarR6.l();
                    cgeVar14 = (cxlVarR6 == null || (cygVar3 = cxlVarR6.v) == null) ? null : cygVar3.e;
                }
                if (arrayList4 != null && (size2 = arrayList4.size() - 1) >= 0) {
                    while (true) {
                        int i23 = size2 - 1;
                        ((defpackage.cpv) arrayList4.get(size2)).H(aahgVar, defpackage.cqv.a);
                        if (i23 < 0) {
                            break;
                        }
                        size2 = i23;
                    }
                }
                cpvVar2.H(aahgVar, defpackage.cqv.a);
                defpackage.cqv cqvVar = defpackage.cqv.b;
                cpvVar2.H(aahgVar, cqvVar);
                if (arrayList4 != null) {
                    int size6 = arrayList4.size();
                    for (int i24 = 0; i24 < size6; i24++) {
                        ((defpackage.cpv) arrayList4.get(i24)).H(aahgVar, cqvVar);
                    }
                }
                if (arrayList4 != null && (size = arrayList4.size() - 1) >= 0) {
                    while (true) {
                        int i25 = size - 1;
                        ((defpackage.cpv) arrayList4.get(size)).H(aahgVar, defpackage.cqv.c);
                        if (i25 < 0) {
                            break;
                        }
                        size = i25;
                    }
                }
                cpvVar2.H(aahgVar, defpackage.cqv.c);
            }
            ?? r1 = aahgVar.b;
            int size7 = r1.size();
            int i26 = 0;
            while (true) {
                if (i26 < size7) {
                    if (((cpu) r1.get(i26)).g) {
                        z2 = true;
                        break;
                    }
                    i26++;
                }
            }
            dbtVar = this.aF;
            android.view.MotionEvent motionEvent2 = (android.view.MotionEvent) aahgVar.c;
            action = motionEvent2.getAction();
            if (action != 0) {
                dbtVar.b = aahgVar.a;
                dbtVar.c = false;
            } else if ((action != 1 || action == 2) && z2) {
                dbtVar.a();
            }
            dbtVar.d.onTouchEvent(motionEvent2);
            return true;
        }
        java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        z2 = false;
        dbtVar = this.aF;
        android.view.MotionEvent motionEvent3 = (android.view.MotionEvent) aahgVar.c;
        action = motionEvent3.getAction();
        if (action != 0) {
            dbtVar.b = aahgVar.a;
            dbtVar.c = false;
        } else if (action != 1) {
            dbtVar.a();
        } else {
            dbtVar.a();
        }
        dbtVar.d.onTouchEvent(motionEvent3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0124, code lost:
    
        if (am(r19) == false) goto L74;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (!isFocused()) {
            return this.J.h(keyEvent, new defpackage.bso(this, keyEvent, 6));
        }
        defpackage.dbx dbxVar = P().i;
        defpackage.dco.a.b(new defpackage.crk(keyEvent.getMetaState()));
        return this.J.h(keyEvent, new defpackage.bmd(3)) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:115:0x015f  */
    /* JADX WARN: Code duplicated, block: B:136:0x019e  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:161:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:163:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f8 A[LOOP:13: B:162:0x01ea->B:165:0x01f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x0202 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:215:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v11, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v12, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [cge] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v9, types: [cge] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [bzc] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23, types: [cge] */
    /* JADX WARN: Type inference failed for: r8v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30, types: [bzc] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33, types: [bzc] */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v8 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(android.view.KeyEvent keyEvent) {
        defpackage.cqb cqbVar;
        ?? M;
        ?? bzcVar;
        ?? M2;
        ?? bzcVar2;
        int size;
        int i;
        int size2;
        defpackage.cyg cygVar;
        boolean z;
        ?? O;
        defpackage.cyg cygVar2;
        if (isFocused()) {
            defpackage.cik cikVar = this.J;
            if (cikVar.c.a) {
                java.lang.System.out.println((java.lang.Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                defpackage.cjc cjcVarL = defpackage.mw.l(cikVar.b);
                if (cjcVarL != null) {
                    if (!cjcVarL.q.A) {
                        defpackage.csc.c("visitAncestors called on an unattached node");
                    }
                    defpackage.cge cgeVar = cjcVarL.q;
                    defpackage.cxl cxlVarR = defpackage.cjv.r(cjcVarL);
                    loop0: while (true) {
                        if (cxlVarR == null) {
                            O = 0;
                            break;
                        }
                        if ((cxlVarR.v.f.s & 131072) != 0) {
                            while (cgeVar != null) {
                                if ((cgeVar.r & 131072) != 0) {
                                    ?? bzcVar3 = 0;
                                    O = cgeVar;
                                    while (O != 0) {
                                        if (O instanceof defpackage.cqb) {
                                            break loop0;
                                        }
                                        if ((O.r & 131072) != 0 && (O instanceof defpackage.cwo)) {
                                            defpackage.cge cgeVar2 = ((defpackage.cwo) O).C;
                                            int i2 = 0;
                                            while (cgeVar2 != null) {
                                                if ((cgeVar2.r & 131072) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        O = O;
                                                        bzcVar3 = bzcVar3;
                                                        bzcVar3 = bzcVar3;
                                                        O = cgeVar2;
                                                    } else {
                                                        if (bzcVar3 == 0) {
                                                            bzcVar3 = new defpackage.bzc(new defpackage.cge[16]);
                                                        }
                                                        if (O != 0) {
                                                            bzcVar3.n(O);
                                                        }
                                                        bzcVar3.n(cgeVar2);
                                                        O = 0;
                                                    }
                                                } else {
                                                    O = O;
                                                    bzcVar3 = bzcVar3;
                                                }
                                                cgeVar2 = cgeVar2.u;
                                                O = O;
                                                bzcVar3 = bzcVar3;
                                            }
                                            if (i2 != 1) {
                                                O = O;
                                                bzcVar3 = bzcVar3;
                                            } else {
                                                O = O;
                                                bzcVar3 = bzcVar3;
                                            }
                                        }
                                        O = defpackage.cjv.o(bzcVar3);
                                    }
                                }
                                cgeVar = cgeVar.t;
                            }
                        }
                        cxlVarR = cxlVarR.l();
                        cgeVar = (cxlVarR == null || (cygVar2 = cxlVarR.v) == null) ? null : cygVar2.e;
                    }
                    cqbVar = (defpackage.cqb) O;
                } else {
                    cqbVar = null;
                }
                if (cqbVar != null) {
                    if (!cqbVar.M().A) {
                        defpackage.csc.c("visitAncestors called on an unattached node");
                    }
                    defpackage.cge cgeVar3 = cqbVar.M().t;
                    defpackage.cxl cxlVarR2 = defpackage.cjv.r(cqbVar);
                    java.util.ArrayList arrayList = null;
                    while (cxlVarR2 != null) {
                        if ((cxlVarR2.v.f.s & 131072) != 0) {
                            while (cgeVar3 != null) {
                                if ((cgeVar3.r & 131072) != 0) {
                                    defpackage.cge cgeVarO = cgeVar3;
                                    defpackage.bzc bzcVar4 = null;
                                    while (cgeVarO != null) {
                                        if (cgeVarO instanceof defpackage.cqb) {
                                            if (arrayList == null) {
                                                arrayList = new java.util.ArrayList();
                                            }
                                            arrayList.add(cgeVarO);
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        if (z && (cgeVarO.r & 131072) != 0 && (cgeVarO instanceof defpackage.cwo)) {
                                            int i3 = 0;
                                            for (defpackage.cge cgeVar4 = ((defpackage.cwo) cgeVarO).C; cgeVar4 != null; cgeVar4 = cgeVar4.u) {
                                                if ((cgeVar4.r & 131072) != 0) {
                                                    i3++;
                                                    if (i3 == 1) {
                                                        cgeVarO = cgeVar4;
                                                    } else {
                                                        if (bzcVar4 == null) {
                                                            bzcVar4 = new defpackage.bzc(new defpackage.cge[16]);
                                                        }
                                                        if (cgeVarO != null) {
                                                            bzcVar4.n(cgeVarO);
                                                        }
                                                        bzcVar4.n(cgeVar4);
                                                        cgeVarO = null;
                                                    }
                                                }
                                            }
                                            if (i3 != 1) {
                                            }
                                        }
                                        cgeVarO = defpackage.cjv.o(bzcVar4);
                                    }
                                }
                                cgeVar3 = cgeVar3.t;
                            }
                        }
                        cxlVarR2 = cxlVarR2.l();
                        cgeVar3 = (cxlVarR2 == null || (cygVar = cxlVarR2.v) == null) ? null : cygVar.e;
                    }
                    if (arrayList == null || (size2 = arrayList.size() - 1) < 0) {
                        M = cqbVar.M();
                        bzcVar = 0;
                        while (M != 0) {
                            if (M instanceof defpackage.cqb) {
                                if (((defpackage.cqb) M).b()) {
                                }
                            } else if ((M.r & 131072) == 0 && (M instanceof defpackage.cwo)) {
                                defpackage.cge cgeVar5 = ((defpackage.cwo) M).C;
                                int i4 = 0;
                                while (cgeVar5 != null) {
                                    if ((cgeVar5.r & 131072) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            M = M;
                                            bzcVar = bzcVar;
                                            bzcVar = bzcVar;
                                            M = cgeVar5;
                                        } else {
                                            if (bzcVar == 0) {
                                                bzcVar = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (M != 0) {
                                                bzcVar.n(M);
                                            }
                                            bzcVar.n(cgeVar5);
                                            M = 0;
                                        }
                                    } else {
                                        M = M;
                                        bzcVar = bzcVar;
                                    }
                                    cgeVar5 = cgeVar5.u;
                                    M = M;
                                    bzcVar = bzcVar;
                                }
                                if (i4 != 1) {
                                    M = M;
                                    bzcVar = bzcVar;
                                } else {
                                    M = M;
                                    bzcVar = bzcVar;
                                }
                            }
                            M = defpackage.cjv.o(bzcVar);
                        }
                        M2 = cqbVar.M();
                        bzcVar2 = 0;
                        while (M2 != 0) {
                            if (M2 instanceof defpackage.cqb) {
                                if (((defpackage.cqb) M2).a()) {
                                }
                            } else if ((M2.r & 131072) == 0 && (M2 instanceof defpackage.cwo)) {
                                defpackage.cge cgeVar6 = ((defpackage.cwo) M2).C;
                                int i5 = 0;
                                while (cgeVar6 != null) {
                                    if ((cgeVar6.r & 131072) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            M2 = M2;
                                            bzcVar2 = bzcVar2;
                                            bzcVar2 = bzcVar2;
                                            M2 = cgeVar6;
                                        } else {
                                            if (bzcVar2 == 0) {
                                                bzcVar2 = new defpackage.bzc(new defpackage.cge[16]);
                                            }
                                            if (M2 != 0) {
                                                bzcVar2.n(M2);
                                            }
                                            bzcVar2.n(cgeVar6);
                                            M2 = 0;
                                        }
                                    } else {
                                        M2 = M2;
                                        bzcVar2 = bzcVar2;
                                    }
                                    cgeVar6 = cgeVar6.u;
                                    M2 = M2;
                                    bzcVar2 = bzcVar2;
                                }
                                if (i5 != 1) {
                                    M2 = M2;
                                    bzcVar2 = bzcVar2;
                                } else {
                                    M2 = M2;
                                    bzcVar2 = bzcVar2;
                                }
                            }
                            M2 = defpackage.cjv.o(bzcVar2);
                        }
                        if (arrayList != null) {
                            size = arrayList.size();
                            for (i = 0; i < size; i++) {
                                if (!((defpackage.cqb) arrayList.get(i)).a()) {
                                }
                            }
                        }
                    } else {
                        while (true) {
                            int i6 = size2 - 1;
                            if (!((defpackage.cqb) arrayList.get(size2)).b()) {
                                if (i6 < 0) {
                                    break;
                                }
                                size2 = i6;
                            }
                        }
                        M = cqbVar.M();
                        bzcVar = 0;
                        while (M != 0) {
                            if (M instanceof defpackage.cqb) {
                                if (((defpackage.cqb) M).b()) {
                                }
                            } else if ((M.r & 131072) == 0) {
                            }
                            M = defpackage.cjv.o(bzcVar);
                        }
                        M2 = cqbVar.M();
                        bzcVar2 = 0;
                        while (M2 != 0) {
                            if (M2 instanceof defpackage.cqb) {
                                if (((defpackage.cqb) M2).a()) {
                                }
                            } else if ((M2.r & 131072) == 0) {
                            }
                            M2 = defpackage.cjv.o(bzcVar2);
                        }
                        if (arrayList != null) {
                            size = arrayList.size();
                            while (i < size) {
                                if (!((defpackage.cqb) arrayList.get(i)).a()) {
                                }
                            }
                        }
                    }
                }
            }
            if (super.dispatchKeyEventPreIme(keyEvent)) {
                return false;
            }
        } else if (super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(android.view.ViewStructure viewStructure, int i) {
        this.aI = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.aI = false;
            ah(viewStructure);
        } catch (java.lang.Throwable th) {
            this.aI = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Object dbeVar;
        defpackage.cik cikVar;
        defpackage.cjc cjcVarB;
        if (this.G) {
            java.lang.Runnable runnable = this.aD;
            removeCallbacks(runnable);
            android.view.MotionEvent motionEvent2 = this.E;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() != 0 || an(motionEvent, motionEvent2)) {
                runnable.run();
            } else {
                this.G = false;
            }
        }
        if (!ao(motionEvent) && isAttachedToWindow()) {
            if (motionEvent.getActionMasked() == 2) {
                am(motionEvent);
            }
            int iAb = ab(motionEvent);
            if ((iAb & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                java.lang.Object parent = getParent();
                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                if (view == null || (dbeVar = view.getTag(2131427556)) == null) {
                    dbeVar = new dbe();
                }
                if (defpackage.afga.f(dbeVar, new dbe()) && (cjcVarB = (cikVar = this.J).b()) != null) {
                    defpackage.ctc ctcVarP = defpackage.cjv.p(cjcVarB);
                    if (!defpackage.csc.g(ctcVarP).o(ctcVarP, true).g((((long) java.lang.Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) java.lang.Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        cikVar.k(false, true, 8);
                    }
                }
            }
            if ((iAb & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.epl
    public final void eF(defpackage.eqg eqgVar) {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            this.x = defpackage.dai.m();
        }
        defpackage.dbz dbzVar = this.af;
        if (dbzVar != null) {
            defpackage.dcy dcyVar = this.I;
            dcyVar.getClass();
            dbzVar.b(dcyVar);
        }
    }

    @Override // defpackage.epl
    public final void eT(defpackage.eqg eqgVar) {
        defpackage.dbz dbzVar = this.af;
        if (dbzVar != null) {
            defpackage.dby dbyVar = dbzVar.a;
            if (dbyVar.b()) {
                dbzVar.a(null);
                return;
            }
            defpackage.cdm cdmVar = dbyVar.a;
            if (cdmVar.b) {
                return;
            }
            if (!cdmVar.c) {
                defpackage.cdp.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!cdmVar.d.d()) {
                defpackage.cdp.a("Attempted to start retaining exited values with pending exited values");
            }
            cdmVar.c = false;
        }
    }

    public final android.view.View findViewByAccessibilityIdTraversal(int i) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        defpackage.dai daiVar = S;
        try {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                return daiVar.l(i, this);
            }
            java.lang.reflect.Method declaredMethod = java.lang.Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", java.lang.Integer.TYPE);
            declaredMethod.setAccessible(true);
            java.lang.Object objInvoke = declaredMethod.invoke(this, java.lang.Integer.valueOf(i));
            if (objInvoke instanceof android.view.View) {
                return (android.view.View) objInvoke;
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final android.view.View focusSearch(android.view.View view, int i) {
        defpackage.cjj cjjVarB;
        if (view == null || this.z.b) {
            return super.focusSearch(view, i);
        }
        android.view.View rootView = getRootView();
        rootView.getClass();
        android.view.View viewFindNextFocus = android.view.FocusFinder.getInstance().findNextFocus((android.view.ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !defpackage.dai.k(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view != this || (cjjVarB = this.J.c()) == null) {
            cjjVarB = defpackage.cie.b(view, this);
        }
        defpackage.chz chzVarA = defpackage.cie.a(i);
        int i2 = chzVarA != null ? chzVarA.a : 6;
        defpackage.afgv afgvVar = new defpackage.afgv();
        if (this.J.d(i2, cjjVarB, new defpackage.chs(afgvVar, 14)) == null) {
            return view;
        }
        java.lang.Object obj = afgvVar.a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || defpackage.ly.p(i2) || defpackage.rj.l(defpackage.mw.n((defpackage.cjc) obj), defpackage.cie.b(viewFindNextFocus, this), cjjVarB, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    @Override // defpackage.cjf
    public final defpackage.cjj g() {
        if (isFocused()) {
            return this.J.c();
        }
        android.view.View viewFindFocus = findFocus();
        if (viewFindFocus == null) {
            return null;
        }
        return defpackage.cie.b(viewFindFocus, this);
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        defpackage.cjj cjjVarG = g();
        if (cjjVarG == null) {
            if (defpackage.afga.f(this.J.d(6, null, new defpackage.cmr(11)), java.lang.Boolean.TRUE)) {
                super.getFocusedRect(rect);
                return;
            } else {
                rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                return;
            }
        }
        rect.left = java.lang.Math.round(cjjVarG.b);
        rect.top = java.lang.Math.round(cjjVarG.c);
        rect.right = java.lang.Math.round(cjjVarG.d);
        rect.bottom = java.lang.Math.round(cjjVarG.e);
    }

    @Override // android.view.View
    public final int getImportantForAutofill() {
        return 1;
    }

    @Override // defpackage.cjf
    public final void h() {
        if (isFocused() || hasFocus()) {
            super.clearFocus();
        } else if (hasFocus()) {
            android.view.View viewFindFocus = findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            super.clearFocus();
        }
    }

    @Override // defpackage.cjf
    public final boolean i(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        java.lang.Integer numD = defpackage.cie.d(i);
        if (numD == null) {
            defpackage.csc.a("Invalid focus direction");
            throw new defpackage.afap();
        }
        defpackage.cik cikVar = this.J;
        int iIntValue = numD.intValue();
        defpackage.cjc cjcVarB = cikVar.b();
        if (cjcVarB == null) {
            throw new java.lang.IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        java.lang.Integer numD2 = defpackage.cie.d(i);
        if (numD2 == null) {
            defpackage.csc.a("Invalid focus direction");
            throw new defpackage.afap();
        }
        int iIntValue2 = numD2.intValue();
        android.view.View viewH = defpackage.cjv.r(cjcVarB).h();
        android.view.View viewFindFocus = findFocus();
        android.view.FocusFinder focusFinder = android.view.FocusFinder.getInstance();
        android.view.View rootView = getRootView();
        rootView.getClass();
        android.view.View viewFindNextFocus = focusFinder.findNextFocus((android.view.ViewGroup) rootView, viewFindFocus, iIntValue2);
        if (viewFindNextFocus == null || viewH == null || !defpackage.dai.k(viewH, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (viewFindNextFocus != null) {
            return defpackage.cie.e(viewFindNextFocus, java.lang.Integer.valueOf(iIntValue), null);
        }
        return false;
    }

    @Override // defpackage.cjf
    public final boolean j() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    @Override // defpackage.cqp
    public final void k(float[] fArr) {
        T();
        defpackage.ckq.d(fArr, this.A);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (this.au >> 32));
        long j = this.au & 4294967295L;
        float[] fArr2 = this.aq;
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) j);
        defpackage.ckq.c(fArr2);
        defpackage.ckq.g(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        defpackage.dai.i(fArr, fArr2);
    }

    @Override // defpackage.crm
    public final long l(long j) {
        T();
        long jA = defpackage.ckq.a(this.A, j);
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (jA >> 32)) + java.lang.Float.intBitsToFloat((int) (this.au >> 32));
        return (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (jA & 4294967295L)) + java.lang.Float.intBitsToFloat((int) (this.au & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    @Override // defpackage.crm
    public final long m(long j) {
        T();
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) - java.lang.Float.intBitsToFloat((int) (this.au >> 32));
        return defpackage.ckq.a(this.B, (((long) java.lang.Float.floatToRawIntBits(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) - java.lang.Float.intBitsToFloat((int) (this.au & 4294967295L)))) & 4294967295L) | (java.lang.Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Override // defpackage.cyr
    public final void n(defpackage.afer aferVar) {
        defpackage.afbz afbzVar = this.i;
        boolean zIsEmpty = afbzVar.isEmpty();
        afbzVar.addLast(aferVar);
        if (zIsEmpty) {
            android.os.Handler handler = getHandler();
            if (handler == null) {
                throw new java.lang.IllegalArgumentException("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
            handler.postAtFrontOfQueue(this.ag);
        }
    }

    @Override // defpackage.cyu
    public final defpackage.cys o(defpackage.affg affgVar, defpackage.afer aferVar, defpackage.cmq cmqVar) {
        java.lang.Object obj;
        if (cmqVar != null) {
            return new defpackage.dbr(cmqVar, null, this, affgVar, aferVar);
        }
        defpackage.bil bilVar = this.U;
        bilVar.l();
        do {
            defpackage.bzc bzcVar = (defpackage.bzc) bilVar.b;
            int i = bzcVar.b;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((java.lang.ref.Reference) bzcVar.c(i - 1)).get();
        } while (obj == null);
        defpackage.cys cysVar = (defpackage.cys) obj;
        if (cysVar != null) {
            cysVar.h(affgVar, aferVar);
            return cysVar;
        }
        defpackage.cjq cjqVar = this.P;
        return new defpackage.dbr(cjqVar.a(), cjqVar, this, affgVar, aferVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        defpackage.cdo cdoVar;
        java.lang.Object obj;
        super.onAttachedToWindow();
        defpackage.cxl cxlVar = this.o;
        if (!cxlVar.am()) {
            cxlVar.y(this);
        }
        aj(true);
        if (android.os.Build.VERSION.SDK_INT < 30) {
            this.x = defpackage.dai.m();
        }
        defpackage.csx csxVar = this.n;
        if (csxVar != null) {
            csxVar.onViewAttachedToWindow(this);
        }
        P().g();
        ag(cxlVar);
        af(cxlVar);
        ((defpackage.cez) this.w.a).c();
        defpackage.czz czzVarN = N();
        if (czzVarN == null) {
            throw new java.lang.IllegalStateException("Expected the view to be attached to window.");
        }
        czzVarN.n(new defpackage.cew(this, 10));
        P().b();
        defpackage.esa esaVarC = P().c();
        defpackage.dcy dcyVar = this.I;
        if (esaVarC == null || dcyVar == null) {
            cdoVar = null;
        } else {
            defpackage.erz viewModelStore = esaVarC.getViewModelStore();
            defpackage.erx erxVar = new defpackage.erx();
            defpackage.esg esgVar = defpackage.esg.a;
            viewModelStore.getClass();
            esgVar.getClass();
            defpackage.dca dcaVar = (defpackage.dca) new defpackage.ery(viewModelStore, erxVar, esgVar).b(defpackage.afgw.a.getOrCreateKotlinClass(defpackage.dca.class));
            java.lang.Object parent = getParent();
            parent.getClass();
            int id = ((android.view.View) parent).getId();
            defpackage.zo zoVar = dcaVar.a;
            java.lang.Object objA = zoVar.a(id);
            if (objA == null) {
                objA = new defpackage.aan(1);
                zoVar.g(id, objA);
            }
            defpackage.aan aanVar = (defpackage.aan) objA;
            java.lang.Object[] objArr = aanVar.a;
            int i = aanVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((defpackage.dbz) obj).c) {
                    break;
                } else {
                    i2++;
                }
            }
            defpackage.dbz dbzVar = (defpackage.dbz) obj;
            if (dbzVar == null) {
                dbzVar = new defpackage.dbz();
                aanVar.p(dbzVar);
            }
            dbzVar.c = true;
            this.af = dbzVar;
            cdoVar = dbzVar.b;
        }
        if (cdoVar == null) {
            cdoVar = defpackage.cdk.a;
        }
        this.h = cdoVar;
        defpackage.affc affcVar = this.C;
        if (affcVar != null) {
            affcVar.invoke(P());
            this.C = null;
        }
        defpackage.epy lifecycle = P().b().getLifecycle();
        lifecycle.c(this);
        lifecycle.c(this.r);
        aa().M(true != isInTouchMode() ? 2 : 1);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.dbb.c(this);
        }
        defpackage.cgp cgpVar = this.Q;
        if (cgpVar != null) {
            this.J.e.p(cgpVar);
            ((defpackage.aan) this.W.d).p(cgpVar);
        }
        this.J.e.p(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        defpackage.tc tcVar = (defpackage.tc) this.aw.get();
        defpackage.dal dalVar = (defpackage.dal) (tcVar != null ? tcVar.a : null);
        if (dalVar == null) {
            return ac().b;
        }
        defpackage.tc tcVar2 = (defpackage.tc) dalVar.c.get();
        rie rieVar = (rie) (tcVar2 != null ? tcVar2.a : null);
        return (rieVar == null || rieVar.a) ? false : true;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ak(configuration);
    }

    @Override // android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        int i;
        defpackage.tc tcVar = (defpackage.tc) this.aw.get();
        defpackage.dal dalVar = (defpackage.dal) (tcVar != null ? tcVar.a : null);
        int i2 = 7;
        if (dalVar == null) {
            defpackage.dkf dkfVarAc = ac();
            if (!dkfVarAc.b) {
                return null;
            }
            defpackage.djl djlVar = dkfVarAc.f;
            defpackage.dkd dkdVar = dkfVarAc.e;
            int i3 = djlVar.f;
            if (i3 == 1) {
                i2 = djlVar.b ? 6 : 0;
            } else if (i3 == 0) {
                i2 = 1;
            } else if (i3 == 2) {
                i2 = 2;
            } else if (i3 == 6) {
                i2 = 5;
            } else if (i3 != 5) {
                if (i3 == 3) {
                    i2 = 3;
                } else if (i3 == 4) {
                    i2 = 4;
                } else {
                    if (i3 != 7) {
                        throw new java.lang.IllegalStateException("invalid ImeAction");
                    }
                }
            }
            editorInfo.imeOptions = i2;
            int i4 = djlVar.e;
            editorInfo.inputType = 1;
            if (!djlVar.b && (editorInfo.inputType & 15) == 1) {
                editorInfo.inputType |= 131072;
                if (i3 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 15) == 1) {
                int i5 = djlVar.c;
                boolean z = djlVar.d;
                editorInfo.inputType |= 32768;
            }
            long j = dkdVar.b;
            long j2 = defpackage.dgc.a;
            editorInfo.initialSelStart = (int) (j >> 32);
            editorInfo.initialSelEnd = (int) (j & 4294967295L);
            edz.a(editorInfo, dkdVar.a());
            editorInfo.imeOptions |= 33554432;
            defpackage.emx emxVar = defpackage.emx.b;
            defpackage.dkd dkdVar2 = dkfVarAc.e;
            boolean z2 = dkfVarAc.f.d;
            defpackage.djz djzVar = new defpackage.djz(dkdVar2, new defpackage.izq(dkfVarAc));
            dkfVarAc.g.add(new java.lang.ref.WeakReference(djzVar));
            return djzVar;
        }
        defpackage.tc tcVar2 = (defpackage.tc) dalVar.c.get();
        rie rieVar = (rie) (tcVar2 != null ? tcVar2.a : null);
        if (rieVar == null) {
            return null;
        }
        synchronized (rieVar.e) {
            if (rieVar.a) {
                return null;
            }
            java.lang.Object obj = rieVar.d;
            java.lang.String strA = ((defpackage.bis) obj).g.a();
            long j3 = ((defpackage.bis) obj).g.b;
            defpackage.djl djlVar2 = ((defpackage.bis) obj).h;
            int i6 = djlVar2.f;
            if (i6 == 1) {
                i = djlVar2.b ? 6 : 0;
            } else if (i6 == 0) {
                i = 1;
            } else if (i6 == 2) {
                i = 2;
            } else if (i6 == 6) {
                i = 5;
            } else if (i6 == 5) {
                i = 7;
            } else if (i6 == 3) {
                i = 3;
            } else if (i6 == 4) {
                i = 4;
            } else if (i6 != 7) {
                throw new java.lang.IllegalStateException("invalid ImeAction");
            }
            editorInfo.imeOptions = i;
            defpackage.dkl dklVar = djlVar2.g;
            if (defpackage.afga.f(dklVar, defpackage.dkl.a)) {
                a$.ExternalSyntheticApiModelOutline2.m(editorInfo, (android.os.LocaleList) null);
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(dklVar, 10));
                java.util.Iterator<E> it = dklVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((defpackage.dkk) it.next()).a);
                }
                java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
                a$.ExternalSyntheticApiModelOutline2.m(editorInfo, new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length)));
            }
            int i7 = djlVar2.e;
            editorInfo.inputType = 1;
            if (!djlVar2.b && (editorInfo.inputType & 15) == 1) {
                editorInfo.inputType |= 131072;
                if (i6 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
            if ((editorInfo.inputType & 15) == 1) {
                int i8 = djlVar2.c;
                boolean z3 = djlVar2.d;
                editorInfo.inputType |= 32768;
                if (android.os.Build.VERSION.SDK_INT >= 37) {
                    editorInfo.inputType |= 2097152;
                }
            }
            long j4 = defpackage.dgc.a;
            editorInfo.initialSelStart = (int) (j3 >> 32);
            editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
            edz.a(editorInfo, strA);
            editorInfo.imeOptions |= 33554432;
            if (defpackage.bhz.a) {
                edz.b(editorInfo, true);
                axd$.ExternalSyntheticApiModelOutline0.m(editorInfo, defpackage.afga.ac(axd$.ExternalSyntheticApiModelOutline0.m$3(), axd$.ExternalSyntheticApiModelOutline0.m(), axd$.ExternalSyntheticApiModelOutline0.m$1(), axd$.ExternalSyntheticApiModelOutline0.m$2(), axd$.ExternalSyntheticApiModelOutline0.m$4(), axd$.ExternalSyntheticApiModelOutline0.m$5(), axd$.ExternalSyntheticApiModelOutline0.m$6()));
                axd$.ExternalSyntheticApiModelOutline0.m(editorInfo, defpackage.afga.cc(new java.lang.Class[]{axd$.ExternalSyntheticApiModelOutline0.m$3(), axd$.ExternalSyntheticApiModelOutline0.m(), axd$.ExternalSyntheticApiModelOutline0.m$1(), axd$.ExternalSyntheticApiModelOutline0.m$2()}));
            } else {
                edz.b(editorInfo, false);
            }
            defpackage.emx emxVar2 = defpackage.emx.b;
            defpackage.dkd dkdVar3 = ((defpackage.bis) obj).g;
            boolean z4 = ((defpackage.bis) obj).h.d;
            defpackage.bit bitVar = new defpackage.bit(dkdVar3, new defpackage.izq(obj), ((defpackage.bis) obj).d, ((defpackage.bis) obj).e, ((defpackage.bis) obj).f);
            ((defpackage.bis) obj).i.add(new java.lang.ref.WeakReference(bitVar));
            defpackage.chs chsVar = new defpackage.chs(rieVar, 18);
            android.view.inputmethod.InputConnection djsVar = android.os.Build.VERSION.SDK_INT >= 34 ? new defpackage.djs(bitVar, chsVar) : new defpackage.djr(bitVar, chsVar);
            ((defpackage.bzc) rieVar.b).n(new czk(djsVar));
            return djsVar;
        }
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, java.util.function.Consumer consumer) {
        java.lang.Object obj;
        for (long j : jArr) {
            defpackage.cgx cgxVar = this.r;
            defpackage.hio hioVar = (defpackage.hio) cgxVar.h().a((int) j);
            if (hioVar != null && (obj = hioVar.b) != null) {
                defpackage.dec decVar = (defpackage.dec) obj;
                android.view.translation.ViewTranslationRequest.Builder builder = new android.view.translation.ViewTranslationRequest.Builder(a$.ExternalSyntheticApiModelOutline1.m(cgxVar.a), decVar.c);
                java.util.List list = (java.util.List) decVar.b.g(defpackage.def.D);
                if (list != null) {
                    a$.ExternalSyntheticApiModelOutline0.m(builder, "android:text", a$.ExternalSyntheticApiModelOutline0.m(new defpackage.dfb(defpackage.dmh.c(list, "\n", null, null, null, 62))));
                    a$.ExternalSyntheticApiModelOutline2.m(consumer, a$.ExternalSyntheticApiModelOutline0.m(builder));
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aj(false);
        defpackage.dbt dbtVar = this.aF;
        dbtVar.b = 0;
        dbtVar.c = true;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        dbtVar.d.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        defpackage.csx csxVar = this.n;
        if (csxVar != null) {
            csxVar.onViewDetachedFromWindow(this);
        }
        android.view.View view = this.ai;
        if (defpackage.a.O() && view != null) {
            removeView(view);
        }
        if (android.os.Build.VERSION.SDK_INT > 28) {
            defpackage.aan aanVar = L;
            synchronized (aanVar) {
                aanVar.o(this);
            }
        }
        P().f();
        defpackage.cez cezVar = (defpackage.cez) this.w.a;
        cezVar.d();
        cezVar.a();
        defpackage.epy lifecycle = P().b().getLifecycle();
        lifecycle.d(this.r);
        lifecycle.d(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        defpackage.dbz dbzVar = this.af;
        if (dbzVar != null) {
            dbzVar.c = false;
        }
        this.af = null;
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            defpackage.dbb.b(this);
        }
        defpackage.cgp cgpVar = this.Q;
        if (cgpVar != null) {
            ((defpackage.aan) this.W.d).o(cgpVar);
            this.J.e.o(cgpVar);
        }
        defpackage.dep depVar = this.p;
        depVar.e = depVar.c.a(0L, 0L, null, 0, 0);
        depVar.c();
        depVar.g();
        this.J.e.o(this);
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, android.graphics.Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        defpackage.cik cikVar = this.J;
        defpackage.mw.q(cikVar.b, true);
        if (cikVar.b() != null) {
            defpackage.cjc cjcVarB = cikVar.b();
            cikVar.g(null);
            if (cjcVarB != null) {
                cjcVarB.l(defpackage.cja.a, defpackage.cja.d);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.as = 0L;
        al();
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 32 || i >= 34) {
            return;
        }
        ak(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.as = 0L;
        this.z.i(this.aG);
        this.am = null;
        al();
        defpackage.dau dauVar = this.y;
        if (dauVar != null) {
            dauVar.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        defpackage.cxl cxlVar = this.o;
        if (!cxlVar.am()) {
            cxlVar.y(this);
        }
        if (!isAttachedToWindow()) {
            ag(cxlVar);
        }
        long jAq = aq(i);
        long jAq2 = aq(i2);
        long jK = defpackage.dln.k((int) (jAq >>> 32), (int) (jAq & 4294967295L), (int) (jAq2 >>> 32), (int) (4294967295L & jAq2));
        defpackage.dlm dlmVar = this.am;
        if (dlmVar == null) {
            this.am = new defpackage.dlm(jK);
            this.an = false;
        } else if (dlmVar.a != jK) {
            this.an = true;
        }
        defpackage.cxy cxyVar = this.z;
        defpackage.dlm dlmVar2 = cxyVar.f;
        if (dlmVar2 == null || dlmVar2.a != jK) {
            if (cxyVar.b) {
                defpackage.csc.b("updateRootConstraints called while measuring");
            }
            cxyVar.f = new defpackage.dlm(jK);
            defpackage.cxl cxlVar2 = cxyVar.a;
            if (cxlVar2.am()) {
                if (cxlVar2.j != null) {
                    cxlVar2.M();
                }
                cxlVar2.N();
                cxyVar.i.x(cxlVar2, cxlVar2.j != null ? 1 : 3);
            }
        }
        defpackage.ngb ngbVar = cxyVar.i;
        if (ngbVar.u()) {
            defpackage.cxl cxlVar3 = cxyVar.a;
            if (!cxlVar3.am()) {
                defpackage.csc.b("performMeasureAndLayout called with unattached root");
            }
            if (!cxlVar3.an()) {
                defpackage.csc.b("performMeasureAndLayout called with unplaced root");
            }
            if (cxyVar.b) {
                defpackage.csc.b("performMeasureAndLayout called during measure layout");
            }
            if (cxyVar.f != null) {
                cxyVar.b = true;
                cxyVar.c = false;
                try {
                    if (!((defpackage.cwp) ngbVar.c).d() && !((defpackage.cwp) ngbVar.a).d()) {
                        if (cxlVar3.j != null) {
                            cxyVar.g(cxlVar3, true);
                        } else {
                            cxyVar.f(cxlVar3);
                        }
                    }
                    cxyVar.g(cxlVar3, false);
                    cxyVar.b = false;
                    cxyVar.c = false;
                    defpackage.dai daiVar = cxyVar.h;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        cxyVar.b = false;
                        cxyVar.c = false;
                        throw th2;
                    }
                }
            }
        }
        defpackage.cxl cxlVar4 = this.o;
        setMeasuredDimension(cxlVar4.g(), cxlVar4.e());
        defpackage.dau dauVar = this.y;
        if (dauVar != null) {
            dauVar.measure(android.view.View.MeasureSpec.makeMeasureSpec(cxlVar4.g(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(cxlVar4.e(), 1073741824));
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.aI) {
            return;
        }
        ah(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent motionEvent, int i) {
        defpackage.cra craVar;
        int toolType = motionEvent.getToolType(i);
        return (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || !(toolType == 2 || toolType == 4) || (craVar = this.K.b) == null) ? super.onResolvePointerIcon(motionEvent, i) : defpackage.daw.a(getContext(), craVar);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.ae) {
            defpackage.dlz dlzVarC = defpackage.cie.c(i);
            if (dlzVarC == null) {
                dlzVarC = defpackage.dlz.a;
            }
            this.ay.b(dlzVarC);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect rect, android.graphics.Point point, java.util.function.Consumer consumer) {
        defpackage.kwv kwvVar;
        if (android.os.Build.VERSION.SDK_INT < 31 || (kwvVar = this.aN) == null) {
            return;
        }
        defpackage.mku mkuVar = this.W;
        defpackage.afdo afdoVar = this.j;
        defpackage.bzc bzcVar = new defpackage.bzc(new ddm[16]);
        defpackage.vx.f(mkuVar.x(), 0, new ddl(bzcVar));
        bzcVar.j(new defpackage.dab(new defpackage.affc[]{new defpackage.cmr(14), new defpackage.cmr(15)}, 11));
        int i = bzcVar.b;
        ddm ddmVar = (ddm) (i == 0 ? null : bzcVar.a[i - 1]);
        if (ddmVar == null) {
            return;
        }
        aiuw aiuwVarB = ahoi.b(afdoVar);
        defpackage.dec decVar = ddmVar.a;
        defpackage.dlx dlxVar = ddmVar.c;
        defpackage.ddg ddgVar = new defpackage.ddg(decVar, dlxVar, aiuwVarB, kwvVar, this);
        defpackage.ctc ctcVar = ddmVar.d;
        defpackage.cjj cjjVarO = defpackage.csc.g(ctcVar).o(ctcVar, true);
        long jD = dlxVar.d();
        android.view.ScrollCaptureTarget scrollCaptureTarget = new android.view.ScrollCaptureTarget(this, defpackage.ckn.b(defpackage.dlv.i(cjjVarO)), new android.graphics.Point((int) (jD >> 32), (int) (jD & 4294967295L)), ddgVar);
        a$.ExternalSyntheticApiModelOutline0.m(scrollCaptureTarget, defpackage.ckn.b(dlxVar));
        a$.ExternalSyntheticApiModelOutline2.m(consumer, scrollCaptureTarget);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        al();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        aa().M(true != z ? 2 : 1);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(android.util.LongSparseArray longSparseArray) {
        if (android.os.Build.VERSION.SDK_INT < 31) {
            return;
        }
        defpackage.cgx cgxVar = this.r;
        if (defpackage.afga.f(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            defpackage.xi.c(cgxVar, longSparseArray);
        } else {
            cgxVar.a.post(new defpackage.af(cgxVar, longSparseArray, 16));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM;
        this.aH = true;
        super.onWindowFocusChanged(z);
        if (!z || android.os.Build.VERSION.SDK_INT >= 30 || F() == (zM = defpackage.dai.m())) {
            return;
        }
        this.x = zM;
        S();
    }

    @Override // defpackage.cyu
    public final defpackage.cyx p() {
        return this.w;
    }

    @Override // defpackage.cyu
    public final defpackage.dck q() {
        return P().g;
    }

    @Override // defpackage.cyu
    public final defpackage.dlo r() {
        return (defpackage.dlo) this.ah.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        defpackage.chz chzVarA = defpackage.cie.a(i);
        int i2 = chzVarA != null ? chzVarA.a : 7;
        defpackage.cik cikVar = this.J;
        java.lang.Boolean boolD = cikVar.d(i2, rect != null ? defpackage.ckn.d(rect) : null, new defpackage.cii(i2, 3));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (defpackage.afga.f(boolD, bool) || defpackage.afga.f(cikVar.d(i2, null, new defpackage.cii(i2, 4)), bool)) {
            return true;
        }
        if (hasFocus() && defpackage.ly.p(i2)) {
            return cikVar.j(i2);
        }
        return false;
    }

    @Override // defpackage.cyu
    public final defpackage.dlz s() {
        return (defpackage.dlz) this.ay.a();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cyu
    public final java.lang.Object t(defpackage.affg affgVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.daa daaVar;
        if (afdkVar instanceof defpackage.daa) {
            daaVar = (defpackage.daa) afdkVar;
            int i = daaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                daaVar.c = i - Integer.MIN_VALUE;
            } else {
                daaVar = new defpackage.daa(this, afdkVar);
            }
        } else {
            daaVar = new defpackage.daa(this, afdkVar);
        }
        java.lang.Object obj = daaVar.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = daaVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(obj);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.aw;
            defpackage.chs chsVar = new defpackage.chs(this, 15);
            daaVar.c = 1;
            if (ahoi.a(new cgi(chsVar, atomicReference, affgVar, (defpackage.afdk) null), daaVar) == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(obj);
        }
        throw new defpackage.afap();
    }

    @Override // defpackage.cyu
    public final void u(defpackage.cxl cxlVar, boolean z) {
        this.z.e(cxlVar, z);
    }

    @Override // defpackage.cyu
    public final void v(boolean z) {
        defpackage.cxy cxyVar = this.z;
        if (cxyVar.h() || cxyVar.g.g()) {
            if (cxyVar.i(z ? this.aG : this.H)) {
                requestLayout();
            }
            cxyVar.b(false);
            this.p.c();
            ae();
        }
    }

    @Override // defpackage.cyu
    public final void w(defpackage.cxl cxlVar, long j) {
        defpackage.cxy cxyVar = this.z;
        if (!cxlVar.D) {
            defpackage.cxl cxlVar2 = cxyVar.a;
            if (defpackage.afga.f(cxlVar, cxlVar2)) {
                defpackage.csc.b("measureAndLayout called on root");
            }
            if (!cxlVar2.am()) {
                defpackage.csc.b("performMeasureAndLayout called with unattached root");
            }
            if (!cxlVar2.an()) {
                defpackage.csc.b("performMeasureAndLayout called with unplaced root");
            }
            if (cxyVar.b) {
                defpackage.csc.b("performMeasureAndLayout called during measure layout");
            }
            if (cxyVar.f != null) {
                cxyVar.b = true;
                cxyVar.c = false;
                try {
                    cxyVar.i.w(cxlVar);
                    if ((defpackage.cxy.k(cxlVar, new defpackage.dlm(j)) || cxlVar.aj()) && defpackage.afga.f(cxlVar.s(), java.lang.Boolean.TRUE)) {
                        cxlVar.K();
                    }
                    cxyVar.d(cxlVar);
                    defpackage.cxy.l(cxlVar, new defpackage.dlm(j));
                    if (cxlVar.ai() && cxlVar.an()) {
                        cxlVar.T();
                        cxyVar.g.f(cxlVar);
                    }
                    cxyVar.c();
                    cxyVar.b = false;
                    cxyVar.c = false;
                    defpackage.dai daiVar = cxyVar.h;
                } catch (java.lang.Throwable th) {
                    try {
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        cxyVar.b = false;
                        cxyVar.c = false;
                        throw th2;
                    }
                }
            }
            cxyVar.a();
        }
        defpackage.cxy cxyVar2 = this.z;
        if (cxyVar2.h()) {
            return;
        }
        cxyVar2.b(false);
        this.p.c();
        this.H.invoke();
        ae();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00e0 A[EDGE_INSN: B:102:0x00e0->B:39:0x00e0 BREAK  A[LOOP:3: B:23:0x0095->B:35:0x00ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce A[Catch: all -> 0x015c, LOOP:3: B:23:0x0095->B:35:0x00ce, LOOP_END, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x0021, B:11:0x0033, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:18:0x0060, B:20:0x007f, B:23:0x0095, B:25:0x00a3, B:27:0x00ad, B:29:0x00b3, B:31:0x00c3, B:39:0x00e0, B:41:0x00e8, B:44:0x00f7, B:35:0x00ce, B:50:0x0115, B:52:0x0127, B:54:0x012d, B:58:0x013e, B:57:0x0134, B:59:0x0147), top: B:91:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e8 A[Catch: all -> 0x015c, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x0021, B:11:0x0033, B:13:0x0046, B:14:0x004b, B:16:0x0056, B:18:0x0060, B:20:0x007f, B:23:0x0095, B:25:0x00a3, B:27:0x00ad, B:29:0x00b3, B:31:0x00c3, B:39:0x00e0, B:41:0x00e8, B:44:0x00f7, B:35:0x00ce, B:50:0x0115, B:52:0x0127, B:54:0x012d, B:58:0x013e, B:57:0x0134, B:59:0x0147), top: B:91:0x0017 }] */
    @Override // defpackage.cyu
    public final void x() {
        defpackage.bzc bzcVar;
        defpackage.cmr cmrVar;
        int i;
        defpackage.bzc bzcVar2;
        int i2;
        defpackage.cmr cmrVar2;
        long j;
        char c2;
        defpackage.czz czzVar = this;
        if (czzVar.v) {
            defpackage.cyx cyxVar = czzVar.w;
            defpackage.cmr cmrVar3 = new defpackage.cmr(10);
            java.lang.Object obj = cyxVar.a;
            synchronized (((defpackage.cez) obj).e) {
                defpackage.bzc bzcVar3 = ((defpackage.cez) obj).d;
                int i3 = bzcVar3.b;
                int i4 = 0;
                int i5 = 0;
                while (i4 < i3) {
                    defpackage.cey ceyVar = (defpackage.cey) bzcVar3.a[i4];
                    defpackage.aau aauVarD = ceyVar.d();
                    long[] jArr = aauVarD.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = i6 - length;
                                i = i4;
                                int i8 = 0;
                                while (true) {
                                    int i9 = i7;
                                    i2 = 8 - ((~i7) >>> 31);
                                    if (i8 >= i2) {
                                        break;
                                    }
                                    if ((j2 & 255) < 128) {
                                        int i10 = (i6 << 3) + i8;
                                        int i11 = 8;
                                        java.lang.Object obj2 = aauVarD.b[i10];
                                        defpackage.aal aalVar = (defpackage.aal) aauVarD.c[i10];
                                        java.lang.Object objInvoke = cmrVar3.invoke(obj2);
                                        if (((java.lang.Boolean) objInvoke).booleanValue()) {
                                            cmrVar2 = cmrVar3;
                                            java.lang.Object[] objArr = aalVar.b;
                                            int[] iArr = aalVar.c;
                                            long[] jArr2 = aalVar.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                j = j2;
                                                int i12 = 0;
                                                while (true) {
                                                    long j3 = jArr2[i12];
                                                    bzcVar3 = bzcVar3;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                        for (int i14 = 0; i14 < i13; i14++) {
                                                            if ((j3 & 255) < 128) {
                                                                int i15 = (i12 << 3) + i14;
                                                                java.lang.Object obj3 = objArr[i15];
                                                                int i16 = iArr[i15];
                                                                ceyVar.b(obj2, obj3);
                                                            }
                                                            j3 >>= i11;
                                                        }
                                                        if (i13 != i11) {
                                                            break;
                                                        }
                                                        if (i12 != length2) {
                                                            break;
                                                        }
                                                        i12++;
                                                        bzcVar3 = bzcVar3;
                                                        i11 = 8;
                                                    } else if (i12 != length2) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i12++;
                                                        bzcVar3 = bzcVar3;
                                                        i11 = 8;
                                                    }
                                                }
                                            }
                                            if (((java.lang.Boolean) objInvoke).booleanValue()) {
                                                aauVarD.j(i10);
                                            }
                                            c2 = '\b';
                                        } else {
                                            cmrVar2 = cmrVar3;
                                        }
                                        j = j2;
                                        if (((java.lang.Boolean) objInvoke).booleanValue()) {
                                            aauVarD.j(i10);
                                        }
                                        c2 = '\b';
                                    } else {
                                        bzcVar3 = bzcVar3;
                                        cmrVar2 = cmrVar3;
                                        j = j2;
                                        c2 = '\b';
                                    }
                                    j2 = j >> c2;
                                    i8++;
                                    i7 = i9;
                                    cmrVar3 = cmrVar2;
                                    bzcVar3 = bzcVar3;
                                }
                                bzcVar = bzcVar3;
                                cmrVar = cmrVar3;
                                if (i2 != 8) {
                                    break;
                                }
                            } else {
                                bzcVar = bzcVar3;
                                cmrVar = cmrVar3;
                                i = i4;
                            }
                            if (i6 == length) {
                                break;
                            }
                            i6++;
                            i4 = i;
                            cmrVar3 = cmrVar;
                            bzcVar3 = bzcVar;
                        }
                    } else {
                        bzcVar = bzcVar3;
                        cmrVar = cmrVar3;
                        i = i4;
                    }
                    if (ceyVar.c()) {
                        if (i5 > 0) {
                            bzcVar2 = bzcVar;
                            java.lang.Object[] objArr2 = bzcVar2.a;
                            objArr2[i - i5] = objArr2[i];
                        }
                        i4 = i + 1;
                        bzcVar3 = bzcVar2;
                        cmrVar3 = cmrVar;
                    } else {
                        i5++;
                    }
                    bzcVar2 = bzcVar;
                    i4 = i + 1;
                    bzcVar3 = bzcVar2;
                    cmrVar3 = cmrVar;
                }
                defpackage.bzc bzcVar4 = bzcVar3;
                java.lang.Object[] objArr3 = bzcVar4.a;
                int i17 = i3 - i5;
                objArr3.getClass();
                java.util.Arrays.fill(objArr3, i17, i3, (java.lang.Object) null);
                bzcVar4.b = i17;
            }
            czzVar = this;
            czzVar.v = false;
        }
        defpackage.dau dauVar = czzVar.y;
        if (dauVar != null) {
            czzVar.ad(dauVar);
        }
        defpackage.cgp cgpVar = czzVar.Q;
        if (cgpVar != null) {
            if (cgpVar.h.d == 0 && cgpVar.f) {
                a$.ExternalSyntheticApiModelOutline1.m(cgpVar.g.a());
                cgpVar.f = false;
            }
            if (cgpVar.h.d != 0) {
                cgpVar.f = true;
            }
        }
        while (true) {
            defpackage.aan aanVar = czzVar.aK;
            if (!aanVar.g() || aanVar.c(0) == null) {
                return;
            }
            int i18 = aanVar.b;
            for (int i19 = 0; i19 < i18; i19++) {
                defpackage.afer aferVar = (defpackage.afer) aanVar.c(i19);
                aanVar.i(i19, null);
                if (aferVar != null) {
                    aferVar.invoke();
                }
            }
            aanVar.l(0, i18);
        }
    }

    @Override // defpackage.cyu
    public final void y(defpackage.cxl cxlVar) {
        defpackage.dah dahVar = this.q;
        dahVar.m = true;
        if (dahVar.B()) {
            dahVar.u(cxlVar);
        }
        defpackage.cgx cgxVar = this.r;
        cgxVar.b = true;
        if (cgxVar.n()) {
            cgxVar.k();
        }
    }

    @Override // defpackage.cyu
    public final void z(defpackage.cxl cxlVar, boolean z, boolean z2, boolean z3) {
        defpackage.cxl cxlVarL;
        defpackage.cxl cxlVarL2;
        defpackage.cxy cxyVar = this.z;
        if (!z) {
            if (cxyVar.j(cxlVar, z2) && z3) {
                U(cxlVar);
                return;
            }
            return;
        }
        if (cxlVar.j == null) {
            defpackage.csc.c("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int iAv = cxlVar.av();
        int i = iAv - 1;
        if (iAv == 0) {
            throw null;
        }
        if (i != 0) {
            if (i == 1) {
                return;
            }
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new defpackage.afas();
                }
                if (!cxlVar.ak() || z2) {
                    cxlVar.M();
                    cxlVar.N();
                    if (cxlVar.D) {
                        return;
                    }
                    if ((defpackage.afga.f(cxlVar.s(), java.lang.Boolean.TRUE) || defpackage.cxy.m(cxlVar)) && ((cxlVarL = cxlVar.l()) == null || !cxlVarL.ak())) {
                        cxyVar.i.x(cxlVar, 1);
                    } else if ((cxlVar.an() || defpackage.cxy.n(cxlVar)) && ((cxlVarL2 = cxlVar.l()) == null || !cxlVarL2.al())) {
                        cxyVar.i.x(cxlVar, 3);
                    }
                    if (cxyVar.c || !z3) {
                        return;
                    }
                    U(cxlVar);
                    return;
                }
                return;
            }
        }
        cxyVar.e.n(new defpackage.cxx(cxlVar, true, z2));
        defpackage.dai daiVar = cxyVar.h;
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, int i2) {
        android.view.ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // defpackage.epl
    public final /* synthetic */ void eU() {
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
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

    @Override // android.view.View
    protected final void onDraw(android.graphics.Canvas canvas) {
    }
}
