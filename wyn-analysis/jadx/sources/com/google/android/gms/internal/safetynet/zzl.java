package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

/* loaded from: classes4.dex */
final class zzl extends zzt {
    public zzl(zzae zzaeVar, o oVar) {
        super(oVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzh) ((zzaf) bVar).getService()).zzf(this.zza);
    }
}
