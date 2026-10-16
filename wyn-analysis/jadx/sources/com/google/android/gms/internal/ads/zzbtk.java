package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbtk implements zzcgh {
    final /* synthetic */ zzbua zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzbub zzc;

    public zzbtk(zzbub zzbubVar, zzbua zzbuaVar, zzfqg zzfqgVar) {
        this.zza = zzbuaVar;
        this.zzb = zzfqgVar;
        Objects.requireNonNull(zzbubVar);
        this.zzc = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        G6.L.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbub zzbubVar = this.zzc;
        synchronized (zzbubVar.zzg()) {
            try {
                G6.L.k("loadNewJavascriptEngine (success): Lock acquired");
                zzbubVar.zzl(0);
                if (zzbubVar.zzi() != null && this.zza != zzbubVar.zzi()) {
                    G6.L.k("New JS engine is loaded, marking previous one as destroyable.");
                    zzbubVar.zzi().zzc();
                }
                zzbubVar.zzj(this.zza);
                if (((Boolean) zzbkq.zzd.zze()).booleanValue() && zzbubVar.zzh() != null) {
                    zzfqt zzfqtVarZzh = zzbubVar.zzh();
                    zzfqg zzfqgVar = this.zzb;
                    zzfqgVar.zzd(true);
                    zzfqtVarZzh.zzb(zzfqgVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.L.k("loadNewJavascriptEngine (success): Lock released");
    }
}
