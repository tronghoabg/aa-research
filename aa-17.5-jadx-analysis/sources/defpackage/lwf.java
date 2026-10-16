package defpackage;

import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

/* loaded from: classes.dex */
public final class lwf {
    private static final yob a = yob.c("com/google/android/apps/auto/components/messaging/parser/StatusBarNotificationConversationIdParser");

    public static lwf a() {
        return (lwf) mki.a.b(lwf.class, new lpu(12));
    }

    public static final lwb b(StatusBarNotification statusBarNotification) {
        if (lup.e().i(statusBarNotification.getPackageName())) {
            ((ynz) ((ynz) a.e()).ai((char) 4407)).u("findConversationId / Lite app detected. Using SBN ID for conversation ID.");
            return new lwb(statusBarNotification.getPackageName(), statusBarNotification.getKey());
        }
        if (Build.VERSION.SDK_INT < 31) {
            ((ynz) ((ynz) a.e()).ai((char) 4406)).u("findConversationId / Android OS version too low");
            return null;
        }
        NotificationListenerService.RankingMap rankingMapB = lxr.l().b();
        if (rankingMapB == null) {
            ((ynz) ((ynz) a.e()).ai((char) 4405)).u("findConversationId / RankingMap is null");
            return null;
        }
        NotificationListenerService.Ranking ranking = new NotificationListenerService.Ranking();
        if (!rankingMapB.getRanking(statusBarNotification.getKey(), ranking)) {
            ((ynz) ((ynz) a.e()).ai((char) 4404)).u("findConversationId / Unable to find ranking for SBN");
            return null;
        }
        if (!ranking.isConversation()) {
            ((ynz) ((ynz) a.e()).ai((char) 4403)).y("findConversationId / Ranking is not conversation (%s)", statusBarNotification.getPackageName());
            return null;
        }
        ShortcutInfo conversationShortcutInfo = ranking.getConversationShortcutInfo();
        if (conversationShortcutInfo == null) {
            ((ynz) ((ynz) a.g()).ai((char) 4402)).y("findConversationId / Conversation has null ShortcutInfo (%s)", statusBarNotification.getPackageName());
            return null;
        }
        String id = conversationShortcutInfo.getId();
        id.getClass();
        ((ynz) ((ynz) a.e()).ai((char) 4401)).y("findConversationId / Conversation ID found (%s)", statusBarNotification.getPackageName());
        return new lwb(statusBarNotification.getPackageName(), id);
    }
}
