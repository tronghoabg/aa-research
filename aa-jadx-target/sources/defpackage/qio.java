package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qio implements android.os.IBinder.DeathRecipient {
    public final xrf a;
    final /* synthetic */ com.google.android.gearhead.demand.DemandClientService b;

    public qio(com.google.android.gearhead.demand.DemandClientService demandClientService, xrf xrfVar) throws java.lang.InstantiationException {
        this.b = demandClientService;
        try {
            xrfVar.asBinder().linkToDeath(this, 0);
            this.a = xrfVar;
        } catch (android.os.RemoteException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) com.google.android.gearhead.demand.DemandClientService.a.h()).p(e)).ai((char) 7288)).u("linkToDeath failed");
            throw new java.lang.InstantiationException("linkToDeath failed with callbacks");
        }
    }

    public final void a() {
        java.util.Map map = this.b.d;
        xrf xrfVar = this.a;
        map.remove(xrfVar.asBinder());
        try {
            xrfVar.asBinder().unlinkToDeath(this, 0);
        } catch (java.util.NoSuchElementException unused) {
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        ((defpackage.yqj) com.google.android.gearhead.demand.DemandClientService.a.l().ai((char) 7289)).u("binder died");
        com.google.android.gearhead.demand.DemandClientService demandClientService = this.b;
        demandClientService.b.j(defpackage.yxp.UNKNOWN_CANCEL_TRIGGER);
        demandClientService.c.post(new defpackage.qie(this, 3));
    }
}
