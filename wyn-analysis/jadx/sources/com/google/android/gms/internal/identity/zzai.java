package com.google.android.gms.internal.identity;

import a.AbstractC1304a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC1692f;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzai implements InterfaceC1692f {
    private final TaskCompletionSource zza;

    public zzai(TaskCompletionSource taskCompletionSource) {
        AbstractC1732v.i(taskCompletionSource);
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1692f
    public final void setFailedResult(Status status) {
        if (status == null) {
            return;
        }
        this.zza.setException(new j(status));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1692f
    public final /* synthetic */ void setResult(Object obj) {
        AbstractC1304a.J((Status) obj, null, this.zza);
    }
}
