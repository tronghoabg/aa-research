package com.google.android.gms.internal.ads;

import D6.C0395s;
import G6.U;
import android.os.Binder;
import android.os.Bundle;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzefn {
    private final ScheduledExecutorService zza;
    private final zzhcp zzb;
    private final zzhcp zzc;
    private final zzegm zzd;
    private final zzimt zze;

    public zzefn(ScheduledExecutorService scheduledExecutorService, zzhcp zzhcpVar, zzhcp zzhcpVar2, zzegm zzegmVar, zzimt zzimtVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzhcpVar;
        this.zzc = zzhcpVar2;
        this.zzd = zzegmVar;
        this.zze = zzimtVar;
    }

    public final p8.p zza(final zzcbk zzcbkVar) {
        p8.p pVarZzc;
        String str = zzcbkVar.zzd;
        U u10 = C6.n.f1857D.f1863c;
        if (U.e(str)) {
            pVarZzc = zzhcf.zzc(new zzegz(1));
        } else {
            pVarZzc = (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziD)).booleanValue() || ((Boolean) zzbli.zza.zze()).booleanValue()) ? this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzefk
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzcbkVar);
                }
            }) : this.zzd.zza(zzcbkVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzhbx) zzhcf.zzh((zzhbx) zzhcf.zzi(zzhbx.zzw(pVarZzc), ((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return this.zza.zzb(zzcbkVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ p8.p zzb(final zzcbk zzcbkVar, int i5, Throwable th) {
        Bundle bundle;
        if (zzcbkVar != null && (bundle = zzcbkVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzhcf.zzj(((zzeiq) this.zze.zzb()).zzk(zzcbkVar, i5), new zzhbn() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return zzhcf.zza(new zzeha((InputStream) obj, zzcbkVar));
            }
        }, this.zzb);
    }

    public final zzeha zzc(zzcbk zzcbkVar) {
        return (zzeha) this.zzd.zza(zzcbkVar).get(((Integer) C0395s.f2489e.f2492c.zzd(zzbix.zzgJ)).intValue(), TimeUnit.SECONDS);
    }
}
