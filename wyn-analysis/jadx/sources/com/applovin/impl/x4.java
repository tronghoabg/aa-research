package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x4 implements SensorEventListener, AppLovinBroadcastManager.Receiver {

    /* renamed from: a, reason: collision with root package name */
    private final int f23507a;

    /* renamed from: b, reason: collision with root package name */
    private final float f23508b;

    /* renamed from: c, reason: collision with root package name */
    private final C1636f0 f23509c;

    /* renamed from: d, reason: collision with root package name */
    private final Sensor f23510d;

    /* renamed from: e, reason: collision with root package name */
    private final Sensor f23511e;

    /* renamed from: f, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f23512f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f23513g;

    /* renamed from: h, reason: collision with root package name */
    private float f23514h;

    public x4(com.applovin.impl.sdk.k kVar) {
        this.f23512f = kVar;
        C1636f0 c1636f0 = new C1636f0();
        this.f23509c = c1636f0;
        this.f23510d = c1636f0.a(9);
        this.f23511e = c1636f0.a(4);
        this.f23507a = ((Integer) kVar.a(y4.f23852m4)).intValue();
        this.f23508b = ((Float) kVar.a(y4.f23843l4)).floatValue();
    }

    public float a() {
        return this.f23513g == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : (float) Math.toDegrees(Math.acos(r0[2] / 9.81f));
    }

    public float b() {
        return this.f23514h;
    }

    public void c() {
        if (Boolean.parseBoolean(this.f23512f.o0().getExtraParameters().get("disable_sensor_data_collection"))) {
            return;
        }
        this.f23509c.b(this);
        if (((Boolean) this.f23512f.p0().a(y4.f23827j4)).booleanValue()) {
            this.f23509c.b(this, this.f23510d, (int) TimeUnit.MILLISECONDS.toMicros(this.f23507a), this.f23512f.O());
        }
        if (((Boolean) this.f23512f.p0().a(y4.f23835k4)).booleanValue()) {
            this.f23509c.b(this, this.f23511e, (int) TimeUnit.MILLISECONDS.toMicros(this.f23507a), this.f23512f.O());
        }
        AppLovinBroadcastManager.unregisterReceiver(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i5) {
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f23509c.b(this);
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 9) {
            this.f23513g = sensorEvent.values;
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float f10 = this.f23514h * this.f23508b;
            this.f23514h = f10;
            this.f23514h = Math.abs(sensorEvent.values[2]) + Math.abs(sensorEvent.values[1]) + Math.abs(sensorEvent.values[0]) + f10;
        }
    }
}
