package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgoy implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgoy(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgoy zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgoy(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgfn zzgfnVar = (zzgfn) this.zzb.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.zzc.zzb();
        return zzgfnVar.zza(file, zzggb.zzh(), new zzgti() { // from class: com.google.android.gms.internal.ads.zzgox
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.zzd(20308, (Throwable) obj);
                return zzggb.zzh();
            }
        });
    }
}
