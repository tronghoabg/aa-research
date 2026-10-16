package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.o;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class zzas extends zzba {
    final /* synthetic */ C1703q zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzas(zzbb zzbbVar, o oVar, C1703q c1703q, LocationRequest locationRequest) {
        super(oVar);
        this.zza = c1703q;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzdz) bVar).zzt(new zzaz(this.zza), this.zzb, zzbb.zza(this));
    }
}
