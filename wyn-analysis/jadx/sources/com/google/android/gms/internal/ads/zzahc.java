package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzahc implements zzahd {
    private final long zza;
    private final zzahb zzb;

    public zzahc(long j8, long j10) {
        this.zza = j8;
        zzahe zzaheVar = j10 == 0 ? zzahe.zza : new zzahe(0L, j10);
        this.zzb = new zzahb(zzaheVar, zzaheVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final zzahb zzc(long j8) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahd
    public final /* synthetic */ boolean zzj() {
        return AbstractC1744h.a(this);
    }
}
