package com.waze.location;

import com.waze.NativeManager;
import com.waze.config.ConfigValues;
import j$.util.Objects;
import java.util.TimerTask;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class bb extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LocationSensorListener f25333a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f25334b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f25335c;

    /* renamed from: d, reason: collision with root package name */
    private int f25336d;

    /* synthetic */ bb(LocationSensorListener locationSensorListener) {
        Objects.requireNonNull(locationSensorListener);
        this.f25333a = locationSensorListener;
        this.f25334b = false;
        this.f25335c = false;
        this.f25336d = 0;
    }

    public final boolean b() {
        return this.f25335c;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f25334b) {
            return;
        }
        LocationSensorListener locationSensorListener = this.f25333a;
        long jCurrentTimeMillis = System.currentTimeMillis() - locationSensorListener.mLastGpsFixTimeForWatchdogMs;
        if (jCurrentTimeMillis >= (true != locationSensorListener.mHasGpsForWatchdog ? 60000L : 10000L)) {
            this.f25336d++;
            boolean zBooleanValue = ConfigValues.CONFIG_VALUE_GPS_ANDROID_ENABLE_WATCHDOG.b().booleanValue();
            boolean z = locationSensorListener.mHasGpsForWatchdog;
            locationSensorListener.logger.g("WatchDogTask No GPS fix timeSinceFix=" + jCurrentTimeMillis + " ms, hasGps=" + z + ", isEnabled=" + zBooleanValue + ", triggerCount=" + this.f25336d);
            if (zBooleanValue) {
                this.f25334b = true;
                NativeManager.Post(new ba(this));
            } else {
                locationSensorListener.mHasGpsForWatchdog = false;
                locationSensorListener.mLastGpsFixTimeForWatchdogMs = System.currentTimeMillis();
            }
        }
    }
}
