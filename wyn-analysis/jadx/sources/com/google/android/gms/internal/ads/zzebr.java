package com.google.android.gms.internal.ads;

import D6.v1;
import android.content.Context;
import android.os.RemoteException;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class zzebr implements zzebc {
    private final long zza;
    private final zzebg zzb;
    private final zzfke zzc;

    public zzebr(long j8, Context context, zzebg zzebgVar, zzcnq zzcnqVar, String str) {
        this.zza = j8;
        this.zzb = zzebgVar;
        zzfkg zzfkgVarZzq = zzcnqVar.zzq();
        zzfkgVarZzq.zzc(context);
        zzfkgVarZzq.zzb(str);
        this.zzc = zzfkgVarZzq.zza().zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zza(v1 v1Var) {
        try {
            this.zzc.zzc(v1Var, new zzebp(this));
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzb() {
        try {
            zzfke zzfkeVar = this.zzc;
            zzfkeVar.zze(new zzebq(this));
            zzfkeVar.zzb(new BinderC3877b(null));
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzebc
    public final void zzc() {
    }

    public final /* synthetic */ long zzd() {
        return this.zza;
    }

    public final /* synthetic */ zzebg zze() {
        return this.zzb;
    }
}
