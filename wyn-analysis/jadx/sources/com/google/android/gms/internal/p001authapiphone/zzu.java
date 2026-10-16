package com.google.android.gms.internal.p001authapiphone;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractBinderC1696j;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes3.dex */
final class zzu extends AbstractBinderC1696j {
    final /* synthetic */ TaskCompletionSource zza;

    public zzu(zzv zzvVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1697k
    public final void onResult(Status status) {
        if (status.f26429a == 6) {
            this.zza.trySetException(AbstractC1732v.n(status));
        } else {
            AbstractC1304a.J(status, null, this.zza);
        }
    }
}
