package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.content.Context;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zzefs implements zzegy {
    private static final Pattern zzh = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzeet zza;
    private final zzhcp zzb;
    private final zzflg zzc;
    private final ScheduledExecutorService zzd;
    private final zzejl zze;
    private final zzfqq zzf;
    private final Context zzg;

    public zzefs(Context context, zzflg zzflgVar, zzeet zzeetVar, zzhcp zzhcpVar, ScheduledExecutorService scheduledExecutorService, zzejl zzejlVar, zzfqq zzfqqVar) {
        this.zzg = context;
        this.zzc = zzflgVar;
        this.zza = zzeetVar;
        this.zzb = zzhcpVar;
        this.zzd = scheduledExecutorService;
        this.zze = zzejlVar;
        this.zzf = zzfqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzegy
    public final p8.p zza(zzcbk zzcbkVar) {
        Context context = this.zzg;
        p8.p pVarZza = this.zza.zza(zzcbkVar);
        zzfqg zzfqgVarA = u.a(context, 11);
        zzfqp.zzb(pVarZza, zzfqgVarA);
        p8.p pVarZzj = zzhcf.zzj(pVarZza, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefr
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzb((zzeha) obj);
            }
        }, this.zzb);
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzgI)).booleanValue()) {
            pVarZzj = zzhcf.zzh(zzhcf.zzi(pVarZzj, ((Integer) r2.f2492c.zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS, this.zzd), TimeoutException.class, zzefq.zza, zzcfy.zzh);
        }
        zzfqp.zzd(pVarZzj, this.zzf, zzfqgVarA);
        zzhcf.zzr(pVarZzj, new zzefp(this), zzcfy.zzh);
        return pVarZzj;
    }

    public final /* synthetic */ p8.p zzb(zzeha zzehaVar) {
        return zzhcf.zza(new zzfky(new zzfkv(this.zzc), zzfkx.zza(new InputStreamReader(zzehaVar.zza()), zzehaVar.zzb().zzm)));
    }

    public final /* synthetic */ zzejl zzc() {
        return this.zze;
    }
}
