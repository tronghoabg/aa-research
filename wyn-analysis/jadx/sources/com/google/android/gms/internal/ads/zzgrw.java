package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class zzgrw extends zzgqu {
    final /* synthetic */ zzgry zza;
    private final zzgsd zzb;

    public zzgrw(zzgry zzgryVar, zzgsd zzgsdVar) {
        Objects.requireNonNull(zzgryVar);
        this.zza = zzgryVar;
        this.zzb = zzgsdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqv
    public final void zzb(Bundle bundle) {
        int i5 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i10 = bundle.getInt("uiMode", 0);
        zzgsb zzgsbVarZze = zzgsc.zze();
        zzgsbVarZze.zza(i5);
        if (string != null) {
            zzgsbVarZze.zzb(string);
        }
        zzgsbVarZze.zzc(i10);
        if (bundle.containsKey("userInteracted")) {
            zzgsbVarZze.zzd(Boolean.valueOf(bundle.getBoolean("userInteracted")));
        }
        this.zzb.zza(zzgsbVarZze.zze());
        if (i5 == 8157) {
            this.zza.zzd();
        }
    }
}
