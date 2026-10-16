package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzevp implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzevp(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        this.zza = zziniVar2;
        this.zzb = zziniVar3;
        this.zzc = zziniVar4;
    }

    public static zzevp zzc(zzini zziniVar, zzini zziniVar2, zzini zziniVar3, zzini zziniVar4) {
        return new zzevp(zziniVar, zziniVar2, zziniVar3, zziniVar4);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzevk zzb() {
        return new zzevk(zzfoi.zzc(), (zzdxk) this.zza.zzb(), (zzece) this.zzb.zzb(), (zzevm) this.zzc.zzb());
    }
}
