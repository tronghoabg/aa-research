package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes3.dex */
final class zzdbx implements zzden, zzddu {
    private final zzfkn zza;

    public zzdbx(Context context, zzfkn zzfknVar, zzbzn zzbznVar) {
        this.zza = zzfknVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzc(Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzden
    public final void zzg() {
        zzbzo zzbzoVar = this.zza.zzad;
        if (zzbzoVar == null || !zzbzoVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str = zzbzoVar.zzb;
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(str);
    }
}
