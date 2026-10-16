package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1691e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;

/* loaded from: classes.dex */
abstract class zzcq extends AbstractC1691e {
    public zzcq(o oVar) {
        super(zzbi.zzb, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC1692f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzcq) obj);
    }
}
