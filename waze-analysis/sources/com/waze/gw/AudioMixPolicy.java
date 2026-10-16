package com.waze.gw;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class AudioMixPolicy {
    private static final String KEY = "mix_mod_audio";
    private static final String MODE_KEY = "audio_mix_mode";
    private static final String PREFS = "waze_hud_gw";
    private static final String TAG = "WazeGW-AudioMix";
    private static final long TTS_ARM_WINDOW_MS = 3000;
    private static volatile Context appContext;
    private static final AtomicLong ttsBypassDeadlineMs = new AtomicLong();

    private AudioMixPolicy() {
    }

    static boolean isMixEnabled(Context context) {
        Context applicationContext = context != null ? context.getApplicationContext() : applicationContext();
        if (applicationContext == null) {
            return false;
        }
        try {
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(PREFS, 0);
            if (sharedPreferences.contains(MODE_KEY)) {
                return sharedPreferences.getInt(MODE_KEY, 1) == 0;
            }
            return sharedPreferences.getBoolean(KEY, false);
        } catch (Throwable th) {
            return false;
        }
    }

    static boolean armForModTts() {
        if (!isMixEnabled(null)) {
            return false;
        }
        ttsBypassDeadlineMs.set(SystemClock.elapsedRealtime() + 3000);
        Log.i(TAG, "Armed one-shot Waze TTS focus bypass");
        return true;
    }

    static void cancelModTtsArm() {
        ttsBypassDeadlineMs.set(0L);
    }

    public static boolean consumeWazeTtsFocusBypass() {
        boolean z = ttsBypassDeadlineMs.getAndSet(0L) >= SystemClock.elapsedRealtime();
        if (z) {
            Log.i(TAG, "Bypassing audio focus for one Mod TTS prompt");
        }
        return z;
    }

    public static boolean shouldBypassWazeAudioFocus() {
        boolean zIsMixEnabled = isMixEnabled(null);
        if (zIsMixEnabled) {
            Log.i(TAG, "Mix mode active; skipping Waze ExoPlayer ducking focus");
        }
        return zIsMixEnabled;
    }

    private static Context applicationContext() {
        Context applicationContext = appContext;
        if (applicationContext != null) {
            return applicationContext;
        }
        try {
            Application application = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
            if (application != null) {
                applicationContext = application.getApplicationContext();
                appContext = applicationContext;
                return applicationContext;
            }
            return applicationContext;
        } catch (Throwable th) {
            return applicationContext;
        }
    }
}
