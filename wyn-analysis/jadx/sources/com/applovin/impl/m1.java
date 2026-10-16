package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class m1 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21892a;

    /* renamed from: b, reason: collision with root package name */
    private final C1636f0 f21893b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f21894c;

    /* renamed from: d, reason: collision with root package name */
    private final a f21895d;

    /* renamed from: e, reason: collision with root package name */
    private float f21896e;

    public interface a {
        void a();

        void b();
    }

    public m1(com.applovin.impl.sdk.k kVar, a aVar) {
        this.f21892a = kVar;
        C1636f0 c1636f0 = new C1636f0();
        this.f21893b = c1636f0;
        this.f21894c = c1636f0.a(1);
        this.f21895d = aVar;
    }

    public void a() {
        if (Boolean.parseBoolean(this.f21892a.o0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f21893b.b(this);
        this.f21893b.b(this, this.f21894c, (int) TimeUnit.MILLISECONDS.toMicros(50L), this.f21892a.O());
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public void b() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f21893b.b(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i5) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f21893b.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            a();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 1) {
            float fMax = Math.max(Math.min(sensorEvent.values[2] / 9.81f, 1.0f), -1.0f);
            float f10 = this.f21896e;
            float f11 = (fMax * 0.5f) + (f10 * 0.5f);
            this.f21896e = f11;
            if (f10 < 0.8f && f11 > 0.8f) {
                this.f21895d.a();
            } else {
                if (f10 <= -0.8f || f11 >= -0.8f) {
                    return;
                }
                this.f21895d.b();
            }
        }
    }
}
