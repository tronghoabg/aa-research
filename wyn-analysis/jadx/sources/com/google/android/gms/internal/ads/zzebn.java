package com.google.android.gms.internal.ads;

import D6.v1;
import D6.x1;
import android.content.Context;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzebn implements zzebc {
    private final long zza;
    private final zzets zzb;

    public zzebn(long j8, Context context, zzebg zzebgVar, zzcnq zzcnqVar, String str) {
        this.zza = j8;
        zzfis zzfisVarZzn = zzcnqVar.zzn();
        zzfisVarZzn.zzd(context);
        zzfisVarZzn.zzb(new x1());
        zzfisVarZzn.zzc(str);
        zzets zzetsVarZza = zzfisVarZzn.zza().zza();
        this.zzb = zzetsVarZza;
        zzetsVarZza.zzdS(new zzebm(this, zzebgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zza(v1 v1Var) {
        this.zzb.zze(v1Var);
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzb() {
        this.zzb.zzR(new BinderC3877b(null));
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzc() {
        this.zzb.zzc();
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }
}
