package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzbtz implements zzcgh {
    final /* synthetic */ zzbua zza;

    public zzbtz(zzbua zzbuaVar) {
        Objects.requireNonNull(zzbuaVar);
        this.zza = zzbuaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcgh
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzbsw zzbswVar = (zzbsw) obj;
        zzcfy.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbty
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                G6.L.k("maybeDestroy > Destroying engine.");
                zzbsw zzbswVar2 = zzbswVar;
                zzbswVar2.zzn("/result", zzbpw.zzo);
                zzbswVar2.zzj();
            }
        });
    }
}
