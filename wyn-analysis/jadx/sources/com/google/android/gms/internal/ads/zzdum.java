package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdum implements zzimz {
    private final zzini zza;
    private final zzini zzb;
    private final zzini zzc;

    private zzdum(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
        this.zzc = zziniVar3;
    }

    public static zzdum zza(zzini zziniVar, zzini zziniVar2, zzini zziniVar3) {
        return new zzdum(zziniVar, zziniVar2, zziniVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdul(((zzcys) this.zza).zza(), (zzdpw) this.zzb.zzb(), ((zzdqt) this.zzc).zza());
    }
}
