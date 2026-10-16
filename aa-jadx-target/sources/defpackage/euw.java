package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class euw implements defpackage.eqg, defpackage.esa, defpackage.epu, defpackage.fbm {
    public defpackage.evf a;
    public defpackage.epx b;
    public final java.lang.String c;
    public final android.os.Bundle d;
    public boolean f;
    public defpackage.epx i;
    public final evt j;
    public final defpackage.erh k;
    private final android.os.Bundle l;
    public final defpackage.fbl e = defpackage.ebq.h(this);
    private final defpackage.afar m = defpackage.afga.cA(new euv(0));
    public final defpackage.eqi g = new defpackage.eqi(this, true);
    public final defpackage.afar h = defpackage.afga.cA(new euv(2));

    public euw(defpackage.erh erhVar, defpackage.evf evfVar, android.os.Bundle bundle, defpackage.epx epxVar, evt evtVar, java.lang.String str, android.os.Bundle bundle2) {
        this.k = erhVar;
        this.a = evfVar;
        this.l = bundle;
        this.b = epxVar;
        this.j = evtVar;
        this.c = str;
        this.d = bundle2;
        defpackage.afga.cA(new defpackage.eig(this, 4));
        this.i = defpackage.epx.b;
    }

    public final android.os.Bundle a() {
        android.os.Bundle bundle = this.l;
        if (bundle == null) {
            return null;
        }
        android.os.Bundle bundleU = defpackage.ebl.u((defpackage.afau[]) java.util.Arrays.copyOf(new defpackage.afau[0], 0));
        bundleU.putAll(bundle);
        return bundleU;
    }

    public final void b(defpackage.epx epxVar) {
        epxVar.getClass();
        this.i = epxVar;
        c();
    }

    public final void c() {
        if (!this.f) {
            defpackage.fbl fblVar = this.e;
            fblVar.a();
            this.f = true;
            if (this.j != null) {
                defpackage.erm.b(this);
            }
            fblVar.b(this.d);
        }
        int iOrdinal = this.b.ordinal();
        int iOrdinal2 = this.i.ordinal();
        defpackage.eqi eqiVar = this.g;
        if (iOrdinal < iOrdinal2) {
            eqiVar.f(this.b);
        } else {
            eqiVar.f(this.i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        boolean zJ;
        if (obj != null && (obj instanceof defpackage.euw)) {
            android.os.Bundle bundle = this.l;
            defpackage.euw euwVar = (defpackage.euw) obj;
            android.os.Bundle bundle2 = euwVar.l;
            if (defpackage.afga.f(bundle, bundle2)) {
                zJ = true;
            } else {
                zJ = (bundle == null || bundle2 == null) ? false : defpackage.ckn.j(bundle, bundle2);
            }
            if (defpackage.afga.f(this.c, euwVar.c) && defpackage.afga.f(this.a, euwVar.a) && defpackage.afga.f(this.g, euwVar.g) && defpackage.afga.f(getSavedStateRegistry(), euwVar.getSavedStateRegistry()) && zJ) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    @Override // defpackage.epu
    public final defpackage.esi getDefaultViewModelCreationExtras() {
        android.app.Application application;
        defpackage.esk eskVar = new defpackage.esk((byte[]) null);
        eskVar.b(defpackage.erm.a, this);
        eskVar.b(defpackage.erm.b, this);
        android.os.Bundle bundleA = a();
        if (bundleA != null) {
            eskVar.b(defpackage.erm.c, bundleA);
        }
        defpackage.erh erhVar = this.k;
        if (erhVar != null) {
            android.content.Context applicationContext = ((android.content.Context) erhVar.a).getApplicationContext();
            if (applicationContext instanceof android.app.Application) {
                application = (android.app.Application) applicationContext;
            } else {
                application = null;
            }
        } else {
            application = null;
        }
        android.app.Application application2 = true == (application instanceof android.app.Application) ? application : null;
        if (application2 != null) {
            eskVar.b(defpackage.erv.b, application2);
        }
        return eskVar;
    }

    @Override // defpackage.epu
    public final defpackage.erw getDefaultViewModelProviderFactory() {
        return (defpackage.ern) this.m.a();
    }

    @Override // defpackage.eqg
    public final defpackage.epy getLifecycle() {
        return this.g;
    }

    @Override // defpackage.fbm
    public final defpackage.fbk getSavedStateRegistry() {
        return (defpackage.fbk) this.e.b;
    }

    @Override // defpackage.esa
    public final defpackage.erz getViewModelStore() {
        if (!this.f) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.g.e == defpackage.epx.a) {
            throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        evt evtVar = this.j;
        if (evtVar == null) {
            throw new java.lang.IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        java.lang.String str = this.c;
        defpackage.aau aauVar = evtVar.a.B().a;
        java.lang.Object objA = aauVar.a(str);
        if (objA == null) {
            objA = new esl(str, new defpackage.erz());
            aauVar.m(str, objA);
        }
        return ((esl) objA).b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() * 31) + this.a.hashCode();
        android.os.Bundle bundle = this.l;
        if (bundle != null) {
            iHashCode = (iHashCode * 31) + defpackage.ckn.i(bundle);
        }
        return (((iHashCode * 31) + this.g.hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(defpackage.afgw.b(sb.getClass()).getSimpleName());
        sb.append("(" + this.c + ")");
        sb.append(" destination=");
        sb.append(this.a);
        return sb.toString();
    }
}
