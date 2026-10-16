package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzdlk {
    private final List zza;
    private final zzfsm zzb;
    private final H6.q zzc;
    private boolean zzd;

    public zzdlk(zzfkn zzfknVar, zzfsm zzfsmVar) {
        this.zza = zzfknVar.zzp;
        this.zzb = zzfsmVar;
        this.zzc = zzfknVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
