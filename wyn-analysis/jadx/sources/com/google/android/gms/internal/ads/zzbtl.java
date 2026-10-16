package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbtl implements zzcgf {
    final /* synthetic */ zzbua zza;
    final /* synthetic */ zzfqg zzb;
    final /* synthetic */ zzbub zzc;

    public zzbtl(zzbub zzbubVar, zzbua zzbuaVar, zzfqg zzfqgVar) {
        this.zza = zzbuaVar;
        this.zzb = zzfqgVar;
        Objects.requireNonNull(zzbubVar);
        this.zzc = zzbubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgf
    public final void zza() {
        G6.L.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbub zzbubVar = this.zzc;
        synchronized (zzbubVar.zzg()) {
            try {
                G6.L.k("loadNewJavascriptEngine (failure): Lock acquired");
                zzbubVar.zzl(1);
                G6.L.k("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbkq.zzd.zze()).booleanValue() && zzbubVar.zzh() != null) {
                    zzfqt zzfqtVarZzh = zzbubVar.zzh();
                    zzfqg zzfqgVar = this.zzb;
                    zzfqgVar.zzk("Failed loading new engine");
                    zzfqgVar.zzd(false);
                    zzfqtVarZzh.zzb(zzfqgVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        G6.L.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
