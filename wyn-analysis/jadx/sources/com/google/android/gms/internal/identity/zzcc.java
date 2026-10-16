package com.google.android.gms.internal.identity;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final /* synthetic */ class zzcc implements InterfaceC1708w {
    static final /* synthetic */ zzcc zza = new zzcc();

    private /* synthetic */ zzcc() {
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((zzdz) obj).zzz((TaskCompletionSource) obj2);
    }
}
