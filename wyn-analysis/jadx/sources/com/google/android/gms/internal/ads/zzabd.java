package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzabd implements zzabb {
    private final zzabb zza;

    public zzabd(zzabb zzabbVar) {
        this.zza = zzabbVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzabd) {
            return this.zza.equals(((zzabd) obj).zza);
        }
        return false;
    }

    public int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public zzbg zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public zzv zzb(int i5) {
        return this.zza.zzb(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public zzv zzc() {
        return this.zza.zzc();
    }

    public final zzabb zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zzf(int i5) {
        return this.zza.zzf(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzabg
    public final int zzg(int i5) {
        return this.zza.zzg(i5);
    }

    @Override // com.google.android.gms.internal.ads.zzabb
    public final int zzh() {
        return this.zza.zzh();
    }
}
