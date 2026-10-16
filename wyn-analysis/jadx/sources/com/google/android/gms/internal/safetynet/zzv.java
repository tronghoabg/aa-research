package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.t;

/* loaded from: classes4.dex */
abstract class zzv extends zze<Object> {
    protected final zzg zza;

    public zzv(o oVar) {
        super(oVar);
        this.zza = new zzu(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ t createFailedResult(Status status) {
        return new zzaa(status, null);
    }
}
