package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;
import q7.BinderC3877b;

/* loaded from: classes4.dex */
final class zzfm extends zzdy.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdk zzd;
    private final /* synthetic */ zzdy.zzd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfm(zzdy.zzd zzdVar, Activity activity, zzdk zzdkVar) {
        super(zzdy.this);
        this.zzc = activity;
        this.zzd = zzdkVar;
        this.zze = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar = zzdy.this.zzj;
        AbstractC1732v.i(zzdjVar);
        zzdjVar.onActivitySaveInstanceState(new BinderC3877b(this.zzc), this.zzd, this.zzb);
    }
}
