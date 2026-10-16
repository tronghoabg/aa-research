package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzglg implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzglg(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzglg zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzglg(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgll((File) this.zza.zzb(), (zzfxl) this.zzb.zzb(), (zzgqo) this.zzc.zzb());
    }
}
