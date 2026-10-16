package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import j$.time.Instant;
import j$.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class mbw {
    public static final yph a = yph.c("GH.SharedNotifications");
    public NotificationListenerService e;
    private final Context h;
    private long i;
    public final ajmd g = new ajmd(this, null);
    public final Object b = new Object();
    public int c = 0;
    public final List d = new ArrayList();
    public final mbj f = new mbi(this);

    public mbw(Context context) {
        this.h = context.getApplicationContext();
    }

    public static mbw b() {
        return (mbw) mki.a.i(mbw.class);
    }

    private final NotificationListenerService n() {
        NotificationListenerService notificationListenerService;
        synchronized (this.b) {
            if (this.c != 3) {
                ((ype) ((ype) a.g()).ai(4757)).y("Tried to get NLS while outside lifecycle (current state: %s)", new zjd(zjc.a, Integer.valueOf(this.c)));
            }
            woy.aa(this.c == 3, "ListenerService not connected");
            notificationListenerService = this.e;
            notificationListenerService.getClass();
        }
        return notificationListenerService;
    }

    private final mbt o(mbg mbgVar) {
        woy.aa(!acui.c(), "Local clients must be disabled to look up Binder clients");
        IBinder iBinderAsBinder = mbgVar.asBinder();
        for (mbv mbvVar : this.d) {
            woy.aa(mbvVar instanceof mbt, "List invariant broken: Expected BinderNotificationListenerClient. The client list must be homogeneous per process lifecycle based on enableLocalNotificationClients.");
            mbt mbtVar = (mbt) mbvVar;
            if (mbtVar.a.equals(iBinderAsBinder)) {
                return mbtVar;
            }
        }
        return null;
    }

    private final mbu p(mbk mbkVar) {
        woy.aa(acui.c(), "Local clients must be enabled to look up local clients");
        for (mbv mbvVar : this.d) {
            woy.aa(mbvVar instanceof mbu, "List invariant broken: Expected LocalNotificationListenerClient. The client list must be homogeneous per process lifecycle based on enableLocalNotificationClients.");
            mbu mbuVar = (mbu) mbvVar;
            if (mbuVar.a.equals(mbkVar)) {
                return mbuVar;
            }
        }
        return null;
    }

    private final void q(mbv mbvVar) {
        boolean zI = i();
        List list = this.d;
        list.add(mbvVar);
        if (!zI) {
            oit.a();
            this.i = Instant.now().toEpochMilli();
        }
        list.size();
        f();
        if (this.c == 3) {
            mbvVar.a(this.f);
        }
    }

    private final void r(mbv mbvVar) {
        boolean zI = i();
        List list = this.d;
        list.remove(mbvVar);
        if (zI && !i() && this.c != 3) {
            oit.a();
            long epochMilli = Instant.now().minusMillis(this.i).toEpochMilli();
            rpz rpzVarA = rpz.a(this.h);
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_LISTENER, yzy.Fh);
            rrbVarH.u(epochMilli);
            rpzVarA.c(rrbVarH.l());
        }
        list.size();
        g();
    }

    public final NotificationListenerService.RankingMap a() {
        return n().getCurrentRanking();
    }

    public final yfq c(Iterable iterable) {
        NotificationListenerService notificationListenerService;
        synchronized (this.b) {
            if (this.c == 3 && (notificationListenerService = this.e) != null) {
                StatusBarNotification[] activeNotifications = iterable == null ? notificationListenerService.getActiveNotifications() : notificationListenerService.getActiveNotifications((String[]) yrm.at(iterable, String.class));
                if (activeNotifications == null) {
                    ((ype) ((ype) a.h()).ai((char) 4756)).u("getActiveNotifications returned null");
                    int i = yfq.d;
                    return yls.a;
                }
                int i2 = yfq.d;
                yfl yflVar = new yfl(4);
                mbp mbpVarB = mbp.b();
                mbpVarB.c();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (statusBarNotification == null) {
                        ((ype) ((ype) a.h()).ai((char) 4755)).u("Found null notification element in active notifications");
                    } else {
                        yflVar.i(statusBarNotification);
                        mbpVarB.e(statusBarNotification);
                    }
                }
                yfq yfqVarG = yflVar.g();
                ((ype) a.l().ai(4754)).w("Successfully polled for active notifications and found %d", ((yls) yfqVarG).c);
                return yfqVarG;
            }
            ((ype) ((ype) a.h()).ai(4753)).u("getActiveNotifications called while not connected");
            int i3 = yfq.d;
            return yls.a;
        }
    }

    public final void d(NotificationListenerService notificationListenerService) {
        woy.O(this.e == notificationListenerService, "Multiple ListenerService instances are not supported");
    }

    public final void e(String str, NotificationListenerService notificationListenerService) {
        NotificationListenerService notificationListenerService2 = this.e;
        int iHashCode = notificationListenerService2 != null ? notificationListenerService2.hashCode() : 0;
        int iHashCode2 = notificationListenerService != null ? notificationListenerService.hashCode() : 0;
        ype ypeVar = (ype) a.l().ai(4758);
        zjc zjcVar = zjc.a;
        zjd zjdVar = new zjd(zjcVar, str);
        List list = this.d;
        ypeVar.V("Status: %s, Clients: %s, Clients requiring NLS: %s, State: %s, NLS class: %s, Stored NLS instance: %s, Event NLS instance: %s", zjdVar, new zjd(zjcVar, Integer.valueOf(list.size())), new zjd(zjcVar, Long.valueOf(Collection.EL.stream(list).filter(new lye(5)).count())), new zjd(zjcVar, Integer.valueOf(this.c)), new zjd(zjcVar, mbm.b().a().flattenToString()), new zjd(zjcVar, Integer.valueOf(iHashCode)), new zjd(zjcVar, Integer.valueOf(iHashCode2)));
    }

    public final void f() {
        e("#maybeRequestRebind", null);
        ComponentName componentNameA = mbm.b().a();
        if (!i()) {
            ((ype) ((ype) a.f()).ai((char) 4761)).u("Ignoring rebind as there are no NLS-dependent clients.");
            return;
        }
        mbp.b().c();
        if (this.c == 0) {
            mom.a();
            ((ype) mom.a.l().ai((char) 5114)).u("#requestRebindNotificationListener");
            NotificationListenerService.requestRebind(componentNameA);
            ebf.j().x(18, yyv.NOTIFICATION_LISTENER_REBIND_REQUESTED);
            this.c = 1;
        }
    }

    public final void g() {
        e("#maybeRequestUnbind", null);
        if (this.c != 3 || i()) {
            return;
        }
        mbp.b().d();
        mom.a();
        NotificationListenerService notificationListenerService = this.e;
        notificationListenerService.getClass();
        ((ype) mom.a.l().ai((char) 5115)).u("#requestUnbindNotificationListener");
        try {
            notificationListenerService.requestUnbind();
        } catch (SecurityException e) {
            ((ype) ((ype) ((ype) mom.a.h()).p(e)).ai((char) 5116)).u("Suppressing SecurityException when attempting to unbind listener service.");
            ebf.j().x(18, yyv.NOTIFICATION_LISTENER_UNBIND_THREW_SECURITY_EXCEPTION);
        }
        this.c = 4;
        ebf.j().x(18, yyv.NOTIFICATION_LISTENER_UNBIND_REQUESTED);
    }

    public final void h(int i) {
        n().requestListenerHints(i);
    }

    public final boolean i() {
        Iterator it = this.d.iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((mbv) it.next()).f();
        return true;
    }

    public final void j(mbg mbgVar) {
        synchronized (this.b) {
            e("#addClient(binder)", null);
            woy.aa(o(mbgVar) == null, "Attempted to add a notification client that was already added");
            mbt mbtVar = new mbt(mbgVar);
            try {
                mbtVar.a.linkToDeath(mbtVar, 0);
                q(mbtVar);
            } catch (RemoteException e) {
                throw new IllegalArgumentException("Could not linkToDeath on NotificationClient - already dead?", e);
            }
        }
    }

    public final void k(mbk mbkVar) {
        synchronized (this.b) {
            e("#addClient(local)", null);
            woy.aa(p(mbkVar) == null, "Attempted to add a notification client that was already added");
            q(new mbu(mbkVar));
        }
    }

    public final void l(mbg mbgVar) {
        synchronized (this.b) {
            e("#removeClient(binder)", null);
            mbt mbtVarO = o(mbgVar);
            if (mbtVarO == null) {
                ((ype) ((ype) a.h()).ai(4764)).u("removeClient(binder): not found");
            } else {
                mbtVarO.a.unlinkToDeath(mbtVarO, 0);
                r(mbtVarO);
            }
        }
    }

    public final void m(mbk mbkVar) {
        synchronized (this.b) {
            e("#removeClient(local)", null);
            mbu mbuVarP = p(mbkVar);
            if (mbuVarP == null) {
                ((ype) ((ype) a.h()).ai(4765)).u("removeClient(local): not found");
            } else {
                r(mbuVarP);
            }
        }
    }
}
