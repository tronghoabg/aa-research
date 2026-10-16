package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzcft {
    private zzhcp zza;
    private zzdzt zzb;
    private Context zzc;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private long zzf = -1;
    private long zzg = -1;

    public final void zza(zzhcp zzhcpVar, zzdzt zzdztVar, Context context) {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        this.zza = zzhcpVar;
        this.zzb = zzdztVar;
        zzbio zzbioVar = zzbix.zzpx;
        C0395s c0395s = C0395s.f2489e;
        this.zzf = ((Long) c0395s.f2492c.zzd(zzbioVar)).longValue();
        this.zzg = ((Long) c0395s.f2492c.zzd(zzbix.zzpy)).longValue();
        this.zzc = context;
    }

    public final void zzb() {
        zzhcp zzhcpVar;
        if (!this.zzd.get() || this.zzf < 0 || this.zzg < 0 || !this.zze.compareAndSet(false, true) || (zzhcpVar = this.zza) == null) {
            return;
        }
        zzhcpVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws InterruptedException {
                this.zza.zzc();
            }
        });
    }

    public final void zzc() throws InterruptedException {
        zzdzt zzdztVar;
        ActivityManager.MemoryInfo memoryInfoI;
        while (this.zze.get()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            U.f4562l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcfq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    atomicBoolean.getAndSet(true);
                }
            });
            try {
                Thread.sleep(this.zzf);
                if (!atomicBoolean.get()) {
                    zzbio zzbioVar = zzbix.zzpz;
                    C0395s c0395s = C0395s.f2489e;
                    boolean zBooleanValue = ((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue();
                    zzbiv zzbivVar = c0395s.f2492c;
                    if (zBooleanValue && (zzdztVar = this.zzb) != null) {
                        zzdzs zzdzsVarZza = zzdztVar.zza();
                        zzdzsVarZza.zzc(HandleInvocationsFromAdViewer.KEY_ACTION, "panr");
                        if (((Boolean) zzbivVar.zzd(zzbix.zzqb)).booleanValue() && (memoryInfoI = H6.f.i(this.zzc)) != null) {
                            zzdzsVarZza.zzc("mem_avl", String.valueOf(memoryInfoI.availMem));
                            zzdzsVarZza.zzc("mem_tt", String.valueOf(memoryInfoI.totalMem));
                            zzdzsVarZza.zzc("low_m", true != memoryInfoI.lowMemory ? "0" : UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                        }
                        zzdzsVarZza.zzf();
                    }
                    if (((Boolean) zzbivVar.zzd(zzbix.zzpA)).booleanValue()) {
                        StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                        zzcfs zzcfsVar = new zzcfs("Potential ANR detected");
                        zzcfsVar.setStackTrace(stackTrace);
                        if (((Boolean) zzbivVar.zzd(zzbix.zzpB)).booleanValue()) {
                            zzcaf.zzc(this.zzc).zzi(zzcfsVar, "AnrWatchdog", ((Integer) zzbivVar.zzd(zzbix.zzpC)).intValue() / 100.0f);
                        } else {
                            C6.n.f1857D.f1868h.zzh(zzcfsVar, "AnrWatchdog");
                        }
                    }
                }
                do {
                    try {
                        Thread.sleep(this.zzg);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                } while (!atomicBoolean.get());
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}
