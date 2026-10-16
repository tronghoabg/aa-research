package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzfpj {
    final /* synthetic */ zzfpk zza;
    private final Object zzb;
    private final String zzc;
    private final p8.p zzd;
    private final List zze;
    private final p8.p zzf;

    public /* synthetic */ zzfpj(zzfpk zzfpkVar, Object obj, String str, p8.p pVar, List list, p8.p pVar2, byte[] bArr) {
        this(zzfpkVar, obj, null, pVar, list, pVar2);
    }

    public final zzfpj zza(String str) {
        return new zzfpj(this.zza, this.zzb, str, this.zzd, this.zze, this.zzf);
    }

    public final zzfpj zzb(final zzfos zzfosVar) {
        return zzc(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfpi
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return zzhcf.zza(zzfosVar.zza(obj));
            }
        });
    }

    public final zzfpj zzc(zzhbn zzhbnVar) {
        return zzd(zzhbnVar, this.zza.zze());
    }

    public final zzfpj zzd(zzhbn zzhbnVar, Executor executor) {
        return new zzfpj(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzhcf.zzj(this.zzf, zzhbnVar, executor));
    }

    public final zzfpj zze(final p8.p pVar) {
        return zzd(new zzhbn() { // from class: com.google.android.gms.internal.ads.zzfpf
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return pVar;
            }
        }, zzcfy.zzh);
    }

    public final zzfpj zzf(Class cls, final zzfos zzfosVar) {
        return zzg(cls, new zzhbn(zzfosVar) { // from class: com.google.android.gms.internal.ads.zzfpg
            @Override // com.google.android.gms.internal.ads.zzhbn
            public final /* synthetic */ p8.p zza(Object obj) {
                return zzhcf.zza("");
            }
        });
    }

    public final zzfpj zzg(Class cls, zzhbn zzhbnVar) {
        zzfpk zzfpkVar = this.zza;
        zzhcp zzhcpVarZze = zzfpkVar.zze();
        return new zzfpj(zzfpkVar, this.zzb, this.zzc, this.zzd, this.zze, zzhcf.zzh(this.zzf, cls, zzhbnVar, zzhcpVarZze));
    }

    public final zzfpj zzh(long j8, TimeUnit timeUnit) {
        zzfpk zzfpkVar = this.zza;
        ScheduledExecutorService scheduledExecutorServiceZzf = zzfpkVar.zzf();
        return new zzfpj(zzfpkVar, this.zzb, this.zzc, this.zzd, this.zze, zzhcf.zzi(this.zzf, j8, timeUnit, scheduledExecutorServiceZzf));
    }

    public final zzfoz zzi() {
        Object obj = this.zzb;
        String strZzc = this.zzc;
        if (strZzc == null) {
            strZzc = this.zza.zzc(obj);
        }
        final zzfoz zzfozVar = new zzfoz(obj, strZzc, this.zzf);
        this.zza.zzg().zza(zzfozVar);
        p8.p pVar = this.zzd;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfph
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zza.zzg().zzb(zzfozVar);
            }
        };
        zzhcp zzhcpVar = zzcfy.zzh;
        pVar.addListener(runnable, zzhcpVar);
        zzhcf.zzr(zzfozVar, new zzfpe(this, zzfozVar), zzhcpVar);
        return zzfozVar;
    }

    public final zzfpj zzj(Object obj) {
        return this.zza.zza(obj, zzi());
    }

    private zzfpj(zzfpk zzfpkVar, Object obj, String str, p8.p pVar, List list, p8.p pVar2) {
        Objects.requireNonNull(zzfpkVar);
        this.zza = zzfpkVar;
        this.zzb = obj;
        this.zzc = str;
        this.zzd = pVar;
        this.zze = list;
        this.zzf = pVar2;
    }
}
