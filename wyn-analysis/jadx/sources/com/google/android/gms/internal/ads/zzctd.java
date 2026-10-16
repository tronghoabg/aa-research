package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzctd implements zzimz {
    private final zzini zza;

    private zzctd(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzctd zza(zzini zziniVar) {
        return new zzctd(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzctc((Context) this.zza.zzb());
    }
}
