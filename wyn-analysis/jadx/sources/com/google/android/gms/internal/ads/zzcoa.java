package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class zzcoa implements zzimz {
    private final zzcns zza;

    private zzcoa(zzcns zzcnsVar) {
        this.zza = zzcnsVar;
    }

    public static zzcoa zzc(zzcns zzcnsVar) {
        return new zzcoa(zzcnsVar);
    }

    public static WeakReference zzd(zzcns zzcnsVar) {
        WeakReference weakReferenceZzc = zzcnsVar.zzc();
        zzinh.zzb(weakReferenceZzc);
        return weakReferenceZzc;
    }

    public final WeakReference zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
