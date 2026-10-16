package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.ArrayMap;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class mba implements mau {
    public static final yph a = yph.c("GH.NotificationProc");
    public final List b;
    public final Map c;
    public mbl d;
    public boolean e;
    public boolean f;
    private final Context g;
    private yfq h;
    private yfq i;
    private final mbd j;

    public mba(Context context) {
        mbd mbdVar = new mbd("GH.NotificationProc");
        this.b = new ArrayList();
        this.c = new ArrayMap();
        context.getClass();
        this.g = context;
        if (actj.w()) {
            yfl yflVar = new yfl(4);
            int i = lxm.a;
            int i2 = lxi.a;
            int i3 = lxh.a;
            yflVar.j(lxl.k(), (lxm) mki.a.i(lxm.class), (lxi) mki.a.i(lxi.class), (lxh) mki.a.i(lxh.class));
            this.i = yflVar.g();
        } else {
            yfl yflVar2 = new yfl(4);
            int i4 = lxq.a;
            int i5 = lxg.a;
            int i6 = lxf.a;
            yflVar2.j(lxp.m(), (lxq) mki.a.i(lxq.class), (lxg) mki.a.i(lxg.class), (lxf) mki.a.i(lxf.class));
            if (!acye.c()) {
                int i7 = mnv.a;
                yflVar2.i((mnv) mki.a.i(mnv.class));
            }
            this.h = yflVar2.g();
        }
        this.j = mbdVar;
    }

    public static final int j(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        if (rankingMap != null) {
            NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
            if (rankingMap.getRanking(statusBarNotification.getKey(), ranking)) {
                return ranking.getImportance();
            }
            return -1000;
        }
        int i = statusBarNotification.getNotification().priority;
        if (i == -2) {
            return 1;
        }
        if (i != -1) {
            return (i == 1 || i == 2) ? 4 : 3;
        }
        return 2;
    }

    private static Uri k(Notification notification) {
        if ((notification.defaults & 1) != 0) {
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        return null;
    }

    private final Uri l(StatusBarNotification statusBarNotification) {
        mbl mblVar = this.d;
        mblVar.getClass();
        Uri uriK = k(statusBarNotification.getNotification());
        if (uriK != null) {
            return uriK;
        }
        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
        mblVar.a().getRanking(statusBarNotification.getKey(), ranking);
        NotificationChannel channel = ranking.getChannel();
        if (channel != null) {
            return channel.getSound();
        }
        return null;
    }

    @Override // defpackage.mau
    public final Uri a(StatusBarNotification statusBarNotification) {
        Uri uriL;
        Uri uriK;
        Notification notification = statusBarNotification.getNotification();
        Uri uriL2 = l(statusBarNotification);
        if (uriL2 != null) {
            return uriL2;
        }
        if (Objects.equals(statusBarNotification.getKey(), statusBarNotification.getGroupKey())) {
            return null;
        }
        if (notification.publicVersion != null && (uriK = k(notification.publicVersion)) != null) {
            return uriK;
        }
        mbl mblVar = this.d;
        mblVar.getClass();
        for (StatusBarNotification statusBarNotification2 : mblVar.b()) {
            if (Objects.equals(statusBarNotification.getGroupKey(), statusBarNotification2.getGroupKey()) && (uriL = l(statusBarNotification2)) != null) {
                return uriL;
            }
        }
        return null;
    }

    @Override // defpackage.mau
    public final NotificationListenerService.RankingMap b() {
        mbl mblVar = this.d;
        if (mblVar == null) {
            return null;
        }
        return mblVar.a();
    }

    @Override // defpackage.lhg
    public final void c() {
        ((ype) a.l().ai((char) 4699)).u("Starting");
        wer.c();
        mbd mbdVar = this.j;
        mbdVar.c();
        mbl mblVarI = lau.a().i(new ajmd(this, null), mbdVar);
        this.d = mblVarI;
        this.f = true;
        mblVarI.getClass();
        wer.c();
        qiv qivVar = (qiv) mblVarI;
        qivVar.c.b(1);
        if (acui.c()) {
            mbw.b().k(qivVar.i);
        } else {
            mbw.b().j(qivVar.h);
        }
        qivVar.g = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 4701)).u("Stopping");
        wer.c();
        this.f = false;
        if (this.e) {
            this.e = false;
            g(false);
        }
        mbl mblVar = this.d;
        mblVar.getClass();
        wer.c();
        qiv qivVar = (qiv) mblVar;
        if (qivVar.g) {
            qivVar.c.b(3);
            if (acui.c()) {
                mbw.b().m(qivVar.i);
            } else {
                mbw.b().l(qivVar.h);
            }
            qivVar.b.removeCallbacksAndMessages(null);
        } else {
            ((ype) ((ype) qiv.a.h()).ai((char) 7395)).u("Can't disconnect if connect has not been called first");
        }
        this.d = null;
        this.c.clear();
        this.j.d();
        this.b.clear();
    }

    @Override // defpackage.mau
    public final void e(max maxVar) {
        this.b.add(maxVar);
    }

    @Override // defpackage.mau
    public final void f(max maxVar) {
        this.b.remove(maxVar);
    }

    public final void g(boolean z) {
        int i;
        mbl mblVar = this.d;
        mblVar.getClass();
        if (!mblVar.c()) {
            ((ype) ((ype) a.h()).ai((char) 4687)).u("Can't mute or unmute notifications while client is not connected.");
            return;
        }
        if (z) {
            ((ype) a.l().ai((char) 4686)).u("Muting notifications");
        } else {
            ((ype) a.l().ai((char) 4685)).u("Unmuting notifications");
        }
        if (z) {
            jrl jrlVarA = jrl.a();
            if (jrlVarA != jrl.PROJECTION) {
                throw new IllegalStateException("Unexpected process info: ".concat(jrlVarA.toString()));
            }
            i = 2;
        } else {
            i = 0;
        }
        if (acui.c()) {
            woy.aa(((qiv) mblVar).c(), "Cannot interact with notification listener before onListenerConnected called");
            mbw.b().h(i);
        } else {
            try {
                ((qiv) mblVar).d().g(i);
            } catch (RemoteException e) {
                throw new IllegalStateException("Could not call the service", e);
            }
        }
        ebf.j().x(18, z ? yyv.MUTE_NOTIFICATIONS : yyv.UNMUTE_NOTIFICATIONS);
        mar.a().c(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(StatusBarNotification statusBarNotification, boolean z, int i) {
        wer.c();
        String str = statusBarNotification.getNotification().category;
        if (str != null && str.equals("missed_call")) {
            ohs ohsVarJ = ebf.j();
            rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.NOTIFICATION_LISTENER, yzy.DV);
            rrbVarH.p(new ComponentName(statusBarNotification.getPackageName(), ""));
            ohsVarJ.F(rrbVarH.l());
        }
        boolean z2 = z || !acxa.aO();
        List list = this.b;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((max) it.next()).a(statusBarNotification, i, z2)) {
                    return;
                }
            }
        }
        if (i(statusBarNotification)) {
            mcc mccVar = null;
            lxj lxjVar = null;
            if (actj.w()) {
                wer.c();
                yfq yfqVar = this.i;
                int i2 = ((yls) yfqVar).c;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    lxj lxjVar2 = (lxj) yfqVar.get(i3);
                    i3++;
                    if (lxjVar2.j(statusBarNotification)) {
                        lxjVar = lxjVar2;
                        break;
                    }
                }
                if (lxjVar != null) {
                    statusBarNotification.getKey();
                    statusBarNotification.getNotification();
                    lvg lvgVarA = lxjVar.a(this.g, statusBarNotification);
                    if (lvgVarA instanceof lvi) {
                        lvgVarA.k = statusBarNotification.getKey();
                        lvgVarA.g = i;
                        lnm.m().f(lvgVarA, z, false);
                        return;
                    }
                    return;
                }
                return;
            }
            wer.c();
            yfq yfqVar2 = this.h;
            int i4 = ((yls) yfqVar2).c;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                mcc mccVar2 = (mcc) yfqVar2.get(i5);
                i5++;
                if (mccVar2.i(this.g, statusBarNotification)) {
                    mccVar = mccVar2;
                    break;
                }
            }
            if (mccVar != null) {
                statusBarNotification.getKey();
                statusBarNotification.getNotification();
                moa moaVarA = mccVar.a(this.g, statusBarNotification);
                if (moaVarA == null) {
                    ((ype) ((ype) a.h()).ai((char) 4691)).y("Converter canConvert(), but convert() yielded null. %s", statusBarNotification);
                    return;
                }
                moaVarA.R(z && mccVar.k(statusBarNotification));
                moaVarA.S(statusBarNotification.getKey());
                moaVarA.Q(i);
                Map map = this.c;
                mcd.b();
                map.put(Long.valueOf(mcd.a(statusBarNotification)), moaVarA);
                if (moaVarA instanceof lwz) {
                    lnm.k().h((lwz) moaVarA, z);
                    return;
                }
                if (!jri.a() ? mccVar.l(statusBarNotification) : mccVar.l(statusBarNotification) || mccVar.k(statusBarNotification)) {
                    mlq.e().g(moaVarA);
                } else {
                    mlq.e().j(moaVarA);
                }
            }
        }
    }

    public final boolean i(StatusBarNotification statusBarNotification) {
        wer.c();
        if (!this.e) {
            ((ype) a.l().ai((char) 4698)).u("Not processing notifications");
            return false;
        }
        mbl mblVar = this.d;
        mblVar.getClass();
        if (!mblVar.c()) {
            ((ype) a.l().ai((char) 4697)).u("Notification client disconnected");
            return false;
        }
        yph yphVar = lve.a;
        String packageName = statusBarNotification.getPackageName();
        lwd lwdVar = new lwd(statusBarNotification, false);
        if ((!actj.m() && !actj.n()) || mpl.f().a().j() || !lwdVar.j()) {
            return mjv.b().d(kio.b().e(), packageName, qpi.b) && Collection.EL.stream(lem.a().b(kio.b().e(), nyj.a())).anyMatch(new lou(packageName, 6));
        }
        ((ype) lve.a.l().ai((char) 4286)).u("Messaging notification suppressed due to user opt-out of data sharing with assistant.");
        lxr.e();
        lxr.i(yzz.MESSAGING_PARSING, yzy.ns, packageName);
        return false;
    }
}
