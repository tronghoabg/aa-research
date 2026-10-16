package com.google.android.gms.internal.ads;

import D6.C0395s;

/* loaded from: classes3.dex */
public final class zzfoe implements zzimz {
    public static zzfoe zza() {
        return zzfod.zza;
    }

    public static zzhcp zzc() {
        zzhcp zzhcpVar;
        zzbio zzbioVar = zzbix.zzgQ;
        C0395s c0395s = C0395s.f2489e;
        if (((Boolean) c0395s.f2492c.zzd(zzbioVar)).booleanValue()) {
            zzhcpVar = zzcfy.zzc;
        } else {
            zzhcpVar = ((Boolean) c0395s.f2492c.zzd(zzbix.zzgP)).booleanValue() ? zzcfy.zza : zzcfy.zzf;
        }
        zzinh.zzb(zzhcpVar);
        return zzhcpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzino, com.google.android.gms.internal.ads.zzinn
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
