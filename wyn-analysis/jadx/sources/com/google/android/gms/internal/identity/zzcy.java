package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1691e;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;
import x7.r;

/* loaded from: classes.dex */
abstract class zzcy extends AbstractC1691e {
    public zzcy(o oVar) {
        super(zzbi.zzb, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ t createFailedResult(Status status) {
        return new r(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC1692f
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzcy) obj);
    }
}
