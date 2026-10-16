package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mce {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.SharedNotifications");
    public android.service.notification.NotificationListenerService e;
    private final android.content.Context h;
    private long i;
    public final ajnd g = new ajnd(this, (byte[]) null);
    public final java.lang.Object b = new java.lang.Object();
    public int c = 0;
    public final java.util.List d = new java.util.ArrayList();
    public final mbq f = new defpackage.mbp(this);

    public mce(android.content.Context context) {
        this.h = context.getApplicationContext();
    }

    public static defpackage.mce b() {
        return (defpackage.mce) defpackage.mkp.a.i(defpackage.mce.class);
    }

    private final android.service.notification.NotificationListenerService n() {
        android.service.notification.NotificationListenerService notificationListenerService;
        synchronized (this.b) {
            if (this.c != 3) {
                ((defpackage.yqj) ((defpackage.yqj) a.g()).ai(4760)).y("Tried to get NLS while outside lifecycle (current state: %s)", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(this.c)));
            }
            defpackage.ysr.bk(this.c == 3, "ListenerService not connected");
            notificationListenerService = this.e;
            notificationListenerService.getClass();
        }
        return notificationListenerService;
    }

    private final mcb o(mbn mbnVar) {
        defpackage.ysr.bk(!defpackage.acvk.c(), "Local clients must be disabled to look up Binder clients");
        android.os.IBinder iBinderAsBinder = mbnVar.asBinder();
        for (mcb mcbVar : this.d) {
            defpackage.ysr.bk(mcbVar instanceof mcb, "List invariant broken: Expected BinderNotificationListenerClient. The client list must be homogeneous per process lifecycle based on enableLocalNotificationClients.");
            mcb mcbVar2 = mcbVar;
            if (mcbVar2.a.equals(iBinderAsBinder)) {
                return mcbVar2;
            }
        }
        return null;
    }

    private final defpackage.mcc p(mbr mbrVar) {
        defpackage.ysr.bk(defpackage.acvk.c(), "Local clients must be enabled to look up local clients");
        for (mcd mcdVar : this.d) {
            defpackage.ysr.bk(mcdVar instanceof defpackage.mcc, "List invariant broken: Expected LocalNotificationListenerClient. The client list must be homogeneous per process lifecycle based on enableLocalNotificationClients.");
            defpackage.mcc mccVar = (defpackage.mcc) mcdVar;
            if (mccVar.a.equals(mbrVar)) {
                return mccVar;
            }
        }
        return null;
    }

    private final void q(mcd mcdVar) {
        boolean zI = i();
        java.util.List list = this.d;
        list.add(mcdVar);
        if (!zI) {
            defpackage.ojm.a();
            this.i = j$.time.Instant.now().toEpochMilli();
        }
        list.size();
        f();
        if (this.c == 3) {
            mcdVar.a(this.f);
        }
    }

    private final void r(mcd mcdVar) {
        boolean zI = i();
        java.util.List list = this.d;
        list.remove(mcdVar);
        if (zI && !i() && this.c != 3) {
            defpackage.ojm.a();
            long epochMilli = j$.time.Instant.now().minusMillis(this.i).toEpochMilli();
            defpackage.rqt rqtVarA = defpackage.rqt.a(this.h);
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NOTIFICATION_LISTENER, defpackage.zbd.Fl);
            rrvVarH.u(epochMilli);
            rqtVarA.c(rrvVarH.l());
        }
        list.size();
        g();
    }

    public final android.service.notification.NotificationListenerService.RankingMap a() {
        return n().getCurrentRanking();
    }

    public final defpackage.ygw c(java.lang.Iterable iterable) {
        android.service.notification.NotificationListenerService notificationListenerService;
        synchronized (this.b) {
            if (this.c == 3 && (notificationListenerService = this.e) != null) {
                android.service.notification.StatusBarNotification[] activeNotifications = iterable == null ? notificationListenerService.getActiveNotifications() : notificationListenerService.getActiveNotifications((java.lang.String[]) defpackage.ysr.at(iterable, java.lang.String.class));
                if (activeNotifications == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4759)).u("getActiveNotifications returned null");
                    int i = defpackage.ygw.d;
                    return defpackage.ymx.a;
                }
                int i2 = defpackage.ygw.d;
                defpackage.ygr ygrVar = new defpackage.ygr(4);
                defpackage.mbw mbwVarB = defpackage.mbw.b();
                mbwVarB.eQ();
                for (android.service.notification.StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification == null) {
                        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4758)).u("Found null notification element in active notifications");
                    } else {
                        ygrVar.i(statusBarNotification);
                        mbwVarB.e(statusBarNotification);
                    }
                }
                defpackage.ygw ygwVarG = ygrVar.g();
                ((defpackage.yqj) a.l().ai(4757)).w("Successfully polled for active notifications and found %d", ((defpackage.ymx) ygwVarG).c);
                return ygwVarG;
            }
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4756)).u("getActiveNotifications called while not connected");
            int i3 = defpackage.ygw.d;
            return defpackage.ymx.a;
        }
    }

    public final void d(android.service.notification.NotificationListenerService notificationListenerService) {
        defpackage.ysr.aY(this.e == notificationListenerService, "Multiple ListenerService instances are not supported");
    }

    public final void e(java.lang.String str, android.service.notification.NotificationListenerService notificationListenerService) {
        android.service.notification.NotificationListenerService notificationListenerService2 = this.e;
        int iHashCode = notificationListenerService2 != null ? notificationListenerService2.hashCode() : 0;
        int iHashCode2 = notificationListenerService != null ? notificationListenerService.hashCode() : 0;
        defpackage.yqj yqjVar = (defpackage.yqj) a.l().ai(4761);
        defpackage.zke zkeVar = defpackage.zke.a;
        defpackage.zkf zkfVar = new defpackage.zkf(zkeVar, str);
        java.util.List list = this.d;
        yqjVar.V("Status: %s, Clients: %s, Clients requiring NLS: %s, State: %s, NLS class: %s, Stored NLS instance: %s, Event NLS instance: %s", zkfVar, new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(list.size())), new defpackage.zkf(zkeVar, java.lang.Long.valueOf(j$.util.Collection.-EL.stream(list).filter(new defpackage.lyk(6)).count())), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(this.c)), new defpackage.zkf(zkeVar, defpackage.mbt.b().a().flattenToString()), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(iHashCode)), new defpackage.zkf(zkeVar, java.lang.Integer.valueOf(iHashCode2)));
    }

    public final void f() {
        e("#maybeRequestRebind", null);
        android.content.ComponentName componentNameA = defpackage.mbt.b().a();
        if (!i()) {
            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4764)).u("Ignoring rebind as there are no NLS-dependent clients.");
            return;
        }
        defpackage.mbw.b().eQ();
        if (this.c == 0) {
            defpackage.mos.a();
            ((defpackage.yqj) defpackage.mos.a.l().ai((char) 5116)).u("#requestRebindNotificationListener");
            ll$.ExternalSyntheticApiModelOutline0.m(componentNameA);
            defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_REBIND_REQUESTED);
            this.c = 1;
        }
    }

    public final void g() {
        e("#maybeRequestUnbind", null);
        if (this.c != 3 || i()) {
            return;
        }
        defpackage.mbw.b().d();
        defpackage.mos.a();
        android.service.notification.NotificationListenerService notificationListenerService = this.e;
        notificationListenerService.getClass();
        ((defpackage.yqj) defpackage.mos.a.l().ai((char) 5117)).u("#requestUnbindNotificationListener");
        try {
            ll$.ExternalSyntheticApiModelOutline0.m(notificationListenerService);
        } catch (java.lang.SecurityException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.mos.a.h()).p(e)).ai((char) 5118)).u("Suppressing SecurityException when attempting to unbind listener service.");
            defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_UNBIND_THREW_SECURITY_EXCEPTION);
        }
        this.c = 4;
        defpackage.omf.u().x(18, defpackage.zaa.NOTIFICATION_LISTENER_UNBIND_REQUESTED);
    }

    public final void h(int i) {
        n().requestListenerHints(i);
    }

    public final boolean i() {
        java.util.Iterator it = this.d.iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((mcd) it.next()).f();
        return true;
    }

    public final void j(mbn mbnVar) {
        synchronized (this.b) {
            e("#addClient(binder)", null);
            defpackage.ysr.bk(o(mbnVar) == null, "Attempted to add a notification client that was already added");
            android.os.IBinder.DeathRecipient mcbVar = new mcb(mbnVar);
            try {
                ((mcb) mcbVar).a.linkToDeath(mcbVar, 0);
                q(mcbVar);
            } catch (android.os.RemoteException e) {
                throw new java.lang.IllegalArgumentException("Could not linkToDeath on NotificationClient - already dead?", e);
            }
        }
    }

    public final void k(mbr mbrVar) {
        synchronized (this.b) {
            e("#addClient(local)", null);
            defpackage.ysr.bk(p(mbrVar) == null, "Attempted to add a notification client that was already added");
            q(new defpackage.mcc(mbrVar));
        }
    }

    public final void l(mbn mbnVar) {
        synchronized (this.b) {
            e("#removeClient(binder)", null);
            android.os.IBinder.DeathRecipient deathRecipientO = o(mbnVar);
            if (deathRecipientO == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4767)).u("removeClient(binder): not found");
            } else {
                ((mcb) deathRecipientO).a.unlinkToDeath(deathRecipientO, 0);
                r(deathRecipientO);
            }
        }
    }

    public final void m(mbr mbrVar) {
        synchronized (this.b) {
            e("#removeClient(local)", null);
            defpackage.mcc mccVarP = p(mbrVar);
            if (mccVarP == null) {
                ((defpackage.yqj) ((defpackage.yqj) a.h()).ai(4768)).u("removeClient(local): not found");
            } else {
                r(mccVarP);
            }
        }
    }
}
