package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzbal implements zzfyo {
    final /* synthetic */ zzfxq zza;

    public zzbal(zzfxq zzfxqVar) {
        this.zza = zzfxqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public final void zza(int i5, long j8) {
        this.zza.zzb(i5, System.currentTimeMillis() - j8);
    }

    @Override // com.google.android.gms.internal.ads.zzfyo
    public final void zzb(int i5, long j8, String str) {
        this.zza.zzf(i5, System.currentTimeMillis() - j8, str);
    }
}
