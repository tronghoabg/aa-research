package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class gka {
    static java.lang.Integer d;
    public final java.lang.Object a;
    public final java.lang.Object b;
    public java.lang.Object c;

    public gka(android.content.Context context, android.content.res.Resources resources) {
        synchronized (this) {
            zlv.n(context, "clientRawContext");
            this.c = context;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        zlv.n(applicationContext, "getApplicationContext");
        this.a = applicationContext;
        zlv.n(resources, "mapsApiContainerResources");
        this.b = resources;
        zwe.a(context);
    }

    static float I(float f) {
        return java.lang.Math.max(0.125f, java.lang.Math.min(4.0f, f));
    }

    public static final boolean N(int i, int i2) {
        return R(i) && R(i2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [afer, java.lang.Object] */
    private final void O() throws java.lang.Throwable {
        if (!((java.lang.Boolean) this.a.invoke()).booleanValue()) {
            throw ((java.lang.Throwable) this.b.invoke());
        }
    }

    private final void P(defpackage.epw epwVar) {
        java.lang.Object obj = this.c;
        if (obj != null) {
            ((erp) obj).run();
        }
        java.lang.Runnable erpVar = new erp((defpackage.eqi) this.b, epwVar);
        this.c = erpVar;
        ((android.os.Handler) this.a).postAtFrontOfQueue(erpVar);
    }

    private final int Q(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        android.view.View view = (android.view.View) this.a;
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (android.util.Log.isLoggable("CustomViewTarget", 4)) {
            android.util.Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        android.content.Context context = view.getContext();
        java.lang.Integer numValueOf = d;
        if (numValueOf == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            defpackage.a.ak(windowManager, "Argument must not be null");
            android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
            android.graphics.Point point = new android.graphics.Point();
            defaultDisplay.getSize(point);
            numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(point.x, point.y));
            d = numValueOf;
        }
        return numValueOf.intValue();
    }

    private static final boolean R(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static abeo i(abeg abegVar) {
        abeo abeoVar = abegVar.q;
        if (abeoVar == null) {
            abeoVar = abeo.a;
        }
        defpackage.gka gkaVar = new defpackage.gka((defpackage.abou) abegVar, abeoVar);
        gkaVar.k(abci.s, abeq.f);
        gkaVar.k(abci.u, abeq.k);
        gkaVar.k(abci.y, abeq.E);
        gkaVar.k(abci.z, abeq.L);
        gkaVar.k(abci.x, abeq.w);
        gkaVar.k(abas.c, abeq.U);
        gkaVar.k(abci.A, abeq.F);
        return gkaVar.j();
    }

    public final synchronized android.content.Context A() {
        return z();
    }

    @java.lang.Deprecated
    public final synchronized android.content.res.Resources B() {
        return (android.content.res.Resources) this.b;
    }

    public final synchronized android.graphics.Bitmap C(int i) {
        android.graphics.Bitmap bitmapDecodeResource;
        java.lang.Object obj = this.b;
        android.content.res.Configuration configuration = new android.content.res.Configuration(((android.content.res.Resources) obj).getConfiguration());
        try {
            ((android.content.res.Resources) obj).updateConfiguration(new android.content.res.Configuration(z().getResources().getConfiguration()), ((android.content.res.Resources) obj).getDisplayMetrics());
            bitmapDecodeResource = android.graphics.BitmapFactory.decodeResource((android.content.res.Resources) obj, i);
            java.lang.Object obj2 = this.b;
            ((android.content.res.Resources) obj2).updateConfiguration(configuration, ((android.content.res.Resources) obj2).getDisplayMetrics());
        } catch (java.lang.Throwable th) {
            java.lang.Object obj3 = this.b;
            ((android.content.res.Resources) obj3).updateConfiguration(configuration, ((android.content.res.Resources) obj3).getDisplayMetrics());
            throw th;
        }
        return bitmapDecodeResource;
    }

    public final synchronized android.graphics.drawable.Drawable D(int i) {
        android.graphics.drawable.Drawable drawable;
        java.lang.Object obj = this.b;
        android.content.res.Configuration configuration = new android.content.res.Configuration(((android.content.res.Resources) obj).getConfiguration());
        try {
            ((android.content.res.Resources) obj).updateConfiguration(new android.content.res.Configuration(z().getResources().getConfiguration()), ((android.content.res.Resources) obj).getDisplayMetrics());
            drawable = ((android.content.res.Resources) obj).getDrawable(i);
            java.lang.Object obj2 = this.b;
            ((android.content.res.Resources) obj2).updateConfiguration(configuration, ((android.content.res.Resources) obj2).getDisplayMetrics());
        } catch (java.lang.Throwable th) {
            java.lang.Object obj3 = this.b;
            ((android.content.res.Resources) obj3).updateConfiguration(configuration, ((android.content.res.Resources) obj3).getDisplayMetrics());
            throw th;
        }
        return drawable;
    }

    public final android.util.DisplayMetrics E() {
        return z().getResources().getDisplayMetrics();
    }

    public final synchronized java.lang.String F(int i) {
        return ((android.content.res.Resources) this.b).getString(i);
    }

    public final synchronized void G() {
        this.c = null;
    }

    public final synchronized java.lang.CharSequence[] H(int i) {
        return ((android.content.res.Resources) this.b).getTextArray(i);
    }

    public final synchronized float J() {
        float dimension;
        java.lang.Object obj = this.b;
        android.content.res.Configuration configuration = new android.content.res.Configuration(((android.content.res.Resources) obj).getConfiguration());
        try {
            ((android.content.res.Resources) obj).updateConfiguration(new android.content.res.Configuration(z().getResources().getConfiguration()), ((android.content.res.Resources) obj).getDisplayMetrics());
            dimension = ((android.content.res.Resources) obj).getDimension(2131167590);
            java.lang.Object obj2 = this.b;
            ((android.content.res.Resources) obj2).updateConfiguration(configuration, ((android.content.res.Resources) obj2).getDisplayMetrics());
        } catch (java.lang.Throwable th) {
            java.lang.Object obj3 = this.b;
            ((android.content.res.Resources) obj3).updateConfiguration(configuration, ((android.content.res.Resources) obj3).getDisplayMetrics());
            throw th;
        }
        return dimension;
    }

    public final int K() {
        android.view.View view = (android.view.View) this.a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Q(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    public final int L() {
        android.view.View view = (android.view.View) this.a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Q(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    public final void M() {
        android.view.ViewTreeObserver viewTreeObserver = ((android.view.View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void a(androidx.car.app.model.Action action) {
        this.a.add(action);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void b(androidx.car.app.model.Action action) {
        this.b.add(action);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, udx] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Set] */
    public final synchronized void c() {
        ?? r0 = this.c;
        if (r0 != 0) {
            java.lang.Object obj = this.b;
            if (((defpackage.ndd) obj).c.remove(r0)) {
                ((too) ((defpackage.ndd) obj).b).k((udx) null, (udx) r0);
            }
            this.c = null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Set] */
    public final synchronized void d() {
        if (this.c == null) {
            java.lang.Object obj = this.b;
            tvn tvnVar = new tvn((udw) this.a);
            ((defpackage.ndd) obj).c.add(tvnVar);
            ((too) ((defpackage.ndd) obj).b).k(tvnVar, (udx) null);
            this.c = tvnVar;
        }
    }

    public final java.lang.Object e() throws java.lang.Throwable {
        O();
        return this.c;
    }

    public final void f(java.lang.Object obj) {
        O();
        this.c = obj;
    }

    public final void g() {
        java.lang.Object obj;
        synchronized (this) {
            obj = this.c;
        }
        java.lang.Object obj2 = this.b;
        if (obj == null) {
            this = null;
        }
        ((ugv) obj2).r(this);
    }

    public final synchronized void h() {
        g();
    }

    public final abeo j() {
        java.lang.Object obj = this.c;
        return obj == null ? (abeo) this.b : ((defpackage.abor) obj).q();
    }

    public final void k(defpackage.aboj abojVar, defpackage.aboj abojVar2) {
        defpackage.abou abouVar = (defpackage.abou) this.a;
        abouVar.j(abojVar);
        defpackage.abon abonVar = abouVar.w;
        defpackage.abow abowVar = abojVar.d;
        if (abonVar.m(abowVar)) {
            defpackage.abot abotVarL = l();
            abouVar.j(abojVar);
            java.lang.Object objJ = abouVar.w.j(abowVar);
            abotVarL.bc(abojVar2, (defpackage.abpy) (objJ == null ? abojVar.b : abojVar.c(objJ)));
        }
    }

    public final defpackage.abot l() {
        if (this.c == null) {
            this.c = (defpackage.abot) ((defpackage.abox) this.b).K();
        }
        return (defpackage.abot) this.c;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bys, java.lang.Object] */
    public final defpackage.affg m() {
        return (defpackage.affg) this.b.a();
    }

    public final void n(gah gahVar, defpackage.bve bveVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-2113044977);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? bveVarC.C(gahVar) : bveVarC.E(gahVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != bveVarC.E(this) ? 16 : 32;
        }
        if (!bveVarC.I((i2 & 19) != 18, i2 & 1)) {
            bveVarC.s();
        } else if (gahVar != null) {
            bveVarC.v(1612918384);
            defpackage.cgc cgcVar = defpackage.cgf.e;
            defpackage.cgf cgfVarJ = defpackage.asq.J(defpackage.awj.r(defpackage.awj.d(cgcVar, ((gvj) this.c).e)), 0.0f, ((gvj) this.c).f, 0.0f, 0.0f);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarJ);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            fxy.c(gahVar, ((gvj) this.c).d, defpackage.awj.d(cgcVar, ((gvj) this.c).d), (defpackage.cfu) null, defpackage.csq.c, (defpackage.ckd) null, (defpackage.cld) null, false, false, (defpackage.affg) null, bveVarC, (i2 & 14) | 24584, 0, 2024);
            bwcVar.Y(true);
            bwcVar.Y(false);
        } else {
            bveVarC.v(1613413299);
            ((defpackage.bwc) bveVarC).Y(false);
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new guv(this, gahVar, i, 7, (byte[]) null);
        }
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [bwx, java.lang.Object] */
    public final void o(gah gahVar, boolean z, defpackage.affg affgVar) {
        affgVar.getClass();
        this.b.b(new defpackage.ccz(1276014463, true, new gvi(this, gahVar, z, affgVar, 0)));
    }

    public final void p() {
        P(defpackage.epw.ON_START);
    }

    public final void q() {
        P(defpackage.epw.ON_CREATE);
    }

    public final void r() {
        P(defpackage.epw.ON_STOP);
        P(defpackage.epw.ON_DESTROY);
    }

    public final void s() {
        P(defpackage.epw.ON_START);
    }

    public final float t() {
        return I(E().density);
    }

    public final float u() {
        return I(E().scaledDensity);
    }

    public final synchronized int v(int i) {
        return ((android.content.res.Resources) this.b).getColor(i);
    }

    public final synchronized int w(int i) {
        int dimensionPixelSize;
        java.lang.Object obj = this.b;
        android.content.res.Configuration configuration = new android.content.res.Configuration(((android.content.res.Resources) obj).getConfiguration());
        try {
            ((android.content.res.Resources) obj).updateConfiguration(new android.content.res.Configuration(z().getResources().getConfiguration()), ((android.content.res.Resources) obj).getDisplayMetrics());
            dimensionPixelSize = ((android.content.res.Resources) obj).getDimensionPixelSize(i);
            java.lang.Object obj2 = this.b;
            ((android.content.res.Resources) obj2).updateConfiguration(configuration, ((android.content.res.Resources) obj2).getDisplayMetrics());
        } catch (java.lang.Throwable th) {
            java.lang.Object obj3 = this.b;
            ((android.content.res.Resources) obj3).updateConfiguration(configuration, ((android.content.res.Resources) obj3).getDisplayMetrics());
            throw th;
        }
        return dimensionPixelSize;
    }

    public final int x() {
        return E().heightPixels;
    }

    public final int y() {
        return E().widthPixels;
    }

    public final synchronized android.content.Context z() {
        java.lang.Object obj = this.c;
        if (obj != null) {
            return (android.content.Context) obj;
        }
        return (android.content.Context) this.a;
    }

    public gka(java.lang.Object obj, defpackage.afer aferVar, defpackage.afer aferVar2) {
        this.c = obj;
        this.a = aferVar;
        this.b = aferVar2;
    }

    public gka(java.lang.Runnable runnable, java.util.concurrent.Executor executor, defpackage.gka gkaVar) {
        this.a = runnable;
        this.b = executor;
        this.c = gkaVar;
    }

    public gka(udw udwVar, defpackage.ndd nddVar) {
        this.a = udwVar;
        this.b = nddVar;
    }

    public gka(ugv ugvVar, java.util.concurrent.Executor executor) {
        this.c = null;
        this.b = ugvVar;
        this.a = executor;
    }

    public gka(defpackage.abou abouVar, abeo abeoVar) {
        this.c = null;
        this.a = abouVar;
        this.b = abeoVar;
    }

    public gka(defpackage.eqg eqgVar) {
        this.b = new defpackage.eqi(eqgVar, true);
        this.a = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public /* synthetic */ gka(java.lang.Object obj, defpackage.afer aferVar) {
        this(obj, aferVar, (defpackage.afer) new tja(6));
    }

    public gka() {
        this.a = new java.util.ArrayList();
        this.b = new java.util.ArrayList();
    }

    public gka(byte[] bArr) {
        this.c = gvj.b;
        defpackage.affg affgVar = gus.a;
        defpackage.bxv bxvVar = defpackage.bxv.c;
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(affgVar, bxvVar);
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableState(gus.b, bxvVar);
    }

    public gka(android.view.View view) {
        this.b = new java.util.ArrayList();
        this.a = view;
    }
}
