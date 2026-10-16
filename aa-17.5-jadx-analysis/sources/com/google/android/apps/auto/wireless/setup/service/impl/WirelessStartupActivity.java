package com.google.android.apps.auto.wireless.setup.service.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Network;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import defpackage.fyh;
import defpackage.wer;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxi;
import defpackage.yze;
import defpackage.yzf;

/* loaded from: classes2.dex */
public class WirelessStartupActivity extends Activity {
    private static final yph b = yph.c("GH.WirelessFSM");
    PowerManager.WakeLock a;

    private final void a() {
        wer.c();
        PowerManager powerManager = (PowerManager) getSystemService("power");
        PowerManager.WakeLock wakeLockNewWakeLock = this.a;
        if (wakeLockNewWakeLock == null) {
            wakeLockNewWakeLock = powerManager.newWakeLock(268435466, "ScreenOn");
            this.a = wakeLockNewWakeLock;
        }
        if (!wakeLockNewWakeLock.isHeld()) {
            this.a.acquire(30000L);
        }
        yph yphVar = b;
        ((ype) ((ype) yphVar.f()).ai(6698)).K("Launch projection %s %d", getIntent().getStringExtra("PARAM_HOST_ADDRESS"), getIntent().getIntExtra("PARAM_SERVICE_PORT", -1));
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        ComponentName componentName = new ComponentName(i >= 30 ? "com.google.android.projection.gearhead" : "com.google.android.gms", i >= 30 ? "com.google.android.apps.auto.carservice.gmscorecompat.FirstActivityImpl" : "com.google.android.gms.car.FirstActivity");
        if (Build.VERSION.SDK_INT < 30) {
            ((ype) yphVar.l().ai((char) 6697)).u("PlatformVersion is not at least R.");
        } else {
            ((ype) yphVar.l().ai((char) 6696)).u("Enabling first activity.");
            getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
        }
        intent.setAction("com.google.android.gms.car.WIFI_ACTION_BRIDGE");
        intent.putExtra("PARAM_HOST_ADDRESS", getIntent().getStringExtra("PARAM_HOST_ADDRESS"));
        intent.putExtra("PARAM_SERVICE_PORT", getIntent().getIntExtra("PARAM_SERVICE_PORT", -1));
        intent.putExtra("wifi_info", (WifiInfo) getIntent().getParcelableExtra("wifi_info"));
        intent.putExtra("PARAM_SERVICE_WIFI_NETWORK", (Network) getIntent().getParcelableExtra("PARAM_SERVICE_WIFI_NETWORK"));
        intent.putExtra("WIFI_Q_ENABLED", getIntent().getBooleanExtra("WIFI_Q_ENABLED", false));
        intent.putExtra("WIFI_STARTING_BLUETOOTH_DEVICE", getIntent().getParcelableExtra("WIFI_STARTING_BLUETOOTH_DEVICE"));
        intent.setComponent(componentName);
        yxi yxiVar = yxi.WIRELESS_WIFI_LAUNCH_WIRELESS_BRIDGE;
        Intent intent2 = new Intent();
        intent2.setAction("com.google.android.apps.auto.components.connectivity.ACTION_LOG_WIRELESS_EVENT");
        intent2.putExtra("event_type", yxiVar.pC);
        intent2.setPackage("com.google.android.projection.gearhead");
        intent2.putExtra("time_since_boot_millis", SystemClock.elapsedRealtime());
        sendBroadcast(intent2);
        try {
            startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
            ((ype) ((ype) ((ype) b.g()).p(e)).ai((char) 6699)).y("Could not find activity %s, showing RSOD instead", componentName);
            fyh.i(this, yze.CAR_SERVICE_INIT_ERROR, 2, yzf.NO_ACTIVITY_FOUND, null);
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            try {
                this.a.release();
            } catch (RuntimeException unused) {
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            this.a.release();
        } catch (RuntimeException unused) {
        }
    }
}
