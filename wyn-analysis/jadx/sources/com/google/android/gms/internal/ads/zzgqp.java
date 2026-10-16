package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzgqp implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzgqp(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzgqp zza(zzini zziniVar, zzini zziniVar2) {
        return new zzgqp(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzgqo((zzgcy) this.zza.zzb(), (zzgfs) this.zzb.zzb());
    }
}
