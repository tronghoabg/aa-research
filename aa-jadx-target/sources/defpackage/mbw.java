package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbw implements defpackage.lhn {
    private static final defpackage.yqm b = defpackage.yqm.c("GH.SbnsImpl");
    public final java.util.Map a = new j$.util.concurrent.ConcurrentHashMap();
    private final java.util.concurrent.atomic.AtomicBoolean c = new java.util.concurrent.atomic.AtomicBoolean();

    public mbw(defpackage.jrj jrjVar) {
        defpackage.ysr.aY(jrjVar == defpackage.jrj.b, "StatusBarNotifications should only be stored in the same process as the NotificationListenerService.");
    }

    public static defpackage.mbw b() {
        return (defpackage.mbw) defpackage.mkp.a.i(defpackage.mbw.class);
    }

    public final mbu a(java.lang.String str) {
        if (!this.c.get()) {
            ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 4718)).u("SBNs isn't running but an SBN was requested.");
            return null;
        }
        mbu mbuVar = (mbu) this.a.get(str);
        if (mbuVar != null) {
            return mbuVar;
        }
        throw new java.lang.IllegalStateException("Couldn't find SBN for requested key ".concat(java.lang.String.valueOf(str)));
    }

    @Override // defpackage.lhn
    public final void d() {
        this.c.set(false);
        this.a.clear();
    }

    public final void e(android.service.notification.StatusBarNotification statusBarNotification) {
        if (this.c.get() && ((defpackage.mcf) defpackage.mkp.a.i(defpackage.mcf.class)).a(statusBarNotification)) {
            mbu mbuVar = (mbu) j$.util.Map.-EL.putIfAbsent(this.a, statusBarNotification.getKey(), new mbu(statusBarNotification));
            if (mbuVar != null) {
                j$.util.Optional optionalOf = j$.util.Optional.of(statusBarNotification);
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                mbuVar.a(optionalOf, j$.util.Optional.of(bool), j$.util.Optional.of(bool), j$.util.Optional.empty(), j$.util.Optional.empty());
            }
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.c.set(true);
    }
}
