package com.google.android.gms.internal.ads;

import D6.C0395s;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class zzfai implements zzfcq {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzfai(String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        this.zza = str;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = z11;
        this.zze = z12;
    }

    @Override // com.google.android.gms.internal.ads.zzfcq
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z2 = this.zzb;
        bundle.putInt("test_mode", z2 ? 1 : 0);
        boolean z10 = this.zzc;
        bundle.putInt("linked_device", z10 ? 1 : 0);
        if (z2 || z10) {
            zzbio zzbioVar = zzbix.zzkL;
            C0395s c0395s = C0395s.f2489e;
            if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) c0395s.f2492c.zzd(zzbix.zzkP)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
