package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;

/* loaded from: classes4.dex */
abstract class zzz extends zze<Object> {
    protected final zzg zze;

    public zzz(o oVar) {
        super(oVar);
        this.zze = new zzy(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return new zzac(status, null);
    }
}
