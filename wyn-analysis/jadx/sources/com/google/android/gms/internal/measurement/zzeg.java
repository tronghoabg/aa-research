package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;

/* loaded from: classes4.dex */
final class zzeg extends zzdy.zza {
    private final /* synthetic */ Boolean zzc;
    private final /* synthetic */ zzdy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeg(zzdy zzdyVar, Boolean bool) {
        super(zzdyVar);
        this.zzc = bool;
        this.zzd = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        if (this.zzc != null) {
            zzdj zzdjVar = this.zzd.zzj;
            AbstractC1732v.i(zzdjVar);
            zzdjVar.setMeasurementEnabled(this.zzc.booleanValue(), this.zza);
        } else {
            zzdj zzdjVar2 = this.zzd.zzj;
            AbstractC1732v.i(zzdjVar2);
            zzdjVar2.clearMeasurementEnabled(this.zza);
        }
    }
}
