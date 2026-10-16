package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgki implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;
    private final zzini zzd;

    private zzgki(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
        this.zzd = zziniVar4;
    }

    public static zzgki zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzgki(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzini zziniVar = this.zzd;
        zzini zziniVar2 = this.zzc;
        zzini zziniVar3 = this.zzb;
        zzimt zzimtVarZzc = zzimy.zzc(this.zza);
        zzimt zzimtVarZzc2 = zzimy.zzc(zziniVar3);
        zzimt zzimtVarZzc3 = zzimy.zzc(zziniVar2);
        zzgdq zzgdqVar = (zzgdq) zziniVar.zzb();
        return new zzgkh(zzimtVarZzc, zzimtVarZzc2, zzimtVarZzc3, zzgdqVar.zzk().zza(), zzgdqVar.zzk().zzd());
    }
}
