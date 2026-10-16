package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lvk {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/apps/auto/components/messaging/assistant/AssistantApiHelper");
    private final android.content.Context b;
    private final java.lang.Class c;
    private int d;
    private j$.util.Optional e = j$.util.Optional.empty();

    public lvk(android.content.Context context, java.lang.Class cls) {
        this.b = context;
        this.c = cls;
    }

    public static defpackage.lvk c() {
        return (defpackage.lvk) defpackage.mkp.a.i(defpackage.lvk.class);
    }

    public static final java.lang.String e(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("app-package");
        stringExtra.getClass();
        return stringExtra;
    }

    public static final java.lang.String f(android.content.Intent intent) {
        java.lang.String stringExtra = intent.getStringExtra("conversation-id");
        stringExtra.getClass();
        return stringExtra;
    }

    public static final java.lang.String g(android.content.Intent intent) {
        java.lang.String string = android.app.RemoteInput.getResultsFromIntent(intent).getString("reply");
        string.getClass();
        return string;
    }

    private final android.service.notification.StatusBarNotification h(java.lang.String str, lum lumVar, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        duq duqVar = new duq();
        duqVar.a = "me";
        defpackage.dtt dttVar = new defpackage.dtt(new dur(duqVar));
        dttVar.h(lumVar.g);
        dttVar.c = lumVar.b;
        defpackage.ygw ygwVar = lumVar.d;
        int size = ygwVar.size();
        for (int i = 0; i < size; i++) {
            mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) ygwVar.get(i);
            dts dtsVar = new dts(message.b, message.f, message.e);
            java.lang.String str2 = message.c;
            android.net.Uri uri = message.d;
            if (defpackage.lwe.a().f(str2, uri, str)) {
                dtsVar.c(str2, uri);
            }
            java.util.List list = dttVar.a;
            list.add(dtsVar);
            if (list.size() > 25) {
                list.remove(0);
            }
        }
        dsz dszVar = new dsz(0, "mark as read", pendingIntent);
        dszVar.c();
        dszVar.a = 2;
        defpackage.dta dtaVarA = dszVar.a();
        dsz dszVar2 = new dsz(0, "reply", pendingIntent2);
        dszVar2.c();
        dszVar2.a = 1;
        dszVar2.b(new dut("reply", (java.lang.CharSequence) null, (java.lang.CharSequence[]) null, true, 0, new android.os.Bundle(), new java.util.HashSet()));
        defpackage.dta dtaVarA2 = dszVar2.a();
        defpackage.dte dteVar = new defpackage.dte(this.b, null);
        dteVar.o(dttVar);
        dteVar.g(dtaVarA);
        dteVar.g(dtaVarA2);
        android.app.Notification notificationA = dteVar.a();
        int iMyUid = android.os.Process.myUid();
        int iMyPid = android.os.Process.myPid();
        android.os.UserHandle userHandleMyUserHandle = android.os.Process.myUserHandle();
        defpackage.ojm.a();
        return new android.service.notification.StatusBarNotification(str, str, 0, "aa-generated-sbn", iMyUid, iMyPid, 0, notificationA, userHandleMyUserHandle, j$.time.Instant.now().toEpochMilli());
    }

    private static final java.lang.String i(dur durVar) {
        java.lang.CharSequence charSequence = durVar.a;
        charSequence.getClass();
        java.lang.String string = charSequence.toString();
        java.lang.String str = durVar.d;
        return str != null ? str : string;
    }

    public final android.app.PendingIntent a(android.content.Intent intent) {
        int i = android.os.Build.VERSION.SDK_INT;
        int i2 = this.d + 1;
        this.d = i2;
        return android.app.PendingIntent.getService(this.b, i2, intent, (i >= 31 ? 33554432 : 0) | 1073741824);
    }

    public final android.content.Intent b(java.lang.String str, lum lumVar, java.lang.String str2) {
        ((defpackage.ype) ((defpackage.ype) a.e()).ai((char) 4287)).y("Creating intent with action %s", str2);
        android.content.Intent intent = new android.content.Intent(this.b, (java.lang.Class<?>) this.c);
        intent.setAction(str2);
        intent.putExtra("conversation-id", lumVar.a);
        intent.putExtra("app-package", str);
        return intent;
    }

    public final com.google.android.gearhead.sdk.assistant.MessagingInfo d(java.lang.String str, lum lumVar, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
        android.service.notification.StatusBarNotification statusBarNotificationH;
        j$.util.Optional optionalEmpty;
        if (defpackage.acul.w()) {
            if (this.e.isEmpty()) {
                try {
                    optionalEmpty = j$.util.Optional.of(java.lang.Long.valueOf(this.b.getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 0).versionCode));
                } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) a.g()).p(e)).ai(4288)).M("Could not fetch PackageInfo for app: %s\n%s", "com.google.android.googlequicksearchbox", e);
                    optionalEmpty = j$.util.Optional.empty();
                }
                this.e = optionalEmpty;
            }
            j$.util.Optional optional = this.e;
            long jE = defpackage.acul.e();
            defpackage.ypg ypgVar = a;
            ((defpackage.ype) ((defpackage.ype) ypgVar.e()).ai(4285)).L("Omit fake SBN? \nAssistant cur version: %s\nAssistant min version: %s", optional.isPresent() ? optional.get() : "<unknown>", jE);
            if (!optional.isPresent() || ((java.lang.Long) optional.get()).longValue() < jE) {
                statusBarNotificationH = h(str, lumVar, pendingIntent, pendingIntent2);
            } else {
                ((defpackage.ype) ((defpackage.ype) ypgVar.e()).ai((char) 4286)).u("Omitting fake SBN");
                statusBarNotificationH = null;
            }
        } else {
            statusBarNotificationH = h(str, lumVar, pendingIntent, pendingIntent2);
        }
        qkg qkgVar = new qkg();
        qkgVar.m = lumVar.g;
        qkgVar.a = statusBarNotificationH;
        java.lang.String str2 = lumVar.b;
        qkgVar.c = str2;
        qkgVar.h = str;
        qkgVar.g = str2;
        qkgVar.l = new android.app.RemoteInput.Builder("reply").build();
        if (pendingIntent != null) {
            qkgVar.e = pendingIntent;
        }
        if (pendingIntent2 != null) {
            qkgVar.j = pendingIntent2;
        }
        dur durVar = lumVar.c;
        if (durVar != null) {
            qkgVar.n = i(durVar);
        }
        android.graphics.Bitmap bitmap = lumVar.e;
        if (bitmap != null) {
            qkgVar.i = android.graphics.drawable.Icon.createWithBitmap(bitmap);
        }
        defpackage.ygw ygwVar = lumVar.d;
        int size = ygwVar.size();
        for (int i = 0; i < size; i++) {
            mesquite.messaging.model.Message message = (mesquite.messaging.model.Message) ygwVar.get(i);
            dur durVar2 = message.e;
            java.lang.CharSequence charSequence = durVar2.a;
            charSequence.getClass();
            java.lang.String str3 = message.c;
            android.net.Uri uri = message.d;
            java.lang.String string = charSequence.toString();
            defpackage.lwe.a().f(str3, uri, str);
            qkgVar.a(new qkh(string, i(durVar2), message.b, message.f, str3, uri));
        }
        return new com.google.android.gearhead.sdk.assistant.MessagingInfo(qkgVar);
    }
}
