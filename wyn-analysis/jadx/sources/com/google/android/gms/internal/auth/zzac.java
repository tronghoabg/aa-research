package com.google.android.gms.internal.auth;

import U6.d;
import U6.f;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC1691e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;

/* loaded from: classes3.dex */
final class zzac extends AbstractC1691e {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, i iVar, o oVar, boolean z2) {
        super(iVar, oVar);
        this.zza = z2;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final t createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final void doExecute(b bVar) throws RemoteException {
        f fVar = (f) ((zzam) bVar).getService();
        boolean z2 = this.zza;
        d dVar = (d) fVar;
        Parcel parcelZza = dVar.zza();
        int i5 = zzc.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        dVar.zzc(1, parcelZza);
        setResult((zzac) new zzaj(Status.f26424e));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC1692f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzac) obj);
    }
}
