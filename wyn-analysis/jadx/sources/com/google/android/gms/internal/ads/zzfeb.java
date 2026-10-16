package com.google.android.gms.internal.ads;

import D6.C0395s;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfeb implements zzfcs {
    private final zzcfk zza;
    private final ScheduledExecutorService zzb;
    private final zzhcp zzc;

    public zzfeb(String str, zzbgz zzbgzVar, zzcfk zzcfkVar, ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar) {
        this.zza = zzcfkVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzbio zzbioVar = zzbix.zzdW;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzeb)).booleanValue()) {
                p8.p pVarZza = zzgdd.zza(Tasks.forResult(null), null);
                zzhcp zzhcpVar = this.zzc;
                p8.p pVarZzj = zzhcf.zzj(pVarZza, zzfea.zza, zzhcpVar);
                if (((Boolean) zzbkk.zza.zze()).booleanValue()) {
                    pVarZzj = zzhcf.zzi(pVarZzj, ((Long) zzbkk.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzhcf.zzg(pVarZzj, Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfdz
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.zza.zzc((Exception) obj);
                    }
                }, zzhcpVar);
            }
        }
        return zzhcf.zza(new zzfec(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 43;
    }

    public final /* synthetic */ zzfec zzc(Exception exc) {
        this.zza.zzh(exc, "AppSetIdInfoGmscoreSignal");
        return new zzfec(null, -1);
    }
}
