package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdy;

/* loaded from: classes4.dex */
final class zzfb extends zzdy.zza {
    private final /* synthetic */ Intent zzc;
    private final /* synthetic */ zzdy zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfb(zzdy zzdyVar, Intent intent) {
        super(zzdyVar);
        this.zzc = intent;
        this.zzd = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() throws RemoteException {
        zzdj zzdjVar = this.zzd.zzj;
        AbstractC1732v.i(zzdjVar);
        zzdjVar.setSgtmDebugInfo(this.zzc);
    }
}
