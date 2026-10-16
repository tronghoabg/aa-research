package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjp extends defpackage.mbm {
    public final /* synthetic */ defpackage.qjr a;

    public qjp(defpackage.qjr qjrVar) {
        this.a = qjrVar;
    }

    public final void a(mbq mbqVar) {
        this.a.b.post(new defpackage.qbr(this, mbqVar, 15));
    }

    public final void b() {
        this.a.b.post(new defpackage.qjo(this, 0));
    }

    public final void c(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        defpackage.yqm yqmVar = defpackage.qjr.a;
        this.a.b.post(new defpackage.qjn(this, statusBarNotification, rankingMap, 0));
    }

    public final void d(android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        defpackage.yqm yqmVar = defpackage.qjr.a;
        this.a.b.post(new defpackage.qbr(this, rankingMap, 16));
    }

    public final void f(android.service.notification.StatusBarNotification statusBarNotification, android.service.notification.NotificationListenerService.RankingMap rankingMap) {
        defpackage.yqm yqmVar = defpackage.qjr.a;
        this.a.b.post(new defpackage.qjn(this, statusBarNotification, rankingMap, 1));
    }
}
