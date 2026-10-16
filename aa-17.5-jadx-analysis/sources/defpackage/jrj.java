package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class jrj {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.IntentUtils");

    public static ComponentName a(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!listQueryIntentActivities.isEmpty()) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
            return new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices.isEmpty()) {
            ((ype) b.l().ai((char) 2701)).y("Can't find component for Intent %s", intent);
            return null;
        }
        ResolveInfo resolveInfo2 = listQueryIntentServices.get(0);
        return new ComponentName(resolveInfo2.serviceInfo.packageName, resolveInfo2.serviceInfo.name);
    }

    public static boolean b(Intent intent) {
        return intent != null && "com.google.android.gearhead.telecom.OPEN_CONTACTS".equals(intent.getAction());
    }

    public static boolean c(Context context, Intent intent) {
        ComponentName componentNameA = a(context, new Intent("android.intent.action.DIAL"));
        return (componentNameA == null || intent == null || !componentNameA.getPackageName().equals(intent.getPackage())) ? false : true;
    }

    public static boolean d(Intent intent) {
        if (intent != null) {
            return "android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction()) || "android.intent.action.MEDIA_SEARCH".equals(intent.getAction());
        }
        return false;
    }

    public static boolean e(Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return false;
        }
        return "com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS".equals(intent.getAction()) || "android.intent.action.SENDTO".equals(intent.getAction());
    }

    public static boolean f(Intent intent) {
        return (intent == null || intent.getAction() == null || !actj.h().b.contains(intent.getAction())) ? false : true;
    }
}
