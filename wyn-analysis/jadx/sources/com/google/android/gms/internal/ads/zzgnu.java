package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgnu implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzgnu(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzgnu zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzgnu(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzini zziniVar = this.zzc;
        zzini zziniVar2 = this.zzb;
        zzimt zzimtVarZzc = zzimy.zzc(this.zza);
        zzimt zzimtVarZzc2 = zzimy.zzc(zziniVar2);
        if (true == ((zzgdq) zziniVar.zzb()).zzu()) {
            zzimtVarZzc = zzimtVarZzc2;
        }
        zzgnh zzgnhVar = (zzgnh) zzimtVarZzc.zzb();
        zzinh.zzb(zzgnhVar);
        return zzgnhVar;
    }
}
