package com.google.android.gms.internal.ads;

import Va.M6;

/* loaded from: classes3.dex */
final /* synthetic */ class zzu implements zzgti {
    static final /* synthetic */ zzu zza = new zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* synthetic */ Object apply(Object obj) {
        zzx zzxVar = (zzx) obj;
        int i5 = zzv.zzQ;
        String str = zzxVar.zza;
        String str2 = zzxVar.zzb;
        return M6.t(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
    }
}
