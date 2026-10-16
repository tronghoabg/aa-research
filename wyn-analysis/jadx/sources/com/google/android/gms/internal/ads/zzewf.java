package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzewf implements zzfcs {
    final zzcfk zza;
    AppSetIdClient zzb;
    private final ScheduledExecutorService zzc;
    private final zzhcp zzd;
    private final Context zze;

    public zzewf(Context context, zzcfk zzcfkVar, ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar) {
        if (!((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzea)).booleanValue()) {
            this.zzb = AppSet.getClient(context);
        }
        this.zze = context;
        this.zza = zzcfkVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        zzbio zzbioVar = zzbix.zzdW;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzeb)).booleanValue()) {
                if (!((Boolean) c0395s.f2492c.zzd(zzbix.zzdX)).booleanValue()) {
                    return zzhcf.zzk(zzgdd.zza(this.zzb.getAppSetIdInfo(), null), zzewe.zza, zzcfy.zzh);
                }
                Task<AppSetIdInfo> taskZzb = ((Boolean) c0395s.f2492c.zzd(zzbix.zzea)).booleanValue() ? zzfml.zzb(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZzb == null) {
                    return zzhcf.zza(new zzewg(null, -1));
                }
                p8.p pVarZzj = zzhcf.zzj(zzgdd.zza(taskZzb, null), zzewc.zza, zzcfy.zzh);
                if (((Boolean) c0395s.f2492c.zzd(zzbix.zzdY)).booleanValue()) {
                    pVarZzj = zzhcf.zzi(pVarZzj, ((Long) c0395s.f2492c.zzd(zzbix.zzdZ)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzhcf.zzg(pVarZzj, Exception.class, new zzgti() { // from class: com.google.android.gms.internal.ads.zzewd
                    @Override // com.google.android.gms.internal.ads.zzgti
                    public final /* synthetic */ Object apply(Object obj) {
                        this.zza.zza.zzh((Exception) obj, "AppSetIdInfoSignal");
                        return new zzewg(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzhcf.zza(new zzewg(null, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 11;
    }
}
