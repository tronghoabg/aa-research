package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mas implements defpackage.lhn, defpackage.mnj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.GhNavFocusManager");
    public boolean b;
    public boolean c;
    public boolean d;
    public defpackage.maq e = defpackage.maq.a;
    public defpackage.roz f;
    public ajnd g;

    public static defpackage.mas a() {
        return (defpackage.mas) defpackage.mkp.a.i(defpackage.mas.class);
    }

    public final void b(boolean z) throws defpackage.qst {
        defpackage.roz rozVar = this.f;
        rozVar.getClass();
        rozVar.c(1, z ? 1 : 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        defpackage.mni.a().d(defpackage.mnh.p);
        if (!this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4648)).u("NavigationFocusManager is already stopped.");
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 4647)).u("Stopping NavigationFocusManager");
        e(defpackage.maq.b);
        this.d = false;
        defpackage.roz rozVar = this.f;
        if (rozVar != null) {
            rozVar.a();
        }
        this.f = null;
        this.b = false;
    }

    public final void e(defpackage.maq maqVar) {
        ajnd ajndVar;
        defpackage.maq maqVar2 = this.e;
        this.e = maqVar;
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai(4643)).M("setFocus previous=%s current=%s", maqVar2, this.e);
        defpackage.maq maqVar3 = this.e;
        defpackage.maq maqVar4 = defpackage.maq.e;
        boolean z = maqVar3 == maqVar4 || maqVar3 == defpackage.maq.d;
        if (z == (maqVar2 == maqVar4 || maqVar2 == defpackage.maq.d) || (ajndVar = this.g) == null || z) {
            return;
        }
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4644)).u("setFocus sending onFocusLost");
        ajndVar.G();
        this.g = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        defpackage.wfp.c();
        if (this.b) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4646)).u("NavigationFocusManager is already started.");
            return;
        }
        ((defpackage.yqj) a.l().ai((char) 4645)).u("Starting NavigationFocusManager");
        defpackage.mni.a().b(defpackage.mnh.p, this);
        defpackage.kgu.d(new defpackage.kyo(this, 5), "GH.GhNavFocusManager", defpackage.zbe.APP_HOST_CONTEXT, defpackage.zbd.qn, "Non-recoverable error during initialization. Bailing.", new java.lang.Object[0]);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final ajnd f() throws wfo {
        defpackage.wfp.c();
        return this.g;
    }

    @Override // defpackage.mnj
    public final void h(java.io.PrintWriter printWriter) {
        printWriter.printf("Focus State: %d Category Ownership %b\n", java.lang.Integer.valueOf(this.e.ordinal()), java.lang.Boolean.valueOf(this.d));
        ajnd ajndVar = this.g;
        if (ajndVar == null) {
            printWriter.println("No current ownership.");
        } else {
            printWriter.printf("Current Owner: %s", ajndVar.F());
        }
    }
}
