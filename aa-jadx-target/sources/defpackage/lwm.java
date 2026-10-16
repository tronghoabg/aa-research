package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwm {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/auto/components/messaging/parser/StatusBarNotificationConversationIdParser");

    public static defpackage.lwm a() {
        return (defpackage.lwm) defpackage.mkp.a.b(defpackage.lwm.class, new defpackage.lqb(12));
    }

    public static final lwi b(android.service.notification.StatusBarNotification statusBarNotification) {
        if (defpackage.luv.e().i(statusBarNotification.getPackageName())) {
            ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4410)).u("findConversationId / Lite app detected. Using SBN ID for conversation ID.");
            return new lwi(statusBarNotification.getPackageName(), statusBarNotification.getKey());
        }
        if (android.os.Build.VERSION.SDK_INT < 31) {
            ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4409)).u("findConversationId / Android OS version too low");
            return null;
        }
        android.service.notification.NotificationListenerService.RankingMap rankingMapB = defpackage.lxy.l().b();
        if (rankingMapB == null) {
            ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4408)).u("findConversationId / RankingMap is null");
            return null;
        }
        android.service.notification.NotificationListenerService.Ranking ranking = new android.service.notification.NotificationListenerService.Ranking();
        if (!rankingMapB.getRanking(statusBarNotification.getKey(), ranking)) {
            ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4407)).u("findConversationId / Unable to find ranking for SBN");
            return null;
        }
        if (!a$.ExternalSyntheticApiModelOutline0.m(ranking)) {
            ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4406)).y("findConversationId / Ranking is not conversation (%s)", statusBarNotification.getPackageName());
            return null;
        }
        android.content.pm.ShortcutInfo shortcutInfoM = a$.ExternalSyntheticApiModelOutline0.m(ranking);
        if (shortcutInfoM == null) {
            ((defpackage.ype) ((defpackage.ype) a.g()).ai((char) 4405)).y("findConversationId / Conversation has null ShortcutInfo (%s)", statusBarNotification.getPackageName());
            return null;
        }
        java.lang.String strM = je$.ExternalSyntheticApiModelOutline0.m(shortcutInfoM);
        strM.getClass();
        ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4404)).y("findConversationId / Conversation ID found (%s)", statusBarNotification.getPackageName());
        return new lwi(statusBarNotification.getPackageName(), strM);
    }
}
