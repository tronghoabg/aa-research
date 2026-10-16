package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgoz implements zzimz {
    private final zzini zza;

    private zzgoz(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgoz zza(zzini zziniVar) {
        return new zzgoz(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "ocs"), "pmtd");
    }
}
