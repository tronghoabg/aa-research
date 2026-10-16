package com.google.android.gms.internal.ads;

import G6.C0551o;
import android.content.Context;

/* loaded from: classes3.dex */
final class zzegh implements zzhcc {
    final /* synthetic */ Context zza;

    public zzegh(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final void zza(Throwable th) {
        if (((Boolean) zzbkp.zzh.zze()).booleanValue() && (th instanceof C0551o)) {
            zzbii.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbkp.zzj.zze()).booleanValue()) {
            zzbii.zze(this.zza);
        }
    }
}
