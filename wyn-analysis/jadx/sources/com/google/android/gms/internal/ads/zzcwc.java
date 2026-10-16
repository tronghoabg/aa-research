package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzcwc implements zzimz {
    private final zzcvz zza;

    private zzcwc(zzcvz zzcvzVar) {
        this.zza = zzcvzVar;
    }

    public static zzcwc zzc(zzcvz zzcvzVar) {
        return new zzcwc(zzcvzVar);
    }

    public static zzfko zzd(zzcvz zzcvzVar) {
        zzfko zzfkoVarZzd = zzcvzVar.zzd();
        zzinh.zzb(zzfkoVarZzd);
        return zzfkoVarZzd;
    }

    public final zzfko zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
