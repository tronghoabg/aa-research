package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes.dex */
final class zzac extends zzae {
    final /* synthetic */ long zza;
    final /* synthetic */ PendingIntent zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzafVar, o oVar, long j8, PendingIntent pendingIntent) {
        super(oVar);
        this.zza = j8;
        this.zzb = pendingIntent;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        PendingIntent pendingIntent = this.zzb;
        zzg zzgVar = (zzg) bVar;
        AbstractC1732v.i(pendingIntent);
        long j8 = this.zza;
        AbstractC1732v.a("detectionIntervalMillis must be >= 0", j8 >= 0);
        ((zzv) zzgVar.getService()).zzh(j8, true, pendingIntent);
        setResult((zzac) Status.f26424e);
    }
}
