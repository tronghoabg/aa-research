package com.baseflow.geolocator;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import t6.q;
import u0.C4163a0;
import v4.BinderC4299a;
import x4.c;
import x4.e;

/* loaded from: classes.dex */
public class GeolocatorLocationService extends Service {
    public static final /* synthetic */ int k = 0;

    /* renamed from: g, reason: collision with root package name */
    public e f24203g;

    /* renamed from: a, reason: collision with root package name */
    public final BinderC4299a f24197a = new BinderC4299a(this);

    /* renamed from: b, reason: collision with root package name */
    public boolean f24198b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f24199c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f24200d = 0;

    /* renamed from: e, reason: collision with root package name */
    public Activity f24201e = null;

    /* renamed from: f, reason: collision with root package name */
    public c f24202f = null;

    /* renamed from: h, reason: collision with root package name */
    public PowerManager.WakeLock f24204h = null;

    /* renamed from: i, reason: collision with root package name */
    public WifiManager.WifiLock f24205i = null;

    /* renamed from: j, reason: collision with root package name */
    public q f24206j = null;

    public final void a() {
        if (this.f24198b) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            c();
            this.f24198b = false;
            this.f24206j = null;
        }
    }

    public final void b(C4163a0 c4163a0) {
        WifiManager wifiManager;
        PowerManager powerManager;
        c();
        if (c4163a0.f46187b && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f24204h = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            this.f24204h.acquire();
        }
        if (!c4163a0.f46186a || (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) == null) {
            return;
        }
        WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(Build.VERSION.SDK_INT < 29 ? 3 : 4, "GeolocatorLocationService:WifiLock");
        this.f24205i = wifiLockCreateWifiLock;
        wifiLockCreateWifiLock.setReferenceCounted(false);
        this.f24205i.acquire();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.f24204h;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f24204h.release();
            this.f24204h = null;
        }
        WifiManager.WifiLock wifiLock = this.f24205i;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        this.f24205i.release();
        this.f24205i = null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f24197a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c cVar;
        Log.d("FlutterGeolocator", "Destroying location service.");
        this.f24200d--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        e eVar = this.f24203g;
        if (eVar != null && (cVar = this.f24202f) != null) {
            cVar.f47691a.remove(eVar);
            eVar.e();
        }
        a();
        this.f24202f = null;
        this.f24206j = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        return 1;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
