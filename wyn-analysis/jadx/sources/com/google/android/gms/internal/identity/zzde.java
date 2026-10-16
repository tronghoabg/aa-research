package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import x7.q;
import x7.r;

/* loaded from: classes.dex */
final class zzde extends zzaa {
    final /* synthetic */ TaskCompletionSource zza;

    public zzde(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzab
    public final void zzb(r rVar) {
        Status status = rVar.f47809a;
        q qVar = new q();
        qVar.f421a = rVar;
        AbstractC1304a.J(status, qVar, this.zza);
    }
}
