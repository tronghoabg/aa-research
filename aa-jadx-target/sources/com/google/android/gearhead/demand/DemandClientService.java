package com.google.android.gearhead.demand;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class DemandClientService extends android.app.Service {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DemandClientService");
    public defpackage.kxi b;
    public final android.os.Handler c = new android.os.Handler(android.os.Looper.getMainLooper());
    public final java.util.Map d = new java.util.HashMap();
    private final defpackage.eqt e = new defpackage.nuk(this, 18);
    private final defpackage.xrh f = new defpackage.xrh(this);

    public static final int b(android.os.Bundle bundle) {
        if (bundle == null) {
            return 1;
        }
        if (bundle.getInt("open_cause") == 3) {
            return bundle.getInt("open_cause_key_code") == 84 ? 3 : 2;
        }
        return bundle.getBoolean("gmm_mic") ? 10 : 1;
    }

    public final /* synthetic */ void a(xrf xrfVar) {
        ((defpackage.yqj) a.l().ai((char) 7293)).u("registerCallbacks");
        if (this.b.m()) {
            java.util.Map map = this.d;
            if (map.containsKey(xrfVar.asBinder())) {
                return;
            }
            try {
                map.put(xrfVar.asBinder(), new defpackage.qio(this, xrfVar));
                this.b.i();
                xrfVar.e(this.b.i().e() != null ? ((java.lang.Integer) this.b.i().e()).intValue() : 0);
            } catch (android.os.RemoteException | java.lang.InstantiationException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 7294)).u("Failed to register callbacks");
            }
        }
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        ((defpackage.yqj) a.l().ai((char) 7296)).u("onBind");
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        ((defpackage.yqj) a.l().ai((char) 7297)).u("onCreate");
        super.onCreate();
        defpackage.kxi kxiVarC = defpackage.kpu.c();
        this.b = kxiVarC;
        kxiVarC.i().i(this.e);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        ((defpackage.yqj) a.l().ai((char) 7298)).u("onDestroy");
        this.b.i().k(this.e);
        this.d.clear();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final boolean onUnbind(android.content.Intent intent) {
        ((defpackage.yqj) a.l().ai((char) 7299)).u("onUnbind");
        return false;
    }
}
