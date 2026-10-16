package com.pravera.flutter_foreground_task.service;

import Y0.e;
import ab.AbstractServiceC1345a;
import android.app.ActivityManager;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import cb.AbstractC1593a;
import com.google.android.gms.common.api.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/pravera/flutter_foreground_task/service/RestartReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "flutter_foreground_task_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RestartReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws SecurityException {
        if (context == null) {
            return;
        }
        String string = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).getString("foregroundServiceAction", null);
        if (string == null) {
            string = "com.pravera.flutter_foreground_task.action.api_stop";
        }
        if (AbstractC3340k.a(string, "com.pravera.flutter_foreground_task.action.api_stop")) {
            return;
        }
        Object systemService = context.getSystemService("activity");
        AbstractC3340k.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(f.API_PRIORITY_OTHER);
        AbstractC3340k.d(runningServices, "getRunningServices(...)");
        List<ActivityManager.RunningServiceInfo> list = runningServices;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC3340k.a(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), AbstractServiceC1345a.class.getName())) {
                    return;
                }
            }
        }
        Object systemService2 = context.getSystemService("power");
        AbstractC3340k.c(systemService2, "null cannot be cast to non-null type android.os.PowerManager");
        boolean zIsIgnoringBatteryOptimizations = ((PowerManager) systemService2).isIgnoringBatteryOptimizations(context.getPackageName());
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 31 && !zIsIgnoringBatteryOptimizations) {
            Log.w("RestartReceiver", "Turn off battery optimization to restart service in the background.");
        }
        if (i5 < 31) {
            try {
                Intent intent2 = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
                editorEdit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.restart");
                editorEdit.commit();
                e.startForegroundService(context, intent2);
                return;
            } catch (Exception e7) {
                Log.e("RestartReceiver", e7.getMessage(), e7);
                return;
            }
        }
        try {
            Intent intent3 = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
            SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
            editorEdit2.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.restart");
            editorEdit2.commit();
            e.startForegroundService(context, intent3);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            AbstractC1593a.t("Foreground service start not allowed exception: ", e10.getMessage(), "RestartReceiver");
        } catch (Exception e11) {
            Log.e("RestartReceiver", e11.getMessage(), e11);
        }
    }
}
