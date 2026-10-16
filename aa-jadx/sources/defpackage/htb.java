package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class htb implements android.content.ComponentCallbacks2, defpackage.idq {
    private static final defpackage.ies e;
    protected final defpackage.hsc a;
    protected final android.content.Context b;
    public final defpackage.idp c;
    public final java.util.concurrent.CopyOnWriteArrayList d;
    private final defpackage.idx f;
    private final defpackage.idw g;
    private final defpackage.iec h;
    private final java.lang.Runnable i;
    private final defpackage.idj j;
    private defpackage.ies k;

    static {
        defpackage.ies iesVarB = defpackage.ies.b(android.graphics.Bitmap.class);
        iesVarB.Y();
        e = iesVarB;
        defpackage.ies.b(defpackage.icv.class).Y();
    }

    public htb(defpackage.hsc hscVar, defpackage.idp idpVar, defpackage.idw idwVar, android.content.Context context) {
        defpackage.idx idxVar = new defpackage.idx();
        defpackage.fyh fyhVar = hscVar.e;
        this.h = new defpackage.iec();
        defpackage.giu giuVar = new defpackage.giu(this, 18, null);
        this.i = giuVar;
        this.a = hscVar;
        this.c = idpVar;
        this.g = idwVar;
        this.f = idxVar;
        this.b = context;
        android.content.Context applicationContext = context.getApplicationContext();
        defpackage.hta htaVar = new defpackage.hta(this, idxVar);
        int iC = defpackage.duw.c(applicationContext, "android.permission.ACCESS_NETWORK_STATE");
        if (android.util.Log.isLoggable("ConnectivityMonitor", 3)) {
            android.util.Log.d("ConnectivityMonitor", iC == 0 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        defpackage.idj idkVar = iC == 0 ? new defpackage.idk(applicationContext, htaVar) : new defpackage.idt();
        this.j = idkVar;
        synchronized (hscVar.c) {
            if (hscVar.c.contains(this)) {
                throw new java.lang.IllegalStateException("Cannot register already registered manager");
            }
            hscVar.c.add(this);
        }
        if (defpackage.igg.h()) {
            defpackage.igg.g(giuVar);
        } else {
            idpVar.a(this);
        }
        idpVar.a(idkVar);
        this.d = new java.util.concurrent.CopyOnWriteArrayList(hscVar.b.b);
        o(hscVar.b.b());
    }

    private final synchronized void r() {
        java.util.Set set = this.h.a;
        java.util.Iterator it = defpackage.igg.e(set).iterator();
        while (it.hasNext()) {
            i((defpackage.ifd) it.next());
        }
        set.clear();
    }

    public defpackage.hsz a(java.lang.Class cls) {
        return new defpackage.hsz(this.a, this, cls, this.b);
    }

    public defpackage.hsz b() {
        return a(android.graphics.Bitmap.class).n(e);
    }

    public defpackage.hsz c() {
        return a(android.graphics.drawable.Drawable.class);
    }

    public defpackage.hsz d(android.graphics.Bitmap bitmap) {
        return c().e(bitmap);
    }

    public defpackage.hsz e(android.net.Uri uri) {
        return c().f(uri);
    }

    public defpackage.hsz f(java.lang.Object obj) {
        return c().h(obj);
    }

    final synchronized defpackage.ies g() {
        return this.k;
    }

    public final void h(android.view.View view) {
        i(new defpackage.iez(view));
    }

    public final void i(defpackage.ifd ifdVar) {
        if (ifdVar == null) {
            return;
        }
        boolean zQ = q(ifdVar);
        defpackage.ien ienVarD = ifdVar.d();
        if (zQ) {
            return;
        }
        java.util.List list = this.a.c;
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((defpackage.htb) it.next()).q(ifdVar)) {
                    return;
                }
            }
            if (ienVarD != null) {
                ifdVar.h(null);
                ienVarD.c();
            }
        }
    }

    @Override // defpackage.idq
    public final synchronized void j() {
        this.h.j();
        r();
        defpackage.idx idxVar = this.f;
        java.util.Iterator it = defpackage.igg.e(idxVar.a).iterator();
        while (it.hasNext()) {
            idxVar.a((defpackage.ien) it.next());
        }
        idxVar.b.clear();
        defpackage.idp idpVar = this.c;
        idpVar.b(this);
        idpVar.b(this.j);
        defpackage.igg.d().removeCallbacks(this.i);
        java.util.List list = this.a.c;
        synchronized (list) {
            if (!list.contains(this)) {
                throw new java.lang.IllegalStateException("Cannot unregister not yet registered manager");
            }
            list.remove(this);
        }
    }

    @Override // defpackage.idq
    public final synchronized void k() {
        n();
        this.h.k();
    }

    @Override // defpackage.idq
    public final synchronized void l() {
        this.h.l();
        m();
    }

    public final synchronized void m() {
        defpackage.idx idxVar = this.f;
        idxVar.c = true;
        for (defpackage.ien ienVar : defpackage.igg.e(idxVar.a)) {
            if (ienVar.n()) {
                ienVar.f();
                idxVar.b.add(ienVar);
            }
        }
    }

    public final synchronized void n() {
        defpackage.idx idxVar = this.f;
        idxVar.c = false;
        for (defpackage.ien ienVar : defpackage.igg.e(idxVar.a)) {
            if (!ienVar.l() && !ienVar.n()) {
                ienVar.b();
            }
        }
        idxVar.b.clear();
    }

    protected synchronized void o(defpackage.ies iesVar) {
        this.k = (defpackage.ies) ((defpackage.ies) iesVar.o()).t();
    }

    final synchronized void p(defpackage.ifd ifdVar, defpackage.ien ienVar) {
        this.h.a.add(ifdVar);
        defpackage.idx idxVar = this.f;
        idxVar.a.add(ienVar);
        if (!idxVar.c) {
            ienVar.b();
            return;
        }
        ienVar.c();
        if (android.util.Log.isLoggable("RequestTracker", 2)) {
            android.util.Log.v("RequestTracker", "Paused, delaying request");
        }
        idxVar.b.add(ienVar);
    }

    final synchronized boolean q(defpackage.ifd ifdVar) {
        defpackage.ien ienVarD = ifdVar.d();
        if (ienVarD == null) {
            return true;
        }
        if (!this.f.a(ienVarD)) {
            return false;
        }
        this.h.a.remove(ifdVar);
        ifdVar.h(null);
        return true;
    }

    public final synchronized java.lang.String toString() {
        defpackage.idw idwVar;
        defpackage.idx idxVar;
        idwVar = this.g;
        idxVar = this.f;
        return super.toString() + "{tracker=" + java.lang.String.valueOf(idxVar) + ", treeNode=" + java.lang.String.valueOf(idwVar) + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
