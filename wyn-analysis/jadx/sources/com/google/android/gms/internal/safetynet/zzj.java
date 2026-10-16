package com.google.android.gms.internal.safetynet;

import android.os.RemoteException;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.o;
import java.util.List;

/* loaded from: classes4.dex */
final class zzj extends zzz {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zzae zzaeVar, o oVar, List list, String str, String str2) {
        super(oVar);
        this.zza = list;
        this.zzb = str;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1691e
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) throws RemoteException {
        ((zzaf) bVar).zzq(this.zze, this.zza, 1, this.zzb, null);
    }
}
