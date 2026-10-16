package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes3.dex */
public class xs {

    /* renamed from: oa, reason: collision with root package name */
    static float f26170oa = 0.0f;
    static int uef = -1;
    private static long yo;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        public final float f26171oa;
        public final int uef;

        public uef(int i5, float f10) {
            this.uef = i5;
            this.f26171oa = f10;
        }
    }

    private static void uef(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            uef = 1;
        } else {
            uef = 0;
        }
        f26170oa = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static uef uef() {
        if (yo == 0 || SystemClock.elapsedRealtime() - yo > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.sy.uef().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                uef(intentRegisterReceiver);
                yo = SystemClock.elapsedRealtime();
            }
        }
        return new uef(uef, f26170oa);
    }
}
