package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;
import q7.BinderC3877b;

/* loaded from: classes4.dex */
final class zzfl extends zzdy.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ zzdy.zzd zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfl(zzdy.zzd zzdVar, Activity activity) {
        super(zzdy.this);
        this.zzc = activity;
        this.zzd = zzdVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar = zzdy.this.zzj;
        AbstractC1732v.i(zzdjVar);
        zzdjVar.onActivityDestroyed(new BinderC3877b(this.zzc), this.zzb);
    }
}
