package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;
import q7.BinderC3877b;

/* loaded from: classes4.dex */
final class zzed extends zzdy.zza {
    private final /* synthetic */ Activity zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ zzdy zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzed(zzdy zzdyVar, Activity activity, String str, String str2) {
        super(zzdyVar);
        this.zzc = activity;
        this.zzd = str;
        this.zze = str2;
        this.zzf = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar = this.zzf.zzj;
        AbstractC1732v.i(zzdjVar);
        zzdjVar.setCurrentScreen(new BinderC3877b(this.zzc), this.zzd, this.zze, this.zza);
    }
}
