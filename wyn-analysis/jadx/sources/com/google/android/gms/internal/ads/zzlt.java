package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzlt {
    public zzmu zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzlt(zzmu zzmuVar) {
        this.zza = zzmuVar;
    }

    public final void zza(int i5) {
        this.zze = 1 == ((this.zze ? 1 : 0) | i5);
        this.zzb += i5;
    }

    public final void zzb(zzmu zzmuVar) {
        this.zze |= this.zza != zzmuVar;
        this.zza = zzmuVar;
    }

    public final void zzc(int i5) {
        if (this.zzc && this.zzd != 5) {
            zzgtr.zza(i5 == 5);
            return;
        }
        this.zze = true;
        this.zzc = true;
        this.zzd = i5;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zze;
    }
}
