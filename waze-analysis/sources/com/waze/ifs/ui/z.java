package com.waze.ifs.ui;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import com.waze.NativeManager;
import com.waze.WazeAppService;
import com.waze.config.ConfigValues;
import com.waze.gw.Gateway;
import com.waze.mg;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static z f24600a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f24601b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private boolean f24602c = false;

    private z() {
    }

    public static synchronized z a() {
        z zVar;
        zVar = f24600a;
        if (zVar == null) {
            zVar = new z();
            f24600a = zVar;
        }
        return zVar;
    }

    public final synchronized void b(y yVar) {
        this.f24601b.add(yVar);
    }

    public final synchronized void c() {
        if (Gateway.shouldPreventShutdown()) {
            Log.w("ShutdownManager", "Blocked final VM abort while Waze Mod bubble mode is active");
            return;
        }
        synchronized (this) {
            Log.w("ShutdownManager", "All shutting down constraints are satisfied. Aborting VM");
            boolean zBooleanValue = ConfigValues.CONFIG_VALUE_GENERAL_ANDROID_KILL_PROCESS_ON_SHUTDOWN.b().booleanValue();
            this.f24602c = zBooleanValue;
            Log.w("ShutdownManager", "Starting shutdown process... killProcessOnShutdown=" + zBooleanValue);
            Set set = this.f24601b;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((y) it.next()).onShutdown();
            }
            set.clear();
            NativeManager.getInstance().ClearNotifications();
            long j2 = com.waze.t.f40624a;
            NotificationManager notificationManager = (NotificationManager) mg.a().getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(1);
            }
            Context contextA = mg.a();
            contextA.stopService(new Intent(contextA, (Class<?>) WazeAppService.class));
            Iterator<ActivityManager.AppTask> it2 = ((ActivityManager) mg.f29780a.a().getSystemService("activity")).getAppTasks().iterator();
            while (it2.hasNext()) {
                it2.next().finishAndRemoveTask();
            }
            if (this.f24602c) {
                Process.killProcess(Process.myPid());
            } else {
                System.exit(0);
            }
        }
    }

    public final synchronized void d(y yVar) {
        this.f24601b.remove(yVar);
    }
}
