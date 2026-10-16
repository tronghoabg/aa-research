package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzesn implements zzetz {
    final /* synthetic */ zzeso zza;

    public zzesn(zzeso zzesoVar) {
        Objects.requireNonNull(zzesoVar);
        this.zza = zzesoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final void zza() {
        zzeso zzesoVar = this.zza;
        synchronized (zzesoVar) {
            zzesoVar.zzN(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeso zzesoVar = this.zza;
        zzcvs zzcvsVar = (zzcvs) obj;
        synchronized (zzesoVar) {
            try {
                if (zzesoVar.zzM() != null) {
                    if (zzcvsVar.zzo() != null && zzesoVar.zzM().zzo() != null) {
                        zzcvsVar.zzo().zzb(zzesoVar.zzM().zzo().zza());
                    }
                    zzesoVar.zzM().zzd();
                }
                zzesoVar.zzN(zzcvsVar);
                zzesoVar.zzM().zzj();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
