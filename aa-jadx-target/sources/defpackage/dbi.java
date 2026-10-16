package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dbi {
    private final android.content.res.Configuration A;
    private final defpackage.bwx B;
    private android.os.Handler C;
    private final defpackage.dbh D;
    private defpackage.kwv E;
    public final android.view.View a;
    public boolean b;
    public boolean c;
    public java.util.List d;
    public final defpackage.czt e;
    public final defpackage.bwx f;
    public final defpackage.dat g;
    public final defpackage.cxn h;
    public final defpackage.dbx i;
    public int j;
    public boolean k;
    public final defpackage.afer l;
    public boolean m;
    public dch n;
    public final defpackage.dax o;
    public final defpackage.khb p;
    public final defpackage.kwv q;
    public final defpackage.ldx r;
    public final defpackage.kwv s;
    public final defpackage.kwv t;
    public final defpackage.kwv u;
    private boolean v;
    private defpackage.bvi w;
    private defpackage.eqg x;
    private defpackage.fbm y;
    private defpackage.esa z;

    public /* synthetic */ dbi(defpackage.dbi dbiVar, android.view.View view, defpackage.bvi bviVar, defpackage.eqg eqgVar, defpackage.fbm fbmVar, defpackage.esa esaVar) {
        defpackage.kwv kwvVar;
        android.content.res.Configuration configuration;
        defpackage.bwx parcelableSnapshotMutableState;
        defpackage.kwv kwvVar2;
        defpackage.kwv kwvVarJ;
        defpackage.czt cztVar;
        defpackage.kwv kwvVar3;
        defpackage.dax daxVar;
        defpackage.bwx parcelableSnapshotMutableState2;
        defpackage.dat datVar;
        android.view.View view2;
        boolean zF = defpackage.afga.f((dbiVar == null || (view2 = dbiVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.w = bviVar;
        this.x = eqgVar;
        this.y = fbmVar;
        this.z = esaVar;
        if (zF) {
            dbiVar.getClass();
            kwvVar = dbiVar.q;
        } else {
            kwvVar = new defpackage.kwv((byte[]) null, (byte[]) null, (byte[]) null);
        }
        this.q = kwvVar;
        this.r = dbiVar != null ? dbiVar.r : new defpackage.ldx((char[]) null, (byte[]) null, (byte[]) null);
        if (zF) {
            dbiVar.getClass();
            configuration = dbiVar.A;
        } else {
            configuration = new android.content.res.Configuration(view.getContext().getResources().getConfiguration());
        }
        this.A = configuration;
        if (zF) {
            dbiVar.getClass();
            parcelableSnapshotMutableState = dbiVar.B;
        } else {
            parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new android.content.res.Configuration(configuration), defpackage.bxv.c);
        }
        this.B = parcelableSnapshotMutableState;
        if (zF) {
            dbiVar.getClass();
            kwvVar2 = dbiVar.t;
        } else {
            kwvVar2 = new defpackage.kwv(view.getContext(), (byte[]) null, (byte[]) null);
        }
        this.t = kwvVar2;
        if (zF) {
            dbiVar.getClass();
            kwvVarJ = dbiVar.j();
        } else {
            kwvVarJ = null;
        }
        this.E = kwvVarJ;
        if (zF) {
            dbiVar.getClass();
            cztVar = dbiVar.e;
        } else {
            cztVar = new defpackage.czt(view.getContext());
        }
        this.e = cztVar;
        if (zF) {
            dbiVar.getClass();
            kwvVar3 = dbiVar.s;
        } else {
            kwvVar3 = new defpackage.kwv(cztVar, (char[]) null);
        }
        this.s = kwvVar3;
        if (zF) {
            dbiVar.getClass();
            daxVar = dbiVar.o;
        } else {
            view.getContext();
            daxVar = new defpackage.dax();
        }
        this.o = daxVar;
        if (zF) {
            dbiVar.getClass();
            parcelableSnapshotMutableState2 = dbiVar.f;
        } else {
            parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.dax.n(view.getContext()), defpackage.bxv.a);
        }
        this.f = parcelableSnapshotMutableState2;
        this.u = view == (dbiVar != null ? dbiVar.a : null) ? dbiVar.u : new defpackage.kwv(view, (char[]) null);
        if (zF) {
            dbiVar.getClass();
            datVar = dbiVar.g;
        } else {
            datVar = new defpackage.dat(android.view.ViewConfiguration.get(view.getContext()));
        }
        this.g = datVar;
        this.h = dbiVar != null ? dbiVar.h : new defpackage.cxn(new defpackage.cmj());
        this.i = new defpackage.dbx();
        this.p = dbiVar != null ? dbiVar.p : new defpackage.khb((short[]) null);
        this.l = new defpackage.cew(this, 16);
        this.D = new defpackage.dbh(this);
    }

    private final void k() {
        if (this.v) {
            return;
        }
        this.v = true;
        if (this.w == null) {
            android.view.View view = this.a;
            defpackage.bvi bviVarB = defpackage.dcw.b(view);
            if (bviVarB == null) {
                bviVarB = defpackage.dcw.d(view);
            }
            this.w = bviVarB;
        }
        if (this.x == null) {
            defpackage.eqg eqgVarC = defpackage.edd.c(this.a);
            if (eqgVarC == null) {
                throw new java.lang.IllegalStateException("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            this.x = eqgVarC;
        }
        if (this.y == null) {
            defpackage.fbm fbmVarF = defpackage.ebq.f(this.a);
            if (fbmVarF == null) {
                throw new java.lang.IllegalStateException("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
            this.y = fbmVarF;
        }
        if (this.z == null) {
            this.z = defpackage.epv.h(this.a);
        }
    }

    public final defpackage.bvi a() {
        k();
        defpackage.bvi bviVar = this.w;
        bviVar.getClass();
        return bviVar;
    }

    public final defpackage.eqg b() {
        k();
        defpackage.eqg eqgVar = this.x;
        eqgVar.getClass();
        return eqgVar;
    }

    public final defpackage.esa c() {
        k();
        return this.z;
    }

    public final defpackage.fbm d() {
        k();
        defpackage.fbm fbmVar = this.y;
        fbmVar.getClass();
        return fbmVar;
    }

    public final void e(defpackage.czz czzVar, defpackage.affg affgVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(123858079);
        if (i3 == 0) {
            i2 = (true != bveVarC.E(czzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(affgVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != bveVarC.E(this) ? 128 : 256;
        }
        if (bveVarC.I((i2 & 147) != 146, i2 & 1)) {
            java.lang.Object tag = czzVar.getTag(2131428430);
            byte[] bArr = null;
            java.util.Set set = defpackage.afgz.f(tag) ? (java.util.Set) tag : null;
            if (set == null) {
                java.lang.Object parent = czzVar.getParent();
                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                java.lang.Object tag2 = view != null ? view.getTag(2131428430) : null;
                set = defpackage.afgz.f(tag2) ? (java.util.Set) tag2 : null;
            }
            if (set != null) {
                set.add(bveVarC.e());
                defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
                bwcVar.f = true;
                bwcVar.k = true;
                bwcVar.c.b();
                bwcVar.n.b();
                defpackage.bzp bzpVar = bwcVar.o;
                defpackage.bzm bzmVar = bzpVar.a;
                bzpVar.e = bzmVar.i;
                bzpVar.s = bzmVar.j;
            }
            bveVarC.v(480629184);
            defpackage.bxk[] bxkVarArr = new defpackage.bxk[13];
            bxkVarArr[0] = defpackage.esf.a.b(b());
            bxkVarArr[1] = defpackage.fbp.a.b(d());
            bxkVarArr[2] = defpackage.daj.d.b(this.q);
            bxkVarArr[3] = defpackage.daj.e.b(this.r);
            defpackage.bvm bvmVar = defpackage.dbl.p;
            boolean zE = bveVarC.E(this);
            defpackage.bwc bwcVar2 = (defpackage.bwc) bveVarC;
            java.lang.Object objS = bwcVar2.S();
            if (zE || objS == defpackage.bvd.a) {
                objS = new defpackage.chq(this, 18);
                bwcVar2.ad(objS);
            }
            bxkVarArr[4] = new defpackage.bxk(bvmVar, null, false, null, (defpackage.affc) objS, false);
            bxkVarArr[5] = defpackage.daj.b.b(czzVar.getContext());
            bxkVarArr[6] = defpackage.cfp.a.b(set);
            bxkVarArr[7] = defpackage.daj.a.b(czzVar.M());
            defpackage.bvm bvmVar2 = defpackage.cdx.a;
            boolean zE2 = bveVarC.E(czzVar);
            java.lang.Object objS2 = bwcVar2.S();
            if (zE2 || objS2 == defpackage.bvd.a) {
                objS2 = new defpackage.chq(czzVar, 19);
                bwcVar2.ad(objS2);
            }
            bxkVarArr[8] = new defpackage.bxk(bvmVar2, null, false, null, (defpackage.affc) objS2, false);
            bxkVarArr[9] = defpackage.daj.f.b(czzVar);
            defpackage.bvm bvmVar3 = defpackage.dbl.r;
            boolean zE3 = bveVarC.E(czzVar);
            java.lang.Object objS3 = bwcVar2.S();
            if (zE3 || objS3 == defpackage.bvd.a) {
                objS3 = new defpackage.chq(czzVar, 20);
                bwcVar2.ad(objS3);
            }
            bxkVarArr[10] = new defpackage.bxk(bvmVar3, null, false, null, (defpackage.affc) objS3, false);
            bxkVarArr[11] = defpackage.dbl.n.b(czzVar.q());
            defpackage.bvm bvmVar4 = defpackage.bwi.a;
            defpackage.kwv kwvVar = czzVar.ab;
            if (kwvVar == null) {
                kwvVar = new defpackage.kwv(czzVar, (char[]) null);
                czzVar.ab = kwvVar;
            }
            bxkVarArr[12] = bvmVar4.b(kwvVar);
            defpackage.dai.aB(bxkVarArr, defpackage.dai.as(1509086010, true, new defpackage.aps(czzVar, affgVar, 15, bArr), bveVarC), bveVarC, 56);
            bwcVar2.Y(false);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new defpackage.alz(this, czzVar, affgVar, i, 9);
        }
    }

    public final void f() {
        int i = this.j - 1;
        this.j = i;
        if (i < 0) {
            android.util.Log.e("ComposeViewContext", "View count has dropped below 0");
            this.j = 0;
        } else if (i != 0) {
            return;
        }
        android.view.View view = this.a;
        defpackage.dbh dbhVar = this.D;
        view.getContext().unregisterComponentCallbacks(dbhVar);
        this.i.b(null);
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(dbhVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(dbhVar);
        this.k = false;
        boolean z = this.m;
        android.os.Handler handler = this.C;
        if (z) {
            if (handler != null) {
                handler.post(dbhVar);
            }
        } else if (handler != null) {
            handler.removeCallbacks(dbhVar);
        }
        this.C = null;
    }

    public final void g() {
        int i = this.j + 1;
        this.j = i;
        if (i == 1) {
            android.view.View view = this.a;
            defpackage.dbh dbhVar = this.D;
            view.getContext().registerComponentCallbacks(dbhVar);
            h(view.getResources().getConfiguration());
            defpackage.dbx dbxVar = this.i;
            dbxVar.c(view.hasWindowFocus());
            defpackage.afer aferVar = this.l;
            dbxVar.b(aferVar);
            defpackage.bwx bwxVar = dbxVar.a;
            if (bwxVar != null) {
                bwxVar.b(aferVar.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(dbhVar);
            view.getViewTreeObserver().addOnGlobalLayoutListener(dbhVar);
            this.k = false;
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.t.a;
            boolean zIsEnabled = accessibilityManager.isEnabled();
            this.b = zIsEnabled;
            this.c = zIsEnabled && accessibilityManager.isTouchExplorationEnabled();
            android.os.Handler handler = view.getHandler();
            this.C = handler;
            if (handler != null) {
                handler.post(dbhVar);
            }
        }
    }

    public final void h(android.content.res.Configuration configuration) {
        int iUpdateFrom = this.A.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            java.util.Iterator it = ((java.util.HashMap) this.q.a).entrySet().iterator();
            while (it.hasNext()) {
                defpackage.ddb ddbVar = (defpackage.ddb) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                if (ddbVar == null || android.content.res.Configuration.needNewResources(iUpdateFrom, ddbVar.b)) {
                    it.remove();
                }
            }
            this.B.b(new android.content.res.Configuration(configuration));
            this.r.A();
            if ((268435456 & iUpdateFrom) != 0) {
                this.f.b(defpackage.dax.n(this.a.getContext()));
            }
            if ((805248384 & iUpdateFrom) != 0) {
                if (android.os.Build.VERSION.SDK_INT < 33) {
                    this.k = true;
                    return;
                }
                defpackage.dbx dbxVar = this.i;
                defpackage.afer aferVar = this.l;
                defpackage.bwx bwxVar = dbxVar.a;
                if (bwxVar != null) {
                    bwxVar.b(aferVar.invoke());
                }
            }
        }
    }

    public final void i() {
        this.d = null;
    }

    public final defpackage.kwv j() {
        defpackage.kwv kwvVar = this.E;
        if (kwvVar != null) {
            return kwvVar;
        }
        defpackage.kwv kwvVar2 = new defpackage.kwv(this.a.getContext(), (char[]) null);
        this.E = kwvVar2;
        return kwvVar2;
    }
}
