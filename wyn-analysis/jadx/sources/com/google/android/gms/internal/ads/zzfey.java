package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfey implements zzimz {
    private final zzfex zza;

    private zzfey(zzfex zzfexVar) {
        this.zza = zzfexVar;
    }

    public static zzfey zzc(zzfex zzfexVar) {
        return new zzfey(zzfexVar);
    }

    public static String zzd(zzfex zzfexVar) {
        String strZza = zzfexVar.zza();
        zzinh.zzb(strZza);
        return strZza;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
