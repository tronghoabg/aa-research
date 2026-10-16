package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzcuh implements zzbpx {
    final /* synthetic */ zzcui zza;

    public zzcuh(zzcui zzcuiVar) {
        Objects.requireNonNull(zzcuiVar);
        this.zza = zzcuiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpx
    public final void zza(Object obj, Map map) {
        zzcui zzcuiVar = this.zza;
        if (zzcuiVar.zze(map)) {
            zzcuiVar.zzf().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcug
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza.zzg().zzm();
                }
            });
        }
    }
}
