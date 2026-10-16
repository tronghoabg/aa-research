package com.google.android.gms.internal.ads;

import D6.C0395s;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzffh implements zzfcs {
    private final zzcfk zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzhcp zzd;
    private final int zze;

    public zzffh(zzcfk zzcfkVar, boolean z2, zzcfa zzcfaVar, zzhcp zzhcpVar, String str, ScheduledExecutorService scheduledExecutorService, int i5) {
        this.zza = zzcfkVar;
        this.zzb = z2;
        this.zzd = zzhcpVar;
        this.zzc = scheduledExecutorService;
        this.zze = i5;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzbio zzbioVar = zzbix.zzid;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue() && this.zzb) {
            return zzhcf.zza(new zzffi(null));
        }
        if (!Arrays.asList(((String) c0395s.f2492c.zzd(zzbix.zzif)).split(",")).contains(String.valueOf(this.zze))) {
            return zzhcf.zza(new zzffi(null));
        }
        p8.p pVarZza = zzhcf.zza(null);
        zzhcp zzhcpVar = this.zzd;
        return zzhcf.zzg(zzhcf.zzi(zzhcf.zzk(pVarZza, zzffg.zza, zzhcpVar), ((Long) zzblm.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzfff
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((Exception) obj);
            }
        }, zzhcpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 50;
    }

    public final /* synthetic */ zzffi zzc(Exception exc) {
        this.zza.zzh(exc, "TrustlessTokenSignal");
        return new zzffi(null);
    }
}
