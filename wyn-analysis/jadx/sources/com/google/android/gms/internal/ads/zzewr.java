package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzewr implements zzfcq {
    public final int zza;
    public final boolean zzb;
    public final boolean zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final float zzi;
    public final boolean zzj;
    public final boolean zzk;

    public zzewr(int i5, boolean z2, boolean z10, int i10, int i11, int i12, int i13, int i14, float f10, boolean z11, boolean z12) {
        this.zza = i5;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = i12;
        this.zzg = i13;
        this.zzh = i14;
        this.zzi = f10;
        this.zzj = z11;
        this.zzk = z12;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzmE)).booleanValue()) {
            bundle.putInt("muv_min", this.zze);
            bundle.putInt("muv_max", this.zzf);
        }
        bundle.putFloat("android_app_volume", this.zzi);
        bundle.putBoolean("android_app_muted", this.zzj);
        if (this.zzk) {
            return;
        }
        bundle.putInt("am", this.zza);
        bundle.putBoolean("ma", this.zzb);
        bundle.putBoolean("sp", this.zzc);
        bundle.putInt("muv", this.zzd);
        bundle.putInt("rm", this.zzg);
        bundle.putInt("riv", this.zzh);
    }
}
