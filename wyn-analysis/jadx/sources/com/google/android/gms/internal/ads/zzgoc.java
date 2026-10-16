package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgoc implements zzimz {
    private final zzini zza;

    private zzgoc(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgoc zza(zzini zziniVar) {
        return new zzgoc(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pmtd");
    }
}
