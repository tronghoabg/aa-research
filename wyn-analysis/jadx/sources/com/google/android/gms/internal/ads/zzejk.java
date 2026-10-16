package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzejk implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzejk(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzejk zza(zzini zziniVar, zzini zziniVar2) {
        return new zzejk(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzejj(((zzejv) this.zza).zzb(), ((zzcnt) this.zzb).zzb());
    }
}
