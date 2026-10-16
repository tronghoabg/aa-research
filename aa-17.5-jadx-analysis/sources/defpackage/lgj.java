package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.provider.CalendarContract;
import android.telecom.TelecomManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class lgj implements lhg {
    public static final yph a = yph.c("GH.IconComponentSel");
    final HashMap b = new HashMap();

    public static lgj a() {
        return (lgj) mki.a.b(lgj.class, new lfu(2));
    }

    public static final ComponentName b(ComponentName componentName) {
        ComponentName componentNameE;
        Context context = mki.a.c;
        if (mkn.v.equals(componentName)) {
            ComponentName componentNameE2 = e(context, new Intent("android.settings.SETTINGS"), false);
            return componentNameE2 == null ? componentName : componentNameE2;
        }
        if (mkn.b.equals(componentName) || mkn.c.equals(componentName)) {
            TelecomManager telecomManager = (TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            String defaultDialerPackage = telecomManager.getDefaultDialerPackage();
            return defaultDialerPackage != null ? new ComponentName(defaultDialerPackage, "") : componentName;
        }
        if (!mkn.p.equals(componentName) || (componentNameE = e(context, new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI), true)) == null) {
            return componentName;
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(componentNameE.getPackageName());
        if (launchIntentForPackage == null) {
            ((ype) a.l().ai((char) 3901)).y("No launcher intent found for calendar component %s", componentNameE);
            return componentName;
        }
        ComponentName componentNameE3 = e(context, launchIntentForPackage, false);
        return componentNameE3 != null ? componentNameE3 : componentName;
    }

    private static final ComponentName e(Context context, Intent intent, boolean z) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            ((ype) a.l().ai((char) 3899)).y("No activity found for intent %s.", intent);
            return null;
        }
        ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
        if (z) {
            Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ResolveInfo next = it.next();
                if (next.activityInfo.packageName.toLowerCase(Locale.ROOT).contains(Build.MANUFACTURER.toLowerCase(Locale.ROOT))) {
                    ((ype) a.l().ai(3900)).y("Choosing activity with package that contains manufacturer: %s", next.activityInfo.packageName);
                    activityInfo = next.activityInfo;
                    break;
                }
            }
        }
        return new ComponentName(activityInfo.packageName, activityInfo.name);
    }

    @Override // defpackage.lhg
    public final void c() {
        ComponentName componentName = mkn.v;
        ComponentName componentNameB = b(componentName);
        HashMap map = this.b;
        map.put(componentName, componentNameB);
        ComponentName componentName2 = mkn.b;
        ComponentName componentNameB2 = b(componentName2);
        map.put(componentName2, componentNameB2);
        map.put(mkn.c, componentNameB2);
        ComponentName componentName3 = mkn.p;
        map.put(componentName3, b(componentName3));
    }

    @Override // defpackage.lhg
    public final void d() {
        this.b.clear();
    }
}
