package com.google.android.gms.internal.ads;

import D6.K0;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzctu implements zzddc {
    private final zzfkq zza;
    private final zzfky zzb;
    private final zzfsi zzc;
    private final zzfsm zzd;

    public zzctu(zzfky zzfkyVar, zzfsm zzfsmVar, zzfsi zzfsiVar) {
        this.zzb = zzfkyVar;
        this.zzd = zzfsmVar;
        this.zzc = zzfsiVar;
        this.zza = zzfkyVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final void zzdJ(K0 k02) {
        List list = this.zza.zza;
        this.zzd.zza(this.zzc.zza(this.zzb, null, list), null);
    }
}
