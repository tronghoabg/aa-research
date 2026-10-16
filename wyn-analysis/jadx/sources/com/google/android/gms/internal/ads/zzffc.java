package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzffc implements zzimz {
    private final zzfex zza;

    private zzffc(zzfex zzfexVar) {
        this.zza = zzfexVar;
    }

    public static zzffc zzc(zzfex zzfexVar) {
        return new zzffc(zzfexVar);
    }

    public static String zzd(zzfex zzfexVar) {
        String strZze = zzfexVar.zze();
        zzinh.zzb(strZze);
        return strZze;
    }

    public final String zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
