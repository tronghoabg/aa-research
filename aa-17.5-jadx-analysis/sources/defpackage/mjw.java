package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class mjw {
    public static final /* synthetic */ int a = 0;

    static {
        yph.c("GH.SdkSbnNotifConverter");
    }

    public static final String a(Notification notification, CharSequence charSequence, String str) {
        if (charSequence != null && charSequence.length() != 0) {
            return charSequence.toString();
        }
        CharSequence charSequence2 = notification.extras.getCharSequence(str);
        return charSequence2 != null ? charSequence2.toString() : "";
    }

    public static final boolean b(StatusBarNotification statusBarNotification) {
        boolean z;
        boolean z2;
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            z2 = bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 0) == 1;
            bundle.getCharSequence("android.title");
            bundle.getCharSequence("subtitle");
            bundle.getCharSequence("android.text");
            bundle.getInt("action_icon");
            bundle.getInt("app_color", 0);
            bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            bundle.getBoolean("heads_up_visibility");
        } else {
            z = false;
            z2 = false;
        }
        if (!z) {
            return false;
        }
        if (!z2) {
            return true;
        }
        if (!luk.a().i()) {
            return false;
        }
        String packageName = luk.a().e().a().getPackageName();
        packageName.getClass();
        return affa.f(packageName, statusBarNotification.getPackageName());
    }

    public static final int c(StatusBarNotification statusBarNotification) {
        long jHashCode = (statusBarNotification.getTag() + statusBarNotification.getId() + statusBarNotification.getPackageName() + statusBarNotification.getUser()).hashCode();
        Notification notification = statusBarNotification.getNotification();
        notification.getClass();
        return Objects.hash(affa.f("navigation", notification.category) ? nuo.c : nuo.a, Long.valueOf(jHashCode));
    }
}
