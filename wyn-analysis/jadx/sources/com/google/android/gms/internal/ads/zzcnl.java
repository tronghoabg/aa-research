package com.google.android.gms.internal.ads;

import D6.x1;

/* loaded from: classes3.dex */
public final class zzcnl {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcnl(int i5, int i10, int i11) {
        this.zzc = i5;
        this.zzb = i10;
        this.zza = i11;
    }

    public static zzcnl zza(x1 x1Var) {
        return x1Var.f2533d ? new zzcnl(3, 0, 0) : x1Var.f2538i ? new zzcnl(2, 0, 0) : x1Var.f2537h ? new zzcnl(0, 0, 0) : new zzcnl(1, x1Var.f2535f, x1Var.f2532c);
    }

    public static zzcnl zzb() {
        return new zzcnl(0, 0, 0);
    }

    public static zzcnl zzc(int i5, int i10) {
        return new zzcnl(1, i5, i10);
    }

    public static zzcnl zzd() {
        return new zzcnl(4, 0, 0);
    }

    public static zzcnl zze() {
        return new zzcnl(5, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 2;
    }

    public final boolean zzg() {
        return this.zzc == 3;
    }

    public final boolean zzh() {
        return this.zzc == 0;
    }

    public final boolean zzi() {
        return this.zzc == 4;
    }

    public final boolean zzj() {
        return this.zzc == 5;
    }
}
