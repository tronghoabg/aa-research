package com.google.android.apps.auto.components.lifetime.service;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class GhLifetimeService extends android.app.Service {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.GhLifetimeService");
    public java.lang.Boolean c;
    public boolean d;
    android.os.IBinder e;
    private final defpackage.lip f = new defpackage.lip(this);
    public final java.util.Map b = new java.util.LinkedHashMap();
    private final defpackage.lhs g = new defpackage.lio(this);

    public final int a() {
        return this.d ? 2 : 1;
    }

    public final void b(boolean z) {
        defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(3962);
        java.util.Map map = this.b;
        yqjVar.O("notifyProjectionLifetimeStateChanged(started:%b) listener count: %d", z, map.size());
        java.util.Iterator it = z ? map.keySet().iterator() : defpackage.ysr.U(new java.util.ArrayList(map.keySet())).iterator();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (it.hasNext()) {
            defpackage.rqh rqhVar = (defpackage.rqh) it.next();
            if (z) {
                try {
                    rqhVar.e(a());
                } catch (android.os.RemoteException e) {
                    ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.g()).p(e)).ai((char) 3963)).u("RemoteException calling onProjectionLifetimeStateChanged. Removing callback.");
                    android.os.IBinder.DeathRecipient deathRecipient = (android.os.IBinder.DeathRecipient) this.b.get(rqhVar);
                    arrayList.add(rqhVar);
                    if (deathRecipient != null) {
                        rqhVar.asBinder().unlinkToDeath(deathRecipient, 0);
                    }
                }
            } else {
                rqhVar.e(0);
            }
        }
        this.b.keySet().removeAll(arrayList);
    }

    @Override // android.app.Service
    public final android.os.IBinder onBind(android.content.Intent intent) {
        defpackage.rqd rqdVar = new defpackage.rqd(this.f);
        this.e = rqdVar;
        return rqdVar;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.c = java.lang.Boolean.valueOf(((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fY());
        this.d = ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fX();
        ((defpackage.lht) defpackage.mkp.a.i(defpackage.lht.class)).fW(this.g, true);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        defpackage.ler.c().d(this.g);
        super.onDestroy();
    }
}
