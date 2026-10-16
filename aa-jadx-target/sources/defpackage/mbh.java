package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbh implements defpackage.mbb {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.NotificationProc");
    public final java.util.List b;
    public final java.util.Map c;
    public mbs d;
    public boolean e;
    public boolean f;
    private final android.content.Context g;
    private defpackage.ygw h;
    private defpackage.ygw i;
    private final defpackage.mbk j;

    public mbh(android.content.Context context) {
        defpackage.mbk mbkVar = new defpackage.mbk("GH.NotificationProc");
        this.b = new java.util.ArrayList();
        this.c = new android.util.ArrayMap();
        context.getClass();
        this.g = context;
        if (defpackage.acul.x()) {
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            int i = lxt.a;
            int i2 = lxp.a;
            int i3 = lxo.a;
            ygrVar.j(lxs.k(), (lxt) defpackage.mkp.a.i(lxt.class), (lxp) defpackage.mkp.a.i(lxp.class), (lxo) defpackage.mkp.a.i(lxo.class));
            this.i = ygrVar.g();
        } else {
            defpackage.ygr ygrVar2 = new defpackage.ygr(4);
            int i4 = defpackage.lxx.a;
            int i5 = defpackage.lxn.a;
            int i6 = defpackage.lxm.a;
            ygrVar2.j(defpackage.lxw.m(), (defpackage.lxx) defpackage.mkp.a.i(defpackage.lxx.class), (defpackage.lxn) defpackage.mkp.a.i(defpackage.lxn.class), (defpackage.lxm) defpackage.mkp.a.i(defpackage.lxm.class));
            if (!defpackage.aczg.c()) {
                int i7 = defpackage.mob.a;
                ygrVar2.i((defpackage.mob) defpackage.mkp.a.i(defpackage.mob.class));
            }
            this.h = ygrVar2.g();
        }
        this.j = mbkVar;
    }

    public static final int j(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        if (rankingMap != null) {
            android.service.notification.NotificationListenerService.Ranking ranking = new android.service.notification.NotificationListenerService.Ranking();
            if (rankingMap.getRanking(statusBarNotification.getKey(), ranking)) {
                return ll$.ExternalSyntheticApiModelOutline0.m(ranking);
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

    private static android.net.Uri k(android.app.Notification notification) {
        if ((notification.defaults & 1) != 0) {
            return android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        return null;
    }

    private final android.net.Uri l(android.service.notification.StatusBarNotification statusBarNotification) {
        mbs mbsVar = this.d;
        mbsVar.getClass();
        android.net.Uri uriK = k(statusBarNotification.getNotification());
        if (uriK != null) {
            return uriK;
        }
        android.service.notification.NotificationListenerService.Ranking ranking = new android.service.notification.NotificationListenerService.Ranking();
        mbsVar.a().getRanking(statusBarNotification.getKey(), ranking);
        android.app.NotificationChannel notificationChannelM = ep$.ExternalSyntheticApiModelOutline1.m(ranking);
        if (notificationChannelM != null) {
            return ep$.ExternalSyntheticApiModelOutline1.m(notificationChannelM);
        }
        return null;
    }

    private static void m(android.service.notification.StatusBarNotification statusBarNotification, boolean z) {
        if (z && defpackage.luv.e().i(statusBarNotification.getPackageName())) {
            defpackage.ojm.a();
            long epochMilli = j$.time.Instant.now().toEpochMilli() - statusBarNotification.getPostTime();
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NOTIFICATION_LISTENER, defpackage.zbd.Nk);
            rrvVarH.u(epochMilli);
            rrvVarH.p(new android.content.ComponentName(statusBarNotification.getPackageName(), ""));
            oimVarU.F(rrvVarH.l());
        }
    }

    @Override // defpackage.mbb
    public final android.net.Uri a(android.service.notification.StatusBarNotification statusBarNotification) {
        android.net.Uri uriL;
        android.net.Uri uriK;
        android.app.Notification notification = statusBarNotification.getNotification();
        android.net.Uri uriL2 = l(statusBarNotification);
        if (uriL2 != null) {
            return uriL2;
        }
        if (j$.util.Objects.equals(statusBarNotification.getKey(), statusBarNotification.getGroupKey())) {
            return null;
        }
        if (notification.publicVersion != null && (uriK = k(notification.publicVersion)) != null) {
            return uriK;
        }
        mbs mbsVar = this.d;
        mbsVar.getClass();
        for (android.service.notification.StatusBarNotification statusBarNotification2 : mbsVar.b()) {
            if (j$.util.Objects.equals(statusBarNotification.getGroupKey(), statusBarNotification2.getGroupKey()) && (uriL = l(statusBarNotification2)) != null) {
                return uriL;
            }
        }
        return null;
    }

    @Override // defpackage.mbb
    public final android.service.notification.NotificationListenerService.RankingMap b() {
        mbs mbsVar = this.d;
        if (mbsVar == null) {
            return null;
        }
        return mbsVar.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void d() throws wfo {
        ((defpackage.yqj) a.l().ai((char) 4704)).u("Stopping");
        defpackage.wfp.c();
        this.f = false;
        if (this.e) {
            this.e = false;
            g(false);
        }
        mbs mbsVar = this.d;
        mbsVar.getClass();
        defpackage.wfp.c();
        defpackage.qjr qjrVar = (defpackage.qjr) mbsVar;
        if (qjrVar.g) {
            qjrVar.c.b(3);
            if (defpackage.acvk.c()) {
                defpackage.mce.b().m(qjrVar.i);
            } else {
                defpackage.mce.b().l(qjrVar.h);
            }
            qjrVar.b.removeCallbacksAndMessages(null);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qjr.a.h()).ai((char) 7420)).u("Can't disconnect if connect has not been called first");
        }
        this.d = null;
        this.c.clear();
        this.j.d();
        this.b.clear();
    }

    @Override // defpackage.mbb
    public final void e(mbe mbeVar) {
        this.b.add(mbeVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    public final void eQ() throws wfo {
        ((defpackage.yqj) a.l().ai((char) 4702)).u("Starting");
        defpackage.wfp.c();
        defpackage.mbk mbkVar = this.j;
        mbkVar.eQ();
        mbs mbsVarI = defpackage.laz.a().i(new ajnd(this, (byte[]) null), mbkVar);
        this.d = mbsVarI;
        this.f = true;
        mbsVarI.getClass();
        defpackage.wfp.c();
        defpackage.qjr qjrVar = (defpackage.qjr) mbsVarI;
        qjrVar.c.b(1);
        if (defpackage.acvk.c()) {
            defpackage.mce.b().k(qjrVar.i);
        } else {
            defpackage.mce.b().j(qjrVar.h);
        }
        qjrVar.g = true;
    }

    @Override // defpackage.mbb
    public final void f(mbe mbeVar) {
        this.b.remove(mbeVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final void g(boolean z) throws wfo {
        int i;
        mbs mbsVar = this.d;
        mbsVar.getClass();
        if (!mbsVar.c()) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4690)).u("Can't mute or unmute notifications while client is not connected.");
            return;
        }
        if (z) {
            ((defpackage.yqj) a.l().ai((char) 4689)).u("Muting notifications");
        } else {
            ((defpackage.yqj) a.l().ai((char) 4688)).u("Unmuting notifications");
        }
        if (z) {
            defpackage.jrm jrmVarA = defpackage.jrm.a();
            if (jrmVarA != defpackage.jrm.PROJECTION) {
                throw new java.lang.IllegalStateException("Unexpected process info: ".concat(jrmVarA.toString()));
            }
            i = 2;
        } else {
            i = 0;
        }
        if (defpackage.acvk.c()) {
            defpackage.ysr.bk(((defpackage.qjr) mbsVar).c(), "Cannot interact with notification listener before onListenerConnected called");
            defpackage.mce.b().h(i);
        } else {
            try {
                ((defpackage.qjr) mbsVar).d().g(i);
            } catch (android.os.RemoteException e) {
                throw new java.lang.IllegalStateException("Could not call the service", e);
            }
        }
        defpackage.omf.u().x(18, z ? defpackage.zaa.MUTE_NOTIFICATIONS : defpackage.zaa.UNMUTE_NOTIFICATIONS);
        defpackage.may.a().c(z);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    public final void h(android.service.notification.StatusBarNotification statusBarNotification, boolean z, int i) throws wfo {
        defpackage.wfp.c();
        java.lang.String str = statusBarNotification.getNotification().category;
        if (str != null && str.equals("missed_call")) {
            defpackage.oim oimVarU = defpackage.omf.u();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.NOTIFICATION_LISTENER, defpackage.zbd.DZ);
            rrvVarH.p(new android.content.ComponentName(statusBarNotification.getPackageName(), ""));
            oimVarU.F(rrvVarH.l());
        }
        boolean z2 = z || !defpackage.acyc.aR();
        java.util.List list = this.b;
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((mbe) it.next()).a(statusBarNotification, i, z2)) {
                    return;
                }
            }
        }
        if (i(statusBarNotification)) {
            lxq lxqVar = null;
            if (defpackage.acul.x()) {
                defpackage.wfp.c();
                defpackage.ygw ygwVar = this.i;
                int i2 = ((defpackage.ymx) ygwVar).c;
                int i3 = 0;
                while (i3 < i2) {
                    lxq lxqVar2 = (lxq) ygwVar.get(i3);
                    i3++;
                    if (lxqVar2.j(statusBarNotification)) {
                        lxqVar = lxqVar2;
                        break;
                    }
                }
                if (lxqVar != null) {
                    statusBarNotification.getKey();
                    statusBarNotification.getNotification();
                    lvn lvnVarA = lxqVar.a(this.g, statusBarNotification);
                    if (lvnVarA instanceof lvp) {
                        m(statusBarNotification, z);
                        lvnVarA.k = statusBarNotification.getKey();
                        lvnVarA.g = i;
                        defpackage.lnt.m().f(lvnVarA, z, false);
                        return;
                    }
                    return;
                }
                return;
            }
            defpackage.wfp.c();
            defpackage.ygw ygwVar2 = this.h;
            int i4 = ((defpackage.ymx) ygwVar2).c;
            int i5 = 0;
            while (i5 < i4) {
                lxq lxqVar3 = (defpackage.mck) ygwVar2.get(i5);
                i5++;
                if (lxqVar3.i(this.g, statusBarNotification)) {
                    lxqVar = lxqVar3;
                    break;
                }
            }
            if (lxqVar != null) {
                statusBarNotification.getKey();
                statusBarNotification.getNotification();
                mog mogVarA = lxqVar.a(this.g, statusBarNotification);
                if (mogVarA == null) {
                    ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4694)).y("Converter canConvert(), but convert() yielded null. %s", statusBarNotification);
                    return;
                }
                m(statusBarNotification, z);
                mogVarA.R(z && lxqVar.k(statusBarNotification));
                mogVarA.S(statusBarNotification.getKey());
                mogVarA.Q(i);
                java.util.Map map = this.c;
                defpackage.mcl.b();
                map.put(java.lang.Long.valueOf(defpackage.mcl.a(statusBarNotification)), mogVarA);
                if (mogVarA instanceof lxg) {
                    defpackage.lnt.k().h((lxg) mogVarA, z);
                    return;
                }
                if (!defpackage.jrj.a() ? lxqVar.l(statusBarNotification) : lxqVar.l(statusBarNotification) || lxqVar.k(statusBarNotification)) {
                    defpackage.lxy.o().g(mogVarA);
                } else {
                    defpackage.lxy.o().j(mogVarA);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    public final boolean i(android.service.notification.StatusBarNotification statusBarNotification) throws wfo {
        defpackage.wfp.c();
        if (!this.e) {
            ((defpackage.yqj) a.l().ai((char) 4701)).u("Not processing notifications");
            return false;
        }
        mbs mbsVar = this.d;
        mbsVar.getClass();
        if (!mbsVar.c()) {
            ((defpackage.yqj) a.l().ai((char) 4700)).u("Notification client disconnected");
            return false;
        }
        defpackage.yqm yqmVar = defpackage.lvl.a;
        java.lang.String packageName = statusBarNotification.getPackageName();
        defpackage.lwk lwkVar = new defpackage.lwk(statusBarNotification, false);
        if ((!defpackage.acul.m() && !defpackage.acul.n()) || defpackage.mpr.f().a().j() || !lwkVar.j()) {
            return defpackage.mkc.b().d(defpackage.kit.b().e(), packageName, defpackage.qqe.b) && j$.util.Collection.-EL.stream(defpackage.ler.a().b(defpackage.kit.b().e(), defpackage.nze.a())).anyMatch(new defpackage.lpa(packageName, 7));
        }
        ((defpackage.yqj) defpackage.lvl.a.l().ai((char) 4289)).u("Messaging notification suppressed due to user opt-out of data sharing with assistant.");
        defpackage.lxy.e();
        defpackage.lxy.i(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.ns, packageName, 0L);
        return false;
    }
}
