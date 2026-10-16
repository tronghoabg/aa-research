package Xa;

import Hf.x0;
import X0.AbstractC1274b;
import Y0.e;
import Y9.c;
import ab.AbstractServiceC1345a;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Settings;
import android.view.Window;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC3340k;
import tc.g;
import uc.C4278o;
import uc.C4281r;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import uc.InterfaceC4283t;

/* loaded from: classes4.dex */
public final class b implements InterfaceC4279p, InterfaceC4283t {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16216a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16217b;

    /* renamed from: c, reason: collision with root package name */
    public C4281r f16218c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f16219d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f16220e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f16221f;

    public b(Context context, a aVar) {
        AbstractC3340k.e(context, "context");
        this.f16216a = context;
        this.f16217b = aVar;
        this.f16220e = new LinkedHashMap();
        this.f16221f = new LinkedHashMap();
    }

    public final Activity a() throws Ya.a {
        Activity activity = this.f16219d;
        if (activity == null) {
            throw new Ya.a("Cannot call method because Activity is not attached to FlutterEngine.");
        }
        AbstractC3340k.b(activity);
        return activity;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // uc.InterfaceC4283t
    public final boolean onActivityResult(int i5, int i10, Intent intent) {
        boolean zCanScheduleExactAlarms;
        LinkedHashMap linkedHashMap = this.f16220e;
        Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i5));
        LinkedHashMap linkedHashMap2 = this.f16221f;
        InterfaceC4280q interfaceC4280q = (InterfaceC4280q) linkedHashMap2.get(Integer.valueOf(i5));
        linkedHashMap.remove(Integer.valueOf(i5));
        linkedHashMap2.remove(Integer.valueOf(i5));
        if (num != null && interfaceC4280q != null) {
            int iIntValue = num.intValue();
            Context context = this.f16216a;
            switch (iIntValue) {
                case 200:
                    AbstractC3340k.e(context, "context");
                    Object systemService = context.getSystemService("power");
                    AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                    interfaceC4280q.a(Boolean.valueOf(((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName())));
                    break;
                case 201:
                    AbstractC3340k.e(context, "context");
                    Object systemService2 = context.getSystemService("power");
                    AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                    interfaceC4280q.a(Boolean.valueOf(((PowerManager) systemService2).isIgnoringBatteryOptimizations(context.getPackageName())));
                    return true;
                case AD_CONSUMED_VALUE:
                    AbstractC3340k.e(context, "context");
                    interfaceC4280q.a(Boolean.valueOf(Settings.canDrawOverlays(context)));
                    return true;
                case AD_IS_LOADING_VALUE:
                    AbstractC3340k.e(context, "context");
                    if (Build.VERSION.SDK_INT >= 31) {
                        Object systemService3 = context.getSystemService("alarm");
                        AbstractC3340k.c(systemService3, "null cannot be cast to non-null type android.app.AlarmManager");
                        zCanScheduleExactAlarms = ((AlarmManager) systemService3).canScheduleExactAlarms();
                    } else {
                        zCanScheduleExactAlarms = true;
                    }
                    interfaceC4280q.a(Boolean.valueOf(zCanScheduleExactAlarms));
                    return true;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o call, InterfaceC4280q interfaceC4280q) throws Ya.a {
        boolean z2;
        String string;
        Za.b bVar;
        Za.b bVar2;
        boolean zCanScheduleExactAlarms;
        AbstractC3340k.e(call, "call");
        try {
            String str = call.f46759a;
            if (str != null) {
                int iHashCode = str.hashCode();
                LinkedHashMap linkedHashMap = this.f16221f;
                LinkedHashMap linkedHashMap2 = this.f16220e;
                a aVar = this.f16217b;
                Context context = this.f16216a;
                Object obj = call.f46760b;
                switch (iHashCode) {
                    case -2070189206:
                        if (str.equals("setOnLockScreenVisibility")) {
                            Activity activityA = a();
                            if (obj instanceof Boolean) {
                                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                if (Build.VERSION.SDK_INT >= 27) {
                                    activityA.setShowWhenLocked(zBooleanValue);
                                    return;
                                }
                                if (zBooleanValue) {
                                    Window window = activityA.getWindow();
                                    if (window != null) {
                                        window.addFlags(524288);
                                        return;
                                    }
                                    return;
                                }
                                Window window2 = activityA.getWindow();
                                if (window2 != null) {
                                    window2.clearFlags(524288);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -1401626951:
                        if (str.equals("isAppOnForeground")) {
                            AbstractC3340k.e(context, "context");
                            Object systemService = context.getSystemService("activity");
                            AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                            if (runningAppProcesses == null) {
                                z2 = false;
                            } else {
                                String packageName = context.getPackageName();
                                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                                    if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(packageName)) {
                                        z2 = true;
                                    }
                                }
                                z2 = false;
                            }
                            ((g) interfaceC4280q).a(Boolean.valueOf(z2));
                            return;
                        }
                        break;
                    case -958428903:
                        if (str.equals("requestIgnoreBatteryOptimization")) {
                            Activity activityA2 = a();
                            int iHashCode2 = UUID.randomUUID().hashCode() & com.applovin.shadow.okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            linkedHashMap2.put(Integer.valueOf(iHashCode2), 200);
                            linkedHashMap.put(Integer.valueOf(iHashCode2), interfaceC4280q);
                            activityA2.startActivityForResult(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + activityA2.getPackageName())), iHashCode2);
                            return;
                        }
                        break;
                    case -917901449:
                        if (str.equals("canDrawOverlays")) {
                            AbstractC3340k.e(context, "context");
                            ((g) interfaceC4280q).a(Boolean.valueOf(Settings.canDrawOverlays(context)));
                            return;
                        }
                        break;
                    case -843699029:
                        if (str.equals("wakeUpScreen")) {
                            AbstractC3340k.e(context, "context");
                            Object systemService2 = context.getSystemService("power");
                            AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
                            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService2).newWakeLock(805306378, "PluginUtils:WakeLock");
                            wakeLockNewWakeLock.acquire(1000L);
                            wakeLockNewWakeLock.release();
                            return;
                        }
                        break;
                    case -830276983:
                        if (str.equals("requestNotificationPermission")) {
                            Activity activityA3 = a();
                            g gVar = (g) interfaceC4280q;
                            c cVar = new c(gVar, 26);
                            ab.c cVar2 = aVar.f16212a;
                            if (cVar2 == null) {
                                AbstractC3340k.m("notificationPermissionManager");
                                throw null;
                            }
                            if (Build.VERSION.SDK_INT < 33) {
                                Za.b bVar3 = Za.b.f17077a;
                                gVar.a(0);
                                return;
                            } else {
                                cVar2.f17486a = activityA3;
                                cVar2.f17487b = cVar;
                                AbstractC1274b.a(activityA3, new String[]{"android.permission.POST_NOTIFICATIONS"}, 100);
                                return;
                            }
                        }
                        break;
                    case -802694078:
                        if (str.equals("checkNotificationPermission")) {
                            Activity activityA4 = a();
                            if (aVar.f16212a == null) {
                                AbstractC3340k.m("notificationPermissionManager");
                                throw null;
                            }
                            if (Build.VERSION.SDK_INT >= 33 && e.checkSelfPermission(activityA4, "android.permission.POST_NOTIFICATIONS") != 0) {
                                SharedPreferences sharedPreferences = activityA4.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.NOTIFICATION_PERMISSION_STATUS", 0);
                                Za.b bVarValueOf = (sharedPreferences == null || (string = sharedPreferences.getString("android.permission.POST_NOTIFICATIONS", null)) == null) ? null : Za.b.valueOf(string);
                                bVar = (bVarValueOf == null || bVarValueOf != (bVar2 = Za.b.f17079c) || activityA4.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) ? Za.b.f17078b : bVar2;
                            } else {
                                bVar = Za.b.f17077a;
                            }
                            ((g) interfaceC4280q).a(Integer.valueOf(bVar.ordinal()));
                            return;
                        }
                        break;
                    case -675127954:
                        if (str.equals("launchApp")) {
                            if (obj == null ? true : obj instanceof String) {
                                String str2 = (String) obj;
                                AbstractC3340k.e(context, "context");
                                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
                                if (launchIntentForPackage != null) {
                                    launchIntentForPackage.setFlags(268435456);
                                    if (str2 != null) {
                                        launchIntentForPackage.putExtra("route", str2);
                                    }
                                    if (Build.VERSION.SDK_INT < 34) {
                                        context.startActivity(launchIntentForPackage);
                                        return;
                                    }
                                    ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
                                    activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
                                    context.startActivity(launchIntentForPackage, activityOptionsMakeBasic.toBundle());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        break;
                    case -386121002:
                        if (str.equals("openSystemAlertWindowSettings")) {
                            Activity activityA5 = a();
                            int iHashCode3 = UUID.randomUUID().hashCode() & com.applovin.shadow.okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            linkedHashMap2.put(Integer.valueOf(iHashCode3), Integer.valueOf(Sdk.SDKError.Reason.AD_CONSUMED_VALUE));
                            linkedHashMap.put(Integer.valueOf(iHashCode3), interfaceC4280q);
                            activityA5.startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + activityA5.getPackageName())), iHashCode3);
                            return;
                        }
                        break;
                    case 310881216:
                        if (str.equals("isRunningService")) {
                            aVar.a();
                            ((g) interfaceC4280q).a(Boolean.valueOf(ab.b.f()));
                            return;
                        }
                        break;
                    case 481665446:
                        if (str.equals("restartService")) {
                            aVar.a();
                            ab.b.h(context);
                            ((g) interfaceC4280q).a(Boolean.TRUE);
                            return;
                        }
                        break;
                    case 488202668:
                        if (str.equals("updateService")) {
                            aVar.a();
                            ab.b.k(context, obj);
                            ((g) interfaceC4280q).a(Boolean.TRUE);
                            return;
                        }
                        break;
                    case 677170851:
                        if (str.equals("minimizeApp")) {
                            a().moveTaskToBack(true);
                            return;
                        }
                        break;
                    case 699379795:
                        if (str.equals("stopService")) {
                            aVar.a();
                            ab.b.j(context);
                            ((g) interfaceC4280q).a(Boolean.TRUE);
                            return;
                        }
                        break;
                    case 827196186:
                        if (str.equals("canScheduleExactAlarms")) {
                            AbstractC3340k.e(context, "context");
                            if (Build.VERSION.SDK_INT >= 31) {
                                Object systemService3 = context.getSystemService("alarm");
                                AbstractC3340k.c(systemService3, "null cannot be cast to non-null type android.app.AlarmManager");
                                zCanScheduleExactAlarms = ((AlarmManager) systemService3).canScheduleExactAlarms();
                            } else {
                                zCanScheduleExactAlarms = true;
                            }
                            ((g) interfaceC4280q).a(Boolean.valueOf(zCanScheduleExactAlarms));
                            return;
                        }
                        break;
                    case 1246965586:
                        if (str.equals("sendData")) {
                            aVar.a();
                            if (obj != null) {
                                ((Boolean) ((x0) AbstractServiceC1345a.f17485a.f5122a).getValue()).getClass();
                                return;
                            }
                            return;
                        }
                        break;
                    case 1263333587:
                        if (str.equals("attachedActivity")) {
                            ((g) interfaceC4280q).a(Boolean.valueOf(this.f16219d != null));
                            return;
                        }
                        break;
                    case 1465118721:
                        if (str.equals("openIgnoreBatteryOptimizationSettings")) {
                            Activity activityA6 = a();
                            int iHashCode4 = UUID.randomUUID().hashCode() & com.applovin.shadow.okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            linkedHashMap2.put(Integer.valueOf(iHashCode4), 201);
                            linkedHashMap.put(Integer.valueOf(iHashCode4), interfaceC4280q);
                            activityA6.startActivityForResult(new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"), iHashCode4);
                            return;
                        }
                        break;
                    case 1616958905:
                        if (str.equals("openAlarmsAndRemindersSettings")) {
                            Activity activityA7 = a();
                            int iHashCode5 = UUID.randomUUID().hashCode() & com.applovin.shadow.okhttp3.internal.http2.Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                            linkedHashMap2.put(Integer.valueOf(iHashCode5), Integer.valueOf(Sdk.SDKError.Reason.AD_IS_LOADING_VALUE));
                            linkedHashMap.put(Integer.valueOf(iHashCode5), interfaceC4280q);
                            if (Build.VERSION.SDK_INT < 31) {
                                throw new Ya.a("only supports Android 12.0+");
                            }
                            activityA7.startActivityForResult(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + activityA7.getPackageName())), iHashCode5);
                            return;
                        }
                        break;
                    case 1849706483:
                        if (str.equals("startService")) {
                            aVar.a();
                            ab.b.i(context, obj);
                            ((g) interfaceC4280q).a(Boolean.TRUE);
                            return;
                        }
                        break;
                    case 2079768210:
                        if (str.equals("isIgnoringBatteryOptimizations")) {
                            AbstractC3340k.e(context, "context");
                            Object systemService4 = context.getSystemService("power");
                            AbstractC3340k.c(systemService4, "null cannot be cast to non-null type android.os.PowerManager");
                            ((g) interfaceC4280q).a(Boolean.valueOf(((PowerManager) systemService4).isIgnoringBatteryOptimizations(context.getPackageName())));
                            return;
                        }
                        break;
                }
            }
            ((g) interfaceC4280q).c();
        } catch (Exception e7) {
            ((g) interfaceC4280q).b(e7.getClass().getSimpleName(), e7.getMessage(), null);
        }
    }
}
