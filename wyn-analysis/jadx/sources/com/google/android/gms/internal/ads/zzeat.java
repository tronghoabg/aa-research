package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzeat implements zzimz {
    private final zzini zza;
    private final zzini zzb;

    private zzeat(zzini zziniVar, zzini zziniVar2) {
        this.zza = zziniVar;
        this.zzb = zziniVar2;
    }

    public static zzeat zza(zzini zziniVar, zzini zziniVar2) {
        return new zzeat(zziniVar, zziniVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeas((zzeag) this.zza.zzb(), (zzcnq) this.zzb.zzb());
    }
}
