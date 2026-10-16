package com.google.android.gms.internal.ads;

import java.io.File;

/* loaded from: classes3.dex */
public final class zzgpb implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgpb(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgpb zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgpb(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgfn zzgfnVar = (zzgfn) this.zzb.zzb();
        final zzgqo zzgqoVar = (zzgqo) this.zzc.zzb();
        return zzgfnVar.zzb(file, new byte[0], new zzgti() { // from class: com.google.android.gms.internal.ads.zzgov
            @Override // com.google.android.gms.internal.ads.zzgti
            public final /* synthetic */ Object apply(Object obj) {
                zzgqoVar.zzd(20310, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
