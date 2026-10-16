package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes3.dex */
public final class zzeec extends zzgba {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzeeb zzf;
    private boolean zzg;

    public zzeec(Context context) {
        super("ShakeDetector", "ads");
        this.zza = context;
    }

    public final void zza(zzeeb zzeebVar) {
        this.zzf = zzeebVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkz)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i5 = G6.L.f4523b;
                            H6.l.f("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        C6.n.f1857D.k.getClass();
                        this.zzd = System.currentTimeMillis() - ((Integer) r1.f2492c.zzd(zzbix.zzkB)).intValue();
                        this.zzg = true;
                        G6.L.k("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        G6.L.k("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final void zzd(SensorEvent sensorEvent) {
        zzbio zzbioVar = zzbix.zzkz;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            float f13 = f12 * f12;
            float fSqrt = (float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10));
            zzbio zzbioVar2 = zzbix.zzkA;
            zzbiv zzbivVar = c0395s.f2492c;
            if (fSqrt >= ((Float) zzbivVar.zzd(zzbioVar2)).floatValue()) {
                C6.n.f1857D.k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (this.zzd + ((Integer) zzbivVar.zzd(zzbix.zzkB)).intValue() <= jCurrentTimeMillis) {
                    if (this.zzd + ((Integer) zzbivVar.zzd(zzbix.zzkC)).intValue() < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    G6.L.k("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i5 = this.zze + 1;
                    this.zze = i5;
                    zzeeb zzeebVar = this.zzf;
                    if (zzeebVar == null || i5 != ((Integer) zzbivVar.zzd(zzbix.zzkD)).intValue()) {
                        return;
                    }
                    zzecz zzeczVar = (zzecz) zzeebVar;
                    zzeczVar.zzo(new zzecw(zzeczVar), zzecy.GESTURE);
                }
            }
        }
    }
}
