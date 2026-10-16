package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzegt implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzegt(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzegt zzc(zzini zziniVar, zzini zziniVar2) {
        return new zzegt(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzegs zzb() {
        return new zzegs(((zzcnz) this.zza).zza(), (zzceg) this.zzb.zzb());
    }
}
