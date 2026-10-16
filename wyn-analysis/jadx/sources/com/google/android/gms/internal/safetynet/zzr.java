package com.google.android.gms.internal.safetynet;

import C7.e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;

/* loaded from: classes4.dex */
abstract class zzr extends zze<e> {
    protected final zzg zzc;

    public zzr(o oVar) {
        super(oVar);
        this.zzc = new zzq(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return new zzp(status, null);
    }
}
