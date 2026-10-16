package com.google.android.gms.internal.auth;

import Z6.b;
import a.AbstractC1304a;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzboVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbg
    public final void zzb(b bVar) throws RemoteException {
        AbstractC1304a.J(new Status(bVar.f17003a, null, null, null), bVar, this.zza);
    }
}
