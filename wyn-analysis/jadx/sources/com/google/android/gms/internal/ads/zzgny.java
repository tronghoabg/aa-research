package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgny implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgny(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgny zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgny(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgfn zzgfnVar = (zzgfn) this.zzb.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.zzc.zzb();
        return zzgfnVar.zzb(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgnq
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.zzd(15310, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
