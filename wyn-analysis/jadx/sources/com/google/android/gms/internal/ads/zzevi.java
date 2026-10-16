package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzevi implements zzimz {
    private final zzini zza;

    private zzevi(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzevi zza(zzini zziniVar) {
        return new zzevi(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevh((Set) this.zza.zzb());
    }
}
