package com.google.android.gearhead.appdecor;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class AppDecorService extends android.app.Service {
    public static final defpackage.yqm a = defpackage.yqm.c("ADU.AppDecorService");
    public static final android.content.ComponentName b = new android.content.ComponentName("com.google.android.projection.gearhead", com.google.android.gearhead.appdecor.AppDecorService.class.getName());
    public static final defpackage.yhx c = defpackage.yhx.t("com.google.android.projection.gearhead", "com.google.android.apps.gmm.dev", "com.google.android.apps.gmm.car", "com.google.android.apps.gmm.fishfood", "com.google.android.apps.gmm", "com.google.android.apps.gmm.qp", "com.google.android.apps.maps", "com.google.android.googlequicksearchbox");
    defpackage.qic f;
    public defpackage.lja g;
    public defpackage.rpe j;
    defpackage.qup k;
    public ttc l;
    public usc m;
    private defpackage.lji n;
    private defpackage.kfp o;
    public final java.util.concurrent.CopyOnWriteArrayList d = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList e = new java.util.concurrent.CopyOnWriteArrayList();
    public final defpackage.nst h = new nsd(this, 3);
    public volatile defpackage.yhe i = defpackage.ync.a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    public final void a(int i, int i2) throws defpackage.qst, rlo {
        if (!this.j.d(i)) {
            ((defpackage.yqj) a.l().ai((char) 7064)).w("sensor type %d not supported by car", i);
            return;
        }
        this.j.f(this.n, i, i2);
        defpackage.qsz qszVarA = this.j.a(i);
        if (qszVarA != null) {
            this.n.d(qszVarA.a, qszVarA.b, qszVarA.c, qszVarA.d);
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.k = new defpackage.qup(this);
        this.f = new defpackage.qic(this.k);
        this.o = new defpackage.qfx(this);
        this.n = new defpackage.lji(this, 5, null);
        defpackage.kit.b().v(this.o);
        defpackage.ler.c().fV(this.f);
        defpackage.ler.c().getLifecycle().c(new defpackage.qfy(this));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        defpackage.rpe rpeVar = this.j;
        if (rpeVar != null) {
            rpeVar.b(this.n);
        }
        defpackage.kit.b().w(this.o);
        defpackage.ler.b().p(this.g);
        defpackage.ler.c().d(this.f);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public final void onLowMemory() {
        defpackage.lua.a().b(new android.content.ComponentName("com.google.android.projection.gearhead", getClass().getName()));
        super.onLowMemory();
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        defpackage.lua.a().c(i, new android.content.ComponentName("com.google.android.projection.gearhead", getClass().getName()));
        super.onTrimMemory(i);
    }
}
