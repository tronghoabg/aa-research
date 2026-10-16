package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mac implements lzo {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NavClient");
    public final android.content.ComponentName b;
    public defpackage.oxj f;
    private oxl h;
    private defpackage.lzs i;
    public final defpackage.pyk g = new defpackage.pyk(this);
    public com.google.android.apps.auto.sdk.nav.state.TurnEvent c = new com.google.android.apps.auto.sdk.nav.state.TurnEvent();
    public com.google.android.apps.auto.sdk.nav.state.NavigationSummary d = new com.google.android.apps.auto.sdk.nav.state.NavigationSummary();
    public final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());

    public mac(defpackage.oxj oxjVar, android.content.ComponentName componentName) {
        this.f = oxjVar;
        componentName.getClass();
        this.b = componentName;
    }

    private final synchronized void g() throws android.os.RemoteException {
        if (this.h != null) {
            defpackage.us usVar = new defpackage.us(null, null);
            usVar.r(2);
            this.h.c((com.google.android.apps.auto.sdk.nav.state.NavigationSummary) usVar.a);
            this.h = null;
        }
        j(null);
    }

    private static void h(defpackage.zbd zbdVar) {
        defpackage.omf.u().F(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NAVIGATION_CLIENT_MANAGER, zbdVar).l());
    }

    private final synchronized void i(int i) throws android.os.RemoteException {
        android.os.Bundle bundleD = defpackage.mps.d(defpackage.kit.b().e());
        com.google.android.apps.auto.sdk.nav.NavigationClientConfig navigationClientConfig = new com.google.android.apps.auto.sdk.nav.NavigationClientConfig(i, bundleD);
        ((defpackage.yqj) a.l().ai(4545)).D("Registering as navigation client using version = %d and dynamic configuration = %s", i, bundleD);
        defpackage.oxj oxjVar = this.f;
        oxjVar.getClass();
        android.os.Parcel parcelFp = oxjVar.fp();
        defpackage.ijx.g(parcelFp, navigationClientConfig);
        oxjVar.fr(2, parcelFp);
    }

    private final synchronized void j(oxl oxlVar) throws android.os.RemoteException {
        defpackage.oxj oxjVar = this.f;
        oxjVar.getClass();
        defpackage.oxm oxmVarE = oxjVar.e();
        if (oxmVarE == null) {
            ((defpackage.yqj) a.l().ai((char) 4546)).u("Got null navigation state manager");
            if (oxlVar != null) {
                h(defpackage.zbd.pK);
                return;
            }
            return;
        }
        android.os.Parcel parcelFp = oxmVarE.fp();
        defpackage.ijx.i(parcelFp, oxlVar);
        oxmVarE.fs(1, parcelFp);
        this.h = oxlVar;
    }

    private final synchronized void k(oxo oxoVar) throws android.os.RemoteException {
        defpackage.oxj oxjVar = this.f;
        oxjVar.getClass();
        defpackage.oxp oxpVarF = oxjVar.f();
        if (oxpVarF == null) {
            ((defpackage.yqj) a.l().ai((char) 4547)).u("Got null navigation suggestion manager");
            return;
        }
        android.os.Parcel parcelFp = oxpVarF.fp();
        defpackage.ijx.i(parcelFp, oxoVar);
        oxpVarF.fs(1, parcelFp);
    }

    public final android.content.ComponentName a() {
        return this.b;
    }

    public final defpackage.eqp b() {
        return this.i.a;
    }

    public final synchronized com.google.android.apps.auto.sdk.nav.state.NavigationSummary c() {
        return this.d;
    }

    public final synchronized com.google.android.apps.auto.sdk.nav.state.TurnEvent d() {
        return this.c;
    }

    final synchronized void e() {
        try {
            try {
                g();
                k(null);
                defpackage.oxj oxjVar = this.f;
                oxjVar.getClass();
                oxjVar.fr(4, oxjVar.fp());
                this.e.post(new defpackage.img(11));
            } catch (android.os.RemoteException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(4549)).u("Error calling stop() on nav provider");
                h(defpackage.zbd.pI);
            } catch (java.lang.RuntimeException e2) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai(4548)).u("Error in nav provider cleaning up before unbind");
                h(defpackage.zbd.pJ);
            }
            this.f = null;
        } catch (java.lang.Throwable th) {
            this.f = null;
            throw th;
        }
    }

    public final synchronized boolean f() {
        int i;
        defpackage.wfp.b();
        defpackage.oxj oxjVar = this.f;
        oxjVar.getClass();
        try {
            android.os.Parcel parcelFq = oxjVar.fq(1, oxjVar.fp());
            com.google.android.apps.auto.sdk.nav.NavigationProviderConfig navigationProviderConfig = (com.google.android.apps.auto.sdk.nav.NavigationProviderConfig) defpackage.ijx.a(parcelFq, com.google.android.apps.auto.sdk.nav.NavigationProviderConfig.CREATOR);
            parcelFq.recycle();
            if (navigationProviderConfig == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(4544)).u("Got null provider config from nav provider service");
                h(defpackage.zbd.pF);
                return false;
            }
            if (navigationProviderConfig.a > 1 || (i = navigationProviderConfig.b) <= 0) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.ENGLISH, "Invalid API level for connecting to navigation provider. Client is %d. Provider accepts [%d, %d]", 1, java.lang.Integer.valueOf(navigationProviderConfig.a), java.lang.Integer.valueOf(navigationProviderConfig.b)));
            }
            i(java.lang.Math.min(1, i));
            defpackage.oxp oxpVarF = this.f.f();
            defpackage.lzs lzsVar = new defpackage.lzs(this);
            this.i = lzsVar;
            if (oxpVarF != null) {
                k(lzsVar);
            }
            defpackage.oxm oxmVarE = this.f.e();
            defpackage.map mapVar = new defpackage.map(this.b);
            if (oxmVarE != null) {
                j(new defpackage.mab(this, mapVar));
            }
            defpackage.oxj oxjVar2 = this.f;
            com.google.android.apps.auto.sdk.nav.ClientMode clientMode = new com.google.android.apps.auto.sdk.nav.ClientMode(null);
            android.os.Parcel parcelFp = oxjVar2.fp();
            defpackage.ijx.g(parcelFp, clientMode);
            oxjVar2.fs(3, parcelFp);
            return true;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 4542)).u("RemoteException in nav provider registration.");
            h(defpackage.zbd.pG);
            return false;
        } catch (java.lang.RuntimeException e2) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e2)).ai((char) 4543)).u("RuntimeException in nav provider registration.");
            h(defpackage.zbd.pH);
            return false;
        }
    }

    public final java.lang.String toString() {
        return "NavigationProviderClient{, navProviderName=" + java.lang.String.valueOf(this.b) + "}";
    }
}
