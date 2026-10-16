package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzxy extends zzabd {
    private final zzbg zza;

    public zzxy(zzabb zzabbVar, zzbg zzbgVar) {
        super(zzabbVar);
        this.zza = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof zzxy)) {
            return this.zza.equals(((zzxy) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzabd
    public final int hashCode() {
        return this.zza.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabg
    public final zzbg zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabg
    public final zzv zzb(int i5) {
        return this.zza.zza(zzd().zzf(i5));
    }

    @Override // com.google.android.gms.internal.ads.zzabd, com.google.android.gms.internal.ads.zzabb
    public final zzv zzc() {
        return this.zza.zza(zzd().zzh());
    }
}
