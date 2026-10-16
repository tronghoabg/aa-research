package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class nou implements defpackage.tey {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.AbsFragmentHost");
    public final android.os.Handler b;
    public android.widget.FrameLayout c;
    public boolean d;
    public boolean e;
    public boolean f;
    public android.support.v4.app.Fragment g;
    public final java.lang.String h;
    public final defpackage.erz i;
    protected defpackage.kwv j;
    private final defpackage.eqg k;
    private final defpackage.epl l;
    private final java.lang.Object m;

    protected nou(android.support.v4.app.Fragment fragment, defpackage.eqg eqgVar, java.lang.Object obj) {
        defpackage.nor norVar = new defpackage.nor(this);
        this.l = norVar;
        this.b = new android.os.Handler(android.os.Looper.getMainLooper());
        this.i = new defpackage.erz();
        this.g = fragment;
        this.h = fragment.getClass().getName();
        this.m = obj;
        this.k = eqgVar;
        eqgVar.getLifecycle().c(norVar);
    }

    public final android.support.v4.app.Fragment a() {
        return !this.d ? this.g : this.j.X().e(android.R.id.content);
    }

    @Override // defpackage.tey
    public final java.lang.Object b() {
        return this.m;
    }

    protected abstract void c();

    public final void d() {
        defpackage.yqm yqmVar = a;
        java.lang.String str = this.h;
        ((defpackage.yqj) yqmVar.l().ai((char) 5305)).y("finish(): %s", str);
        if (this.e) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5307)).y("finish() called when already finished: %s", str);
            return;
        }
        this.d = false;
        this.e = true;
        defpackage.eqg eqgVar = this.k;
        eqgVar.getLifecycle().d(this.l);
        this.i.a();
        defpackage.kwv kwvVar = this.j;
        if (kwvVar != null) {
            kwvVar.ab();
            this.j = null;
        }
        c();
        ((defpackage.yqj) yqmVar.l().ai((char) 5306)).y("finish() completed: %s", str);
    }

    public final void e(boolean z) {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5308);
        java.lang.String str = this.h;
        yqjVar.P("hide(%b): %s", z, str);
        defpackage.ysr.bn(!this.e, "hide called when %s already finished", str);
        if (this.f) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5310)).y("hide called when %s already hidden", str);
            return;
        }
        this.f = true;
        f(z);
        ((defpackage.yqj) yqmVar.l().ai(5309)).P("hide(%b) completed: %s", z, str);
    }

    protected abstract void f(boolean z);

    protected abstract void g(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams);

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void h(com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5311);
        java.lang.String str = this.h;
        yqjVar.M("hide(%s): %s", projectionWindowAnimationParams, str);
        defpackage.ysr.bn(!this.e, "hide called when %s already finished", str);
        if (this.f) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5313)).y("hide called when %s already hidden", str);
            return;
        }
        this.f = true;
        g(projectionWindowAnimationParams);
        ((defpackage.yqj) yqmVar.l().ai(5312)).M("hide(%s) completed: %s", projectionWindowAnimationParams, str);
    }

    public final void i(android.content.Context context) {
        this.j.ac();
        defpackage.bt btVar = ((defpackage.bg) this.j.a).e;
        if (btVar.m instanceof defpackage.fbm) {
            btVar.W(new java.lang.IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        android.os.Bundle bundleC = btVar.c();
        if (true == bundleC.isEmpty()) {
            bundleC = null;
        }
        this.j.af();
        ((defpackage.bg) this.j.a).e.F(1);
        this.j.ab();
        defpackage.kwv kwvVar = new defpackage.kwv(new defpackage.not(this, context, this.b));
        this.j = kwvVar;
        kwvVar.ah();
        java.lang.Object obj = this.j.a;
        if (!(obj instanceof defpackage.esa)) {
            throw new java.lang.IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        defpackage.bt btVar2 = ((defpackage.bg) obj).e;
        if (btVar2.m instanceof defpackage.fbm) {
            btVar2.W(new java.lang.IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        btVar2.S(bundleC);
        this.j.aa();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void j(boolean z) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5321);
        java.lang.String str = this.h;
        yqjVar.P("show(%b): %s", z, str);
        defpackage.ysr.bn(!this.e, "show called when %s already finished", str);
        if (!this.f) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 5323)).y("show called when %s not hidden. Nothing to do", str);
            return;
        }
        this.f = false;
        k(z);
        ((defpackage.yqj) yqmVar.l().ai(5322)).P("show(%b) completed: %s", z, str);
    }

    protected abstract void k(boolean z);

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void l(int i, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams) throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = a;
        defpackage.yqj yqjVar = (defpackage.yqj) yqmVar.l().ai(5318);
        java.lang.String str = this.h;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        yqjVar.S("requestDragChange(%s, %s, %s): %s", numValueOf, bool, projectionWindowAnimationParams, str);
        defpackage.ysr.bn(!this.e, "show called when %s already finished", str);
        if (this.f) {
            ((defpackage.yqj) yqmVar.l().ai((char) 5320)).y("request drag change showing window %s", str);
        }
        this.f = false;
        m(i, projectionWindowAnimationParams);
        ((defpackage.yqj) yqmVar.l().ai(5319)).S("requestDragChange(%s, %s, %s) completed: %s", numValueOf, bool, projectionWindowAnimationParams, str);
    }

    protected abstract void m(int i, com.google.android.gms.car.animation.ProjectionWindowAnimationParams projectionWindowAnimationParams);
}
