package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgnz implements zzimz {
    private final zzini zza;

    private zzgnz(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgnz zza(zzini zziniVar) {
        return new zzgnz(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcam.jar.d");
    }
}
