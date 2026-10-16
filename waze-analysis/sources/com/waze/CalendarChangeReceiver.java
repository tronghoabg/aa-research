package com.waze;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.credentials.provider.CredentialEntry;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class CalendarChangeReceiver extends BroadcastReceiver {
    public static void a(Context context, boolean z) {
        OfflineNativeManager.log("Calendar", "enableReceiver called with enable=%s", true != z ? CredentialEntry.FALSE_STRING : CredentialEntry.TRUE_STRING);
        if (context == null) {
            OfflineNativeManager.log("Calendar", "no context, failing", new Object[0]);
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            OfflineNativeManager.log("Calendar", "no package manager, failing", new Object[0]);
        } else {
            packageManager.setComponentEnabledSetting(new ComponentName(context, (Class<?>) CalendarChangeReceiver.class), true != z ? 2 : 1, 1);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        WorkManager.getInstance(context.getApplicationContext()).enqueue(new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CalendarUpdateWorker.class).build());
    }
}
