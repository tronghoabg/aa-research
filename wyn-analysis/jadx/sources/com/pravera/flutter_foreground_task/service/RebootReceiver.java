package com.pravera.flutter_foreground_task.service;

import Y0.e;
import Za.a;
import ab.AbstractServiceC1345a;
import android.app.ForegroundServiceStartNotAllowedException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import cb.AbstractC1593a;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONException;
import org.json.JSONObject;
import ya.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/pravera/flutter_foreground_task/service/RebootReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "startForegroundService", "Companion", "flutter_foreground_task_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RebootReceiver extends BroadcastReceiver {
    public static void a(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                Intent intent = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
                SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
                editorEdit.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.reboot");
                editorEdit.commit();
                e.startForegroundService(context, intent);
                return;
            } catch (Exception e7) {
                Log.e("RebootReceiver", e7.getMessage(), e7);
                return;
            }
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) AbstractServiceC1345a.class);
            SharedPreferences.Editor editorEdit2 = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).edit();
            editorEdit2.putString("foregroundServiceAction", "com.pravera.flutter_foreground_task.action.reboot");
            editorEdit2.commit();
            e.startForegroundService(context, intent2);
        } catch (ForegroundServiceStartNotAllowedException e10) {
            AbstractC1593a.t("Foreground service start not allowed exception: ", e10.getMessage(), "RebootReceiver");
        } catch (Exception e11) {
            Log.e("RebootReceiver", e11.getMessage(), e11);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws JSONException {
        if (context == null || intent == null) {
            return;
        }
        try {
            if ((context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC1345a.class), 128).flags & 1) == 1) {
                return;
            }
            a aVar = null;
            String string = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_SERVICE_STATUS", 0).getString("foregroundServiceAction", null);
            if (string == null) {
                string = "com.pravera.flutter_foreground_task.action.api_stop";
            }
            if (AbstractC3340k.a(string, "com.pravera.flutter_foreground_task.action.api_stop")) {
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.pravera.flutter_foreground_task.prefs.FOREGROUND_TASK_OPTIONS", 0);
            String string2 = sharedPreferences.getString("taskEventAction", null);
            if (string2 != null) {
                JSONObject jSONObject = new JSONObject(string2);
                if (jSONObject.isNull("taskEventType")) {
                    b bVar = a.f17074b;
                } else {
                    int i5 = jSONObject.getInt("taskEventType");
                    a.f17074b.getClass();
                    a[] aVarArrValues = a.values();
                    int length = aVarArrValues.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        a aVar2 = aVarArrValues[i10];
                        if (aVar2.f17076a == i5) {
                            aVar = aVar2;
                            break;
                        }
                        i10++;
                    }
                    if (aVar == null) {
                        b bVar2 = a.f17074b;
                    }
                }
                if (!jSONObject.isNull("taskEventInterval")) {
                    jSONObject.getInt("taskEventInterval");
                }
            } else {
                boolean z2 = sharedPreferences.getBoolean("isOnceEvent", false);
                sharedPreferences.getLong("interval", 5000L);
                if (z2) {
                    b bVar3 = a.f17074b;
                } else {
                    b bVar4 = a.f17074b;
                }
            }
            boolean z10 = sharedPreferences.getBoolean("autoRunOnBoot", false);
            boolean z11 = sharedPreferences.getBoolean("autoRunOnMyPackageReplaced", false);
            sharedPreferences.getBoolean("allowWakeLock", true);
            sharedPreferences.getBoolean("allowWifiLock", false);
            if ((AbstractC3340k.a(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || AbstractC3340k.a(intent.getAction(), "android.intent.action.QUICKBOOT_POWERON")) && z10) {
                a(context);
            } else if (AbstractC3340k.a(intent.getAction(), "android.intent.action.MY_PACKAGE_REPLACED") && z11) {
                a(context);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("b", "isSetStopWithTaskFlag >> The service component cannot be found on the system.");
        } catch (Exception e7) {
            Log.e("b", "isSetStopWithTaskFlag >> " + e7);
        }
    }
}
