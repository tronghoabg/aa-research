package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcyp {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final p8.p zzc;
    private volatile boolean zzd = true;

    public zzcyp(Executor executor, ScheduledExecutorService scheduledExecutorService, p8.p pVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = pVar;
    }

    public final void zza(zzhcc zzhccVar) {
        zzhcf.zzr(this.zzc, new zzcyj(this, zzhccVar), this.zza);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    public final /* synthetic */ p8.p zzc(zzhcc zzhccVar, p8.p pVar, zzcya zzcyaVar) {
        if (zzcyaVar != null) {
            zzhccVar.zzb(zzcyaVar);
        }
        return zzhcf.zzi(pVar, ((Long) zzbll.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final /* synthetic */ void zze(List list, final zzhcc zzhccVar) {
        if (list == null || list.isEmpty()) {
            this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyo
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzhccVar.zza(new zzeel(3));
                }
            });
            return;
        }
        p8.p pVarZza = zzhcf.zza(null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final p8.p pVar = (p8.p) it.next();
            zzhbn zzhbnVar = new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcyl
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ p8.p zza(Object obj) {
                    zzhccVar.zza((Throwable) obj);
                    return zzhcf.zza(null);
                }
            };
            Executor executor = this.zza;
            pVarZza = zzhcf.zzj(zzhcf.zzh(pVarZza, Throwable.class, zzhbnVar, executor), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzcym
                @Override // com.google.android.gms.internal.ads.zzhbn
                public final /* synthetic */ p8.p zza(Object obj) {
                    return this.zza.zzc(zzhccVar, pVar, (zzcya) obj);
                }
            }, executor);
        }
        zzhcf.zzr(pVarZza, new zzcyk(this, zzhccVar), this.zza);
    }

    public final /* synthetic */ void zzf() {
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcyn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd();
            }
        });
    }
}
