package com.waze.gw;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;

/* loaded from: classes10.dex */
final class HudLink {
    private static final Object START_LOCK = new Object();
    private static final long START_RETRY_MS = 15000;
    private static final String TAG = "WazeHudLink";
    private static volatile long lastStartAttemptElapsed;

    private HudLink() {
    }

    static void ensureStarted(Context context) {
        if (context == null || Gateway.isExplicitShutdownRequested() || !new HudDeviceRepository(context).isActiveEnabled() || HudLinkService.isRunning()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (START_LOCK) {
            if (!HudLinkService.isRunning() && jElapsedRealtime - lastStartAttemptElapsed >= 15000) {
                lastStartAttemptElapsed = jElapsedRealtime;
                Log.i(TAG, "HUD Link enabled but service absent; requesting runtime restart");
                HudLinkService.startFromRuntime(context);
            }
        }
    }

    static void stop(Context context) {
        HudLinkService.stop(context);
    }
}
