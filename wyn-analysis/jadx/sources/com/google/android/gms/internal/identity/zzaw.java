package com.google.android.gms.internal.identity;

import U8.v0;
import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import x7.l;

/* loaded from: classes.dex */
final class zzaw extends zzba {
    final /* synthetic */ l zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaw(zzbb zzbbVar, o oVar, l lVar) {
        super(oVar);
        this.zza = lVar;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzdz) bVar).zzw(v0.w(this.zza, l.class.getSimpleName()), true, zzbb.zza(this));
    }
}
