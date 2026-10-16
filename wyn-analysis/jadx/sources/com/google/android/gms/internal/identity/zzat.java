package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.location.LocationRequest;

/* loaded from: classes.dex */
final class zzat extends zzba {
    final /* synthetic */ PendingIntent zza;
    final /* synthetic */ LocationRequest zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzat(zzbb zzbbVar, o oVar, PendingIntent pendingIntent, LocationRequest locationRequest) {
        super(oVar);
        this.zza = pendingIntent;
        this.zzb = locationRequest;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzdz) bVar).zzu(this.zza, this.zzb, zzbb.zza(this));
    }
}
