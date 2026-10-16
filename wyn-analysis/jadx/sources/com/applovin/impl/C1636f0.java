package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.applovin.impl.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1636f0 {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f21532a = (SensorManager) com.applovin.impl.sdk.k.o().getSystemService("sensor");

    /* renamed from: b, reason: collision with root package name */
    private Handler f21533b;

    public C1636f0() {
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:background_sensor_manager");
        handlerThread.start();
        this.f21533b = new Handler(handlerThread.getLooper());
    }

    public Sensor a(int i5) {
        return this.f21532a.getDefaultSensor(i5);
    }

    public void b(SensorEventListener sensorEventListener, Sensor sensor, int i5, com.applovin.impl.sdk.o oVar) {
        this.f21533b.post(new N(this, sensorEventListener, sensor, i5, oVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener, Sensor sensor, int i5, com.applovin.impl.sdk.o oVar) {
        try {
            this.f21532a.registerListener(sensorEventListener, sensor, i5, this.f21533b);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                oVar.a("BackgroundSensorManager", "Unable to register sensor listener", th);
            }
        }
    }

    public void b(SensorEventListener sensorEventListener) {
        this.f21533b.post(new F(4, this, sensorEventListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(SensorEventListener sensorEventListener) {
        this.f21532a.unregisterListener(sensorEventListener);
    }
}
