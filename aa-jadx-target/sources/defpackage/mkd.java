package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mkd {
    public static final /* synthetic */ int a = 0;

    static {
        defpackage.yqm.c("GH.SdkSbnNotifConverter");
    }

    public static final java.lang.String a(android.app.Notification notification, java.lang.CharSequence charSequence, java.lang.String str) {
        if (charSequence != null && charSequence.length() != 0) {
            return charSequence.toString();
        }
        java.lang.CharSequence charSequence2 = notification.extras.getCharSequence(str);
        return charSequence2 != null ? charSequence2.toString() : "";
    }

    public static final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        boolean z;
        boolean z2;
        android.app.Notification notification = statusBarNotification.getNotification();
        android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            z = bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            z2 = bundle.getInt("type", 0) == 1;
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
        if (!defpackage.luq.a().i()) {
            return false;
        }
        java.lang.String packageName = defpackage.luq.a().e().a().getPackageName();
        packageName.getClass();
        return defpackage.afga.f(packageName, statusBarNotification.getPackageName());
    }

    public static final int c(android.service.notification.StatusBarNotification statusBarNotification) {
        long jHashCode = (statusBarNotification.getTag() + statusBarNotification.getId() + statusBarNotification.getPackageName() + statusBarNotification.getUser()).hashCode();
        android.app.Notification notification = statusBarNotification.getNotification();
        notification.getClass();
        return j$.util.Objects.hash(new java.lang.Object[]{defpackage.afga.f("navigation", notification.category) ? defpackage.nve.c : defpackage.nve.a, java.lang.Long.valueOf(jHashCode)});
    }
}
