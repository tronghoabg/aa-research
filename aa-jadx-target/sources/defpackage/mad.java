package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mad implements maa, mae {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NavProviderClientSrc");
    public final android.content.ComponentName b;
    public final lzz c;
    public defpackage.maf e;
    public final android.os.Handler f;
    private final android.content.ComponentName i;
    private final android.content.Context j;
    private final defpackage.lwz k;
    public final java.lang.Object d = new java.lang.Object();
    public int g = 0;
    public final java.lang.Runnable h = new defpackage.lzk(this, 3, null);

    public mad(android.content.Context context, defpackage.lwz lwzVar, android.content.ComponentName componentName, android.content.ComponentName componentName2, lzz lzzVar) {
        this.j = context;
        lwzVar.getClass();
        this.k = lwzVar;
        this.i = componentName;
        this.b = componentName2;
        this.c = lzzVar;
        this.f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean a() {
        android.content.ComponentName componentName = this.b;
        componentName.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(componentName);
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 4550)).y("Binding to nav service: %s", componentName);
        synchronized (this.d) {
            defpackage.maf mafVar = this.e;
            if (mafVar == null || !mafVar.d.equals(componentName)) {
                d(this.e);
                intent.putExtra("NAVIGATION_CLIENT_CONFIG", new com.google.android.apps.auto.sdk.nav.NavigationClientConfig(1, defpackage.mps.d(defpackage.kit.b().e())));
                defpackage.maf mafVar2 = new defpackage.maf(componentName, this);
                if (!defpackage.sqf.a().d(this.j, intent, mafVar2, android.os.Build.VERSION.SDK_INT >= 29 ? 4097 : 1)) {
                    return false;
                }
                this.e = mafVar2;
                this.f.postDelayed(this.h, 5000L);
            } else {
                ((defpackage.yqj) yqmVar.l().ai(4551)).y("Trying to bind to same nav provider when already bound. Ignoring: %s", componentName);
            }
            return true;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void b() throws wfo {
        d(this.e);
        if (this.g < 3) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4553)).K("Navigation Client Provider Rebind to %s attempt: %d", this.i, this.g);
            this.g++;
            a();
        } else {
            defpackage.ypu ypuVarG = a.g();
            android.content.ComponentName componentName = this.i;
            ((defpackage.yqj) ((defpackage.yqj) ypuVarG).ai((char) 4552)).y("Unable to bind to %s", componentName);
            this.c.n(componentName, "Rebind limit exceeded");
        }
    }

    public final void c(defpackage.maf mafVar) {
        if (mafVar == null) {
            return;
        }
        android.content.ComponentName componentName = mafVar.d;
        ((defpackage.yqj) a.l().ai((char) 4554)).y("Unbinding from nav service: %s", componentName.getShortClassName());
        try {
            try {
                mafVar.a();
            } catch (java.lang.RuntimeException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai(4555)).u("Error in nav provider while unbinding from it");
            }
            defpackage.sqf.a().c(this.j, mafVar);
            if (this.e == mafVar) {
            }
        } finally {
            defpackage.sqf.a().c(this.j, mafVar);
            if (this.e == mafVar) {
                this.e = null;
            }
            this.f.removeCallbacks(this.h);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void d(defpackage.maf mafVar) throws wfo {
        c(mafVar);
        defpackage.wfp.c();
        defpackage.lzw lzwVar = (defpackage.lzw) this.c;
        lzwVar.o(null);
        maa maaVar = lzwVar.d;
        if (maaVar != null) {
            defpackage.eqs eqsVar = lzwVar.f;
            ajot ajotVar = new ajot((char[]) null);
            ajotVar.k(((defpackage.mad) maaVar).b);
            ajotVar.a = 1;
            eqsVar.m(ajotVar.j());
        }
        if (defpackage.aczg.c()) {
            mai.c().d();
        } else {
            defpackage.lxy.o().h(defpackage.zaw.NAV_NOTIFICATION_HERO);
            defpackage.lxy.o().h(defpackage.zaw.NAV_NOTIFICATION_NORMAL);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigationProviderClientSource{navComponent=");
        sb.append(this.i);
        sb.append(", navProviderComponent=");
        sb.append(this.b);
        synchronized (this.d) {
            sb.append(", currentConnection=");
            sb.append(this.e);
            sb.append(", rebindAttempts=");
            sb.append(this.g);
        }
        sb.append('}');
        return sb.toString();
    }
}
