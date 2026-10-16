package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class zzecl extends zzgba {
    private final SensorManager zza;
    private final Sensor zzb;
    private float zzc;
    private Float zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private zzeck zzi;
    private boolean zzj;

    public zzecl(Context context) {
        super("FlickDetector", "ads");
        this.zzc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.zzd = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        C6.n.f1857D.k.getClass();
        this.zze = System.currentTimeMillis();
        this.zzf = 0;
        this.zzg = false;
        this.zzh = false;
        this.zzi = null;
        this.zzj = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    public final void zza(zzeck zzeckVar) {
        this.zzi = zzeckVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkE)).booleanValue()) {
                    if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzj = true;
                        G6.L.k("Listening for flick gestures.");
                    }
                    if (this.zza == null || this.zzb == null) {
                        int i5 = G6.L.f4523b;
                        H6.l.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.zzj = false;
                    G6.L.k("Stopped listening for flick gestures.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgba
    public final void zzd(SensorEvent sensorEvent) {
        zzbio zzbioVar = zzbix.zzkE;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            C6.n.f1857D.k.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j8 = this.zze;
            zzbio zzbioVar2 = zzbix.zzkG;
            zzbiv zzbivVar = c0395s.f2492c;
            if (j8 + ((Integer) zzbivVar.zzd(zzbioVar2)).intValue() < jCurrentTimeMillis) {
                this.zzf = 0;
                this.zze = jCurrentTimeMillis;
                this.zzg = false;
                this.zzh = false;
                this.zzc = this.zzd.floatValue();
            }
            float fFloatValue = this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.zzd = Float.valueOf(fFloatValue);
            float f10 = this.zzc;
            zzbio zzbioVar3 = zzbix.zzkF;
            if (fFloatValue > ((Float) zzbivVar.zzd(zzbioVar3)).floatValue() + f10) {
                this.zzc = this.zzd.floatValue();
                this.zzh = true;
            } else if (this.zzd.floatValue() < this.zzc - ((Float) zzbivVar.zzd(zzbioVar3)).floatValue()) {
                this.zzc = this.zzd.floatValue();
                this.zzg = true;
            }
            if (this.zzd.isInfinite()) {
                this.zzd = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                this.zzc = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            if (this.zzg && this.zzh) {
                G6.L.k("Flick detected.");
                this.zze = jCurrentTimeMillis;
                int i5 = this.zzf + 1;
                this.zzf = i5;
                this.zzg = false;
                this.zzh = false;
                zzeck zzeckVar = this.zzi;
                if (zzeckVar == null || i5 != ((Integer) zzbivVar.zzd(zzbix.zzkH)).intValue()) {
                    return;
                }
                zzecz zzeczVar = (zzecz) zzeckVar;
                zzeczVar.zzo(new zzecx(zzeczVar), zzecy.GESTURE);
            }
        }
    }
}
