package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jyw {
    public static final defpackage.yqm a = defpackage.yqm.c("CarApp.H.Not");

    public static int a(android.service.notification.StatusBarNotification statusBarNotification) {
        return j$.util.Objects.hash(new java.lang.Object[]{c(statusBarNotification.getNotification()), java.lang.Long.valueOf((statusBarNotification.getTag() + statusBarNotification.getId() + statusBarNotification.getPackageName() + java.lang.String.valueOf(statusBarNotification.getUser())).hashCode())});
    }

    public static nvb b(android.content.Context context, java.lang.String str, android.app.Notification.Action action) {
        aafz aafzVar = new aafz((byte[]) null);
        aafzVar.b = juq.b(context, str, action.actionIntent);
        if (action.title != null) {
            aafzVar.d = action.title.toString();
        }
        if (action.icon != 0 && !android.text.TextUtils.isEmpty(str)) {
            aafzVar.e = com.google.android.apps.auto.components.graphics.icon.GhIcon.r(str, action.icon);
        }
        if (hh$.ExternalSyntheticApiModelOutline0.m(action) == 7) {
            aafzVar.a = 4;
        }
        return new nvb(aafzVar);
    }

    public static defpackage.nve c(android.app.Notification notification) {
        if ("navigation".equals(notification.category)) {
            return defpackage.nve.c;
        }
        if ("recommendation".equals(notification.category)) {
            return defpackage.nve.i;
        }
        return (notification.flags & 524288) != 0 ? defpackage.nve.k : defpackage.nve.a;
    }

    public static boolean d(android.service.notification.StatusBarNotification statusBarNotification) {
        if (!defpackage.ogv.i()) {
            return false;
        }
        defpackage.mqj mqjVarA = defpackage.ogv.d().a();
        mqjVarA.getClass();
        if (statusBarNotification.getPackageName().equals(mqjVarA.a().getPackageName())) {
            android.app.Notification notification = statusBarNotification.getNotification();
            defpackage.yqm yqmVar = nwg.a;
            if (defpackage.mcl.J(notification) != null) {
                return true;
            }
        }
        return false;
    }
}
