package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;

/* loaded from: classes4.dex */
final class zzo extends zzx {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzae zzaeVar, o oVar, String str) {
        super(oVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzh) ((zzaf) bVar).getService()).zzj(this.zzb, this.zza);
    }
}
