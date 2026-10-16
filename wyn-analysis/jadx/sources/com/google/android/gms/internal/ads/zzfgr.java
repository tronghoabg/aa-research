package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzfgr implements zzetz {
    final /* synthetic */ zzfgu zza;

    public zzfgr(zzfgu zzfguVar) {
        Objects.requireNonNull(zzfguVar);
        this.zza = zzfguVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzfgu zzfguVar = this.zza;
        synchronized (zzfguVar) {
            zzfguVar.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvm zzcvmVar = (zzcvm) obj;
        zzfgu zzfguVar = this.zza;
        synchronized (zzfguVar) {
            try {
                zzcvm zzcvmVar2 = zzfguVar.zza;
                if (zzcvmVar2 != null) {
                    zzcvmVar2.zzd();
                }
                zzfguVar.zza = zzcvmVar;
                zzcvmVar.zza(zzfguVar);
                zzfguVar.zzO().zzt(new zzcvn(zzcvmVar, zzfguVar, zzfguVar.zzO(), zzfguVar.zzV()));
                zzcvmVar.zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
