package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzahk implements zzagd {
    private final long zzb;
    private final zzagd zzc;

    public zzahk(long j8, zzagd zzagdVar) {
        this.zzb = j8;
        this.zzc = zzagdVar;
    }

    public final /* synthetic */ long zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final zzahm zzs(int i5, int i10) {
        return this.zzc.zzs(i5, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzv() {
        this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzagd
    public final void zzw(zzahd zzahdVar) {
        this.zzc.zzw(new zzahj(this, zzahdVar, zzahdVar));
    }
}
