package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lgp implements defpackage.lhn {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.IconComponentSel");
    final java.util.HashMap b = new java.util.HashMap();

    public static defpackage.lgp a() {
        return (defpackage.lgp) defpackage.mkp.a.b(defpackage.lgp.class, new defpackage.lga(2));
    }

    public static final android.content.ComponentName b(android.content.ComponentName componentName) {
        android.content.ComponentName componentNameE;
        android.content.Context context = defpackage.mkp.a.c;
        if (defpackage.mkt.v.equals(componentName)) {
            android.content.ComponentName componentNameE2 = e(context, new android.content.Intent("android.settings.SETTINGS"), false);
            return componentNameE2 == null ? componentName : componentNameE2;
        }
        if (defpackage.mkt.b.equals(componentName) || defpackage.mkt.c.equals(componentName)) {
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            java.lang.String defaultDialerPackage = telecomManager.getDefaultDialerPackage();
            return defaultDialerPackage != null ? new android.content.ComponentName(defaultDialerPackage, "") : componentName;
        }
        if (!defpackage.mkt.p.equals(componentName) || (componentNameE = e(context, new android.content.Intent("android.intent.action.INSERT").setData(android.provider.CalendarContract.Events.CONTENT_URI), true)) == null) {
            return componentName;
        }
        android.content.Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(componentNameE.getPackageName());
        if (launchIntentForPackage == null) {
            ((defpackage.yqj) a.l().ai((char) 3904)).y("No launcher intent found for calendar component %s", componentNameE);
            return componentName;
        }
        android.content.ComponentName componentNameE3 = e(context, launchIntentForPackage, false);
        return componentNameE3 != null ? componentNameE3 : componentName;
    }

    private static final android.content.ComponentName e(android.content.Context context, android.content.Intent intent, boolean z) {
        java.util.List<android.content.pm.ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            ((defpackage.yqj) a.l().ai((char) 3902)).y("No activity found for intent %s.", intent);
            return null;
        }
        android.content.pm.ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
        if (z) {
            for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo.activityInfo.packageName.toLowerCase(java.util.Locale.ROOT).contains(android.os.Build.MANUFACTURER.toLowerCase(java.util.Locale.ROOT))) {
                    ((defpackage.yqj) a.l().ai(3903)).y("Choosing activity with package that contains manufacturer: %s", resolveInfo.activityInfo.packageName);
                    activityInfo = resolveInfo.activityInfo;
                    break;
                }
            }
        }
        return new android.content.ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // defpackage.lhn
    public final void d() {
        this.b.clear();
    }

    @Override // defpackage.lhn
    public final void eQ() {
        android.content.ComponentName componentName = defpackage.mkt.v;
        android.content.ComponentName componentNameB = b(componentName);
        java.util.HashMap map = this.b;
        map.put(componentName, componentNameB);
        android.content.ComponentName componentName2 = defpackage.mkt.b;
        android.content.ComponentName componentNameB2 = b(componentName2);
        map.put(componentName2, componentNameB2);
        map.put(defpackage.mkt.c, componentNameB2);
        android.content.ComponentName componentName3 = defpackage.mkt.p;
        map.put(componentName3, b(componentName3));
    }
}
