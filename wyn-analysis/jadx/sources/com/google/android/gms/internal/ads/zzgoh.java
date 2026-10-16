package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgoh implements zzimz {
    private final zzini zza;

    private zzgoh(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgoh zza(zzini zziniVar) {
        return new zzgoh(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File(new File((File) this.zza.zzb(), "drgd"), "v"), "pcam.jar");
    }
}
