package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mke implements mbe {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.SdkNotifProcessor");

    public final boolean a(android.service.notification.StatusBarNotification statusBarNotification, int i, boolean z) {
        boolean z2;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        java.lang.CharSequence charSequence3;
        android.content.Intent intent;
        statusBarNotification.getClass();
        int i2 = defpackage.mkd.a;
        if (!defpackage.mkd.b(statusBarNotification)) {
            return false;
        }
        int iC = defpackage.mkd.c(statusBarNotification);
        android.app.Notification notification = statusBarNotification.getNotification();
        android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            bundle.getInt("type", 0);
            charSequence = bundle.getCharSequence("android.title");
            charSequence2 = bundle.getCharSequence("subtitle");
            charSequence3 = bundle.getCharSequence("android.text");
            bundle.getInt("action_icon");
            intent = (android.content.Intent) bundle.getParcelable("content_intent");
            bundle.getInt("app_color", 0);
            bundle.getInt("app_night_color", 0);
            bundle.getBoolean("stream_visibility", true);
            z2 = bundle.getBoolean("heads_up_visibility");
        } else {
            z2 = false;
            charSequence = null;
            charSequence2 = null;
            charSequence3 = null;
            intent = null;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(charSequence2);
        notification.getClass();
        java.lang.String strA = defpackage.mkd.a(notification, charSequence3, "android.text");
        nvc nvcVar = new nvc();
        java.lang.String packageName = statusBarNotification.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        nvcVar.b = com.google.android.apps.auto.components.graphics.icon.GhIcon.j(new android.content.ComponentName(packageName, ""));
        nvcVar.c = intent != null ? com.google.android.apps.auto.components.system.GhPendingIntentReceiver.c(intent, defpackage.mkp.a.c) : null;
        nvcVar.m = defpackage.mkd.a(notification, charSequence, "android.title");
        if (strValueOf.length() == 0) {
            strValueOf = strA;
        }
        nvcVar.n = strValueOf;
        nvcVar.j = false;
        java.lang.String packageName2 = statusBarNotification.getPackageName();
        if (packageName2.length() == 0) {
            packageName2 = "com.google.android.projection.gearhead";
        }
        nvcVar.f = packageName2;
        nvcVar.g = statusBarNotification.getKey();
        nvcVar.a = z2 ? nvf.d : nvf.b;
        nvh nvhVarB = nvcVar.b();
        if (!z) {
            int i3 = nvhVarB.a.f;
            nvf nvfVar = nvf.c;
            if (i3 > nvfVar.f) {
                ((defpackage.yqj) a.e()).y("Capping priority of pre-existing SDK notification %s at DEFAULT to suppress HUN", nvhVarB.g);
                nvc nvcVarA = nvc.a(nvhVarB);
                nvcVarA.a = nvfVar;
                nvhVarB = nvcVarA.b();
            }
        }
        defpackage.nuz.b().j("SDK", iC, nvhVarB);
        return true;
    }

    public final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        int i = defpackage.mkd.a;
        if (!defpackage.mkd.b(statusBarNotification)) {
            return false;
        }
        defpackage.nuz.b().g("SDK", defpackage.mkd.c(statusBarNotification), statusBarNotification.getPackageName());
        return true;
    }
}
