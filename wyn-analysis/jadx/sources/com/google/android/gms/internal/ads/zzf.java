package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzf implements zzbb {
    protected final zzbe zza = new zzbe();

    @Override // com.google.android.gms.internal.ads.zzbb
    public final boolean zza() {
        return zzh() == 3 && zzk() && zzi() == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbb
    public final void zzb(long j8) {
        zzc(zzs(), j8, 5, false);
    }

    public abstract void zzc(int i5, long j8, int i10, boolean z2);
}
