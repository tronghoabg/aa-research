package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import java.util.List;

/* loaded from: classes.dex */
final class zzcp extends zzcq {
    final /* synthetic */ List zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcp(zzcr zzcrVar, o oVar, List list) {
        super(oVar);
        this.zza = list;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzdz) bVar).zzF(zzem.zza(this.zza), zzcr.zza(this));
    }
}
