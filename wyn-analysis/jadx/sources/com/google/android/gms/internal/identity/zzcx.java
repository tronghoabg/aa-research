package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.internal.AbstractC1732v;
import x7.p;

/* loaded from: classes.dex */
final class zzcx extends zzcy {
    final /* synthetic */ p zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzcz zzczVar, o oVar, p pVar, String str) {
        super(oVar);
        this.zza = pVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* synthetic */ void doExecute(b bVar) throws RemoteException {
        p pVar = this.zza;
        AbstractC1732v.a("locationSettingsRequest can't be null", pVar != null);
        ((zzv) ((zzdz) bVar).getService()).zzD(pVar, new zzdf(this), null);
    }
}
