package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

/* loaded from: classes.dex */
final class zzax extends zzba {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzax(zzbb zzbbVar, o oVar, boolean z2) {
        super(oVar);
        this.zza = z2;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        zzdz zzdzVar = (zzdz) bVar;
        if (this.zza) {
            zzdzVar.zzy(zzbb.zza(this));
        } else {
            zzdzVar.zzz(zzbb.zza(this));
        }
    }
}
