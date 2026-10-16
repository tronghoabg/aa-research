package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfbe implements zzfcs {
    private final zzfcs zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzfbe(zzfcs zzfcsVar, long j8, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfcsVar;
        this.zzb = j8;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        p8.p pVarZza = this.zza.zza();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdj)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j8 = this.zzb;
        if (j8 > 0) {
            pVarZza = zzhcf.zzi(pVarZza, j8, timeUnit, this.zzc);
        }
        return zzhcf.zzh(pVarZza, Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzc((Throwable) obj);
            }
        }, zzcfy.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return this.zza.zzb();
    }

    public final p8.p zzc(Throwable th) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzdh)).booleanValue()) {
            zzfcs zzfcsVar = this.zza;
            zzcfk zzcfkVar = C6.n.f1857D.f1868h;
            int iZzb = zzfcsVar.zzb();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzb).length() + 22);
            sb2.append("OptionalSignalTimeout:");
            sb2.append(iZzb);
            zzcfkVar.zzh(th, sb2.toString());
        }
        return zzhcf.zza(null);
    }
}
