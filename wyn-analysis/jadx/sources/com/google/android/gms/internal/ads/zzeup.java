package com.google.android.gms.internal.ads;

import n7.C3597b;
import n7.InterfaceC3596a;

/* loaded from: classes3.dex */
public final class zzeup implements zzfcs {
    private final InterfaceC3596a zza;
    private final zzflg zzb;
    private final long zzc;

    public zzeup(InterfaceC3596a interfaceC3596a, zzflg zzflgVar, long j8) {
        this.zza = interfaceC3596a;
        this.zzb = zzflgVar;
        this.zzc = j8;
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final p8.p zza() {
        InterfaceC3596a interfaceC3596a = this.zza;
        zzflg zzflgVar = this.zzb;
        ((C3597b) interfaceC3596a).getClass();
        return zzhcf.zza(new zzeuq(zzflgVar, System.currentTimeMillis(), this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfcs
    public final int zzb() {
        return 4;
    }
}
