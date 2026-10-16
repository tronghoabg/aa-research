package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class od extends defpackage.cs implements defpackage.eqg, defpackage.esa, defpackage.epu, defpackage.fbm, defpackage.ou, defpackage.pg, defpackage.duy, defpackage.duz, defpackage.duo, defpackage.dup, defpackage.eak {
    private final defpackage.fbl a;
    private defpackage.erz b;
    private final defpackage.afar c;
    private final java.util.concurrent.CopyOnWriteArrayList d;
    private final java.util.concurrent.CopyOnWriteArrayList e;
    public int h;
    public final java.util.concurrent.atomic.AtomicInteger i;
    public final defpackage.pf j;
    public final java.util.concurrent.CopyOnWriteArrayList k;
    public final defpackage.ob l;
    private final java.util.concurrent.CopyOnWriteArrayList n;
    private final java.util.concurrent.CopyOnWriteArrayList o;
    private final java.util.concurrent.CopyOnWriteArrayList p;
    private boolean q;
    private boolean r;
    private final defpackage.afar s;
    private final java.util.concurrent.CopyOnWriteArrayList sx;
    private final defpackage.afar t;
    private final defpackage.afar u;
    public final defpackage.oy g = new defpackage.oy();
    private final defpackage.ngb v = new defpackage.ngb(new defpackage.ap(this, 20));

    public od() {
        defpackage.fbl fblVarH = defpackage.ebq.h(this);
        this.a = fblVarH;
        this.l = new defpackage.ob(this);
        this.c = new defpackage.afay(new defpackage.nz(this, 1));
        this.i = new java.util.concurrent.atomic.AtomicInteger();
        this.j = new defpackage.pf(this);
        this.d = new java.util.concurrent.CopyOnWriteArrayList();
        this.e = new java.util.concurrent.CopyOnWriteArrayList();
        this.k = new java.util.concurrent.CopyOnWriteArrayList();
        this.sx = new java.util.concurrent.CopyOnWriteArrayList();
        this.n = new java.util.concurrent.CopyOnWriteArrayList();
        this.o = new java.util.concurrent.CopyOnWriteArrayList();
        this.p = new java.util.concurrent.CopyOnWriteArrayList();
        int i = 0;
        this.s = new defpackage.afay(new defpackage.nz(this, i));
        defpackage.eqi eqiVar = this.f;
        if (eqiVar == null) {
            throw new java.lang.IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        eqiVar.c(new defpackage.oa(this, i));
        int i2 = 2;
        this.f.c(new defpackage.oa(this, i2));
        int i3 = 3;
        this.f.c(new defpackage.oa(this, 3, null));
        fblVarH.a();
        defpackage.erm.b(this);
        getSavedStateRegistry().c("android:support:activity-result", new defpackage.bi((java.lang.Object) this, i3));
        u(new defpackage.eo(this, i2));
        this.t = new defpackage.afay(new defpackage.nz(this, i2));
        this.u = new defpackage.afay(new defpackage.nz(this, i3));
    }

    public static final void x(defpackage.od odVar) {
        try {
            super.onBackPressed();
        } catch (java.lang.IllegalStateException e) {
            if (!defpackage.afga.f(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (java.lang.NullPointerException e2) {
            if (!defpackage.afga.f(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        w();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.pg
    public final defpackage.pf fL() {
        return this.j;
    }

    @Override // defpackage.duy
    public final void fM(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.d.add(dznVar);
    }

    @Override // defpackage.duo
    public final void fN(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.sx.add(dznVar);
    }

    @Override // defpackage.dup
    public final void fO(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.n.add(dznVar);
    }

    @Override // defpackage.duz
    public final void fP(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.e.add(dznVar);
    }

    @Override // defpackage.epu
    public final defpackage.esi getDefaultViewModelCreationExtras() {
        defpackage.esk eskVar = new defpackage.esk((byte[]) null);
        if (getApplication() != null) {
            eskVar.b(defpackage.erv.b, getApplication());
        }
        eskVar.b(defpackage.erm.a, this);
        eskVar.b(defpackage.erm.b, this);
        android.content.Intent intent = getIntent();
        android.os.Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            eskVar.b(defpackage.erm.c, extras);
        }
        return eskVar;
    }

    @Override // defpackage.epu
    public final defpackage.erw getDefaultViewModelProviderFactory() {
        return (defpackage.erw) this.t.a();
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return (defpackage.fbk) this.a.b;
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        if (getApplication() == null) {
            throw new java.lang.IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        v();
        defpackage.erz erzVar = this.b;
        erzVar.getClass();
        return erzVar;
    }

    @Override // defpackage.duy
    public final void k(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.d.remove(dznVar);
    }

    @Override // defpackage.duo
    public final void l(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.sx.remove(dznVar);
    }

    @Override // defpackage.dup
    public final void m(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.n.remove(dznVar);
    }

    @Override // defpackage.duz
    public final void n(defpackage.dzn dznVar) {
        dznVar.getClass();
        this.e.remove(dznVar);
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (this.j.e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        ((defpackage.exc) this.s.a()).b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        java.util.Iterator it = this.d.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(configuration);
        }
    }

    @Override // defpackage.cs, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        this.a.b(bundle);
        this.g.c(this);
        super.onCreate(bundle);
        int i = defpackage.erg.b;
        defpackage.ere.b(this);
        int i2 = this.h;
        if (i2 != 0) {
            setContentView(i2);
        }
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.v.j(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.v.l(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, android.content.res.Configuration configuration) {
        configuration.getClass();
        this.q = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.q = false;
            java.util.Iterator it = this.sx.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((defpackage.dzn) it.next()).a(new dus(z));
            }
        } catch (java.lang.Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        java.util.Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, android.view.Menu menu) {
        menu.getClass();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.v.c).iterator();
        while (it.hasNext()) {
            ((defpackage.bt) ((defpackage.izq) it.next()).a).z(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        configuration.getClass();
        this.r = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.r = false;
            java.util.Iterator it = this.n.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((defpackage.dzn) it.next()).a(new dus(z));
            }
        } catch (java.lang.Throwable th) {
            this.r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState pictureInPictureUiState) {
        defpackage.dtf dtfVar;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            a$.ExternalSyntheticApiModelOutline0.m(pictureInPictureUiState);
            hz$.ExternalSyntheticApiModelOutline2.m(pictureInPictureUiState);
            dtfVar = new defpackage.dtf();
        } else if (android.os.Build.VERSION.SDK_INT >= 31) {
            a$.ExternalSyntheticApiModelOutline0.m(pictureInPictureUiState);
            dtfVar = new defpackage.dtf();
        } else {
            dtfVar = new defpackage.dtf();
        }
        java.util.Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(dtfVar);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, android.view.View view, android.view.Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.v.k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.j.e(i, -1, new android.content.Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final java.lang.Object onRetainNonConfigurationInstance() {
        defpackage.nub nubVar;
        java.lang.Object obj = this.b;
        if (obj == null && (nubVar = (defpackage.nub) getLastNonConfigurationInstance()) != null) {
            obj = nubVar.a;
        }
        if (obj == null) {
            return null;
        }
        defpackage.nub nubVar2 = new defpackage.nub();
        nubVar2.a = obj;
        return nubVar2;
    }

    @Override // defpackage.cs, android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.getClass();
        defpackage.eqi eqiVar = this.f;
        if (eqiVar instanceof defpackage.eqi) {
            eqiVar.getClass();
            eqiVar.f(defpackage.epx.c);
        }
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        java.util.Iterator it = this.e.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(java.lang.Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        java.util.Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // defpackage.ou
    public final defpackage.bil r() {
        return (defpackage.bil) this.u.a();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Iterable, java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() throws java.lang.Throwable {
        defpackage.fdp.b();
        super.reportFullyDrawn();
        defpackage.jyp jypVarY = y();
        synchronized (jypVarY.b) {
            jypVarY.a = true;
            ?? r3 = jypVarY.c;
            java.util.Iterator it = r3.iterator();
            while (it.hasNext()) {
                ((defpackage.afer) it.next()).invoke();
            }
            r3.clear();
        }
    }

    @Override // defpackage.eak
    public final void s(defpackage.izq izqVar) {
        izqVar.getClass();
        this.v.C(izqVar);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        w();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4) throws android.content.IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // defpackage.eak
    public final void t(defpackage.izq izqVar) {
        izqVar.getClass();
        this.v.D(izqVar);
    }

    public final void u(defpackage.oz ozVar) {
        this.g.a(ozVar);
    }

    public final void v() {
        if (this.b == null) {
            defpackage.nub nubVar = (defpackage.nub) getLastNonConfigurationInstance();
            if (nubVar != null) {
                this.b = (defpackage.erz) nubVar.a;
            }
            if (this.b == null) {
                this.b = new defpackage.erz();
            }
        }
    }

    public final void w() {
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(2131429869, this);
        android.view.View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(2131429873, this);
        android.view.View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(2131429872, this);
        android.view.View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(2131429871, this);
        android.view.View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(2131429287, this);
        android.view.View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(2131429870, this);
    }

    public final defpackage.jyp y() {
        return (defpackage.jyp) this.c.a();
    }

    public final void z(defpackage.bil bilVar) {
        this.f.c(new defpackage.os(bilVar, this, 1));
    }

    @Override // android.app.Activity
    public final void startActivityForResult(android.content.Intent intent, int i, android.os.Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(android.content.IntentSender intentSender, int i, android.content.Intent intent, int i2, int i3, int i4, android.os.Bundle bundle) throws android.content.IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view) {
        w();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        w();
        android.view.View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.l.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        java.util.Iterator it = this.sx.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(new dus(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.r) {
            return;
        }
        java.util.Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((defpackage.dzn) it.next()).a(new dus(z));
        }
    }
}
