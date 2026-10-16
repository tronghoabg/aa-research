package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class epz implements defpackage.eqe {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public epz(defpackage.afgq afgqVar, android.support.v4.app.Fragment fragment, int i) {
        this.c = i;
        this.b = afgqVar;
        this.a = fragment;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [aiwg, java.lang.Object] */
    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        int i = this.c;
        if (i == 0) {
            defpackage.epx epxVarA = eqgVar.getLifecycle().a();
            java.lang.Object obj = this.a;
            if (epxVarA == defpackage.epx.a) {
                this.b.s((java.util.concurrent.CancellationException) null);
                ((defpackage.eqa) obj).a();
                return;
            }
            defpackage.eqa eqaVar = (defpackage.eqa) obj;
            if (eqgVar.getLifecycle().a().compareTo((java.lang.Enum) eqaVar.d) < 0) {
                ((epm) eqaVar.b).a = true;
                return;
            }
            epm epmVar = (epm) eqaVar.b;
            if (epmVar.a) {
                if (epmVar.b) {
                    throw new java.lang.IllegalStateException("Cannot resume a finished dispatcher");
                }
                epmVar.a = false;
                epmVar.a();
                return;
            }
            return;
        }
        if (i == 1) {
            if (epwVar.a().a(defpackage.epx.d)) {
                ((defpackage.afgq) this.b).a = false;
                ((android.support.v4.app.Fragment) this.a).getLifecycle().d(this);
                return;
            }
            return;
        }
        if (i == 2) {
            if (epwVar == this.b) {
                ((defpackage.afer) this.a.a()).invoke();
                return;
            }
            return;
        }
        java.lang.Object obj2 = this.a;
        if (i != 3) {
            if (obj2 != null) {
                java.lang.Object obj3 = this.b;
                java.lang.String strName = epwVar.a().name();
                defpackage.ypu ypuVarL = com.google.android.apps.auto.client.activity.ghost.GhostActivity.m.l();
                java.lang.String strFlattenToShortString = ((com.google.android.apps.auto.client.activity.ghost.GhostActivity) obj3).o().flattenToShortString();
                defpackage.zke zkeVar = defpackage.zke.a;
                ypuVarL.M("GhostActivity for %s %s", new defpackage.zkf(zkeVar, strFlattenToShortString), new defpackage.zkf(zkeVar, strName));
                ((android.widget.TextView) obj2).setText(strName);
                return;
            }
            return;
        }
        java.lang.Object obj4 = this.b;
        if (epwVar == defpackage.epw.ON_RESUME) {
            defpackage.evv evvVar = (defpackage.evv) obj4;
            if (((java.util.List) evvVar.f().d.b()).contains(obj2)) {
                if (defpackage.ewm.k()) {
                    android.util.Log.v("FragmentNavigator", defpackage.a.bv(eqgVar, obj2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching RESUMED"));
                }
                evvVar.f().c((defpackage.euw) obj2);
            }
        }
        if (epwVar == defpackage.epw.ON_DESTROY) {
            if (defpackage.ewm.k()) {
                android.util.Log.v("FragmentNavigator", defpackage.a.bv(eqgVar, obj2, "Marking transition complete for entry ", " due to fragment ", " view lifecycle reaching DESTROYED"));
            }
            ((defpackage.evv) obj4).f().c((defpackage.euw) obj2);
        }
    }

    public /* synthetic */ epz(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ epz(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
