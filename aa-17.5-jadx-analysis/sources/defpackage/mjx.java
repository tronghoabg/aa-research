package defpackage;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.system.GhPendingIntentReceiver;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;

/* loaded from: classes.dex */
public final class mjx implements max {
    private static final yph a = yph.c("GH.SdkNotifProcessor");

    @Override // defpackage.max
    public final boolean a(StatusBarNotification statusBarNotification, int i, boolean z) {
        boolean z2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Intent intent;
        statusBarNotification.getClass();
        int i2 = mjw.a;
        if (!mjw.b(statusBarNotification)) {
            return false;
        }
        int iC = mjw.c(statusBarNotification);
        Notification notification = statusBarNotification.getNotification();
        Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle != null) {
            bundle.getBoolean("com.google.android.gms.car.support.CarNotificationExtender.EXTENDED");
            bundle.getInt(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA, 0);
            charSequence = bundle.getCharSequence("android.title");
            charSequence2 = bundle.getCharSequence("subtitle");
            charSequence3 = bundle.getCharSequence("android.text");
            bundle.getInt("action_icon");
            intent = (Intent) bundle.getParcelable("content_intent");
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
        String strValueOf = String.valueOf(charSequence2);
        notification.getClass();
        String strA = mjw.a(notification, charSequence3, "android.text");
        num numVar = new num();
        String packageName = statusBarNotification.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        numVar.b = GhIcon.j(new ComponentName(packageName, ""));
        numVar.c = intent != null ? GhPendingIntentReceiver.c(intent, mki.a.c) : null;
        numVar.m = mjw.a(notification, charSequence, "android.title");
        if (strValueOf.length() == 0) {
            strValueOf = strA;
        }
        numVar.n = strValueOf;
        numVar.j = false;
        String packageName2 = statusBarNotification.getPackageName();
        if (packageName2.length() == 0) {
            packageName2 = "com.google.android.projection.gearhead";
        }
        numVar.f = packageName2;
        numVar.g = statusBarNotification.getKey();
        numVar.a = z2 ? nup.HIGH : nup.LOW;
        nur nurVarB = numVar.b();
        if (!z) {
            int i3 = nurVarB.a.f;
            nup nupVar = nup.DEFAULT;
            if (i3 > nupVar.f) {
                ((ype) a.e()).y("Capping priority of pre-existing SDK notification %s at DEFAULT to suppress HUN", nurVarB.g);
                num numVarA = num.a(nurVarB);
                numVarA.a = nupVar;
                nurVarB = numVarA.b();
            }
        }
        nuj.b().j("SDK", iC, nurVarB);
        return true;
    }

    @Override // defpackage.max
    public final boolean b(StatusBarNotification statusBarNotification) {
        statusBarNotification.getClass();
        int i = mjw.a;
        if (!mjw.b(statusBarNotification)) {
            return false;
        }
        nuj.b().g("SDK", mjw.c(statusBarNotification), statusBarNotification.getPackageName());
        return true;
    }
}
