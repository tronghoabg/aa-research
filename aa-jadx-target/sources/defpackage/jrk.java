package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jrk {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.IntentUtils");

    public static android.content.ComponentName a(android.content.Context context, android.content.Intent intent) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (!listQueryIntentActivities.isEmpty()) {
            android.content.pm.ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
            return new android.content.ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices.isEmpty()) {
            ((defpackage.yqj) b.l().ai((char) 2704)).y("Can't find component for Intent %s", intent);
            return null;
        }
        android.content.pm.ResolveInfo resolveInfo2 = listQueryIntentServices.get(0);
        return new android.content.ComponentName(resolveInfo2.serviceInfo.packageName, resolveInfo2.serviceInfo.name);
    }

    public static boolean b(android.content.Intent intent) {
        return intent != null && "com.google.android.gearhead.telecom.OPEN_CONTACTS".equals(intent.getAction());
    }

    public static boolean c(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName componentNameA = a(context, new android.content.Intent("android.intent.action.DIAL"));
        return (componentNameA == null || intent == null || !componentNameA.getPackageName().equals(intent.getPackage())) ? false : true;
    }

    public static boolean d(android.content.Intent intent) {
        if (intent != null) {
            return "android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction()) || "android.intent.action.MEDIA_SEARCH".equals(intent.getAction());
        }
        return false;
    }

    public static boolean e(android.content.Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return false;
        }
        return "com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS".equals(intent.getAction()) || "android.intent.action.SENDTO".equals(intent.getAction());
    }

    public static boolean f(android.content.Intent intent) {
        return (intent == null || intent.getAction() == null || !defpackage.acul.h().b.contains(intent.getAction())) ? false : true;
    }
}
