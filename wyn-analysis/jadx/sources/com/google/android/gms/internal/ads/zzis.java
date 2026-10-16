package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public class zzis {
    private int zza;

    public void zza() {
        this.zza = 0;
    }

    public final boolean zzb() {
        return zzi(4);
    }

    public final boolean zzc() {
        return zzi(1);
    }

    public final boolean zzd() {
        return zzi(536870912);
    }

    public final boolean zze() {
        return zzi(268435456);
    }

    public final boolean zzf() {
        return zzi(67108864);
    }

    public final void zzg(int i5) {
        this.zza = i5;
    }

    public final void zzh(int i5) {
        this.zza |= 536870912;
    }

    public final boolean zzi(int i5) {
        return (this.zza & i5) == i5;
    }
}
