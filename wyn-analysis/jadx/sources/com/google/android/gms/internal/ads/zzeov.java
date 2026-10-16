package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzeov {
    private final Context zza;
    private final zzfqq zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzcyd zze;
    private final zzepl zzf;
    private final zzfsi zzg;
    private final zzhcy zzh = zzhcy.zze();
    private final AtomicBoolean zzi = new AtomicBoolean();
    private zzeow zzj;
    private zzfky zzk;

    public zzeov(Context context, zzfqq zzfqqVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzcyd zzcydVar, zzepl zzeplVar, zzfsi zzfsiVar) {
        this.zza = context;
        this.zzb = zzfqqVar;
        this.zzc = executor;
        this.zzd = scheduledExecutorService;
        this.zze = zzcydVar;
        this.zzf = zzeplVar;
        this.zzg = zzfsiVar;
    }

    private final synchronized p8.p zzd(zzfkn zzfknVar) {
        Iterator it = zzfknVar.zza.iterator();
        while (it.hasNext()) {
            zzema zzemaVarZza = this.zze.zza(zzfknVar.zzb, (String) it.next());
            if (zzemaVarZza != null && zzemaVarZza.zza(this.zzk, zzfknVar)) {
                p8.p pVarZzi = zzhcf.zzi(zzemaVarZza.zzb(this.zzk, zzfknVar), zzfknVar.zzR, TimeUnit.MILLISECONDS, this.zzd);
                if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzkr)).booleanValue()) {
                    zzfqg zzfqgVarA = u.a(this.zza, 12);
                    zzfqgVarA.zzi(zzfknVar.zzE);
                    zzfqgVarA.zza();
                    zzfqp.zzd(pVarZzi, this.zzb, zzfqgVarA);
                }
                return pVarZzi;
            }
        }
        return zzhcf.zzc(new zzeel(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzb(zzfkn zzfknVar) {
        p8.p pVarZzd = zzd(zzfknVar);
        this.zzf.zze(this.zzk, zzfknVar, pVarZzd, this.zzg);
        zzhcf.zzr(pVarZzd, new zzeou(this, zzfknVar), this.zzc);
    }

    public final synchronized p8.p zza(zzfky zzfkyVar) {
        try {
            if (!this.zzi.getAndSet(true)) {
                List list = zzfkyVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzh.zzb(new zzepp(3, zzeps.zzb(zzfkyVar)));
                } else {
                    this.zzk = zzfkyVar;
                    zzepl zzeplVar = this.zzf;
                    this.zzj = new zzeow(zzfkyVar, zzeplVar, this.zzh);
                    zzeplVar.zzc(list);
                    zzfkn zzfknVarZza = this.zzj.zza();
                    while (zzfknVarZza != null) {
                        zzb(zzfknVarZza);
                        zzfknVarZza = this.zzj.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzh;
    }

    public final /* synthetic */ zzeow zzc() {
        return this.zzj;
    }
}
