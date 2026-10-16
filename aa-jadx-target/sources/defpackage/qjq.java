package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjq implements mbr {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public qjq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        if (this.b == 0) {
            ((defpackage.qjr) this.a).b.post(new defpackage.qjo(this, 2));
            return;
        }
        defpackage.yqm yqmVar = defpackage.mca.a;
        java.lang.Object obj = this.a;
        synchronized (((defpackage.mca) obj).b) {
            ((defpackage.mca) obj).c.b(2);
        }
        defpackage.ygw ygwVarC = defpackage.mce.b().c(null);
        if (ygwVarC != null) {
            java.lang.Object obj2 = this.a;
            synchronized (((defpackage.mca) obj2).b) {
                defpackage.you youVarListIterator = ygwVarC.listIterator(0);
                while (youVarListIterator.hasNext()) {
                    android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) youVarListIterator.next();
                    if (statusBarNotification == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.mca.a.h()).ai(4720)).u("Found null notification in active notifications");
                    } else {
                        ((defpackage.mca) obj2).d.put(statusBarNotification.getKey(), statusBarNotification);
                    }
                }
            }
        }
        ((defpackage.mca) this.a).e(new defpackage.mby(1));
    }

    public final void b() {
        if (this.b == 0) {
            ((defpackage.qjr) this.a).b.post(new defpackage.qjo(this, 4));
            return;
        }
        defpackage.yqm yqmVar = defpackage.mca.a;
        java.lang.Object obj = this.a;
        synchronized (((defpackage.mca) obj).b) {
            ((defpackage.mca) obj).c.b(4);
        }
    }

    public final void c(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        if (this.b == 0) {
            defpackage.yqm yqmVar = defpackage.qjr.a;
            ((defpackage.qjr) this.a).b.post(new defpackage.qjn(this, statusBarNotification, rankingMap, 3));
            return;
        }
        defpackage.yqm yqmVar2 = defpackage.mca.a;
        java.lang.String packageName = statusBarNotification.getPackageName();
        java.lang.Object obj = this.a;
        defpackage.mca mcaVar = (defpackage.mca) obj;
        mcaVar.c.a(packageName);
        synchronized (mcaVar.b) {
            ((defpackage.mca) obj).d.put(statusBarNotification.getKey(), statusBarNotification);
        }
        ((defpackage.mca) this.a).e(new defpackage.kzu(statusBarNotification, 10));
    }

    public final void d(android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        if (this.b != 0) {
            defpackage.yqm yqmVar = defpackage.mca.a;
            return;
        }
        defpackage.yqm yqmVar2 = defpackage.qjr.a;
        ((defpackage.qjr) this.a).b.post(new defpackage.qbr(this, rankingMap, 17));
    }

    public final void e(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        if (this.b == 0) {
            defpackage.yqm yqmVar = defpackage.qjr.a;
            ((defpackage.qjr) this.a).b.post(new defpackage.qjn(this, statusBarNotification, rankingMap, 2));
            return;
        }
        defpackage.yqm yqmVar2 = defpackage.mca.a;
        java.lang.Object obj = this.a;
        synchronized (((defpackage.mca) obj).b) {
            ((defpackage.mca) obj).d.remove(statusBarNotification.getKey());
        }
        ((defpackage.mca) this.a).e(new defpackage.kzu(statusBarNotification, 9));
    }
}
