package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgnx implements zzimz {
    private final zzini zza;

    private zzgnx(zzini zziniVar) {
        this.zza = zziniVar;
    }

    public static zzgnx zza(zzini zziniVar) {
        return new zzgnx(zziniVar);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new File(new File((File) this.zza.zzb(), "drgd"), "pcbc.d");
    }
}
