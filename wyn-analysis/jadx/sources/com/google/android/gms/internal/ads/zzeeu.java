package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeeu implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeeu(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar3;
        this.zzb = zziniVar4;
    }

    public static zzeeu zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzeeu(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzeet zzb() {
        return new zzeet(zzfoo.zzc(), zzfoi.zzc(), ((zzefh) this.zza).zzb(), zzimy.zzc(this.zzb));
    }
}
