package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzftm implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzftm(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzftm zza(zzini zziniVar, zzini zziniVar2) {
        return new zzftm(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzftl((zzftr) this.zza.zzb(), (zzftc) this.zzb.zzb());
    }
}
